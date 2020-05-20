package com.guo.technologyforum.util;

import com.guo.technologyforum.constant.UserPermission;
import com.guo.technologyforum.dao.entity.User;
import org.apache.shiro.SecurityUtils;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class UserUtil {

    private static List<String> avatarList = Arrays.asList("https://cdn.v2ex.com/gravatar/af4396573c1aa9be96b20d2ff8b1907d?s=48&d=retro",
            "https://cdn.v2ex.com/gravatar/d467f3b1603e9ceb12ff120c3a295919?s=48&d=retro",
            "https://cdn.v2ex.com/gravatar/65148d17c0c1ca18bb34c583b90ba4b4?s=48&d=retro",
            "https://cdn.v2ex.com/gravatar/d65224b09e9386934d3ecc47f1eaab95?s=48&d=retro",
            "https://cdn.v2ex.com/avatar/eedf/63d4/372826_normal.png?m=1575942257",
            "https://cdn.v2ex.com/gravatar/50d062359fce84768ff33c15177dc6d6?s=48&d=retro",
            "https://cdn.v2ex.com/gravatar/b7a0a8ac565327c4ccd4a6780a2d043e?s=48&d=retro");

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

    public static String randomAvatar(){
        int index =  (Math.abs(new Random().nextInt()))%avatarList.size();
        return avatarList.get(index);
    }
}
