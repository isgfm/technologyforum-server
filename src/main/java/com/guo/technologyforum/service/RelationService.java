package com.guo.technologyforum.service;

import com.guo.technologyforum.dao.entity.UserAttentionExample;
import com.guo.technologyforum.dao.mapper.generateMapper.UserAttentionMapper;
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
}
