package com.guo.technologyforum.dao.entity.vo;

import com.guo.technologyforum.dao.entity.Theme;
import com.guo.technologyforum.dao.entity.ThemeReply;
import com.guo.technologyforum.dao.entity.User;

public class ThemeListVO {

    private User themeOwner;
    private Theme theme;
    private ThemeReply lastThemeReply;
    public Integer countReply;

    public Integer getCountReply() {
        return countReply;
    }

    public void setCountReply(Integer countReply) {
        this.countReply = countReply;
    }

    public ThemeListVO() {
    }

    public User getThemeOwner() {
        return themeOwner;
    }

    public void setThemeOwner(User themeOwner) {
        this.themeOwner = themeOwner;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }


    public ThemeReply getLastThemeReply() {
        return lastThemeReply;
    }

    public void setLastThemeReply(ThemeReply lastThemeReply) {
        this.lastThemeReply = lastThemeReply;
    }
}
