package com.guo.technologyforum.constant;

import com.guo.technologyforum.dao.entity.User;
import com.guo.technologyforum.dao.entity.vo.ThemeVO;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-05-03 18:01
 **/
public class UserConstant {

    /** 管理员*/
    public static int USER_ADMIN = 1;

    /** 封禁*/
    public static int USER_STATUS_BLOCK = 1;

    /** 状态正常*/
    public static int USER_STATUS_NORMAL = 0;

    public static final List<User> RMPTY_USER_LIST = new ArrayList<>();
}
