package com.guo.technologyforum.dao.entity.vo;

import com.guo.technologyforum.dao.entity.ThemeReply;

import java.util.List;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-03-07 22:28
 **/
public final class ThemeReplyVO {

    private List<ThemeReply> themeReplyList;
    private long totalReply;
    public ThemeReplyVO() {
    }

    public ThemeReplyVO(List<ThemeReply> themeReplyList, int totalReply) {
        this.themeReplyList = themeReplyList;
        this.totalReply = totalReply;
    }

    public List<ThemeReply> getThemeReplyList() {
        return themeReplyList;
    }

    public void setThemeReplyList(List<ThemeReply> themeReplyList) {
        this.themeReplyList = themeReplyList;
    }

    public long getTotalReply() {
        return totalReply;
    }

    public void setTotalReply(long totalReply) {
        this.totalReply = totalReply;
    }



}
