package com.guo.technologyforum.controller;

import com.guo.technologyforum.annotation.RequireLogin;
import com.guo.technologyforum.dao.entity.KeepTheme;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.KeepService;
import com.guo.technologyforum.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/test")
    public Result test(){
        KeepTheme keep = new KeepTheme();
        keep.setdKeepTime(CommonUtil.getNowDate());
        keep.setnThemeId((long) 1);
        keep.setnUserId((long) 1);
        return Result.success(keepService.addKeepTheme(keep));
    }

    @GetMapping("/")
    @RequireLogin
    public Result getKeepInfomation(){

    }
}