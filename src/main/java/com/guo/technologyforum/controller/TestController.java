package com.guo.technologyforum.controller;

import com.guo.technologyforum.constant.RightConstant;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.RightService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-07-13 22:55
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    RightService rightService;

    @GetMapping("/right")
    @RequiresPermissions(RightConstant.SYS_HTGL)
    public Result right(){
        return Result.success(rightService.getUserRight());
    }
}
