package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutsidegradesignattachmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutsidegradesignattachmentExample() {
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

        public Criteria andAttachmentidIsNull() {
            addCriterion("attachmentID is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentidIsNotNull() {
            addCriterion("attachmentID is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentidEqualTo(String value) {
            addCriterion("attachmentID =", value, "attachmentid");
            return (Criteria) this;
        }

        public Criteria andAttachmentidNotEqualTo(String value) {
            addCriterion("attachmentID <>", value, "attachmentid");
            return (Criteria) this;
        }

        public Criteria andAttachmentidGreaterThan(String value) {
            addCriterion("attachmentID >", value, "attachmentid");
            return (Criteria) this;
        }

        public Criteria andAttachmentidGreaterThanOrEqualTo(String value) {
            addCriterion("attachmentID >=", value, "attachmentid");
            return (Criteria) this;
        }

        public Criteria andAttachmentidLessThan(String value) {
            addCriterion("attachmentID <", value, "attachmentid");
            return (Criteria) this;
        }

        public Criteria andAttachmentidLessThanOrEqualTo(String value) {
            addCriterion("attachmentID <=", value, "attachmentid");
            return (Criteria) this;
        }

        public Criteria andAttachmentidLike(String value) {
            addCriterion("attachmentID like", value, "attachmentid");
            return (Criteria) this;
        }

        public Criteria andAttachmentidNotLike(String value) {
            addCriterion("attachmentID not like", value, "attachmentid");
            return (Criteria) this;
        }

        public Criteria andAttachmentidIn(List<String> values) {
            addCriterion("attachmentID in", values, "attachmentid");
            return (Criteria) this;
        }

        public Criteria andAttachmentidNotIn(List<String> values) {
            addCriterion("attachmentID not in", values, "attachmentid");
            return (Criteria) this;
        }

        public Criteria andAttachmentidBetween(String value1, String value2) {
            addCriterion("attachmentID between", value1, value2, "attachmentid");
            return (Criteria) this;
        }

        public Criteria andAttachmentidNotBetween(String value1, String value2) {
            addCriterion("attachmentID not between", value1, value2, "attachmentid");
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

        public Criteria andAttachmentoldnameIsNull() {
            addCriterion("attachmentOldName is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentoldnameIsNotNull() {
            addCriterion("attachmentOldName is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentoldnameEqualTo(String value) {
            addCriterion("attachmentOldName =", value, "attachmentoldname");
            return (Criteria) this;
        }

        public Criteria andAttachmentoldnameNotEqualTo(String value) {
            addCriterion("attachmentOldName <>", value, "attachmentoldname");
            return (Criteria) this;
        }

        public Criteria andAttachmentoldnameGreaterThan(String value) {
            addCriterion("attachmentOldName >", value, "attachmentoldname");
            return (Criteria) this;
        }

        public Criteria andAttachmentoldnameGreaterThanOrEqualTo(String value) {
            addCriterion("attachmentOldName >=", value, "attachmentoldname");
            return (Criteria) this;
        }

        public Criteria andAttachmentoldnameLessThan(String value) {
            addCriterion("attachmentOldName <", value, "attachmentoldname");
            return (Criteria) this;
        }

        public Criteria andAttachmentoldnameLessThanOrEqualTo(String value) {
            addCriterion("attachmentOldName <=", value, "attachmentoldname");
            return (Criteria) this;
        }

        public Criteria andAttachmentoldnameLike(String value) {
            addCriterion("attachmentOldName like", value, "attachmentoldname");
            return (Criteria) this;
        }

        public Criteria andAttachmentoldnameNotLike(String value) {
            addCriterion("attachmentOldName not like", value, "attachmentoldname");
            return (Criteria) this;
        }

        public Criteria andAttachmentoldnameIn(List<String> values) {
            addCriterion("attachmentOldName in", values, "attachmentoldname");
            return (Criteria) this;
        }

        public Criteria andAttachmentoldnameNotIn(List<String> values) {
            addCriterion("attachmentOldName not in", values, "attachmentoldname");
            return (Criteria) this;
        }

        public Criteria andAttachmentoldnameBetween(String value1, String value2) {
            addCriterion("attachmentOldName between", value1, value2, "attachmentoldname");
            return (Criteria) this;
        }

        public Criteria andAttachmentoldnameNotBetween(String value1, String value2) {
            addCriterion("attachmentOldName not between", value1, value2, "attachmentoldname");
            return (Criteria) this;
        }

        public Criteria andNewnameIsNull() {
            addCriterion("newName is null");
            return (Criteria) this;
        }

        public Criteria andNewnameIsNotNull() {
            addCriterion("newName is not null");
            return (Criteria) this;
        }

        public Criteria andNewnameEqualTo(String value) {
            addCriterion("newName =", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameNotEqualTo(String value) {
            addCriterion("newName <>", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameGreaterThan(String value) {
            addCriterion("newName >", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameGreaterThanOrEqualTo(String value) {
            addCriterion("newName >=", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameLessThan(String value) {
            addCriterion("newName <", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameLessThanOrEqualTo(String value) {
            addCriterion("newName <=", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameLike(String value) {
            addCriterion("newName like", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameNotLike(String value) {
            addCriterion("newName not like", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameIn(List<String> values) {
            addCriterion("newName in", values, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameNotIn(List<String> values) {
            addCriterion("newName not in", values, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameBetween(String value1, String value2) {
            addCriterion("newName between", value1, value2, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameNotBetween(String value1, String value2) {
            addCriterion("newName not between", value1, value2, "newname");
            return (Criteria) this;
        }

        public Criteria andAttachmentaddrIsNull() {
            addCriterion("attachmentAddr is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentaddrIsNotNull() {
            addCriterion("attachmentAddr is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentaddrEqualTo(String value) {
            addCriterion("attachmentAddr =", value, "attachmentaddr");
            return (Criteria) this;
        }

        public Criteria andAttachmentaddrNotEqualTo(String value) {
            addCriterion("attachmentAddr <>", value, "attachmentaddr");
            return (Criteria) this;
        }

        public Criteria andAttachmentaddrGreaterThan(String value) {
            addCriterion("attachmentAddr >", value, "attachmentaddr");
            return (Criteria) this;
        }

        public Criteria andAttachmentaddrGreaterThanOrEqualTo(String value) {
            addCriterion("attachmentAddr >=", value, "attachmentaddr");
            return (Criteria) this;
        }

        public Criteria andAttachmentaddrLessThan(String value) {
            addCriterion("attachmentAddr <", value, "attachmentaddr");
            return (Criteria) this;
        }

        public Criteria andAttachmentaddrLessThanOrEqualTo(String value) {
            addCriterion("attachmentAddr <=", value, "attachmentaddr");
            return (Criteria) this;
        }

        public Criteria andAttachmentaddrLike(String value) {
            addCriterion("attachmentAddr like", value, "attachmentaddr");
            return (Criteria) this;
        }

        public Criteria andAttachmentaddrNotLike(String value) {
            addCriterion("attachmentAddr not like", value, "attachmentaddr");
            return (Criteria) this;
        }

        public Criteria andAttachmentaddrIn(List<String> values) {
            addCriterion("attachmentAddr in", values, "attachmentaddr");
            return (Criteria) this;
        }

        public Criteria andAttachmentaddrNotIn(List<String> values) {
            addCriterion("attachmentAddr not in", values, "attachmentaddr");
            return (Criteria) this;
        }

        public Criteria andAttachmentaddrBetween(String value1, String value2) {
            addCriterion("attachmentAddr between", value1, value2, "attachmentaddr");
            return (Criteria) this;
        }

        public Criteria andAttachmentaddrNotBetween(String value1, String value2) {
            addCriterion("attachmentAddr not between", value1, value2, "attachmentaddr");
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

        public Criteria andAttachmenttypeIsNull() {
            addCriterion("attachmentType is null");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeIsNotNull() {
            addCriterion("attachmentType is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeEqualTo(String value) {
            addCriterion("attachmentType =", value, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeNotEqualTo(String value) {
            addCriterion("attachmentType <>", value, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeGreaterThan(String value) {
            addCriterion("attachmentType >", value, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("attachmentType >=", value, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeLessThan(String value) {
            addCriterion("attachmentType <", value, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeLessThanOrEqualTo(String value) {
            addCriterion("attachmentType <=", value, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeLike(String value) {
            addCriterion("attachmentType like", value, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeNotLike(String value) {
            addCriterion("attachmentType not like", value, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeIn(List<String> values) {
            addCriterion("attachmentType in", values, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeNotIn(List<String> values) {
            addCriterion("attachmentType not in", values, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeBetween(String value1, String value2) {
            addCriterion("attachmentType between", value1, value2, "attachmenttype");
            return (Criteria) this;
        }

        public Criteria andAttachmenttypeNotBetween(String value1, String value2) {
            addCriterion("attachmentType not between", value1, value2, "attachmenttype");
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