package com.guo.technologyforum.dao.entity.bo;

import com.guo.technologyforum.dao.entity.ThemeReply;
import com.guo.technologyforum.dao.entity.User;

/**
 * @description:
 * @author: guofeiming
 * @create: 2020-03-08 11:41
 **/
public final class ThemeReplyBO {
    private ThemeReply themeReply;
    private User themeReplyOwner;

    public ThemeReplyBO(ThemeReply themeReply, User themeReplyOwner) {
        this.themeReply = themeReply;
        this.themeReplyOwner = themeReplyOwner;
    }

    public ThemeReplyBO() {
    }

    public ThemeReply getThemeReply() {
        return themeReply;
    }

    public void setThemeReply(ThemeReply themeReply) {
        this.themeReply = themeReply;
    }

    public User getThemeReplyOwner() {
        return themeReplyOwner;
    }

    public void setThemeReplyOwner(User themeReplyOwner) {
        this.themeReplyOwner = themeReplyOwner;
    }
}
