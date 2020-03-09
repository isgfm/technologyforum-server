package com.guo.technologyforum.dao.entity.vo;

import com.guo.technologyforum.dao.entity.ThemeReply;
import com.guo.technologyforum.dao.entity.bo.ThemeReplyBO;

import java.util.List;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-03-07 22:28
 **/
public final class ThemeReplyVO {

    private List<ThemeReplyBO> themeReplyBOList;
    private long totalReply;
    private ThemeReply lastThemeReply;

    public ThemeReplyVO(List<ThemeReplyBO> themeReplyBOList, long totalReply, ThemeReply lastThemeReply) {
        this.themeReplyBOList = themeReplyBOList;
        this.totalReply = totalReply;
        this.lastThemeReply = lastThemeReply;
    }

    public ThemeReply getLastThemeReply() {
        return lastThemeReply;
    }

    public void setLastThemeReply(ThemeReply lastThemeReply) {
        this.lastThemeReply = lastThemeReply;
    }


    public ThemeReplyVO() {
    }



    public List<ThemeReplyBO> getThemeReplyBOList() {
        return themeReplyBOList;
    }

    public void setThemeReplyBOList(List<ThemeReplyBO> themeReplyBOList) {
        this.themeReplyBOList = themeReplyBOList;
    }

    public long getTotalReply() {
        return totalReply;
    }

    public void setTotalReply(long totalReply) {
        this.totalReply = totalReply;
    }



}
