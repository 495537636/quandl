package com.loving.quandl.bean;

import java.util.ArrayList;
import java.util.List;

public class BrandInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandInfoExample() {
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

        public Criteria andBrandidIsNull() {
            addCriterion("brandid is null");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNotNull() {
            addCriterion("brandid is not null");
            return (Criteria) this;
        }

        public Criteria andBrandidEqualTo(Integer value) {
            addCriterion("brandid =", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotEqualTo(Integer value) {
            addCriterion("brandid <>", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThan(Integer value) {
            addCriterion("brandid >", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("brandid >=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThan(Integer value) {
            addCriterion("brandid <", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThanOrEqualTo(Integer value) {
            addCriterion("brandid <=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidIn(List<Integer> values) {
            addCriterion("brandid in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotIn(List<Integer> values) {
            addCriterion("brandid not in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidBetween(Integer value1, Integer value2) {
            addCriterion("brandid between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("brandid not between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandnameIsNull() {
            addCriterion("brandname is null");
            return (Criteria) this;
        }

        public Criteria andBrandnameIsNotNull() {
            addCriterion("brandname is not null");
            return (Criteria) this;
        }

        public Criteria andBrandnameEqualTo(String value) {
            addCriterion("brandname =", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotEqualTo(String value) {
            addCriterion("brandname <>", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameGreaterThan(String value) {
            addCriterion("brandname >", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameGreaterThanOrEqualTo(String value) {
            addCriterion("brandname >=", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLessThan(String value) {
            addCriterion("brandname <", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLessThanOrEqualTo(String value) {
            addCriterion("brandname <=", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLike(String value) {
            addCriterion("brandname like", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotLike(String value) {
            addCriterion("brandname not like", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameIn(List<String> values) {
            addCriterion("brandname in", values, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotIn(List<String> values) {
            addCriterion("brandname not in", values, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameBetween(String value1, String value2) {
            addCriterion("brandname between", value1, value2, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotBetween(String value1, String value2) {
            addCriterion("brandname not between", value1, value2, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandintroduceIsNull() {
            addCriterion("brandintroduce is null");
            return (Criteria) this;
        }

        public Criteria andBrandintroduceIsNotNull() {
            addCriterion("brandintroduce is not null");
            return (Criteria) this;
        }

        public Criteria andBrandintroduceEqualTo(String value) {
            addCriterion("brandintroduce =", value, "brandintroduce");
            return (Criteria) this;
        }

        public Criteria andBrandintroduceNotEqualTo(String value) {
            addCriterion("brandintroduce <>", value, "brandintroduce");
            return (Criteria) this;
        }

        public Criteria andBrandintroduceGreaterThan(String value) {
            addCriterion("brandintroduce >", value, "brandintroduce");
            return (Criteria) this;
        }

        public Criteria andBrandintroduceGreaterThanOrEqualTo(String value) {
            addCriterion("brandintroduce >=", value, "brandintroduce");
            return (Criteria) this;
        }

        public Criteria andBrandintroduceLessThan(String value) {
            addCriterion("brandintroduce <", value, "brandintroduce");
            return (Criteria) this;
        }

        public Criteria andBrandintroduceLessThanOrEqualTo(String value) {
            addCriterion("brandintroduce <=", value, "brandintroduce");
            return (Criteria) this;
        }

        public Criteria andBrandintroduceLike(String value) {
            addCriterion("brandintroduce like", value, "brandintroduce");
            return (Criteria) this;
        }

        public Criteria andBrandintroduceNotLike(String value) {
            addCriterion("brandintroduce not like", value, "brandintroduce");
            return (Criteria) this;
        }

        public Criteria andBrandintroduceIn(List<String> values) {
            addCriterion("brandintroduce in", values, "brandintroduce");
            return (Criteria) this;
        }

        public Criteria andBrandintroduceNotIn(List<String> values) {
            addCriterion("brandintroduce not in", values, "brandintroduce");
            return (Criteria) this;
        }

        public Criteria andBrandintroduceBetween(String value1, String value2) {
            addCriterion("brandintroduce between", value1, value2, "brandintroduce");
            return (Criteria) this;
        }

        public Criteria andBrandintroduceNotBetween(String value1, String value2) {
            addCriterion("brandintroduce not between", value1, value2, "brandintroduce");
            return (Criteria) this;
        }

        public Criteria andBrandlogoIsNull() {
            addCriterion("brandlogo is null");
            return (Criteria) this;
        }

        public Criteria andBrandlogoIsNotNull() {
            addCriterion("brandlogo is not null");
            return (Criteria) this;
        }

        public Criteria andBrandlogoEqualTo(String value) {
            addCriterion("brandlogo =", value, "brandlogo");
            return (Criteria) this;
        }

        public Criteria andBrandlogoNotEqualTo(String value) {
            addCriterion("brandlogo <>", value, "brandlogo");
            return (Criteria) this;
        }

        public Criteria andBrandlogoGreaterThan(String value) {
            addCriterion("brandlogo >", value, "brandlogo");
            return (Criteria) this;
        }

        public Criteria andBrandlogoGreaterThanOrEqualTo(String value) {
            addCriterion("brandlogo >=", value, "brandlogo");
            return (Criteria) this;
        }

        public Criteria andBrandlogoLessThan(String value) {
            addCriterion("brandlogo <", value, "brandlogo");
            return (Criteria) this;
        }

        public Criteria andBrandlogoLessThanOrEqualTo(String value) {
            addCriterion("brandlogo <=", value, "brandlogo");
            return (Criteria) this;
        }

        public Criteria andBrandlogoLike(String value) {
            addCriterion("brandlogo like", value, "brandlogo");
            return (Criteria) this;
        }

        public Criteria andBrandlogoNotLike(String value) {
            addCriterion("brandlogo not like", value, "brandlogo");
            return (Criteria) this;
        }

        public Criteria andBrandlogoIn(List<String> values) {
            addCriterion("brandlogo in", values, "brandlogo");
            return (Criteria) this;
        }

        public Criteria andBrandlogoNotIn(List<String> values) {
            addCriterion("brandlogo not in", values, "brandlogo");
            return (Criteria) this;
        }

        public Criteria andBrandlogoBetween(String value1, String value2) {
            addCriterion("brandlogo between", value1, value2, "brandlogo");
            return (Criteria) this;
        }

        public Criteria andBrandlogoNotBetween(String value1, String value2) {
            addCriterion("brandlogo not between", value1, value2, "brandlogo");
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