package com.guo.technologyforum.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Role_rightExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    public Role_rightExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
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
     * This method corresponds to the database table t_role_right
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
     * This method corresponds to the database table t_role_right
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_right
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
     * This class corresponds to the database table t_role_right
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

        public Criteria andNIdEqualTo(Integer value) {
            addCriterion("n_id =", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotEqualTo(Integer value) {
            addCriterion("n_id <>", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThan(Integer value) {
            addCriterion("n_id >", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_id >=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThan(Integer value) {
            addCriterion("n_id <", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_id <=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdIn(List<Integer> values) {
            addCriterion("n_id in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotIn(List<Integer> values) {
            addCriterion("n_id not in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdBetween(Integer value1, Integer value2) {
            addCriterion("n_id between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_id not between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdIsNull() {
            addCriterion("n_role_id is null");
            return (Criteria) this;
        }

        public Criteria andNRoleIdIsNotNull() {
            addCriterion("n_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andNRoleIdEqualTo(Integer value) {
            addCriterion("n_role_id =", value, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdNotEqualTo(Integer value) {
            addCriterion("n_role_id <>", value, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdGreaterThan(Integer value) {
            addCriterion("n_role_id >", value, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_role_id >=", value, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdLessThan(Integer value) {
            addCriterion("n_role_id <", value, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_role_id <=", value, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdIn(List<Integer> values) {
            addCriterion("n_role_id in", values, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdNotIn(List<Integer> values) {
            addCriterion("n_role_id not in", values, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("n_role_id between", value1, value2, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_role_id not between", value1, value2, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRightIdIsNull() {
            addCriterion("n_right_id is null");
            return (Criteria) this;
        }

        public Criteria andNRightIdIsNotNull() {
            addCriterion("n_right_id is not null");
            return (Criteria) this;
        }

        public Criteria andNRightIdEqualTo(Integer value) {
            addCriterion("n_right_id =", value, "nRightId");
            return (Criteria) this;
        }

        public Criteria andNRightIdNotEqualTo(Integer value) {
            addCriterion("n_right_id <>", value, "nRightId");
            return (Criteria) this;
        }

        public Criteria andNRightIdGreaterThan(Integer value) {
            addCriterion("n_right_id >", value, "nRightId");
            return (Criteria) this;
        }

        public Criteria andNRightIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_right_id >=", value, "nRightId");
            return (Criteria) this;
        }

        public Criteria andNRightIdLessThan(Integer value) {
            addCriterion("n_right_id <", value, "nRightId");
            return (Criteria) this;
        }

        public Criteria andNRightIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_right_id <=", value, "nRightId");
            return (Criteria) this;
        }

        public Criteria andNRightIdIn(List<Integer> values) {
            addCriterion("n_right_id in", values, "nRightId");
            return (Criteria) this;
        }

        public Criteria andNRightIdNotIn(List<Integer> values) {
            addCriterion("n_right_id not in", values, "nRightId");
            return (Criteria) this;
        }

        public Criteria andNRightIdBetween(Integer value1, Integer value2) {
            addCriterion("n_right_id between", value1, value2, "nRightId");
            return (Criteria) this;
        }

        public Criteria andNRightIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_right_id not between", value1, value2, "nRightId");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_role_right
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
     * This class corresponds to the database table t_role_right
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