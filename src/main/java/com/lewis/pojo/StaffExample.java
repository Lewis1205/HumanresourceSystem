package com.lewis.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(String value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(String value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(String value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(String value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(String value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(String value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLike(String value) {
            addCriterion("num like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotLike(String value) {
            addCriterion("num not like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<String> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<String> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(String value1, String value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(String value1, String value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andPrincipleDeptIsNull() {
            addCriterion("principle_dept is null");
            return (Criteria) this;
        }

        public Criteria andPrincipleDeptIsNotNull() {
            addCriterion("principle_dept is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipleDeptEqualTo(String value) {
            addCriterion("principle_dept =", value, "principleDept");
            return (Criteria) this;
        }

        public Criteria andPrincipleDeptNotEqualTo(String value) {
            addCriterion("principle_dept <>", value, "principleDept");
            return (Criteria) this;
        }

        public Criteria andPrincipleDeptGreaterThan(String value) {
            addCriterion("principle_dept >", value, "principleDept");
            return (Criteria) this;
        }

        public Criteria andPrincipleDeptGreaterThanOrEqualTo(String value) {
            addCriterion("principle_dept >=", value, "principleDept");
            return (Criteria) this;
        }

        public Criteria andPrincipleDeptLessThan(String value) {
            addCriterion("principle_dept <", value, "principleDept");
            return (Criteria) this;
        }

        public Criteria andPrincipleDeptLessThanOrEqualTo(String value) {
            addCriterion("principle_dept <=", value, "principleDept");
            return (Criteria) this;
        }

        public Criteria andPrincipleDeptLike(String value) {
            addCriterion("principle_dept like", value, "principleDept");
            return (Criteria) this;
        }

        public Criteria andPrincipleDeptNotLike(String value) {
            addCriterion("principle_dept not like", value, "principleDept");
            return (Criteria) this;
        }

        public Criteria andPrincipleDeptIn(List<String> values) {
            addCriterion("principle_dept in", values, "principleDept");
            return (Criteria) this;
        }

        public Criteria andPrincipleDeptNotIn(List<String> values) {
            addCriterion("principle_dept not in", values, "principleDept");
            return (Criteria) this;
        }

        public Criteria andPrincipleDeptBetween(String value1, String value2) {
            addCriterion("principle_dept between", value1, value2, "principleDept");
            return (Criteria) this;
        }

        public Criteria andPrincipleDeptNotBetween(String value1, String value2) {
            addCriterion("principle_dept not between", value1, value2, "principleDept");
            return (Criteria) this;
        }

        public Criteria andSeniorDeptIsNull() {
            addCriterion("senior_dept is null");
            return (Criteria) this;
        }

        public Criteria andSeniorDeptIsNotNull() {
            addCriterion("senior_dept is not null");
            return (Criteria) this;
        }

        public Criteria andSeniorDeptEqualTo(String value) {
            addCriterion("senior_dept =", value, "seniorDept");
            return (Criteria) this;
        }

        public Criteria andSeniorDeptNotEqualTo(String value) {
            addCriterion("senior_dept <>", value, "seniorDept");
            return (Criteria) this;
        }

        public Criteria andSeniorDeptGreaterThan(String value) {
            addCriterion("senior_dept >", value, "seniorDept");
            return (Criteria) this;
        }

        public Criteria andSeniorDeptGreaterThanOrEqualTo(String value) {
            addCriterion("senior_dept >=", value, "seniorDept");
            return (Criteria) this;
        }

        public Criteria andSeniorDeptLessThan(String value) {
            addCriterion("senior_dept <", value, "seniorDept");
            return (Criteria) this;
        }

        public Criteria andSeniorDeptLessThanOrEqualTo(String value) {
            addCriterion("senior_dept <=", value, "seniorDept");
            return (Criteria) this;
        }

        public Criteria andSeniorDeptLike(String value) {
            addCriterion("senior_dept like", value, "seniorDept");
            return (Criteria) this;
        }

        public Criteria andSeniorDeptNotLike(String value) {
            addCriterion("senior_dept not like", value, "seniorDept");
            return (Criteria) this;
        }

        public Criteria andSeniorDeptIn(List<String> values) {
            addCriterion("senior_dept in", values, "seniorDept");
            return (Criteria) this;
        }

        public Criteria andSeniorDeptNotIn(List<String> values) {
            addCriterion("senior_dept not in", values, "seniorDept");
            return (Criteria) this;
        }

        public Criteria andSeniorDeptBetween(String value1, String value2) {
            addCriterion("senior_dept between", value1, value2, "seniorDept");
            return (Criteria) this;
        }

        public Criteria andSeniorDeptNotBetween(String value1, String value2) {
            addCriterion("senior_dept not between", value1, value2, "seniorDept");
            return (Criteria) this;
        }

        public Criteria andJuniorDeptIsNull() {
            addCriterion("junior_dept is null");
            return (Criteria) this;
        }

        public Criteria andJuniorDeptIsNotNull() {
            addCriterion("junior_dept is not null");
            return (Criteria) this;
        }

        public Criteria andJuniorDeptEqualTo(String value) {
            addCriterion("junior_dept =", value, "juniorDept");
            return (Criteria) this;
        }

        public Criteria andJuniorDeptNotEqualTo(String value) {
            addCriterion("junior_dept <>", value, "juniorDept");
            return (Criteria) this;
        }

        public Criteria andJuniorDeptGreaterThan(String value) {
            addCriterion("junior_dept >", value, "juniorDept");
            return (Criteria) this;
        }

        public Criteria andJuniorDeptGreaterThanOrEqualTo(String value) {
            addCriterion("junior_dept >=", value, "juniorDept");
            return (Criteria) this;
        }

        public Criteria andJuniorDeptLessThan(String value) {
            addCriterion("junior_dept <", value, "juniorDept");
            return (Criteria) this;
        }

        public Criteria andJuniorDeptLessThanOrEqualTo(String value) {
            addCriterion("junior_dept <=", value, "juniorDept");
            return (Criteria) this;
        }

        public Criteria andJuniorDeptLike(String value) {
            addCriterion("junior_dept like", value, "juniorDept");
            return (Criteria) this;
        }

        public Criteria andJuniorDeptNotLike(String value) {
            addCriterion("junior_dept not like", value, "juniorDept");
            return (Criteria) this;
        }

        public Criteria andJuniorDeptIn(List<String> values) {
            addCriterion("junior_dept in", values, "juniorDept");
            return (Criteria) this;
        }

        public Criteria andJuniorDeptNotIn(List<String> values) {
            addCriterion("junior_dept not in", values, "juniorDept");
            return (Criteria) this;
        }

        public Criteria andJuniorDeptBetween(String value1, String value2) {
            addCriterion("junior_dept between", value1, value2, "juniorDept");
            return (Criteria) this;
        }

        public Criteria andJuniorDeptNotBetween(String value1, String value2) {
            addCriterion("junior_dept not between", value1, value2, "juniorDept");
            return (Criteria) this;
        }

        public Criteria andPosCategoryIsNull() {
            addCriterion("pos_category is null");
            return (Criteria) this;
        }

        public Criteria andPosCategoryIsNotNull() {
            addCriterion("pos_category is not null");
            return (Criteria) this;
        }

        public Criteria andPosCategoryEqualTo(String value) {
            addCriterion("pos_category =", value, "posCategory");
            return (Criteria) this;
        }

        public Criteria andPosCategoryNotEqualTo(String value) {
            addCriterion("pos_category <>", value, "posCategory");
            return (Criteria) this;
        }

        public Criteria andPosCategoryGreaterThan(String value) {
            addCriterion("pos_category >", value, "posCategory");
            return (Criteria) this;
        }

        public Criteria andPosCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("pos_category >=", value, "posCategory");
            return (Criteria) this;
        }

        public Criteria andPosCategoryLessThan(String value) {
            addCriterion("pos_category <", value, "posCategory");
            return (Criteria) this;
        }

        public Criteria andPosCategoryLessThanOrEqualTo(String value) {
            addCriterion("pos_category <=", value, "posCategory");
            return (Criteria) this;
        }

        public Criteria andPosCategoryLike(String value) {
            addCriterion("pos_category like", value, "posCategory");
            return (Criteria) this;
        }

        public Criteria andPosCategoryNotLike(String value) {
            addCriterion("pos_category not like", value, "posCategory");
            return (Criteria) this;
        }

        public Criteria andPosCategoryIn(List<String> values) {
            addCriterion("pos_category in", values, "posCategory");
            return (Criteria) this;
        }

        public Criteria andPosCategoryNotIn(List<String> values) {
            addCriterion("pos_category not in", values, "posCategory");
            return (Criteria) this;
        }

        public Criteria andPosCategoryBetween(String value1, String value2) {
            addCriterion("pos_category between", value1, value2, "posCategory");
            return (Criteria) this;
        }

        public Criteria andPosCategoryNotBetween(String value1, String value2) {
            addCriterion("pos_category not between", value1, value2, "posCategory");
            return (Criteria) this;
        }

        public Criteria andPosNameIsNull() {
            addCriterion("pos_name is null");
            return (Criteria) this;
        }

        public Criteria andPosNameIsNotNull() {
            addCriterion("pos_name is not null");
            return (Criteria) this;
        }

        public Criteria andPosNameEqualTo(String value) {
            addCriterion("pos_name =", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotEqualTo(String value) {
            addCriterion("pos_name <>", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameGreaterThan(String value) {
            addCriterion("pos_name >", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameGreaterThanOrEqualTo(String value) {
            addCriterion("pos_name >=", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameLessThan(String value) {
            addCriterion("pos_name <", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameLessThanOrEqualTo(String value) {
            addCriterion("pos_name <=", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameLike(String value) {
            addCriterion("pos_name like", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotLike(String value) {
            addCriterion("pos_name not like", value, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameIn(List<String> values) {
            addCriterion("pos_name in", values, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotIn(List<String> values) {
            addCriterion("pos_name not in", values, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameBetween(String value1, String value2) {
            addCriterion("pos_name between", value1, value2, "posName");
            return (Criteria) this;
        }

        public Criteria andPosNameNotBetween(String value1, String value2) {
            addCriterion("pos_name not between", value1, value2, "posName");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCitizenshipIsNull() {
            addCriterion("citizenship is null");
            return (Criteria) this;
        }

        public Criteria andCitizenshipIsNotNull() {
            addCriterion("citizenship is not null");
            return (Criteria) this;
        }

        public Criteria andCitizenshipEqualTo(String value) {
            addCriterion("citizenship =", value, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipNotEqualTo(String value) {
            addCriterion("citizenship <>", value, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipGreaterThan(String value) {
            addCriterion("citizenship >", value, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipGreaterThanOrEqualTo(String value) {
            addCriterion("citizenship >=", value, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipLessThan(String value) {
            addCriterion("citizenship <", value, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipLessThanOrEqualTo(String value) {
            addCriterion("citizenship <=", value, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipLike(String value) {
            addCriterion("citizenship like", value, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipNotLike(String value) {
            addCriterion("citizenship not like", value, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipIn(List<String> values) {
            addCriterion("citizenship in", values, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipNotIn(List<String> values) {
            addCriterion("citizenship not in", values, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipBetween(String value1, String value2) {
            addCriterion("citizenship between", value1, value2, "citizenship");
            return (Criteria) this;
        }

        public Criteria andCitizenshipNotBetween(String value1, String value2) {
            addCriterion("citizenship not between", value1, value2, "citizenship");
            return (Criteria) this;
        }

        public Criteria andBornIsNull() {
            addCriterion("born is null");
            return (Criteria) this;
        }

        public Criteria andBornIsNotNull() {
            addCriterion("born is not null");
            return (Criteria) this;
        }

        public Criteria andBornEqualTo(String value) {
            addCriterion("born =", value, "born");
            return (Criteria) this;
        }

        public Criteria andBornNotEqualTo(String value) {
            addCriterion("born <>", value, "born");
            return (Criteria) this;
        }

        public Criteria andBornGreaterThan(String value) {
            addCriterion("born >", value, "born");
            return (Criteria) this;
        }

        public Criteria andBornGreaterThanOrEqualTo(String value) {
            addCriterion("born >=", value, "born");
            return (Criteria) this;
        }

        public Criteria andBornLessThan(String value) {
            addCriterion("born <", value, "born");
            return (Criteria) this;
        }

        public Criteria andBornLessThanOrEqualTo(String value) {
            addCriterion("born <=", value, "born");
            return (Criteria) this;
        }

        public Criteria andBornLike(String value) {
            addCriterion("born like", value, "born");
            return (Criteria) this;
        }

        public Criteria andBornNotLike(String value) {
            addCriterion("born not like", value, "born");
            return (Criteria) this;
        }

        public Criteria andBornIn(List<String> values) {
            addCriterion("born in", values, "born");
            return (Criteria) this;
        }

        public Criteria andBornNotIn(List<String> values) {
            addCriterion("born not in", values, "born");
            return (Criteria) this;
        }

        public Criteria andBornBetween(String value1, String value2) {
            addCriterion("born between", value1, value2, "born");
            return (Criteria) this;
        }

        public Criteria andBornNotBetween(String value1, String value2) {
            addCriterion("born not between", value1, value2, "born");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("birth is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("birth is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Date value) {
            addCriterion("birth =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Date value) {
            addCriterion("birth <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Date value) {
            addCriterion("birth >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("birth >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Date value) {
            addCriterion("birth <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Date value) {
            addCriterion("birth <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Date> values) {
            addCriterion("birth in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Date> values) {
            addCriterion("birth not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Date value1, Date value2) {
            addCriterion("birth between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Date value1, Date value2) {
            addCriterion("birth not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("nationality is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("nationality is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("nationality =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("nationality <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("nationality >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("nationality >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("nationality <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("nationality <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("nationality like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("nationality not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("nationality in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("nationality not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("nationality between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("nationality not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andReligionIsNull() {
            addCriterion("religion is null");
            return (Criteria) this;
        }

        public Criteria andReligionIsNotNull() {
            addCriterion("religion is not null");
            return (Criteria) this;
        }

        public Criteria andReligionEqualTo(String value) {
            addCriterion("religion =", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotEqualTo(String value) {
            addCriterion("religion <>", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionGreaterThan(String value) {
            addCriterion("religion >", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionGreaterThanOrEqualTo(String value) {
            addCriterion("religion >=", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionLessThan(String value) {
            addCriterion("religion <", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionLessThanOrEqualTo(String value) {
            addCriterion("religion <=", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionLike(String value) {
            addCriterion("religion like", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotLike(String value) {
            addCriterion("religion not like", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionIn(List<String> values) {
            addCriterion("religion in", values, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotIn(List<String> values) {
            addCriterion("religion not in", values, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionBetween(String value1, String value2) {
            addCriterion("religion between", value1, value2, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotBetween(String value1, String value2) {
            addCriterion("religion not between", value1, value2, "religion");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIsNull() {
            addCriterion("politics_status is null");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIsNotNull() {
            addCriterion("politics_status is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusEqualTo(String value) {
            addCriterion("politics_status =", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotEqualTo(String value) {
            addCriterion("politics_status <>", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusGreaterThan(String value) {
            addCriterion("politics_status >", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("politics_status >=", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLessThan(String value) {
            addCriterion("politics_status <", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLessThanOrEqualTo(String value) {
            addCriterion("politics_status <=", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLike(String value) {
            addCriterion("politics_status like", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotLike(String value) {
            addCriterion("politics_status not like", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIn(List<String> values) {
            addCriterion("politics_status in", values, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotIn(List<String> values) {
            addCriterion("politics_status not in", values, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusBetween(String value1, String value2) {
            addCriterion("politics_status between", value1, value2, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotBetween(String value1, String value2) {
            addCriterion("politics_status not between", value1, value2, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andIdentificationIsNull() {
            addCriterion("identification is null");
            return (Criteria) this;
        }

        public Criteria andIdentificationIsNotNull() {
            addCriterion("identification is not null");
            return (Criteria) this;
        }

        public Criteria andIdentificationEqualTo(String value) {
            addCriterion("identification =", value, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationNotEqualTo(String value) {
            addCriterion("identification <>", value, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationGreaterThan(String value) {
            addCriterion("identification >", value, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationGreaterThanOrEqualTo(String value) {
            addCriterion("identification >=", value, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationLessThan(String value) {
            addCriterion("identification <", value, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationLessThanOrEqualTo(String value) {
            addCriterion("identification <=", value, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationLike(String value) {
            addCriterion("identification like", value, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationNotLike(String value) {
            addCriterion("identification not like", value, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationIn(List<String> values) {
            addCriterion("identification in", values, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationNotIn(List<String> values) {
            addCriterion("identification not in", values, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationBetween(String value1, String value2) {
            addCriterion("identification between", value1, value2, "identification");
            return (Criteria) this;
        }

        public Criteria andIdentificationNotBetween(String value1, String value2) {
            addCriterion("identification not between", value1, value2, "identification");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceIsNull() {
            addCriterion("social_insurance is null");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceIsNotNull() {
            addCriterion("social_insurance is not null");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceEqualTo(String value) {
            addCriterion("social_insurance =", value, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNotEqualTo(String value) {
            addCriterion("social_insurance <>", value, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceGreaterThan(String value) {
            addCriterion("social_insurance >", value, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("social_insurance >=", value, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceLessThan(String value) {
            addCriterion("social_insurance <", value, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceLessThanOrEqualTo(String value) {
            addCriterion("social_insurance <=", value, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceLike(String value) {
            addCriterion("social_insurance like", value, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNotLike(String value) {
            addCriterion("social_insurance not like", value, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceIn(List<String> values) {
            addCriterion("social_insurance in", values, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNotIn(List<String> values) {
            addCriterion("social_insurance not in", values, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceBetween(String value1, String value2) {
            addCriterion("social_insurance between", value1, value2, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNotBetween(String value1, String value2) {
            addCriterion("social_insurance not between", value1, value2, "socialInsurance");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNull() {
            addCriterion("profession is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNotNull() {
            addCriterion("profession is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionEqualTo(String value) {
            addCriterion("profession =", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotEqualTo(String value) {
            addCriterion("profession <>", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThan(String value) {
            addCriterion("profession >", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("profession >=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThan(String value) {
            addCriterion("profession <", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThanOrEqualTo(String value) {
            addCriterion("profession <=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLike(String value) {
            addCriterion("profession like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotLike(String value) {
            addCriterion("profession not like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionIn(List<String> values) {
            addCriterion("profession in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotIn(List<String> values) {
            addCriterion("profession not in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionBetween(String value1, String value2) {
            addCriterion("profession between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotBetween(String value1, String value2) {
            addCriterion("profession not between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andStandardIdIsNull() {
            addCriterion("standard_id is null");
            return (Criteria) this;
        }

        public Criteria andStandardIdIsNotNull() {
            addCriterion("standard_id is not null");
            return (Criteria) this;
        }

        public Criteria andStandardIdEqualTo(Integer value) {
            addCriterion("standard_id =", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdNotEqualTo(Integer value) {
            addCriterion("standard_id <>", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdGreaterThan(Integer value) {
            addCriterion("standard_id >", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("standard_id >=", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdLessThan(Integer value) {
            addCriterion("standard_id <", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdLessThanOrEqualTo(Integer value) {
            addCriterion("standard_id <=", value, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdIn(List<Integer> values) {
            addCriterion("standard_id in", values, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdNotIn(List<Integer> values) {
            addCriterion("standard_id not in", values, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdBetween(Integer value1, Integer value2) {
            addCriterion("standard_id between", value1, value2, "standardId");
            return (Criteria) this;
        }

        public Criteria andStandardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("standard_id not between", value1, value2, "standardId");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andCharactersIsNull() {
            addCriterion("characters is null");
            return (Criteria) this;
        }

        public Criteria andCharactersIsNotNull() {
            addCriterion("characters is not null");
            return (Criteria) this;
        }

        public Criteria andCharactersEqualTo(String value) {
            addCriterion("characters =", value, "characters");
            return (Criteria) this;
        }

        public Criteria andCharactersNotEqualTo(String value) {
            addCriterion("characters <>", value, "characters");
            return (Criteria) this;
        }

        public Criteria andCharactersGreaterThan(String value) {
            addCriterion("characters >", value, "characters");
            return (Criteria) this;
        }

        public Criteria andCharactersGreaterThanOrEqualTo(String value) {
            addCriterion("characters >=", value, "characters");
            return (Criteria) this;
        }

        public Criteria andCharactersLessThan(String value) {
            addCriterion("characters <", value, "characters");
            return (Criteria) this;
        }

        public Criteria andCharactersLessThanOrEqualTo(String value) {
            addCriterion("characters <=", value, "characters");
            return (Criteria) this;
        }

        public Criteria andCharactersLike(String value) {
            addCriterion("characters like", value, "characters");
            return (Criteria) this;
        }

        public Criteria andCharactersNotLike(String value) {
            addCriterion("characters not like", value, "characters");
            return (Criteria) this;
        }

        public Criteria andCharactersIn(List<String> values) {
            addCriterion("characters in", values, "characters");
            return (Criteria) this;
        }

        public Criteria andCharactersNotIn(List<String> values) {
            addCriterion("characters not in", values, "characters");
            return (Criteria) this;
        }

        public Criteria andCharactersBetween(String value1, String value2) {
            addCriterion("characters between", value1, value2, "characters");
            return (Criteria) this;
        }

        public Criteria andCharactersNotBetween(String value1, String value2) {
            addCriterion("characters not between", value1, value2, "characters");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNull() {
            addCriterion("hobby is null");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNotNull() {
            addCriterion("hobby is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyEqualTo(String value) {
            addCriterion("hobby =", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotEqualTo(String value) {
            addCriterion("hobby <>", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThan(String value) {
            addCriterion("hobby >", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("hobby >=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThan(String value) {
            addCriterion("hobby <", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThanOrEqualTo(String value) {
            addCriterion("hobby <=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLike(String value) {
            addCriterion("hobby like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotLike(String value) {
            addCriterion("hobby not like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyIn(List<String> values) {
            addCriterion("hobby in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotIn(List<String> values) {
            addCriterion("hobby not in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyBetween(String value1, String value2) {
            addCriterion("hobby between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotBetween(String value1, String value2) {
            addCriterion("hobby not between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNull() {
            addCriterion("register is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNotNull() {
            addCriterion("register is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterEqualTo(String value) {
            addCriterion("register =", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotEqualTo(String value) {
            addCriterion("register <>", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThan(String value) {
            addCriterion("register >", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("register >=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThan(String value) {
            addCriterion("register <", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThanOrEqualTo(String value) {
            addCriterion("register <=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLike(String value) {
            addCriterion("register like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotLike(String value) {
            addCriterion("register not like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterIn(List<String> values) {
            addCriterion("register in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotIn(List<String> values) {
            addCriterion("register not in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterBetween(String value1, String value2) {
            addCriterion("register between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotBetween(String value1, String value2) {
            addCriterion("register not between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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