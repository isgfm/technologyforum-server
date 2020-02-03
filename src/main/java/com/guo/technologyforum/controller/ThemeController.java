package com.guo.technologyforum.controller;

import com.guo.technologyforum.constant.ThemeConstant;
import com.guo.technologyforum.dao.entity.ThemeClass;
import com.guo.technologyforum.dao.entity.vo.ThemeClassVO;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/theme")
public class ThemeController {
    @Autowired
    ThemeService themeService;

    @GetMapping("/class")
    public Result getThemeClassByDepth(@RequestParam("depth")int depth){
        return Result.success(themeService.getThemeClass(depth));
    }

    @GetMapping("/homeclass")
    public Result getTabs(){
        List<ThemeClass> tabs = themeService.getHomeTabs();
        List<ThemeClass> node = themeService.getThemeClass(ThemeConstant.THEME_CLASS_NODE_DEFAULT_DEPTH);
        return Result.success(ThemeClassVO.init(tabs,node));
    }

    @GetMapping("/themelist")
}
