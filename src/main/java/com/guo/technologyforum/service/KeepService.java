package com.guo.technologyforum.service;

import com.guo.technologyforum.dao.entity.*;
import com.guo.technologyforum.dao.mapper.generateMapper.KeepNodeMapper;
import com.guo.technologyforum.dao.mapper.generateMapper.KeepThemeMapper;
import com.guo.technologyforum.dao.mapper.generateMapper.UserAttentionMapper;
import com.guo.technologyforum.util.CommonUtil;
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

    public int addKeepTheme(long userId,long themeId) throws DuplicateKeyException {
        KeepTheme keepTheme = new KeepTheme();
        keepTheme.setnUserId(userId);
        keepTheme.setnThemeId(themeId);
        keepTheme.setdKeepTime(CommonUtil.getNowDate());
        return keepThemeMapper.insert(keepTheme);
    }

    public int deleteKeepTheme(long userId,long themeId){
        KeepThemeKey keepThemeKey = initKeepThemeKey(userId, themeId);
        return keepThemeMapper.deleteByPrimaryKey(keepThemeKey);
    }

    public KeepTheme getKeepTheme(long userId,long themeId){
        KeepThemeKey keepThemeKey = initKeepThemeKey(userId, themeId);
        return keepThemeMapper.selectByPrimaryKey(keepThemeKey);
    }

    /**
     * TODO 计算user收藏了多少个主题
     * @param userId
     * @return long
     */
    public long countKeepThemeByUserId(long userId){
        KeepThemeExample example = new KeepThemeExample();
        KeepThemeExample.Criteria criteria = example.createCriteria();
        criteria.andNUserIdEqualTo(userId);
        return keepThemeMapper.countByExample(example);
    }

    /**
     * TODO 计算有多少人收藏了该主题
     * @param themeId 被收藏的主题id
     * @return long
     */
    public long countThemeKeep(long themeId){
        KeepThemeExample example = new KeepThemeExample();
        KeepThemeExample.Criteria criteria = example.createCriteria();
        criteria.andNThemeIdEqualTo(themeId);
        return keepThemeMapper.countByExample(example);
    }

    private KeepThemeKey initKeepThemeKey(long userId,long themeId){
        KeepThemeKey keepThemeKey = new KeepThemeKey();
        keepThemeKey.setnUserId(userId);
        keepThemeKey.setnThemeId(themeId);
        return keepThemeKey;
    }

    public int addKeepNode(long userId,long nodeId) throws DuplicateKeyException {
        KeepNode keepNode = new KeepNode();
        keepNode.setnUserId(userId);
        keepNode.setnNodeId(nodeId);
        keepNode.setdKeepTime(CommonUtil.getNowDate());
        return keepNodeMapper.insert(keepNode);
    }

    public int deleteKeepNode(long userId,long nodeId){
        KeepNodeKey keepNodeKey = initKeepNodeKey(userId,nodeId);
        return keepNodeMapper.deleteByPrimaryKey(keepNodeKey);
    }

    /**
     * TODO 计算user收藏了多少个节点
     * @param userId
     * @return long
     */
    public long countKeepNodeByUserId(long userId){
        KeepNodeExample example = new KeepNodeExample();
        KeepNodeExample.Criteria criteria = example.createCriteria();
        criteria.andNUserIdEqualTo(userId);
        return keepNodeMapper.countByExample(example);
    }

    public KeepNode getKeepNode(long userId,long nodeId){
        KeepNodeKey keepNodeKey = initKeepNodeKey(userId,nodeId);
        return keepNodeMapper.selectByPrimaryKey(keepNodeKey);
    }


    /**
     * TODO 计算多少人收藏了该节点
     * @param nodeId
     * @return long
     */
    public long countNodeKeep(long nodeId){
        KeepNodeExample example = new KeepNodeExample();
        KeepNodeExample.Criteria criteria = example.createCriteria();
        criteria.andNNodeIdEqualTo(nodeId);
        return keepNodeMapper.countByExample(example);
    }

    private KeepNodeKey initKeepNodeKey(long userId,long nodeId){
        KeepNodeKey keepNodeKey = new KeepNodeKey();
        keepNodeKey.setnUserId(userId);
        keepNodeKey.setnNodeId(nodeId);
        return keepNodeKey;
    }

}
