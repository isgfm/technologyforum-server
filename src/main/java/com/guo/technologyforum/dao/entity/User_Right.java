package com.guo.technologyforum.dao.entity;

import java.util.Date;

public class User_Right extends User_RightKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user_right.d_create_time
     *
     * @mbg.generated
     */
    private Date dCreateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user_right.d_create_time
     *
     * @return the value of t_user_right.d_create_time
     *
     * @mbg.generated
     */
    public Date getdCreateTime() {
        return dCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user_right.d_create_time
     *
     * @param dCreateTime the value for t_user_right.d_create_time
     *
     * @mbg.generated
     */
    public void setdCreateTime(Date dCreateTime) {
        this.dCreateTime = dCreateTime;
    }
}