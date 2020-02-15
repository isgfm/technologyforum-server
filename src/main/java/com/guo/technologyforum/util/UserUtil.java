package com.guo.technologyforum.util;

import com.guo.technologyforum.constant.UserPermission;
import com.guo.technologyforum.dao.entity.User;
import org.apache.shiro.SecurityUtils;

import java.util.Optional;

public class UserUtil {
    public static Optional<User> currentUser(){

        return Optional.ofNullable((User) SecurityUtils.getSubject().getSession().getAttribute(UserPermission.CURRENT_USER));
    }
}
