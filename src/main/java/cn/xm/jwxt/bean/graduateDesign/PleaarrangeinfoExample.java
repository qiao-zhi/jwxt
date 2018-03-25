package cn.xm.jwxt.bean.graduateDesign;

import java.util.ArrayList;
import java.util.List;

public class PleaarrangeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PleaarrangeinfoExample() {
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

        public Criteria andArrangeidIsNull() {
            addCriterion("arrangeid is null");
            return (Criteria) this;
        }

        public Criteria andArrangeidIsNotNull() {
            addCriterion("arrangeid is not null");
            return (Criteria) this;
        }

        public Criteria andArrangeidEqualTo(Integer value) {
            addCriterion("arrangeid =", value, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidNotEqualTo(Integer value) {
            addCriterion("arrangeid <>", value, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidGreaterThan(Integer value) {
            addCriterion("arrangeid >", value, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("arrangeid >=", value, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidLessThan(Integer value) {
            addCriterion("arrangeid <", value, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidLessThanOrEqualTo(Integer value) {
            addCriterion("arrangeid <=", value, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidIn(List<Integer> values) {
            addCriterion("arrangeid in", values, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidNotIn(List<Integer> values) {
            addCriterion("arrangeid not in", values, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidBetween(Integer value1, Integer value2) {
            addCriterion("arrangeid between", value1, value2, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidNotBetween(Integer value1, Integer value2) {
            addCriterion("arrangeid not between", value1, value2, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andPleaidIsNull() {
            addCriterion("pleaid is null");
            return (Criteria) this;
        }

        public Criteria andPleaidIsNotNull() {
            addCriterion("pleaid is not null");
            return (Criteria) this;
        }

        public Criteria andPleaidEqualTo(String value) {
            addCriterion("pleaid =", value, "pleaid");
            return (Criteria) this;
        }

        public Criteria andPleaidNotEqualTo(String value) {
            addCriterion("pleaid <>", value, "pleaid");
            return (Criteria) this;
        }

        public Criteria andPleaidGreaterThan(String value) {
            addCriterion("pleaid >", value, "pleaid");
            return (Criteria) this;
        }

        public Criteria andPleaidGreaterThanOrEqualTo(String value) {
            addCriterion("pleaid >=", value, "pleaid");
            return (Criteria) this;
        }

        public Criteria andPleaidLessThan(String value) {
            addCriterion("pleaid <", value, "pleaid");
            return (Criteria) this;
        }

        public Criteria andPleaidLessThanOrEqualTo(String value) {
            addCriterion("pleaid <=", value, "pleaid");
            return (Criteria) this;
        }

        public Criteria andPleaidLike(String value) {
            addCriterion("pleaid like", value, "pleaid");
            return (Criteria) this;
        }

        public Criteria andPleaidNotLike(String value) {
            addCriterion("pleaid not like", value, "pleaid");
            return (Criteria) this;
        }

        public Criteria andPleaidIn(List<String> values) {
            addCriterion("pleaid in", values, "pleaid");
            return (Criteria) this;
        }

        public Criteria andPleaidNotIn(List<String> values) {
            addCriterion("pleaid not in", values, "pleaid");
            return (Criteria) this;
        }

        public Criteria andPleaidBetween(String value1, String value2) {
            addCriterion("pleaid between", value1, value2, "pleaid");
            return (Criteria) this;
        }

        public Criteria andPleaidNotBetween(String value1, String value2) {
            addCriterion("pleaid not between", value1, value2, "pleaid");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("groupid is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(String value) {
            addCriterion("groupid =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(String value) {
            addCriterion("groupid <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(String value) {
            addCriterion("groupid >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(String value) {
            addCriterion("groupid >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(String value) {
            addCriterion("groupid <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(String value) {
            addCriterion("groupid <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLike(String value) {
            addCriterion("groupid like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotLike(String value) {
            addCriterion("groupid not like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<String> values) {
            addCriterion("groupid in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<String> values) {
            addCriterion("groupid not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(String value1, String value2) {
            addCriterion("groupid between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(String value1, String value2) {
            addCriterion("groupid not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNull() {
            addCriterion("teacherid is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("teacherid is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(String value) {
            addCriterion("teacherid =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(String value) {
            addCriterion("teacherid <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(String value) {
            addCriterion("teacherid >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(String value) {
            addCriterion("teacherid >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(String value) {
            addCriterion("teacherid <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(String value) {
            addCriterion("teacherid <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLike(String value) {
            addCriterion("teacherid like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotLike(String value) {
            addCriterion("teacherid not like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<String> values) {
            addCriterion("teacherid in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<String> values) {
            addCriterion("teacherid not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(String value1, String value2) {
            addCriterion("teacherid between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(String value1, String value2) {
            addCriterion("teacherid not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andBookidIsNull() {
            addCriterion("bookid is null");
            return (Criteria) this;
        }

        public Criteria andBookidIsNotNull() {
            addCriterion("bookid is not null");
            return (Criteria) this;
        }

        public Criteria andBookidEqualTo(Integer value) {
            addCriterion("bookid =", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotEqualTo(Integer value) {
            addCriterion("bookid <>", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThan(Integer value) {
            addCriterion("bookid >", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookid >=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThan(Integer value) {
            addCriterion("bookid <", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThanOrEqualTo(Integer value) {
            addCriterion("bookid <=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidIn(List<Integer> values) {
            addCriterion("bookid in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotIn(List<Integer> values) {
            addCriterion("bookid not in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidBetween(Integer value1, Integer value2) {
            addCriterion("bookid between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotBetween(Integer value1, Integer value2) {
            addCriterion("bookid not between", value1, value2, "bookid");
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