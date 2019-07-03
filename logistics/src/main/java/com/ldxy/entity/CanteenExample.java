package com.ldxy.entity;

import java.util.ArrayList;
import java.util.List;

public class CanteenExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table canteen_ts_tb
	 * @mbg.generated  Tue Apr 23 21:16:59 CST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table canteen_ts_tb
	 * @mbg.generated  Tue Apr 23 21:16:59 CST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table canteen_ts_tb
	 * @mbg.generated  Tue Apr 23 21:16:59 CST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table canteen_ts_tb
	 * @mbg.generated  Tue Apr 23 21:16:59 CST 2019
	 */
	public CanteenExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table canteen_ts_tb
	 * @mbg.generated  Tue Apr 23 21:16:59 CST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table canteen_ts_tb
	 * @mbg.generated  Tue Apr 23 21:16:59 CST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table canteen_ts_tb
	 * @mbg.generated  Tue Apr 23 21:16:59 CST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table canteen_ts_tb
	 * @mbg.generated  Tue Apr 23 21:16:59 CST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table canteen_ts_tb
	 * @mbg.generated  Tue Apr 23 21:16:59 CST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table canteen_ts_tb
	 * @mbg.generated  Tue Apr 23 21:16:59 CST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table canteen_ts_tb
	 * @mbg.generated  Tue Apr 23 21:16:59 CST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table canteen_ts_tb
	 * @mbg.generated  Tue Apr 23 21:16:59 CST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table canteen_ts_tb
	 * @mbg.generated  Tue Apr 23 21:16:59 CST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table canteen_ts_tb
	 * @mbg.generated  Tue Apr 23 21:16:59 CST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table canteen_ts_tb
	 * @mbg.generated  Tue Apr 23 21:16:59 CST 2019
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

		public Criteria andTsCanteenNumberIsNull() {
			addCriterion("ts_canteen_number is null");
			return (Criteria) this;
		}

		public Criteria andTsCanteenNumberIsNotNull() {
			addCriterion("ts_canteen_number is not null");
			return (Criteria) this;
		}

		public Criteria andTsCanteenNumberEqualTo(String value) {
			addCriterion("ts_canteen_number =", value, "tsCanteenNumber");
			return (Criteria) this;
		}

		public Criteria andTsCanteenNumberNotEqualTo(String value) {
			addCriterion("ts_canteen_number <>", value, "tsCanteenNumber");
			return (Criteria) this;
		}

		public Criteria andTsCanteenNumberGreaterThan(String value) {
			addCriterion("ts_canteen_number >", value, "tsCanteenNumber");
			return (Criteria) this;
		}

		public Criteria andTsCanteenNumberGreaterThanOrEqualTo(String value) {
			addCriterion("ts_canteen_number >=", value, "tsCanteenNumber");
			return (Criteria) this;
		}

		public Criteria andTsCanteenNumberLessThan(String value) {
			addCriterion("ts_canteen_number <", value, "tsCanteenNumber");
			return (Criteria) this;
		}

		public Criteria andTsCanteenNumberLessThanOrEqualTo(String value) {
			addCriterion("ts_canteen_number <=", value, "tsCanteenNumber");
			return (Criteria) this;
		}

		public Criteria andTsCanteenNumberLike(String value) {
			addCriterion("ts_canteen_number like", value, "tsCanteenNumber");
			return (Criteria) this;
		}

		public Criteria andTsCanteenNumberNotLike(String value) {
			addCriterion("ts_canteen_number not like", value, "tsCanteenNumber");
			return (Criteria) this;
		}

		public Criteria andTsCanteenNumberIn(List<String> values) {
			addCriterion("ts_canteen_number in", values, "tsCanteenNumber");
			return (Criteria) this;
		}

		public Criteria andTsCanteenNumberNotIn(List<String> values) {
			addCriterion("ts_canteen_number not in", values, "tsCanteenNumber");
			return (Criteria) this;
		}

		public Criteria andTsCanteenNumberBetween(String value1, String value2) {
			addCriterion("ts_canteen_number between", value1, value2, "tsCanteenNumber");
			return (Criteria) this;
		}

		public Criteria andTsCanteenNumberNotBetween(String value1, String value2) {
			addCriterion("ts_canteen_number not between", value1, value2, "tsCanteenNumber");
			return (Criteria) this;
		}

		public Criteria andTsTowerNumberIsNull() {
			addCriterion("ts_tower_number is null");
			return (Criteria) this;
		}

		public Criteria andTsTowerNumberIsNotNull() {
			addCriterion("ts_tower_number is not null");
			return (Criteria) this;
		}

		public Criteria andTsTowerNumberEqualTo(String value) {
			addCriterion("ts_tower_number =", value, "tsTowerNumber");
			return (Criteria) this;
		}

		public Criteria andTsTowerNumberNotEqualTo(String value) {
			addCriterion("ts_tower_number <>", value, "tsTowerNumber");
			return (Criteria) this;
		}

		public Criteria andTsTowerNumberGreaterThan(String value) {
			addCriterion("ts_tower_number >", value, "tsTowerNumber");
			return (Criteria) this;
		}

		public Criteria andTsTowerNumberGreaterThanOrEqualTo(String value) {
			addCriterion("ts_tower_number >=", value, "tsTowerNumber");
			return (Criteria) this;
		}

		public Criteria andTsTowerNumberLessThan(String value) {
			addCriterion("ts_tower_number <", value, "tsTowerNumber");
			return (Criteria) this;
		}

		public Criteria andTsTowerNumberLessThanOrEqualTo(String value) {
			addCriterion("ts_tower_number <=", value, "tsTowerNumber");
			return (Criteria) this;
		}

		public Criteria andTsTowerNumberLike(String value) {
			addCriterion("ts_tower_number like", value, "tsTowerNumber");
			return (Criteria) this;
		}

		public Criteria andTsTowerNumberNotLike(String value) {
			addCriterion("ts_tower_number not like", value, "tsTowerNumber");
			return (Criteria) this;
		}

		public Criteria andTsTowerNumberIn(List<String> values) {
			addCriterion("ts_tower_number in", values, "tsTowerNumber");
			return (Criteria) this;
		}

		public Criteria andTsTowerNumberNotIn(List<String> values) {
			addCriterion("ts_tower_number not in", values, "tsTowerNumber");
			return (Criteria) this;
		}

		public Criteria andTsTowerNumberBetween(String value1, String value2) {
			addCriterion("ts_tower_number between", value1, value2, "tsTowerNumber");
			return (Criteria) this;
		}

		public Criteria andTsTowerNumberNotBetween(String value1, String value2) {
			addCriterion("ts_tower_number not between", value1, value2, "tsTowerNumber");
			return (Criteria) this;
		}

		public Criteria andTsWindowNumberIsNull() {
			addCriterion("ts_window_number is null");
			return (Criteria) this;
		}

		public Criteria andTsWindowNumberIsNotNull() {
			addCriterion("ts_window_number is not null");
			return (Criteria) this;
		}

		public Criteria andTsWindowNumberEqualTo(String value) {
			addCriterion("ts_window_number =", value, "tsWindowNumber");
			return (Criteria) this;
		}

		public Criteria andTsWindowNumberNotEqualTo(String value) {
			addCriterion("ts_window_number <>", value, "tsWindowNumber");
			return (Criteria) this;
		}

		public Criteria andTsWindowNumberGreaterThan(String value) {
			addCriterion("ts_window_number >", value, "tsWindowNumber");
			return (Criteria) this;
		}

		public Criteria andTsWindowNumberGreaterThanOrEqualTo(String value) {
			addCriterion("ts_window_number >=", value, "tsWindowNumber");
			return (Criteria) this;
		}

		public Criteria andTsWindowNumberLessThan(String value) {
			addCriterion("ts_window_number <", value, "tsWindowNumber");
			return (Criteria) this;
		}

		public Criteria andTsWindowNumberLessThanOrEqualTo(String value) {
			addCriterion("ts_window_number <=", value, "tsWindowNumber");
			return (Criteria) this;
		}

		public Criteria andTsWindowNumberLike(String value) {
			addCriterion("ts_window_number like", value, "tsWindowNumber");
			return (Criteria) this;
		}

		public Criteria andTsWindowNumberNotLike(String value) {
			addCriterion("ts_window_number not like", value, "tsWindowNumber");
			return (Criteria) this;
		}

		public Criteria andTsWindowNumberIn(List<String> values) {
			addCriterion("ts_window_number in", values, "tsWindowNumber");
			return (Criteria) this;
		}

		public Criteria andTsWindowNumberNotIn(List<String> values) {
			addCriterion("ts_window_number not in", values, "tsWindowNumber");
			return (Criteria) this;
		}

		public Criteria andTsWindowNumberBetween(String value1, String value2) {
			addCriterion("ts_window_number between", value1, value2, "tsWindowNumber");
			return (Criteria) this;
		}

		public Criteria andTsWindowNumberNotBetween(String value1, String value2) {
			addCriterion("ts_window_number not between", value1, value2, "tsWindowNumber");
			return (Criteria) this;
		}

		public Criteria andTsReasonIsNull() {
			addCriterion("ts_reason is null");
			return (Criteria) this;
		}

		public Criteria andTsReasonIsNotNull() {
			addCriterion("ts_reason is not null");
			return (Criteria) this;
		}

		public Criteria andTsReasonEqualTo(String value) {
			addCriterion("ts_reason =", value, "tsReason");
			return (Criteria) this;
		}

		public Criteria andTsReasonNotEqualTo(String value) {
			addCriterion("ts_reason <>", value, "tsReason");
			return (Criteria) this;
		}

		public Criteria andTsReasonGreaterThan(String value) {
			addCriterion("ts_reason >", value, "tsReason");
			return (Criteria) this;
		}

		public Criteria andTsReasonGreaterThanOrEqualTo(String value) {
			addCriterion("ts_reason >=", value, "tsReason");
			return (Criteria) this;
		}

		public Criteria andTsReasonLessThan(String value) {
			addCriterion("ts_reason <", value, "tsReason");
			return (Criteria) this;
		}

		public Criteria andTsReasonLessThanOrEqualTo(String value) {
			addCriterion("ts_reason <=", value, "tsReason");
			return (Criteria) this;
		}

		public Criteria andTsReasonLike(String value) {
			addCriterion("ts_reason like", value, "tsReason");
			return (Criteria) this;
		}

		public Criteria andTsReasonNotLike(String value) {
			addCriterion("ts_reason not like", value, "tsReason");
			return (Criteria) this;
		}

		public Criteria andTsReasonIn(List<String> values) {
			addCriterion("ts_reason in", values, "tsReason");
			return (Criteria) this;
		}

		public Criteria andTsReasonNotIn(List<String> values) {
			addCriterion("ts_reason not in", values, "tsReason");
			return (Criteria) this;
		}

		public Criteria andTsReasonBetween(String value1, String value2) {
			addCriterion("ts_reason between", value1, value2, "tsReason");
			return (Criteria) this;
		}

		public Criteria andTsReasonNotBetween(String value1, String value2) {
			addCriterion("ts_reason not between", value1, value2, "tsReason");
			return (Criteria) this;
		}

		public Criteria andTsTimeIsNull() {
			addCriterion("ts_time is null");
			return (Criteria) this;
		}

		public Criteria andTsTimeIsNotNull() {
			addCriterion("ts_time is not null");
			return (Criteria) this;
		}

		public Criteria andTsTimeEqualTo(String value) {
			addCriterion("ts_time =", value, "tsTime");
			return (Criteria) this;
		}

		public Criteria andTsTimeNotEqualTo(String value) {
			addCriterion("ts_time <>", value, "tsTime");
			return (Criteria) this;
		}

		public Criteria andTsTimeGreaterThan(String value) {
			addCriterion("ts_time >", value, "tsTime");
			return (Criteria) this;
		}

		public Criteria andTsTimeGreaterThanOrEqualTo(String value) {
			addCriterion("ts_time >=", value, "tsTime");
			return (Criteria) this;
		}

		public Criteria andTsTimeLessThan(String value) {
			addCriterion("ts_time <", value, "tsTime");
			return (Criteria) this;
		}

		public Criteria andTsTimeLessThanOrEqualTo(String value) {
			addCriterion("ts_time <=", value, "tsTime");
			return (Criteria) this;
		}

		public Criteria andTsTimeLike(String value) {
			addCriterion("ts_time like", value, "tsTime");
			return (Criteria) this;
		}

		public Criteria andTsTimeNotLike(String value) {
			addCriterion("ts_time not like", value, "tsTime");
			return (Criteria) this;
		}

		public Criteria andTsTimeIn(List<String> values) {
			addCriterion("ts_time in", values, "tsTime");
			return (Criteria) this;
		}

		public Criteria andTsTimeNotIn(List<String> values) {
			addCriterion("ts_time not in", values, "tsTime");
			return (Criteria) this;
		}

		public Criteria andTsTimeBetween(String value1, String value2) {
			addCriterion("ts_time between", value1, value2, "tsTime");
			return (Criteria) this;
		}

		public Criteria andTsTimeNotBetween(String value1, String value2) {
			addCriterion("ts_time not between", value1, value2, "tsTime");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table canteen_ts_tb
	 * @mbg.generated  Tue Apr 23 21:16:59 CST 2019
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table canteen_tb
     *
     * @mbg.generated do_not_delete_during_merge Tue Apr 23 21:10:00 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}