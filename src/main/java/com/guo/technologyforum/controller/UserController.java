package com.guo.technologyforum.controller;

import com.alibaba.fastjson.support.spring.annotation.FastJsonFilter;
import com.alibaba.fastjson.support.spring.annotation.FastJsonView;
import com.guo.technologyforum.annotation.RequireLogin;
import com.guo.technologyforum.constant.NotifyConstant;
import com.guo.technologyforum.constant.ResultCode;
import com.guo.technologyforum.constant.UserConstant;
import com.guo.technologyforum.constant.UserPermission;
import com.guo.technologyforum.dao.entity.User;
import com.guo.technologyforum.dao.entity.vo.KeepCountVO;
import com.guo.technologyforum.exception.UserNotFoundException;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.KeepService;
import com.guo.technologyforum.service.NotifyService;
import com.guo.technologyforum.service.RelationService;
import com.guo.technologyforum.service.UserService;
import com.guo.technologyforum.util.JsonUtil;
import com.guo.technologyforum.util.UserUtil;
import io.swagger.annotations.Api;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;
import java.util.Optional;

@Api(tags = "用户接口")
@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    KeepService keepService;

    @Autowired
    NotifyService notifyService;

    @Autowired
    RelationService relationService;

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
        //准备重构
        SecurityUtils.getSubject().getSession().setAttribute(UserPermission.CURRENT_USER, user);
        return Result.success();
    }

    @GetMapping("/statecount/{userId}")
    @RequireLogin
    public Result getUserKeep(@PathVariable("userId")long userId){
        KeepCountVO keepCountVO = new KeepCountVO();
        keepCountVO.setKeepNodeCount(keepService.countKeepNodeByUserId(userId));
        keepCountVO.setKeepThemeCount(keepService.countKeepThemeByUserId(userId));
        keepCountVO.setAttentionCount(relationService.countUserAttention(userId));
        keepCountVO.setNotifyCount(notifyService.countNotifyByUserId(userId, NotifyConstant.UNREAD));
        return Result.success(keepCountVO);
    }

    @GetMapping("/block/{userId}")
    public Result isUserHasBlock(@PathVariable("userId")long userId){
        return Result.success(userService.getUserByUserId(userId)
        .orElseThrow(()->new UserNotFoundException())
        .getnStatus()== UserConstant.USER_STATUS_BLOCK);
    }

    @PutMapping("/block/{userId}")
    @RequireLogin(needAdmin = true)
    public Result blockUser(@PathVariable("userId")long userId){
        return Result.success(userService.updateUserBlock(userId,UserConstant.USER_STATUS_BLOCK));
    }

    @GetMapping("/block/userlist")
    @RequireLogin(needAdmin = true)
    public Result getBlockUserList(@RequestParam("page")int page,
                                   @RequestParam("pageSize")int pageSize){
        return Result.success(userService.getBlockUserList(page,pageSize));
    }

    @PutMapping("/cancle/block/{userId}")
    @RequireLogin(needAdmin = true)
    public Result cancleBlockUser(@PathVariable("userId")long userId){
        return Result.success(userService.updateUserBlock(userId,UserConstant.USER_STATUS_NORMAL));
    }

}
