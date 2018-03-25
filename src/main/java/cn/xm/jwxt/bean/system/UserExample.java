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