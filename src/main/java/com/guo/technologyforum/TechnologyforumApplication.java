package com.guo.technologyforum;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

@SpringBootApplication
@MapperScan({"com.guo.technologyforum.dao.mapper.generateMapper","com.guo.technologyforum.dao.mapper.customMapper"})
public class TechnologyforumApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechnologyforumApplication.class, args);
    }

}
