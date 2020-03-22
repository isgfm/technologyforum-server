package com.guo.technologyforum.util;

import com.guo.technologyforum.constant.UserPermission;
import com.guo.technologyforum.dao.entity.User;
import org.apache.shiro.SecurityUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class UserUtil {
    public static Optional<User> currentUser(){

        return Optional.ofNullable((User) SecurityUtils.getSubject().getSession().getAttribute(UserPermission.CURRENT_USER));
    }

    private static String userIdRegularExpression = "(?<=data-user-id=\")[0-9]+";

    public static List<Long> searchUserIdFromReplyContent(String replyContent){
        Pattern pattern = Pattern.compile(userIdRegularExpression);
        Matcher matcher = pattern.matcher(replyContent);
        List<Long> userIdList = new ArrayList<>();
        while (matcher.find()){
            userIdList.add(Long.valueOf(matcher.group()));
        }
        return userIdList;
    }
}
