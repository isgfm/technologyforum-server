package com.guo.technologyforum.service;

import com.guo.technologyforum.dao.entity.ThemeReply;
import com.guo.technologyforum.dao.mapper.generateMapper.ThemeReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThemeReplyService {

    @Autowired
    ThemeReplyMapper themeReplyMapper;


}
