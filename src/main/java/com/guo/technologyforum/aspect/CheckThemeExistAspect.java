package com.guo.technologyforum.aspect;

import com.guo.technologyforum.constant.ResultCode;
import com.guo.technologyforum.dao.entity.Theme;
import com.guo.technologyforum.result.Result;
import com.guo.technologyforum.service.ThemeService;
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

    @Pointcut(value = "@annotation(com.guo.technologyforum.annotation.CheckThemeExist)")
    public void ThemeExistCut(){}

    @Around("ThemeExistCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Object[] args = point.getArgs();
        long themeId = (long) args[0];
        Result result = new Result();
        Optional<Theme> themeOptional = themeService.getThemeByThemeId(themeId);
        if(themeOptional.isPresent())
            return point.proceed();

        result.setResultCode(ResultCode.RESULE_DATA_NONE);
        return result;
    }

}
