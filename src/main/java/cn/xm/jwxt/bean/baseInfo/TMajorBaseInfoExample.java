package cn.xm.jwxt.bean.baseInfo;

import java.util.ArrayList;
import java.util.List;

public class TMajorBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMajorBaseInfoExample() {
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

        public Criteria andMajoridIsNull() {
            addCriterion("majorID is null");
            return (Criteria) this;
        }

        public Criteria andMajoridIsNotNull() {
            addCriterion("majorID is not null");
            return (Criteria) this;
        }

        public Criteria andMajoridEqualTo(String value) {
            addCriterion("majorID =", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotEqualTo(String value) {
            addCriterion("majorID <>", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThan(String value) {
            addCriterion("majorID >", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThanOrEqualTo(String value) {
            addCriterion("majorID >=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThan(String value) {
            addCriterion("majorID <", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThanOrEqualTo(String value) {
            addCriterion("majorID <=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLike(String value) {
            addCriterion("majorID like", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotLike(String value) {
            addCriterion("majorID not like", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridIn(List<String> values) {
            addCriterion("majorID in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotIn(List<String> values) {
            addCriterion("majorID not in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridBetween(String value1, String value2) {
            addCriterion("majorID between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotBetween(String value1, String value2) {
            addCriterion("majorID not between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajornumIsNull() {
            addCriterion("majorNum is null");
            return (Criteria) this;
        }

        public Criteria andMajornumIsNotNull() {
            addCriterion("majorNum is not null");
            return (Criteria) this;
        }

        public Criteria andMajornumEqualTo(String value) {
            addCriterion("majorNum =", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotEqualTo(String value) {
            addCriterion("majorNum <>", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumGreaterThan(String value) {
            addCriterion("majorNum >", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumGreaterThanOrEqualTo(String value) {
            addCriterion("majorNum >=", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLessThan(String value) {
            addCriterion("majorNum <", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLessThanOrEqualTo(String value) {
            addCriterion("majorNum <=", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLike(String value) {
            addCriterion("majorNum like", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotLike(String value) {
            addCriterion("majorNum not like", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumIn(List<String> values) {
            addCriterion("majorNum in", values, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotIn(List<String> values) {
            addCriterion("majorNum not in", values, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumBetween(String value1, String value2) {
            addCriterion("majorNum between", value1, value2, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotBetween(String value1, String value2) {
            addCriterion("majorNum not between", value1, value2, "majornum");
            return (Criteria) this;
        }

        public Criteria andCollegeidIsNull() {
            addCriterion("collegeID is null");
            return (Criteria) this;
        }

        public Criteria andCollegeidIsNotNull() {
            addCriterion("collegeID is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeidEqualTo(String value) {
            addCriterion("collegeID =", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotEqualTo(String value) {
            addCriterion("collegeID <>", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidGreaterThan(String value) {
            addCriterion("collegeID >", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidGreaterThanOrEqualTo(String value) {
            addCriterion("collegeID >=", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidLessThan(String value) {
            addCriterion("collegeID <", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidLessThanOrEqualTo(String value) {
            addCriterion("collegeID <=", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidLike(String value) {
            addCriterion("collegeID like", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotLike(String value) {
            addCriterion("collegeID not like", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidIn(List<String> values) {
            addCriterion("collegeID in", values, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotIn(List<String> values) {
            addCriterion("collegeID not in", values, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidBetween(String value1, String value2) {
            addCriterion("collegeID between", value1, value2, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotBetween(String value1, String value2) {
            addCriterion("collegeID not between", value1, value2, "collegeid");
            return (Criteria) this;
        }

        public Criteria andMajornameIsNull() {
            addCriterion("majorName is null");
            return (Criteria) this;
        }

        public Criteria andMajornameIsNotNull() {
            addCriterion("majorName is not null");
            return (Criteria) this;
        }

        public Criteria andMajornameEqualTo(String value) {
            addCriterion("majorName =", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotEqualTo(String value) {
            addCriterion("majorName <>", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameGreaterThan(String value) {
            addCriterion("majorName >", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameGreaterThanOrEqualTo(String value) {
            addCriterion("majorName >=", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLessThan(String value) {
            addCriterion("majorName <", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLessThanOrEqualTo(String value) {
            addCriterion("majorName <=", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLike(String value) {
            addCriterion("majorName like", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotLike(String value) {
            addCriterion("majorName not like", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameIn(List<String> values) {
            addCriterion("majorName in", values, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotIn(List<String> values) {
            addCriterion("majorName not in", values, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameBetween(String value1, String value2) {
            addCriterion("majorName between", value1, value2, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotBetween(String value1, String value2) {
            addCriterion("majorName not between", value1, value2, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajorshortnameIsNull() {
            addCriterion("majorShortName is null");
            return (Criteria) this;
        }

        public Criteria andMajorshortnameIsNotNull() {
            addCriterion("majorShortName is not null");
            return (Criteria) this;
        }

        public Criteria andMajorshortnameEqualTo(String value) {
            addCriterion("majorShortName =", value, "majorshortname");
            return (Criteria) this;
        }

        public Criteria andMajorshortnameNotEqualTo(String value) {
            addCriterion("majorShortName <>", value, "majorshortname");
            return (Criteria) this;
        }

        public Criteria andMajorshortnameGreaterThan(String value) {
            addCriterion("majorShortName >", value, "majorshortname");
            return (Criteria) this;
        }

        public Criteria andMajorshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("majorShortName >=", value, "majorshortname");
            return (Criteria) this;
        }

        public Criteria andMajorshortnameLessThan(String value) {
            addCriterion("majorShortName <", value, "majorshortname");
            return (Criteria) this;
        }

        public Criteria andMajorshortnameLessThanOrEqualTo(String value) {
            addCriterion("majorShortName <=", value, "majorshortname");
            return (Criteria) this;
        }

        public Criteria andMajorshortnameLike(String value) {
            addCriterion("majorShortName like", value, "majorshortname");
            return (Criteria) this;
        }

        public Criteria andMajorshortnameNotLike(String value) {
            addCriterion("majorShortName not like", value, "majorshortname");
            return (Criteria) this;
        }

        public Criteria andMajorshortnameIn(List<String> values) {
            addCriterion("majorShortName in", values, "majorshortname");
            return (Criteria) this;
        }

        public Criteria andMajorshortnameNotIn(List<String> values) {
            addCriterion("majorShortName not in", values, "majorshortname");
            return (Criteria) this;
        }

        public Criteria andMajorshortnameBetween(String value1, String value2) {
            addCriterion("majorShortName between", value1, value2, "majorshortname");
            return (Criteria) this;
        }

        public Criteria andMajorshortnameNotBetween(String value1, String value2) {
            addCriterion("majorShortName not between", value1, value2, "majorshortname");
            return (Criteria) this;
        }

        public Criteria andMajorsortIsNull() {
            addCriterion("majorSort is null");
            return (Criteria) this;
        }

        public Criteria andMajorsortIsNotNull() {
            addCriterion("majorSort is not null");
            return (Criteria) this;
        }

        public Criteria andMajorsortEqualTo(String value) {
            addCriterion("majorSort =", value, "majorsort");
            return (Criteria) this;
        }

        public Criteria andMajorsortNotEqualTo(String value) {
            addCriterion("majorSort <>", value, "majorsort");
            return (Criteria) this;
        }

        public Criteria andMajorsortGreaterThan(String value) {
            addCriterion("majorSort >", value, "majorsort");
            return (Criteria) this;
        }

        public Criteria andMajorsortGreaterThanOrEqualTo(String value) {
            addCriterion("majorSort >=", value, "majorsort");
            return (Criteria) this;
        }

        public Criteria andMajorsortLessThan(String value) {
            addCriterion("majorSort <", value, "majorsort");
            return (Criteria) this;
        }

        public Criteria andMajorsortLessThanOrEqualTo(String value) {
            addCriterion("majorSort <=", value, "majorsort");
            return (Criteria) this;
        }

        public Criteria andMajorsortLike(String value) {
            addCriterion("majorSort like", value, "majorsort");
            return (Criteria) this;
        }

        public Criteria andMajorsortNotLike(String value) {
            addCriterion("majorSort not like", value, "majorsort");
            return (Criteria) this;
        }

        public Criteria andMajorsortIn(List<String> values) {
            addCriterion("majorSort in", values, "majorsort");
            return (Criteria) this;
        }

        public Criteria andMajorsortNotIn(List<String> values) {
            addCriterion("majorSort not in", values, "majorsort");
            return (Criteria) this;
        }

        public Criteria andMajorsortBetween(String value1, String value2) {
            addCriterion("majorSort between", value1, value2, "majorsort");
            return (Criteria) this;
        }

        public Criteria andMajorsortNotBetween(String value1, String value2) {
            addCriterion("majorSort not between", value1, value2, "majorsort");
            return (Criteria) this;
        }

        public Criteria andMajormanagerIsNull() {
            addCriterion("majorManager is null");
            return (Criteria) this;
        }

        public Criteria andMajormanagerIsNotNull() {
            addCriterion("majorManager is not null");
            return (Criteria) this;
        }

        public Criteria andMajormanagerEqualTo(String value) {
            addCriterion("majorManager =", value, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerNotEqualTo(String value) {
            addCriterion("majorManager <>", value, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerGreaterThan(String value) {
            addCriterion("majorManager >", value, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerGreaterThanOrEqualTo(String value) {
            addCriterion("majorManager >=", value, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerLessThan(String value) {
            addCriterion("majorManager <", value, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerLessThanOrEqualTo(String value) {
            addCriterion("majorManager <=", value, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerLike(String value) {
            addCriterion("majorManager like", value, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerNotLike(String value) {
            addCriterion("majorManager not like", value, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerIn(List<String> values) {
            addCriterion("majorManager in", values, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerNotIn(List<String> values) {
            addCriterion("majorManager not in", values, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerBetween(String value1, String value2) {
            addCriterion("majorManager between", value1, value2, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerNotBetween(String value1, String value2) {
            addCriterion("majorManager not between", value1, value2, "majormanager");
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