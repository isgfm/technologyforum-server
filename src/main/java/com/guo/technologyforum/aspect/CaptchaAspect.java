package com.guo.technologyforum.aspect;

import com.guo.technologyforum.constant.ResultCode;
import com.guo.technologyforum.dao.entity.dto.LoginDTO;
import com.guo.technologyforum.redis.RedisService;
import com.guo.technologyforum.redis.prefix.CaptchaKey;
import com.guo.technologyforum.result.Result;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class CaptchaAspect {

    public static String HEADER_CAPTCHA = "header-captcha";

    public static String POST_CAPTCHA = "captcha";

    @Autowired
    RedisService redisService;

    @Pointcut("@annotation(com.guo.technologyforum.annotation.CheckCaptcha)")
    public void captchaCut(){}

    @Around("captchaCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Object[] args = point.getArgs();
        LoginDTO loginDTO = (LoginDTO) args[0];
        HttpServletRequest request = (HttpServletRequest) args[1];
        Result r = new Result();
        String captchaKey = request.getHeader(HEADER_CAPTCHA);
        if(StringUtils.isEmpty(captchaKey)){
            r.setResultCode(ResultCode.ERROR);
        }

        String captcha = loginDTO.getCaptcha();
        String redisCaptcha = (String) redisService.get(CaptchaKey.captcha,captchaKey);
        if(StringUtils.isEmpty(redisCaptcha)){
            r.setResultCode(ResultCode.CAPTCHA_EXPIRED);
            return r;

        }

        if(!StringUtils.equalsIgnoreCase(captcha,redisCaptcha)){
            r.setResultCode(ResultCode.CAPTCHA_ERROR);
            return r;
        }

        return point.proceed();
    }


}
