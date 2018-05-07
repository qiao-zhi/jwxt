package cn.xm.jwxt.bean.orderBooks;

import java.util.ArrayList;
import java.util.List;

public class TextbookOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TextbookOrderExample() {
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

        public Criteria andOrderdetailidIsNull() {
            addCriterion("orderDetailID is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidIsNotNull() {
            addCriterion("orderDetailID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidEqualTo(String value) {
            addCriterion("orderDetailID =", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotEqualTo(String value) {
            addCriterion("orderDetailID <>", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidGreaterThan(String value) {
            addCriterion("orderDetailID >", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidGreaterThanOrEqualTo(String value) {
            addCriterion("orderDetailID >=", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLessThan(String value) {
            addCriterion("orderDetailID <", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLessThanOrEqualTo(String value) {
            addCriterion("orderDetailID <=", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLike(String value) {
            addCriterion("orderDetailID like", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotLike(String value) {
            addCriterion("orderDetailID not like", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidIn(List<String> values) {
            addCriterion("orderDetailID in", values, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotIn(List<String> values) {
            addCriterion("orderDetailID not in", values, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidBetween(String value1, String value2) {
            addCriterion("orderDetailID between", value1, value2, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotBetween(String value1, String value2) {
            addCriterion("orderDetailID not between", value1, value2, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andTextbookidIsNull() {
            addCriterion("textbookID is null");
            return (Criteria) this;
        }

        public Criteria andTextbookidIsNotNull() {
            addCriterion("textbookID is not null");
            return (Criteria) this;
        }

        public Criteria andTextbookidEqualTo(String value) {
            addCriterion("textbookID =", value, "textbookid");
            return (Criteria) this;
        }

        public Criteria andTextbookidNotEqualTo(String value) {
            addCriterion("textbookID <>", value, "textbookid");
            return (Criteria) this;
        }

        public Criteria andTextbookidGreaterThan(String value) {
            addCriterion("textbookID >", value, "textbookid");
            return (Criteria) this;
        }

        public Criteria andTextbookidGreaterThanOrEqualTo(String value) {
            addCriterion("textbookID >=", value, "textbookid");
            return (Criteria) this;
        }

        public Criteria andTextbookidLessThan(String value) {
            addCriterion("textbookID <", value, "textbookid");
            return (Criteria) this;
        }

        public Criteria andTextbookidLessThanOrEqualTo(String value) {
            addCriterion("textbookID <=", value, "textbookid");
            return (Criteria) this;
        }

        public Criteria andTextbookidLike(String value) {
            addCriterion("textbookID like", value, "textbookid");
            return (Criteria) this;
        }

        public Criteria andTextbookidNotLike(String value) {
            addCriterion("textbookID not like", value, "textbookid");
            return (Criteria) this;
        }

        public Criteria andTextbookidIn(List<String> values) {
            addCriterion("textbookID in", values, "textbookid");
            return (Criteria) this;
        }

        public Criteria andTextbookidNotIn(List<String> values) {
            addCriterion("textbookID not in", values, "textbookid");
            return (Criteria) this;
        }

        public Criteria andTextbookidBetween(String value1, String value2) {
            addCriterion("textbookID between", value1, value2, "textbookid");
            return (Criteria) this;
        }

        public Criteria andTextbookidNotBetween(String value1, String value2) {
            addCriterion("textbookID not between", value1, value2, "textbookid");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNull() {
            addCriterion("courseID is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseID is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(String value) {
            addCriterion("courseID =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(String value) {
            addCriterion("courseID <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(String value) {
            addCriterion("courseID >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(String value) {
            addCriterion("courseID >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(String value) {
            addCriterion("courseID <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(String value) {
            addCriterion("courseID <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLike(String value) {
            addCriterion("courseID like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotLike(String value) {
            addCriterion("courseID not like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<String> values) {
            addCriterion("courseID in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<String> values) {
            addCriterion("courseID not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(String value1, String value2) {
            addCriterion("courseID between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(String value1, String value2) {
            addCriterion("courseID not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNull() {
            addCriterion("orderNum is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("orderNum is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(Integer value) {
            addCriterion("orderNum =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(Integer value) {
            addCriterion("orderNum <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThan(Integer value) {
            addCriterion("orderNum >", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderNum >=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThan(Integer value) {
            addCriterion("orderNum <", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThanOrEqualTo(Integer value) {
            addCriterion("orderNum <=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<Integer> values) {
            addCriterion("orderNum in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<Integer> values) {
            addCriterion("orderNum not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(Integer value1, Integer value2) {
            addCriterion("orderNum between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(Integer value1, Integer value2) {
            addCriterion("orderNum not between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNull() {
            addCriterion("teacherID is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("teacherID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(String value) {
            addCriterion("teacherID =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(String value) {
            addCriterion("teacherID <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(String value) {
            addCriterion("teacherID >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(String value) {
            addCriterion("teacherID >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(String value) {
            addCriterion("teacherID <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(String value) {
            addCriterion("teacherID <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLike(String value) {
            addCriterion("teacherID like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotLike(String value) {
            addCriterion("teacherID not like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<String> values) {
            addCriterion("teacherID in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<String> values) {
            addCriterion("teacherID not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(String value1, String value2) {
            addCriterion("teacherID between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(String value1, String value2) {
            addCriterion("teacherID not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andIsorderIsNull() {
            addCriterion("isOrder is null");
            return (Criteria) this;
        }

        public Criteria andIsorderIsNotNull() {
            addCriterion("isOrder is not null");
            return (Criteria) this;
        }

        public Criteria andIsorderEqualTo(String value) {
            addCriterion("isOrder =", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderNotEqualTo(String value) {
            addCriterion("isOrder <>", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderGreaterThan(String value) {
            addCriterion("isOrder >", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderGreaterThanOrEqualTo(String value) {
            addCriterion("isOrder >=", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderLessThan(String value) {
            addCriterion("isOrder <", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderLessThanOrEqualTo(String value) {
            addCriterion("isOrder <=", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderLike(String value) {
            addCriterion("isOrder like", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderNotLike(String value) {
            addCriterion("isOrder not like", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderIn(List<String> values) {
            addCriterion("isOrder in", values, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderNotIn(List<String> values) {
            addCriterion("isOrder not in", values, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderBetween(String value1, String value2) {
            addCriterion("isOrder between", value1, value2, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderNotBetween(String value1, String value2) {
            addCriterion("isOrder not between", value1, value2, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsconfirmIsNull() {
            addCriterion("isConfirm is null");
            return (Criteria) this;
        }

        public Criteria andIsconfirmIsNotNull() {
            addCriterion("isConfirm is not null");
            return (Criteria) this;
        }

        public Criteria andIsconfirmEqualTo(String value) {
            addCriterion("isConfirm =", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmNotEqualTo(String value) {
            addCriterion("isConfirm <>", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmGreaterThan(String value) {
            addCriterion("isConfirm >", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmGreaterThanOrEqualTo(String value) {
            addCriterion("isConfirm >=", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmLessThan(String value) {
            addCriterion("isConfirm <", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmLessThanOrEqualTo(String value) {
            addCriterion("isConfirm <=", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmLike(String value) {
            addCriterion("isConfirm like", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmNotLike(String value) {
            addCriterion("isConfirm not like", value, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmIn(List<String> values) {
            addCriterion("isConfirm in", values, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmNotIn(List<String> values) {
            addCriterion("isConfirm not in", values, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmBetween(String value1, String value2) {
            addCriterion("isConfirm between", value1, value2, "isconfirm");
            return (Criteria) this;
        }

        public Criteria andIsconfirmNotBetween(String value1, String value2) {
            addCriterion("isConfirm not between", value1, value2, "isconfirm");
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