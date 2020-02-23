package com.guo.technologyforum.interceptor;

import com.alibaba.fastjson.JSON;
import com.guo.technologyforum.constant.ResultCode;
import com.guo.technologyforum.redis.RedisService;
import com.guo.technologyforum.redis.prefix.CaptchaKey;
import com.guo.technologyforum.result.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

@Component
public class CaptchaInterceptor extends HandlerInterceptorAdapter {

    public static String HEADER_CAPTCHA = "header-captcha";

    public static String POST_CAPTCHA = "captcha";

    @Autowired
    RedisService redisService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String captchaKey = request.getHeader(HEADER_CAPTCHA);
        if(StringUtils.isEmpty(captchaKey)){
            return true;
        }

        String captcha = request.getParameter(POST_CAPTCHA);
        String redisCaptcha = (String) redisService.get(CaptchaKey.captcha,captchaKey);
        if(StringUtils.isEmpty(redisCaptcha)){
            render(response,ResultCode.CAPTCHA_EXPIRED);
            return false;
        }

        if(!StringUtils.equalsIgnoreCase(captcha,redisCaptcha)){
            render(response,ResultCode.CAPTCHA_ERROR);
            return false;
        }

        return true;
    }

    private void render(HttpServletResponse response, ResultCode cm)throws Exception {
        response.setContentType("application/json;charset=UTF-8");
        OutputStream out = response.getOutputStream();
        String str  = JSON.toJSONString(Result.error(cm));
        out.write(str.getBytes("UTF-8"));
        out.flush();
        out.close();
    }
}
