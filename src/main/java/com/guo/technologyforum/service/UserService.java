package com.guo.technologyforum.service;

import com.guo.technologyforum.dao.entity.User;
import com.guo.technologyforum.dao.entity.UserExample;
import com.guo.technologyforum.dao.mapper.generateMapper.UserMapper;
import com.guo.technologyforum.util.EncryptUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public void encryptUserPassword(User user){
        user.setcSalt(EncryptUtil.getRandSalt());
        String newPassword = EncryptUtil.encrypt(user.getcPassword(),user.getcSalt());
        user.setcPassword(newPassword);
    }

    public Optional<User> getUserByUserName(String userName){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andCUsernameEqualTo(userName);
        List<User> users = userMapper.selectByExample(userExample);
        if(users.size() == 1)
            return Optional.ofNullable(users.get(0));
        else
            return Optional.ofNullable(null);
    }

    public int addUser(User user){
        return userMapper.insert(user);
    }
}
