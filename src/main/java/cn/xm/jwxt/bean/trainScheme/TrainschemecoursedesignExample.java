package cn.xm.jwxt.bean.trainScheme;

import java.util.ArrayList;
import java.util.List;

public class TrainschemecoursedesignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainschemecoursedesignExample() {
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

        public Criteria andTraincoursedesignidIsNull() {
            addCriterion("trainCourseDesignId is null");
            return (Criteria) this;
        }

        public Criteria andTraincoursedesignidIsNotNull() {
            addCriterion("trainCourseDesignId is not null");
            return (Criteria) this;
        }

        public Criteria andTraincoursedesignidEqualTo(String value) {
            addCriterion("trainCourseDesignId =", value, "traincoursedesignid");
            return (Criteria) this;
        }

        public Criteria andTraincoursedesignidNotEqualTo(String value) {
            addCriterion("trainCourseDesignId <>", value, "traincoursedesignid");
            return (Criteria) this;
        }

        public Criteria andTraincoursedesignidGreaterThan(String value) {
            addCriterion("trainCourseDesignId >", value, "traincoursedesignid");
            return (Criteria) this;
        }

        public Criteria andTraincoursedesignidGreaterThanOrEqualTo(String value) {
            addCriterion("trainCourseDesignId >=", value, "traincoursedesignid");
            return (Criteria) this;
        }

        public Criteria andTraincoursedesignidLessThan(String value) {
            addCriterion("trainCourseDesignId <", value, "traincoursedesignid");
            return (Criteria) this;
        }

        public Criteria andTraincoursedesignidLessThanOrEqualTo(String value) {
            addCriterion("trainCourseDesignId <=", value, "traincoursedesignid");
            return (Criteria) this;
        }

        public Criteria andTraincoursedesignidLike(String value) {
            addCriterion("trainCourseDesignId like", value, "traincoursedesignid");
            return (Criteria) this;
        }

        public Criteria andTraincoursedesignidNotLike(String value) {
            addCriterion("trainCourseDesignId not like", value, "traincoursedesignid");
            return (Criteria) this;
        }

        public Criteria andTraincoursedesignidIn(List<String> values) {
            addCriterion("trainCourseDesignId in", values, "traincoursedesignid");
            return (Criteria) this;
        }

        public Criteria andTraincoursedesignidNotIn(List<String> values) {
            addCriterion("trainCourseDesignId not in", values, "traincoursedesignid");
            return (Criteria) this;
        }

        public Criteria andTraincoursedesignidBetween(String value1, String value2) {
            addCriterion("trainCourseDesignId between", value1, value2, "traincoursedesignid");
            return (Criteria) this;
        }

