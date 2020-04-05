package com.guo.technologyforum.service;

import com.guo.technologyforum.dao.entity.UserAttention;
import com.guo.technologyforum.dao.entity.UserAttentionExample;
import com.guo.technologyforum.dao.entity.UserAttentionKey;
import com.guo.technologyforum.dao.mapper.generateMapper.UserAttentionMapper;
import com.guo.technologyforum.util.CommonUtil;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-04-02 23:15
 **/
@Service
public class RelationService {
    @Autowired
    UserAttentionMapper userAttentionMapper;

    public long countUserAttention(long userId){
        UserAttentionExample example = new UserAttentionExample();
        UserAttentionExample.Criteria criteria = example.createCriteria();
        criteria.andNUserIdEqualTo(userId);
        return userAttentionMapper.countByExample(example);
    }

    /**
     * TODO 添加关注记录
     * @param userId 用户id
     * @param attentionUserId 被关注用户id
     * @return int
     */
    public int addAttention(long userId,long attentionUserId){
        UserAttention userAttention = new UserAttention();
        userAttention.setdAttentionTime(CommonUtil.getNowDate());
        userAttention.setnAttentionUserId(attentionUserId);
        userAttention.setnUserId(userId);
        return userAttentionMapper.insert(userAttention);
    }


    public int deleteAttention(long userId,long attentionUserId){
        UserAttentionKey userAttentionKey = initUserAttentionKey(userId,attentionUserId);
        return userAttentionMapper.deleteByPrimaryKey(userAttentionKey);
    }


    public UserAttention getUserAttention(long userId,long attentionUserId){
        UserAttentionKey userAttentionKey = initUserAttentionKey(userId,attentionUserId);
        return userAttentionMapper.selectByPrimaryKey(userAttentionKey);
    }

    private UserAttentionKey initUserAttentionKey(long userId,long attentionUserId){
        UserAttentionKey userAttentionKey = new UserAttentionKey();
        userAttentionKey.setnAttentionUserId(attentionUserId);
        userAttentionKey.setnUserId(userId);
        return userAttentionKey;
    }

}
