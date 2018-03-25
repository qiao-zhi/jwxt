package cn.xm.jwxt.bean.graduateDesign;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FinallypleainfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinallypleainfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andArrangepersonIsNull() {
            addCriterion("arrangePerson is null");
            return (Criteria) this;
        }

        public Criteria andArrangepersonIsNotNull() {
            addCriterion("arrangePerson is not null");
            return (Criteria) this;
        }

        public Criteria andArrangepersonEqualTo(String value) {
            addCriterion("arrangePerson =", value, "arrangeperson");
            return (Criteria) this;
        }

        public Criteria andArrangepersonNotEqualTo(String value) {
            addCriterion("arrangePerson <>", value, "arrangeperson");
            return (Criteria) this;
        }

        public Criteria andArrangepersonGreaterThan(String value) {
            addCriterion("arrangePerson >", value, "arrangeperson");
            return (Criteria) this;
        }

        public Criteria andArrangepersonGreaterThanOrEqualTo(String value) {
            addCriterion("arrangePerson >=", value, "arrangeperson");
            return (Criteria) this;
        }

        public Criteria andArrangepersonLessThan(String value) {
            addCriterion("arrangePerson <", value, "arrangeperson");
            return (Criteria) this;
        }

        public Criteria andArrangepersonLessThanOrEqualTo(String value) {
            addCriterion("arrangePerson <=", value, "arrangeperson");
            return (Criteria) this;
        }

        public Criteria andArrangepersonLike(String value) {
            addCriterion("arrangePerson like", value, "arrangeperson");
            return (Criteria) this;
        }

        public Criteria andArrangepersonNotLike(String value) {
            addCriterion("arrangePerson not like", value, "arrangeperson");
            return (Criteria) this;
        }

        public Criteria andArrangepersonIn(List<String> values) {
            addCriterion("arrangePerson in", values, "arrangeperson");
            return (Criteria) this;
        }

        public Criteria andArrangepersonNotIn(List<String> values) {
            addCriterion("arrangePerson not in", values, "arrangeperson");
            return (Criteria) this;
        }

        public Criteria andArrangepersonBetween(String value1, String value2) {
            addCriterion("arrangePerson between", value1, value2, "arrangeperson");
            return (Criteria) this;
        }

        public Criteria andArrangepersonNotBetween(String value1, String value2) {
            addCriterion("arrangePerson not between", value1, value2, "arrangeperson");
            return (Criteria) this;
        }

        public Criteria andArrangetimeIsNull() {
            addCriterion("arrangeTime is null");
            return (Criteria) this;
        }

        public Criteria andArrangetimeIsNotNull() {
            addCriterion("arrangeTime is not null");
            return (Criteria) this;
        }

        public Criteria andArrangetimeEqualTo(Date value) {
            addCriterionForJDBCDate("arrangeTime =", value, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andArrangetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("arrangeTime <>", value, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andArrangetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("arrangeTime >", value, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andArrangetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("arrangeTime >=", value, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andArrangetimeLessThan(Date value) {
            addCriterionForJDBCDate("arrangeTime <", value, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andArrangetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("arrangeTime <=", value, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andArrangetimeIn(List<Date> values) {
            addCriterionForJDBCDate("arrangeTime in", values, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andArrangetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("arrangeTime not in", values, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andArrangetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("arrangeTime between", value1, value2, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andArrangetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("arrangeTime not between", value1, value2, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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