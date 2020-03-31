package com.guo.technologyforum.service;

import com.guo.technologyforum.dao.entity.KeepNode;
import com.guo.technologyforum.dao.entity.KeepNodeExample;
import com.guo.technologyforum.dao.entity.KeepTheme;
import com.guo.technologyforum.dao.entity.KeepThemeExample;
import com.guo.technologyforum.dao.mapper.generateMapper.KeepNodeMapper;
import com.guo.technologyforum.dao.mapper.generateMapper.KeepThemeMapper;
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

    public int addKeepTheme(KeepTheme keepTheme) throws DuplicateKeyException {
        return keepThemeMapper.insert(keepTheme);
    }

    public int addKeepNode(KeepNode keepNode) throws DuplicateKeyException {
        return keepNodeMapper.insert(keepNode);
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
