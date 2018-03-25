package cn.xm.jwxt.bean.graduateDesign;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PleafileuploadinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PleafileuploadinfoExample() {
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

        public Criteria andPleafileidIsNull() {
            addCriterion("pleafileId is null");
            return (Criteria) this;
        }

        public Criteria andPleafileidIsNotNull() {
            addCriterion("pleafileId is not null");
            return (Criteria) this;
        }

        public Criteria andPleafileidEqualTo(Integer value) {
            addCriterion("pleafileId =", value, "pleafileid");
            return (Criteria) this;
        }

        public Criteria andPleafileidNotEqualTo(Integer value) {
            addCriterion("pleafileId <>", value, "pleafileid");
            return (Criteria) this;
        }

        public Criteria andPleafileidGreaterThan(Integer value) {
            addCriterion("pleafileId >", value, "pleafileid");
            return (Criteria) this;
        }

        public Criteria andPleafileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pleafileId >=", value, "pleafileid");
            return (Criteria) this;
        }

        public Criteria andPleafileidLessThan(Integer value) {
            addCriterion("pleafileId <", value, "pleafileid");
            return (Criteria) this;
        }

        public Criteria andPleafileidLessThanOrEqualTo(Integer value) {
            addCriterion("pleafileId <=", value, "pleafileid");
            return (Criteria) this;
        }

        public Criteria andPleafileidIn(List<Integer> values) {
            addCriterion("pleafileId in", values, "pleafileid");
            return (Criteria) this;
        }

        public Criteria andPleafileidNotIn(List<Integer> values) {
            addCriterion("pleafileId not in", values, "pleafileid");
            return (Criteria) this;
        }

        public Criteria andPleafileidBetween(Integer value1, Integer value2) {
            addCriterion("pleafileId between", value1, value2, "pleafileid");
            return (Criteria) this;
        }

        public Criteria andPleafileidNotBetween(Integer value1, Integer value2) {
            addCriterion("pleafileId not between", value1, value2, "pleafileid");
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

        public Criteria andFiletypeIsNull() {
            addCriterion("fileType is null");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNotNull() {
            addCriterion("fileType is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypeEqualTo(String value) {
            addCriterion("fileType =", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotEqualTo(String value) {
            addCriterion("fileType <>", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThan(String value) {
            addCriterion("fileType >", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("fileType >=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThan(String value) {
            addCriterion("fileType <", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThanOrEqualTo(String value) {
            addCriterion("fileType <=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLike(String value) {
            addCriterion("fileType like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotLike(String value) {
            addCriterion("fileType not like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeIn(List<String> values) {
            addCriterion("fileType in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotIn(List<String> values) {
            addCriterion("fileType not in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeBetween(String value1, String value2) {
            addCriterion("fileType between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotBetween(String value1, String value2) {
            addCriterion("fileType not between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andOrinameIsNull() {
            addCriterion("oriName is null");
            return (Criteria) this;
        }

        public Criteria andOrinameIsNotNull() {
            addCriterion("oriName is not null");
            return (Criteria) this;
        }

        public Criteria andOrinameEqualTo(String value) {
            addCriterion("oriName =", value, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameNotEqualTo(String value) {
            addCriterion("oriName <>", value, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameGreaterThan(String value) {
            addCriterion("oriName >", value, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameGreaterThanOrEqualTo(String value) {
            addCriterion("oriName >=", value, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameLessThan(String value) {
            addCriterion("oriName <", value, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameLessThanOrEqualTo(String value) {
            addCriterion("oriName <=", value, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameLike(String value) {
            addCriterion("oriName like", value, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameNotLike(String value) {
            addCriterion("oriName not like", value, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameIn(List<String> values) {
            addCriterion("oriName in", values, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameNotIn(List<String> values) {
            addCriterion("oriName not in", values, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameBetween(String value1, String value2) {
            addCriterion("oriName between", value1, value2, "oriname");
            return (Criteria) this;
        }

        public Criteria andOrinameNotBetween(String value1, String value2) {
            addCriterion("oriName not between", value1, value2, "oriname");
            return (Criteria) this;
        }

        public Criteria andUuidnameIsNull() {
            addCriterion("UUIDname is null");
            return (Criteria) this;
        }

        public Criteria andUuidnameIsNotNull() {
            addCriterion("UUIDname is not null");
            return (Criteria) this;
        }

        public Criteria andUuidnameEqualTo(String value) {
            addCriterion("UUIDname =", value, "uuidname");
            return (Criteria) this;
        }

        public Criteria andUuidnameNotEqualTo(String value) {
            addCriterion("UUIDname <>", value, "uuidname");
            return (Criteria) this;
        }

        public Criteria andUuidnameGreaterThan(String value) {
            addCriterion("UUIDname >", value, "uuidname");
            return (Criteria) this;
        }

        public Criteria andUuidnameGreaterThanOrEqualTo(String value) {
            addCriterion("UUIDname >=", value, "uuidname");
            return (Criteria) this;
        }

        public Criteria andUuidnameLessThan(String value) {
            addCriterion("UUIDname <", value, "uuidname");
            return (Criteria) this;
        }

        public Criteria andUuidnameLessThanOrEqualTo(String value) {
            addCriterion("UUIDname <=", value, "uuidname");
            return (Criteria) this;
        }

        public Criteria andUuidnameLike(String value) {
            addCriterion("UUIDname like", value, "uuidname");
            return (Criteria) this;
        }

        public Criteria andUuidnameNotLike(String value) {
            addCriterion("UUIDname not like", value, "uuidname");
            return (Criteria) this;
        }

        public Criteria andUuidnameIn(List<String> values) {
            addCriterion("UUIDname in", values, "uuidname");
            return (Criteria) this;
        }

        public Criteria andUuidnameNotIn(List<String> values) {
            addCriterion("UUIDname not in", values, "uuidname");
            return (Criteria) this;
        }

        public Criteria andUuidnameBetween(String value1, String value2) {
            addCriterion("UUIDname between", value1, value2, "uuidname");
            return (Criteria) this;
        }

        public Criteria andUuidnameNotBetween(String value1, String value2) {
            addCriterion("UUIDname not between", value1, value2, "uuidname");
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