package com.guo.technologyforum.StartRunner;

import com.guo.technologyforum.right.RightUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @description: 权限初始化
 * @author: guofeiming
 * @create: 2020-07-15 22:30
 **/
@Component
public class RightInitRunner implements CommandLineRunner {

    private final RightUtil rightUtil;

    public RightInitRunner(RightUtil rightUtil) {
        this.rightUtil = rightUtil;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("开始初始化权限");
        rightUtil.init();
        System.out.println("初始化权限结束");
    }
}
