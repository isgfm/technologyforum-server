package com.guo.technologyforum.service;

import com.guo.technologyforum.dao.entity.*;
import com.guo.technologyforum.dao.mapper.generateMapper.KeepNodeMapper;
import com.guo.technologyforum.dao.mapper.generateMapper.KeepThemeMapper;
import com.guo.technologyforum.dao.mapper.generateMapper.UserAttentionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class KeepService {

    @Autowired
    KeepNodeMapper keepNodeMapper;

    @Autowired
    KeepThemeMapper keepThemeMapper;

    @Autowired
    UserAttentionMapper userAttentionMapper;

    public int addKeepTheme(KeepTheme keepTheme) throws DuplicateKeyException {

        return keepThemeMapper.insert(keepTheme);
    }

    public int deleteKeepTheme(long userId,long themeId){
        KeepThemeKey keepThemeKey = new KeepThemeKey();
        keepThemeKey.setnUserId(userId);
        keepThemeKey.setnThemeId(themeId);
        return keepThemeMapper.deleteByPrimaryKey(keepThemeKey);
    }

    public int addKeepNode(KeepNode keepNode) throws DuplicateKeyException {
        return keepNodeMapper.insert(keepNode);
    }

    public int deleteKeepNode(long userId,long nodeId){
        KeepNodeKey keepNodeKey = new KeepNodeKey();
        keepNodeKey.setnUserId(userId);
        keepNodeKey.setnNodeId(nodeId);
        return keepNodeMapper.deleteByPrimaryKey(keepNodeKey);
    }

    public long countKeepThemeByUserId(long userId){
        KeepThemeExample example = new KeepThemeExample();
        KeepThemeExample.Criteria criteria = example.createCriteria();
        criteria.andNUserIdEqualTo(userId);
        return keepThemeMapper.countByExample(example);
    }

    public long countKeepNodeByUserId(long userId){
        KeepNodeExample example = new KeepNodeExample();
        KeepNodeExample.Criteria criteria = example.createCriteria();
        criteria.andNUserIdEqualTo(userId);
        return keepNodeMapper.countByExample(example);
    }

}
