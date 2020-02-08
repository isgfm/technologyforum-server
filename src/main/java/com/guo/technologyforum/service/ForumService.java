package com.guo.technologyforum.service;

import com.guo.technologyforum.dao.entity.vo.ForumStateVO;
import com.guo.technologyforum.dao.mapper.customMapper.CustomForumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForumService {
    @Autowired
    CustomForumMapper customForumMapper;

    public ForumStateVO getForumStateVO(){

        return new ForumStateVO(customForumMapper.getRegisterNumber(),customForumMapper.getThemeNumber(),customForumMapper.getThemeReplyNumber());
    }
}
