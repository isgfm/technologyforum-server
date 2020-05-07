package com.guo.technologyforum.service;

import com.guo.technologyforum.constant.UserConstant;
import com.guo.technologyforum.dao.entity.KeepThemeExample;
import com.guo.technologyforum.dao.entity.User;
import com.guo.technologyforum.dao.entity.UserAttentionExample;
import com.guo.technologyforum.dao.entity.UserExample;
import com.guo.technologyforum.dao.entity.vo.UserPageVO;
import com.guo.technologyforum.dao.mapper.customMapper.CustomUserMapper;
import com.guo.technologyforum.dao.mapper.generateMapper.UserAttentionMapper;
import com.guo.technologyforum.dao.mapper.generateMapper.UserMapper;
import com.guo.technologyforum.util.CommonUtil;
import com.guo.technologyforum.util.EncryptUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    CustomUserMapper customUserMapper;



    public List<User> getUserListFromThemeReply(long themeId){
        return customUserMapper.getUserListFromThemeReply(themeId);
    }

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
        return users.stream().findFirst();
    }

    public int addUser(User user){
        user.setdCreateTime(CommonUtil.getNowDate());
        return userMapper.insert(user);
    }

    public  List<User> getAllUser(){
        return userMapper.selectByExample(new UserExample());
    }

    public long getUserCount(){
        return userMapper.countByExample(new UserExample());
    }

    public List<User> GetUsersByPageAndCount(int pageIndex,int pageSize){
        int offset = pageIndex * pageSize;
        int limit = pageSize;
        RowBounds rowBounds = new RowBounds(offset,limit);
        return userMapper.selectByExampleWithRowbounds(new UserExample(),rowBounds);
    }

    public int saveUser(User user){
        return userMapper.updateByPrimaryKeySelective(user);
    }

    public Optional<User> getUserByUserId(long userId){
        return Optional.ofNullable(userMapper.selectByPrimaryKey(userId));
    }

    public int updateUserBlock(long userId,int status){
        User user = new User();
        user.setnId(userId);
        user.setnStatus(status);
        return userMapper.updateByPrimaryKeySelective(user);
    }

    public UserPageVO getBlockUserList(int page, int pageSize){
        List<Object> result = customUserMapper.getBlockUserList((page-1)*pageSize,pageSize);
        UserPageVO userPageVO;
        if(CollectionUtils.isNotEmpty(result)){
            userPageVO = new UserPageVO((List<User>) result.get(0),((List<Long>) result.get(1)).get(0));
        }else{
            userPageVO = new UserPageVO(UserConstant.RMPTY_USER_LIST,0L);
        }
        return userPageVO;
    }

}
