package com.guo.technologyforum.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class Theme implements Serializable {
    private static final long serialVersionUID = 8509965839780943330L;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme.n_id
     *
     * @mbg.generated
     */
    private Long nId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme.n_user_id
     *
     * @mbg.generated
     */
    private Long nUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme.c_theme_title
     *
     * @mbg.generated
     */
    private String cThemeTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme.c_theme_content
     *
     * @mbg.generated
     */
    private String cThemeContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme.n_theme_class
     *
     * @mbg.generated
     */
    private Integer nThemeClass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme.d_create_time
     *
     * @mbg.generated
     */
    private Date dCreateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme.d_lastupdate_time
     *
     * @mbg.generated
     */
    private Date dLastupdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme.n_click
     *
     * @mbg.generated
     */
    private Long nClick;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme.n_theme_status
     *
     * @mbg.generated
     */
    private Integer nThemeStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme.n_keep_count
     *
     * @mbg.generated
     */
    private Integer nKeepCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme.n_like
     *
     * @mbg.generated
     */
    private Integer nLike;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme.n_dislike
     *
     * @mbg.generated
     */
    private Integer nDislike;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme.n_id
     *
     * @return the value of t_theme.n_id
     *
     * @mbg.generated
     */
    public Long getnId() {
        return nId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme.n_id
     *
     * @param nId the value for t_theme.n_id
     *
     * @mbg.generated
     */
    public void setnId(Long nId) {
        this.nId = nId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme.n_user_id
     *
     * @return the value of t_theme.n_user_id
     *
     * @mbg.generated
     */
    public Long getnUserId() {
        return nUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme.n_user_id
     *
     * @param nUserId the value for t_theme.n_user_id
     *
     * @mbg.generated
     */
    public void setnUserId(Long nUserId) {
        this.nUserId = nUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme.c_theme_title
     *
     * @return the value of t_theme.c_theme_title
     *
     * @mbg.generated
     */
    public String getcThemeTitle() {
        return cThemeTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme.c_theme_title
     *
     * @param cThemeTitle the value for t_theme.c_theme_title
     *
     * @mbg.generated
     */
    public void setcThemeTitle(String cThemeTitle) {
        this.cThemeTitle = cThemeTitle == null ? null : cThemeTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme.c_theme_content
     *
     * @return the value of t_theme.c_theme_content
     *
     * @mbg.generated
     */
    public String getcThemeContent() {
        return cThemeContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme.c_theme_content
     *
     * @param cThemeContent the value for t_theme.c_theme_content
     *
     * @mbg.generated
     */
    public void setcThemeContent(String cThemeContent) {
        this.cThemeContent = cThemeContent == null ? null : cThemeContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme.n_theme_class
     *
     * @return the value of t_theme.n_theme_class
     *
     * @mbg.generated
     */
    public Integer getnThemeClass() {
        return nThemeClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme.n_theme_class
     *
     * @param nThemeClass the value for t_theme.n_theme_class
     *
     * @mbg.generated
     */
    public void setnThemeClass(Integer nThemeClass) {
        this.nThemeClass = nThemeClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme.d_create_time
     *
     * @return the value of t_theme.d_create_time
     *
     * @mbg.generated
     */
    public Date getdCreateTime() {
        return dCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme.d_create_time
     *
     * @param dCreateTime the value for t_theme.d_create_time
     *
     * @mbg.generated
     */
    public void setdCreateTime(Date dCreateTime) {
        this.dCreateTime = dCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme.d_lastupdate_time
     *
     * @return the value of t_theme.d_lastupdate_time
     *
     * @mbg.generated
     */
    public Date getdLastupdateTime() {
        return dLastupdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme.d_lastupdate_time
     *
     * @param dLastupdateTime the value for t_theme.d_lastupdate_time
     *
     * @mbg.generated
     */
    public void setdLastupdateTime(Date dLastupdateTime) {
        this.dLastupdateTime = dLastupdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme.n_click
     *
     * @return the value of t_theme.n_click
     *
     * @mbg.generated
     */
    public Long getnClick() {
        return nClick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme.n_click
     *
     * @param nClick the value for t_theme.n_click
     *
     * @mbg.generated
     */
    public void setnClick(Long nClick) {
        this.nClick = nClick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme.n_theme_status
     *
     * @return the value of t_theme.n_theme_status
     *
     * @mbg.generated
     */
    public Integer getnThemeStatus() {
        return nThemeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme.n_theme_status
     *
     * @param nThemeStatus the value for t_theme.n_theme_status
     *
     * @mbg.generated
     */
    public void setnThemeStatus(Integer nThemeStatus) {
        this.nThemeStatus = nThemeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme.n_keep_count
     *
     * @return the value of t_theme.n_keep_count
     *
     * @mbg.generated
     */
    public Integer getnKeepCount() {
        return nKeepCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme.n_keep_count
     *
     * @param nKeepCount the value for t_theme.n_keep_count
     *
     * @mbg.generated
     */
    public void setnKeepCount(Integer nKeepCount) {
        this.nKeepCount = nKeepCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme.n_like
     *
     * @return the value of t_theme.n_like
     *
     * @mbg.generated
     */
    public Integer getnLike() {
        return nLike;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme.n_like
     *
     * @param nLike the value for t_theme.n_like
     *
     * @mbg.generated
     */
    public void setnLike(Integer nLike) {
        this.nLike = nLike;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme.n_dislike
     *
     * @return the value of t_theme.n_dislike
     *
     * @mbg.generated
     */
    public Integer getnDislike() {
        return nDislike;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme.n_dislike
     *
     * @param nDislike the value for t_theme.n_dislike
     *
     * @mbg.generated
     */
    public void setnDislike(Integer nDislike) {
        this.nDislike = nDislike;
    }
}