package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CancelleaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CancelleaveExample() {
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

        public Criteria andCancelleaveidIsNull() {
            addCriterion("cancelLeaveID is null");
            return (Criteria) this;
        }

        public Criteria andCancelleaveidIsNotNull() {
            addCriterion("cancelLeaveID is not null");
            return (Criteria) this;
        }

        public Criteria andCancelleaveidEqualTo(String value) {
            addCriterion("cancelLeaveID =", value, "cancelleaveid");
            return (Criteria) this;
        }

        public Criteria andCancelleaveidNotEqualTo(String value) {
            addCriterion("cancelLeaveID <>", value, "cancelleaveid");
            return (Criteria) this;
        }

        public Criteria andCancelleaveidGreaterThan(String value) {
            addCriterion("cancelLeaveID >", value, "cancelleaveid");
            return (Criteria) this;
        }

        public Criteria andCancelleaveidGreaterThanOrEqualTo(String value) {
            addCriterion("cancelLeaveID >=", value, "cancelleaveid");
            return (Criteria) this;
        }

        public Criteria andCancelleaveidLessThan(String value) {
            addCriterion("cancelLeaveID <", value, "cancelleaveid");
            return (Criteria) this;
        }

        public Criteria andCancelleaveidLessThanOrEqualTo(String value) {
            addCriterion("cancelLeaveID <=", value, "cancelleaveid");
            return (Criteria) this;
        }

        public Criteria andCancelleaveidLike(String value) {
            addCriterion("cancelLeaveID like", value, "cancelleaveid");
            return (Criteria) this;
        }

        public Criteria andCancelleaveidNotLike(String value) {
            addCriterion("cancelLeaveID not like", value, "cancelleaveid");
            return (Criteria) this;
        }

        public Criteria andCancelleaveidIn(List<String> values) {
            addCriterion("cancelLeaveID in", values, "cancelleaveid");
            return (Criteria) this;
        }

        public Criteria andCancelleaveidNotIn(List<String> values) {
            addCriterion("cancelLeaveID not in", values, "cancelleaveid");
            return (Criteria) this;
        }

        public Criteria andCancelleaveidBetween(String value1, String value2) {
            addCriterion("cancelLeaveID between", value1, value2, "cancelleaveid");
            return (Criteria) this;
        }

        public Criteria andCancelleaveidNotBetween(String value1, String value2) {
            addCriterion("cancelLeaveID not between", value1, value2, "cancelleaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidIsNull() {
            addCriterion("leaveID is null");
            return (Criteria) this;
        }

        public Criteria andLeaveidIsNotNull() {
            addCriterion("leaveID is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveidEqualTo(String value) {
            addCriterion("leaveID =", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidNotEqualTo(String value) {
            addCriterion("leaveID <>", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidGreaterThan(String value) {
            addCriterion("leaveID >", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidGreaterThanOrEqualTo(String value) {
            addCriterion("leaveID >=", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidLessThan(String value) {
            addCriterion("leaveID <", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidLessThanOrEqualTo(String value) {
            addCriterion("leaveID <=", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidLike(String value) {
            addCriterion("leaveID like", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidNotLike(String value) {
            addCriterion("leaveID not like", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidIn(List<String> values) {
            addCriterion("leaveID in", values, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidNotIn(List<String> values) {
            addCriterion("leaveID not in", values, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidBetween(String value1, String value2) {
            addCriterion("leaveID between", value1, value2, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidNotBetween(String value1, String value2) {
            addCriterion("leaveID not between", value1, value2, "leaveid");
            return (Criteria) this;
        }

        public Criteria andCanceltimeIsNull() {
            addCriterion("cancelTime is null");
            return (Criteria) this;
        }

        public Criteria andCanceltimeIsNotNull() {
            addCriterion("cancelTime is not null");
            return (Criteria) this;
        }

        public Criteria andCanceltimeEqualTo(Date value) {
            addCriterion("cancelTime =", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotEqualTo(Date value) {
            addCriterion("cancelTime <>", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeGreaterThan(Date value) {
            addCriterion("cancelTime >", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cancelTime >=", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeLessThan(Date value) {
            addCriterion("cancelTime <", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeLessThanOrEqualTo(Date value) {
            addCriterion("cancelTime <=", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeIn(List<Date> values) {
            addCriterion("cancelTime in", values, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotIn(List<Date> values) {
            addCriterion("cancelTime not in", values, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeBetween(Date value1, Date value2) {
            addCriterion("cancelTime between", value1, value2, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotBetween(Date value1, Date value2) {
            addCriterion("cancelTime not between", value1, value2, "canceltime");
            return (Criteria) this;
        }

        public Criteria andPassstarttimeIsNull() {
            addCriterion("passStartTime is null");
            return (Criteria) this;
        }

        public Criteria andPassstarttimeIsNotNull() {
            addCriterion("passStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andPassstarttimeEqualTo(Date value) {
            addCriterion("passStartTime =", value, "passstarttime");
            return (Criteria) this;
        }

        public Criteria andPassstarttimeNotEqualTo(Date value) {
            addCriterion("passStartTime <>", value, "passstarttime");
            return (Criteria) this;
        }

        public Criteria andPassstarttimeGreaterThan(Date value) {
            addCriterion("passStartTime >", value, "passstarttime");
            return (Criteria) this;
        }

        public Criteria andPassstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("passStartTime >=", value, "passstarttime");
            return (Criteria) this;
        }

        public Criteria andPassstarttimeLessThan(Date value) {
            addCriterion("passStartTime <", value, "passstarttime");
            return (Criteria) this;
        }

        public Criteria andPassstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("passStartTime <=", value, "passstarttime");
            return (Criteria) this;
        }

        public Criteria andPassstarttimeIn(List<Date> values) {
            addCriterion("passStartTime in", values, "passstarttime");
            return (Criteria) this;
        }

        public Criteria andPassstarttimeNotIn(List<Date> values) {
            addCriterion("passStartTime not in", values, "passstarttime");
            return (Criteria) this;
        }

        public Criteria andPassstarttimeBetween(Date value1, Date value2) {
            addCriterion("passStartTime between", value1, value2, "passstarttime");
            return (Criteria) this;
        }

        public Criteria andPassstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("passStartTime not between", value1, value2, "passstarttime");
            return (Criteria) this;
        }

        public Criteria andPassendtimeIsNull() {
            addCriterion("passEndTime is null");
            return (Criteria) this;
        }

        public Criteria andPassendtimeIsNotNull() {
            addCriterion("passEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andPassendtimeEqualTo(Date value) {
            addCriterion("passEndTime =", value, "passendtime");
            return (Criteria) this;
        }

        public Criteria andPassendtimeNotEqualTo(Date value) {
            addCriterion("passEndTime <>", value, "passendtime");
            return (Criteria) this;
        }

        public Criteria andPassendtimeGreaterThan(Date value) {
            addCriterion("passEndTime >", value, "passendtime");
            return (Criteria) this;
        }

        public Criteria andPassendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("passEndTime >=", value, "passendtime");
            return (Criteria) this;
        }

        public Criteria andPassendtimeLessThan(Date value) {
            addCriterion("passEndTime <", value, "passendtime");
            return (Criteria) this;
        }

        public Criteria andPassendtimeLessThanOrEqualTo(Date value) {
            addCriterion("passEndTime <=", value, "passendtime");
            return (Criteria) this;
        }

        public Criteria andPassendtimeIn(List<Date> values) {
            addCriterion("passEndTime in", values, "passendtime");
            return (Criteria) this;
        }

        public Criteria andPassendtimeNotIn(List<Date> values) {
            addCriterion("passEndTime not in", values, "passendtime");
            return (Criteria) this;
        }

        public Criteria andPassendtimeBetween(Date value1, Date value2) {
            addCriterion("passEndTime between", value1, value2, "passendtime");
            return (Criteria) this;
        }

        public Criteria andPassendtimeNotBetween(Date value1, Date value2) {
            addCriterion("passEndTime not between", value1, value2, "passendtime");
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