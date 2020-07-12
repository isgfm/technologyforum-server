package com.guo.technologyforum;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.guo.technologyforum.dao.mapper.generateMapper","com.guo.technologyforum.dao.mapper.customMapper"})
public class TechnologyforumApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechnologyforumApplication.class, args);
    }

}
