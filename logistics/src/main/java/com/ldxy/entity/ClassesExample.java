package com.ldxy.entity;

import java.util.ArrayList;
import java.util.List;

public class ClassesExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table class_tb
	 * @mbg.generated  Mon Apr 22 23:31:21 CST 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table class_tb
	 * @mbg.generated  Mon Apr 22 23:31:21 CST 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table class_tb
	 * @mbg.generated  Mon Apr 22 23:31:21 CST 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class_tb
	 * @mbg.generated  Mon Apr 22 23:31:21 CST 2019
	 */
	public ClassesExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class_tb
	 * @mbg.generated  Mon Apr 22 23:31:21 CST 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class_tb
	 * @mbg.generated  Mon Apr 22 23:31:21 CST 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class_tb
	 * @mbg.generated  Mon Apr 22 23:31:21 CST 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class_tb
	 * @mbg.generated  Mon Apr 22 23:31:21 CST 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class_tb
	 * @mbg.generated  Mon Apr 22 23:31:21 CST 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class_tb
	 * @mbg.generated  Mon Apr 22 23:31:21 CST 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class_tb
	 * @mbg.generated  Mon Apr 22 23:31:21 CST 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class_tb
	 * @mbg.generated  Mon Apr 22 23:31:21 CST 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class_tb
	 * @mbg.generated  Mon Apr 22 23:31:21 CST 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table class_tb
	 * @mbg.generated  Mon Apr 22 23:31:21 CST 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table class_tb
	 * @mbg.generated  Mon Apr 22 23:31:21 CST 2019
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

		public Criteria andApplyNameIsNull() {
			addCriterion("apply_name is null");
			return (Criteria) this;
		}

		public Criteria andApplyNameIsNotNull() {
			addCriterion("apply_name is not null");
			return (Criteria) this;
		}

		public Criteria andApplyNameEqualTo(String value) {
			addCriterion("apply_name =", value, "applyName");
			return (Criteria) this;
		}

		public Criteria andApplyNameNotEqualTo(String value) {
			addCriterion("apply_name <>", value, "applyName");
			return (Criteria) this;
		}

		public Criteria andApplyNameGreaterThan(String value) {
			addCriterion("apply_name >", value, "applyName");
			return (Criteria) this;
		}

		public Criteria andApplyNameGreaterThanOrEqualTo(String value) {
			addCriterion("apply_name >=", value, "applyName");
			return (Criteria) this;
		}

		public Criteria andApplyNameLessThan(String value) {
			addCriterion("apply_name <", value, "applyName");
			return (Criteria) this;
		}

		public Criteria andApplyNameLessThanOrEqualTo(String value) {
			addCriterion("apply_name <=", value, "applyName");
			return (Criteria) this;
		}

		public Criteria andApplyNameLike(String value) {
			addCriterion("apply_name like", value, "applyName");
			return (Criteria) this;
		}

		public Criteria andApplyNameNotLike(String value) {
			addCriterion("apply_name not like", value, "applyName");
			return (Criteria) this;
		}

		public Criteria andApplyNameIn(List<String> values) {
			addCriterion("apply_name in", values, "applyName");
			return (Criteria) this;
		}

		public Criteria andApplyNameNotIn(List<String> values) {
			addCriterion("apply_name not in", values, "applyName");
			return (Criteria) this;
		}

		public Criteria andApplyNameBetween(String value1, String value2) {
			addCriterion("apply_name between", value1, value2, "applyName");
			return (Criteria) this;
		}

		public Criteria andApplyNameNotBetween(String value1, String value2) {
			addCriterion("apply_name not between", value1, value2, "applyName");
			return (Criteria) this;
		}

		public Criteria andApplyNumberIsNull() {
			addCriterion("apply_number is null");
			return (Criteria) this;
		}

		public Criteria andApplyNumberIsNotNull() {
			addCriterion("apply_number is not null");
			return (Criteria) this;
		}

		public Criteria andApplyNumberEqualTo(String value) {
			addCriterion("apply_number =", value, "applyNumber");
			return (Criteria) this;
		}

		public Criteria andApplyNumberNotEqualTo(String value) {
			addCriterion("apply_number <>", value, "applyNumber");
			return (Criteria) this;
		}

		public Criteria andApplyNumberGreaterThan(String value) {
			addCriterion("apply_number >", value, "applyNumber");
			return (Criteria) this;
		}

		public Criteria andApplyNumberGreaterThanOrEqualTo(String value) {
			addCriterion("apply_number >=", value, "applyNumber");
			return (Criteria) this;
		}

		public Criteria andApplyNumberLessThan(String value) {
			addCriterion("apply_number <", value, "applyNumber");
			return (Criteria) this;
		}

		public Criteria andApplyNumberLessThanOrEqualTo(String value) {
			addCriterion("apply_number <=", value, "applyNumber");
			return (Criteria) this;
		}

		public Criteria andApplyNumberLike(String value) {
			addCriterion("apply_number like", value, "applyNumber");
			return (Criteria) this;
		}

		public Criteria andApplyNumberNotLike(String value) {
			addCriterion("apply_number not like", value, "applyNumber");
			return (Criteria) this;
		}

		public Criteria andApplyNumberIn(List<String> values) {
			addCriterion("apply_number in", values, "applyNumber");
			return (Criteria) this;
		}

		public Criteria andApplyNumberNotIn(List<String> values) {
			addCriterion("apply_number not in", values, "applyNumber");
			return (Criteria) this;
		}

		public Criteria andApplyNumberBetween(String value1, String value2) {
			addCriterion("apply_number between", value1, value2, "applyNumber");
			return (Criteria) this;
		}

		public Criteria andApplyNumberNotBetween(String value1, String value2) {
			addCriterion("apply_number not between", value1, value2, "applyNumber");
			return (Criteria) this;
		}

		public Criteria andApplyCollageIsNull() {
			addCriterion("apply_collage is null");
			return (Criteria) this;
		}

		public Criteria andApplyCollageIsNotNull() {
			addCriterion("apply_collage is not null");
			return (Criteria) this;
		}

		public Criteria andApplyCollageEqualTo(String value) {
			addCriterion("apply_collage =", value, "applyCollage");
			return (Criteria) this;
		}

		public Criteria andApplyCollageNotEqualTo(String value) {
			addCriterion("apply_collage <>", value, "applyCollage");
			return (Criteria) this;
		}

		public Criteria andApplyCollageGreaterThan(String value) {
			addCriterion("apply_collage >", value, "applyCollage");
			return (Criteria) this;
		}

		public Criteria andApplyCollageGreaterThanOrEqualTo(String value) {
			addCriterion("apply_collage >=", value, "applyCollage");
			return (Criteria) this;
		}

		public Criteria andApplyCollageLessThan(String value) {
			addCriterion("apply_collage <", value, "applyCollage");
			return (Criteria) this;
		}

		public Criteria andApplyCollageLessThanOrEqualTo(String value) {
			addCriterion("apply_collage <=", value, "applyCollage");
			return (Criteria) this;
		}

		public Criteria andApplyCollageLike(String value) {
			addCriterion("apply_collage like", value, "applyCollage");
			return (Criteria) this;
		}

		public Criteria andApplyCollageNotLike(String value) {
			addCriterion("apply_collage not like", value, "applyCollage");
			return (Criteria) this;
		}

		public Criteria andApplyCollageIn(List<String> values) {
			addCriterion("apply_collage in", values, "applyCollage");
			return (Criteria) this;
		}

		public Criteria andApplyCollageNotIn(List<String> values) {
			addCriterion("apply_collage not in", values, "applyCollage");
			return (Criteria) this;
		}

		public Criteria andApplyCollageBetween(String value1, String value2) {
			addCriterion("apply_collage between", value1, value2, "applyCollage");
			return (Criteria) this;
		}

		public Criteria andApplyCollageNotBetween(String value1, String value2) {
			addCriterion("apply_collage not between", value1, value2, "applyCollage");
			return (Criteria) this;
		}

		public Criteria andApplyClassIsNull() {
			addCriterion("apply_class is null");
			return (Criteria) this;
		}

		public Criteria andApplyClassIsNotNull() {
			addCriterion("apply_class is not null");
			return (Criteria) this;
		}

		public Criteria andApplyClassEqualTo(String value) {
			addCriterion("apply_class =", value, "applyClass");
			return (Criteria) this;
		}

		public Criteria andApplyClassNotEqualTo(String value) {
			addCriterion("apply_class <>", value, "applyClass");
			return (Criteria) this;
		}

		public Criteria andApplyClassGreaterThan(String value) {
			addCriterion("apply_class >", value, "applyClass");
			return (Criteria) this;
		}

		public Criteria andApplyClassGreaterThanOrEqualTo(String value) {
			addCriterion("apply_class >=", value, "applyClass");
			return (Criteria) this;
		}

		public Criteria andApplyClassLessThan(String value) {
			addCriterion("apply_class <", value, "applyClass");
			return (Criteria) this;
		}

		public Criteria andApplyClassLessThanOrEqualTo(String value) {
			addCriterion("apply_class <=", value, "applyClass");
			return (Criteria) this;
		}

		public Criteria andApplyClassLike(String value) {
			addCriterion("apply_class like", value, "applyClass");
			return (Criteria) this;
		}

		public Criteria andApplyClassNotLike(String value) {
			addCriterion("apply_class not like", value, "applyClass");
			return (Criteria) this;
		}

		public Criteria andApplyClassIn(List<String> values) {
			addCriterion("apply_class in", values, "applyClass");
			return (Criteria) this;
		}

		public Criteria andApplyClassNotIn(List<String> values) {
			addCriterion("apply_class not in", values, "applyClass");
			return (Criteria) this;
		}

		public Criteria andApplyClassBetween(String value1, String value2) {
			addCriterion("apply_class between", value1, value2, "applyClass");
			return (Criteria) this;
		}

		public Criteria andApplyClassNotBetween(String value1, String value2) {
			addCriterion("apply_class not between", value1, value2, "applyClass");
			return (Criteria) this;
		}

		public Criteria andApplyCourseIsNull() {
			addCriterion("apply_course is null");
			return (Criteria) this;
		}

		public Criteria andApplyCourseIsNotNull() {
			addCriterion("apply_course is not null");
			return (Criteria) this;
		}

		public Criteria andApplyCourseEqualTo(String value) {
			addCriterion("apply_course =", value, "applyCourse");
			return (Criteria) this;
		}

		public Criteria andApplyCourseNotEqualTo(String value) {
			addCriterion("apply_course <>", value, "applyCourse");
			return (Criteria) this;
		}

		public Criteria andApplyCourseGreaterThan(String value) {
			addCriterion("apply_course >", value, "applyCourse");
			return (Criteria) this;
		}

		public Criteria andApplyCourseGreaterThanOrEqualTo(String value) {
			addCriterion("apply_course >=", value, "applyCourse");
			return (Criteria) this;
		}

		public Criteria andApplyCourseLessThan(String value) {
			addCriterion("apply_course <", value, "applyCourse");
			return (Criteria) this;
		}

		public Criteria andApplyCourseLessThanOrEqualTo(String value) {
			addCriterion("apply_course <=", value, "applyCourse");
			return (Criteria) this;
		}

		public Criteria andApplyCourseLike(String value) {
			addCriterion("apply_course like", value, "applyCourse");
			return (Criteria) this;
		}

		public Criteria andApplyCourseNotLike(String value) {
			addCriterion("apply_course not like", value, "applyCourse");
			return (Criteria) this;
		}

		public Criteria andApplyCourseIn(List<String> values) {
			addCriterion("apply_course in", values, "applyCourse");
			return (Criteria) this;
		}

		public Criteria andApplyCourseNotIn(List<String> values) {
			addCriterion("apply_course not in", values, "applyCourse");
			return (Criteria) this;
		}

		public Criteria andApplyCourseBetween(String value1, String value2) {
			addCriterion("apply_course between", value1, value2, "applyCourse");
			return (Criteria) this;
		}

		public Criteria andApplyCourseNotBetween(String value1, String value2) {
			addCriterion("apply_course not between", value1, value2, "applyCourse");
			return (Criteria) this;
		}

		public Criteria andApplyClassroomIsNull() {
			addCriterion("apply_classroom is null");
			return (Criteria) this;
		}

		public Criteria andApplyClassroomIsNotNull() {
			addCriterion("apply_classroom is not null");
			return (Criteria) this;
		}

		public Criteria andApplyClassroomEqualTo(String value) {
			addCriterion("apply_classroom =", value, "applyClassroom");
			return (Criteria) this;
		}

		public Criteria andApplyClassroomNotEqualTo(String value) {
			addCriterion("apply_classroom <>", value, "applyClassroom");
			return (Criteria) this;
		}

		public Criteria andApplyClassroomGreaterThan(String value) {
			addCriterion("apply_classroom >", value, "applyClassroom");
			return (Criteria) this;
		}

		public Criteria andApplyClassroomGreaterThanOrEqualTo(String value) {
			addCriterion("apply_classroom >=", value, "applyClassroom");
			return (Criteria) this;
		}

		public Criteria andApplyClassroomLessThan(String value) {
			addCriterion("apply_classroom <", value, "applyClassroom");
			return (Criteria) this;
		}

		public Criteria andApplyClassroomLessThanOrEqualTo(String value) {
			addCriterion("apply_classroom <=", value, "applyClassroom");
			return (Criteria) this;
		}

		public Criteria andApplyClassroomLike(String value) {
			addCriterion("apply_classroom like", value, "applyClassroom");
			return (Criteria) this;
		}

		public Criteria andApplyClassroomNotLike(String value) {
			addCriterion("apply_classroom not like", value, "applyClassroom");
			return (Criteria) this;
		}

		public Criteria andApplyClassroomIn(List<String> values) {
			addCriterion("apply_classroom in", values, "applyClassroom");
			return (Criteria) this;
		}

		public Criteria andApplyClassroomNotIn(List<String> values) {
			addCriterion("apply_classroom not in", values, "applyClassroom");
			return (Criteria) this;
		}

		public Criteria andApplyClassroomBetween(String value1, String value2) {
			addCriterion("apply_classroom between", value1, value2, "applyClassroom");
			return (Criteria) this;
		}

		public Criteria andApplyClassroomNotBetween(String value1, String value2) {
			addCriterion("apply_classroom not between", value1, value2, "applyClassroom");
			return (Criteria) this;
		}

		public Criteria andApplyTimeIsNull() {
			addCriterion("apply_time is null");
			return (Criteria) this;
		}

		public Criteria andApplyTimeIsNotNull() {
			addCriterion("apply_time is not null");
			return (Criteria) this;
		}

		public Criteria andApplyTimeEqualTo(String value) {
			addCriterion("apply_time =", value, "applyTime");
			return (Criteria) this;
		}

		public Criteria andApplyTimeNotEqualTo(String value) {
			addCriterion("apply_time <>", value, "applyTime");
			return (Criteria) this;
		}

		public Criteria andApplyTimeGreaterThan(String value) {
			addCriterion("apply_time >", value, "applyTime");
			return (Criteria) this;
		}

		public Criteria andApplyTimeGreaterThanOrEqualTo(String value) {
			addCriterion("apply_time >=", value, "applyTime");
			return (Criteria) this;
		}

		public Criteria andApplyTimeLessThan(String value) {
			addCriterion("apply_time <", value, "applyTime");
			return (Criteria) this;
		}

		public Criteria andApplyTimeLessThanOrEqualTo(String value) {
			addCriterion("apply_time <=", value, "applyTime");
			return (Criteria) this;
		}

		public Criteria andApplyTimeLike(String value) {
			addCriterion("apply_time like", value, "applyTime");
			return (Criteria) this;
		}

		public Criteria andApplyTimeNotLike(String value) {
			addCriterion("apply_time not like", value, "applyTime");
			return (Criteria) this;
		}

		public Criteria andApplyTimeIn(List<String> values) {
			addCriterion("apply_time in", values, "applyTime");
			return (Criteria) this;
		}

		public Criteria andApplyTimeNotIn(List<String> values) {
			addCriterion("apply_time not in", values, "applyTime");
			return (Criteria) this;
		}

		public Criteria andApplyTimeBetween(String value1, String value2) {
			addCriterion("apply_time between", value1, value2, "applyTime");
			return (Criteria) this;
		}

		public Criteria andApplyTimeNotBetween(String value1, String value2) {
			addCriterion("apply_time not between", value1, value2, "applyTime");
			return (Criteria) this;
		}

		public Criteria andApplyStateIsNull() {
			addCriterion("apply_state is null");
			return (Criteria) this;
		}

		public Criteria andApplyStateIsNotNull() {
			addCriterion("apply_state is not null");
			return (Criteria) this;
		}

		public Criteria andApplyStateEqualTo(String value) {
			addCriterion("apply_state =", value, "applyState");
			return (Criteria) this;
		}

		public Criteria andApplyStateNotEqualTo(String value) {
			addCriterion("apply_state <>", value, "applyState");
			return (Criteria) this;
		}

		public Criteria andApplyStateGreaterThan(String value) {
			addCriterion("apply_state >", value, "applyState");
			return (Criteria) this;
		}

		public Criteria andApplyStateGreaterThanOrEqualTo(String value) {
			addCriterion("apply_state >=", value, "applyState");
			return (Criteria) this;
		}

		public Criteria andApplyStateLessThan(String value) {
			addCriterion("apply_state <", value, "applyState");
			return (Criteria) this;
		}

		public Criteria andApplyStateLessThanOrEqualTo(String value) {
			addCriterion("apply_state <=", value, "applyState");
			return (Criteria) this;
		}

		public Criteria andApplyStateLike(String value) {
			addCriterion("apply_state like", value, "applyState");
			return (Criteria) this;
		}

		public Criteria andApplyStateNotLike(String value) {
			addCriterion("apply_state not like", value, "applyState");
			return (Criteria) this;
		}

		public Criteria andApplyStateIn(List<String> values) {
			addCriterion("apply_state in", values, "applyState");
			return (Criteria) this;
		}

		public Criteria andApplyStateNotIn(List<String> values) {
			addCriterion("apply_state not in", values, "applyState");
			return (Criteria) this;
		}

		public Criteria andApplyStateBetween(String value1, String value2) {
			addCriterion("apply_state between", value1, value2, "applyState");
			return (Criteria) this;
		}

		public Criteria andApplyStateNotBetween(String value1, String value2) {
			addCriterion("apply_state not between", value1, value2, "applyState");
			return (Criteria) this;
		}

		public Criteria andRemarksIsNull() {
			addCriterion("remarks is null");
			return (Criteria) this;
		}

		public Criteria andRemarksIsNotNull() {
			addCriterion("remarks is not null");
			return (Criteria) this;
		}

		public Criteria andRemarksEqualTo(String value) {
			addCriterion("remarks =", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksNotEqualTo(String value) {
			addCriterion("remarks <>", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksGreaterThan(String value) {
			addCriterion("remarks >", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksGreaterThanOrEqualTo(String value) {
			addCriterion("remarks >=", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksLessThan(String value) {
			addCriterion("remarks <", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksLessThanOrEqualTo(String value) {
			addCriterion("remarks <=", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksLike(String value) {
			addCriterion("remarks like", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksNotLike(String value) {
			addCriterion("remarks not like", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksIn(List<String> values) {
			addCriterion("remarks in", values, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksNotIn(List<String> values) {
			addCriterion("remarks not in", values, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksBetween(String value1, String value2) {
			addCriterion("remarks between", value1, value2, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksNotBetween(String value1, String value2) {
			addCriterion("remarks not between", value1, value2, "remarks");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table class_tb
	 * @mbg.generated  Mon Apr 22 23:31:21 CST 2019
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
     * This class corresponds to the database table class_tb
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 22 22:41:08 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}