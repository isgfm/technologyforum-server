package com.guo.technologyforum.controller;

import com.guo.technologyforum.annotation.CheckThemeExistStatus;
import com.guo.technologyforum.annotation.RequireLogin;
import com.guo.technologyforum.constant.ResultCode;
import com.guo.technologyforum.constant.RightConstant;
import com.guo.technologyforum.constant.ThemeConstant;
import com.guo.technologyforum.dao.entity.Theme;
import com.guo.technologyforum.dao.entity.vo.ThemePageVO;
import com.guo.technologyforum.dao.entity.vo.ThemeVO;
import com.guo.technologyforum.exception.ThemeNotFoundException;
import com.guo.technologyforum.redis.RedisService;
import com.guo.technologyforum.redis.prefix.ThemeClickKey;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.KeepService;
import com.guo.technologyforum.service.ThemeClassService;
import com.guo.technologyforum.service.ThemeService;
import com.guo.technologyforum.util.CommonUtil;
import com.guo.technologyforum.util.UserUtil;
import io.swagger.annotations.Api;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api(tags = "主题接口")
@RestController
@RequestMapping("api/theme")
public class ThemeController {
    @Autowired
    ThemeService themeService;

    @Autowired
    ThemeClassService themeClassService;

    @Autowired
    KeepService keepService;

    @Autowired
    RedisService redisService;

    @GetMapping("/test")
    public Result test(){
        return Result.success(themeService.getThemeListBySearch("测试",1,10));
    }

    /**
     * TODO 发表主题
     * @param theme
     * @return com.guo.technologyforum.result.Result
     */
    @PostMapping("/publish")
    @RequireLogin(needUserStateNormal = true)
    public Result publishTheme(@RequestBody Theme theme){
        theme.setnUserId(UserUtil.currentUser().get().getnId());
        theme.setdCreateTime(CommonUtil.getNowDate());
        theme.setnClick(0L);
        theme.setnKeepCount(0);
        theme.setnThemeStatus(1);
        return Result.success(themeService.addTheme(theme));
    }

    /**
     * TODO 获得用户发表的主题
     * @param userId
     * @param page
     * @param pageSize
     * @return com.guo.technologyforum.result.Result
     */
    @GetMapping("/userthemes/{userId}")
    public Result getThemesByUserId(@PathVariable("userId")long userId,
                                    @RequestParam("page")int page,
                                    @RequestParam("pageSize")int pageSize){
        List<ThemeVO> themeVOList = themeService.getThemeListByUserId(userId, page, pageSize);
        themeClassService.setThemeClassName(themeVOList);
        ThemePageVO themePageVO = new ThemePageVO(themeVOList,themeService.countThemeByUserId(userId));
        return Result.success(themePageVO);
    }

    /**
     * TODO 获得用户关注的人发表的主题
     * @param page
     * @param pageSize
     * @return com.guo.technologyforum.result.Result
     */
    @GetMapping("/user/attention")
    @RequiresUser
    public Result getThemeListByUserAttention(
                                    @RequestParam("page")int page,
                                    @RequestParam("pageSize")int pageSize){
        long userId = UserUtil.currentUser().get().getnId();
        List<ThemeVO> themeVOList = themeService.getThemeListByUserAttention(userId, page, pageSize);
        themeClassService.setThemeClassName(themeVOList);
        ThemePageVO themePageVO = new ThemePageVO(themeVOList,themeService.countThemeByUserAttention(userId));
        return Result.success(themePageVO);
    }

    /**
     * TODO 获得用户收藏的主题
     * @param page
     * @param pageSize
     * @return com.guo.technologyforum.result.Result
     */
    @GetMapping("/user/keep")
    @RequiresUser
    public Result getThemeListByUserKeep(
                                              @RequestParam("page")int page,
                                              @RequestParam("pageSize")int pageSize){
        long userId = UserUtil.currentUser().get().getnId();
        List<ThemeVO> themeVOList = themeService.getThemeListByUserKeep(userId, page, pageSize);
        themeClassService.setThemeClassName(themeVOList);
        ThemePageVO themePageVO = new ThemePageVO(themeVOList,keepService.countKeepThemeByUserId(userId));
        return Result.success(themePageVO);
    }

    /**
     * TODO 获得tab主题列表
     * @param tabRouter
     * @param page
     * @param pageSize
     * @return com.guo.technologyforum.result.Result
     */
    @GetMapping("/themelist/tab/{tabRouter}")
    public Result getThemeListByTab(@PathVariable("tabRouter")String tabRouter,
                                    @RequestParam("page")int page,
                                    @RequestParam("pageSize")int pageSize){
        List<ThemeVO> themeVOList = themeService.getThemeListByTabId(tabRouter,page,pageSize);
        themeClassService.setThemeClassName(themeVOList);
        return Result.success(themeVOList);
    }

