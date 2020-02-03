package com.guo.technologyforum.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThemeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_theme
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_theme
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_theme
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme
     *
     * @mbg.generated
     */
    public ThemeExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_theme
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_theme
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andNIdIsNull() {
            addCriterion("n_id is null");
            return (Criteria) this;
        }

        public Criteria andNIdIsNotNull() {
            addCriterion("n_id is not null");
            return (Criteria) this;
        }

        public Criteria andNIdEqualTo(Long value) {
            addCriterion("n_id =", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotEqualTo(Long value) {
            addCriterion("n_id <>", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThan(Long value) {
            addCriterion("n_id >", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThanOrEqualTo(Long value) {
            addCriterion("n_id >=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThan(Long value) {
            addCriterion("n_id <", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThanOrEqualTo(Long value) {
            addCriterion("n_id <=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdIn(List<Long> values) {
            addCriterion("n_id in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotIn(List<Long> values) {
            addCriterion("n_id not in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdBetween(Long value1, Long value2) {
            addCriterion("n_id between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotBetween(Long value1, Long value2) {
            addCriterion("n_id not between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNUserIdIsNull() {
            addCriterion("n_user_id is null");
            return (Criteria) this;
        }

        public Criteria andNUserIdIsNotNull() {
            addCriterion("n_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andNUserIdEqualTo(Long value) {
            addCriterion("n_user_id =", value, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdNotEqualTo(Long value) {
            addCriterion("n_user_id <>", value, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdGreaterThan(Long value) {
            addCriterion("n_user_id >", value, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("n_user_id >=", value, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdLessThan(Long value) {
            addCriterion("n_user_id <", value, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdLessThanOrEqualTo(Long value) {
            addCriterion("n_user_id <=", value, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdIn(List<Long> values) {
            addCriterion("n_user_id in", values, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdNotIn(List<Long> values) {
            addCriterion("n_user_id not in", values, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdBetween(Long value1, Long value2) {
            addCriterion("n_user_id between", value1, value2, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdNotBetween(Long value1, Long value2) {
            addCriterion("n_user_id not between", value1, value2, "nUserId");
            return (Criteria) this;
        }

        public Criteria andCThemeTitleIsNull() {
            addCriterion("c_theme_title is null");
            return (Criteria) this;
        }

        public Criteria andCThemeTitleIsNotNull() {
            addCriterion("c_theme_title is not null");
            return (Criteria) this;
        }

        public Criteria andCThemeTitleEqualTo(String value) {
            addCriterion("c_theme_title =", value, "cThemeTitle");
            return (Criteria) this;
        }

        public Criteria andCThemeTitleNotEqualTo(String value) {
            addCriterion("c_theme_title <>", value, "cThemeTitle");
            return (Criteria) this;
        }

        public Criteria andCThemeTitleGreaterThan(String value) {
            addCriterion("c_theme_title >", value, "cThemeTitle");
            return (Criteria) this;
        }

        public Criteria andCThemeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("c_theme_title >=", value, "cThemeTitle");
            return (Criteria) this;
        }

        public Criteria andCThemeTitleLessThan(String value) {
            addCriterion("c_theme_title <", value, "cThemeTitle");
            return (Criteria) this;
        }

        public Criteria andCThemeTitleLessThanOrEqualTo(String value) {
            addCriterion("c_theme_title <=", value, "cThemeTitle");
            return (Criteria) this;
        }

        public Criteria andCThemeTitleLike(String value) {
            addCriterion("c_theme_title like", value, "cThemeTitle");
            return (Criteria) this;
        }

        public Criteria andCThemeTitleNotLike(String value) {
            addCriterion("c_theme_title not like", value, "cThemeTitle");
            return (Criteria) this;
        }

        public Criteria andCThemeTitleIn(List<String> values) {
            addCriterion("c_theme_title in", values, "cThemeTitle");
            return (Criteria) this;
        }

        public Criteria andCThemeTitleNotIn(List<String> values) {
            addCriterion("c_theme_title not in", values, "cThemeTitle");
            return (Criteria) this;
        }

        public Criteria andCThemeTitleBetween(String value1, String value2) {
            addCriterion("c_theme_title between", value1, value2, "cThemeTitle");
            return (Criteria) this;
        }

        public Criteria andCThemeTitleNotBetween(String value1, String value2) {
            addCriterion("c_theme_title not between", value1, value2, "cThemeTitle");
            return (Criteria) this;
        }

        public Criteria andCThemeContentIsNull() {
            addCriterion("c_theme_content is null");
            return (Criteria) this;
        }

        public Criteria andCThemeContentIsNotNull() {
            addCriterion("c_theme_content is not null");
            return (Criteria) this;
        }

        public Criteria andCThemeContentEqualTo(String value) {
            addCriterion("c_theme_content =", value, "cThemeContent");
            return (Criteria) this;
        }

        public Criteria andCThemeContentNotEqualTo(String value) {
            addCriterion("c_theme_content <>", value, "cThemeContent");
            return (Criteria) this;
        }

        public Criteria andCThemeContentGreaterThan(String value) {
            addCriterion("c_theme_content >", value, "cThemeContent");
            return (Criteria) this;
        }

        public Criteria andCThemeContentGreaterThanOrEqualTo(String value) {
            addCriterion("c_theme_content >=", value, "cThemeContent");
            return (Criteria) this;
        }

        public Criteria andCThemeContentLessThan(String value) {
            addCriterion("c_theme_content <", value, "cThemeContent");
            return (Criteria) this;
        }

        public Criteria andCThemeContentLessThanOrEqualTo(String value) {
            addCriterion("c_theme_content <=", value, "cThemeContent");
            return (Criteria) this;
        }

        public Criteria andCThemeContentLike(String value) {
            addCriterion("c_theme_content like", value, "cThemeContent");
            return (Criteria) this;
        }

        public Criteria andCThemeContentNotLike(String value) {
            addCriterion("c_theme_content not like", value, "cThemeContent");
            return (Criteria) this;
        }

        public Criteria andCThemeContentIn(List<String> values) {
            addCriterion("c_theme_content in", values, "cThemeContent");
            return (Criteria) this;
        }

        public Criteria andCThemeContentNotIn(List<String> values) {
            addCriterion("c_theme_content not in", values, "cThemeContent");
            return (Criteria) this;
        }

        public Criteria andCThemeContentBetween(String value1, String value2) {
            addCriterion("c_theme_content between", value1, value2, "cThemeContent");
            return (Criteria) this;
        }

        public Criteria andCThemeContentNotBetween(String value1, String value2) {
            addCriterion("c_theme_content not between", value1, value2, "cThemeContent");
            return (Criteria) this;
        }

        public Criteria andNThemeClassIsNull() {
            addCriterion("n_theme_class is null");
            return (Criteria) this;
        }

        public Criteria andNThemeClassIsNotNull() {
            addCriterion("n_theme_class is not null");
            return (Criteria) this;
        }

        public Criteria andNThemeClassEqualTo(Integer value) {
            addCriterion("n_theme_class =", value, "nThemeClass");
            return (Criteria) this;
        }

        public Criteria andNThemeClassNotEqualTo(Integer value) {
            addCriterion("n_theme_class <>", value, "nThemeClass");
            return (Criteria) this;
        }

        public Criteria andNThemeClassGreaterThan(Integer value) {
            addCriterion("n_theme_class >", value, "nThemeClass");
            return (Criteria) this;
        }

        public Criteria andNThemeClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_theme_class >=", value, "nThemeClass");
            return (Criteria) this;
        }

        public Criteria andNThemeClassLessThan(Integer value) {
            addCriterion("n_theme_class <", value, "nThemeClass");
            return (Criteria) this;
        }

        public Criteria andNThemeClassLessThanOrEqualTo(Integer value) {
            addCriterion("n_theme_class <=", value, "nThemeClass");
            return (Criteria) this;
        }

        public Criteria andNThemeClassIn(List<Integer> values) {
            addCriterion("n_theme_class in", values, "nThemeClass");
            return (Criteria) this;
        }

        public Criteria andNThemeClassNotIn(List<Integer> values) {
            addCriterion("n_theme_class not in", values, "nThemeClass");
            return (Criteria) this;
        }

        public Criteria andNThemeClassBetween(Integer value1, Integer value2) {
            addCriterion("n_theme_class between", value1, value2, "nThemeClass");
            return (Criteria) this;
        }

        public Criteria andNThemeClassNotBetween(Integer value1, Integer value2) {
            addCriterion("n_theme_class not between", value1, value2, "nThemeClass");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeIsNull() {
            addCriterion("d_create_time is null");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeIsNotNull() {
            addCriterion("d_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeEqualTo(Date value) {
            addCriterion("d_create_time =", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeNotEqualTo(Date value) {
            addCriterion("d_create_time <>", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeGreaterThan(Date value) {
            addCriterion("d_create_time >", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("d_create_time >=", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeLessThan(Date value) {
            addCriterion("d_create_time <", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("d_create_time <=", value, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeIn(List<Date> values) {
            addCriterion("d_create_time in", values, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeNotIn(List<Date> values) {
            addCriterion("d_create_time not in", values, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeBetween(Date value1, Date value2) {
            addCriterion("d_create_time between", value1, value2, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("d_create_time not between", value1, value2, "dCreateTime");
            return (Criteria) this;
        }

        public Criteria andDLastupdateTimeIsNull() {
            addCriterion("d_lastupdate_time is null");
            return (Criteria) this;
        }

        public Criteria andDLastupdateTimeIsNotNull() {
            addCriterion("d_lastupdate_time is not null");
            return (Criteria) this;
        }

        public Criteria andDLastupdateTimeEqualTo(Date value) {
            addCriterion("d_lastupdate_time =", value, "dLastupdateTime");
            return (Criteria) this;
        }

        public Criteria andDLastupdateTimeNotEqualTo(Date value) {
            addCriterion("d_lastupdate_time <>", value, "dLastupdateTime");
            return (Criteria) this;
        }

        public Criteria andDLastupdateTimeGreaterThan(Date value) {
            addCriterion("d_lastupdate_time >", value, "dLastupdateTime");
            return (Criteria) this;
        }

        public Criteria andDLastupdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("d_lastupdate_time >=", value, "dLastupdateTime");
            return (Criteria) this;
        }

        public Criteria andDLastupdateTimeLessThan(Date value) {
            addCriterion("d_lastupdate_time <", value, "dLastupdateTime");
            return (Criteria) this;
        }

        public Criteria andDLastupdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("d_lastupdate_time <=", value, "dLastupdateTime");
            return (Criteria) this;
        }

        public Criteria andDLastupdateTimeIn(List<Date> values) {
            addCriterion("d_lastupdate_time in", values, "dLastupdateTime");
            return (Criteria) this;
        }

        public Criteria andDLastupdateTimeNotIn(List<Date> values) {
            addCriterion("d_lastupdate_time not in", values, "dLastupdateTime");
            return (Criteria) this;
        }

        public Criteria andDLastupdateTimeBetween(Date value1, Date value2) {
            addCriterion("d_lastupdate_time between", value1, value2, "dLastupdateTime");
            return (Criteria) this;
        }

        public Criteria andDLastupdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("d_lastupdate_time not between", value1, value2, "dLastupdateTime");
            return (Criteria) this;
        }

        public Criteria andNClickIsNull() {
            addCriterion("n_click is null");
            return (Criteria) this;
        }

        public Criteria andNClickIsNotNull() {
            addCriterion("n_click is not null");
            return (Criteria) this;
        }

        public Criteria andNClickEqualTo(Long value) {
            addCriterion("n_click =", value, "nClick");
            return (Criteria) this;
        }

        public Criteria andNClickNotEqualTo(Long value) {
            addCriterion("n_click <>", value, "nClick");
            return (Criteria) this;
        }

        public Criteria andNClickGreaterThan(Long value) {
            addCriterion("n_click >", value, "nClick");
            return (Criteria) this;
        }

        public Criteria andNClickGreaterThanOrEqualTo(Long value) {
            addCriterion("n_click >=", value, "nClick");
            return (Criteria) this;
        }

        public Criteria andNClickLessThan(Long value) {
            addCriterion("n_click <", value, "nClick");
            return (Criteria) this;
        }

        public Criteria andNClickLessThanOrEqualTo(Long value) {
            addCriterion("n_click <=", value, "nClick");
            return (Criteria) this;
        }

        public Criteria andNClickIn(List<Long> values) {
            addCriterion("n_click in", values, "nClick");
            return (Criteria) this;
        }

        public Criteria andNClickNotIn(List<Long> values) {
            addCriterion("n_click not in", values, "nClick");
            return (Criteria) this;
        }

        public Criteria andNClickBetween(Long value1, Long value2) {
            addCriterion("n_click between", value1, value2, "nClick");
            return (Criteria) this;
        }

        public Criteria andNClickNotBetween(Long value1, Long value2) {
            addCriterion("n_click not between", value1, value2, "nClick");
            return (Criteria) this;
        }

        public Criteria andNThemeStatusIsNull() {
            addCriterion("n_theme_status is null");
            return (Criteria) this;
        }

        public Criteria andNThemeStatusIsNotNull() {
            addCriterion("n_theme_status is not null");
            return (Criteria) this;
        }

        public Criteria andNThemeStatusEqualTo(Integer value) {
            addCriterion("n_theme_status =", value, "nThemeStatus");
            return (Criteria) this;
        }

        public Criteria andNThemeStatusNotEqualTo(Integer value) {
            addCriterion("n_theme_status <>", value, "nThemeStatus");
            return (Criteria) this;
        }

        public Criteria andNThemeStatusGreaterThan(Integer value) {
            addCriterion("n_theme_status >", value, "nThemeStatus");
            return (Criteria) this;
        }

        public Criteria andNThemeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_theme_status >=", value, "nThemeStatus");
            return (Criteria) this;
        }

        public Criteria andNThemeStatusLessThan(Integer value) {
            addCriterion("n_theme_status <", value, "nThemeStatus");
            return (Criteria) this;
        }

        public Criteria andNThemeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("n_theme_status <=", value, "nThemeStatus");
            return (Criteria) this;
        }

        public Criteria andNThemeStatusIn(List<Integer> values) {
            addCriterion("n_theme_status in", values, "nThemeStatus");
            return (Criteria) this;
        }

        public Criteria andNThemeStatusNotIn(List<Integer> values) {
            addCriterion("n_theme_status not in", values, "nThemeStatus");
            return (Criteria) this;
        }

        public Criteria andNThemeStatusBetween(Integer value1, Integer value2) {
            addCriterion("n_theme_status between", value1, value2, "nThemeStatus");
            return (Criteria) this;
        }

        public Criteria andNThemeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("n_theme_status not between", value1, value2, "nThemeStatus");
            return (Criteria) this;
        }

        public Criteria andNKeepCountIsNull() {
            addCriterion("n_keep_count is null");
            return (Criteria) this;
        }

        public Criteria andNKeepCountIsNotNull() {
            addCriterion("n_keep_count is not null");
            return (Criteria) this;
        }

        public Criteria andNKeepCountEqualTo(Integer value) {
            addCriterion("n_keep_count =", value, "nKeepCount");
            return (Criteria) this;
        }

        public Criteria andNKeepCountNotEqualTo(Integer value) {
            addCriterion("n_keep_count <>", value, "nKeepCount");
            return (Criteria) this;
        }

        public Criteria andNKeepCountGreaterThan(Integer value) {
            addCriterion("n_keep_count >", value, "nKeepCount");
            return (Criteria) this;
        }

        public Criteria andNKeepCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_keep_count >=", value, "nKeepCount");
            return (Criteria) this;
        }

        public Criteria andNKeepCountLessThan(Integer value) {
            addCriterion("n_keep_count <", value, "nKeepCount");
            return (Criteria) this;
        }

        public Criteria andNKeepCountLessThanOrEqualTo(Integer value) {
            addCriterion("n_keep_count <=", value, "nKeepCount");
            return (Criteria) this;
        }

        public Criteria andNKeepCountIn(List<Integer> values) {
            addCriterion("n_keep_count in", values, "nKeepCount");
            return (Criteria) this;
        }

        public Criteria andNKeepCountNotIn(List<Integer> values) {
            addCriterion("n_keep_count not in", values, "nKeepCount");
            return (Criteria) this;
        }

        public Criteria andNKeepCountBetween(Integer value1, Integer value2) {
            addCriterion("n_keep_count between", value1, value2, "nKeepCount");
            return (Criteria) this;
        }

        public Criteria andNKeepCountNotBetween(Integer value1, Integer value2) {
            addCriterion("n_keep_count not between", value1, value2, "nKeepCount");
            return (Criteria) this;
        }

        public Criteria andNLikeIsNull() {
            addCriterion("n_like is null");
            return (Criteria) this;
        }

        public Criteria andNLikeIsNotNull() {
            addCriterion("n_like is not null");
            return (Criteria) this;
        }

        public Criteria andNLikeEqualTo(Integer value) {
            addCriterion("n_like =", value, "nLike");
            return (Criteria) this;
        }

        public Criteria andNLikeNotEqualTo(Integer value) {
            addCriterion("n_like <>", value, "nLike");
            return (Criteria) this;
        }

        public Criteria andNLikeGreaterThan(Integer value) {
            addCriterion("n_like >", value, "nLike");
            return (Criteria) this;
        }

        public Criteria andNLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_like >=", value, "nLike");
            return (Criteria) this;
        }

        public Criteria andNLikeLessThan(Integer value) {
            addCriterion("n_like <", value, "nLike");
            return (Criteria) this;
        }

        public Criteria andNLikeLessThanOrEqualTo(Integer value) {
            addCriterion("n_like <=", value, "nLike");
            return (Criteria) this;
        }

        public Criteria andNLikeIn(List<Integer> values) {
            addCriterion("n_like in", values, "nLike");
            return (Criteria) this;
        }

        public Criteria andNLikeNotIn(List<Integer> values) {
            addCriterion("n_like not in", values, "nLike");
            return (Criteria) this;
        }

        public Criteria andNLikeBetween(Integer value1, Integer value2) {
            addCriterion("n_like between", value1, value2, "nLike");
            return (Criteria) this;
        }

        public Criteria andNLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("n_like not between", value1, value2, "nLike");
            return (Criteria) this;
        }

        public Criteria andNDislikeIsNull() {
            addCriterion("n_dislike is null");
            return (Criteria) this;
        }

        public Criteria andNDislikeIsNotNull() {
            addCriterion("n_dislike is not null");
            return (Criteria) this;
        }

        public Criteria andNDislikeEqualTo(Integer value) {
            addCriterion("n_dislike =", value, "nDislike");
            return (Criteria) this;
        }

        public Criteria andNDislikeNotEqualTo(Integer value) {
            addCriterion("n_dislike <>", value, "nDislike");
            return (Criteria) this;
        }

        public Criteria andNDislikeGreaterThan(Integer value) {
            addCriterion("n_dislike >", value, "nDislike");
            return (Criteria) this;
        }

        public Criteria andNDislikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_dislike >=", value, "nDislike");
            return (Criteria) this;
        }

        public Criteria andNDislikeLessThan(Integer value) {
            addCriterion("n_dislike <", value, "nDislike");
            return (Criteria) this;
        }

        public Criteria andNDislikeLessThanOrEqualTo(Integer value) {
            addCriterion("n_dislike <=", value, "nDislike");
            return (Criteria) this;
        }

        public Criteria andNDislikeIn(List<Integer> values) {
            addCriterion("n_dislike in", values, "nDislike");
            return (Criteria) this;
        }

        public Criteria andNDislikeNotIn(List<Integer> values) {
            addCriterion("n_dislike not in", values, "nDislike");
            return (Criteria) this;
        }

        public Criteria andNDislikeBetween(Integer value1, Integer value2) {
            addCriterion("n_dislike between", value1, value2, "nDislike");
            return (Criteria) this;
        }

        public Criteria andNDislikeNotBetween(Integer value1, Integer value2) {
            addCriterion("n_dislike not between", value1, value2, "nDislike");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_theme
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_theme
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}