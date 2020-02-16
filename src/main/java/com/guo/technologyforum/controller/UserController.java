package com.guo.technologyforum.controller;

import com.alibaba.fastjson.support.spring.annotation.FastJsonFilter;
import com.alibaba.fastjson.support.spring.annotation.FastJsonView;
import com.guo.technologyforum.constant.ResultCode;
import com.guo.technologyforum.dao.entity.User;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.UserService;
import com.guo.technologyforum.util.JsonUtil;
import com.guo.technologyforum.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/currentUser")
    @FastJsonView(include = {@FastJsonFilter(clazz = User.class,props = {"id","username","admin"})})
    public Result currentUser(){
        Optional<User> user = UserUtil.currentUser();
        return Result.success(user.get());
    }

    @GetMapping("/allUser")
    @FastJsonView(include = {@FastJsonFilter(clazz = User.class,props = {"id","username","createDate"})})
    public  Result allUser(){
        return Result.success(JsonUtil.ListToJsonString(userService.getAllUser()));
    }

    @GetMapping("/users")
    @FastJsonView(include = {@FastJsonFilter(clazz = User.class,props = {"id","username","createDate"})})
    public Result GetOrderByPage(@RequestParam("pageIndex")int pageIndex, @RequestParam("pageSize")int pageSize){
        Result r = new Result();
        r.setResultCode(ResultCode.SUCCESS);
        r.customize().put("users",JsonUtil.ListToJsonString(userService.GetUsersByPageAndCount(pageIndex,pageSize)));
        r.customize().put("userCount",userService.getUserCount());
        return r;
    }
}
