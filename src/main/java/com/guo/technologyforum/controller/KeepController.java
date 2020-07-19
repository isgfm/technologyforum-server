package com.guo.technologyforum.controller;

import com.guo.technologyforum.annotation.CheckThemeExistStatus;
import com.guo.technologyforum.annotation.RequireLogin;
import com.guo.technologyforum.constant.RightConstant;
import com.guo.technologyforum.dao.entity.KeepNode;
import com.guo.technologyforum.dao.entity.KeepTheme;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.KeepService;
import com.guo.technologyforum.service.UserService;
import com.guo.technologyforum.util.UserUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-03-30 21:26
 **/
@RestController
@RequestMapping("api/keep")
public class KeepController {
    @Autowired
    KeepService keepService;

    @Autowired
    UserService userService;

    @GetMapping("/test")
    public Result test(){
        return Result.success(keepService.addKeepTheme(1,1));
    }

    @GetMapping("/theme/{themeId}")
    @RequiresPermissions(RightConstant.SYS_HTGL)
    public Result getKeepTheme(@PathVariable("themeId")long themeId){
        KeepTheme keepTheme = keepService.getKeepTheme(UserUtil.currentUser().get().getnId(),themeId);
        return Result.success(keepTheme!=null?true:false);
    }

    @PutMapping("/theme/{themeId}")
    @RequiresUser
    @CheckThemeExistStatus
    public Result putKeepTheme(@PathVariable("themeId")long themeId){
        return Result.success(keepService.addKeepTheme(UserUtil.currentUser().get().getnId(),themeId));
    }

    @DeleteMapping("/theme/{themeId}")
    @RequiresUser
    @CheckThemeExistStatus
    public Result deletekeepTheme(@PathVariable("themeId")long themeId){
        return Result.success(keepService.deleteKeepTheme(UserUtil.currentUser().get().getnId(),themeId));
    }

    @GetMapping("/node/{nodeId}")
    @RequiresUser
    public Result getKeepNode(@PathVariable("nodeId")long nodeId){
        KeepNode keepNode = keepService.getKeepNode(UserUtil.currentUser().get().getnId(),nodeId);
        return Result.success(keepNode!=null?true:false);
    }

    @PutMapping("/node/{nodeId}")
    @RequiresUser
    public Result putKeepNode(@PathVariable("nodeId")long nodeId){
        return Result.success(keepService.addKeepNode(UserUtil.currentUser().get().getnId(),nodeId));
    }

    @DeleteMapping("/node/{nodeId}")
    @RequiresUser
    public Result deletekeepNode(@PathVariable("nodeId")long nodeId){
        return Result.success(keepService.deleteKeepNode(UserUtil.currentUser().get().getnId(),nodeId));
    }


}
