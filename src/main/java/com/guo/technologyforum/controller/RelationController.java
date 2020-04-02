package com.guo.technologyforum.controller;

import com.guo.technologyforum.annotation.RequireLogin;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-04-02 22:57
 **/
@RestController
@RequestMapping("api/relation")
public class RelationController {

    @Autowired
    RelationService relationService;

    @PutMapping("/attention/user/{userId}")
    @RequireLogin
    public Result attentionUser(@PathVariable("userId")long userId){
        return Result.success();
    }

    @DeleteMapping("/attention/user/{userId}")
    @RequireLogin
    public Result cancleAttentionUser(@PathVariable("userId")long userId){
        return Result.success();
    }

}
