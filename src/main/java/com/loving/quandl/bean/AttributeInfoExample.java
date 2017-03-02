package com.loving.quandl.bean;

import java.util.ArrayList;
import java.util.List;

public class AttributeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttributeInfoExample() {
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

        public Criteria andAttributeidIsNull() {
            addCriterion("attributeid is null");
            return (Criteria) this;
        }

        public Criteria andAttributeidIsNotNull() {
            addCriterion("attributeid is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeidEqualTo(Integer value) {
            addCriterion("attributeid =", value, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributeidNotEqualTo(Integer value) {
            addCriterion("attributeid <>", value, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributeidGreaterThan(Integer value) {
            addCriterion("attributeid >", value, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("attributeid >=", value, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributeidLessThan(Integer value) {
            addCriterion("attributeid <", value, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributeidLessThanOrEqualTo(Integer value) {
            addCriterion("attributeid <=", value, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributeidIn(List<Integer> values) {
            addCriterion("attributeid in", values, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributeidNotIn(List<Integer> values) {
            addCriterion("attributeid not in", values, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributeidBetween(Integer value1, Integer value2) {
            addCriterion("attributeid between", value1, value2, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributeidNotBetween(Integer value1, Integer value2) {
            addCriterion("attributeid not between", value1, value2, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributenameIsNull() {
            addCriterion("attributename is null");
            return (Criteria) this;
        }

        public Criteria andAttributenameIsNotNull() {
            addCriterion("attributename is not null");
            return (Criteria) this;
        }

        public Criteria andAttributenameEqualTo(String value) {
            addCriterion("attributename =", value, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameNotEqualTo(String value) {
            addCriterion("attributename <>", value, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameGreaterThan(String value) {
            addCriterion("attributename >", value, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameGreaterThanOrEqualTo(String value) {
            addCriterion("attributename >=", value, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameLessThan(String value) {
            addCriterion("attributename <", value, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameLessThanOrEqualTo(String value) {
            addCriterion("attributename <=", value, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameLike(String value) {
            addCriterion("attributename like", value, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameNotLike(String value) {
            addCriterion("attributename not like", value, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameIn(List<String> values) {
            addCriterion("attributename in", values, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameNotIn(List<String> values) {
            addCriterion("attributename not in", values, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameBetween(String value1, String value2) {
            addCriterion("attributename between", value1, value2, "attributename");
            return (Criteria) this;
        }

        public Criteria andAttributenameNotBetween(String value1, String value2) {
            addCriterion("attributename not between", value1, value2, "attributename");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("categoryid is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryid is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Integer value) {
            addCriterion("categoryid =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Integer value) {
            addCriterion("categoryid <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Integer value) {
            addCriterion("categoryid >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoryid >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Integer value) {
            addCriterion("categoryid <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("categoryid <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Integer> values) {
            addCriterion("categoryid in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Integer> values) {
            addCriterion("categoryid not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("categoryid between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("categoryid not between", value1, value2, "categoryid");
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