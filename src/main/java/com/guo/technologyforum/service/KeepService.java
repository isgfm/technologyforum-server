package com.guo.technologyforum.service;

import com.guo.technologyforum.dao.entity.KeepNode;
import com.guo.technologyforum.dao.entity.KeepTheme;
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
}
