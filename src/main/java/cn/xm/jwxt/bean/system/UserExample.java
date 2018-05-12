package cn.xm.jwxt.bean.system;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNull() {
            addCriterion("userCode is null");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNotNull() {
            addCriterion("userCode is not null");
            return (Criteria) this;
        }

        public Criteria andUsercodeEqualTo(String value) {
            addCriterion("userCode =", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotEqualTo(String value) {
            addCriterion("userCode <>", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThan(String value) {
            addCriterion("userCode >", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThanOrEqualTo(String value) {
            addCriterion("userCode >=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThan(String value) {
            addCriterion("userCode <", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThanOrEqualTo(String value) {
            addCriterion("userCode <=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLike(String value) {
            addCriterion("userCode like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotLike(String value) {
            addCriterion("userCode not like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeIn(List<String> values) {
            addCriterion("userCode in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotIn(List<String> values) {
            addCriterion("userCode not in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeBetween(String value1, String value2) {
            addCriterion("userCode between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotBetween(String value1, String value2) {
            addCriterion("userCode not between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUsersortIsNull() {
            addCriterion("userSort is null");
            return (Criteria) this;
        }

        public Criteria andUsersortIsNotNull() {
            addCriterion("userSort is not null");
            return (Criteria) this;
        }

        public Criteria andUsersortEqualTo(String value) {
            addCriterion("userSort =", value, "usersort");
            return (Criteria) this;
        }

        public Criteria andUsersortNotEqualTo(String value) {
            addCriterion("userSort <>", value, "usersort");
            return (Criteria) this;
        }

        public Criteria andUsersortGreaterThan(String value) {
            addCriterion("userSort >", value, "usersort");
            return (Criteria) this;
        }

        public Criteria andUsersortGreaterThanOrEqualTo(String value) {
            addCriterion("userSort >=", value, "usersort");
            return (Criteria) this;
        }

        public Criteria andUsersortLessThan(String value) {
            addCriterion("userSort <", value, "usersort");
            return (Criteria) this;
        }

        public Criteria andUsersortLessThanOrEqualTo(String value) {
            addCriterion("userSort <=", value, "usersort");
            return (Criteria) this;
        }

        public Criteria andUsersortLike(String value) {
            addCriterion("userSort like", value, "usersort");
            return (Criteria) this;
        }

        public Criteria andUsersortNotLike(String value) {
            addCriterion("userSort not like", value, "usersort");
            return (Criteria) this;
        }

        public Criteria andUsersortIn(List<String> values) {
            addCriterion("userSort in", values, "usersort");
            return (Criteria) this;
        }

        public Criteria andUsersortNotIn(List<String> values) {
            addCriterion("userSort not in", values, "usersort");
            return (Criteria) this;
        }

        public Criteria andUsersortBetween(String value1, String value2) {
            addCriterion("userSort between", value1, value2, "usersort");
            return (Criteria) this;
        }

        public Criteria andUsersortNotBetween(String value1, String value2) {
            addCriterion("userSort not between", value1, value2, "usersort");
            return (Criteria) this;
        }

        public Criteria andUserstuteanumIsNull() {
            addCriterion("userStuTeaNum is null");
            return (Criteria) this;
        }

        public Criteria andUserstuteanumIsNotNull() {
            addCriterion("userStuTeaNum is not null");
            return (Criteria) this;
        }

        public Criteria andUserstuteanumEqualTo(String value) {
            addCriterion("userStuTeaNum =", value, "userstuteanum");
            return (Criteria) this;
        }

        public Criteria andUserstuteanumNotEqualTo(String value) {
            addCriterion("userStuTeaNum <>", value, "userstuteanum");
            return (Criteria) this;
        }

        public Criteria andUserstuteanumGreaterThan(String value) {
            addCriterion("userStuTeaNum >", value, "userstuteanum");
            return (Criteria) this;
        }

        public Criteria andUserstuteanumGreaterThanOrEqualTo(String value) {
            addCriterion("userStuTeaNum >=", value, "userstuteanum");
            return (Criteria) this;
        }

        public Criteria andUserstuteanumLessThan(String value) {
            addCriterion("userStuTeaNum <", value, "userstuteanum");
            return (Criteria) this;
        }

        public Criteria andUserstuteanumLessThanOrEqualTo(String value) {
            addCriterion("userStuTeaNum <=", value, "userstuteanum");
            return (Criteria) this;
        }

        public Criteria andUserstuteanumLike(String value) {
            addCriterion("userStuTeaNum like", value, "userstuteanum");
            return (Criteria) this;
        }

        public Criteria andUserstuteanumNotLike(String value) {
            addCriterion("userStuTeaNum not like", value, "userstuteanum");
            return (Criteria) this;
        }

        public Criteria andUserstuteanumIn(List<String> values) {
            addCriterion("userStuTeaNum in", values, "userstuteanum");
            return (Criteria) this;
        }

        public Criteria andUserstuteanumNotIn(List<String> values) {
            addCriterion("userStuTeaNum not in", values, "userstuteanum");
            return (Criteria) this;
        }

        public Criteria andUserstuteanumBetween(String value1, String value2) {
            addCriterion("userStuTeaNum between", value1, value2, "userstuteanum");
            return (Criteria) this;
        }

        public Criteria andUserstuteanumNotBetween(String value1, String value2) {
            addCriterion("userStuTeaNum not between", value1, value2, "userstuteanum");
            return (Criteria) this;
        }

        public Criteria andUserunitnameIsNull() {
            addCriterion("userUnitName is null");
            return (Criteria) this;
        }

        public Criteria andUserunitnameIsNotNull() {
            addCriterion("userUnitName is not null");
            return (Criteria) this;
        }

        public Criteria andUserunitnameEqualTo(String value) {
            addCriterion("userUnitName =", value, "userunitname");
            return (Criteria) this;
        }

        public Criteria andUserunitnameNotEqualTo(String value) {
            addCriterion("userUnitName <>", value, "userunitname");
            return (Criteria) this;
        }

        public Criteria andUserunitnameGreaterThan(String value) {
            addCriterion("userUnitName >", value, "userunitname");
            return (Criteria) this;
        }

        public Criteria andUserunitnameGreaterThanOrEqualTo(String value) {
            addCriterion("userUnitName >=", value, "userunitname");
            return (Criteria) this;
        }

        public Criteria andUserunitnameLessThan(String value) {
            addCriterion("userUnitName <", value, "userunitname");
            return (Criteria) this;
        }

        public Criteria andUserunitnameLessThanOrEqualTo(String value) {
            addCriterion("userUnitName <=", value, "userunitname");
            return (Criteria) this;
        }

        public Criteria andUserunitnameLike(String value) {
            addCriterion("userUnitName like", value, "userunitname");
            return (Criteria) this;
        }

        public Criteria andUserunitnameNotLike(String value) {
            addCriterion("userUnitName not like", value, "userunitname");
            return (Criteria) this;
        }

        public Criteria andUserunitnameIn(List<String> values) {
            addCriterion("userUnitName in", values, "userunitname");
            return (Criteria) this;
        }

        public Criteria andUserunitnameNotIn(List<String> values) {
            addCriterion("userUnitName not in", values, "userunitname");
            return (Criteria) this;
        }

        public Criteria andUserunitnameBetween(String value1, String value2) {
            addCriterion("userUnitName between", value1, value2, "userunitname");
            return (Criteria) this;
        }

        public Criteria andUserunitnameNotBetween(String value1, String value2) {
            addCriterion("userUnitName not between", value1, value2, "userunitname");
            return (Criteria) this;
        }

        public Criteria andUserunitnumIsNull() {
            addCriterion("userUnitNum is null");
            return (Criteria) this;
        }

        public Criteria andUserunitnumIsNotNull() {
            addCriterion("userUnitNum is not null");
            return (Criteria) this;
        }

        public Criteria andUserunitnumEqualTo(String value) {
            addCriterion("userUnitNum =", value, "userunitnum");
            return (Criteria) this;
        }

        public Criteria andUserunitnumNotEqualTo(String value) {
            addCriterion("userUnitNum <>", value, "userunitnum");
            return (Criteria) this;
        }

        public Criteria andUserunitnumGreaterThan(String value) {
            addCriterion("userUnitNum >", value, "userunitnum");
            return (Criteria) this;
        }

        public Criteria andUserunitnumGreaterThanOrEqualTo(String value) {
            addCriterion("userUnitNum >=", value, "userunitnum");
            return (Criteria) this;
        }

        public Criteria andUserunitnumLessThan(String value) {
            addCriterion("userUnitNum <", value, "userunitnum");
            return (Criteria) this;
        }

        public Criteria andUserunitnumLessThanOrEqualTo(String value) {
            addCriterion("userUnitNum <=", value, "userunitnum");
            return (Criteria) this;
        }

        public Criteria andUserunitnumLike(String value) {
            addCriterion("userUnitNum like", value, "userunitnum");
            return (Criteria) this;
        }

        public Criteria andUserunitnumNotLike(String value) {
            addCriterion("userUnitNum not like", value, "userunitnum");
            return (Criteria) this;
        }

        public Criteria andUserunitnumIn(List<String> values) {
            addCriterion("userUnitNum in", values, "userunitnum");
            return (Criteria) this;
        }

        public Criteria andUserunitnumNotIn(List<String> values) {
            addCriterion("userUnitNum not in", values, "userunitnum");
            return (Criteria) this;
        }

        public Criteria andUserunitnumBetween(String value1, String value2) {
            addCriterion("userUnitNum between", value1, value2, "userunitnum");
            return (Criteria) this;
        }

        public Criteria andUserunitnumNotBetween(String value1, String value2) {
            addCriterion("userUnitNum not between", value1, value2, "userunitnum");
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