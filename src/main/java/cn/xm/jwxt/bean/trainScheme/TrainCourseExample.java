package cn.xm.jwxt.bean.trainScheme;

import java.util.ArrayList;
import java.util.List;

public class TrainCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainCourseExample() {
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

        public Criteria andCoursetypeidIsNull() {
            addCriterion("courseTypeID is null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidIsNotNull() {
            addCriterion("courseTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidEqualTo(Integer value) {
            addCriterion("courseTypeID =", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidNotEqualTo(Integer value) {
            addCriterion("courseTypeID <>", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidGreaterThan(Integer value) {
            addCriterion("courseTypeID >", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseTypeID >=", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidLessThan(Integer value) {
            addCriterion("courseTypeID <", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidLessThanOrEqualTo(Integer value) {
            addCriterion("courseTypeID <=", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidIn(List<Integer> values) {
            addCriterion("courseTypeID in", values, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidNotIn(List<Integer> values) {
            addCriterion("courseTypeID not in", values, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidBetween(Integer value1, Integer value2) {
            addCriterion("courseTypeID between", value1, value2, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseTypeID not between", value1, value2, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andSemesterIsNull() {
            addCriterion("semester is null");
            return (Criteria) this;
        }

        public Criteria andSemesterIsNotNull() {
            addCriterion("semester is not null");
            return (Criteria) this;
        }

        public Criteria andSemesterEqualTo(Short value) {
            addCriterion("semester =", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotEqualTo(Short value) {
            addCriterion("semester <>", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterGreaterThan(Short value) {
            addCriterion("semester >", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterGreaterThanOrEqualTo(Short value) {
            addCriterion("semester >=", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterLessThan(Short value) {
            addCriterion("semester <", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterLessThanOrEqualTo(Short value) {
            addCriterion("semester <=", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterIn(List<Short> values) {
            addCriterion("semester in", values, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotIn(List<Short> values) {
            addCriterion("semester not in", values, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterBetween(Short value1, Short value2) {
            addCriterion("semester between", value1, value2, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotBetween(Short value1, Short value2) {
            addCriterion("semester not between", value1, value2, "semester");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNull() {
            addCriterion("courseType is null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNotNull() {
            addCriterion("courseType is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeEqualTo(String value) {
            addCriterion("courseType =", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotEqualTo(String value) {
            addCriterion("courseType <>", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThan(String value) {
            addCriterion("courseType >", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThanOrEqualTo(String value) {
            addCriterion("courseType >=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThan(String value) {
            addCriterion("courseType <", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThanOrEqualTo(String value) {
            addCriterion("courseType <=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLike(String value) {
            addCriterion("courseType like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotLike(String value) {
            addCriterion("courseType not like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIn(List<String> values) {
            addCriterion("courseType in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotIn(List<String> values) {
            addCriterion("courseType not in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeBetween(String value1, String value2) {
            addCriterion("courseType between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotBetween(String value1, String value2) {
            addCriterion("courseType not between", value1, value2, "coursetype");
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