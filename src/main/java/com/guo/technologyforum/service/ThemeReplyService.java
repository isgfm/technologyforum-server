package com.guo.technologyforum.service;

import com.guo.technologyforum.dao.entity.ThemeReply;
import com.guo.technologyforum.dao.entity.ThemeReplyExample;
import com.guo.technologyforum.dao.mapper.generateMapper.ThemeReplyMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemeReplyService {

    @Autowired
    ThemeReplyMapper themeReplyMapper;

    public long countThemeReply(long themeId){
        ThemeReplyExample themeReplyExample = new ThemeReplyExample();
        ThemeReplyExample.Criteria criteria = themeReplyExample.createCriteria();
        criteria.andNThemeIdEqualTo(themeId);
        return themeReplyMapper.countByExample(themeReplyExample);
    }

    public List<ThemeReply> getThemeReply(long themeId,int page,int pageSize){
        ThemeReplyExample themeReplyExample = new ThemeReplyExample();
        ThemeReplyExample.Criteria criteria = themeReplyExample.createCriteria();
        criteria.andNThemeIdEqualTo(themeId);
        themeReplyExample.setOrderByClause("d_reply_time asc");
        RowBounds rowBounds = new RowBounds(page * pageSize,pageSize);
        return themeReplyMapper.selectByExampleWithRowbounds(themeReplyExample,rowBounds);
    }
}
