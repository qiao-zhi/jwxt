package cn.xm.jwxt.bean.arrangeCourse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Coursearrangeinfo2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Coursearrangeinfo2Example() {
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

        public Criteria andArrangeoutidIsNull() {
            addCriterion("arrangeOutId is null");
            return (Criteria) this;
        }

        public Criteria andArrangeoutidIsNotNull() {
            addCriterion("arrangeOutId is not null");
            return (Criteria) this;
        }

        public Criteria andArrangeoutidEqualTo(Integer value) {
            addCriterion("arrangeOutId =", value, "arrangeoutid");
            return (Criteria) this;
        }

        public Criteria andArrangeoutidNotEqualTo(Integer value) {
            addCriterion("arrangeOutId <>", value, "arrangeoutid");
            return (Criteria) this;
        }

        public Criteria andArrangeoutidGreaterThan(Integer value) {
            addCriterion("arrangeOutId >", value, "arrangeoutid");
            return (Criteria) this;
        }

        public Criteria andArrangeoutidGreaterThanOrEqualTo(Integer value) {
            addCriterion("arrangeOutId >=", value, "arrangeoutid");
            return (Criteria) this;
        }

        public Criteria andArrangeoutidLessThan(Integer value) {
            addCriterion("arrangeOutId <", value, "arrangeoutid");
            return (Criteria) this;
        }

        public Criteria andArrangeoutidLessThanOrEqualTo(Integer value) {
            addCriterion("arrangeOutId <=", value, "arrangeoutid");
            return (Criteria) this;
        }

        public Criteria andArrangeoutidIn(List<Integer> values) {
            addCriterion("arrangeOutId in", values, "arrangeoutid");
            return (Criteria) this;
        }

        public Criteria andArrangeoutidNotIn(List<Integer> values) {
            addCriterion("arrangeOutId not in", values, "arrangeoutid");
            return (Criteria) this;
        }

        public Criteria andArrangeoutidBetween(Integer value1, Integer value2) {
            addCriterion("arrangeOutId between", value1, value2, "arrangeoutid");
            return (Criteria) this;
        }

        public Criteria andArrangeoutidNotBetween(Integer value1, Integer value2) {
            addCriterion("arrangeOutId not between", value1, value2, "arrangeoutid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidIsNull() {
            addCriterion("noticeDatailId is null");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidIsNotNull() {
            addCriterion("noticeDatailId is not null");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidEqualTo(Integer value) {
            addCriterion("noticeDatailId =", value, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidNotEqualTo(Integer value) {
            addCriterion("noticeDatailId <>", value, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidGreaterThan(Integer value) {
            addCriterion("noticeDatailId >", value, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("noticeDatailId >=", value, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidLessThan(Integer value) {
            addCriterion("noticeDatailId <", value, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidLessThanOrEqualTo(Integer value) {
            addCriterion("noticeDatailId <=", value, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidIn(List<Integer> values) {
            addCriterion("noticeDatailId in", values, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidNotIn(List<Integer> values) {
            addCriterion("noticeDatailId not in", values, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidBetween(Integer value1, Integer value2) {
            addCriterion("noticeDatailId between", value1, value2, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidNotBetween(Integer value1, Integer value2) {
            addCriterion("noticeDatailId not between", value1, value2, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNull() {
            addCriterion("teacherid is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("teacherid is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(String value) {
            addCriterion("teacherid =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(String value) {
            addCriterion("teacherid <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(String value) {
            addCriterion("teacherid >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(String value) {
            addCriterion("teacherid >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(String value) {
            addCriterion("teacherid <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(String value) {
            addCriterion("teacherid <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLike(String value) {
            addCriterion("teacherid like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotLike(String value) {
            addCriterion("teacherid not like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<String> values) {
            addCriterion("teacherid in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<String> values) {
            addCriterion("teacherid not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(String value1, String value2) {
            addCriterion("teacherid between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(String value1, String value2) {
            addCriterion("teacherid not between", value1, value2, "teacherid");
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

        public Criteria andArrangetimeIsNull() {
            addCriterion("arrangeTime is null");
            return (Criteria) this;
        }

        public Criteria andArrangetimeIsNotNull() {
            addCriterion("arrangeTime is not null");
            return (Criteria) this;
        }

        public Criteria andArrangetimeEqualTo(Date value) {
            addCriterion("arrangeTime =", value, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andArrangetimeNotEqualTo(Date value) {
            addCriterion("arrangeTime <>", value, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andArrangetimeGreaterThan(Date value) {
            addCriterion("arrangeTime >", value, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andArrangetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrangeTime >=", value, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andArrangetimeLessThan(Date value) {
            addCriterion("arrangeTime <", value, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andArrangetimeLessThanOrEqualTo(Date value) {
            addCriterion("arrangeTime <=", value, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andArrangetimeIn(List<Date> values) {
            addCriterion("arrangeTime in", values, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andArrangetimeNotIn(List<Date> values) {
            addCriterion("arrangeTime not in", values, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andArrangetimeBetween(Date value1, Date value2) {
            addCriterion("arrangeTime between", value1, value2, "arrangetime");
            return (Criteria) this;
        }

        public Criteria andArrangetimeNotBetween(Date value1, Date value2) {
            addCriterion("arrangeTime not between", value1, value2, "arrangetime");
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