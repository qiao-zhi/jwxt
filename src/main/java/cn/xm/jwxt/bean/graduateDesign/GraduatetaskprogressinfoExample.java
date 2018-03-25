package cn.xm.jwxt.bean.graduateDesign;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GraduatetaskprogressinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GraduatetaskprogressinfoExample() {
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

        public Criteria andProgressidIsNull() {
            addCriterion("progressId is null");
            return (Criteria) this;
        }

        public Criteria andProgressidIsNotNull() {
            addCriterion("progressId is not null");
            return (Criteria) this;
        }

        public Criteria andProgressidEqualTo(Integer value) {
            addCriterion("progressId =", value, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidNotEqualTo(Integer value) {
            addCriterion("progressId <>", value, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidGreaterThan(Integer value) {
            addCriterion("progressId >", value, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("progressId >=", value, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidLessThan(Integer value) {
            addCriterion("progressId <", value, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidLessThanOrEqualTo(Integer value) {
            addCriterion("progressId <=", value, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidIn(List<Integer> values) {
            addCriterion("progressId in", values, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidNotIn(List<Integer> values) {
            addCriterion("progressId not in", values, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidBetween(Integer value1, Integer value2) {
            addCriterion("progressId between", value1, value2, "progressid");
            return (Criteria) this;
        }

        public Criteria andProgressidNotBetween(Integer value1, Integer value2) {
            addCriterion("progressId not between", value1, value2, "progressid");
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

        public Criteria andTasktimerangeIsNull() {
            addCriterion("taskTimeRange is null");
            return (Criteria) this;
        }

        public Criteria andTasktimerangeIsNotNull() {
            addCriterion("taskTimeRange is not null");
            return (Criteria) this;
        }

        public Criteria andTasktimerangeEqualTo(String value) {
            addCriterion("taskTimeRange =", value, "tasktimerange");
            return (Criteria) this;
        }

        public Criteria andTasktimerangeNotEqualTo(String value) {
            addCriterion("taskTimeRange <>", value, "tasktimerange");
            return (Criteria) this;
        }

        public Criteria andTasktimerangeGreaterThan(String value) {
            addCriterion("taskTimeRange >", value, "tasktimerange");
            return (Criteria) this;
        }

        public Criteria andTasktimerangeGreaterThanOrEqualTo(String value) {
            addCriterion("taskTimeRange >=", value, "tasktimerange");
            return (Criteria) this;
        }

        public Criteria andTasktimerangeLessThan(String value) {
            addCriterion("taskTimeRange <", value, "tasktimerange");
            return (Criteria) this;
        }

        public Criteria andTasktimerangeLessThanOrEqualTo(String value) {
            addCriterion("taskTimeRange <=", value, "tasktimerange");
            return (Criteria) this;
        }

        public Criteria andTasktimerangeLike(String value) {
            addCriterion("taskTimeRange like", value, "tasktimerange");
            return (Criteria) this;
        }

        public Criteria andTasktimerangeNotLike(String value) {
            addCriterion("taskTimeRange not like", value, "tasktimerange");
            return (Criteria) this;
        }

        public Criteria andTasktimerangeIn(List<String> values) {
            addCriterion("taskTimeRange in", values, "tasktimerange");
            return (Criteria) this;
        }

        public Criteria andTasktimerangeNotIn(List<String> values) {
            addCriterion("taskTimeRange not in", values, "tasktimerange");
            return (Criteria) this;
        }

        public Criteria andTasktimerangeBetween(String value1, String value2) {
            addCriterion("taskTimeRange between", value1, value2, "tasktimerange");
            return (Criteria) this;
        }

        public Criteria andTasktimerangeNotBetween(String value1, String value2) {
            addCriterion("taskTimeRange not between", value1, value2, "tasktimerange");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNull() {
            addCriterion("editTime is null");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNotNull() {
            addCriterion("editTime is not null");
            return (Criteria) this;
        }

        public Criteria andEdittimeEqualTo(Date value) {
            addCriterionForJDBCDate("editTime =", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("editTime <>", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThan(Date value) {
            addCriterionForJDBCDate("editTime >", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("editTime >=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThan(Date value) {
            addCriterionForJDBCDate("editTime <", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("editTime <=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIn(List<Date> values) {
            addCriterionForJDBCDate("editTime in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("editTime not in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("editTime between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("editTime not between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andProgresssortIsNull() {
            addCriterion("progressSort is null");
            return (Criteria) this;
        }

        public Criteria andProgresssortIsNotNull() {
            addCriterion("progressSort is not null");
            return (Criteria) this;
        }

        public Criteria andProgresssortEqualTo(String value) {
            addCriterion("progressSort =", value, "progresssort");
            return (Criteria) this;
        }

        public Criteria andProgresssortNotEqualTo(String value) {
            addCriterion("progressSort <>", value, "progresssort");
            return (Criteria) this;
        }

        public Criteria andProgresssortGreaterThan(String value) {
            addCriterion("progressSort >", value, "progresssort");
            return (Criteria) this;
        }

        public Criteria andProgresssortGreaterThanOrEqualTo(String value) {
            addCriterion("progressSort >=", value, "progresssort");
            return (Criteria) this;
        }

        public Criteria andProgresssortLessThan(String value) {
            addCriterion("progressSort <", value, "progresssort");
            return (Criteria) this;
        }

        public Criteria andProgresssortLessThanOrEqualTo(String value) {
            addCriterion("progressSort <=", value, "progresssort");
            return (Criteria) this;
        }

        public Criteria andProgresssortLike(String value) {
            addCriterion("progressSort like", value, "progresssort");
            return (Criteria) this;
        }

        public Criteria andProgresssortNotLike(String value) {
            addCriterion("progressSort not like", value, "progresssort");
            return (Criteria) this;
        }

        public Criteria andProgresssortIn(List<String> values) {
            addCriterion("progressSort in", values, "progresssort");
            return (Criteria) this;
        }

        public Criteria andProgresssortNotIn(List<String> values) {
            addCriterion("progressSort not in", values, "progresssort");
            return (Criteria) this;
        }

        public Criteria andProgresssortBetween(String value1, String value2) {
            addCriterion("progressSort between", value1, value2, "progresssort");
            return (Criteria) this;
        }

        public Criteria andProgresssortNotBetween(String value1, String value2) {
            addCriterion("progressSort not between", value1, value2, "progresssort");
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