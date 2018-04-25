package cn.xm.jwxt.bean.arrangeCourse;

import java.util.ArrayList;
import java.util.List;

public class ApClassTeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApClassTeacherExample() {
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

        public Criteria andClassTeacherIdIsNull() {
            addCriterion("class_teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdIsNotNull() {
            addCriterion("class_teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdEqualTo(String value) {
            addCriterion("class_teacher_id =", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdNotEqualTo(String value) {
            addCriterion("class_teacher_id <>", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdGreaterThan(String value) {
            addCriterion("class_teacher_id >", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("class_teacher_id >=", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdLessThan(String value) {
            addCriterion("class_teacher_id <", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("class_teacher_id <=", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdLike(String value) {
            addCriterion("class_teacher_id like", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdNotLike(String value) {
            addCriterion("class_teacher_id not like", value, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdIn(List<String> values) {
            addCriterion("class_teacher_id in", values, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdNotIn(List<String> values) {
            addCriterion("class_teacher_id not in", values, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdBetween(String value1, String value2) {
            addCriterion("class_teacher_id between", value1, value2, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andClassTeacherIdNotBetween(String value1, String value2) {
            addCriterion("class_teacher_id not between", value1, value2, "classTeacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdIsNull() {
            addCriterion("teacher_course_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdIsNotNull() {
            addCriterion("teacher_course_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdEqualTo(String value) {
            addCriterion("teacher_course_id =", value, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdNotEqualTo(String value) {
            addCriterion("teacher_course_id <>", value, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdGreaterThan(String value) {
            addCriterion("teacher_course_id >", value, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_course_id >=", value, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdLessThan(String value) {
            addCriterion("teacher_course_id <", value, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdLessThanOrEqualTo(String value) {
            addCriterion("teacher_course_id <=", value, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdLike(String value) {
            addCriterion("teacher_course_id like", value, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdNotLike(String value) {
            addCriterion("teacher_course_id not like", value, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdIn(List<String> values) {
            addCriterion("teacher_course_id in", values, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdNotIn(List<String> values) {
            addCriterion("teacher_course_id not in", values, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdBetween(String value1, String value2) {
            addCriterion("teacher_course_id between", value1, value2, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andTeacherCourseIdNotBetween(String value1, String value2) {
            addCriterion("teacher_course_id not between", value1, value2, "teacherCourseId");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassSizeIsNull() {
            addCriterion("class_size is null");
            return (Criteria) this;
        }

        public Criteria andClassSizeIsNotNull() {
            addCriterion("class_size is not null");
            return (Criteria) this;
        }

        public Criteria andClassSizeEqualTo(Integer value) {
            addCriterion("class_size =", value, "classSize");
            return (Criteria) this;
        }

        public Criteria andClassSizeNotEqualTo(Integer value) {
            addCriterion("class_size <>", value, "classSize");
            return (Criteria) this;
        }

        public Criteria andClassSizeGreaterThan(Integer value) {
            addCriterion("class_size >", value, "classSize");
            return (Criteria) this;
        }

        public Criteria andClassSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_size >=", value, "classSize");
            return (Criteria) this;
        }

        public Criteria andClassSizeLessThan(Integer value) {
            addCriterion("class_size <", value, "classSize");
            return (Criteria) this;
        }

        public Criteria andClassSizeLessThanOrEqualTo(Integer value) {
            addCriterion("class_size <=", value, "classSize");
            return (Criteria) this;
        }

        public Criteria andClassSizeIn(List<Integer> values) {
            addCriterion("class_size in", values, "classSize");
            return (Criteria) this;
        }

        public Criteria andClassSizeNotIn(List<Integer> values) {
            addCriterion("class_size not in", values, "classSize");
            return (Criteria) this;
        }

        public Criteria andClassSizeBetween(Integer value1, Integer value2) {
            addCriterion("class_size between", value1, value2, "classSize");
            return (Criteria) this;
        }

        public Criteria andClassSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("class_size not between", value1, value2, "classSize");
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