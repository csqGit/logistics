package com.ldxy.entity;

import java.util.ArrayList;
import java.util.List;

public class ComplainExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    public ComplainExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
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
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andComplainManIsNull() {
            addCriterion("complain_man is null");
            return (Criteria) this;
        }

        public Criteria andComplainManIsNotNull() {
            addCriterion("complain_man is not null");
            return (Criteria) this;
        }

        public Criteria andComplainManEqualTo(String value) {
            addCriterion("complain_man =", value, "complainMan");
            return (Criteria) this;
        }

        public Criteria andComplainManNotEqualTo(String value) {
            addCriterion("complain_man <>", value, "complainMan");
            return (Criteria) this;
        }

        public Criteria andComplainManGreaterThan(String value) {
            addCriterion("complain_man >", value, "complainMan");
            return (Criteria) this;
        }

        public Criteria andComplainManGreaterThanOrEqualTo(String value) {
            addCriterion("complain_man >=", value, "complainMan");
            return (Criteria) this;
        }

        public Criteria andComplainManLessThan(String value) {
            addCriterion("complain_man <", value, "complainMan");
            return (Criteria) this;
        }

        public Criteria andComplainManLessThanOrEqualTo(String value) {
            addCriterion("complain_man <=", value, "complainMan");
            return (Criteria) this;
        }

        public Criteria andComplainManLike(String value) {
            addCriterion("complain_man like", value, "complainMan");
            return (Criteria) this;
        }

        public Criteria andComplainManNotLike(String value) {
            addCriterion("complain_man not like", value, "complainMan");
            return (Criteria) this;
        }

        public Criteria andComplainManIn(List<String> values) {
            addCriterion("complain_man in", values, "complainMan");
            return (Criteria) this;
        }

        public Criteria andComplainManNotIn(List<String> values) {
            addCriterion("complain_man not in", values, "complainMan");
            return (Criteria) this;
        }

        public Criteria andComplainManBetween(String value1, String value2) {
            addCriterion("complain_man between", value1, value2, "complainMan");
            return (Criteria) this;
        }

        public Criteria andComplainManNotBetween(String value1, String value2) {
            addCriterion("complain_man not between", value1, value2, "complainMan");
            return (Criteria) this;
        }

        public Criteria andComplainReasonIsNull() {
            addCriterion("complain_reason is null");
            return (Criteria) this;
        }

        public Criteria andComplainReasonIsNotNull() {
            addCriterion("complain_reason is not null");
            return (Criteria) this;
        }

        public Criteria andComplainReasonEqualTo(String value) {
            addCriterion("complain_reason =", value, "complainReason");
            return (Criteria) this;
        }

        public Criteria andComplainReasonNotEqualTo(String value) {
            addCriterion("complain_reason <>", value, "complainReason");
            return (Criteria) this;
        }

        public Criteria andComplainReasonGreaterThan(String value) {
            addCriterion("complain_reason >", value, "complainReason");
            return (Criteria) this;
        }

        public Criteria andComplainReasonGreaterThanOrEqualTo(String value) {
            addCriterion("complain_reason >=", value, "complainReason");
            return (Criteria) this;
        }

        public Criteria andComplainReasonLessThan(String value) {
            addCriterion("complain_reason <", value, "complainReason");
            return (Criteria) this;
        }

        public Criteria andComplainReasonLessThanOrEqualTo(String value) {
            addCriterion("complain_reason <=", value, "complainReason");
            return (Criteria) this;
        }

        public Criteria andComplainReasonLike(String value) {
            addCriterion("complain_reason like", value, "complainReason");
            return (Criteria) this;
        }

        public Criteria andComplainReasonNotLike(String value) {
            addCriterion("complain_reason not like", value, "complainReason");
            return (Criteria) this;
        }

        public Criteria andComplainReasonIn(List<String> values) {
            addCriterion("complain_reason in", values, "complainReason");
            return (Criteria) this;
        }

        public Criteria andComplainReasonNotIn(List<String> values) {
            addCriterion("complain_reason not in", values, "complainReason");
            return (Criteria) this;
        }

        public Criteria andComplainReasonBetween(String value1, String value2) {
            addCriterion("complain_reason between", value1, value2, "complainReason");
            return (Criteria) this;
        }

        public Criteria andComplainReasonNotBetween(String value1, String value2) {
            addCriterion("complain_reason not between", value1, value2, "complainReason");
            return (Criteria) this;
        }

        public Criteria andComplainCompanyIsNull() {
            addCriterion("complain_company is null");
            return (Criteria) this;
        }

        public Criteria andComplainCompanyIsNotNull() {
            addCriterion("complain_company is not null");
            return (Criteria) this;
        }

        public Criteria andComplainCompanyEqualTo(String value) {
            addCriterion("complain_company =", value, "complainCompany");
            return (Criteria) this;
        }

        public Criteria andComplainCompanyNotEqualTo(String value) {
            addCriterion("complain_company <>", value, "complainCompany");
            return (Criteria) this;
        }

        public Criteria andComplainCompanyGreaterThan(String value) {
            addCriterion("complain_company >", value, "complainCompany");
            return (Criteria) this;
        }

        public Criteria andComplainCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("complain_company >=", value, "complainCompany");
            return (Criteria) this;
        }

        public Criteria andComplainCompanyLessThan(String value) {
            addCriterion("complain_company <", value, "complainCompany");
            return (Criteria) this;
        }

        public Criteria andComplainCompanyLessThanOrEqualTo(String value) {
            addCriterion("complain_company <=", value, "complainCompany");
            return (Criteria) this;
        }

        public Criteria andComplainCompanyLike(String value) {
            addCriterion("complain_company like", value, "complainCompany");
            return (Criteria) this;
        }

        public Criteria andComplainCompanyNotLike(String value) {
            addCriterion("complain_company not like", value, "complainCompany");
            return (Criteria) this;
        }

        public Criteria andComplainCompanyIn(List<String> values) {
            addCriterion("complain_company in", values, "complainCompany");
            return (Criteria) this;
        }

        public Criteria andComplainCompanyNotIn(List<String> values) {
            addCriterion("complain_company not in", values, "complainCompany");
            return (Criteria) this;
        }

        public Criteria andComplainCompanyBetween(String value1, String value2) {
            addCriterion("complain_company between", value1, value2, "complainCompany");
            return (Criteria) this;
        }

        public Criteria andComplainCompanyNotBetween(String value1, String value2) {
            addCriterion("complain_company not between", value1, value2, "complainCompany");
            return (Criteria) this;
        }

        public Criteria andComplainTypeIsNull() {
            addCriterion("complain_type is null");
            return (Criteria) this;
        }

        public Criteria andComplainTypeIsNotNull() {
            addCriterion("complain_type is not null");
            return (Criteria) this;
        }

        public Criteria andComplainTypeEqualTo(String value) {
            addCriterion("complain_type =", value, "complainType");
            return (Criteria) this;
        }

        public Criteria andComplainTypeNotEqualTo(String value) {
            addCriterion("complain_type <>", value, "complainType");
            return (Criteria) this;
        }

        public Criteria andComplainTypeGreaterThan(String value) {
            addCriterion("complain_type >", value, "complainType");
            return (Criteria) this;
        }

        public Criteria andComplainTypeGreaterThanOrEqualTo(String value) {
            addCriterion("complain_type >=", value, "complainType");
            return (Criteria) this;
        }

        public Criteria andComplainTypeLessThan(String value) {
            addCriterion("complain_type <", value, "complainType");
            return (Criteria) this;
        }

        public Criteria andComplainTypeLessThanOrEqualTo(String value) {
            addCriterion("complain_type <=", value, "complainType");
            return (Criteria) this;
        }

        public Criteria andComplainTypeLike(String value) {
            addCriterion("complain_type like", value, "complainType");
            return (Criteria) this;
        }

        public Criteria andComplainTypeNotLike(String value) {
            addCriterion("complain_type not like", value, "complainType");
            return (Criteria) this;
        }

        public Criteria andComplainTypeIn(List<String> values) {
            addCriterion("complain_type in", values, "complainType");
            return (Criteria) this;
        }

        public Criteria andComplainTypeNotIn(List<String> values) {
            addCriterion("complain_type not in", values, "complainType");
            return (Criteria) this;
        }

        public Criteria andComplainTypeBetween(String value1, String value2) {
            addCriterion("complain_type between", value1, value2, "complainType");
            return (Criteria) this;
        }

        public Criteria andComplainTypeNotBetween(String value1, String value2) {
            addCriterion("complain_type not between", value1, value2, "complainType");
            return (Criteria) this;
        }

        public Criteria andComplainTimeIsNull() {
            addCriterion("complain_time is null");
            return (Criteria) this;
        }

        public Criteria andComplainTimeIsNotNull() {
            addCriterion("complain_time is not null");
            return (Criteria) this;
        }

        public Criteria andComplainTimeEqualTo(String value) {
            addCriterion("complain_time =", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeNotEqualTo(String value) {
            addCriterion("complain_time <>", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeGreaterThan(String value) {
            addCriterion("complain_time >", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeGreaterThanOrEqualTo(String value) {
            addCriterion("complain_time >=", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeLessThan(String value) {
            addCriterion("complain_time <", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeLessThanOrEqualTo(String value) {
            addCriterion("complain_time <=", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeLike(String value) {
            addCriterion("complain_time like", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeNotLike(String value) {
            addCriterion("complain_time not like", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeIn(List<String> values) {
            addCriterion("complain_time in", values, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeNotIn(List<String> values) {
            addCriterion("complain_time not in", values, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeBetween(String value1, String value2) {
            addCriterion("complain_time between", value1, value2, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeNotBetween(String value1, String value2) {
            addCriterion("complain_time not between", value1, value2, "complainTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table complain_tb
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 24 10:39:06 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table complain_tb
     *
     * @mbg.generated Wed Apr 24 10:39:06 CST 2019
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