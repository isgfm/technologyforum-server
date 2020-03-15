package com.guo.technologyforum.service;

import com.guo.technologyforum.dao.entity.ThemeReply;
import com.guo.technologyforum.dao.entity.ThemeReplyExample;
import com.guo.technologyforum.dao.entity.bo.ThemeReplyBO;
import com.guo.technologyforum.dao.mapper.customMapper.CustomThemeReplyMapper;
import com.guo.technologyforum.dao.mapper.generateMapper.ThemeReplyMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThemeReplyService {

    @Autowired
    ThemeReplyMapper themeReplyMapper;

    @Autowired
    CustomThemeReplyMapper customThemeReplyMapper;

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

    public List<ThemeReplyBO> getThemeReplyBOList(long themeId,int page,int pageSize){
        return customThemeReplyMapper.getThemeReplyBOByThemeId(themeId,pageSize,pageSize*(page-1));
    }

    public Optional<ThemeReply> getLastThemeReply(long themeId){
        ThemeReplyExample themeReplyExample = new ThemeReplyExample();
        ThemeReplyExample.Criteria criteria = themeReplyExample.createCriteria();
        criteria.andNThemeIdEqualTo(themeId);
        themeReplyExample.setOrderByClause("d_reply_time desc");
        //offset 0 limit 1代表只取最前面的一个
        RowBounds rowBounds = new RowBounds(0,1);
        List<ThemeReply> themeReplyList = themeReplyMapper.selectByExampleWithRowbounds(themeReplyExample,rowBounds);
        if(themeReplyList.size()==1)
            return Optional.ofNullable(themeReplyList.get(0));
        else
            return Optional.empty();
    }

    public int addThemeReply(ThemeReply themeReply){
        return themeReplyMapper.insert(themeReply);
    }
}
