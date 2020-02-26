package com.guo.technologyforum.controller;

import com.guo.technologyforum.constant.ThemeConstant;
import com.guo.technologyforum.dao.entity.ThemeClass;
import com.guo.technologyforum.dao.entity.vo.ThemeClassVO;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.ThemeClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/themeclass")
public class ThemeClassController {

    @Autowired
    ThemeClassService themeClassService;

    @GetMapping("")
    public Result getThemeClassByDepth(@RequestParam("depth")int depth){
        return Result.success(themeClassService.getThemeClass(depth));
    }

    @GetMapping("/hot")
    public Result getHotClassNode(@RequestParam("limit")int limit){
        return Result.success(themeClassService.getHotClassNode(limit));
    }

    @GetMapping("/tabs")
    public Result getTabs(){
        return Result.success(themeClassService.getHomeTabs());
    }

    @GetMapping("/node")
    public Result getNode(@RequestParam("tabRouter") String tabRouter){
        return Result.success(themeClassService.getNodesByTabRouter(tabRouter));
    }


    @GetMapping("/homeclass")
    public Result getTabss(){
        List<ThemeClass> tabs = themeClassService.getHomeTabs();
        List<ThemeClass> node = themeClassService.getThemeClass(ThemeConstant.THEME_CLASS_NODE_DEFAULT_DEPTH);
        return Result.success(ThemeClassVO.init(tabs,node));
    }
}
