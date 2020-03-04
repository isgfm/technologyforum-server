package com.guo.technologyforum.controller;

import com.guo.technologyforum.annotation.CheckThemeExist;
import com.guo.technologyforum.annotation.RequireLogin;
import com.guo.technologyforum.constant.ResultCode;
import com.guo.technologyforum.constant.ThemeConstant;
import com.guo.technologyforum.dao.entity.Keep;
import com.guo.technologyforum.dao.entity.Theme;
import com.guo.technologyforum.dao.entity.ThemeClass;
import com.guo.technologyforum.dao.entity.vo.ThemeClassVO;
import com.guo.technologyforum.dao.entity.vo.ThemeListVO;
import com.guo.technologyforum.redis.RedisService;
import com.guo.technologyforum.redis.prefix.ThemeClickKey;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.KeepService;
import com.guo.technologyforum.service.ThemeClassService;
import com.guo.technologyforum.service.ThemeService;
import com.guo.technologyforum.util.CommonUtil;
import com.guo.technologyforum.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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
        Theme theme = new Theme();
        theme.setcThemeTitle("title");
        theme.setcThemeContent("content");
        theme.setnThemeClass(1);
        return Result.success(theme);
    }

    @PostMapping("/publish")
    @RequireLogin
    public Result publishTheme(@RequestBody Theme theme){
        theme.setnUserId(UserUtil.currentUser().get().getnId());
        return Result.success(themeService.addTheme(theme));
    }

    @GetMapping("/themelist/tab/{tabRouter}")
    public Result getThemeListByTab(@PathVariable("tabRouter")String tabRouter,
                                    @RequestParam("offset")int offset,
                                    @RequestParam("pageSize")int pageSize){
        List<ThemeListVO> themeClassVOList = themeService.getThemeListByTabId(tabRouter,offset,pageSize);
        themeClassService.setThemeClassName(themeClassVOList);
        return Result.success(themeClassVOList);
    }

    @GetMapping("/themelist/node/{nodeRouter}")
    public Result getThemeListByNode(@PathVariable("nodeRouter")String nodeRouter,
                                     @RequestParam("offset")int offset,
                                     @RequestParam("pageSize")int pageSize){
        List<ThemeListVO> themeClassVOList = themeService.getThemeListByNodeId(nodeRouter,offset,pageSize);
        themeClassService.setThemeClassName(themeClassVOList);
        return Result.success(themeClassVOList);
    }

    @GetMapping("/hot")
    public Result getTodayHotTheme(@RequestParam("limit")int limit){
        return Result.success(themeService.getTodayHotTheme(limit));
    }

    @GetMapping("/kepp")
    @RequireLogin
    @CheckThemeExist
    public Result keepTheme(@RequestParam("id")long id){
        long userId = UserUtil.currentUser().get().getnId();
        Keep keep = new Keep();
        keep.setcId(UUID.randomUUID().toString());
        keep.setnUserId(userId);
        keep.setdKeepTime(CommonUtil.getNowDate());
        keep.setnThemeId(id);
        Result result = new Result();

        try {
            keepService.addKeep(keep);
            result.setResultCode(ResultCode.SUCCESS);
        } catch (DuplicateKeyException e) {
            e.printStackTrace();
            result.setResultCode(ResultCode.DATA_IS_WRONG);
        }
        return result;
    }


    //redis存点击量
    @GetMapping("click")
    @CheckThemeExist
    public Result click(@RequestParam("id")long id){
        Boolean absent = redisService.setIfAbsent(ThemeClickKey.themeClickKey, String.valueOf(id),ThemeConstant.THEME_CLICK_INITIAL);
        if(!absent){
            redisService.increment(ThemeClickKey.themeClickKey, String.valueOf(id));
        }
        return Result.success();
    }

}
