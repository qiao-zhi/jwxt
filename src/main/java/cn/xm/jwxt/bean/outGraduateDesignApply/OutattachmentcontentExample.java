package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.ArrayList;
import java.util.List;

public class OutattachmentcontentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutattachmentcontentExample() {
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

        public Criteria andContentidIsNull() {
            addCriterion("contentID is null");
            return (Criteria) this;
        }

        public Criteria andContentidIsNotNull() {
            addCriterion("contentID is not null");
            return (Criteria) this;
        }

        public Criteria andContentidEqualTo(String value) {
            addCriterion("contentID =", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidNotEqualTo(String value) {
            addCriterion("contentID <>", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidGreaterThan(String value) {
            addCriterion("contentID >", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidGreaterThanOrEqualTo(String value) {
            addCriterion("contentID >=", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidLessThan(String value) {
            addCriterion("contentID <", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidLessThanOrEqualTo(String value) {
            addCriterion("contentID <=", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidLike(String value) {
            addCriterion("contentID like", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidNotLike(String value) {
            addCriterion("contentID not like", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidIn(List<String> values) {
            addCriterion("contentID in", values, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidNotIn(List<String> values) {
            addCriterion("contentID not in", values, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidBetween(String value1, String value2) {
            addCriterion("contentID between", value1, value2, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidNotBetween(String value1, String value2) {
            addCriterion("contentID not between", value1, value2, "contentid");
            return (Criteria) this;
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

        public Criteria andContentnumIsNull() {
            addCriterion("contentNum is null");
            return (Criteria) this;
        }

        public Criteria andContentnumIsNotNull() {
            addCriterion("contentNum is not null");
            return (Criteria) this;
        }

        public Criteria andContentnumEqualTo(String value) {
            addCriterion("contentNum =", value, "contentnum");
            return (Criteria) this;
        }

        public Criteria andContentnumNotEqualTo(String value) {
            addCriterion("contentNum <>", value, "contentnum");
            return (Criteria) this;
        }

        public Criteria andContentnumGreaterThan(String value) {
            addCriterion("contentNum >", value, "contentnum");
            return (Criteria) this;
        }

        public Criteria andContentnumGreaterThanOrEqualTo(String value) {
            addCriterion("contentNum >=", value, "contentnum");
            return (Criteria) this;
        }

        public Criteria andContentnumLessThan(String value) {
            addCriterion("contentNum <", value, "contentnum");
            return (Criteria) this;
        }

        public Criteria andContentnumLessThanOrEqualTo(String value) {
            addCriterion("contentNum <=", value, "contentnum");
            return (Criteria) this;
        }

        public Criteria andContentnumLike(String value) {
            addCriterion("contentNum like", value, "contentnum");
            return (Criteria) this;
        }

        public Criteria andContentnumNotLike(String value) {
            addCriterion("contentNum not like", value, "contentnum");
            return (Criteria) this;
        }

        public Criteria andContentnumIn(List<String> values) {
            addCriterion("contentNum in", values, "contentnum");
            return (Criteria) this;
        }

        public Criteria andContentnumNotIn(List<String> values) {
            addCriterion("contentNum not in", values, "contentnum");
            return (Criteria) this;
        }

        public Criteria andContentnumBetween(String value1, String value2) {
            addCriterion("contentNum between", value1, value2, "contentnum");
            return (Criteria) this;
        }

        public Criteria andContentnumNotBetween(String value1, String value2) {
            addCriterion("contentNum not between", value1, value2, "contentnum");
            return (Criteria) this;
        }

        public Criteria andContenturlIsNull() {
            addCriterion("contentURL is null");
            return (Criteria) this;
        }

        public Criteria andContenturlIsNotNull() {
            addCriterion("contentURL is not null");
            return (Criteria) this;
        }

        public Criteria andContenturlEqualTo(String value) {
            addCriterion("contentURL =", value, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlNotEqualTo(String value) {
            addCriterion("contentURL <>", value, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlGreaterThan(String value) {
            addCriterion("contentURL >", value, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlGreaterThanOrEqualTo(String value) {
            addCriterion("contentURL >=", value, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlLessThan(String value) {
            addCriterion("contentURL <", value, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlLessThanOrEqualTo(String value) {
            addCriterion("contentURL <=", value, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlLike(String value) {
            addCriterion("contentURL like", value, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlNotLike(String value) {
            addCriterion("contentURL not like", value, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlIn(List<String> values) {
            addCriterion("contentURL in", values, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlNotIn(List<String> values) {
            addCriterion("contentURL not in", values, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlBetween(String value1, String value2) {
            addCriterion("contentURL between", value1, value2, "contenturl");
            return (Criteria) this;
        }

        public Criteria andContenturlNotBetween(String value1, String value2) {
            addCriterion("contentURL not between", value1, value2, "contenturl");
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