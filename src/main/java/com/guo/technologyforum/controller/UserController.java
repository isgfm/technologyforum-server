package com.guo.technologyforum.controller;

import com.alibaba.fastjson.support.spring.annotation.FastJsonFilter;
import com.alibaba.fastjson.support.spring.annotation.FastJsonView;
import com.guo.technologyforum.annotation.RequireLogin;
import com.guo.technologyforum.constant.ResultCode;
import com.guo.technologyforum.dao.entity.User;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.UserService;
import com.guo.technologyforum.util.JsonUtil;
import com.guo.technologyforum.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/test")
    @FastJsonView(exclude = {@FastJsonFilter(clazz = User.class,props = {"cPassword","cSalt"})})
    public User getUU(){
        return userService.getUserByUserName("admin").get();
    }

    @GetMapping("/{userId}")
    public Result getUserByUserId(@PathVariable("userId") long userId){
        Optional<User> optionalUser = userService.getUserByUserId(userId);
        if(optionalUser.isPresent())
            return Result.success(optionalUser.get());

        return Result.customize(ResultCode.USER_NOT_EXIST,null);
    }

    @GetMapping("/currentUser")
    public Result currentUser(){
        Optional<User> user = UserUtil.currentUser();
        try {
            return Result.success(user.get());
        } catch (NoSuchElementException e) {
            return Result.success(null);
        }
    }

    @GetMapping("/users/themereply")
    public Result themeReplyUserList(@RequestParam("themeId")long themeId){
        return Result.success(userService.getUserListFromThemeReply(themeId));
    }

    @GetMapping("/allUser")
    public  Result allUser(){
        return Result.success(JsonUtil.ListToJsonString(userService.getAllUser()));
    }

    @GetMapping("/users")
    public Result GetOrderByPage(@RequestParam("pageIndex")int pageIndex, @RequestParam("pageSize")int pageSize){
        Result r = new Result();
        r.setResultCode(ResultCode.SUCCESS);
        r.customize().put("users",JsonUtil.ListToJsonString(userService.GetUsersByPageAndCount(pageIndex,pageSize)));
        r.customize().put("userCount",userService.getUserCount());
        return r;
    }

    @PostMapping("/profile/save")
    @RequireLogin
    public Result saveProfile(@RequestBody User user){
        User currentUser = UserUtil.currentUser().get();
        user.setnId(currentUser.getnId());
        userService.saveUser(user);
        return Result.success();
    }

    
}
