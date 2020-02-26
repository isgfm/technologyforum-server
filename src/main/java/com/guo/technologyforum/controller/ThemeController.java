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
        return Result.success(themeService.getThemeListByTabId(tabRouter,offset,pageSize));
    }

    @GetMapping("/themelist/node/{nodeRouter}")
    public Result getThemeListByNode(@PathVariable("nodeRouter")String nodeRouter,
                                     @RequestParam("offset")int offset,
                                     @RequestParam("pageSize")int pageSize){
        return Result.success(themeService.getThemeListByNodeId(nodeRouter,offset,pageSize));
    }

    @GetMapping("/hot")
    public Result getTodayHotTheme(@RequestParam("limit")int limit){
        return Result.success(themeService.getTodayHotTheme(limit));
    }


}
