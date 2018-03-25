package cn.xm.jwxt.bean.baseInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SigninfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SigninfoExample() {
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

        public Criteria andSignIdIsNull() {
            addCriterion("sign_id is null");
            return (Criteria) this;
        }

        public Criteria andSignIdIsNotNull() {
            addCriterion("sign_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignIdEqualTo(String value) {
            addCriterion("sign_id =", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotEqualTo(String value) {
            addCriterion("sign_id <>", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdGreaterThan(String value) {
            addCriterion("sign_id >", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdGreaterThanOrEqualTo(String value) {
            addCriterion("sign_id >=", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdLessThan(String value) {
            addCriterion("sign_id <", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdLessThanOrEqualTo(String value) {
            addCriterion("sign_id <=", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdLike(String value) {
            addCriterion("sign_id like", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotLike(String value) {
            addCriterion("sign_id not like", value, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdIn(List<String> values) {
            addCriterion("sign_id in", values, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotIn(List<String> values) {
            addCriterion("sign_id not in", values, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdBetween(String value1, String value2) {
            addCriterion("sign_id between", value1, value2, "signId");
            return (Criteria) this;
        }

        public Criteria andSignIdNotBetween(String value1, String value2) {
            addCriterion("sign_id not between", value1, value2, "signId");
            return (Criteria) this;
        }

        public Criteria andSignerIdIsNull() {
            addCriterion("signer_id is null");
            return (Criteria) this;
        }

        public Criteria andSignerIdIsNotNull() {
            addCriterion("signer_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignerIdEqualTo(String value) {
            addCriterion("signer_id =", value, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdNotEqualTo(String value) {
            addCriterion("signer_id <>", value, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdGreaterThan(String value) {
            addCriterion("signer_id >", value, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdGreaterThanOrEqualTo(String value) {
            addCriterion("signer_id >=", value, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdLessThan(String value) {
            addCriterion("signer_id <", value, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdLessThanOrEqualTo(String value) {
            addCriterion("signer_id <=", value, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdLike(String value) {
            addCriterion("signer_id like", value, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdNotLike(String value) {
            addCriterion("signer_id not like", value, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdIn(List<String> values) {
            addCriterion("signer_id in", values, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdNotIn(List<String> values) {
            addCriterion("signer_id not in", values, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdBetween(String value1, String value2) {
            addCriterion("signer_id between", value1, value2, "signerId");
            return (Criteria) this;
        }

        public Criteria andSignerIdNotBetween(String value1, String value2) {
            addCriterion("signer_id not between", value1, value2, "signerId");
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

        public Criteria andNownameIsNull() {
            addCriterion("nowName is null");
            return (Criteria) this;
        }

        public Criteria andNownameIsNotNull() {
            addCriterion("nowName is not null");
            return (Criteria) this;
        }

        public Criteria andNownameEqualTo(String value) {
            addCriterion("nowName =", value, "nowname");
            return (Criteria) this;
        }

        public Criteria andNownameNotEqualTo(String value) {
            addCriterion("nowName <>", value, "nowname");
            return (Criteria) this;
        }

        public Criteria andNownameGreaterThan(String value) {
            addCriterion("nowName >", value, "nowname");
            return (Criteria) this;
        }

        public Criteria andNownameGreaterThanOrEqualTo(String value) {
            addCriterion("nowName >=", value, "nowname");
            return (Criteria) this;
        }

        public Criteria andNownameLessThan(String value) {
            addCriterion("nowName <", value, "nowname");
            return (Criteria) this;
        }

        public Criteria andNownameLessThanOrEqualTo(String value) {
            addCriterion("nowName <=", value, "nowname");
            return (Criteria) this;
        }

        public Criteria andNownameLike(String value) {
            addCriterion("nowName like", value, "nowname");
            return (Criteria) this;
        }

        public Criteria andNownameNotLike(String value) {
            addCriterion("nowName not like", value, "nowname");
            return (Criteria) this;
        }

        public Criteria andNownameIn(List<String> values) {
            addCriterion("nowName in", values, "nowname");
            return (Criteria) this;
        }

        public Criteria andNownameNotIn(List<String> values) {
            addCriterion("nowName not in", values, "nowname");
            return (Criteria) this;
        }

        public Criteria andNownameBetween(String value1, String value2) {
            addCriterion("nowName between", value1, value2, "nowname");
            return (Criteria) this;
        }

        public Criteria andNownameNotBetween(String value1, String value2) {
            addCriterion("nowName not between", value1, value2, "nowname");
            return (Criteria) this;
        }

        public Criteria andUploaddateIsNull() {
            addCriterion("uploadDate is null");
            return (Criteria) this;
        }

        public Criteria andUploaddateIsNotNull() {
            addCriterion("uploadDate is not null");
            return (Criteria) this;
        }

        public Criteria andUploaddateEqualTo(Date value) {
            addCriterion("uploadDate =", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateNotEqualTo(Date value) {
            addCriterion("uploadDate <>", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateGreaterThan(Date value) {
            addCriterion("uploadDate >", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateGreaterThanOrEqualTo(Date value) {
            addCriterion("uploadDate >=", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateLessThan(Date value) {
            addCriterion("uploadDate <", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateLessThanOrEqualTo(Date value) {
            addCriterion("uploadDate <=", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateIn(List<Date> values) {
            addCriterion("uploadDate in", values, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateNotIn(List<Date> values) {
            addCriterion("uploadDate not in", values, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateBetween(Date value1, Date value2) {
            addCriterion("uploadDate between", value1, value2, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateNotBetween(Date value1, Date value2) {
            addCriterion("uploadDate not between", value1, value2, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andSigntypeIsNull() {
            addCriterion("signType is null");
            return (Criteria) this;
        }

        public Criteria andSigntypeIsNotNull() {
            addCriterion("signType is not null");
            return (Criteria) this;
        }

        public Criteria andSigntypeEqualTo(String value) {
            addCriterion("signType =", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotEqualTo(String value) {
            addCriterion("signType <>", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeGreaterThan(String value) {
            addCriterion("signType >", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeGreaterThanOrEqualTo(String value) {
            addCriterion("signType >=", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeLessThan(String value) {
            addCriterion("signType <", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeLessThanOrEqualTo(String value) {
            addCriterion("signType <=", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeLike(String value) {
            addCriterion("signType like", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotLike(String value) {
            addCriterion("signType not like", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeIn(List<String> values) {
            addCriterion("signType in", values, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotIn(List<String> values) {
            addCriterion("signType not in", values, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeBetween(String value1, String value2) {
            addCriterion("signType between", value1, value2, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotBetween(String value1, String value2) {
            addCriterion("signType not between", value1, value2, "signtype");
            return (Criteria) this;
        }

        public Criteria andSignpasswordIsNull() {
            addCriterion("signPassword is null");
            return (Criteria) this;
        }

        public Criteria andSignpasswordIsNotNull() {
            addCriterion("signPassword is not null");
            return (Criteria) this;
        }

        public Criteria andSignpasswordEqualTo(String value) {
            addCriterion("signPassword =", value, "signpassword");
            return (Criteria) this;
        }

        public Criteria andSignpasswordNotEqualTo(String value) {
            addCriterion("signPassword <>", value, "signpassword");
            return (Criteria) this;
        }

        public Criteria andSignpasswordGreaterThan(String value) {
            addCriterion("signPassword >", value, "signpassword");
            return (Criteria) this;
        }

        public Criteria andSignpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("signPassword >=", value, "signpassword");
            return (Criteria) this;
        }

        public Criteria andSignpasswordLessThan(String value) {
            addCriterion("signPassword <", value, "signpassword");
            return (Criteria) this;
        }

        public Criteria andSignpasswordLessThanOrEqualTo(String value) {
            addCriterion("signPassword <=", value, "signpassword");
            return (Criteria) this;
        }

        public Criteria andSignpasswordLike(String value) {
            addCriterion("signPassword like", value, "signpassword");
            return (Criteria) this;
        }

        public Criteria andSignpasswordNotLike(String value) {
            addCriterion("signPassword not like", value, "signpassword");
            return (Criteria) this;
        }

        public Criteria andSignpasswordIn(List<String> values) {
            addCriterion("signPassword in", values, "signpassword");
            return (Criteria) this;
        }

        public Criteria andSignpasswordNotIn(List<String> values) {
            addCriterion("signPassword not in", values, "signpassword");
            return (Criteria) this;
        }

        public Criteria andSignpasswordBetween(String value1, String value2) {
            addCriterion("signPassword between", value1, value2, "signpassword");
            return (Criteria) this;
        }

        public Criteria andSignpasswordNotBetween(String value1, String value2) {
            addCriterion("signPassword not between", value1, value2, "signpassword");
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