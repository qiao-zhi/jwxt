package cn.xm.jwxt.bean.graduateDesign;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TeachertitlecheckinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeachertitlecheckinfoExample() {
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

        public Criteria andCheckidIsNull() {
            addCriterion("checkID is null");
            return (Criteria) this;
        }

        public Criteria andCheckidIsNotNull() {
            addCriterion("checkID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckidEqualTo(String value) {
            addCriterion("checkID =", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotEqualTo(String value) {
            addCriterion("checkID <>", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidGreaterThan(String value) {
            addCriterion("checkID >", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidGreaterThanOrEqualTo(String value) {
            addCriterion("checkID >=", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidLessThan(String value) {
            addCriterion("checkID <", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidLessThanOrEqualTo(String value) {
            addCriterion("checkID <=", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidLike(String value) {
            addCriterion("checkID like", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotLike(String value) {
            addCriterion("checkID not like", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidIn(List<String> values) {
            addCriterion("checkID in", values, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotIn(List<String> values) {
            addCriterion("checkID not in", values, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidBetween(String value1, String value2) {
            addCriterion("checkID between", value1, value2, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotBetween(String value1, String value2) {
            addCriterion("checkID not between", value1, value2, "checkid");
            return (Criteria) this;
        }

        public Criteria andteachertitleidIsNull() {
            addCriterion("teacherTitleID is null");
            return (Criteria) this;
        }

        public Criteria andteachertitleidIsNotNull() {
            addCriterion("teacherTitleID is not null");
            return (Criteria) this;
        }

        public Criteria andteachertitleidEqualTo(String value) {
            addCriterion("teacherTitleID =", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andteachertitleidNotEqualTo(String value) {
            addCriterion("teacherTitleID <>", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andteachertitleidGreaterThan(String value) {
            addCriterion("teacherTitleID >", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andteachertitleidGreaterThanOrEqualTo(String value) {
            addCriterion("teacherTitleID >=", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andteachertitleidLessThan(String value) {
            addCriterion("teacherTitleID <", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andteachertitleidLessThanOrEqualTo(String value) {
            addCriterion("teacherTitleID <=", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andteachertitleidLike(String value) {
            addCriterion("teacherTitleID like", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andteachertitleidNotLike(String value) {
            addCriterion("teacherTitleID not like", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andteachertitleidIn(List<String> values) {
            addCriterion("teacherTitleID in", values, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andteachertitleidNotIn(List<String> values) {
            addCriterion("teacherTitleID not in", values, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andteachertitleidBetween(String value1, String value2) {
            addCriterion("teacherTitleID between", value1, value2, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andteachertitleidNotBetween(String value1, String value2) {
            addCriterion("teacherTitleID not between", value1, value2, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("checkTime is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("checkTime is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(Date value) {
            addCriterionForJDBCDate("checkTime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("checkTime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(Date value) {
            addCriterionForJDBCDate("checkTime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkTime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(Date value) {
            addCriterionForJDBCDate("checkTime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkTime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<Date> values) {
            addCriterionForJDBCDate("checkTime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("checkTime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkTime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkTime not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andCheckpersonIsNull() {
            addCriterion("checkPerson is null");
            return (Criteria) this;
        }

        public Criteria andCheckpersonIsNotNull() {
            addCriterion("checkPerson is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpersonEqualTo(String value) {
            addCriterion("checkPerson =", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotEqualTo(String value) {
            addCriterion("checkPerson <>", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonGreaterThan(String value) {
            addCriterion("checkPerson >", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonGreaterThanOrEqualTo(String value) {
            addCriterion("checkPerson >=", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLessThan(String value) {
            addCriterion("checkPerson <", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLessThanOrEqualTo(String value) {
            addCriterion("checkPerson <=", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLike(String value) {
            addCriterion("checkPerson like", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotLike(String value) {
            addCriterion("checkPerson not like", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonIn(List<String> values) {
            addCriterion("checkPerson in", values, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotIn(List<String> values) {
            addCriterion("checkPerson not in", values, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonBetween(String value1, String value2) {
            addCriterion("checkPerson between", value1, value2, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotBetween(String value1, String value2) {
            addCriterion("checkPerson not between", value1, value2, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckresultIsNull() {
            addCriterion("checkResult is null");
            return (Criteria) this;
        }

        public Criteria andCheckresultIsNotNull() {
            addCriterion("checkResult is not null");
            return (Criteria) this;
        }

        public Criteria andCheckresultEqualTo(String value) {
            addCriterion("checkResult =", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotEqualTo(String value) {
            addCriterion("checkResult <>", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThan(String value) {
            addCriterion("checkResult >", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThanOrEqualTo(String value) {
            addCriterion("checkResult >=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThan(String value) {
            addCriterion("checkResult <", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThanOrEqualTo(String value) {
            addCriterion("checkResult <=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLike(String value) {
            addCriterion("checkResult like", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotLike(String value) {
            addCriterion("checkResult not like", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultIn(List<String> values) {
            addCriterion("checkResult in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotIn(List<String> values) {
            addCriterion("checkResult not in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultBetween(String value1, String value2) {
            addCriterion("checkResult between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotBetween(String value1, String value2) {
            addCriterion("checkResult not between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckdescIsNull() {
            addCriterion("checkDesc is null");
            return (Criteria) this;
        }

        public Criteria andCheckdescIsNotNull() {
            addCriterion("checkDesc is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdescEqualTo(String value) {
            addCriterion("checkDesc =", value, "checkdesc");
            return (Criteria) this;
        }

        public Criteria andCheckdescNotEqualTo(String value) {
            addCriterion("checkDesc <>", value, "checkdesc");
            return (Criteria) this;
        }

        public Criteria andCheckdescGreaterThan(String value) {
            addCriterion("checkDesc >", value, "checkdesc");
            return (Criteria) this;
        }

        public Criteria andCheckdescGreaterThanOrEqualTo(String value) {
            addCriterion("checkDesc >=", value, "checkdesc");
            return (Criteria) this;
        }

        public Criteria andCheckdescLessThan(String value) {
            addCriterion("checkDesc <", value, "checkdesc");
            return (Criteria) this;
        }

        public Criteria andCheckdescLessThanOrEqualTo(String value) {
            addCriterion("checkDesc <=", value, "checkdesc");
            return (Criteria) this;
        }

        public Criteria andCheckdescLike(String value) {
            addCriterion("checkDesc like", value, "checkdesc");
            return (Criteria) this;
        }

        public Criteria andCheckdescNotLike(String value) {
            addCriterion("checkDesc not like", value, "checkdesc");
            return (Criteria) this;
        }

        public Criteria andCheckdescIn(List<String> values) {
            addCriterion("checkDesc in", values, "checkdesc");
            return (Criteria) this;
        }

        public Criteria andCheckdescNotIn(List<String> values) {
            addCriterion("checkDesc not in", values, "checkdesc");
            return (Criteria) this;
        }

        public Criteria andCheckdescBetween(String value1, String value2) {
            addCriterion("checkDesc between", value1, value2, "checkdesc");
            return (Criteria) this;
        }

        public Criteria andCheckdescNotBetween(String value1, String value2) {
            addCriterion("checkDesc not between", value1, value2, "checkdesc");
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