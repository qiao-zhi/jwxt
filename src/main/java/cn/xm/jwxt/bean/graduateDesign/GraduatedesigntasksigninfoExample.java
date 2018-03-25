package cn.xm.jwxt.bean.graduateDesign;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GraduatedesigntasksigninfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GraduatedesigntasksigninfoExample() {
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

        public Criteria andGratasksignidIsNull() {
            addCriterion("graTaskSignId is null");
            return (Criteria) this;
        }

        public Criteria andGratasksignidIsNotNull() {
            addCriterion("graTaskSignId is not null");
            return (Criteria) this;
        }

        public Criteria andGratasksignidEqualTo(String value) {
            addCriterion("graTaskSignId =", value, "gratasksignid");
            return (Criteria) this;
        }

        public Criteria andGratasksignidNotEqualTo(String value) {
            addCriterion("graTaskSignId <>", value, "gratasksignid");
            return (Criteria) this;
        }

        public Criteria andGratasksignidGreaterThan(String value) {
            addCriterion("graTaskSignId >", value, "gratasksignid");
            return (Criteria) this;
        }

        public Criteria andGratasksignidGreaterThanOrEqualTo(String value) {
            addCriterion("graTaskSignId >=", value, "gratasksignid");
            return (Criteria) this;
        }

        public Criteria andGratasksignidLessThan(String value) {
            addCriterion("graTaskSignId <", value, "gratasksignid");
            return (Criteria) this;
        }

        public Criteria andGratasksignidLessThanOrEqualTo(String value) {
            addCriterion("graTaskSignId <=", value, "gratasksignid");
            return (Criteria) this;
        }

        public Criteria andGratasksignidLike(String value) {
            addCriterion("graTaskSignId like", value, "gratasksignid");
            return (Criteria) this;
        }

        public Criteria andGratasksignidNotLike(String value) {
            addCriterion("graTaskSignId not like", value, "gratasksignid");
            return (Criteria) this;
        }

        public Criteria andGratasksignidIn(List<String> values) {
            addCriterion("graTaskSignId in", values, "gratasksignid");
            return (Criteria) this;
        }

        public Criteria andGratasksignidNotIn(List<String> values) {
            addCriterion("graTaskSignId not in", values, "gratasksignid");
            return (Criteria) this;
        }

        public Criteria andGratasksignidBetween(String value1, String value2) {
            addCriterion("graTaskSignId between", value1, value2, "gratasksignid");
            return (Criteria) this;
        }

        public Criteria andGratasksignidNotBetween(String value1, String value2) {
            addCriterion("graTaskSignId not between", value1, value2, "gratasksignid");
            return (Criteria) this;
        }

        public Criteria andSignIdIsNull() {
            addCriterion("sign_id is null");
            return (Criteria) this;
        }

        public Criteria andSignIdIsNotNull() {
            addCriterion("sign_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignIdEqualTo(String value) {
            addCriterion("sign_id =", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotEqualTo(String value) {
            addCriterion("sign_id <>", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdGreaterThan(String value) {
            addCriterion("sign_id >", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdGreaterThanOrEqualTo(String value) {
            addCriterion("sign_id >=", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdLessThan(String value) {
            addCriterion("sign_id <", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdLessThanOrEqualTo(String value) {
            addCriterion("sign_id <=", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdLike(String value) {
            addCriterion("sign_id like", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotLike(String value) {
            addCriterion("sign_id not like", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdIn(List<String> values) {
            addCriterion("sign_id in", values, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotIn(List<String> values) {
            addCriterion("sign_id not in", values, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdBetween(String value1, String value2) {
            addCriterion("sign_id between", value1, value2, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotBetween(String value1, String value2) {
            addCriterion("sign_id not between", value1, value2, "signId");
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

        public Criteria andBookidEqualTo(String value) {
            addCriterion("bookid =", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotEqualTo(String value) {
            addCriterion("bookid <>", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThan(String value) {
            addCriterion("bookid >", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(String value) {
            addCriterion("bookid >=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThan(String value) {
            addCriterion("bookid <", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThanOrEqualTo(String value) {
            addCriterion("bookid <=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLike(String value) {
            addCriterion("bookid like", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotLike(String value) {
            addCriterion("bookid not like", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidIn(List<String> values) {
            addCriterion("bookid in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotIn(List<String> values) {
            addCriterion("bookid not in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidBetween(String value1, String value2) {
            addCriterion("bookid between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotBetween(String value1, String value2) {
            addCriterion("bookid not between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andTasksigntimeIsNull() {
            addCriterion("taskSignTime is null");
            return (Criteria) this;
        }

        public Criteria andTasksigntimeIsNotNull() {
            addCriterion("taskSignTime is not null");
            return (Criteria) this;
        }

        public Criteria andTasksigntimeEqualTo(Date value) {
            addCriterion("taskSignTime =", value, "tasksigntime");
            return (Criteria) this;
        }

        public Criteria andTasksigntimeNotEqualTo(Date value) {
            addCriterion("taskSignTime <>", value, "tasksigntime");
            return (Criteria) this;
        }

        public Criteria andTasksigntimeGreaterThan(Date value) {
            addCriterion("taskSignTime >", value, "tasksigntime");
            return (Criteria) this;
        }

        public Criteria andTasksigntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("taskSignTime >=", value, "tasksigntime");
            return (Criteria) this;
        }

        public Criteria andTasksigntimeLessThan(Date value) {
            addCriterion("taskSignTime <", value, "tasksigntime");
            return (Criteria) this;
        }

        public Criteria andTasksigntimeLessThanOrEqualTo(Date value) {
            addCriterion("taskSignTime <=", value, "tasksigntime");
            return (Criteria) this;
        }

        public Criteria andTasksigntimeIn(List<Date> values) {
            addCriterion("taskSignTime in", values, "tasksigntime");
            return (Criteria) this;
        }

        public Criteria andTasksigntimeNotIn(List<Date> values) {
            addCriterion("taskSignTime not in", values, "tasksigntime");
            return (Criteria) this;
        }

        public Criteria andTasksigntimeBetween(Date value1, Date value2) {
            addCriterion("taskSignTime between", value1, value2, "tasksigntime");
            return (Criteria) this;
        }

        public Criteria andTasksigntimeNotBetween(Date value1, Date value2) {
            addCriterion("taskSignTime not between", value1, value2, "tasksigntime");
            return (Criteria) this;
        }

        public Criteria andTasksigntypeIsNull() {
            addCriterion("taskSignType is null");
            return (Criteria) this;
        }

        public Criteria andTasksigntypeIsNotNull() {
            addCriterion("taskSignType is not null");
            return (Criteria) this;
        }

        public Criteria andTasksigntypeEqualTo(String value) {
            addCriterion("taskSignType =", value, "tasksigntype");
            return (Criteria) this;
        }

        public Criteria andTasksigntypeNotEqualTo(String value) {
            addCriterion("taskSignType <>", value, "tasksigntype");
            return (Criteria) this;
        }

        public Criteria andTasksigntypeGreaterThan(String value) {
            addCriterion("taskSignType >", value, "tasksigntype");
            return (Criteria) this;
        }

        public Criteria andTasksigntypeGreaterThanOrEqualTo(String value) {
            addCriterion("taskSignType >=", value, "tasksigntype");
            return (Criteria) this;
        }

        public Criteria andTasksigntypeLessThan(String value) {
            addCriterion("taskSignType <", value, "tasksigntype");
            return (Criteria) this;
        }

        public Criteria andTasksigntypeLessThanOrEqualTo(String value) {
            addCriterion("taskSignType <=", value, "tasksigntype");
            return (Criteria) this;
        }

        public Criteria andTasksigntypeLike(String value) {
            addCriterion("taskSignType like", value, "tasksigntype");
            return (Criteria) this;
        }

        public Criteria andTasksigntypeNotLike(String value) {
            addCriterion("taskSignType not like", value, "tasksigntype");
            return (Criteria) this;
        }

        public Criteria andTasksigntypeIn(List<String> values) {
            addCriterion("taskSignType in", values, "tasksigntype");
            return (Criteria) this;
        }

        public Criteria andTasksigntypeNotIn(List<String> values) {
            addCriterion("taskSignType not in", values, "tasksigntype");
            return (Criteria) this;
        }

        public Criteria andTasksigntypeBetween(String value1, String value2) {
            addCriterion("taskSignType between", value1, value2, "tasksigntype");
            return (Criteria) this;
        }

        public Criteria andTasksigntypeNotBetween(String value1, String value2) {
            addCriterion("taskSignType not between", value1, value2, "tasksigntype");
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