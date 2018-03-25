package cn.xm.jwxt.bean.system;

import java.util.ArrayList;
import java.util.List;

public class PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionExample() {
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

        public Criteria andPermissionidIsNull() {
            addCriterion("permissionID is null");
            return (Criteria) this;
        }

        public Criteria andPermissionidIsNotNull() {
            addCriterion("permissionID is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionidEqualTo(String value) {
            addCriterion("permissionID =", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidNotEqualTo(String value) {
            addCriterion("permissionID <>", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidGreaterThan(String value) {
            addCriterion("permissionID >", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidGreaterThanOrEqualTo(String value) {
            addCriterion("permissionID >=", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidLessThan(String value) {
            addCriterion("permissionID <", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidLessThanOrEqualTo(String value) {
            addCriterion("permissionID <=", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidLike(String value) {
            addCriterion("permissionID like", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidNotLike(String value) {
            addCriterion("permissionID not like", value, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidIn(List<String> values) {
            addCriterion("permissionID in", values, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidNotIn(List<String> values) {
            addCriterion("permissionID not in", values, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidBetween(String value1, String value2) {
            addCriterion("permissionID between", value1, value2, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionidNotBetween(String value1, String value2) {
            addCriterion("permissionID not between", value1, value2, "permissionid");
            return (Criteria) this;
        }

        public Criteria andPermissionnameIsNull() {
            addCriterion("permissionName is null");
            return (Criteria) this;
        }

        public Criteria andPermissionnameIsNotNull() {
            addCriterion("permissionName is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionnameEqualTo(String value) {
            addCriterion("permissionName =", value, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameNotEqualTo(String value) {
            addCriterion("permissionName <>", value, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameGreaterThan(String value) {
            addCriterion("permissionName >", value, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameGreaterThanOrEqualTo(String value) {
            addCriterion("permissionName >=", value, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameLessThan(String value) {
            addCriterion("permissionName <", value, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameLessThanOrEqualTo(String value) {
            addCriterion("permissionName <=", value, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameLike(String value) {
            addCriterion("permissionName like", value, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameNotLike(String value) {
            addCriterion("permissionName not like", value, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameIn(List<String> values) {
            addCriterion("permissionName in", values, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameNotIn(List<String> values) {
            addCriterion("permissionName not in", values, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameBetween(String value1, String value2) {
            addCriterion("permissionName between", value1, value2, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionnameNotBetween(String value1, String value2) {
            addCriterion("permissionName not between", value1, value2, "permissionname");
            return (Criteria) this;
        }

        public Criteria andPermissionstatusIsNull() {
            addCriterion("permissionStatus is null");
            return (Criteria) this;
        }

        public Criteria andPermissionstatusIsNotNull() {
            addCriterion("permissionStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionstatusEqualTo(String value) {
            addCriterion("permissionStatus =", value, "permissionstatus");
            return (Criteria) this;
        }

        public Criteria andPermissionstatusNotEqualTo(String value) {
            addCriterion("permissionStatus <>", value, "permissionstatus");
            return (Criteria) this;
        }

        public Criteria andPermissionstatusGreaterThan(String value) {
            addCriterion("permissionStatus >", value, "permissionstatus");
            return (Criteria) this;
        }

        public Criteria andPermissionstatusGreaterThanOrEqualTo(String value) {
            addCriterion("permissionStatus >=", value, "permissionstatus");
            return (Criteria) this;
        }

        public Criteria andPermissionstatusLessThan(String value) {
            addCriterion("permissionStatus <", value, "permissionstatus");
            return (Criteria) this;
        }

        public Criteria andPermissionstatusLessThanOrEqualTo(String value) {
            addCriterion("permissionStatus <=", value, "permissionstatus");
            return (Criteria) this;
        }

        public Criteria andPermissionstatusLike(String value) {
            addCriterion("permissionStatus like", value, "permissionstatus");
            return (Criteria) this;
        }

        public Criteria andPermissionstatusNotLike(String value) {
            addCriterion("permissionStatus not like", value, "permissionstatus");
            return (Criteria) this;
        }

        public Criteria andPermissionstatusIn(List<String> values) {
            addCriterion("permissionStatus in", values, "permissionstatus");
            return (Criteria) this;
        }

        public Criteria andPermissionstatusNotIn(List<String> values) {
            addCriterion("permissionStatus not in", values, "permissionstatus");
            return (Criteria) this;
        }

        public Criteria andPermissionstatusBetween(String value1, String value2) {
            addCriterion("permissionStatus between", value1, value2, "permissionstatus");
            return (Criteria) this;
        }

        public Criteria andPermissionstatusNotBetween(String value1, String value2) {
            addCriterion("permissionStatus not between", value1, value2, "permissionstatus");
            return (Criteria) this;
        }

        public Criteria andPermissiontypeIsNull() {
            addCriterion("permissionType is null");
            return (Criteria) this;
        }

        public Criteria andPermissiontypeIsNotNull() {
            addCriterion("permissionType is not null");
            return (Criteria) this;
        }

        public Criteria andPermissiontypeEqualTo(String value) {
            addCriterion("permissionType =", value, "permissiontype");
            return (Criteria) this;
        }

        public Criteria andPermissiontypeNotEqualTo(String value) {
            addCriterion("permissionType <>", value, "permissiontype");
            return (Criteria) this;
        }

        public Criteria andPermissiontypeGreaterThan(String value) {
            addCriterion("permissionType >", value, "permissiontype");
            return (Criteria) this;
        }

        public Criteria andPermissiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("permissionType >=", value, "permissiontype");
            return (Criteria) this;
        }

        public Criteria andPermissiontypeLessThan(String value) {
            addCriterion("permissionType <", value, "permissiontype");
            return (Criteria) this;
        }

        public Criteria andPermissiontypeLessThanOrEqualTo(String value) {
            addCriterion("permissionType <=", value, "permissiontype");
            return (Criteria) this;
        }

        public Criteria andPermissiontypeLike(String value) {
            addCriterion("permissionType like", value, "permissiontype");
            return (Criteria) this;
        }

        public Criteria andPermissiontypeNotLike(String value) {
            addCriterion("permissionType not like", value, "permissiontype");
            return (Criteria) this;
        }

        public Criteria andPermissiontypeIn(List<String> values) {
            addCriterion("permissionType in", values, "permissiontype");
            return (Criteria) this;
        }

        public Criteria andPermissiontypeNotIn(List<String> values) {
            addCriterion("permissionType not in", values, "permissiontype");
            return (Criteria) this;
        }

        public Criteria andPermissiontypeBetween(String value1, String value2) {
            addCriterion("permissionType between", value1, value2, "permissiontype");
            return (Criteria) this;
        }

        public Criteria andPermissiontypeNotBetween(String value1, String value2) {
            addCriterion("permissionType not between", value1, value2, "permissiontype");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeIsNull() {
            addCriterion("permissionCode is null");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeIsNotNull() {
            addCriterion("permissionCode is not null");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeEqualTo(String value) {
            addCriterion("permissionCode =", value, "permissioncode");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeNotEqualTo(String value) {
            addCriterion("permissionCode <>", value, "permissioncode");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeGreaterThan(String value) {
            addCriterion("permissionCode >", value, "permissioncode");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("permissionCode >=", value, "permissioncode");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeLessThan(String value) {
            addCriterion("permissionCode <", value, "permissioncode");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeLessThanOrEqualTo(String value) {
            addCriterion("permissionCode <=", value, "permissioncode");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeLike(String value) {
            addCriterion("permissionCode like", value, "permissioncode");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeNotLike(String value) {
            addCriterion("permissionCode not like", value, "permissioncode");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeIn(List<String> values) {
            addCriterion("permissionCode in", values, "permissioncode");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeNotIn(List<String> values) {
            addCriterion("permissionCode not in", values, "permissioncode");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeBetween(String value1, String value2) {
            addCriterion("permissionCode between", value1, value2, "permissioncode");
            return (Criteria) this;
        }

        public Criteria andPermissioncodeNotBetween(String value1, String value2) {
            addCriterion("permissionCode not between", value1, value2, "permissioncode");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("parentId like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("parentId not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andSortnumIsNull() {
            addCriterion("sortNum is null");
            return (Criteria) this;
        }

        public Criteria andSortnumIsNotNull() {
            addCriterion("sortNum is not null");
            return (Criteria) this;
        }

        public Criteria andSortnumEqualTo(String value) {
            addCriterion("sortNum =", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumNotEqualTo(String value) {
            addCriterion("sortNum <>", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumGreaterThan(String value) {
            addCriterion("sortNum >", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumGreaterThanOrEqualTo(String value) {
            addCriterion("sortNum >=", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumLessThan(String value) {
            addCriterion("sortNum <", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumLessThanOrEqualTo(String value) {
            addCriterion("sortNum <=", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumLike(String value) {
            addCriterion("sortNum like", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumNotLike(String value) {
            addCriterion("sortNum not like", value, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumIn(List<String> values) {
            addCriterion("sortNum in", values, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumNotIn(List<String> values) {
            addCriterion("sortNum not in", values, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumBetween(String value1, String value2) {
            addCriterion("sortNum between", value1, value2, "sortnum");
            return (Criteria) this;
        }

        public Criteria andSortnumNotBetween(String value1, String value2) {
            addCriterion("sortNum not between", value1, value2, "sortnum");
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