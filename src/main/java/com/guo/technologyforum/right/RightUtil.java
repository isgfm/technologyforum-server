package com.guo.technologyforum.right;

import com.guo.technologyforum.dao.entity.Right;
import com.guo.technologyforum.dao.entity.Role;
import com.guo.technologyforum.dao.entity.User;
import com.guo.technologyforum.dao.entity.bo.RightBO;
import com.guo.technologyforum.service.RightService;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @description: 权限util
 * @author: guofeiming
 * @create: 2020-07-12 16:46
 **/
@Component
public class RightUtil {

    private final RightService rightService;

    private static Map<Long,Set<Role>> USER_ROLE_MAP;

    private static Map<Integer,Set<Right>> ROLE_RIGHT_MAP;

    private static Map<Long,List<String>> USER_RIGHT_MAP = new HashMap<>();

    private static final List<String> RMPTY_lIST = new ArrayList<>();

    public RightUtil(RightService rightService) {
        this.rightService = rightService;
    }

    public void init(){
        initUserRightMap();

    }

    private void initUserRightMap(){
        List<RightBO> rightBOList = rightService.getUserRight();
        for(RightBO rightBO: rightBOList){
            USER_RIGHT_MAP.put(rightBO.getUserId(),rightBO.getRights().stream().map(Right::getcRightValue).collect(Collectors.toList()));
        }
    }

    public static Set<Role> getRightListByUser(User user){
        return USER_ROLE_MAP.get(user.getnId());
    }

    /**
     * TODO 用户是否有权限
     * @param userId 用户id
     * @param rightValue 权限值
     * @return boolean
     */
    public static boolean hasRight(Long userId,String rightValue){
        return getUserRight(userId).contains(rightValue);
    }

    public static List<String> getRightsByUserId(Long userId){
        return getUserRight(userId);
    }

    private static List<String> getUserRight(Long userId){
        return Optional.ofNullable(USER_RIGHT_MAP.get(userId)).orElse(RMPTY_lIST);
    }



}
