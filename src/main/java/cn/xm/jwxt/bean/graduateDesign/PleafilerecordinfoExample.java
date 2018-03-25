package cn.xm.jwxt.bean.graduateDesign;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PleafilerecordinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PleafilerecordinfoExample() {
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

        public Criteria andFileuprecoreidIsNull() {
            addCriterion("fileUpRecoreId is null");
            return (Criteria) this;
        }

        public Criteria andFileuprecoreidIsNotNull() {
            addCriterion("fileUpRecoreId is not null");
            return (Criteria) this;
        }

        public Criteria andFileuprecoreidEqualTo(Integer value) {
            addCriterion("fileUpRecoreId =", value, "fileuprecoreid");
            return (Criteria) this;
        }

        public Criteria andFileuprecoreidNotEqualTo(Integer value) {
            addCriterion("fileUpRecoreId <>", value, "fileuprecoreid");
            return (Criteria) this;
        }

        public Criteria andFileuprecoreidGreaterThan(Integer value) {
            addCriterion("fileUpRecoreId >", value, "fileuprecoreid");
            return (Criteria) this;
        }

        public Criteria andFileuprecoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fileUpRecoreId >=", value, "fileuprecoreid");
            return (Criteria) this;
        }

        public Criteria andFileuprecoreidLessThan(Integer value) {
            addCriterion("fileUpRecoreId <", value, "fileuprecoreid");
            return (Criteria) this;
        }

        public Criteria andFileuprecoreidLessThanOrEqualTo(Integer value) {
            addCriterion("fileUpRecoreId <=", value, "fileuprecoreid");
            return (Criteria) this;
        }

        public Criteria andFileuprecoreidIn(List<Integer> values) {
            addCriterion("fileUpRecoreId in", values, "fileuprecoreid");
            return (Criteria) this;
        }

        public Criteria andFileuprecoreidNotIn(List<Integer> values) {
            addCriterion("fileUpRecoreId not in", values, "fileuprecoreid");
            return (Criteria) this;
        }

        public Criteria andFileuprecoreidBetween(Integer value1, Integer value2) {
            addCriterion("fileUpRecoreId between", value1, value2, "fileuprecoreid");
            return (Criteria) this;
        }

        public Criteria andFileuprecoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("fileUpRecoreId not between", value1, value2, "fileuprecoreid");
            return (Criteria) this;
        }

        public Criteria andArrangeidIsNull() {
            addCriterion("arrangeId is null");
            return (Criteria) this;
        }

        public Criteria andArrangeidIsNotNull() {
            addCriterion("arrangeId is not null");
            return (Criteria) this;
        }

        public Criteria andArrangeidEqualTo(Integer value) {
            addCriterion("arrangeId =", value, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidNotEqualTo(Integer value) {
            addCriterion("arrangeId <>", value, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidGreaterThan(Integer value) {
            addCriterion("arrangeId >", value, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("arrangeId >=", value, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidLessThan(Integer value) {
            addCriterion("arrangeId <", value, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidLessThanOrEqualTo(Integer value) {
            addCriterion("arrangeId <=", value, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidIn(List<Integer> values) {
            addCriterion("arrangeId in", values, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidNotIn(List<Integer> values) {
            addCriterion("arrangeId not in", values, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidBetween(Integer value1, Integer value2) {
            addCriterion("arrangeId between", value1, value2, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidNotBetween(Integer value1, Integer value2) {
            addCriterion("arrangeId not between", value1, value2, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andFileupstatusIsNull() {
            addCriterion("fileUpStatus is null");
            return (Criteria) this;
        }

        public Criteria andFileupstatusIsNotNull() {
            addCriterion("fileUpStatus is not null");
            return (Criteria) this;
        }

        public Criteria andFileupstatusEqualTo(String value) {
            addCriterion("fileUpStatus =", value, "fileupstatus");
            return (Criteria) this;
        }

        public Criteria andFileupstatusNotEqualTo(String value) {
            addCriterion("fileUpStatus <>", value, "fileupstatus");
            return (Criteria) this;
        }

        public Criteria andFileupstatusGreaterThan(String value) {
            addCriterion("fileUpStatus >", value, "fileupstatus");
            return (Criteria) this;
        }

        public Criteria andFileupstatusGreaterThanOrEqualTo(String value) {
            addCriterion("fileUpStatus >=", value, "fileupstatus");
            return (Criteria) this;
        }

        public Criteria andFileupstatusLessThan(String value) {
            addCriterion("fileUpStatus <", value, "fileupstatus");
            return (Criteria) this;
        }

        public Criteria andFileupstatusLessThanOrEqualTo(String value) {
            addCriterion("fileUpStatus <=", value, "fileupstatus");
            return (Criteria) this;
        }

        public Criteria andFileupstatusLike(String value) {
            addCriterion("fileUpStatus like", value, "fileupstatus");
            return (Criteria) this;
        }

        public Criteria andFileupstatusNotLike(String value) {
            addCriterion("fileUpStatus not like", value, "fileupstatus");
            return (Criteria) this;
        }

        public Criteria andFileupstatusIn(List<String> values) {
            addCriterion("fileUpStatus in", values, "fileupstatus");
            return (Criteria) this;
        }

        public Criteria andFileupstatusNotIn(List<String> values) {
            addCriterion("fileUpStatus not in", values, "fileupstatus");
            return (Criteria) this;
        }

        public Criteria andFileupstatusBetween(String value1, String value2) {
            addCriterion("fileUpStatus between", value1, value2, "fileupstatus");
            return (Criteria) this;
        }

        public Criteria andFileupstatusNotBetween(String value1, String value2) {
            addCriterion("fileUpStatus not between", value1, value2, "fileupstatus");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNull() {
            addCriterion("upTime is null");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNotNull() {
            addCriterion("upTime is not null");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(Date value) {
            addCriterion("upTime =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(Date value) {
            addCriterion("upTime <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(Date value) {
            addCriterion("upTime >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upTime >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(Date value) {
            addCriterion("upTime <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(Date value) {
            addCriterion("upTime <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<Date> values) {
            addCriterion("upTime in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<Date> values) {
            addCriterion("upTime not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(Date value1, Date value2) {
            addCriterion("upTime between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(Date value1, Date value2) {
            addCriterion("upTime not between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUpstatusIsNull() {
            addCriterion("upStatus is null");
            return (Criteria) this;
        }

        public Criteria andUpstatusIsNotNull() {
            addCriterion("upStatus is not null");
            return (Criteria) this;
        }

        public Criteria andUpstatusEqualTo(String value) {
            addCriterion("upStatus =", value, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusNotEqualTo(String value) {
            addCriterion("upStatus <>", value, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusGreaterThan(String value) {
            addCriterion("upStatus >", value, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusGreaterThanOrEqualTo(String value) {
            addCriterion("upStatus >=", value, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusLessThan(String value) {
            addCriterion("upStatus <", value, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusLessThanOrEqualTo(String value) {
            addCriterion("upStatus <=", value, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusLike(String value) {
            addCriterion("upStatus like", value, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusNotLike(String value) {
            addCriterion("upStatus not like", value, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusIn(List<String> values) {
            addCriterion("upStatus in", values, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusNotIn(List<String> values) {
            addCriterion("upStatus not in", values, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusBetween(String value1, String value2) {
            addCriterion("upStatus between", value1, value2, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusNotBetween(String value1, String value2) {
            addCriterion("upStatus not between", value1, value2, "upstatus");
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