    /**
     * TODO 获得node主题列表
     * @param nodeRouter
     * @param page
     * @param pageSize
     * @return com.guo.technologyforum.result.Result
     */
    @GetMapping("/themelist/node/{nodeRouter}")
    public Result getThemeListByNode(@PathVariable("nodeRouter")String nodeRouter,
                                     @RequestParam("page")int page,
                                     @RequestParam("pageSize")int pageSize){
        List<ThemeVO> themeVOList = themeService.getThemeListByNodeId(nodeRouter,page,pageSize);
        ThemePageVO themePageVO = new ThemePageVO(themeVOList,themeService.countThemeByNodeRouter(nodeRouter));
        return Result.success(themePageVO);
    }

    /**
     * TODO 获得热点主题
     * @param limit
     * @return com.guo.technologyforum.result.Result
     */
    @GetMapping("/hot")
    public Result getTodayHotTheme(@RequestParam("limit")int limit){
        return Result.success(themeService.getTodayHotTheme(limit));
    }

    /**
     * TODO  根据主题id获得主题
     * @param themeId
     * @return com.guo.technologyforum.result.Result
     */
    @GetMapping("/{themeId}")
    @CheckThemeExistStatus
    public Result getThemeByThemeId(@PathVariable("themeId")long themeId){
        Optional<ThemeVO> optionalThemeVO = themeService.getThemeVOByThemeId(themeId);
        if(optionalThemeVO.isPresent()){
            ThemeVO themeVO = optionalThemeVO.get();
            themeVO.setThemeClassName(themeClassService.getThemeClassByThemeClassId(themeVO.getTheme().getnThemeClass()).getcName());
            themeVO.setKeepCount(keepService.countThemeKeep(themeId));
            return Result.success(themeVO);
        }
        else{
            return Result.customize(ResultCode.RESULE_DATA_NONE,Result.VALUE_NULL);
        }

    }

    /**
     * TODO redis点击量
     * @param id
     * @return com.guo.technologyforum.result.Result
     */
    @GetMapping("click")
    @CheckThemeExistStatus
    public Result click(@RequestParam("id")long id){
        Boolean absent = redisService.setIfAbsent(ThemeClickKey.themeClickKey, String.valueOf(id),ThemeConstant.THEME_CLICK_INITIAL);
        if(!absent){
            redisService.increment(ThemeClickKey.themeClickKey, String.valueOf(id));
        }
        return Result.success();
    }

    /**
     * TODO 获得主题是否被隐藏
     * @param themeId
     * @return com.guo.technologyforum.result.Result
     */
    @GetMapping("/hide/{themeId}")
    public Result getIsThemeHide(@PathVariable("themeId")long themeId){
        return Result.success(themeService.getThemeByThemeId(themeId)
                .orElseThrow(()->new ThemeNotFoundException())
                .getnThemeStatus()==ThemeConstant.THEME_STATUS_HIDE);
    }

    /**
     * TODO 获得被隐藏的主题列表
     * @param
     * @return com.guo.technologyforum.result.Result
     */
    @GetMapping("/hide/themelist")
    @RequireLogin(needAdmin = true)
    public Result getHideThemeList(@RequestParam("page")int page,
                                   @RequestParam("pageSize")int pageSize){
        return Result.success(themeService.getHideThemeList(page,pageSize));
    }

    /**
     * TODO 隐藏主题
     * @param themeId
     * @return com.guo.technologyforum.result.Result
     */
    @PutMapping("/hide/{themeId}")
    @RequiresPermissions(RightConstant.SYS_HTGL_ZTGL)
    public Result hideTheme(@PathVariable("themeId")long themeId){
        return Result.success(themeService.updateThemeStatus(themeId,ThemeConstant.THEME_STATUS_HIDE));
    }

    /**
     * TODO 取消隐藏主题
     * @param themeId
     * @return com.guo.technologyforum.result.Result
     */
    @PutMapping("/cancle/hide/{themeId}")
    @RequireLogin(needAdmin = true)
    public Result cancleHideTheme(@PathVariable("themeId")long themeId){
        return Result.success(themeService.updateThemeStatus(themeId,ThemeConstant.THEME_STATUS_NORMAL));
    }

    @PostMapping("/themelist/search")
    public Result getSearchThemeList(@RequestParam("searchContent") String searchContent,
                                     @RequestParam("page")int page,
                                     @RequestParam("pageSize")int pageSize){
        return Result.success(themeService.getThemeListBySearch(searchContent,page,pageSize));
    }
}
