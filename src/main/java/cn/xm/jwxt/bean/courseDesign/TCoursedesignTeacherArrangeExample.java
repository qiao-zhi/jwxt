package cn.xm.jwxt.bean.courseDesign;

import java.util.ArrayList;
import java.util.List;

public class TCoursedesignTeacherArrangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCoursedesignTeacherArrangeExample() {
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

        public Criteria andCoursedesignteacherarrangeidIsNull() {
            addCriterion("courseDesignTeacherArrangeID is null");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherarrangeidIsNotNull() {
            addCriterion("courseDesignTeacherArrangeID is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherarrangeidEqualTo(String value) {
            addCriterion("courseDesignTeacherArrangeID =", value, "coursedesignteacherarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherarrangeidNotEqualTo(String value) {
            addCriterion("courseDesignTeacherArrangeID <>", value, "coursedesignteacherarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherarrangeidGreaterThan(String value) {
            addCriterion("courseDesignTeacherArrangeID >", value, "coursedesignteacherarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherarrangeidGreaterThanOrEqualTo(String value) {
            addCriterion("courseDesignTeacherArrangeID >=", value, "coursedesignteacherarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherarrangeidLessThan(String value) {
            addCriterion("courseDesignTeacherArrangeID <", value, "coursedesignteacherarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherarrangeidLessThanOrEqualTo(String value) {
            addCriterion("courseDesignTeacherArrangeID <=", value, "coursedesignteacherarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherarrangeidLike(String value) {
            addCriterion("courseDesignTeacherArrangeID like", value, "coursedesignteacherarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherarrangeidNotLike(String value) {
            addCriterion("courseDesignTeacherArrangeID not like", value, "coursedesignteacherarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherarrangeidIn(List<String> values) {
            addCriterion("courseDesignTeacherArrangeID in", values, "coursedesignteacherarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherarrangeidNotIn(List<String> values) {
            addCriterion("courseDesignTeacherArrangeID not in", values, "coursedesignteacherarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherarrangeidBetween(String value1, String value2) {
            addCriterion("courseDesignTeacherArrangeID between", value1, value2, "coursedesignteacherarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherarrangeidNotBetween(String value1, String value2) {
            addCriterion("courseDesignTeacherArrangeID not between", value1, value2, "coursedesignteacherarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangeidIsNull() {
            addCriterion("courseDesignArrangeID is null");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangeidIsNotNull() {
            addCriterion("courseDesignArrangeID is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangeidEqualTo(String value) {
            addCriterion("courseDesignArrangeID =", value, "coursedesignarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangeidNotEqualTo(String value) {
            addCriterion("courseDesignArrangeID <>", value, "coursedesignarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangeidGreaterThan(String value) {
            addCriterion("courseDesignArrangeID >", value, "coursedesignarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangeidGreaterThanOrEqualTo(String value) {
            addCriterion("courseDesignArrangeID >=", value, "coursedesignarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangeidLessThan(String value) {
            addCriterion("courseDesignArrangeID <", value, "coursedesignarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangeidLessThanOrEqualTo(String value) {
            addCriterion("courseDesignArrangeID <=", value, "coursedesignarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangeidLike(String value) {
            addCriterion("courseDesignArrangeID like", value, "coursedesignarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangeidNotLike(String value) {
            addCriterion("courseDesignArrangeID not like", value, "coursedesignarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangeidIn(List<String> values) {
            addCriterion("courseDesignArrangeID in", values, "coursedesignarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangeidNotIn(List<String> values) {
            addCriterion("courseDesignArrangeID not in", values, "coursedesignarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangeidBetween(String value1, String value2) {
            addCriterion("courseDesignArrangeID between", value1, value2, "coursedesignarrangeid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangeidNotBetween(String value1, String value2) {
            addCriterion("courseDesignArrangeID not between", value1, value2, "coursedesignarrangeid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNull() {
            addCriterion("teacherID is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("teacherID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(String value) {
            addCriterion("teacherID =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(String value) {
            addCriterion("teacherID <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(String value) {
            addCriterion("teacherID >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(String value) {
            addCriterion("teacherID >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(String value) {
            addCriterion("teacherID <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(String value) {
            addCriterion("teacherID <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLike(String value) {
            addCriterion("teacherID like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotLike(String value) {
            addCriterion("teacherID not like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<String> values) {
            addCriterion("teacherID in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<String> values) {
            addCriterion("teacherID not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(String value1, String value2) {
            addCriterion("teacherID between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(String value1, String value2) {
            addCriterion("teacherID not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andClassnamesIsNull() {
            addCriterion("classNames is null");
            return (Criteria) this;
        }

        public Criteria andClassnamesIsNotNull() {
            addCriterion("classNames is not null");
            return (Criteria) this;
        }

        public Criteria andClassnamesEqualTo(String value) {
            addCriterion("classNames =", value, "classnames");
            return (Criteria) this;
        }

        public Criteria andClassnamesNotEqualTo(String value) {
            addCriterion("classNames <>", value, "classnames");
            return (Criteria) this;
        }

        public Criteria andClassnamesGreaterThan(String value) {
            addCriterion("classNames >", value, "classnames");
            return (Criteria) this;
        }

        public Criteria andClassnamesGreaterThanOrEqualTo(String value) {
            addCriterion("classNames >=", value, "classnames");
            return (Criteria) this;
        }

        public Criteria andClassnamesLessThan(String value) {
            addCriterion("classNames <", value, "classnames");
            return (Criteria) this;
        }

        public Criteria andClassnamesLessThanOrEqualTo(String value) {
            addCriterion("classNames <=", value, "classnames");
            return (Criteria) this;
        }

        public Criteria andClassnamesLike(String value) {
            addCriterion("classNames like", value, "classnames");
            return (Criteria) this;
        }

        public Criteria andClassnamesNotLike(String value) {
            addCriterion("classNames not like", value, "classnames");
            return (Criteria) this;
        }

        public Criteria andClassnamesIn(List<String> values) {
            addCriterion("classNames in", values, "classnames");
            return (Criteria) this;
        }

        public Criteria andClassnamesNotIn(List<String> values) {
            addCriterion("classNames not in", values, "classnames");
            return (Criteria) this;
        }

        public Criteria andClassnamesBetween(String value1, String value2) {
            addCriterion("classNames between", value1, value2, "classnames");
            return (Criteria) this;
        }

        public Criteria andClassnamesNotBetween(String value1, String value2) {
            addCriterion("classNames not between", value1, value2, "classnames");
            return (Criteria) this;
        }

        public Criteria andDisplayIsNull() {
            addCriterion("display is null");
            return (Criteria) this;
        }

        public Criteria andDisplayIsNotNull() {
            addCriterion("display is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayEqualTo(String value) {
            addCriterion("display =", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotEqualTo(String value) {
            addCriterion("display <>", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayGreaterThan(String value) {
            addCriterion("display >", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayGreaterThanOrEqualTo(String value) {
            addCriterion("display >=", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLessThan(String value) {
            addCriterion("display <", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLessThanOrEqualTo(String value) {
            addCriterion("display <=", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLike(String value) {
            addCriterion("display like", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotLike(String value) {
            addCriterion("display not like", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayIn(List<String> values) {
            addCriterion("display in", values, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotIn(List<String> values) {
            addCriterion("display not in", values, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayBetween(String value1, String value2) {
            addCriterion("display between", value1, value2, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotBetween(String value1, String value2) {
            addCriterion("display not between", value1, value2, "display");
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