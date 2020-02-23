package com.guo.technologyforum.controller;

import cn.apiclub.captcha.Captcha;
import cn.apiclub.captcha.backgrounds.GradiatedBackgroundProducer;
import cn.apiclub.captcha.gimpy.FishEyeGimpyRenderer;
import com.guo.technologyforum.interceptor.CaptchaInterceptor;
import com.guo.technologyforum.redis.RedisService;
import com.guo.technologyforum.redis.prefix.CaptchaKey;
import com.guo.technologyforum.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("api/captcha")
public class CaptchaController {


    @Autowired
    RedisService redisService;

    private static int captchaW = 200;
    private static int captchaH = 60;

    @GetMapping(value = "/img",produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] getCaptcha(HttpServletRequest request, HttpServletResponse response){
        String uuid = UUID.randomUUID().toString();
        Captcha captcha = new Captcha.Builder(captchaW, captchaH)
                .addText().addBackground(new GradiatedBackgroundProducer())
                .gimp(new FishEyeGimpyRenderer())
                .build();
        redisService.set(CaptchaKey.captcha,uuid,captcha.getAnswer());
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        response.setHeader(CaptchaInterceptor.HEADER_CAPTCHA,uuid);
        response.setHeader("Access-Control-Expose-Headers",CaptchaInterceptor.HEADER_CAPTCHA);
        try {
            ImageIO.write(captcha.getImage(), "png", bao);
            return bao.toByteArray();
        } catch (IOException e) {
            return null;
        }
    }
}
