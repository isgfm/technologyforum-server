package com.guo.technologyforum.controller;

import com.guo.technologyforum.annotation.RequireLogin;
import com.guo.technologyforum.dao.entity.KeepTheme;
import com.guo.technologyforum.dao.entity.vo.KeepCountVO;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.KeepService;
import com.guo.technologyforum.service.UserService;
import com.guo.technologyforum.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

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
        KeepTheme keep = new KeepTheme();
        keep.setdKeepTime(CommonUtil.getNowDate());
        keep.setnThemeId((long) 1);
        keep.setnUserId((long) 1);
        return Result.success(keepService.addKeepTheme(keep));
    }

    @GetMapping("/theme/{themeId}")
    @RequireLogin
    public Result getKeepTheme(@PathVariable("themeId")long themeId){
        return Result.success();
    }

    @PutMapping("/theme/{themeId}")
    @RequireLogin
    public Result putKeepTheme(@PathVariable("themeId")long themeId){
        return Result.success();
    }

    @DeleteMapping("/theme/{themeId}")
    @RequireLogin
    public Result deletekeepTheme(@PathVariable("themeId")long themeId){
        return Result.success();
    }

    @GetMapping("/node/{nodeId}")
    @RequireLogin
    public Result getKeepNode(@PathVariable("nodeId")long nodeId){
        return Result.success();
    }

    @PutMapping("/node/{nodeId}")
    @RequireLogin
    public Result putKeepNode(@PathVariable("nodeId")long nodeId){
        return Result.success();
    }

    @DeleteMapping("/node/{nodeId}")
    @RequireLogin
    public Result deletekeepNode(@PathVariable("nodeId")long nodeId){
        return Result.success();
    }


}
