package cn.xm.jwxt.bean.arrangeCourse;

import java.util.ArrayList;
import java.util.List;

public class ApTeacherCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApTeacherCourseExample() {
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

        public Criteria andArrangeCourseIdIsNull() {
            addCriterion("arrange_course_id is null");
            return (Criteria) this;
        }

        public Criteria andArrangeCourseIdIsNotNull() {
            addCriterion("arrange_course_id is not null");
            return (Criteria) this;
        }

        public Criteria andArrangeCourseIdEqualTo(String value) {
            addCriterion("arrange_course_id =", value, "arrangeCourseId");
            return (Criteria) this;
        }

        public Criteria andArrangeCourseIdNotEqualTo(String value) {
            addCriterion("arrange_course_id <>", value, "arrangeCourseId");
            return (Criteria) this;
        }

        public Criteria andArrangeCourseIdGreaterThan(String value) {
            addCriterion("arrange_course_id >", value, "arrangeCourseId");
            return (Criteria) this;
        }

        public Criteria andArrangeCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("arrange_course_id >=", value, "arrangeCourseId");
            return (Criteria) this;
        }

        public Criteria andArrangeCourseIdLessThan(String value) {
            addCriterion("arrange_course_id <", value, "arrangeCourseId");
            return (Criteria) this;
        }

        public Criteria andArrangeCourseIdLessThanOrEqualTo(String value) {
            addCriterion("arrange_course_id <=", value, "arrangeCourseId");
            return (Criteria) this;
        }

        public Criteria andArrangeCourseIdLike(String value) {
            addCriterion("arrange_course_id like", value, "arrangeCourseId");
            return (Criteria) this;
        }

        public Criteria andArrangeCourseIdNotLike(String value) {
            addCriterion("arrange_course_id not like", value, "arrangeCourseId");
            return (Criteria) this;
        }

        public Criteria andArrangeCourseIdIn(List<String> values) {
            addCriterion("arrange_course_id in", values, "arrangeCourseId");
            return (Criteria) this;
        }

        public Criteria andArrangeCourseIdNotIn(List<String> values) {
            addCriterion("arrange_course_id not in", values, "arrangeCourseId");
            return (Criteria) this;
        }

        public Criteria andArrangeCourseIdBetween(String value1, String value2) {
            addCriterion("arrange_course_id between", value1, value2, "arrangeCourseId");
            return (Criteria) this;
        }

        public Criteria andArrangeCourseIdNotBetween(String value1, String value2) {
            addCriterion("arrange_course_id not between", value1, value2, "arrangeCourseId");
            return (Criteria) this;
        }

        public Criteria andTermIsNull() {
            addCriterion("term is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("term is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(String value) {
            addCriterion("term =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(String value) {
            addCriterion("term <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(String value) {
            addCriterion("term >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(String value) {
            addCriterion("term >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(String value) {
            addCriterion("term <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(String value) {
            addCriterion("term <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLike(String value) {
            addCriterion("term like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotLike(String value) {
            addCriterion("term not like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<String> values) {
            addCriterion("term in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<String> values) {
            addCriterion("term not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(String value1, String value2) {
            addCriterion("term between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(String value1, String value2) {
            addCriterion("term not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andAcademicYearIsNull() {
            addCriterion("academic_year is null");
            return (Criteria) this;
        }

        public Criteria andAcademicYearIsNotNull() {
            addCriterion("academic_year is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicYearEqualTo(String value) {
            addCriterion("academic_year =", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearNotEqualTo(String value) {
            addCriterion("academic_year <>", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearGreaterThan(String value) {
            addCriterion("academic_year >", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearGreaterThanOrEqualTo(String value) {
            addCriterion("academic_year >=", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearLessThan(String value) {
            addCriterion("academic_year <", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearLessThanOrEqualTo(String value) {
            addCriterion("academic_year <=", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearLike(String value) {
            addCriterion("academic_year like", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearNotLike(String value) {
            addCriterion("academic_year not like", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearIn(List<String> values) {
            addCriterion("academic_year in", values, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearNotIn(List<String> values) {
            addCriterion("academic_year not in", values, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearBetween(String value1, String value2) {
            addCriterion("academic_year between", value1, value2, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearNotBetween(String value1, String value2) {
            addCriterion("academic_year not between", value1, value2, "academicYear");
            return (Criteria) this;
        }

        public Criteria andCourseCodeIsNull() {
            addCriterion("course_code is null");
            return (Criteria) this;
        }

        public Criteria andCourseCodeIsNotNull() {
            addCriterion("course_code is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCodeEqualTo(String value) {
            addCriterion("course_code =", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeNotEqualTo(String value) {
            addCriterion("course_code <>", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeGreaterThan(String value) {
            addCriterion("course_code >", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("course_code >=", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeLessThan(String value) {
            addCriterion("course_code <", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeLessThanOrEqualTo(String value) {
            addCriterion("course_code <=", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeLike(String value) {
            addCriterion("course_code like", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeNotLike(String value) {
            addCriterion("course_code not like", value, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeIn(List<String> values) {
            addCriterion("course_code in", values, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeNotIn(List<String> values) {
            addCriterion("course_code not in", values, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeBetween(String value1, String value2) {
            addCriterion("course_code between", value1, value2, "courseCode");
            return (Criteria) this;
        }

        public Criteria andCourseCodeNotBetween(String value1, String value2) {
            addCriterion("course_code not between", value1, value2, "courseCode");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(String value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(String value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(String value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(String value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLike(String value) {
            addCriterion("teacher_id like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotLike(String value) {
            addCriterion("teacher_id not like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<String> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<String> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(String value1, String value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(String value1, String value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberIsNull() {
            addCriterion("teacher_number is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberIsNotNull() {
            addCriterion("teacher_number is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberEqualTo(String value) {
            addCriterion("teacher_number =", value, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberNotEqualTo(String value) {
            addCriterion("teacher_number <>", value, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberGreaterThan(String value) {
            addCriterion("teacher_number >", value, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_number >=", value, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberLessThan(String value) {
            addCriterion("teacher_number <", value, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberLessThanOrEqualTo(String value) {
            addCriterion("teacher_number <=", value, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberLike(String value) {
            addCriterion("teacher_number like", value, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberNotLike(String value) {
            addCriterion("teacher_number not like", value, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberIn(List<String> values) {
            addCriterion("teacher_number in", values, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberNotIn(List<String> values) {
            addCriterion("teacher_number not in", values, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberBetween(String value1, String value2) {
            addCriterion("teacher_number between", value1, value2, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNumberNotBetween(String value1, String value2) {
            addCriterion("teacher_number not between", value1, value2, "teacherNumber");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacher_name like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacherName");
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