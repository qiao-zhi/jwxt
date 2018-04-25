package cn.xm.jwxt.bean.arrangeCourse;

import java.util.ArrayList;
import java.util.List;

public class ApTaskArrangeCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApTaskArrangeCourseExample() {
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

        public Criteria andArrangeTaskIdIsNull() {
            addCriterion("arrange_task_id is null");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdIsNotNull() {
            addCriterion("arrange_task_id is not null");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdEqualTo(String value) {
            addCriterion("arrange_task_id =", value, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdNotEqualTo(String value) {
            addCriterion("arrange_task_id <>", value, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdGreaterThan(String value) {
            addCriterion("arrange_task_id >", value, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("arrange_task_id >=", value, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdLessThan(String value) {
            addCriterion("arrange_task_id <", value, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdLessThanOrEqualTo(String value) {
            addCriterion("arrange_task_id <=", value, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdLike(String value) {
            addCriterion("arrange_task_id like", value, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdNotLike(String value) {
            addCriterion("arrange_task_id not like", value, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdIn(List<String> values) {
            addCriterion("arrange_task_id in", values, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdNotIn(List<String> values) {
            addCriterion("arrange_task_id not in", values, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdBetween(String value1, String value2) {
            addCriterion("arrange_task_id between", value1, value2, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdNotBetween(String value1, String value2) {
            addCriterion("arrange_task_id not between", value1, value2, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
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

        public Criteria andMajorNameIsNull() {
            addCriterion("major_name is null");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNotNull() {
            addCriterion("major_name is not null");
            return (Criteria) this;
        }

        public Criteria andMajorNameEqualTo(String value) {
            addCriterion("major_name =", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotEqualTo(String value) {
            addCriterion("major_name <>", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThan(String value) {
            addCriterion("major_name >", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThanOrEqualTo(String value) {
            addCriterion("major_name >=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThan(String value) {
            addCriterion("major_name <", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThanOrEqualTo(String value) {
            addCriterion("major_name <=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLike(String value) {
            addCriterion("major_name like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotLike(String value) {
            addCriterion("major_name not like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameIn(List<String> values) {
            addCriterion("major_name in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotIn(List<String> values) {
            addCriterion("major_name not in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameBetween(String value1, String value2) {
            addCriterion("major_name between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotBetween(String value1, String value2) {
            addCriterion("major_name not between", value1, value2, "majorName");
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

        public Criteria andMajorStudentsNumberIsNull() {
            addCriterion("major_students_number is null");
            return (Criteria) this;
        }

        public Criteria andMajorStudentsNumberIsNotNull() {
            addCriterion("major_students_number is not null");
            return (Criteria) this;
        }

        public Criteria andMajorStudentsNumberEqualTo(Integer value) {
            addCriterion("major_students_number =", value, "majorStudentsNumber");
            return (Criteria) this;
        }

        public Criteria andMajorStudentsNumberNotEqualTo(Integer value) {
            addCriterion("major_students_number <>", value, "majorStudentsNumber");
            return (Criteria) this;
        }

        public Criteria andMajorStudentsNumberGreaterThan(Integer value) {
            addCriterion("major_students_number >", value, "majorStudentsNumber");
            return (Criteria) this;
        }

        public Criteria andMajorStudentsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("major_students_number >=", value, "majorStudentsNumber");
            return (Criteria) this;
        }

        public Criteria andMajorStudentsNumberLessThan(Integer value) {
            addCriterion("major_students_number <", value, "majorStudentsNumber");
            return (Criteria) this;
        }

        public Criteria andMajorStudentsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("major_students_number <=", value, "majorStudentsNumber");
            return (Criteria) this;
        }

        public Criteria andMajorStudentsNumberIn(List<Integer> values) {
            addCriterion("major_students_number in", values, "majorStudentsNumber");
            return (Criteria) this;
        }

        public Criteria andMajorStudentsNumberNotIn(List<Integer> values) {
            addCriterion("major_students_number not in", values, "majorStudentsNumber");
            return (Criteria) this;
        }

        public Criteria andMajorStudentsNumberBetween(Integer value1, Integer value2) {
            addCriterion("major_students_number between", value1, value2, "majorStudentsNumber");
            return (Criteria) this;
        }

        public Criteria andMajorStudentsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("major_students_number not between", value1, value2, "majorStudentsNumber");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodIsNull() {
            addCriterion("total_period is null");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodIsNotNull() {
            addCriterion("total_period is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodEqualTo(Integer value) {
            addCriterion("total_period =", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodNotEqualTo(Integer value) {
            addCriterion("total_period <>", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodGreaterThan(Integer value) {
            addCriterion("total_period >", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_period >=", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodLessThan(Integer value) {
            addCriterion("total_period <", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("total_period <=", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodIn(List<Integer> values) {
            addCriterion("total_period in", values, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodNotIn(List<Integer> values) {
            addCriterion("total_period not in", values, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodBetween(Integer value1, Integer value2) {
            addCriterion("total_period between", value1, value2, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("total_period not between", value1, value2, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andCampusCodeIsNull() {
            addCriterion("campus_code is null");
            return (Criteria) this;
        }

        public Criteria andCampusCodeIsNotNull() {
            addCriterion("campus_code is not null");
            return (Criteria) this;
        }

        public Criteria andCampusCodeEqualTo(String value) {
            addCriterion("campus_code =", value, "campusCode");
            return (Criteria) this;
        }

        public Criteria andCampusCodeNotEqualTo(String value) {
            addCriterion("campus_code <>", value, "campusCode");
            return (Criteria) this;
        }

        public Criteria andCampusCodeGreaterThan(String value) {
            addCriterion("campus_code >", value, "campusCode");
            return (Criteria) this;
        }

        public Criteria andCampusCodeGreaterThanOrEqualTo(String value) {
            addCriterion("campus_code >=", value, "campusCode");
            return (Criteria) this;
        }

        public Criteria andCampusCodeLessThan(String value) {
            addCriterion("campus_code <", value, "campusCode");
            return (Criteria) this;
        }

        public Criteria andCampusCodeLessThanOrEqualTo(String value) {
            addCriterion("campus_code <=", value, "campusCode");
            return (Criteria) this;
        }

        public Criteria andCampusCodeLike(String value) {
            addCriterion("campus_code like", value, "campusCode");
            return (Criteria) this;
        }

        public Criteria andCampusCodeNotLike(String value) {
            addCriterion("campus_code not like", value, "campusCode");
            return (Criteria) this;
        }

        public Criteria andCampusCodeIn(List<String> values) {
            addCriterion("campus_code in", values, "campusCode");
            return (Criteria) this;
        }

        public Criteria andCampusCodeNotIn(List<String> values) {
            addCriterion("campus_code not in", values, "campusCode");
            return (Criteria) this;
        }

        public Criteria andCampusCodeBetween(String value1, String value2) {
            addCriterion("campus_code between", value1, value2, "campusCode");
            return (Criteria) this;
        }

        public Criteria andCampusCodeNotBetween(String value1, String value2) {
            addCriterion("campus_code not between", value1, value2, "campusCode");
            return (Criteria) this;
        }

        public Criteria andIsUseMultimediaIsNull() {
            addCriterion("is_use_multimedia is null");
            return (Criteria) this;
        }

        public Criteria andIsUseMultimediaIsNotNull() {
            addCriterion("is_use_multimedia is not null");
            return (Criteria) this;
        }

        public Criteria andIsUseMultimediaEqualTo(String value) {
            addCriterion("is_use_multimedia =", value, "isUseMultimedia");
            return (Criteria) this;
        }

        public Criteria andIsUseMultimediaNotEqualTo(String value) {
            addCriterion("is_use_multimedia <>", value, "isUseMultimedia");
            return (Criteria) this;
        }

        public Criteria andIsUseMultimediaGreaterThan(String value) {
            addCriterion("is_use_multimedia >", value, "isUseMultimedia");
            return (Criteria) this;
        }

        public Criteria andIsUseMultimediaGreaterThanOrEqualTo(String value) {
            addCriterion("is_use_multimedia >=", value, "isUseMultimedia");
            return (Criteria) this;
        }

        public Criteria andIsUseMultimediaLessThan(String value) {
            addCriterion("is_use_multimedia <", value, "isUseMultimedia");
            return (Criteria) this;
        }

        public Criteria andIsUseMultimediaLessThanOrEqualTo(String value) {
            addCriterion("is_use_multimedia <=", value, "isUseMultimedia");
            return (Criteria) this;
        }

        public Criteria andIsUseMultimediaLike(String value) {
            addCriterion("is_use_multimedia like", value, "isUseMultimedia");
            return (Criteria) this;
        }

        public Criteria andIsUseMultimediaNotLike(String value) {
            addCriterion("is_use_multimedia not like", value, "isUseMultimedia");
            return (Criteria) this;
        }

        public Criteria andIsUseMultimediaIn(List<String> values) {
            addCriterion("is_use_multimedia in", values, "isUseMultimedia");
            return (Criteria) this;
        }

        public Criteria andIsUseMultimediaNotIn(List<String> values) {
            addCriterion("is_use_multimedia not in", values, "isUseMultimedia");
            return (Criteria) this;
        }

        public Criteria andIsUseMultimediaBetween(String value1, String value2) {
            addCriterion("is_use_multimedia between", value1, value2, "isUseMultimedia");
            return (Criteria) this;
        }

        public Criteria andIsUseMultimediaNotBetween(String value1, String value2) {
            addCriterion("is_use_multimedia not between", value1, value2, "isUseMultimedia");
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