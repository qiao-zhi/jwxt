package cn.xm.jwxt.bean.arrangeCourse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoursearrangementbaseinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoursearrangementbaseinfoExample() {
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

        public Criteria andArrangebaseinfoidIsNull() {
            addCriterion("arrangeBaseInfoId is null");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidIsNotNull() {
            addCriterion("arrangeBaseInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidEqualTo(String value) {
            addCriterion("arrangeBaseInfoId =", value, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidNotEqualTo(String value) {
            addCriterion("arrangeBaseInfoId <>", value, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidGreaterThan(String value) {
            addCriterion("arrangeBaseInfoId >", value, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidGreaterThanOrEqualTo(String value) {
            addCriterion("arrangeBaseInfoId >=", value, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidLessThan(String value) {
            addCriterion("arrangeBaseInfoId <", value, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidLessThanOrEqualTo(String value) {
            addCriterion("arrangeBaseInfoId <=", value, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidLike(String value) {
            addCriterion("arrangeBaseInfoId like", value, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidNotLike(String value) {
            addCriterion("arrangeBaseInfoId not like", value, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidIn(List<String> values) {
            addCriterion("arrangeBaseInfoId in", values, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidNotIn(List<String> values) {
            addCriterion("arrangeBaseInfoId not in", values, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidBetween(String value1, String value2) {
            addCriterion("arrangeBaseInfoId between", value1, value2, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidNotBetween(String value1, String value2) {
            addCriterion("arrangeBaseInfoId not between", value1, value2, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangepersonnameIsNull() {
            addCriterion("arrangePersonName is null");
            return (Criteria) this;
        }

        public Criteria andArrangepersonnameIsNotNull() {
            addCriterion("arrangePersonName is not null");
            return (Criteria) this;
        }

        public Criteria andArrangepersonnameEqualTo(String value) {
            addCriterion("arrangePersonName =", value, "arrangepersonname");
            return (Criteria) this;
        }

        public Criteria andArrangepersonnameNotEqualTo(String value) {
            addCriterion("arrangePersonName <>", value, "arrangepersonname");
            return (Criteria) this;
        }

        public Criteria andArrangepersonnameGreaterThan(String value) {
            addCriterion("arrangePersonName >", value, "arrangepersonname");
            return (Criteria) this;
        }

        public Criteria andArrangepersonnameGreaterThanOrEqualTo(String value) {
            addCriterion("arrangePersonName >=", value, "arrangepersonname");
            return (Criteria) this;
        }

        public Criteria andArrangepersonnameLessThan(String value) {
            addCriterion("arrangePersonName <", value, "arrangepersonname");
            return (Criteria) this;
        }

        public Criteria andArrangepersonnameLessThanOrEqualTo(String value) {
            addCriterion("arrangePersonName <=", value, "arrangepersonname");
            return (Criteria) this;
        }

        public Criteria andArrangepersonnameLike(String value) {
            addCriterion("arrangePersonName like", value, "arrangepersonname");
            return (Criteria) this;
        }

        public Criteria andArrangepersonnameNotLike(String value) {
            addCriterion("arrangePersonName not like", value, "arrangepersonname");
            return (Criteria) this;
        }

        public Criteria andArrangepersonnameIn(List<String> values) {
            addCriterion("arrangePersonName in", values, "arrangepersonname");
            return (Criteria) this;
        }

        public Criteria andArrangepersonnameNotIn(List<String> values) {
            addCriterion("arrangePersonName not in", values, "arrangepersonname");
            return (Criteria) this;
        }

        public Criteria andArrangepersonnameBetween(String value1, String value2) {
            addCriterion("arrangePersonName between", value1, value2, "arrangepersonname");
            return (Criteria) this;
        }

        public Criteria andArrangepersonnameNotBetween(String value1, String value2) {
            addCriterion("arrangePersonName not between", value1, value2, "arrangepersonname");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeIsNull() {
            addCriterion("courseArrangeTime is null");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeIsNotNull() {
            addCriterion("courseArrangeTime is not null");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeEqualTo(Date value) {
            addCriterion("courseArrangeTime =", value, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeNotEqualTo(Date value) {
            addCriterion("courseArrangeTime <>", value, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeGreaterThan(Date value) {
            addCriterion("courseArrangeTime >", value, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("courseArrangeTime >=", value, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeLessThan(Date value) {
            addCriterion("courseArrangeTime <", value, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeLessThanOrEqualTo(Date value) {
            addCriterion("courseArrangeTime <=", value, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeIn(List<Date> values) {
            addCriterion("courseArrangeTime in", values, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeNotIn(List<Date> values) {
            addCriterion("courseArrangeTime not in", values, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeBetween(Date value1, Date value2) {
            addCriterion("courseArrangeTime between", value1, value2, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeNotBetween(Date value1, Date value2) {
            addCriterion("courseArrangeTime not between", value1, value2, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangenameIsNull() {
            addCriterion("courseArrangeName is null");
            return (Criteria) this;
        }

        public Criteria andCoursearrangenameIsNotNull() {
            addCriterion("courseArrangeName is not null");
            return (Criteria) this;
        }

        public Criteria andCoursearrangenameEqualTo(String value) {
            addCriterion("courseArrangeName =", value, "coursearrangename");
            return (Criteria) this;
        }

        public Criteria andCoursearrangenameNotEqualTo(String value) {
            addCriterion("courseArrangeName <>", value, "coursearrangename");
            return (Criteria) this;
        }

        public Criteria andCoursearrangenameGreaterThan(String value) {
            addCriterion("courseArrangeName >", value, "coursearrangename");
            return (Criteria) this;
        }

        public Criteria andCoursearrangenameGreaterThanOrEqualTo(String value) {
            addCriterion("courseArrangeName >=", value, "coursearrangename");
            return (Criteria) this;
        }

        public Criteria andCoursearrangenameLessThan(String value) {
            addCriterion("courseArrangeName <", value, "coursearrangename");
            return (Criteria) this;
        }

        public Criteria andCoursearrangenameLessThanOrEqualTo(String value) {
            addCriterion("courseArrangeName <=", value, "coursearrangename");
            return (Criteria) this;
        }

        public Criteria andCoursearrangenameLike(String value) {
            addCriterion("courseArrangeName like", value, "coursearrangename");
            return (Criteria) this;
        }

        public Criteria andCoursearrangenameNotLike(String value) {
            addCriterion("courseArrangeName not like", value, "coursearrangename");
            return (Criteria) this;
        }

        public Criteria andCoursearrangenameIn(List<String> values) {
            addCriterion("courseArrangeName in", values, "coursearrangename");
            return (Criteria) this;
        }

        public Criteria andCoursearrangenameNotIn(List<String> values) {
            addCriterion("courseArrangeName not in", values, "coursearrangename");
            return (Criteria) this;
        }

        public Criteria andCoursearrangenameBetween(String value1, String value2) {
            addCriterion("courseArrangeName between", value1, value2, "coursearrangename");
            return (Criteria) this;
        }

        public Criteria andCoursearrangenameNotBetween(String value1, String value2) {
            addCriterion("courseArrangeName not between", value1, value2, "coursearrangename");
            return (Criteria) this;
        }

        public Criteria andYearnumIsNull() {
            addCriterion("yearNum is null");
            return (Criteria) this;
        }

        public Criteria andYearnumIsNotNull() {
            addCriterion("yearNum is not null");
            return (Criteria) this;
        }

        public Criteria andYearnumEqualTo(String value) {
            addCriterion("yearNum =", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumNotEqualTo(String value) {
            addCriterion("yearNum <>", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumGreaterThan(String value) {
            addCriterion("yearNum >", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumGreaterThanOrEqualTo(String value) {
            addCriterion("yearNum >=", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumLessThan(String value) {
            addCriterion("yearNum <", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumLessThanOrEqualTo(String value) {
            addCriterion("yearNum <=", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumLike(String value) {
            addCriterion("yearNum like", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumNotLike(String value) {
            addCriterion("yearNum not like", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumIn(List<String> values) {
            addCriterion("yearNum in", values, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumNotIn(List<String> values) {
            addCriterion("yearNum not in", values, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumBetween(String value1, String value2) {
            addCriterion("yearNum between", value1, value2, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumNotBetween(String value1, String value2) {
            addCriterion("yearNum not between", value1, value2, "yearnum");
            return (Criteria) this;
        }

        public Criteria andSemesterIsNull() {
            addCriterion("semester is null");
            return (Criteria) this;
        }

        public Criteria andSemesterIsNotNull() {
            addCriterion("semester is not null");
            return (Criteria) this;
        }

        public Criteria andSemesterEqualTo(String value) {
            addCriterion("semester =", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotEqualTo(String value) {
            addCriterion("semester <>", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterGreaterThan(String value) {
            addCriterion("semester >", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterGreaterThanOrEqualTo(String value) {
            addCriterion("semester >=", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterLessThan(String value) {
            addCriterion("semester <", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterLessThanOrEqualTo(String value) {
            addCriterion("semester <=", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterLike(String value) {
            addCriterion("semester like", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotLike(String value) {
            addCriterion("semester not like", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterIn(List<String> values) {
            addCriterion("semester in", values, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotIn(List<String> values) {
            addCriterion("semester not in", values, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterBetween(String value1, String value2) {
            addCriterion("semester between", value1, value2, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotBetween(String value1, String value2) {
            addCriterion("semester not between", value1, value2, "semester");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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