package com.guo.technologyforum.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class ThemeClass implements Serializable {
    private static final long serialVersionUID = 9202247064751968979L;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme_class.n_id
     *
     * @mbg.generated
     */
    private Integer nId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme_class.n_parentid
     *
     * @mbg.generated
     */
    private Integer nParentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme_class.n_depth
     *
     * @mbg.generated
     */
    private String nDepth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme_class.c_name
     *
     * @mbg.generated
     */
    private String cName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme_class.n_order
     *
     * @mbg.generated
     */
    private Integer nOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme_class.b_enable
     *
     * @mbg.generated
     */
    private Boolean bEnable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme_class.d_createtime
     *
     * @mbg.generated
     */
    private Date dCreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme_class.c_description
     *
     * @mbg.generated
     */
    private String cDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme_class.c_img_url
     *
     * @mbg.generated
     */
    private String cImgUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme_class.c_router
     *
     * @mbg.generated
     */
    private String cRouter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_theme_class.c_type
     *
     * @mbg.generated
     */
    private String cType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme_class.n_id
     *
     * @return the value of t_theme_class.n_id
     *
     * @mbg.generated
     */
    public Integer getnId() {
        return nId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme_class.n_id
     *
     * @param nId the value for t_theme_class.n_id
     *
     * @mbg.generated
     */
    public void setnId(Integer nId) {
        this.nId = nId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme_class.n_parentid
     *
     * @return the value of t_theme_class.n_parentid
     *
     * @mbg.generated
     */
    public Integer getnParentid() {
        return nParentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme_class.n_parentid
     *
     * @param nParentid the value for t_theme_class.n_parentid
     *
     * @mbg.generated
     */
    public void setnParentid(Integer nParentid) {
        this.nParentid = nParentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme_class.n_depth
     *
     * @return the value of t_theme_class.n_depth
     *
     * @mbg.generated
     */
    public String getnDepth() {
        return nDepth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme_class.n_depth
     *
     * @param nDepth the value for t_theme_class.n_depth
     *
     * @mbg.generated
     */
    public void setnDepth(String nDepth) {
        this.nDepth = nDepth == null ? null : nDepth.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme_class.c_name
     *
     * @return the value of t_theme_class.c_name
     *
     * @mbg.generated
     */
    public String getcName() {
        return cName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme_class.c_name
     *
     * @param cName the value for t_theme_class.c_name
     *
     * @mbg.generated
     */
    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme_class.n_order
     *
     * @return the value of t_theme_class.n_order
     *
     * @mbg.generated
     */
    public Integer getnOrder() {
        return nOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme_class.n_order
     *
     * @param nOrder the value for t_theme_class.n_order
     *
     * @mbg.generated
     */
    public void setnOrder(Integer nOrder) {
        this.nOrder = nOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme_class.b_enable
     *
     * @return the value of t_theme_class.b_enable
     *
     * @mbg.generated
     */
    public Boolean getbEnable() {
        return bEnable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme_class.b_enable
     *
     * @param bEnable the value for t_theme_class.b_enable
     *
     * @mbg.generated
     */
    public void setbEnable(Boolean bEnable) {
        this.bEnable = bEnable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme_class.d_createtime
     *
     * @return the value of t_theme_class.d_createtime
     *
     * @mbg.generated
     */
    public Date getdCreatetime() {
        return dCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme_class.d_createtime
     *
     * @param dCreatetime the value for t_theme_class.d_createtime
     *
     * @mbg.generated
     */
    public void setdCreatetime(Date dCreatetime) {
        this.dCreatetime = dCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme_class.c_description
     *
     * @return the value of t_theme_class.c_description
     *
     * @mbg.generated
     */
    public String getcDescription() {
        return cDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme_class.c_description
     *
     * @param cDescription the value for t_theme_class.c_description
     *
     * @mbg.generated
     */
    public void setcDescription(String cDescription) {
        this.cDescription = cDescription == null ? null : cDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme_class.c_img_url
     *
     * @return the value of t_theme_class.c_img_url
     *
     * @mbg.generated
     */
    public String getcImgUrl() {
        return cImgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme_class.c_img_url
     *
     * @param cImgUrl the value for t_theme_class.c_img_url
     *
     * @mbg.generated
     */
    public void setcImgUrl(String cImgUrl) {
        this.cImgUrl = cImgUrl == null ? null : cImgUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme_class.c_router
     *
     * @return the value of t_theme_class.c_router
     *
     * @mbg.generated
     */
    public String getcRouter() {
        return cRouter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme_class.c_router
     *
     * @param cRouter the value for t_theme_class.c_router
     *
     * @mbg.generated
     */
    public void setcRouter(String cRouter) {
        this.cRouter = cRouter == null ? null : cRouter.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_theme_class.c_type
     *
     * @return the value of t_theme_class.c_type
     *
     * @mbg.generated
     */
    public String getcType() {
        return cType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_theme_class.c_type
     *
     * @param cType the value for t_theme_class.c_type
     *
     * @mbg.generated
     */
    public void setcType(String cType) {
        this.cType = cType == null ? null : cType.trim();
    }
}