package com.guo.technologyforum.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KeepExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    public KeepExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
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
     * This method corresponds to the database table t_keep
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
     * This method corresponds to the database table t_keep
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_keep
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
     * This class corresponds to the database table t_keep
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

        public Criteria andNThemeIdIsNull() {
            addCriterion("n_theme_id is null");
            return (Criteria) this;
        }

        public Criteria andNThemeIdIsNotNull() {
            addCriterion("n_theme_id is not null");
            return (Criteria) this;
        }

        public Criteria andNThemeIdEqualTo(Long value) {
            addCriterion("n_theme_id =", value, "nThemeId");
            return (Criteria) this;
        }

        public Criteria andNThemeIdNotEqualTo(Long value) {
            addCriterion("n_theme_id <>", value, "nThemeId");
            return (Criteria) this;
        }

        public Criteria andNThemeIdGreaterThan(Long value) {
            addCriterion("n_theme_id >", value, "nThemeId");
            return (Criteria) this;
        }

        public Criteria andNThemeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("n_theme_id >=", value, "nThemeId");
            return (Criteria) this;
        }

        public Criteria andNThemeIdLessThan(Long value) {
            addCriterion("n_theme_id <", value, "nThemeId");
            return (Criteria) this;
        }

        public Criteria andNThemeIdLessThanOrEqualTo(Long value) {
            addCriterion("n_theme_id <=", value, "nThemeId");
            return (Criteria) this;
        }

        public Criteria andNThemeIdIn(List<Long> values) {
            addCriterion("n_theme_id in", values, "nThemeId");
            return (Criteria) this;
        }

        public Criteria andNThemeIdNotIn(List<Long> values) {
            addCriterion("n_theme_id not in", values, "nThemeId");
            return (Criteria) this;
        }

        public Criteria andNThemeIdBetween(Long value1, Long value2) {
            addCriterion("n_theme_id between", value1, value2, "nThemeId");
            return (Criteria) this;
        }

        public Criteria andNThemeIdNotBetween(Long value1, Long value2) {
            addCriterion("n_theme_id not between", value1, value2, "nThemeId");
            return (Criteria) this;
        }

        public Criteria andNTypeIsNull() {
            addCriterion("n_type is null");
            return (Criteria) this;
        }

        public Criteria andNTypeIsNotNull() {
            addCriterion("n_type is not null");
            return (Criteria) this;
        }

        public Criteria andNTypeEqualTo(Integer value) {
            addCriterion("n_type =", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeNotEqualTo(Integer value) {
            addCriterion("n_type <>", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeGreaterThan(Integer value) {
            addCriterion("n_type >", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_type >=", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeLessThan(Integer value) {
            addCriterion("n_type <", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeLessThanOrEqualTo(Integer value) {
            addCriterion("n_type <=", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeIn(List<Integer> values) {
            addCriterion("n_type in", values, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeNotIn(List<Integer> values) {
            addCriterion("n_type not in", values, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeBetween(Integer value1, Integer value2) {
            addCriterion("n_type between", value1, value2, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("n_type not between", value1, value2, "nType");
            return (Criteria) this;
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(String value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(String value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(String value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(String value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(String value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(String value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLike(String value) {
            addCriterion("c_id like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotLike(String value) {
            addCriterion("c_id not like", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<String> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<String> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(String value1, String value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(String value1, String value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andDKeepTimeIsNull() {
            addCriterion("d_keep_time is null");
            return (Criteria) this;
        }

        public Criteria andDKeepTimeIsNotNull() {
            addCriterion("d_keep_time is not null");
            return (Criteria) this;
        }

        public Criteria andDKeepTimeEqualTo(Date value) {
            addCriterion("d_keep_time =", value, "dKeepTime");
            return (Criteria) this;
        }

        public Criteria andDKeepTimeNotEqualTo(Date value) {
            addCriterion("d_keep_time <>", value, "dKeepTime");
            return (Criteria) this;
        }

        public Criteria andDKeepTimeGreaterThan(Date value) {
            addCriterion("d_keep_time >", value, "dKeepTime");
            return (Criteria) this;
        }

        public Criteria andDKeepTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("d_keep_time >=", value, "dKeepTime");
            return (Criteria) this;
        }

        public Criteria andDKeepTimeLessThan(Date value) {
            addCriterion("d_keep_time <", value, "dKeepTime");
            return (Criteria) this;
        }

        public Criteria andDKeepTimeLessThanOrEqualTo(Date value) {
            addCriterion("d_keep_time <=", value, "dKeepTime");
            return (Criteria) this;
        }

        public Criteria andDKeepTimeIn(List<Date> values) {
            addCriterion("d_keep_time in", values, "dKeepTime");
            return (Criteria) this;
        }

        public Criteria andDKeepTimeNotIn(List<Date> values) {
            addCriterion("d_keep_time not in", values, "dKeepTime");
            return (Criteria) this;
        }

        public Criteria andDKeepTimeBetween(Date value1, Date value2) {
            addCriterion("d_keep_time between", value1, value2, "dKeepTime");
            return (Criteria) this;
        }

        public Criteria andDKeepTimeNotBetween(Date value1, Date value2) {
            addCriterion("d_keep_time not between", value1, value2, "dKeepTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_keep
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
     * This class corresponds to the database table t_keep
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