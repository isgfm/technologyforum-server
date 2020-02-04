package com.guo.technologyforum.dao.entity;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.n_id
     *
     * @mbg.generated
     */
    private Long nId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.c_username
     *
     * @mbg.generated
     */
    private String cUsername;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.c_password
     *
     * @mbg.generated
     */
    private String cPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.c_email
     *
     * @mbg.generated
     */
    private String cEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.n_sex
     *
     * @mbg.generated
     */
    private Integer nSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.c_telephone
     *
     * @mbg.generated
     */
    private String cTelephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.c_personal_website
     *
     * @mbg.generated
     */
    private String cPersonalWebsite;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.c_company
     *
     * @mbg.generated
     */
    private String cCompany;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.c_position
     *
     * @mbg.generated
     */
    private String cPosition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.c_location
     *
     * @mbg.generated
     */
    private String cLocation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.c_signature
     *
     * @mbg.generated
     */
    private String cSignature;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.c_avatar
     *
     * @mbg.generated
     */
    private String cAvatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.n_coin
     *
     * @mbg.generated
     */
    private Integer nCoin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.d_create_time
     *
     * @mbg.generated
     */
    private Date dCreateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.d_update_time
     *
     * @mbg.generated
     */
    private Date dUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.c_personal_introduction
     *
     * @mbg.generated
     */
    private String cPersonalIntroduction;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.n_id
     *
     * @return the value of t_user.n_id
     *
     * @mbg.generated
     */
    public Long getnId() {
        return nId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.n_id
     *
     * @param nId the value for t_user.n_id
     *
     * @mbg.generated
     */
    public void setnId(Long nId) {
        this.nId = nId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.c_username
     *
     * @return the value of t_user.c_username
     *
     * @mbg.generated
     */
    public String getcUsername() {
        return cUsername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.c_username
     *
     * @param cUsername the value for t_user.c_username
     *
     * @mbg.generated
     */
    public void setcUsername(String cUsername) {
        this.cUsername = cUsername == null ? null : cUsername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.c_password
     *
     * @return the value of t_user.c_password
     *
     * @mbg.generated
     */
    public String getcPassword() {
        return cPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.c_password
     *
     * @param cPassword the value for t_user.c_password
     *
     * @mbg.generated
     */
    public void setcPassword(String cPassword) {
        this.cPassword = cPassword == null ? null : cPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.c_email
     *
     * @return the value of t_user.c_email
     *
     * @mbg.generated
     */
    public String getcEmail() {
        return cEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.c_email
     *
     * @param cEmail the value for t_user.c_email
     *
     * @mbg.generated
     */
    public void setcEmail(String cEmail) {
        this.cEmail = cEmail == null ? null : cEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.n_sex
     *
     * @return the value of t_user.n_sex
     *
     * @mbg.generated
     */
    public Integer getnSex() {
        return nSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.n_sex
     *
     * @param nSex the value for t_user.n_sex
     *
     * @mbg.generated
     */
    public void setnSex(Integer nSex) {
        this.nSex = nSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.c_telephone
     *
     * @return the value of t_user.c_telephone
     *
     * @mbg.generated
     */
    public String getcTelephone() {
        return cTelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.c_telephone
     *
     * @param cTelephone the value for t_user.c_telephone
     *
     * @mbg.generated
     */
    public void setcTelephone(String cTelephone) {
        this.cTelephone = cTelephone == null ? null : cTelephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.c_personal_website
     *
     * @return the value of t_user.c_personal_website
     *
     * @mbg.generated
     */
    public String getcPersonalWebsite() {
        return cPersonalWebsite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.c_personal_website
     *
     * @param cPersonalWebsite the value for t_user.c_personal_website
     *
     * @mbg.generated
     */
    public void setcPersonalWebsite(String cPersonalWebsite) {
        this.cPersonalWebsite = cPersonalWebsite == null ? null : cPersonalWebsite.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.c_company
     *
     * @return the value of t_user.c_company
     *
     * @mbg.generated
     */
    public String getcCompany() {
        return cCompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.c_company
     *
     * @param cCompany the value for t_user.c_company
     *
     * @mbg.generated
     */
    public void setcCompany(String cCompany) {
        this.cCompany = cCompany == null ? null : cCompany.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.c_position
     *
     * @return the value of t_user.c_position
     *
     * @mbg.generated
     */
    public String getcPosition() {
        return cPosition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.c_position
     *
     * @param cPosition the value for t_user.c_position
     *
     * @mbg.generated
     */
    public void setcPosition(String cPosition) {
        this.cPosition = cPosition == null ? null : cPosition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.c_location
     *
     * @return the value of t_user.c_location
     *
     * @mbg.generated
     */
    public String getcLocation() {
        return cLocation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.c_location
     *
     * @param cLocation the value for t_user.c_location
     *
     * @mbg.generated
     */
    public void setcLocation(String cLocation) {
        this.cLocation = cLocation == null ? null : cLocation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.c_signature
     *
     * @return the value of t_user.c_signature
     *
     * @mbg.generated
     */
    public String getcSignature() {
        return cSignature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.c_signature
     *
     * @param cSignature the value for t_user.c_signature
     *
     * @mbg.generated
     */
    public void setcSignature(String cSignature) {
        this.cSignature = cSignature == null ? null : cSignature.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.c_avatar
     *
     * @return the value of t_user.c_avatar
     *
     * @mbg.generated
     */
    public String getcAvatar() {
        return cAvatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.c_avatar
     *
     * @param cAvatar the value for t_user.c_avatar
     *
     * @mbg.generated
     */
    public void setcAvatar(String cAvatar) {
        this.cAvatar = cAvatar == null ? null : cAvatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.n_coin
     *
     * @return the value of t_user.n_coin
     *
     * @mbg.generated
     */
    public Integer getnCoin() {
        return nCoin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.n_coin
     *
     * @param nCoin the value for t_user.n_coin
     *
     * @mbg.generated
     */
    public void setnCoin(Integer nCoin) {
        this.nCoin = nCoin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.d_create_time
     *
     * @return the value of t_user.d_create_time
     *
     * @mbg.generated
     */
    public Date getdCreateTime() {
        return dCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.d_create_time
     *
     * @param dCreateTime the value for t_user.d_create_time
     *
     * @mbg.generated
     */
    public void setdCreateTime(Date dCreateTime) {
        this.dCreateTime = dCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.d_update_time
     *
     * @return the value of t_user.d_update_time
     *
     * @mbg.generated
     */
    public Date getdUpdateTime() {
        return dUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.d_update_time
     *
     * @param dUpdateTime the value for t_user.d_update_time
     *
     * @mbg.generated
     */
    public void setdUpdateTime(Date dUpdateTime) {
        this.dUpdateTime = dUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.c_personal_introduction
     *
     * @return the value of t_user.c_personal_introduction
     *
     * @mbg.generated
     */
    public String getcPersonalIntroduction() {
        return cPersonalIntroduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.c_personal_introduction
     *
     * @param cPersonalIntroduction the value for t_user.c_personal_introduction
     *
     * @mbg.generated
     */
    public void setcPersonalIntroduction(String cPersonalIntroduction) {
        this.cPersonalIntroduction = cPersonalIntroduction == null ? null : cPersonalIntroduction.trim();
    }
}