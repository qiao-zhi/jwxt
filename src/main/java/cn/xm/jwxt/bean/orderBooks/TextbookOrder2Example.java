package cn.xm.jwxt.bean.orderBooks;

import java.util.ArrayList;
import java.util.List;

public class TextbookOrder2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TextbookOrder2Example() {
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

        public Criteria andOrderdetailid2IsNull() {
            addCriterion("orderDetailID2 is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailid2IsNotNull() {
            addCriterion("orderDetailID2 is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailid2EqualTo(String value) {
            addCriterion("orderDetailID2 =", value, "orderdetailid2");
            return (Criteria) this;
        }

        public Criteria andOrderdetailid2NotEqualTo(String value) {
            addCriterion("orderDetailID2 <>", value, "orderdetailid2");
            return (Criteria) this;
        }

        public Criteria andOrderdetailid2GreaterThan(String value) {
            addCriterion("orderDetailID2 >", value, "orderdetailid2");
            return (Criteria) this;
        }

        public Criteria andOrderdetailid2GreaterThanOrEqualTo(String value) {
            addCriterion("orderDetailID2 >=", value, "orderdetailid2");
            return (Criteria) this;
        }

        public Criteria andOrderdetailid2LessThan(String value) {
            addCriterion("orderDetailID2 <", value, "orderdetailid2");
            return (Criteria) this;
        }

        public Criteria andOrderdetailid2LessThanOrEqualTo(String value) {
            addCriterion("orderDetailID2 <=", value, "orderdetailid2");
            return (Criteria) this;
        }

        public Criteria andOrderdetailid2Like(String value) {
            addCriterion("orderDetailID2 like", value, "orderdetailid2");
            return (Criteria) this;
        }

        public Criteria andOrderdetailid2NotLike(String value) {
            addCriterion("orderDetailID2 not like", value, "orderdetailid2");
            return (Criteria) this;
        }

        public Criteria andOrderdetailid2In(List<String> values) {
            addCriterion("orderDetailID2 in", values, "orderdetailid2");
            return (Criteria) this;
        }

        public Criteria andOrderdetailid2NotIn(List<String> values) {
            addCriterion("orderDetailID2 not in", values, "orderdetailid2");
            return (Criteria) this;
        }

        public Criteria andOrderdetailid2Between(String value1, String value2) {
            addCriterion("orderDetailID2 between", value1, value2, "orderdetailid2");
            return (Criteria) this;
        }

        public Criteria andOrderdetailid2NotBetween(String value1, String value2) {
            addCriterion("orderDetailID2 not between", value1, value2, "orderdetailid2");
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

        public Criteria andOrdernumIsNull() {
            addCriterion("orderNum is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("orderNum is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(Short value) {
            addCriterion("orderNum =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(Short value) {
            addCriterion("orderNum <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThan(Short value) {
            addCriterion("orderNum >", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThanOrEqualTo(Short value) {
            addCriterion("orderNum >=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThan(Short value) {
            addCriterion("orderNum <", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThanOrEqualTo(Short value) {
            addCriterion("orderNum <=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<Short> values) {
            addCriterion("orderNum in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<Short> values) {
            addCriterion("orderNum not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(Short value1, Short value2) {
            addCriterion("orderNum between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(Short value1, Short value2) {
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

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
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