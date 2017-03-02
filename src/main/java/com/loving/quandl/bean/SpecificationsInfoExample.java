package com.loving.quandl.bean;

import java.util.ArrayList;
import java.util.List;

public class SpecificationsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpecificationsInfoExample() {
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

        public Criteria andSpecificationidIsNull() {
            addCriterion("specificationid is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationidIsNotNull() {
            addCriterion("specificationid is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationidEqualTo(Integer value) {
            addCriterion("specificationid =", value, "specificationid");
            return (Criteria) this;
        }

        public Criteria andSpecificationidNotEqualTo(Integer value) {
            addCriterion("specificationid <>", value, "specificationid");
            return (Criteria) this;
        }

        public Criteria andSpecificationidGreaterThan(Integer value) {
            addCriterion("specificationid >", value, "specificationid");
            return (Criteria) this;
        }

        public Criteria andSpecificationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("specificationid >=", value, "specificationid");
            return (Criteria) this;
        }

        public Criteria andSpecificationidLessThan(Integer value) {
            addCriterion("specificationid <", value, "specificationid");
            return (Criteria) this;
        }

        public Criteria andSpecificationidLessThanOrEqualTo(Integer value) {
            addCriterion("specificationid <=", value, "specificationid");
            return (Criteria) this;
        }

        public Criteria andSpecificationidIn(List<Integer> values) {
            addCriterion("specificationid in", values, "specificationid");
            return (Criteria) this;
        }

        public Criteria andSpecificationidNotIn(List<Integer> values) {
            addCriterion("specificationid not in", values, "specificationid");
            return (Criteria) this;
        }

        public Criteria andSpecificationidBetween(Integer value1, Integer value2) {
            addCriterion("specificationid between", value1, value2, "specificationid");
            return (Criteria) this;
        }

        public Criteria andSpecificationidNotBetween(Integer value1, Integer value2) {
            addCriterion("specificationid not between", value1, value2, "specificationid");
            return (Criteria) this;
        }

        public Criteria andSpecificationnameIsNull() {
            addCriterion("specificationname is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationnameIsNotNull() {
            addCriterion("specificationname is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationnameEqualTo(String value) {
            addCriterion("specificationname =", value, "specificationname");
            return (Criteria) this;
        }

        public Criteria andSpecificationnameNotEqualTo(String value) {
            addCriterion("specificationname <>", value, "specificationname");
            return (Criteria) this;
        }

        public Criteria andSpecificationnameGreaterThan(String value) {
            addCriterion("specificationname >", value, "specificationname");
            return (Criteria) this;
        }

        public Criteria andSpecificationnameGreaterThanOrEqualTo(String value) {
            addCriterion("specificationname >=", value, "specificationname");
            return (Criteria) this;
        }

        public Criteria andSpecificationnameLessThan(String value) {
            addCriterion("specificationname <", value, "specificationname");
            return (Criteria) this;
        }

        public Criteria andSpecificationnameLessThanOrEqualTo(String value) {
            addCriterion("specificationname <=", value, "specificationname");
            return (Criteria) this;
        }

        public Criteria andSpecificationnameLike(String value) {
            addCriterion("specificationname like", value, "specificationname");
            return (Criteria) this;
        }

        public Criteria andSpecificationnameNotLike(String value) {
            addCriterion("specificationname not like", value, "specificationname");
            return (Criteria) this;
        }

        public Criteria andSpecificationnameIn(List<String> values) {
            addCriterion("specificationname in", values, "specificationname");
            return (Criteria) this;
        }

        public Criteria andSpecificationnameNotIn(List<String> values) {
            addCriterion("specificationname not in", values, "specificationname");
            return (Criteria) this;
        }

        public Criteria andSpecificationnameBetween(String value1, String value2) {
            addCriterion("specificationname between", value1, value2, "specificationname");
            return (Criteria) this;
        }

        public Criteria andSpecificationnameNotBetween(String value1, String value2) {
            addCriterion("specificationname not between", value1, value2, "specificationname");
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