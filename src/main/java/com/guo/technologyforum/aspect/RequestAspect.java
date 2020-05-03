package com.guo.technologyforum.aspect;

import com.guo.technologyforum.annotation.RequireLogin;
import com.guo.technologyforum.constant.ResultCode;
import com.guo.technologyforum.constant.UserConstant;
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

    @Around("loginCut()&&@annotation(requireLogin)")
    public Object around(ProceedingJoinPoint point, RequireLogin requireLogin) throws Throwable {
        Optional<User> currentUser = UserUtil.currentUser();
        boolean needAdmin = requireLogin.needAdmin();
        boolean needUserStateNormal = requireLogin.needUserStateNormal();
        Result r = new Result();
        if(!currentUser.isPresent()){
            r.setResultCode(ResultCode.USER_NOT_LOGGED_IN);
            return r;
        }

        User user = currentUser.get();
        if(needAdmin&&user.getnAdmin()!= UserConstant.USER_ADMIN){
            r.setResultCode(ResultCode.PERMISSION_NO_ACCESS);
            return r;
        }

        if(needUserStateNormal&&user.getnStatus()==UserConstant.USER_STATUS_BLOCK){
            r.setResultCode(ResultCode.USER_HAS_BLOCK);
            return r;
        }

        return point.proceed();
    }
}
