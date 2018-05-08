package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutgradesignsurebookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutgradesignsurebookExample() {
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

        public Criteria andSureidIsNull() {
            addCriterion("sureID is null");
            return (Criteria) this;
        }

        public Criteria andSureidIsNotNull() {
            addCriterion("sureID is not null");
            return (Criteria) this;
        }

        public Criteria andSureidEqualTo(String value) {
            addCriterion("sureID =", value, "sureid");
            return (Criteria) this;
        }

        public Criteria andSureidNotEqualTo(String value) {
            addCriterion("sureID <>", value, "sureid");
            return (Criteria) this;
        }

        public Criteria andSureidGreaterThan(String value) {
            addCriterion("sureID >", value, "sureid");
            return (Criteria) this;
        }

        public Criteria andSureidGreaterThanOrEqualTo(String value) {
            addCriterion("sureID >=", value, "sureid");
            return (Criteria) this;
        }

        public Criteria andSureidLessThan(String value) {
            addCriterion("sureID <", value, "sureid");
            return (Criteria) this;
        }

        public Criteria andSureidLessThanOrEqualTo(String value) {
            addCriterion("sureID <=", value, "sureid");
            return (Criteria) this;
        }

        public Criteria andSureidLike(String value) {
            addCriterion("sureID like", value, "sureid");
            return (Criteria) this;
        }

        public Criteria andSureidNotLike(String value) {
            addCriterion("sureID not like", value, "sureid");
            return (Criteria) this;
        }

        public Criteria andSureidIn(List<String> values) {
            addCriterion("sureID in", values, "sureid");
            return (Criteria) this;
        }

        public Criteria andSureidNotIn(List<String> values) {
            addCriterion("sureID not in", values, "sureid");
            return (Criteria) this;
        }

        public Criteria andSureidBetween(String value1, String value2) {
            addCriterion("sureID between", value1, value2, "sureid");
            return (Criteria) this;
        }

        public Criteria andSureidNotBetween(String value1, String value2) {
            addCriterion("sureID not between", value1, value2, "sureid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidIsNull() {
            addCriterion("outsideApplyID is null");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidIsNotNull() {
            addCriterion("outsideApplyID is not null");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidEqualTo(String value) {
            addCriterion("outsideApplyID =", value, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidNotEqualTo(String value) {
            addCriterion("outsideApplyID <>", value, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidGreaterThan(String value) {
            addCriterion("outsideApplyID >", value, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidGreaterThanOrEqualTo(String value) {
            addCriterion("outsideApplyID >=", value, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidLessThan(String value) {
            addCriterion("outsideApplyID <", value, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidLessThanOrEqualTo(String value) {
            addCriterion("outsideApplyID <=", value, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidLike(String value) {
            addCriterion("outsideApplyID like", value, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidNotLike(String value) {
            addCriterion("outsideApplyID not like", value, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidIn(List<String> values) {
            addCriterion("outsideApplyID in", values, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidNotIn(List<String> values) {
            addCriterion("outsideApplyID not in", values, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidBetween(String value1, String value2) {
            addCriterion("outsideApplyID between", value1, value2, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidNotBetween(String value1, String value2) {
            addCriterion("outsideApplyID not between", value1, value2, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andSurenameIsNull() {
            addCriterion("sureName is null");
            return (Criteria) this;
        }

        public Criteria andSurenameIsNotNull() {
            addCriterion("sureName is not null");
            return (Criteria) this;
        }

        public Criteria andSurenameEqualTo(String value) {
            addCriterion("sureName =", value, "surename");
            return (Criteria) this;
        }

        public Criteria andSurenameNotEqualTo(String value) {
            addCriterion("sureName <>", value, "surename");
            return (Criteria) this;
        }

        public Criteria andSurenameGreaterThan(String value) {
            addCriterion("sureName >", value, "surename");
            return (Criteria) this;
        }

        public Criteria andSurenameGreaterThanOrEqualTo(String value) {
            addCriterion("sureName >=", value, "surename");
            return (Criteria) this;
        }

        public Criteria andSurenameLessThan(String value) {
            addCriterion("sureName <", value, "surename");
            return (Criteria) this;
        }

        public Criteria andSurenameLessThanOrEqualTo(String value) {
            addCriterion("sureName <=", value, "surename");
            return (Criteria) this;
        }

        public Criteria andSurenameLike(String value) {
            addCriterion("sureName like", value, "surename");
            return (Criteria) this;
        }

        public Criteria andSurenameNotLike(String value) {
            addCriterion("sureName not like", value, "surename");
            return (Criteria) this;
        }

        public Criteria andSurenameIn(List<String> values) {
            addCriterion("sureName in", values, "surename");
            return (Criteria) this;
        }

        public Criteria andSurenameNotIn(List<String> values) {
            addCriterion("sureName not in", values, "surename");
            return (Criteria) this;
        }

        public Criteria andSurenameBetween(String value1, String value2) {
            addCriterion("sureName between", value1, value2, "surename");
            return (Criteria) this;
        }

        public Criteria andSurenameNotBetween(String value1, String value2) {
            addCriterion("sureName not between", value1, value2, "surename");
            return (Criteria) this;
        }

        public Criteria andStudentsignurlIsNull() {
            addCriterion("studentSignUrl is null");
            return (Criteria) this;
        }

        public Criteria andStudentsignurlIsNotNull() {
            addCriterion("studentSignUrl is not null");
            return (Criteria) this;
        }

        public Criteria andStudentsignurlEqualTo(String value) {
            addCriterion("studentSignUrl =", value, "studentsignurl");
            return (Criteria) this;
        }

        public Criteria andStudentsignurlNotEqualTo(String value) {
            addCriterion("studentSignUrl <>", value, "studentsignurl");
            return (Criteria) this;
        }

        public Criteria andStudentsignurlGreaterThan(String value) {
            addCriterion("studentSignUrl >", value, "studentsignurl");
            return (Criteria) this;
        }

        public Criteria andStudentsignurlGreaterThanOrEqualTo(String value) {
            addCriterion("studentSignUrl >=", value, "studentsignurl");
            return (Criteria) this;
        }

        public Criteria andStudentsignurlLessThan(String value) {
            addCriterion("studentSignUrl <", value, "studentsignurl");
            return (Criteria) this;
        }

        public Criteria andStudentsignurlLessThanOrEqualTo(String value) {
            addCriterion("studentSignUrl <=", value, "studentsignurl");
            return (Criteria) this;
        }

        public Criteria andStudentsignurlLike(String value) {
            addCriterion("studentSignUrl like", value, "studentsignurl");
            return (Criteria) this;
        }

        public Criteria andStudentsignurlNotLike(String value) {
            addCriterion("studentSignUrl not like", value, "studentsignurl");
            return (Criteria) this;
        }

        public Criteria andStudentsignurlIn(List<String> values) {
            addCriterion("studentSignUrl in", values, "studentsignurl");
            return (Criteria) this;
        }

        public Criteria andStudentsignurlNotIn(List<String> values) {
            addCriterion("studentSignUrl not in", values, "studentsignurl");
            return (Criteria) this;
        }

        public Criteria andStudentsignurlBetween(String value1, String value2) {
            addCriterion("studentSignUrl between", value1, value2, "studentsignurl");
            return (Criteria) this;
        }

        public Criteria andStudentsignurlNotBetween(String value1, String value2) {
            addCriterion("studentSignUrl not between", value1, value2, "studentsignurl");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNull() {
            addCriterion("signTime is null");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNotNull() {
            addCriterion("signTime is not null");
            return (Criteria) this;
        }

        public Criteria andSigntimeEqualTo(Date value) {
            addCriterion("signTime =", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotEqualTo(Date value) {
            addCriterion("signTime <>", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThan(Date value) {
            addCriterion("signTime >", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("signTime >=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThan(Date value) {
            addCriterion("signTime <", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThanOrEqualTo(Date value) {
            addCriterion("signTime <=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeIn(List<Date> values) {
            addCriterion("signTime in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotIn(List<Date> values) {
            addCriterion("signTime not in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeBetween(Date value1, Date value2) {
            addCriterion("signTime between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotBetween(Date value1, Date value2) {
            addCriterion("signTime not between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andIscommitIsNull() {
            addCriterion("iscommit is null");
            return (Criteria) this;
        }

        public Criteria andIscommitIsNotNull() {
            addCriterion("iscommit is not null");
            return (Criteria) this;
        }

        public Criteria andIscommitEqualTo(String value) {
            addCriterion("iscommit =", value, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitNotEqualTo(String value) {
            addCriterion("iscommit <>", value, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitGreaterThan(String value) {
            addCriterion("iscommit >", value, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitGreaterThanOrEqualTo(String value) {
            addCriterion("iscommit >=", value, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitLessThan(String value) {
            addCriterion("iscommit <", value, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitLessThanOrEqualTo(String value) {
            addCriterion("iscommit <=", value, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitLike(String value) {
            addCriterion("iscommit like", value, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitNotLike(String value) {
            addCriterion("iscommit not like", value, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitIn(List<String> values) {
            addCriterion("iscommit in", values, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitNotIn(List<String> values) {
            addCriterion("iscommit not in", values, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitBetween(String value1, String value2) {
            addCriterion("iscommit between", value1, value2, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitNotBetween(String value1, String value2) {
            addCriterion("iscommit not between", value1, value2, "iscommit");
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