        public Criteria andTraincoursedesignidNotBetween(String value1, String value2) {
            addCriterion("trainCourseDesignId not between", value1, value2, "traincoursedesignid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidIsNull() {
            addCriterion("trainingSchemeID is null");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidIsNotNull() {
            addCriterion("trainingSchemeID is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidEqualTo(String value) {
            addCriterion("trainingSchemeID =", value, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidNotEqualTo(String value) {
            addCriterion("trainingSchemeID <>", value, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidGreaterThan(String value) {
            addCriterion("trainingSchemeID >", value, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidGreaterThanOrEqualTo(String value) {
            addCriterion("trainingSchemeID >=", value, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidLessThan(String value) {
            addCriterion("trainingSchemeID <", value, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidLessThanOrEqualTo(String value) {
            addCriterion("trainingSchemeID <=", value, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidLike(String value) {
            addCriterion("trainingSchemeID like", value, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidNotLike(String value) {
            addCriterion("trainingSchemeID not like", value, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidIn(List<String> values) {
            addCriterion("trainingSchemeID in", values, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidNotIn(List<String> values) {
            addCriterion("trainingSchemeID not in", values, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidBetween(String value1, String value2) {
            addCriterion("trainingSchemeID between", value1, value2, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidNotBetween(String value1, String value2) {
            addCriterion("trainingSchemeID not between", value1, value2, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignnameIsNull() {
            addCriterion("courseDesignName is null");
            return (Criteria) this;
        }

        public Criteria andCoursedesignnameIsNotNull() {
            addCriterion("courseDesignName is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedesignnameEqualTo(String value) {
            addCriterion("courseDesignName =", value, "coursedesignname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignnameNotEqualTo(String value) {
            addCriterion("courseDesignName <>", value, "coursedesignname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignnameGreaterThan(String value) {
            addCriterion("courseDesignName >", value, "coursedesignname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignnameGreaterThanOrEqualTo(String value) {
            addCriterion("courseDesignName >=", value, "coursedesignname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignnameLessThan(String value) {
            addCriterion("courseDesignName <", value, "coursedesignname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignnameLessThanOrEqualTo(String value) {
            addCriterion("courseDesignName <=", value, "coursedesignname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignnameLike(String value) {
            addCriterion("courseDesignName like", value, "coursedesignname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignnameNotLike(String value) {
            addCriterion("courseDesignName not like", value, "coursedesignname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignnameIn(List<String> values) {
            addCriterion("courseDesignName in", values, "coursedesignname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignnameNotIn(List<String> values) {
            addCriterion("courseDesignName not in", values, "coursedesignname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignnameBetween(String value1, String value2) {
            addCriterion("courseDesignName between", value1, value2, "coursedesignname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignnameNotBetween(String value1, String value2) {
            addCriterion("courseDesignName not between", value1, value2, "coursedesignname");
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

        public Criteria andSemesterEqualTo(String value) {
            addCriterion("semester =", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotEqualTo(String value) {
            addCriterion("semester <>", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterGreaterThan(String value) {
            addCriterion("semester >", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterGreaterThanOrEqualTo(String value) {
            addCriterion("semester >=", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterLessThan(String value) {
            addCriterion("semester <", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterLessThanOrEqualTo(String value) {
            addCriterion("semester <=", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterLike(String value) {
            addCriterion("semester like", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotLike(String value) {
            addCriterion("semester not like", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterIn(List<String> values) {
            addCriterion("semester in", values, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotIn(List<String> values) {
            addCriterion("semester not in", values, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterBetween(String value1, String value2) {
            addCriterion("semester between", value1, value2, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotBetween(String value1, String value2) {
            addCriterion("semester not between", value1, value2, "semester");
            return (Criteria) this;
        }

        public Criteria andYearnumIsNull() {
            addCriterion("yearNum is null");
            return (Criteria) this;
        }

        public Criteria andYearnumIsNotNull() {
            addCriterion("yearNum is not null");
            return (Criteria) this;
        }

        public Criteria andYearnumEqualTo(String value) {
            addCriterion("yearNum =", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumNotEqualTo(String value) {
            addCriterion("yearNum <>", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumGreaterThan(String value) {
            addCriterion("yearNum >", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumGreaterThanOrEqualTo(String value) {
            addCriterion("yearNum >=", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumLessThan(String value) {
            addCriterion("yearNum <", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumLessThanOrEqualTo(String value) {
            addCriterion("yearNum <=", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumLike(String value) {
            addCriterion("yearNum like", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumNotLike(String value) {
            addCriterion("yearNum not like", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumIn(List<String> values) {
            addCriterion("yearNum in", values, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumNotIn(List<String> values) {
            addCriterion("yearNum not in", values, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumBetween(String value1, String value2) {
            addCriterion("yearNum between", value1, value2, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumNotBetween(String value1, String value2) {
            addCriterion("yearNum not between", value1, value2, "yearnum");
            return (Criteria) this;
        }

        public Criteria andIsarrangeIsNull() {
            addCriterion("isArrange is null");
            return (Criteria) this;
        }

        public Criteria andIsarrangeIsNotNull() {
            addCriterion("isArrange is not null");
            return (Criteria) this;
        }

        public Criteria andIsarrangeEqualTo(String value) {
            addCriterion("isArrange =", value, "isarrange");
            return (Criteria) this;
        }

        public Criteria andIsarrangeNotEqualTo(String value) {
            addCriterion("isArrange <>", value, "isarrange");
            return (Criteria) this;
        }

        public Criteria andIsarrangeGreaterThan(String value) {
            addCriterion("isArrange >", value, "isarrange");
            return (Criteria) this;
        }

        public Criteria andIsarrangeGreaterThanOrEqualTo(String value) {
            addCriterion("isArrange >=", value, "isarrange");
            return (Criteria) this;
        }

        public Criteria andIsarrangeLessThan(String value) {
            addCriterion("isArrange <", value, "isarrange");
            return (Criteria) this;
        }

        public Criteria andIsarrangeLessThanOrEqualTo(String value) {
            addCriterion("isArrange <=", value, "isarrange");
            return (Criteria) this;
        }

        public Criteria andIsarrangeLike(String value) {
            addCriterion("isArrange like", value, "isarrange");
            return (Criteria) this;
        }

        public Criteria andIsarrangeNotLike(String value) {
            addCriterion("isArrange not like", value, "isarrange");
            return (Criteria) this;
        }

        public Criteria andIsarrangeIn(List<String> values) {
            addCriterion("isArrange in", values, "isarrange");
            return (Criteria) this;
        }

        public Criteria andIsarrangeNotIn(List<String> values) {
            addCriterion("isArrange not in", values, "isarrange");
            return (Criteria) this;
        }

        public Criteria andIsarrangeBetween(String value1, String value2) {
            addCriterion("isArrange between", value1, value2, "isarrange");
            return (Criteria) this;
        }

        public Criteria andIsarrangeNotBetween(String value1, String value2) {
            addCriterion("isArrange not between", value1, value2, "isarrange");
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