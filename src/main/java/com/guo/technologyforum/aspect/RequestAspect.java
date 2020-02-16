package com.guo.technologyforum.aspect;

import com.guo.technologyforum.constant.ResultCode;
import com.guo.technologyforum.dao.entity.User;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.util.UserUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Aspect
@Component
public class RequestAspect {
//    execution(* com.guo.technologyforum.controller.*.*(..))&&
    @Pointcut(value = "@annotation(com.guo.technologyforum.annotation.RequireLogin)")
    public void loginCut(){}

    @Around("loginCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Optional<User> user = UserUtil.currentUser();
        if(!user.isPresent()){
            Result r = new Result();
            r.setResultCode(ResultCode.USER_NOT_LOGGED_IN);
            return r;
        } else{
            return point.proceed();
        }
    }
}
