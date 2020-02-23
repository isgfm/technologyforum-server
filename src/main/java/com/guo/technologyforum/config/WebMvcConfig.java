package com.guo.technologyforum.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.guo.technologyforum.interceptor.CaptchaInterceptor;
import com.guo.technologyforum.interceptor.TokenInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    TokenInterceptor tokenInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tokenInterceptor);
    }

//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
//        // 2 添加fastjson 的配置信息 比如 是否要格式化 返回的json数据
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(
////                SerializerFeature.QuoteFieldNames,
////                SerializerFeature.WriteMapNullValue,
//                SerializerFeature.PrettyFormat
//        );
//        converter.setFastJsonConfig(fastJsonConfig);
//        // 解决乱码的问题
//        List<MediaType> fastMediaTypes = new ArrayList<>();
//        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
//        converter.setSupportedMediaTypes(fastMediaTypes);
//        converters.add(0, converter);
//    }


}
