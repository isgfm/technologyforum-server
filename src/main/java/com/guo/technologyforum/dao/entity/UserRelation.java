package com.guo.technologyforum.dao.entity;

import java.util.Date;

public class UserRelation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_relation.n_id
     *
     * @mbg.generated
     */
    private Long nId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_relation.n_user_id
     *
     * @mbg.generated
     */
    private Long nUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_relation.n_relation_user_id
     *
     * @mbg.generated
     */
    private String nRelationUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_relation.b_type
     *
     * @mbg.generated
     */
    private Boolean bType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_relation.d_create_time
     *
     * @mbg.generated
     */
    private Date dCreateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_relation.n_id
     *
     * @return the value of t_user_relation.n_id
     *
     * @mbg.generated
     */
    public Long getnId() {
        return nId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_relation.n_id
     *
     * @param nId the value for t_user_relation.n_id
     *
     * @mbg.generated
     */
    public void setnId(Long nId) {
        this.nId = nId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_relation.n_user_id
     *
     * @return the value of t_user_relation.n_user_id
     *
     * @mbg.generated
     */
    public Long getnUserId() {
        return nUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_relation.n_user_id
     *
     * @param nUserId the value for t_user_relation.n_user_id
     *
     * @mbg.generated
     */
    public void setnUserId(Long nUserId) {
        this.nUserId = nUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_relation.n_relation_user_id
     *
     * @return the value of t_user_relation.n_relation_user_id
     *
     * @mbg.generated
     */
    public String getnRelationUserId() {
        return nRelationUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_relation.n_relation_user_id
     *
     * @param nRelationUserId the value for t_user_relation.n_relation_user_id
     *
     * @mbg.generated
     */
    public void setnRelationUserId(String nRelationUserId) {
        this.nRelationUserId = nRelationUserId == null ? null : nRelationUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_relation.b_type
     *
     * @return the value of t_user_relation.b_type
     *
     * @mbg.generated
     */
    public Boolean getbType() {
        return bType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_relation.b_type
     *
     * @param bType the value for t_user_relation.b_type
     *
     * @mbg.generated
     */
    public void setbType(Boolean bType) {
        this.bType = bType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_relation.d_create_time
     *
     * @return the value of t_user_relation.d_create_time
     *
     * @mbg.generated
     */
    public Date getdCreateTime() {
        return dCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_relation.d_create_time
     *
     * @param dCreateTime the value for t_user_relation.d_create_time
     *
     * @mbg.generated
     */
    public void setdCreateTime(Date dCreateTime) {
        this.dCreateTime = dCreateTime;
    }
}