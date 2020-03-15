package com.guo.technologyforum.service;

import com.guo.technologyforum.dao.entity.User;
import com.guo.technologyforum.dao.mapper.generateMapper.NotifyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-03-15 22:13
 **/
@Service
public class NotifyService {
    @Autowired
    NotifyMapper notifyMapper;

    public void notifyCauseByThemeReply(List<Long> userIdList, User currentUser,Long themeId){

    }
}
