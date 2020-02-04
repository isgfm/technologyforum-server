package com.guo.technologyforum.dao.entity;

import java.util.Date;

public class Notify {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notify.n_id
     *
     * @mbg.generated
     */
    private Long nId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notify.n_send_user_id
     *
     * @mbg.generated
     */
    private Long nSendUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notify.n_notify_type
     *
     * @mbg.generated
     */
    private Integer nNotifyType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notify.n_receive_user_id
     *
     * @mbg.generated
     */
    private Integer nReceiveUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notify.b_status
     *
     * @mbg.generated
     */
    private Boolean bStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notify.d_create_time
     *
     * @mbg.generated
     */
    private Date dCreateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notify.d_read_time
     *
     * @mbg.generated
     */
    private Date dReadTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_notify.c_message
     *
     * @mbg.generated
     */
    private String cMessage;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notify.n_id
     *
     * @return the value of t_notify.n_id
     *
     * @mbg.generated
     */
    public Long getnId() {
        return nId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notify.n_id
     *
     * @param nId the value for t_notify.n_id
     *
     * @mbg.generated
     */
    public void setnId(Long nId) {
        this.nId = nId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notify.n_send_user_id
     *
     * @return the value of t_notify.n_send_user_id
     *
     * @mbg.generated
     */
    public Long getnSendUserId() {
        return nSendUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notify.n_send_user_id
     *
     * @param nSendUserId the value for t_notify.n_send_user_id
     *
     * @mbg.generated
     */
    public void setnSendUserId(Long nSendUserId) {
        this.nSendUserId = nSendUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notify.n_notify_type
     *
     * @return the value of t_notify.n_notify_type
     *
     * @mbg.generated
     */
    public Integer getnNotifyType() {
        return nNotifyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notify.n_notify_type
     *
     * @param nNotifyType the value for t_notify.n_notify_type
     *
     * @mbg.generated
     */
    public void setnNotifyType(Integer nNotifyType) {
        this.nNotifyType = nNotifyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notify.n_receive_user_id
     *
     * @return the value of t_notify.n_receive_user_id
     *
     * @mbg.generated
     */
    public Integer getnReceiveUserId() {
        return nReceiveUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notify.n_receive_user_id
     *
     * @param nReceiveUserId the value for t_notify.n_receive_user_id
     *
     * @mbg.generated
     */
    public void setnReceiveUserId(Integer nReceiveUserId) {
        this.nReceiveUserId = nReceiveUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notify.b_status
     *
     * @return the value of t_notify.b_status
     *
     * @mbg.generated
     */
    public Boolean getbStatus() {
        return bStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notify.b_status
     *
     * @param bStatus the value for t_notify.b_status
     *
     * @mbg.generated
     */
    public void setbStatus(Boolean bStatus) {
        this.bStatus = bStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notify.d_create_time
     *
     * @return the value of t_notify.d_create_time
     *
     * @mbg.generated
     */
    public Date getdCreateTime() {
        return dCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notify.d_create_time
     *
     * @param dCreateTime the value for t_notify.d_create_time
     *
     * @mbg.generated
     */
    public void setdCreateTime(Date dCreateTime) {
        this.dCreateTime = dCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notify.d_read_time
     *
     * @return the value of t_notify.d_read_time
     *
     * @mbg.generated
     */
    public Date getdReadTime() {
        return dReadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notify.d_read_time
     *
     * @param dReadTime the value for t_notify.d_read_time
     *
     * @mbg.generated
     */
    public void setdReadTime(Date dReadTime) {
        this.dReadTime = dReadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_notify.c_message
     *
     * @return the value of t_notify.c_message
     *
     * @mbg.generated
     */
    public String getcMessage() {
        return cMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_notify.c_message
     *
     * @param cMessage the value for t_notify.c_message
     *
     * @mbg.generated
     */
    public void setcMessage(String cMessage) {
        this.cMessage = cMessage == null ? null : cMessage.trim();
    }
}