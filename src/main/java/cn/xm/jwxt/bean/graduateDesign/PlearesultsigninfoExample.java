package cn.xm.jwxt.bean.graduateDesign;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlearesultsigninfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlearesultsigninfoExample() {
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

        public Criteria andPlearesultsignidIsNull() {
            addCriterion("pleaResultSignId is null");
            return (Criteria) this;
        }

        public Criteria andPlearesultsignidIsNotNull() {
            addCriterion("pleaResultSignId is not null");
            return (Criteria) this;
        }

        public Criteria andPlearesultsignidEqualTo(Integer value) {
            addCriterion("pleaResultSignId =", value, "plearesultsignid");
            return (Criteria) this;
        }

        public Criteria andPlearesultsignidNotEqualTo(Integer value) {
            addCriterion("pleaResultSignId <>", value, "plearesultsignid");
            return (Criteria) this;
        }

        public Criteria andPlearesultsignidGreaterThan(Integer value) {
            addCriterion("pleaResultSignId >", value, "plearesultsignid");
            return (Criteria) this;
        }

        public Criteria andPlearesultsignidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pleaResultSignId >=", value, "plearesultsignid");
            return (Criteria) this;
        }

        public Criteria andPlearesultsignidLessThan(Integer value) {
            addCriterion("pleaResultSignId <", value, "plearesultsignid");
            return (Criteria) this;
        }

        public Criteria andPlearesultsignidLessThanOrEqualTo(Integer value) {
            addCriterion("pleaResultSignId <=", value, "plearesultsignid");
            return (Criteria) this;
        }

        public Criteria andPlearesultsignidIn(List<Integer> values) {
            addCriterion("pleaResultSignId in", values, "plearesultsignid");
            return (Criteria) this;
        }

        public Criteria andPlearesultsignidNotIn(List<Integer> values) {
            addCriterion("pleaResultSignId not in", values, "plearesultsignid");
            return (Criteria) this;
        }

        public Criteria andPlearesultsignidBetween(Integer value1, Integer value2) {
            addCriterion("pleaResultSignId between", value1, value2, "plearesultsignid");
            return (Criteria) this;
        }

        public Criteria andPlearesultsignidNotBetween(Integer value1, Integer value2) {
            addCriterion("pleaResultSignId not between", value1, value2, "plearesultsignid");
            return (Criteria) this;
        }

        public Criteria andSignidIsNull() {
            addCriterion("signid is null");
            return (Criteria) this;
        }

        public Criteria andSignidIsNotNull() {
            addCriterion("signid is not null");
            return (Criteria) this;
        }

        public Criteria andSignidEqualTo(String value) {
            addCriterion("signid =", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotEqualTo(String value) {
            addCriterion("signid <>", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidGreaterThan(String value) {
            addCriterion("signid >", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidGreaterThanOrEqualTo(String value) {
            addCriterion("signid >=", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidLessThan(String value) {
            addCriterion("signid <", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidLessThanOrEqualTo(String value) {
            addCriterion("signid <=", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidLike(String value) {
            addCriterion("signid like", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotLike(String value) {
            addCriterion("signid not like", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidIn(List<String> values) {
            addCriterion("signid in", values, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotIn(List<String> values) {
            addCriterion("signid not in", values, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidBetween(String value1, String value2) {
            addCriterion("signid between", value1, value2, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotBetween(String value1, String value2) {
            addCriterion("signid not between", value1, value2, "signid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidIsNull() {
            addCriterion("plearesultID is null");
            return (Criteria) this;
        }

        public Criteria andPlearesultidIsNotNull() {
            addCriterion("plearesultID is not null");
            return (Criteria) this;
        }

        public Criteria andPlearesultidEqualTo(Integer value) {
            addCriterion("plearesultID =", value, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidNotEqualTo(Integer value) {
            addCriterion("plearesultID <>", value, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidGreaterThan(Integer value) {
            addCriterion("plearesultID >", value, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidGreaterThanOrEqualTo(Integer value) {
            addCriterion("plearesultID >=", value, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidLessThan(Integer value) {
            addCriterion("plearesultID <", value, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidLessThanOrEqualTo(Integer value) {
            addCriterion("plearesultID <=", value, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidIn(List<Integer> values) {
            addCriterion("plearesultID in", values, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidNotIn(List<Integer> values) {
            addCriterion("plearesultID not in", values, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidBetween(Integer value1, Integer value2) {
            addCriterion("plearesultID between", value1, value2, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidNotBetween(Integer value1, Integer value2) {
            addCriterion("plearesultID not between", value1, value2, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntimeIsNull() {
            addCriterion("pleaResultSignTime is null");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntimeIsNotNull() {
            addCriterion("pleaResultSignTime is not null");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntimeEqualTo(Date value) {
            addCriterion("pleaResultSignTime =", value, "plearesultsigntime");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntimeNotEqualTo(Date value) {
            addCriterion("pleaResultSignTime <>", value, "plearesultsigntime");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntimeGreaterThan(Date value) {
            addCriterion("pleaResultSignTime >", value, "plearesultsigntime");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pleaResultSignTime >=", value, "plearesultsigntime");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntimeLessThan(Date value) {
            addCriterion("pleaResultSignTime <", value, "plearesultsigntime");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntimeLessThanOrEqualTo(Date value) {
            addCriterion("pleaResultSignTime <=", value, "plearesultsigntime");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntimeIn(List<Date> values) {
            addCriterion("pleaResultSignTime in", values, "plearesultsigntime");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntimeNotIn(List<Date> values) {
            addCriterion("pleaResultSignTime not in", values, "plearesultsigntime");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntimeBetween(Date value1, Date value2) {
            addCriterion("pleaResultSignTime between", value1, value2, "plearesultsigntime");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntimeNotBetween(Date value1, Date value2) {
            addCriterion("pleaResultSignTime not between", value1, value2, "plearesultsigntime");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntypeIsNull() {
            addCriterion("pleaResultSignType is null");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntypeIsNotNull() {
            addCriterion("pleaResultSignType is not null");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntypeEqualTo(String value) {
            addCriterion("pleaResultSignType =", value, "plearesultsigntype");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntypeNotEqualTo(String value) {
            addCriterion("pleaResultSignType <>", value, "plearesultsigntype");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntypeGreaterThan(String value) {
            addCriterion("pleaResultSignType >", value, "plearesultsigntype");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntypeGreaterThanOrEqualTo(String value) {
            addCriterion("pleaResultSignType >=", value, "plearesultsigntype");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntypeLessThan(String value) {
            addCriterion("pleaResultSignType <", value, "plearesultsigntype");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntypeLessThanOrEqualTo(String value) {
            addCriterion("pleaResultSignType <=", value, "plearesultsigntype");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntypeLike(String value) {
            addCriterion("pleaResultSignType like", value, "plearesultsigntype");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntypeNotLike(String value) {
            addCriterion("pleaResultSignType not like", value, "plearesultsigntype");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntypeIn(List<String> values) {
            addCriterion("pleaResultSignType in", values, "plearesultsigntype");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntypeNotIn(List<String> values) {
            addCriterion("pleaResultSignType not in", values, "plearesultsigntype");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntypeBetween(String value1, String value2) {
            addCriterion("pleaResultSignType between", value1, value2, "plearesultsigntype");
            return (Criteria) this;
        }

        public Criteria andPlearesultsigntypeNotBetween(String value1, String value2) {
            addCriterion("pleaResultSignType not between", value1, value2, "plearesultsigntype");
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