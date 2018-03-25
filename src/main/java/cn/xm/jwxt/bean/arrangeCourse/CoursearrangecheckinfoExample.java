package cn.xm.jwxt.bean.arrangeCourse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoursearrangecheckinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoursearrangecheckinfoExample() {
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

        public Criteria andCoursearrangecheckidIsNull() {
            addCriterion("courseArrangeCheckID is null");
            return (Criteria) this;
        }

        public Criteria andCoursearrangecheckidIsNotNull() {
            addCriterion("courseArrangeCheckID is not null");
            return (Criteria) this;
        }

        public Criteria andCoursearrangecheckidEqualTo(Integer value) {
            addCriterion("courseArrangeCheckID =", value, "coursearrangecheckid");
            return (Criteria) this;
        }

        public Criteria andCoursearrangecheckidNotEqualTo(Integer value) {
            addCriterion("courseArrangeCheckID <>", value, "coursearrangecheckid");
            return (Criteria) this;
        }

        public Criteria andCoursearrangecheckidGreaterThan(Integer value) {
            addCriterion("courseArrangeCheckID >", value, "coursearrangecheckid");
            return (Criteria) this;
        }

        public Criteria andCoursearrangecheckidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseArrangeCheckID >=", value, "coursearrangecheckid");
            return (Criteria) this;
        }

        public Criteria andCoursearrangecheckidLessThan(Integer value) {
            addCriterion("courseArrangeCheckID <", value, "coursearrangecheckid");
            return (Criteria) this;
        }

        public Criteria andCoursearrangecheckidLessThanOrEqualTo(Integer value) {
            addCriterion("courseArrangeCheckID <=", value, "coursearrangecheckid");
            return (Criteria) this;
        }

        public Criteria andCoursearrangecheckidIn(List<Integer> values) {
            addCriterion("courseArrangeCheckID in", values, "coursearrangecheckid");
            return (Criteria) this;
        }

        public Criteria andCoursearrangecheckidNotIn(List<Integer> values) {
            addCriterion("courseArrangeCheckID not in", values, "coursearrangecheckid");
            return (Criteria) this;
        }

        public Criteria andCoursearrangecheckidBetween(Integer value1, Integer value2) {
            addCriterion("courseArrangeCheckID between", value1, value2, "coursearrangecheckid");
            return (Criteria) this;
        }

        public Criteria andCoursearrangecheckidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseArrangeCheckID not between", value1, value2, "coursearrangecheckid");
            return (Criteria) this;
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

        public Criteria andCheckpsrsonnameIsNull() {
            addCriterion("checkPsrsonName is null");
            return (Criteria) this;
        }

        public Criteria andCheckpsrsonnameIsNotNull() {
            addCriterion("checkPsrsonName is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpsrsonnameEqualTo(String value) {
            addCriterion("checkPsrsonName =", value, "checkpsrsonname");
            return (Criteria) this;
        }

        public Criteria andCheckpsrsonnameNotEqualTo(String value) {
            addCriterion("checkPsrsonName <>", value, "checkpsrsonname");
            return (Criteria) this;
        }

        public Criteria andCheckpsrsonnameGreaterThan(String value) {
            addCriterion("checkPsrsonName >", value, "checkpsrsonname");
            return (Criteria) this;
        }

        public Criteria andCheckpsrsonnameGreaterThanOrEqualTo(String value) {
            addCriterion("checkPsrsonName >=", value, "checkpsrsonname");
            return (Criteria) this;
        }

        public Criteria andCheckpsrsonnameLessThan(String value) {
            addCriterion("checkPsrsonName <", value, "checkpsrsonname");
            return (Criteria) this;
        }

        public Criteria andCheckpsrsonnameLessThanOrEqualTo(String value) {
            addCriterion("checkPsrsonName <=", value, "checkpsrsonname");
            return (Criteria) this;
        }

        public Criteria andCheckpsrsonnameLike(String value) {
            addCriterion("checkPsrsonName like", value, "checkpsrsonname");
            return (Criteria) this;
        }

        public Criteria andCheckpsrsonnameNotLike(String value) {
            addCriterion("checkPsrsonName not like", value, "checkpsrsonname");
            return (Criteria) this;
        }

        public Criteria andCheckpsrsonnameIn(List<String> values) {
            addCriterion("checkPsrsonName in", values, "checkpsrsonname");
            return (Criteria) this;
        }

        public Criteria andCheckpsrsonnameNotIn(List<String> values) {
            addCriterion("checkPsrsonName not in", values, "checkpsrsonname");
            return (Criteria) this;
        }

        public Criteria andCheckpsrsonnameBetween(String value1, String value2) {
            addCriterion("checkPsrsonName between", value1, value2, "checkpsrsonname");
            return (Criteria) this;
        }

        public Criteria andCheckpsrsonnameNotBetween(String value1, String value2) {
            addCriterion("checkPsrsonName not between", value1, value2, "checkpsrsonname");
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
            addCriterion("checkTime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(Date value) {
            addCriterion("checkTime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(Date value) {
            addCriterion("checkTime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("checkTime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(Date value) {
            addCriterion("checkTime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(Date value) {
            addCriterion("checkTime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<Date> values) {
            addCriterion("checkTime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<Date> values) {
            addCriterion("checkTime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(Date value1, Date value2) {
            addCriterion("checkTime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(Date value1, Date value2) {
            addCriterion("checkTime not between", value1, value2, "checktime");
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

        public Criteria andCheckadviceIsNull() {
            addCriterion("checkAdvice is null");
            return (Criteria) this;
        }

        public Criteria andCheckadviceIsNotNull() {
            addCriterion("checkAdvice is not null");
            return (Criteria) this;
        }

        public Criteria andCheckadviceEqualTo(String value) {
            addCriterion("checkAdvice =", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceNotEqualTo(String value) {
            addCriterion("checkAdvice <>", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceGreaterThan(String value) {
            addCriterion("checkAdvice >", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceGreaterThanOrEqualTo(String value) {
            addCriterion("checkAdvice >=", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceLessThan(String value) {
            addCriterion("checkAdvice <", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceLessThanOrEqualTo(String value) {
            addCriterion("checkAdvice <=", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceLike(String value) {
            addCriterion("checkAdvice like", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceNotLike(String value) {
            addCriterion("checkAdvice not like", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceIn(List<String> values) {
            addCriterion("checkAdvice in", values, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceNotIn(List<String> values) {
            addCriterion("checkAdvice not in", values, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceBetween(String value1, String value2) {
            addCriterion("checkAdvice between", value1, value2, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceNotBetween(String value1, String value2) {
            addCriterion("checkAdvice not between", value1, value2, "checkadvice");
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