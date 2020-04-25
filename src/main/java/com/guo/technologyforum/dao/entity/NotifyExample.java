package com.guo.technologyforum.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotifyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_notify
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_notify
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_notify
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notify
     *
     * @mbg.generated
     */
    public NotifyExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notify
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notify
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notify
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notify
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notify
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notify
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notify
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
     * This method corresponds to the database table t_notify
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
     * This method corresponds to the database table t_notify
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_notify
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
     * This class corresponds to the database table t_notify
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

        public Criteria andNSendUserIdIsNull() {
            addCriterion("n_send_user_id is null");
            return (Criteria) this;
        }

        public Criteria andNSendUserIdIsNotNull() {
            addCriterion("n_send_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andNSendUserIdEqualTo(Long value) {
            addCriterion("n_send_user_id =", value, "nSendUserId");
            return (Criteria) this;
        }

        public Criteria andNSendUserIdNotEqualTo(Long value) {
            addCriterion("n_send_user_id <>", value, "nSendUserId");
            return (Criteria) this;
        }

        public Criteria andNSendUserIdGreaterThan(Long value) {
            addCriterion("n_send_user_id >", value, "nSendUserId");
            return (Criteria) this;
        }

        public Criteria andNSendUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("n_send_user_id >=", value, "nSendUserId");
            return (Criteria) this;
        }

        public Criteria andNSendUserIdLessThan(Long value) {
            addCriterion("n_send_user_id <", value, "nSendUserId");
            return (Criteria) this;
        }

        public Criteria andNSendUserIdLessThanOrEqualTo(Long value) {
            addCriterion("n_send_user_id <=", value, "nSendUserId");
            return (Criteria) this;
        }

        public Criteria andNSendUserIdIn(List<Long> values) {
            addCriterion("n_send_user_id in", values, "nSendUserId");
            return (Criteria) this;
        }

        public Criteria andNSendUserIdNotIn(List<Long> values) {
            addCriterion("n_send_user_id not in", values, "nSendUserId");
            return (Criteria) this;
        }

        public Criteria andNSendUserIdBetween(Long value1, Long value2) {
            addCriterion("n_send_user_id between", value1, value2, "nSendUserId");
            return (Criteria) this;
        }

        public Criteria andNSendUserIdNotBetween(Long value1, Long value2) {
            addCriterion("n_send_user_id not between", value1, value2, "nSendUserId");
            return (Criteria) this;
        }

        public Criteria andNNotifyTypeIsNull() {
            addCriterion("n_notify_type is null");
            return (Criteria) this;
        }

        public Criteria andNNotifyTypeIsNotNull() {
            addCriterion("n_notify_type is not null");
            return (Criteria) this;
        }

        public Criteria andNNotifyTypeEqualTo(Integer value) {
            addCriterion("n_notify_type =", value, "nNotifyType");
            return (Criteria) this;
        }

        public Criteria andNNotifyTypeNotEqualTo(Integer value) {
            addCriterion("n_notify_type <>", value, "nNotifyType");
            return (Criteria) this;
        }

        public Criteria andNNotifyTypeGreaterThan(Integer value) {
            addCriterion("n_notify_type >", value, "nNotifyType");
            return (Criteria) this;
        }

        public Criteria andNNotifyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_notify_type >=", value, "nNotifyType");
            return (Criteria) this;
        }

        public Criteria andNNotifyTypeLessThan(Integer value) {
            addCriterion("n_notify_type <", value, "nNotifyType");
            return (Criteria) this;
        }

        public Criteria andNNotifyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("n_notify_type <=", value, "nNotifyType");
            return (Criteria) this;
        }

        public Criteria andNNotifyTypeIn(List<Integer> values) {
            addCriterion("n_notify_type in", values, "nNotifyType");
            return (Criteria) this;
        }

        public Criteria andNNotifyTypeNotIn(List<Integer> values) {
            addCriterion("n_notify_type not in", values, "nNotifyType");
            return (Criteria) this;
        }

        public Criteria andNNotifyTypeBetween(Integer value1, Integer value2) {
            addCriterion("n_notify_type between", value1, value2, "nNotifyType");
            return (Criteria) this;
        }

        public Criteria andNNotifyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("n_notify_type not between", value1, value2, "nNotifyType");
            return (Criteria) this;
        }

        public Criteria andNReceiveUserIdIsNull() {
            addCriterion("n_receive_user_id is null");
            return (Criteria) this;
        }

        public Criteria andNReceiveUserIdIsNotNull() {
            addCriterion("n_receive_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andNReceiveUserIdEqualTo(Long value) {
            addCriterion("n_receive_user_id =", value, "nReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andNReceiveUserIdNotEqualTo(Long value) {
            addCriterion("n_receive_user_id <>", value, "nReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andNReceiveUserIdGreaterThan(Long value) {
            addCriterion("n_receive_user_id >", value, "nReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andNReceiveUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("n_receive_user_id >=", value, "nReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andNReceiveUserIdLessThan(Long value) {
            addCriterion("n_receive_user_id <", value, "nReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andNReceiveUserIdLessThanOrEqualTo(Long value) {
            addCriterion("n_receive_user_id <=", value, "nReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andNReceiveUserIdIn(List<Long> values) {
            addCriterion("n_receive_user_id in", values, "nReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andNReceiveUserIdNotIn(List<Long> values) {
            addCriterion("n_receive_user_id not in", values, "nReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andNReceiveUserIdBetween(Long value1, Long value2) {
            addCriterion("n_receive_user_id between", value1, value2, "nReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andNReceiveUserIdNotBetween(Long value1, Long value2) {
            addCriterion("n_receive_user_id not between", value1, value2, "nReceiveUserId");
            return (Criteria) this;
        }

        public Criteria andBStatusIsNull() {
            addCriterion("b_status is null");
            return (Criteria) this;
        }

        public Criteria andBStatusIsNotNull() {
            addCriterion("b_status is not null");
            return (Criteria) this;
        }

        public Criteria andBStatusEqualTo(Boolean value) {
            addCriterion("b_status =", value, "bStatus");
            return (Criteria) this;
        }

        public Criteria andBStatusNotEqualTo(Boolean value) {
            addCriterion("b_status <>", value, "bStatus");
            return (Criteria) this;
        }

        public Criteria andBStatusGreaterThan(Boolean value) {
            addCriterion("b_status >", value, "bStatus");
            return (Criteria) this;
        }

        public Criteria andBStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("b_status >=", value, "bStatus");
            return (Criteria) this;
        }

        public Criteria andBStatusLessThan(Boolean value) {
            addCriterion("b_status <", value, "bStatus");
            return (Criteria) this;
        }

        public Criteria andBStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("b_status <=", value, "bStatus");
            return (Criteria) this;
        }

        public Criteria andBStatusIn(List<Boolean> values) {
            addCriterion("b_status in", values, "bStatus");
            return (Criteria) this;
        }

        public Criteria andBStatusNotIn(List<Boolean> values) {
            addCriterion("b_status not in", values, "bStatus");
            return (Criteria) this;
        }

        public Criteria andBStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("b_status between", value1, value2, "bStatus");
            return (Criteria) this;
        }

        public Criteria andBStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("b_status not between", value1, value2, "bStatus");
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

        public Criteria andDReadTimeIsNull() {
            addCriterion("d_read_time is null");
            return (Criteria) this;
        }

        public Criteria andDReadTimeIsNotNull() {
            addCriterion("d_read_time is not null");
            return (Criteria) this;
        }

        public Criteria andDReadTimeEqualTo(Date value) {
            addCriterion("d_read_time =", value, "dReadTime");
            return (Criteria) this;
        }

        public Criteria andDReadTimeNotEqualTo(Date value) {
            addCriterion("d_read_time <>", value, "dReadTime");
            return (Criteria) this;
        }

        public Criteria andDReadTimeGreaterThan(Date value) {
            addCriterion("d_read_time >", value, "dReadTime");
            return (Criteria) this;
        }

        public Criteria andDReadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("d_read_time >=", value, "dReadTime");
            return (Criteria) this;
        }

        public Criteria andDReadTimeLessThan(Date value) {
            addCriterion("d_read_time <", value, "dReadTime");
            return (Criteria) this;
        }

        public Criteria andDReadTimeLessThanOrEqualTo(Date value) {
            addCriterion("d_read_time <=", value, "dReadTime");
            return (Criteria) this;
        }

        public Criteria andDReadTimeIn(List<Date> values) {
            addCriterion("d_read_time in", values, "dReadTime");
            return (Criteria) this;
        }

        public Criteria andDReadTimeNotIn(List<Date> values) {
            addCriterion("d_read_time not in", values, "dReadTime");
            return (Criteria) this;
        }

        public Criteria andDReadTimeBetween(Date value1, Date value2) {
            addCriterion("d_read_time between", value1, value2, "dReadTime");
            return (Criteria) this;
        }

        public Criteria andDReadTimeNotBetween(Date value1, Date value2) {
            addCriterion("d_read_time not between", value1, value2, "dReadTime");
            return (Criteria) this;
        }

        public Criteria andCMessageIsNull() {
            addCriterion("c_message is null");
            return (Criteria) this;
        }

        public Criteria andCMessageIsNotNull() {
            addCriterion("c_message is not null");
            return (Criteria) this;
        }

        public Criteria andCMessageEqualTo(String value) {
            addCriterion("c_message =", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageNotEqualTo(String value) {
            addCriterion("c_message <>", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageGreaterThan(String value) {
            addCriterion("c_message >", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageGreaterThanOrEqualTo(String value) {
            addCriterion("c_message >=", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageLessThan(String value) {
            addCriterion("c_message <", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageLessThanOrEqualTo(String value) {
            addCriterion("c_message <=", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageLike(String value) {
            addCriterion("c_message like", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageNotLike(String value) {
            addCriterion("c_message not like", value, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageIn(List<String> values) {
            addCriterion("c_message in", values, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageNotIn(List<String> values) {
            addCriterion("c_message not in", values, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageBetween(String value1, String value2) {
            addCriterion("c_message between", value1, value2, "cMessage");
            return (Criteria) this;
        }

        public Criteria andCMessageNotBetween(String value1, String value2) {
            addCriterion("c_message not between", value1, value2, "cMessage");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_notify
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
     * This class corresponds to the database table t_notify
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