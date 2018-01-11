package com.lewis.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalaryStandardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryStandardExample() {
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

        public Criteria andTotalsalaryIsNull() {
            addCriterion("totalsalary is null");
            return (Criteria) this;
        }

        public Criteria andTotalsalaryIsNotNull() {
            addCriterion("totalsalary is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsalaryEqualTo(Double value) {
            addCriterion("totalsalary =", value, "totalsalary");
            return (Criteria) this;
        }

        public Criteria andTotalsalaryNotEqualTo(Double value) {
            addCriterion("totalsalary <>", value, "totalsalary");
            return (Criteria) this;
        }

        public Criteria andTotalsalaryGreaterThan(Double value) {
            addCriterion("totalsalary >", value, "totalsalary");
            return (Criteria) this;
        }

        public Criteria andTotalsalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("totalsalary >=", value, "totalsalary");
            return (Criteria) this;
        }

        public Criteria andTotalsalaryLessThan(Double value) {
            addCriterion("totalsalary <", value, "totalsalary");
            return (Criteria) this;
        }

        public Criteria andTotalsalaryLessThanOrEqualTo(Double value) {
            addCriterion("totalsalary <=", value, "totalsalary");
            return (Criteria) this;
        }

        public Criteria andTotalsalaryIn(List<Double> values) {
            addCriterion("totalsalary in", values, "totalsalary");
            return (Criteria) this;
        }

        public Criteria andTotalsalaryNotIn(List<Double> values) {
            addCriterion("totalsalary not in", values, "totalsalary");
            return (Criteria) this;
        }

        public Criteria andTotalsalaryBetween(Double value1, Double value2) {
            addCriterion("totalsalary between", value1, value2, "totalsalary");
            return (Criteria) this;
        }

        public Criteria andTotalsalaryNotBetween(Double value1, Double value2) {
            addCriterion("totalsalary not between", value1, value2, "totalsalary");
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

        public Criteria andCompilerIsNull() {
            addCriterion("compiler is null");
            return (Criteria) this;
        }

        public Criteria andCompilerIsNotNull() {
            addCriterion("compiler is not null");
            return (Criteria) this;
        }

        public Criteria andCompilerEqualTo(String value) {
            addCriterion("compiler =", value, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerNotEqualTo(String value) {
            addCriterion("compiler <>", value, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerGreaterThan(String value) {
            addCriterion("compiler >", value, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerGreaterThanOrEqualTo(String value) {
            addCriterion("compiler >=", value, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerLessThan(String value) {
            addCriterion("compiler <", value, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerLessThanOrEqualTo(String value) {
            addCriterion("compiler <=", value, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerLike(String value) {
            addCriterion("compiler like", value, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerNotLike(String value) {
            addCriterion("compiler not like", value, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerIn(List<String> values) {
            addCriterion("compiler in", values, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerNotIn(List<String> values) {
            addCriterion("compiler not in", values, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerBetween(String value1, String value2) {
            addCriterion("compiler between", value1, value2, "compiler");
            return (Criteria) this;
        }

        public Criteria andCompilerNotBetween(String value1, String value2) {
            addCriterion("compiler not between", value1, value2, "compiler");
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

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
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