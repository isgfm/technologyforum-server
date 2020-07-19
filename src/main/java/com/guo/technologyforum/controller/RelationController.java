package com.guo.technologyforum.controller;

import com.guo.technologyforum.annotation.RequireLogin;
import com.guo.technologyforum.dao.entity.UserAttention;
import com.guo.technologyforum.dao.entity.UserAttentionKey;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.RelationService;
import com.guo.technologyforum.util.CommonUtil;
import com.guo.technologyforum.util.UserUtil;
import org.apache.shiro.authz.annotation.RequiresUser;
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
    @RequiresUser
    public Result attentionUser(@PathVariable("userId")long userId){

        return Result.success(relationService.addAttention(UserUtil.currentUser().get().getnId(),userId));
    }

    @DeleteMapping("/attention/user/{userId}")
    @RequiresUser
    public Result cancleAttentionUser(@PathVariable("userId")long userId){
        return Result.success(relationService.deleteAttention(UserUtil.currentUser().get().getnId(),userId));
    }

    @GetMapping("/attention/user/{userId}")
    @RequiresUser
    public Result getAttentionUser(@PathVariable("userId")long userId){
        UserAttention userAttention = relationService.getUserAttention(UserUtil.currentUser().get().getnId(),userId);
        return Result.success(userAttention!=null? true : false);
    }

}
