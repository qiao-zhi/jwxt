package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckoutgradesigninfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckoutgradesigninfoExample() {
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

        public Criteria andCheckoutapplyidIsNull() {
            addCriterion("checkOutApplyID is null");
            return (Criteria) this;
        }

        public Criteria andCheckoutapplyidIsNotNull() {
            addCriterion("checkOutApplyID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckoutapplyidEqualTo(String value) {
            addCriterion("checkOutApplyID =", value, "checkoutapplyid");
            return (Criteria) this;
        }

        public Criteria andCheckoutapplyidNotEqualTo(String value) {
            addCriterion("checkOutApplyID <>", value, "checkoutapplyid");
            return (Criteria) this;
        }

        public Criteria andCheckoutapplyidGreaterThan(String value) {
            addCriterion("checkOutApplyID >", value, "checkoutapplyid");
            return (Criteria) this;
        }

        public Criteria andCheckoutapplyidGreaterThanOrEqualTo(String value) {
            addCriterion("checkOutApplyID >=", value, "checkoutapplyid");
            return (Criteria) this;
        }

        public Criteria andCheckoutapplyidLessThan(String value) {
            addCriterion("checkOutApplyID <", value, "checkoutapplyid");
            return (Criteria) this;
        }

        public Criteria andCheckoutapplyidLessThanOrEqualTo(String value) {
            addCriterion("checkOutApplyID <=", value, "checkoutapplyid");
            return (Criteria) this;
        }

        public Criteria andCheckoutapplyidLike(String value) {
            addCriterion("checkOutApplyID like", value, "checkoutapplyid");
            return (Criteria) this;
        }

        public Criteria andCheckoutapplyidNotLike(String value) {
            addCriterion("checkOutApplyID not like", value, "checkoutapplyid");
            return (Criteria) this;
        }

        public Criteria andCheckoutapplyidIn(List<String> values) {
            addCriterion("checkOutApplyID in", values, "checkoutapplyid");
            return (Criteria) this;
        }

        public Criteria andCheckoutapplyidNotIn(List<String> values) {
            addCriterion("checkOutApplyID not in", values, "checkoutapplyid");
            return (Criteria) this;
        }

        public Criteria andCheckoutapplyidBetween(String value1, String value2) {
            addCriterion("checkOutApplyID between", value1, value2, "checkoutapplyid");
            return (Criteria) this;
        }

        public Criteria andCheckoutapplyidNotBetween(String value1, String value2) {
            addCriterion("checkOutApplyID not between", value1, value2, "checkoutapplyid");
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

        public Criteria andCheckpeopleIsNull() {
            addCriterion("checkPeople is null");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleIsNotNull() {
            addCriterion("checkPeople is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleEqualTo(String value) {
            addCriterion("checkPeople =", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleNotEqualTo(String value) {
            addCriterion("checkPeople <>", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleGreaterThan(String value) {
            addCriterion("checkPeople >", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("checkPeople >=", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleLessThan(String value) {
            addCriterion("checkPeople <", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleLessThanOrEqualTo(String value) {
            addCriterion("checkPeople <=", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleLike(String value) {
            addCriterion("checkPeople like", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleNotLike(String value) {
            addCriterion("checkPeople not like", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleIn(List<String> values) {
            addCriterion("checkPeople in", values, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleNotIn(List<String> values) {
            addCriterion("checkPeople not in", values, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleBetween(String value1, String value2) {
            addCriterion("checkPeople between", value1, value2, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleNotBetween(String value1, String value2) {
            addCriterion("checkPeople not between", value1, value2, "checkpeople");
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

        public Criteria andTeachersignIsNull() {
            addCriterion("teacherSign is null");
            return (Criteria) this;
        }

        public Criteria andTeachersignIsNotNull() {
            addCriterion("teacherSign is not null");
            return (Criteria) this;
        }

        public Criteria andTeachersignEqualTo(String value) {
            addCriterion("teacherSign =", value, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignNotEqualTo(String value) {
            addCriterion("teacherSign <>", value, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignGreaterThan(String value) {
            addCriterion("teacherSign >", value, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignGreaterThanOrEqualTo(String value) {
            addCriterion("teacherSign >=", value, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignLessThan(String value) {
            addCriterion("teacherSign <", value, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignLessThanOrEqualTo(String value) {
            addCriterion("teacherSign <=", value, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignLike(String value) {
            addCriterion("teacherSign like", value, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignNotLike(String value) {
            addCriterion("teacherSign not like", value, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignIn(List<String> values) {
            addCriterion("teacherSign in", values, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignNotIn(List<String> values) {
            addCriterion("teacherSign not in", values, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignBetween(String value1, String value2) {
            addCriterion("teacherSign between", value1, value2, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignNotBetween(String value1, String value2) {
            addCriterion("teacherSign not between", value1, value2, "teachersign");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNull() {
            addCriterion("applyTime is null");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNotNull() {
            addCriterion("applyTime is not null");
            return (Criteria) this;
        }

        public Criteria andApplytimeEqualTo(Date value) {
            addCriterion("applyTime =", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotEqualTo(Date value) {
            addCriterion("applyTime <>", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThan(Date value) {
            addCriterion("applyTime >", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("applyTime >=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThan(Date value) {
            addCriterion("applyTime <", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThanOrEqualTo(Date value) {
            addCriterion("applyTime <=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeIn(List<Date> values) {
            addCriterion("applyTime in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotIn(List<Date> values) {
            addCriterion("applyTime not in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeBetween(Date value1, Date value2) {
            addCriterion("applyTime between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotBetween(Date value1, Date value2) {
            addCriterion("applyTime not between", value1, value2, "applytime");
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