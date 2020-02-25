package com.guo.technologyforum.controller;

import com.guo.technologyforum.annotation.RequireLogin;
import com.guo.technologyforum.constant.ThemeConstant;
import com.guo.technologyforum.dao.entity.Theme;
import com.guo.technologyforum.dao.entity.ThemeClass;
import com.guo.technologyforum.dao.entity.vo.ThemeClassVO;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.ThemeService;
import com.guo.technologyforum.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/theme")
public class ThemeController {
    @Autowired
    ThemeService themeService;

    @GetMapping("/test")
    public Result test(){
        Theme theme = new Theme();
        theme.setcThemeTitle("title");
        theme.setcThemeContent("content");
        theme.setnThemeClass(1);
        return Result.success(theme);
    }

    @GetMapping("/class")
    public Result getThemeClassByDepth(@RequestParam("depth")int depth){
        return Result.success(themeService.getThemeClass(depth));
    }

    @GetMapping("/class/hot")
    public Result getHotClassNode(@RequestParam("limit")int limit){
        return Result.success(themeService.getHotClassNode(limit));
    }

    @GetMapping("/homeclass")
    public Result getTabs(){
        List<ThemeClass> tabs = themeService.getHomeTabs();
        List<ThemeClass> node = themeService.getThemeClass(ThemeConstant.THEME_CLASS_NODE_DEFAULT_DEPTH);
        return Result.success(ThemeClassVO.init(tabs,node));
    }

    @PostMapping("/publish")
    @RequireLogin
    public Result publishTheme(@RequestBody Theme theme){
        theme.setnUserId(UserUtil.currentUser().get().getnId());
        return Result.success(themeService.addTheme(theme));
    }

    @GetMapping("/themelist/tab/{tabId}")
    public Result getThemeListByTab(@PathVariable("tabId")int tabId,
                                    @RequestParam("offset")int offset,
                                    @RequestParam("pageSize")int pageSize){
        return Result.success(themeService.getThemeListByTabId(tabId,offset,pageSize));
    }

    @GetMapping("/themelist/node/{nodeId}")
    public Result getThemeListByNode(@PathVariable("nodeId")int nodeId,
                                     @RequestParam("offset")int offset,
                                     @RequestParam("pageSize")int pageSize){
        return Result.success(themeService.getThemeListByNodeId(nodeId,offset,pageSize));
    }

    @GetMapping("/hot")
    public Result getTodayHotTheme(@RequestParam("limit")int limit){
        return Result.success(themeService.getTodayHotTheme(limit));
    }


}
