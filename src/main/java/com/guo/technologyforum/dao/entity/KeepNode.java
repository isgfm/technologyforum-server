package com.guo.technologyforum.dao.entity;

import java.util.Date;
import java.util.UUID;

public class KeepNode extends KeepNodeKey {
    public KeepNode(){
        this.cId = UUID.randomUUID().toString().replace("-", "");
    }
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_keep_node.c_id
     *
     * @mbg.generated
     */
    private String cId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_keep_node.d_keep_time
     *
     * @mbg.generated
     */
    private Date dKeepTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_keep_node.c_id
     *
     * @return the value of t_keep_node.c_id
     *
     * @mbg.generated
     */
    public String getcId() {
        return cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_keep_node.c_id
     *
     * @param cId the value for t_keep_node.c_id
     *
     * @mbg.generated
     */
    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_keep_node.d_keep_time
     *
     * @return the value of t_keep_node.d_keep_time
     *
     * @mbg.generated
     */
    public Date getdKeepTime() {
        return dKeepTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_keep_node.d_keep_time
     *
     * @param dKeepTime the value for t_keep_node.d_keep_time
     *
     * @mbg.generated
     */
    public void setdKeepTime(Date dKeepTime) {
        this.dKeepTime = dKeepTime;
    }
}