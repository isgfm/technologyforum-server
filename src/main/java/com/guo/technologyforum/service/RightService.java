package com.guo.technologyforum.service;

import com.guo.technologyforum.dao.entity.bo.RightBO;
import com.guo.technologyforum.dao.mapper.customMapper.CustomRightMapper;
import com.guo.technologyforum.dao.mapper.generateMapper.RightMapper;
import com.guo.technologyforum.dao.mapper.generateMapper.RoleMapper;
import com.guo.technologyforum.dao.mapper.generateMapper.Role_rightMapper;
import com.guo.technologyforum.dao.mapper.generateMapper.User_RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-07-12 17:06
 **/
@Service
public class RightService {
    @Autowired
    private RightMapper rightMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private Role_rightMapper roleRightMapper;

    @Autowired
    private User_RoleMapper userRoleMapper;

    @Autowired
    private CustomRightMapper customRightMapper;

    public List<RightBO> getUserRight(){
        return customRightMapper.selectAllUserRight();
    }
}
