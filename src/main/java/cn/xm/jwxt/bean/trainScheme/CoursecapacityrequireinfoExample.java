package cn.xm.jwxt.bean.trainScheme;

import java.util.ArrayList;
import java.util.List;

public class CoursecapacityrequireinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoursecapacityrequireinfoExample() {
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

        public Criteria andCoursecapacityidIsNull() {
            addCriterion("courseCapacityId is null");
            return (Criteria) this;
        }

        public Criteria andCoursecapacityidIsNotNull() {
            addCriterion("courseCapacityId is not null");
            return (Criteria) this;
        }

        public Criteria andCoursecapacityidEqualTo(Integer value) {
            addCriterion("courseCapacityId =", value, "coursecapacityid");
            return (Criteria) this;
        }

        public Criteria andCoursecapacityidNotEqualTo(Integer value) {
            addCriterion("courseCapacityId <>", value, "coursecapacityid");
            return (Criteria) this;
        }

        public Criteria andCoursecapacityidGreaterThan(Integer value) {
            addCriterion("courseCapacityId >", value, "coursecapacityid");
            return (Criteria) this;
        }

        public Criteria andCoursecapacityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseCapacityId >=", value, "coursecapacityid");
            return (Criteria) this;
        }

        public Criteria andCoursecapacityidLessThan(Integer value) {
            addCriterion("courseCapacityId <", value, "coursecapacityid");
            return (Criteria) this;
        }

        public Criteria andCoursecapacityidLessThanOrEqualTo(Integer value) {
            addCriterion("courseCapacityId <=", value, "coursecapacityid");
            return (Criteria) this;
        }

        public Criteria andCoursecapacityidIn(List<Integer> values) {
            addCriterion("courseCapacityId in", values, "coursecapacityid");
            return (Criteria) this;
        }

        public Criteria andCoursecapacityidNotIn(List<Integer> values) {
            addCriterion("courseCapacityId not in", values, "coursecapacityid");
            return (Criteria) this;
        }

        public Criteria andCoursecapacityidBetween(Integer value1, Integer value2) {
            addCriterion("courseCapacityId between", value1, value2, "coursecapacityid");
            return (Criteria) this;
        }

        public Criteria andCoursecapacityidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseCapacityId not between", value1, value2, "coursecapacityid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidIsNull() {
            addCriterion("trainningSchemeID is null");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidIsNotNull() {
            addCriterion("trainningSchemeID is not null");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidEqualTo(String value) {
            addCriterion("trainningSchemeID =", value, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidNotEqualTo(String value) {
            addCriterion("trainningSchemeID <>", value, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidGreaterThan(String value) {
            addCriterion("trainningSchemeID >", value, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidGreaterThanOrEqualTo(String value) {
            addCriterion("trainningSchemeID >=", value, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidLessThan(String value) {
            addCriterion("trainningSchemeID <", value, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidLessThanOrEqualTo(String value) {
            addCriterion("trainningSchemeID <=", value, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidLike(String value) {
            addCriterion("trainningSchemeID like", value, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidNotLike(String value) {
            addCriterion("trainningSchemeID not like", value, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidIn(List<String> values) {
            addCriterion("trainningSchemeID in", values, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidNotIn(List<String> values) {
            addCriterion("trainningSchemeID not in", values, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidBetween(String value1, String value2) {
            addCriterion("trainningSchemeID between", value1, value2, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidNotBetween(String value1, String value2) {
            addCriterion("trainningSchemeID not between", value1, value2, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidIsNull() {
            addCriterion("trainCourseID is null");
            return (Criteria) this;
        }

        public Criteria andTraincourseidIsNotNull() {
            addCriterion("trainCourseID is not null");
            return (Criteria) this;
        }

        public Criteria andTraincourseidEqualTo(Integer value) {
            addCriterion("trainCourseID =", value, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidNotEqualTo(Integer value) {
            addCriterion("trainCourseID <>", value, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidGreaterThan(Integer value) {
            addCriterion("trainCourseID >", value, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("trainCourseID >=", value, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidLessThan(Integer value) {
            addCriterion("trainCourseID <", value, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidLessThanOrEqualTo(Integer value) {
            addCriterion("trainCourseID <=", value, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidIn(List<Integer> values) {
            addCriterion("trainCourseID in", values, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidNotIn(List<Integer> values) {
            addCriterion("trainCourseID not in", values, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidBetween(Integer value1, Integer value2) {
            addCriterion("trainCourseID between", value1, value2, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("trainCourseID not between", value1, value2, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andCapacityidIsNull() {
            addCriterion("capacityId is null");
            return (Criteria) this;
        }

        public Criteria andCapacityidIsNotNull() {
            addCriterion("capacityId is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityidEqualTo(Integer value) {
            addCriterion("capacityId =", value, "capacityid");
            return (Criteria) this;
        }

        public Criteria andCapacityidNotEqualTo(Integer value) {
            addCriterion("capacityId <>", value, "capacityid");
            return (Criteria) this;
        }

        public Criteria andCapacityidGreaterThan(Integer value) {
            addCriterion("capacityId >", value, "capacityid");
            return (Criteria) this;
        }

        public Criteria andCapacityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("capacityId >=", value, "capacityid");
            return (Criteria) this;
        }

        public Criteria andCapacityidLessThan(Integer value) {
            addCriterion("capacityId <", value, "capacityid");
            return (Criteria) this;
        }

        public Criteria andCapacityidLessThanOrEqualTo(Integer value) {
            addCriterion("capacityId <=", value, "capacityid");
            return (Criteria) this;
        }

        public Criteria andCapacityidIn(List<Integer> values) {
            addCriterion("capacityId in", values, "capacityid");
            return (Criteria) this;
        }

        public Criteria andCapacityidNotIn(List<Integer> values) {
            addCriterion("capacityId not in", values, "capacityid");
            return (Criteria) this;
        }

        public Criteria andCapacityidBetween(Integer value1, Integer value2) {
            addCriterion("capacityId between", value1, value2, "capacityid");
            return (Criteria) this;
        }

        public Criteria andCapacityidNotBetween(Integer value1, Integer value2) {
            addCriterion("capacityId not between", value1, value2, "capacityid");
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