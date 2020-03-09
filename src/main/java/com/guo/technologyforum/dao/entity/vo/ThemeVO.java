package com.guo.technologyforum.dao.entity.vo;

import com.guo.technologyforum.dao.entity.Theme;
import com.guo.technologyforum.dao.entity.ThemeReply;
import com.guo.technologyforum.dao.entity.User;
import org.apache.ibatis.type.Alias;


public class ThemeVO {

    private User themeOwner;
    private Theme theme;
    private ThemeReply lastThemeReply;
    public Integer countReply;
    public String themeClassName;

    public String getThemeClassName() {
        return themeClassName;
    }

    public void setThemeClassName(String themeClassName) {
        this.themeClassName = themeClassName;
    }



    public Integer getCountReply() {
        return countReply;
    }

    public void setCountReply(Integer countReply) {
        this.countReply = countReply;
    }

    public ThemeVO() {
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
