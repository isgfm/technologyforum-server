package com.guo.technologyforum.service;

import com.guo.technologyforum.dao.entity.User;
import com.guo.technologyforum.dao.mapper.generateMapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public Optional<User> getUserByUserId(long userId){
        return Optional.ofNullable(userMapper.selectByPrimaryKey(userId));
    }
}
