package cn.xm.jwxt.bean.common;

import java.util.ArrayList;
import java.util.List;

public class DictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictionaryExample() {
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

        public Criteria andDictionaryidIsNull() {
            addCriterion("dictionaryID is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryidIsNotNull() {
            addCriterion("dictionaryID is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryidEqualTo(String value) {
            addCriterion("dictionaryID =", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidNotEqualTo(String value) {
            addCriterion("dictionaryID <>", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidGreaterThan(String value) {
            addCriterion("dictionaryID >", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidGreaterThanOrEqualTo(String value) {
            addCriterion("dictionaryID >=", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidLessThan(String value) {
            addCriterion("dictionaryID <", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidLessThanOrEqualTo(String value) {
            addCriterion("dictionaryID <=", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidLike(String value) {
            addCriterion("dictionaryID like", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidNotLike(String value) {
            addCriterion("dictionaryID not like", value, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidIn(List<String> values) {
            addCriterion("dictionaryID in", values, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidNotIn(List<String> values) {
            addCriterion("dictionaryID not in", values, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidBetween(String value1, String value2) {
            addCriterion("dictionaryID between", value1, value2, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionaryidNotBetween(String value1, String value2) {
            addCriterion("dictionaryID not between", value1, value2, "dictionaryid");
            return (Criteria) this;
        }

        public Criteria andDictionarynameIsNull() {
            addCriterion("dictionaryName is null");
            return (Criteria) this;
        }

        public Criteria andDictionarynameIsNotNull() {
            addCriterion("dictionaryName is not null");
            return (Criteria) this;
        }

        public Criteria andDictionarynameEqualTo(String value) {
            addCriterion("dictionaryName =", value, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameNotEqualTo(String value) {
            addCriterion("dictionaryName <>", value, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameGreaterThan(String value) {
            addCriterion("dictionaryName >", value, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameGreaterThanOrEqualTo(String value) {
            addCriterion("dictionaryName >=", value, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameLessThan(String value) {
            addCriterion("dictionaryName <", value, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameLessThanOrEqualTo(String value) {
            addCriterion("dictionaryName <=", value, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameLike(String value) {
            addCriterion("dictionaryName like", value, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameNotLike(String value) {
            addCriterion("dictionaryName not like", value, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameIn(List<String> values) {
            addCriterion("dictionaryName in", values, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameNotIn(List<String> values) {
            addCriterion("dictionaryName not in", values, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameBetween(String value1, String value2) {
            addCriterion("dictionaryName between", value1, value2, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andDictionarynameNotBetween(String value1, String value2) {
            addCriterion("dictionaryName not between", value1, value2, "dictionaryname");
            return (Criteria) this;
        }

        public Criteria andUpdictionaryidIsNull() {
            addCriterion("updictionaryID is null");
            return (Criteria) this;
        }

        public Criteria andUpdictionaryidIsNotNull() {
            addCriterion("updictionaryID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdictionaryidEqualTo(String value) {
            addCriterion("updictionaryID =", value, "updictionaryid");
            return (Criteria) this;
        }

        public Criteria andUpdictionaryidNotEqualTo(String value) {
            addCriterion("updictionaryID <>", value, "updictionaryid");
            return (Criteria) this;
        }

        public Criteria andUpdictionaryidGreaterThan(String value) {
            addCriterion("updictionaryID >", value, "updictionaryid");
            return (Criteria) this;
        }

        public Criteria andUpdictionaryidGreaterThanOrEqualTo(String value) {
            addCriterion("updictionaryID >=", value, "updictionaryid");
            return (Criteria) this;
        }

        public Criteria andUpdictionaryidLessThan(String value) {
            addCriterion("updictionaryID <", value, "updictionaryid");
            return (Criteria) this;
        }

        public Criteria andUpdictionaryidLessThanOrEqualTo(String value) {
            addCriterion("updictionaryID <=", value, "updictionaryid");
            return (Criteria) this;
        }

        public Criteria andUpdictionaryidLike(String value) {
            addCriterion("updictionaryID like", value, "updictionaryid");
            return (Criteria) this;
        }

        public Criteria andUpdictionaryidNotLike(String value) {
            addCriterion("updictionaryID not like", value, "updictionaryid");
            return (Criteria) this;
        }

        public Criteria andUpdictionaryidIn(List<String> values) {
            addCriterion("updictionaryID in", values, "updictionaryid");
            return (Criteria) this;
        }

        public Criteria andUpdictionaryidNotIn(List<String> values) {
            addCriterion("updictionaryID not in", values, "updictionaryid");
            return (Criteria) this;
        }

        public Criteria andUpdictionaryidBetween(String value1, String value2) {
            addCriterion("updictionaryID between", value1, value2, "updictionaryid");
            return (Criteria) this;
        }

        public Criteria andUpdictionaryidNotBetween(String value1, String value2) {
            addCriterion("updictionaryID not between", value1, value2, "updictionaryid");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDatatypeIsNull() {
            addCriterion("dataType is null");
            return (Criteria) this;
        }

        public Criteria andDatatypeIsNotNull() {
            addCriterion("dataType is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypeEqualTo(String value) {
            addCriterion("dataType =", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotEqualTo(String value) {
            addCriterion("dataType <>", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThan(String value) {
            addCriterion("dataType >", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThanOrEqualTo(String value) {
            addCriterion("dataType >=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThan(String value) {
            addCriterion("dataType <", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThanOrEqualTo(String value) {
            addCriterion("dataType <=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLike(String value) {
            addCriterion("dataType like", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotLike(String value) {
            addCriterion("dataType not like", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeIn(List<String> values) {
            addCriterion("dataType in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotIn(List<String> values) {
            addCriterion("dataType not in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeBetween(String value1, String value2) {
            addCriterion("dataType between", value1, value2, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotBetween(String value1, String value2) {
            addCriterion("dataType not between", value1, value2, "datatype");
            return (Criteria) this;
        }

        public Criteria andSortnoIsNull() {
            addCriterion("sortNo is null");
            return (Criteria) this;
        }

        public Criteria andSortnoIsNotNull() {
            addCriterion("sortNo is not null");
            return (Criteria) this;
        }

        public Criteria andSortnoEqualTo(String value) {
            addCriterion("sortNo =", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotEqualTo(String value) {
            addCriterion("sortNo <>", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoGreaterThan(String value) {
            addCriterion("sortNo >", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoGreaterThanOrEqualTo(String value) {
            addCriterion("sortNo >=", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLessThan(String value) {
            addCriterion("sortNo <", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLessThanOrEqualTo(String value) {
            addCriterion("sortNo <=", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLike(String value) {
            addCriterion("sortNo like", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotLike(String value) {
            addCriterion("sortNo not like", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoIn(List<String> values) {
            addCriterion("sortNo in", values, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotIn(List<String> values) {
            addCriterion("sortNo not in", values, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoBetween(String value1, String value2) {
            addCriterion("sortNo between", value1, value2, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotBetween(String value1, String value2) {
            addCriterion("sortNo not between", value1, value2, "sortno");
            return (Criteria) this;
        }

        public Criteria andIsuseIsNull() {
            addCriterion("isUse is null");
            return (Criteria) this;
        }

        public Criteria andIsuseIsNotNull() {
            addCriterion("isUse is not null");
            return (Criteria) this;
        }

        public Criteria andIsuseEqualTo(String value) {
            addCriterion("isUse =", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseNotEqualTo(String value) {
            addCriterion("isUse <>", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseGreaterThan(String value) {
            addCriterion("isUse >", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseGreaterThanOrEqualTo(String value) {
            addCriterion("isUse >=", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseLessThan(String value) {
            addCriterion("isUse <", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseLessThanOrEqualTo(String value) {
            addCriterion("isUse <=", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseLike(String value) {
            addCriterion("isUse like", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseNotLike(String value) {
            addCriterion("isUse not like", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseIn(List<String> values) {
            addCriterion("isUse in", values, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseNotIn(List<String> values) {
            addCriterion("isUse not in", values, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseBetween(String value1, String value2) {
            addCriterion("isUse between", value1, value2, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseNotBetween(String value1, String value2) {
            addCriterion("isUse not between", value1, value2, "isuse");
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