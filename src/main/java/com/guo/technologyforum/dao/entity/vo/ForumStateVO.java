package com.guo.technologyforum.dao.entity.vo;

public class ForumStateVO {
    private int registerNumber;
    private int themeNumber;
    private int themeReplyNumber;
    public ForumStateVO() {
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    public int getThemeNumber() {
        return themeNumber;
    }

    public void setThemeNumber(int themeNumber) {
        this.themeNumber = themeNumber;
    }

    public int getThemeReplyNumber() {
        return themeReplyNumber;
    }

    public void setThemeReplyNumber(int themeReplyNumber) {
        this.themeReplyNumber = themeReplyNumber;
    }

    public ForumStateVO(int registerNumber, int themeNumber, int themeReplyNumber) {
        this.registerNumber = registerNumber;
        this.themeNumber = themeNumber;
        this.themeReplyNumber = themeReplyNumber;
    }
}
