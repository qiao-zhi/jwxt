package cn.xm.jwxt.bean.system;

import java.util.ArrayList;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleExample() {
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

        public Criteria andRoleidIsNull() {
            addCriterion("roleID is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(String value) {
            addCriterion("roleID =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(String value) {
            addCriterion("roleID <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(String value) {
            addCriterion("roleID >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(String value) {
            addCriterion("roleID >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(String value) {
            addCriterion("roleID <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(String value) {
            addCriterion("roleID <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLike(String value) {
            addCriterion("roleID like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotLike(String value) {
            addCriterion("roleID not like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<String> values) {
            addCriterion("roleID in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<String> values) {
            addCriterion("roleID not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(String value1, String value2) {
            addCriterion("roleID between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(String value1, String value2) {
            addCriterion("roleID not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNull() {
            addCriterion("roleName is null");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNotNull() {
            addCriterion("roleName is not null");
            return (Criteria) this;
        }

        public Criteria andRolenameEqualTo(String value) {
            addCriterion("roleName =", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotEqualTo(String value) {
            addCriterion("roleName <>", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThan(String value) {
            addCriterion("roleName >", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("roleName >=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThan(String value) {
            addCriterion("roleName <", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThanOrEqualTo(String value) {
            addCriterion("roleName <=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLike(String value) {
            addCriterion("roleName like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotLike(String value) {
            addCriterion("roleName not like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameIn(List<String> values) {
            addCriterion("roleName in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotIn(List<String> values) {
            addCriterion("roleName not in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameBetween(String value1, String value2) {
            addCriterion("roleName between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotBetween(String value1, String value2) {
            addCriterion("roleName not between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolestatusIsNull() {
            addCriterion("roleStatus is null");
            return (Criteria) this;
        }

        public Criteria andRolestatusIsNotNull() {
            addCriterion("roleStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRolestatusEqualTo(String value) {
            addCriterion("roleStatus =", value, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusNotEqualTo(String value) {
            addCriterion("roleStatus <>", value, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusGreaterThan(String value) {
            addCriterion("roleStatus >", value, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusGreaterThanOrEqualTo(String value) {
            addCriterion("roleStatus >=", value, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusLessThan(String value) {
            addCriterion("roleStatus <", value, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusLessThanOrEqualTo(String value) {
            addCriterion("roleStatus <=", value, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusLike(String value) {
            addCriterion("roleStatus like", value, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusNotLike(String value) {
            addCriterion("roleStatus not like", value, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusIn(List<String> values) {
            addCriterion("roleStatus in", values, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusNotIn(List<String> values) {
            addCriterion("roleStatus not in", values, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusBetween(String value1, String value2) {
            addCriterion("roleStatus between", value1, value2, "rolestatus");
            return (Criteria) this;
        }

        public Criteria andRolestatusNotBetween(String value1, String value2) {
            addCriterion("roleStatus not between", value1, value2, "rolestatus");
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

        public Criteria andInsituteidIsNull() {
            addCriterion("InsituteID is null");
            return (Criteria) this;
        }

        public Criteria andInsituteidIsNotNull() {
            addCriterion("InsituteID is not null");
            return (Criteria) this;
        }

        public Criteria andInsituteidEqualTo(String value) {
            addCriterion("InsituteID =", value, "insituteid");
            return (Criteria) this;
        }

        public Criteria andInsituteidNotEqualTo(String value) {
            addCriterion("InsituteID <>", value, "insituteid");
            return (Criteria) this;
        }

        public Criteria andInsituteidGreaterThan(String value) {
            addCriterion("InsituteID >", value, "insituteid");
            return (Criteria) this;
        }

        public Criteria andInsituteidGreaterThanOrEqualTo(String value) {
            addCriterion("InsituteID >=", value, "insituteid");
            return (Criteria) this;
        }

        public Criteria andInsituteidLessThan(String value) {
            addCriterion("InsituteID <", value, "insituteid");
            return (Criteria) this;
        }

        public Criteria andInsituteidLessThanOrEqualTo(String value) {
            addCriterion("InsituteID <=", value, "insituteid");
            return (Criteria) this;
        }

        public Criteria andInsituteidLike(String value) {
            addCriterion("InsituteID like", value, "insituteid");
            return (Criteria) this;
        }

        public Criteria andInsituteidNotLike(String value) {
            addCriterion("InsituteID not like", value, "insituteid");
            return (Criteria) this;
        }

        public Criteria andInsituteidIn(List<String> values) {
            addCriterion("InsituteID in", values, "insituteid");
            return (Criteria) this;
        }

        public Criteria andInsituteidNotIn(List<String> values) {
            addCriterion("InsituteID not in", values, "insituteid");
            return (Criteria) this;
        }

        public Criteria andInsituteidBetween(String value1, String value2) {
            addCriterion("InsituteID between", value1, value2, "insituteid");
            return (Criteria) this;
        }

        public Criteria andInsituteidNotBetween(String value1, String value2) {
            addCriterion("InsituteID not between", value1, value2, "insituteid");
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