package com.guo.technologyforum;

import com.guo.technologyforum.util.CommonUtil;
import com.hankcs.hanlp.HanLP;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TechnologyforumApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(CommonUtil.regexSearchWords("mysql 多次模糊查询"));
    }

}
