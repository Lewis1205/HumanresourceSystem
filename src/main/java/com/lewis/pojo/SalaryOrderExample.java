package com.lewis.pojo;

import java.util.ArrayList;
import java.util.List;

public class SalaryOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(String value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(String value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(String value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(String value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(String value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLike(String value) {
            addCriterion("order_num like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotLike(String value) {
            addCriterion("order_num not like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<String> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<String> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(String value1, String value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(String value1, String value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
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

        public Criteria andPeopleIsNull() {
            addCriterion("people is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNotNull() {
            addCriterion("people is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleEqualTo(Integer value) {
            addCriterion("people =", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotEqualTo(Integer value) {
            addCriterion("people <>", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThan(Integer value) {
            addCriterion("people >", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("people >=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThan(Integer value) {
            addCriterion("people <", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("people <=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleIn(List<Integer> values) {
            addCriterion("people in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotIn(List<Integer> values) {
            addCriterion("people not in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleBetween(Integer value1, Integer value2) {
            addCriterion("people between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("people not between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andBaseTotalIsNull() {
            addCriterion("base_total is null");
            return (Criteria) this;
        }

        public Criteria andBaseTotalIsNotNull() {
            addCriterion("base_total is not null");
            return (Criteria) this;
        }

        public Criteria andBaseTotalEqualTo(Double value) {
            addCriterion("base_total =", value, "baseTotal");
            return (Criteria) this;
        }

        public Criteria andBaseTotalNotEqualTo(Double value) {
            addCriterion("base_total <>", value, "baseTotal");
            return (Criteria) this;
        }

        public Criteria andBaseTotalGreaterThan(Double value) {
            addCriterion("base_total >", value, "baseTotal");
            return (Criteria) this;
        }

        public Criteria andBaseTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("base_total >=", value, "baseTotal");
            return (Criteria) this;
        }

        public Criteria andBaseTotalLessThan(Double value) {
            addCriterion("base_total <", value, "baseTotal");
            return (Criteria) this;
        }

        public Criteria andBaseTotalLessThanOrEqualTo(Double value) {
            addCriterion("base_total <=", value, "baseTotal");
            return (Criteria) this;
        }

        public Criteria andBaseTotalIn(List<Double> values) {
            addCriterion("base_total in", values, "baseTotal");
            return (Criteria) this;
        }

        public Criteria andBaseTotalNotIn(List<Double> values) {
            addCriterion("base_total not in", values, "baseTotal");
            return (Criteria) this;
        }

        public Criteria andBaseTotalBetween(Double value1, Double value2) {
            addCriterion("base_total between", value1, value2, "baseTotal");
            return (Criteria) this;
        }

        public Criteria andBaseTotalNotBetween(Double value1, Double value2) {
            addCriterion("base_total not between", value1, value2, "baseTotal");
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

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
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