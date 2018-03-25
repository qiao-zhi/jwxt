package cn.xm.jwxt.bean.orderBooks;

import java.util.ArrayList;
import java.util.List;

public class TTextbookBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTextbookBaseInfoExample() {
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

        public Criteria andTextbooknumIsNull() {
            addCriterion("textbookNUM is null");
            return (Criteria) this;
        }

        public Criteria andTextbooknumIsNotNull() {
            addCriterion("textbookNUM is not null");
            return (Criteria) this;
        }

        public Criteria andTextbooknumEqualTo(String value) {
            addCriterion("textbookNUM =", value, "textbooknum");
            return (Criteria) this;
        }

        public Criteria andTextbooknumNotEqualTo(String value) {
            addCriterion("textbookNUM <>", value, "textbooknum");
            return (Criteria) this;
        }

        public Criteria andTextbooknumGreaterThan(String value) {
            addCriterion("textbookNUM >", value, "textbooknum");
            return (Criteria) this;
        }

        public Criteria andTextbooknumGreaterThanOrEqualTo(String value) {
            addCriterion("textbookNUM >=", value, "textbooknum");
            return (Criteria) this;
        }

        public Criteria andTextbooknumLessThan(String value) {
            addCriterion("textbookNUM <", value, "textbooknum");
            return (Criteria) this;
        }

        public Criteria andTextbooknumLessThanOrEqualTo(String value) {
            addCriterion("textbookNUM <=", value, "textbooknum");
            return (Criteria) this;
        }

        public Criteria andTextbooknumLike(String value) {
            addCriterion("textbookNUM like", value, "textbooknum");
            return (Criteria) this;
        }

        public Criteria andTextbooknumNotLike(String value) {
            addCriterion("textbookNUM not like", value, "textbooknum");
            return (Criteria) this;
        }

        public Criteria andTextbooknumIn(List<String> values) {
            addCriterion("textbookNUM in", values, "textbooknum");
            return (Criteria) this;
        }

        public Criteria andTextbooknumNotIn(List<String> values) {
            addCriterion("textbookNUM not in", values, "textbooknum");
            return (Criteria) this;
        }

        public Criteria andTextbooknumBetween(String value1, String value2) {
            addCriterion("textbookNUM between", value1, value2, "textbooknum");
            return (Criteria) this;
        }

        public Criteria andTextbooknumNotBetween(String value1, String value2) {
            addCriterion("textbookNUM not between", value1, value2, "textbooknum");
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

        public Criteria andTextbooknameIsNull() {
            addCriterion("textbookName is null");
            return (Criteria) this;
        }

        public Criteria andTextbooknameIsNotNull() {
            addCriterion("textbookName is not null");
            return (Criteria) this;
        }

        public Criteria andTextbooknameEqualTo(String value) {
            addCriterion("textbookName =", value, "textbookname");
            return (Criteria) this;
        }

        public Criteria andTextbooknameNotEqualTo(String value) {
            addCriterion("textbookName <>", value, "textbookname");
            return (Criteria) this;
        }

        public Criteria andTextbooknameGreaterThan(String value) {
            addCriterion("textbookName >", value, "textbookname");
            return (Criteria) this;
        }

        public Criteria andTextbooknameGreaterThanOrEqualTo(String value) {
            addCriterion("textbookName >=", value, "textbookname");
            return (Criteria) this;
        }

        public Criteria andTextbooknameLessThan(String value) {
            addCriterion("textbookName <", value, "textbookname");
            return (Criteria) this;
        }

        public Criteria andTextbooknameLessThanOrEqualTo(String value) {
            addCriterion("textbookName <=", value, "textbookname");
            return (Criteria) this;
        }

        public Criteria andTextbooknameLike(String value) {
            addCriterion("textbookName like", value, "textbookname");
            return (Criteria) this;
        }

        public Criteria andTextbooknameNotLike(String value) {
            addCriterion("textbookName not like", value, "textbookname");
            return (Criteria) this;
        }

        public Criteria andTextbooknameIn(List<String> values) {
            addCriterion("textbookName in", values, "textbookname");
            return (Criteria) this;
        }

        public Criteria andTextbooknameNotIn(List<String> values) {
            addCriterion("textbookName not in", values, "textbookname");
            return (Criteria) this;
        }

        public Criteria andTextbooknameBetween(String value1, String value2) {
            addCriterion("textbookName between", value1, value2, "textbookname");
            return (Criteria) this;
        }

        public Criteria andTextbooknameNotBetween(String value1, String value2) {
            addCriterion("textbookName not between", value1, value2, "textbookname");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseIsNull() {
            addCriterion("publishingHouse is null");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseIsNotNull() {
            addCriterion("publishingHouse is not null");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseEqualTo(String value) {
            addCriterion("publishingHouse =", value, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseNotEqualTo(String value) {
            addCriterion("publishingHouse <>", value, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseGreaterThan(String value) {
            addCriterion("publishingHouse >", value, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseGreaterThanOrEqualTo(String value) {
            addCriterion("publishingHouse >=", value, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseLessThan(String value) {
            addCriterion("publishingHouse <", value, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseLessThanOrEqualTo(String value) {
            addCriterion("publishingHouse <=", value, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseLike(String value) {
            addCriterion("publishingHouse like", value, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseNotLike(String value) {
            addCriterion("publishingHouse not like", value, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseIn(List<String> values) {
            addCriterion("publishingHouse in", values, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseNotIn(List<String> values) {
            addCriterion("publishingHouse not in", values, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseBetween(String value1, String value2) {
            addCriterion("publishingHouse between", value1, value2, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andPublishinghouseNotBetween(String value1, String value2) {
            addCriterion("publishingHouse not between", value1, value2, "publishinghouse");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNull() {
            addCriterion("isbn is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("isbn is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("isbn =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("isbn <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("isbn >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("isbn >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("isbn <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("isbn <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("isbn like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("isbn not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("isbn in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("isbn not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("isbn between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("isbn not between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
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