package com.loving.quandl.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodsAttributesOptionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsAttributesOptionsExample() {
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

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("goodsid =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("goodsid <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("goodsid >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsid >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("goodsid <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsid <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("goodsid in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("goodsid not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("goodsid between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsid not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andOptionidIsNull() {
            addCriterion("optionid is null");
            return (Criteria) this;
        }

        public Criteria andOptionidIsNotNull() {
            addCriterion("optionid is not null");
            return (Criteria) this;
        }

        public Criteria andOptionidEqualTo(Integer value) {
            addCriterion("optionid =", value, "optionid");
            return (Criteria) this;
        }

        public Criteria andOptionidNotEqualTo(Integer value) {
            addCriterion("optionid <>", value, "optionid");
            return (Criteria) this;
        }

        public Criteria andOptionidGreaterThan(Integer value) {
            addCriterion("optionid >", value, "optionid");
            return (Criteria) this;
        }

        public Criteria andOptionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("optionid >=", value, "optionid");
            return (Criteria) this;
        }

        public Criteria andOptionidLessThan(Integer value) {
            addCriterion("optionid <", value, "optionid");
            return (Criteria) this;
        }

        public Criteria andOptionidLessThanOrEqualTo(Integer value) {
            addCriterion("optionid <=", value, "optionid");
            return (Criteria) this;
        }

        public Criteria andOptionidIn(List<Integer> values) {
            addCriterion("optionid in", values, "optionid");
            return (Criteria) this;
        }

        public Criteria andOptionidNotIn(List<Integer> values) {
            addCriterion("optionid not in", values, "optionid");
            return (Criteria) this;
        }

        public Criteria andOptionidBetween(Integer value1, Integer value2) {
            addCriterion("optionid between", value1, value2, "optionid");
            return (Criteria) this;
        }

        public Criteria andOptionidNotBetween(Integer value1, Integer value2) {
            addCriterion("optionid not between", value1, value2, "optionid");
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

        public Criteria andOptionnameIsNull() {
            addCriterion("optionname is null");
            return (Criteria) this;
        }

        public Criteria andOptionnameIsNotNull() {
            addCriterion("optionname is not null");
            return (Criteria) this;
        }

        public Criteria andOptionnameEqualTo(String value) {
            addCriterion("optionname =", value, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameNotEqualTo(String value) {
            addCriterion("optionname <>", value, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameGreaterThan(String value) {
            addCriterion("optionname >", value, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameGreaterThanOrEqualTo(String value) {
            addCriterion("optionname >=", value, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameLessThan(String value) {
            addCriterion("optionname <", value, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameLessThanOrEqualTo(String value) {
            addCriterion("optionname <=", value, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameLike(String value) {
            addCriterion("optionname like", value, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameNotLike(String value) {
            addCriterion("optionname not like", value, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameIn(List<String> values) {
            addCriterion("optionname in", values, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameNotIn(List<String> values) {
            addCriterion("optionname not in", values, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameBetween(String value1, String value2) {
            addCriterion("optionname between", value1, value2, "optionname");
            return (Criteria) this;
        }

        public Criteria andOptionnameNotBetween(String value1, String value2) {
            addCriterion("optionname not between", value1, value2, "optionname");
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