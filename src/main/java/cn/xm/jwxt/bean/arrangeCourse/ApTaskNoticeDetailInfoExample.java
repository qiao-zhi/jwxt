package cn.xm.jwxt.bean.arrangeCourse;

import java.util.ArrayList;
import java.util.List;

public class ApTaskNoticeDetailInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApTaskNoticeDetailInfoExample() {
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

        public Criteria andNoticeDetailIdIsNull() {
            addCriterion("notice_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdIsNotNull() {
            addCriterion("notice_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdEqualTo(Integer value) {
            addCriterion("notice_detail_id =", value, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdNotEqualTo(Integer value) {
            addCriterion("notice_detail_id <>", value, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdGreaterThan(Integer value) {
            addCriterion("notice_detail_id >", value, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_detail_id >=", value, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdLessThan(Integer value) {
            addCriterion("notice_detail_id <", value, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("notice_detail_id <=", value, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdIn(List<Integer> values) {
            addCriterion("notice_detail_id in", values, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdNotIn(List<Integer> values) {
            addCriterion("notice_detail_id not in", values, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("notice_detail_id between", value1, value2, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_detail_id not between", value1, value2, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeBookIdIsNull() {
            addCriterion("notice_book_id is null");
            return (Criteria) this;
        }

        public Criteria andNoticeBookIdIsNotNull() {
            addCriterion("notice_book_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeBookIdEqualTo(String value) {
            addCriterion("notice_book_id =", value, "noticeBookId");
            return (Criteria) this;
        }

        public Criteria andNoticeBookIdNotEqualTo(String value) {
            addCriterion("notice_book_id <>", value, "noticeBookId");
            return (Criteria) this;
        }

        public Criteria andNoticeBookIdGreaterThan(String value) {
            addCriterion("notice_book_id >", value, "noticeBookId");
            return (Criteria) this;
        }

        public Criteria andNoticeBookIdGreaterThanOrEqualTo(String value) {
            addCriterion("notice_book_id >=", value, "noticeBookId");
            return (Criteria) this;
        }

        public Criteria andNoticeBookIdLessThan(String value) {
            addCriterion("notice_book_id <", value, "noticeBookId");
            return (Criteria) this;
        }

        public Criteria andNoticeBookIdLessThanOrEqualTo(String value) {
            addCriterion("notice_book_id <=", value, "noticeBookId");
            return (Criteria) this;
        }

        public Criteria andNoticeBookIdLike(String value) {
            addCriterion("notice_book_id like", value, "noticeBookId");
            return (Criteria) this;
        }

        public Criteria andNoticeBookIdNotLike(String value) {
            addCriterion("notice_book_id not like", value, "noticeBookId");
            return (Criteria) this;
        }

        public Criteria andNoticeBookIdIn(List<String> values) {
            addCriterion("notice_book_id in", values, "noticeBookId");
            return (Criteria) this;
        }

        public Criteria andNoticeBookIdNotIn(List<String> values) {
            addCriterion("notice_book_id not in", values, "noticeBookId");
            return (Criteria) this;
        }

        public Criteria andNoticeBookIdBetween(String value1, String value2) {
            addCriterion("notice_book_id between", value1, value2, "noticeBookId");
            return (Criteria) this;
        }

        public Criteria andNoticeBookIdNotBetween(String value1, String value2) {
            addCriterion("notice_book_id not between", value1, value2, "noticeBookId");
            return (Criteria) this;
        }

        public Criteria andDatailSortIsNull() {
            addCriterion("datail_sort is null");
            return (Criteria) this;
        }

        public Criteria andDatailSortIsNotNull() {
            addCriterion("datail_sort is not null");
            return (Criteria) this;
        }

        public Criteria andDatailSortEqualTo(String value) {
            addCriterion("datail_sort =", value, "datailSort");
            return (Criteria) this;
        }

        public Criteria andDatailSortNotEqualTo(String value) {
            addCriterion("datail_sort <>", value, "datailSort");
            return (Criteria) this;
        }

        public Criteria andDatailSortGreaterThan(String value) {
            addCriterion("datail_sort >", value, "datailSort");
            return (Criteria) this;
        }

        public Criteria andDatailSortGreaterThanOrEqualTo(String value) {
            addCriterion("datail_sort >=", value, "datailSort");
            return (Criteria) this;
        }

        public Criteria andDatailSortLessThan(String value) {
            addCriterion("datail_sort <", value, "datailSort");
            return (Criteria) this;
        }

        public Criteria andDatailSortLessThanOrEqualTo(String value) {
            addCriterion("datail_sort <=", value, "datailSort");
            return (Criteria) this;
        }

        public Criteria andDatailSortLike(String value) {
            addCriterion("datail_sort like", value, "datailSort");
            return (Criteria) this;
        }

        public Criteria andDatailSortNotLike(String value) {
            addCriterion("datail_sort not like", value, "datailSort");
            return (Criteria) this;
        }

        public Criteria andDatailSortIn(List<String> values) {
            addCriterion("datail_sort in", values, "datailSort");
            return (Criteria) this;
        }

        public Criteria andDatailSortNotIn(List<String> values) {
            addCriterion("datail_sort not in", values, "datailSort");
            return (Criteria) this;
        }

        public Criteria andDatailSortBetween(String value1, String value2) {
            addCriterion("datail_sort between", value1, value2, "datailSort");
            return (Criteria) this;
        }

        public Criteria andDatailSortNotBetween(String value1, String value2) {
            addCriterion("datail_sort not between", value1, value2, "datailSort");
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

        public Criteria andTeachPlanNumIsNull() {
            addCriterion("teach_plan_num is null");
            return (Criteria) this;
        }

        public Criteria andTeachPlanNumIsNotNull() {
            addCriterion("teach_plan_num is not null");
            return (Criteria) this;
        }

        public Criteria andTeachPlanNumEqualTo(String value) {
            addCriterion("teach_plan_num =", value, "teachPlanNum");
            return (Criteria) this;
        }

        public Criteria andTeachPlanNumNotEqualTo(String value) {
            addCriterion("teach_plan_num <>", value, "teachPlanNum");
            return (Criteria) this;
        }

        public Criteria andTeachPlanNumGreaterThan(String value) {
            addCriterion("teach_plan_num >", value, "teachPlanNum");
            return (Criteria) this;
        }

        public Criteria andTeachPlanNumGreaterThanOrEqualTo(String value) {
            addCriterion("teach_plan_num >=", value, "teachPlanNum");
            return (Criteria) this;
        }

        public Criteria andTeachPlanNumLessThan(String value) {
            addCriterion("teach_plan_num <", value, "teachPlanNum");
            return (Criteria) this;
        }

        public Criteria andTeachPlanNumLessThanOrEqualTo(String value) {
            addCriterion("teach_plan_num <=", value, "teachPlanNum");
            return (Criteria) this;
        }

        public Criteria andTeachPlanNumLike(String value) {
            addCriterion("teach_plan_num like", value, "teachPlanNum");
            return (Criteria) this;
        }

        public Criteria andTeachPlanNumNotLike(String value) {
            addCriterion("teach_plan_num not like", value, "teachPlanNum");
            return (Criteria) this;
        }

        public Criteria andTeachPlanNumIn(List<String> values) {
            addCriterion("teach_plan_num in", values, "teachPlanNum");
            return (Criteria) this;
        }

        public Criteria andTeachPlanNumNotIn(List<String> values) {
            addCriterion("teach_plan_num not in", values, "teachPlanNum");
            return (Criteria) this;
        }

        public Criteria andTeachPlanNumBetween(String value1, String value2) {
            addCriterion("teach_plan_num between", value1, value2, "teachPlanNum");
            return (Criteria) this;
        }

        public Criteria andTeachPlanNumNotBetween(String value1, String value2) {
            addCriterion("teach_plan_num not between", value1, value2, "teachPlanNum");
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

        public Criteria andClassStudentNumIsNull() {
            addCriterion("class_student_num is null");
            return (Criteria) this;
        }

        public Criteria andClassStudentNumIsNotNull() {
            addCriterion("class_student_num is not null");
            return (Criteria) this;
        }

        public Criteria andClassStudentNumEqualTo(Integer value) {
            addCriterion("class_student_num =", value, "classStudentNum");
            return (Criteria) this;
        }

        public Criteria andClassStudentNumNotEqualTo(Integer value) {
            addCriterion("class_student_num <>", value, "classStudentNum");
            return (Criteria) this;
        }

        public Criteria andClassStudentNumGreaterThan(Integer value) {
            addCriterion("class_student_num >", value, "classStudentNum");
            return (Criteria) this;
        }

        public Criteria andClassStudentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_student_num >=", value, "classStudentNum");
            return (Criteria) this;
        }

        public Criteria andClassStudentNumLessThan(Integer value) {
            addCriterion("class_student_num <", value, "classStudentNum");
            return (Criteria) this;
        }

        public Criteria andClassStudentNumLessThanOrEqualTo(Integer value) {
            addCriterion("class_student_num <=", value, "classStudentNum");
            return (Criteria) this;
        }

        public Criteria andClassStudentNumIn(List<Integer> values) {
            addCriterion("class_student_num in", values, "classStudentNum");
            return (Criteria) this;
        }

        public Criteria andClassStudentNumNotIn(List<Integer> values) {
            addCriterion("class_student_num not in", values, "classStudentNum");
            return (Criteria) this;
        }

        public Criteria andClassStudentNumBetween(Integer value1, Integer value2) {
            addCriterion("class_student_num between", value1, value2, "classStudentNum");
            return (Criteria) this;
        }

        public Criteria andClassStudentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("class_student_num not between", value1, value2, "classStudentNum");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
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

        public Criteria andTestMethodIsNull() {
            addCriterion("test_method is null");
            return (Criteria) this;
        }

        public Criteria andTestMethodIsNotNull() {
            addCriterion("test_method is not null");
            return (Criteria) this;
        }

        public Criteria andTestMethodEqualTo(String value) {
            addCriterion("test_method =", value, "testMethod");
            return (Criteria) this;
        }

        public Criteria andTestMethodNotEqualTo(String value) {
            addCriterion("test_method <>", value, "testMethod");
            return (Criteria) this;
        }

        public Criteria andTestMethodGreaterThan(String value) {
            addCriterion("test_method >", value, "testMethod");
            return (Criteria) this;
        }

        public Criteria andTestMethodGreaterThanOrEqualTo(String value) {
            addCriterion("test_method >=", value, "testMethod");
            return (Criteria) this;
        }

        public Criteria andTestMethodLessThan(String value) {
            addCriterion("test_method <", value, "testMethod");
            return (Criteria) this;
        }

        public Criteria andTestMethodLessThanOrEqualTo(String value) {
            addCriterion("test_method <=", value, "testMethod");
            return (Criteria) this;
        }

        public Criteria andTestMethodLike(String value) {
            addCriterion("test_method like", value, "testMethod");
            return (Criteria) this;
        }

        public Criteria andTestMethodNotLike(String value) {
            addCriterion("test_method not like", value, "testMethod");
            return (Criteria) this;
        }

        public Criteria andTestMethodIn(List<String> values) {
            addCriterion("test_method in", values, "testMethod");
            return (Criteria) this;
        }

        public Criteria andTestMethodNotIn(List<String> values) {
            addCriterion("test_method not in", values, "testMethod");
            return (Criteria) this;
        }

        public Criteria andTestMethodBetween(String value1, String value2) {
            addCriterion("test_method between", value1, value2, "testMethod");
            return (Criteria) this;
        }

        public Criteria andTestMethodNotBetween(String value1, String value2) {
            addCriterion("test_method not between", value1, value2, "testMethod");
            return (Criteria) this;
        }

        public Criteria andWeekPeriodIsNull() {
            addCriterion("week_period is null");
            return (Criteria) this;
        }

        public Criteria andWeekPeriodIsNotNull() {
            addCriterion("week_period is not null");
            return (Criteria) this;
        }

        public Criteria andWeekPeriodEqualTo(String value) {
            addCriterion("week_period =", value, "weekPeriod");
            return (Criteria) this;
        }

        public Criteria andWeekPeriodNotEqualTo(String value) {
            addCriterion("week_period <>", value, "weekPeriod");
            return (Criteria) this;
        }

        public Criteria andWeekPeriodGreaterThan(String value) {
            addCriterion("week_period >", value, "weekPeriod");
            return (Criteria) this;
        }

        public Criteria andWeekPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("week_period >=", value, "weekPeriod");
            return (Criteria) this;
        }

        public Criteria andWeekPeriodLessThan(String value) {
            addCriterion("week_period <", value, "weekPeriod");
            return (Criteria) this;
        }

        public Criteria andWeekPeriodLessThanOrEqualTo(String value) {
            addCriterion("week_period <=", value, "weekPeriod");
            return (Criteria) this;
        }

        public Criteria andWeekPeriodLike(String value) {
            addCriterion("week_period like", value, "weekPeriod");
            return (Criteria) this;
        }

        public Criteria andWeekPeriodNotLike(String value) {
            addCriterion("week_period not like", value, "weekPeriod");
            return (Criteria) this;
        }

        public Criteria andWeekPeriodIn(List<String> values) {
            addCriterion("week_period in", values, "weekPeriod");
            return (Criteria) this;
        }

        public Criteria andWeekPeriodNotIn(List<String> values) {
            addCriterion("week_period not in", values, "weekPeriod");
            return (Criteria) this;
        }

        public Criteria andWeekPeriodBetween(String value1, String value2) {
            addCriterion("week_period between", value1, value2, "weekPeriod");
            return (Criteria) this;
        }

        public Criteria andWeekPeriodNotBetween(String value1, String value2) {
            addCriterion("week_period not between", value1, value2, "weekPeriod");
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

        public Criteria andTotalPeriodEqualTo(String value) {
            addCriterion("total_period =", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodNotEqualTo(String value) {
            addCriterion("total_period <>", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodGreaterThan(String value) {
            addCriterion("total_period >", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("total_period >=", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodLessThan(String value) {
            addCriterion("total_period <", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodLessThanOrEqualTo(String value) {
            addCriterion("total_period <=", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodLike(String value) {
            addCriterion("total_period like", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodNotLike(String value) {
            addCriterion("total_period not like", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodIn(List<String> values) {
            addCriterion("total_period in", values, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodNotIn(List<String> values) {
            addCriterion("total_period not in", values, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodBetween(String value1, String value2) {
            addCriterion("total_period between", value1, value2, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodNotBetween(String value1, String value2) {
            addCriterion("total_period not between", value1, value2, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andStartStopWeekIsNull() {
            addCriterion("start_stop_week is null");
            return (Criteria) this;
        }

        public Criteria andStartStopWeekIsNotNull() {
            addCriterion("start_stop_week is not null");
            return (Criteria) this;
        }

        public Criteria andStartStopWeekEqualTo(String value) {
            addCriterion("start_stop_week =", value, "startStopWeek");
            return (Criteria) this;
        }

        public Criteria andStartStopWeekNotEqualTo(String value) {
            addCriterion("start_stop_week <>", value, "startStopWeek");
            return (Criteria) this;
        }

        public Criteria andStartStopWeekGreaterThan(String value) {
            addCriterion("start_stop_week >", value, "startStopWeek");
            return (Criteria) this;
        }

        public Criteria andStartStopWeekGreaterThanOrEqualTo(String value) {
            addCriterion("start_stop_week >=", value, "startStopWeek");
            return (Criteria) this;
        }

        public Criteria andStartStopWeekLessThan(String value) {
            addCriterion("start_stop_week <", value, "startStopWeek");
            return (Criteria) this;
        }

        public Criteria andStartStopWeekLessThanOrEqualTo(String value) {
            addCriterion("start_stop_week <=", value, "startStopWeek");
            return (Criteria) this;
        }

        public Criteria andStartStopWeekLike(String value) {
            addCriterion("start_stop_week like", value, "startStopWeek");
            return (Criteria) this;
        }

        public Criteria andStartStopWeekNotLike(String value) {
            addCriterion("start_stop_week not like", value, "startStopWeek");
            return (Criteria) this;
        }

        public Criteria andStartStopWeekIn(List<String> values) {
            addCriterion("start_stop_week in", values, "startStopWeek");
            return (Criteria) this;
        }

        public Criteria andStartStopWeekNotIn(List<String> values) {
            addCriterion("start_stop_week not in", values, "startStopWeek");
            return (Criteria) this;
        }

        public Criteria andStartStopWeekBetween(String value1, String value2) {
            addCriterion("start_stop_week between", value1, value2, "startStopWeek");
            return (Criteria) this;
        }

        public Criteria andStartStopWeekNotBetween(String value1, String value2) {
            addCriterion("start_stop_week not between", value1, value2, "startStopWeek");
            return (Criteria) this;
        }

        public Criteria andContactTimeIsNull() {
            addCriterion("contact_time is null");
            return (Criteria) this;
        }

        public Criteria andContactTimeIsNotNull() {
            addCriterion("contact_time is not null");
            return (Criteria) this;
        }

        public Criteria andContactTimeEqualTo(String value) {
            addCriterion("contact_time =", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeNotEqualTo(String value) {
            addCriterion("contact_time <>", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeGreaterThan(String value) {
            addCriterion("contact_time >", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeGreaterThanOrEqualTo(String value) {
            addCriterion("contact_time >=", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeLessThan(String value) {
            addCriterion("contact_time <", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeLessThanOrEqualTo(String value) {
            addCriterion("contact_time <=", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeLike(String value) {
            addCriterion("contact_time like", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeNotLike(String value) {
            addCriterion("contact_time not like", value, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeIn(List<String> values) {
            addCriterion("contact_time in", values, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeNotIn(List<String> values) {
            addCriterion("contact_time not in", values, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeBetween(String value1, String value2) {
            addCriterion("contact_time between", value1, value2, "contactTime");
            return (Criteria) this;
        }

        public Criteria andContactTimeNotBetween(String value1, String value2) {
            addCriterion("contact_time not between", value1, value2, "contactTime");
            return (Criteria) this;
        }

        public Criteria andExperimentalTimeIsNull() {
            addCriterion("experimental_time is null");
            return (Criteria) this;
        }

        public Criteria andExperimentalTimeIsNotNull() {
            addCriterion("experimental_time is not null");
            return (Criteria) this;
        }

        public Criteria andExperimentalTimeEqualTo(String value) {
            addCriterion("experimental_time =", value, "experimentalTime");
            return (Criteria) this;
        }

        public Criteria andExperimentalTimeNotEqualTo(String value) {
            addCriterion("experimental_time <>", value, "experimentalTime");
            return (Criteria) this;
        }

        public Criteria andExperimentalTimeGreaterThan(String value) {
            addCriterion("experimental_time >", value, "experimentalTime");
            return (Criteria) this;
        }

        public Criteria andExperimentalTimeGreaterThanOrEqualTo(String value) {
            addCriterion("experimental_time >=", value, "experimentalTime");
            return (Criteria) this;
        }

        public Criteria andExperimentalTimeLessThan(String value) {
            addCriterion("experimental_time <", value, "experimentalTime");
            return (Criteria) this;
        }

        public Criteria andExperimentalTimeLessThanOrEqualTo(String value) {
            addCriterion("experimental_time <=", value, "experimentalTime");
            return (Criteria) this;
        }

        public Criteria andExperimentalTimeLike(String value) {
            addCriterion("experimental_time like", value, "experimentalTime");
            return (Criteria) this;
        }

        public Criteria andExperimentalTimeNotLike(String value) {
            addCriterion("experimental_time not like", value, "experimentalTime");
            return (Criteria) this;
        }

        public Criteria andExperimentalTimeIn(List<String> values) {
            addCriterion("experimental_time in", values, "experimentalTime");
            return (Criteria) this;
        }

        public Criteria andExperimentalTimeNotIn(List<String> values) {
            addCriterion("experimental_time not in", values, "experimentalTime");
            return (Criteria) this;
        }

        public Criteria andExperimentalTimeBetween(String value1, String value2) {
            addCriterion("experimental_time between", value1, value2, "experimentalTime");
            return (Criteria) this;
        }

        public Criteria andExperimentalTimeNotBetween(String value1, String value2) {
            addCriterion("experimental_time not between", value1, value2, "experimentalTime");
            return (Criteria) this;
        }

        public Criteria andCourseCharacterIsNull() {
            addCriterion("course_character is null");
            return (Criteria) this;
        }

        public Criteria andCourseCharacterIsNotNull() {
            addCriterion("course_character is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCharacterEqualTo(String value) {
            addCriterion("course_character =", value, "courseCharacter");
            return (Criteria) this;
        }

        public Criteria andCourseCharacterNotEqualTo(String value) {
            addCriterion("course_character <>", value, "courseCharacter");
            return (Criteria) this;
        }

        public Criteria andCourseCharacterGreaterThan(String value) {
            addCriterion("course_character >", value, "courseCharacter");
            return (Criteria) this;
        }

        public Criteria andCourseCharacterGreaterThanOrEqualTo(String value) {
            addCriterion("course_character >=", value, "courseCharacter");
            return (Criteria) this;
        }

        public Criteria andCourseCharacterLessThan(String value) {
            addCriterion("course_character <", value, "courseCharacter");
            return (Criteria) this;
        }

        public Criteria andCourseCharacterLessThanOrEqualTo(String value) {
            addCriterion("course_character <=", value, "courseCharacter");
            return (Criteria) this;
        }

        public Criteria andCourseCharacterLike(String value) {
            addCriterion("course_character like", value, "courseCharacter");
            return (Criteria) this;
        }

        public Criteria andCourseCharacterNotLike(String value) {
            addCriterion("course_character not like", value, "courseCharacter");
            return (Criteria) this;
        }

        public Criteria andCourseCharacterIn(List<String> values) {
            addCriterion("course_character in", values, "courseCharacter");
            return (Criteria) this;
        }

        public Criteria andCourseCharacterNotIn(List<String> values) {
            addCriterion("course_character not in", values, "courseCharacter");
            return (Criteria) this;
        }

        public Criteria andCourseCharacterBetween(String value1, String value2) {
            addCriterion("course_character between", value1, value2, "courseCharacter");
            return (Criteria) this;
        }

        public Criteria andCourseCharacterNotBetween(String value1, String value2) {
            addCriterion("course_character not between", value1, value2, "courseCharacter");
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