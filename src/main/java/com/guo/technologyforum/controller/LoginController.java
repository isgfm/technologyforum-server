package com.guo.technologyforum.controller;

import com.guo.technologyforum.annotation.CheckCaptcha;
import com.guo.technologyforum.constant.ResultCode;
import com.guo.technologyforum.constant.UserPermission;
import com.guo.technologyforum.dao.entity.User;
import com.guo.technologyforum.dao.entity.dto.LoginDTO;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.UserService;
import com.guo.technologyforum.shiro.ShiroRedisDAO;
import com.guo.technologyforum.shiro.ShiroSessionManager;
import com.guo.technologyforum.util.CommonUtil;
import com.guo.technologyforum.util.UserUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("api")
public class LoginController {
    private static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @Autowired
    ShiroRedisDAO shiroRedisDAO;

    @GetMapping("/usertest")
    public Result test(){
        User user = new User();
        user.setcUsername("root");
        user.setcPassword("123456");
        userService.encryptUserPassword(user);
        userService.addUser(user);
        return Result.success(user);
    }

    @PostMapping("/login")
    @CheckCaptcha
    public Result login(@RequestBody LoginDTO loginDTO, HttpServletRequest request){
        Result r = new Result();
        User user = initUser(loginDTO);
        executeLogin(user,r);
        return r;
    }

    @GetMapping("/logout")
    public Result logout(){
        Result r = new Result();
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        r.setResultCode(ResultCode.SUCCESS);
        return r;
    }

    @PostMapping("/register")
    public Result register(@RequestBody LoginDTO loginDTO,HttpServletRequest request){
        Result r = new Result();
        User user = initUser(loginDTO);
        if(userService.getUserByUserName(user.getcUsername()).isPresent()){
            r.setResultCode(ResultCode.USER_HAS_EXISTED);
            return r;
        }
        String oldPassword = user.getcPassword();
        userService.encryptUserPassword(user);
        user.setcAvatar(UserUtil.randomAvatar());
        int id = userService.addUser(user);
        if(id>0){
            user.setcPassword(oldPassword);
            executeLogin(user,r);
        }else{
            r.setResultCode(ResultCode.USER_Register_ERROR);
        }
        return r;
    }


    private User initUser(LoginDTO loginDTO){
        User user = new User();
        user.setcUsername(loginDTO.getUsername());
        user.setcPassword(loginDTO.getPassword());
        return user;
    }

    private void executeLogin(User user,Result r){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getcUsername(),user.getcPassword());
        try {
            subject.login(token);

            User currentUser = userService.getUserByUserName(user.getcUsername()).get();
            subject.getSession().setAttribute(UserPermission.CURRENT_USER, currentUser);
            r.setResultCode(ResultCode.SUCCESS);
            r.customize().put(ShiroSessionManager.OAUTH_TOKEN, subject.getSession().getId());
            r.customize().put("user", currentUser);
//            r.customize().put("nId", currentUser.getnId());
//            r.customize().put("cUsername", currentUser.getcUsername());
        }catch (UnknownAccountException e) {
            r.setResultCode(ResultCode.USER_NOT_EXIST);
        } catch (LockedAccountException e) {
            r.setResultCode(ResultCode.USER_ACCOUNT_FORBIDDEN);
        } catch (AuthenticationException e) {
            r.setResultCode(ResultCode.USER_LOGIN_ERROR);
        } catch (Exception e) {
            r.setResultCode(ResultCode.ERROR);
        }
    }
}
