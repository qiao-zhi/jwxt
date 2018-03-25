package cn.xm.jwxt.bean.trainScheme;

import java.util.ArrayList;
import java.util.List;

public class CoursetypeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoursetypeinfoExample() {
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

        public Criteria andCoursetypeidIsNull() {
            addCriterion("courseTypeId is null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidIsNotNull() {
            addCriterion("courseTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidEqualTo(Integer value) {
            addCriterion("courseTypeId =", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidNotEqualTo(Integer value) {
            addCriterion("courseTypeId <>", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidGreaterThan(Integer value) {
            addCriterion("courseTypeId >", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseTypeId >=", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidLessThan(Integer value) {
            addCriterion("courseTypeId <", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidLessThanOrEqualTo(Integer value) {
            addCriterion("courseTypeId <=", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidIn(List<Integer> values) {
            addCriterion("courseTypeId in", values, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidNotIn(List<Integer> values) {
            addCriterion("courseTypeId not in", values, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidBetween(Integer value1, Integer value2) {
            addCriterion("courseTypeId between", value1, value2, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseTypeId not between", value1, value2, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andTypenumIsNull() {
            addCriterion("typeNum is null");
            return (Criteria) this;
        }

        public Criteria andTypenumIsNotNull() {
            addCriterion("typeNum is not null");
            return (Criteria) this;
        }

        public Criteria andTypenumEqualTo(String value) {
            addCriterion("typeNum =", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumNotEqualTo(String value) {
            addCriterion("typeNum <>", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumGreaterThan(String value) {
            addCriterion("typeNum >", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumGreaterThanOrEqualTo(String value) {
            addCriterion("typeNum >=", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumLessThan(String value) {
            addCriterion("typeNum <", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumLessThanOrEqualTo(String value) {
            addCriterion("typeNum <=", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumLike(String value) {
            addCriterion("typeNum like", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumNotLike(String value) {
            addCriterion("typeNum not like", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumIn(List<String> values) {
            addCriterion("typeNum in", values, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumNotIn(List<String> values) {
            addCriterion("typeNum not in", values, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumBetween(String value1, String value2) {
            addCriterion("typeNum between", value1, value2, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumNotBetween(String value1, String value2) {
            addCriterion("typeNum not between", value1, value2, "typenum");
            return (Criteria) this;
        }

        public Criteria andUptypenumIsNull() {
            addCriterion("upTypeNum is null");
            return (Criteria) this;
        }

        public Criteria andUptypenumIsNotNull() {
            addCriterion("upTypeNum is not null");
            return (Criteria) this;
        }

        public Criteria andUptypenumEqualTo(String value) {
            addCriterion("upTypeNum =", value, "uptypenum");
            return (Criteria) this;
        }

        public Criteria andUptypenumNotEqualTo(String value) {
            addCriterion("upTypeNum <>", value, "uptypenum");
            return (Criteria) this;
        }

        public Criteria andUptypenumGreaterThan(String value) {
            addCriterion("upTypeNum >", value, "uptypenum");
            return (Criteria) this;
        }

        public Criteria andUptypenumGreaterThanOrEqualTo(String value) {
            addCriterion("upTypeNum >=", value, "uptypenum");
            return (Criteria) this;
        }

        public Criteria andUptypenumLessThan(String value) {
            addCriterion("upTypeNum <", value, "uptypenum");
            return (Criteria) this;
        }

        public Criteria andUptypenumLessThanOrEqualTo(String value) {
            addCriterion("upTypeNum <=", value, "uptypenum");
            return (Criteria) this;
        }

        public Criteria andUptypenumLike(String value) {
            addCriterion("upTypeNum like", value, "uptypenum");
            return (Criteria) this;
        }

        public Criteria andUptypenumNotLike(String value) {
            addCriterion("upTypeNum not like", value, "uptypenum");
            return (Criteria) this;
        }

        public Criteria andUptypenumIn(List<String> values) {
            addCriterion("upTypeNum in", values, "uptypenum");
            return (Criteria) this;
        }

        public Criteria andUptypenumNotIn(List<String> values) {
            addCriterion("upTypeNum not in", values, "uptypenum");
            return (Criteria) this;
        }

        public Criteria andUptypenumBetween(String value1, String value2) {
            addCriterion("upTypeNum between", value1, value2, "uptypenum");
            return (Criteria) this;
        }

        public Criteria andUptypenumNotBetween(String value1, String value2) {
            addCriterion("upTypeNum not between", value1, value2, "uptypenum");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("typeName is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("typeName is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("typeName =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("typeName <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("typeName >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("typeName >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("typeName <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("typeName <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("typeName like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("typeName not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("typeName in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("typeName not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("typeName between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("typeName not between", value1, value2, "typename");
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