package com.guo.technologyforum.aspect;

import com.guo.technologyforum.constant.ResultCode;
import com.guo.technologyforum.constant.ThemeConstant;
import com.guo.technologyforum.constant.UserConstant;
import com.guo.technologyforum.dao.entity.Theme;
import com.guo.technologyforum.dao.entity.User;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.ThemeService;
import com.guo.technologyforum.util.UserUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-03-02 22:35
 **/
@Aspect
@Component
public class CheckThemeExistAspect {

    @Autowired
    ThemeService themeService;

    @Pointcut(value = "@annotation(com.guo.technologyforum.annotation.CheckThemeExistStatus)")
    public void ThemeExistCut(){}

    @Around("ThemeExistCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Object[] args = point.getArgs();
        long themeId = (long) args[0];
        Result result = new Result();
        Optional<Theme> themeOptional = themeService.getThemeByThemeId(themeId);

        if(!themeOptional.isPresent()){
            result.setResultCode(ResultCode.RESULE_DATA_NONE);
            return result;
        }
        boolean isAdmin = false;
        if(UserUtil.currentUser().isPresent()){
            isAdmin= ((Integer) UserConstant.USER_ADMIN).equals(UserUtil.currentUser().get().getnAdmin());
        }

        if(themeOptional.get().getnThemeStatus()!= ThemeConstant.THEME_STATUS_NORMAL&&!isAdmin){
            result.setResultCode(ResultCode.THEME_HIDE);
            return result;
        }

        return point.proceed();

    }

}
