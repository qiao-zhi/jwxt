package cn.xm.jwxt.bean.arrangeCourse;

import java.util.ArrayList;
import java.util.List;

public class NoticedetailinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticedetailinfoExample() {
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

        public Criteria andNoticedatailidIsNull() {
            addCriterion("noticeDatailId is null");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidIsNotNull() {
            addCriterion("noticeDatailId is not null");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidEqualTo(Integer value) {
            addCriterion("noticeDatailId =", value, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidNotEqualTo(Integer value) {
            addCriterion("noticeDatailId <>", value, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidGreaterThan(Integer value) {
            addCriterion("noticeDatailId >", value, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("noticeDatailId >=", value, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidLessThan(Integer value) {
            addCriterion("noticeDatailId <", value, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidLessThanOrEqualTo(Integer value) {
            addCriterion("noticeDatailId <=", value, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidIn(List<Integer> values) {
            addCriterion("noticeDatailId in", values, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidNotIn(List<Integer> values) {
            addCriterion("noticeDatailId not in", values, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidBetween(Integer value1, Integer value2) {
            addCriterion("noticeDatailId between", value1, value2, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticedatailidNotBetween(Integer value1, Integer value2) {
            addCriterion("noticeDatailId not between", value1, value2, "noticedatailid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidIsNull() {
            addCriterion("noticeBookId is null");
            return (Criteria) this;
        }

        public Criteria andNoticebookidIsNotNull() {
            addCriterion("noticeBookId is not null");
            return (Criteria) this;
        }

        public Criteria andNoticebookidEqualTo(String value) {
            addCriterion("noticeBookId =", value, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidNotEqualTo(String value) {
            addCriterion("noticeBookId <>", value, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidGreaterThan(String value) {
            addCriterion("noticeBookId >", value, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidGreaterThanOrEqualTo(String value) {
            addCriterion("noticeBookId >=", value, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidLessThan(String value) {
            addCriterion("noticeBookId <", value, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidLessThanOrEqualTo(String value) {
            addCriterion("noticeBookId <=", value, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidLike(String value) {
            addCriterion("noticeBookId like", value, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidNotLike(String value) {
            addCriterion("noticeBookId not like", value, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidIn(List<String> values) {
            addCriterion("noticeBookId in", values, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidNotIn(List<String> values) {
            addCriterion("noticeBookId not in", values, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidBetween(String value1, String value2) {
            addCriterion("noticeBookId between", value1, value2, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidNotBetween(String value1, String value2) {
            addCriterion("noticeBookId not between", value1, value2, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andDatailsortIsNull() {
            addCriterion("datailSort is null");
            return (Criteria) this;
        }

        public Criteria andDatailsortIsNotNull() {
            addCriterion("datailSort is not null");
            return (Criteria) this;
        }

        public Criteria andDatailsortEqualTo(String value) {
            addCriterion("datailSort =", value, "datailsort");
            return (Criteria) this;
        }

        public Criteria andDatailsortNotEqualTo(String value) {
            addCriterion("datailSort <>", value, "datailsort");
            return (Criteria) this;
        }

        public Criteria andDatailsortGreaterThan(String value) {
            addCriterion("datailSort >", value, "datailsort");
            return (Criteria) this;
        }

        public Criteria andDatailsortGreaterThanOrEqualTo(String value) {
            addCriterion("datailSort >=", value, "datailsort");
            return (Criteria) this;
        }

        public Criteria andDatailsortLessThan(String value) {
            addCriterion("datailSort <", value, "datailsort");
            return (Criteria) this;
        }

        public Criteria andDatailsortLessThanOrEqualTo(String value) {
            addCriterion("datailSort <=", value, "datailsort");
            return (Criteria) this;
        }

        public Criteria andDatailsortLike(String value) {
            addCriterion("datailSort like", value, "datailsort");
            return (Criteria) this;
        }

        public Criteria andDatailsortNotLike(String value) {
            addCriterion("datailSort not like", value, "datailsort");
            return (Criteria) this;
        }

        public Criteria andDatailsortIn(List<String> values) {
            addCriterion("datailSort in", values, "datailsort");
            return (Criteria) this;
        }

        public Criteria andDatailsortNotIn(List<String> values) {
            addCriterion("datailSort not in", values, "datailsort");
            return (Criteria) this;
        }

        public Criteria andDatailsortBetween(String value1, String value2) {
            addCriterion("datailSort between", value1, value2, "datailsort");
            return (Criteria) this;
        }

        public Criteria andDatailsortNotBetween(String value1, String value2) {
            addCriterion("datailSort not between", value1, value2, "datailsort");
            return (Criteria) this;
        }

        public Criteria andCoursecodeIsNull() {
            addCriterion("courseCode is null");
            return (Criteria) this;
        }

        public Criteria andCoursecodeIsNotNull() {
            addCriterion("courseCode is not null");
            return (Criteria) this;
        }

        public Criteria andCoursecodeEqualTo(String value) {
            addCriterion("courseCode =", value, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeNotEqualTo(String value) {
            addCriterion("courseCode <>", value, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeGreaterThan(String value) {
            addCriterion("courseCode >", value, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeGreaterThanOrEqualTo(String value) {
            addCriterion("courseCode >=", value, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeLessThan(String value) {
            addCriterion("courseCode <", value, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeLessThanOrEqualTo(String value) {
            addCriterion("courseCode <=", value, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeLike(String value) {
            addCriterion("courseCode like", value, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeNotLike(String value) {
            addCriterion("courseCode not like", value, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeIn(List<String> values) {
            addCriterion("courseCode in", values, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeNotIn(List<String> values) {
            addCriterion("courseCode not in", values, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeBetween(String value1, String value2) {
            addCriterion("courseCode between", value1, value2, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursecodeNotBetween(String value1, String value2) {
            addCriterion("courseCode not between", value1, value2, "coursecode");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("courseName is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("courseName is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("courseName =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("courseName <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("courseName >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("courseName >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("courseName <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("courseName <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("courseName like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("courseName not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("courseName in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("courseName not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("courseName between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("courseName not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andTeachplannumIsNull() {
            addCriterion("teachPlanNum is null");
            return (Criteria) this;
        }

        public Criteria andTeachplannumIsNotNull() {
            addCriterion("teachPlanNum is not null");
            return (Criteria) this;
        }

        public Criteria andTeachplannumEqualTo(String value) {
            addCriterion("teachPlanNum =", value, "teachplannum");
            return (Criteria) this;
        }

        public Criteria andTeachplannumNotEqualTo(String value) {
            addCriterion("teachPlanNum <>", value, "teachplannum");
            return (Criteria) this;
        }

        public Criteria andTeachplannumGreaterThan(String value) {
            addCriterion("teachPlanNum >", value, "teachplannum");
            return (Criteria) this;
        }

        public Criteria andTeachplannumGreaterThanOrEqualTo(String value) {
            addCriterion("teachPlanNum >=", value, "teachplannum");
            return (Criteria) this;
        }

        public Criteria andTeachplannumLessThan(String value) {
            addCriterion("teachPlanNum <", value, "teachplannum");
            return (Criteria) this;
        }

        public Criteria andTeachplannumLessThanOrEqualTo(String value) {
            addCriterion("teachPlanNum <=", value, "teachplannum");
            return (Criteria) this;
        }

        public Criteria andTeachplannumLike(String value) {
            addCriterion("teachPlanNum like", value, "teachplannum");
            return (Criteria) this;
        }

        public Criteria andTeachplannumNotLike(String value) {
            addCriterion("teachPlanNum not like", value, "teachplannum");
            return (Criteria) this;
        }

        public Criteria andTeachplannumIn(List<String> values) {
            addCriterion("teachPlanNum in", values, "teachplannum");
            return (Criteria) this;
        }

        public Criteria andTeachplannumNotIn(List<String> values) {
            addCriterion("teachPlanNum not in", values, "teachplannum");
            return (Criteria) this;
        }

        public Criteria andTeachplannumBetween(String value1, String value2) {
            addCriterion("teachPlanNum between", value1, value2, "teachplannum");
            return (Criteria) this;
        }

        public Criteria andTeachplannumNotBetween(String value1, String value2) {
            addCriterion("teachPlanNum not between", value1, value2, "teachplannum");
            return (Criteria) this;
        }

        public Criteria andMajornameIsNull() {
            addCriterion("majorName is null");
            return (Criteria) this;
        }

        public Criteria andMajornameIsNotNull() {
            addCriterion("majorName is not null");
            return (Criteria) this;
        }

        public Criteria andMajornameEqualTo(String value) {
            addCriterion("majorName =", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotEqualTo(String value) {
            addCriterion("majorName <>", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameGreaterThan(String value) {
            addCriterion("majorName >", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameGreaterThanOrEqualTo(String value) {
            addCriterion("majorName >=", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLessThan(String value) {
            addCriterion("majorName <", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLessThanOrEqualTo(String value) {
            addCriterion("majorName <=", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLike(String value) {
            addCriterion("majorName like", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotLike(String value) {
            addCriterion("majorName not like", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameIn(List<String> values) {
            addCriterion("majorName in", values, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotIn(List<String> values) {
            addCriterion("majorName not in", values, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameBetween(String value1, String value2) {
            addCriterion("majorName between", value1, value2, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotBetween(String value1, String value2) {
            addCriterion("majorName not between", value1, value2, "majorname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNull() {
            addCriterion("schoolName is null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNotNull() {
            addCriterion("schoolName is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameEqualTo(String value) {
            addCriterion("schoolName =", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotEqualTo(String value) {
            addCriterion("schoolName <>", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThan(String value) {
            addCriterion("schoolName >", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThanOrEqualTo(String value) {
            addCriterion("schoolName >=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThan(String value) {
            addCriterion("schoolName <", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThanOrEqualTo(String value) {
            addCriterion("schoolName <=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLike(String value) {
            addCriterion("schoolName like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotLike(String value) {
            addCriterion("schoolName not like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIn(List<String> values) {
            addCriterion("schoolName in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotIn(List<String> values) {
            addCriterion("schoolName not in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameBetween(String value1, String value2) {
            addCriterion("schoolName between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotBetween(String value1, String value2) {
            addCriterion("schoolName not between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("className is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("className is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("className =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("className <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("className >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("className >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("className <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("className <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("className like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("className not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("className in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("className not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("className between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("className not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassstudentnumIsNull() {
            addCriterion("classStudentNum is null");
            return (Criteria) this;
        }

        public Criteria andClassstudentnumIsNotNull() {
            addCriterion("classStudentNum is not null");
            return (Criteria) this;
        }

        public Criteria andClassstudentnumEqualTo(Short value) {
            addCriterion("classStudentNum =", value, "classstudentnum");
            return (Criteria) this;
        }

        public Criteria andClassstudentnumNotEqualTo(Short value) {
            addCriterion("classStudentNum <>", value, "classstudentnum");
            return (Criteria) this;
        }

        public Criteria andClassstudentnumGreaterThan(Short value) {
            addCriterion("classStudentNum >", value, "classstudentnum");
            return (Criteria) this;
        }

        public Criteria andClassstudentnumGreaterThanOrEqualTo(Short value) {
            addCriterion("classStudentNum >=", value, "classstudentnum");
            return (Criteria) this;
        }

        public Criteria andClassstudentnumLessThan(Short value) {
            addCriterion("classStudentNum <", value, "classstudentnum");
            return (Criteria) this;
        }

        public Criteria andClassstudentnumLessThanOrEqualTo(Short value) {
            addCriterion("classStudentNum <=", value, "classstudentnum");
            return (Criteria) this;
        }

        public Criteria andClassstudentnumIn(List<Short> values) {
            addCriterion("classStudentNum in", values, "classstudentnum");
            return (Criteria) this;
        }

        public Criteria andClassstudentnumNotIn(List<Short> values) {
            addCriterion("classStudentNum not in", values, "classstudentnum");
            return (Criteria) this;
        }

        public Criteria andClassstudentnumBetween(Short value1, Short value2) {
            addCriterion("classStudentNum between", value1, value2, "classstudentnum");
            return (Criteria) this;
        }

        public Criteria andClassstudentnumNotBetween(Short value1, Short value2) {
            addCriterion("classStudentNum not between", value1, value2, "classstudentnum");
            return (Criteria) this;
        }

        public Criteria andStudentgradeIsNull() {
            addCriterion("studentgrade is null");
            return (Criteria) this;
        }

        public Criteria andStudentgradeIsNotNull() {
            addCriterion("studentgrade is not null");
            return (Criteria) this;
        }

        public Criteria andStudentgradeEqualTo(String value) {
            addCriterion("studentgrade =", value, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeNotEqualTo(String value) {
            addCriterion("studentgrade <>", value, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeGreaterThan(String value) {
            addCriterion("studentgrade >", value, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeGreaterThanOrEqualTo(String value) {
            addCriterion("studentgrade >=", value, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeLessThan(String value) {
            addCriterion("studentgrade <", value, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeLessThanOrEqualTo(String value) {
            addCriterion("studentgrade <=", value, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeLike(String value) {
            addCriterion("studentgrade like", value, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeNotLike(String value) {
            addCriterion("studentgrade not like", value, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeIn(List<String> values) {
            addCriterion("studentgrade in", values, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeNotIn(List<String> values) {
            addCriterion("studentgrade not in", values, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeBetween(String value1, String value2) {
            addCriterion("studentgrade between", value1, value2, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeNotBetween(String value1, String value2) {
            addCriterion("studentgrade not between", value1, value2, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andAllstudentnumIsNull() {
            addCriterion("allStudentNum is null");
            return (Criteria) this;
        }

        public Criteria andAllstudentnumIsNotNull() {
            addCriterion("allStudentNum is not null");
            return (Criteria) this;
        }

        public Criteria andAllstudentnumEqualTo(Short value) {
            addCriterion("allStudentNum =", value, "allstudentnum");
            return (Criteria) this;
        }

        public Criteria andAllstudentnumNotEqualTo(Short value) {
            addCriterion("allStudentNum <>", value, "allstudentnum");
            return (Criteria) this;
        }

        public Criteria andAllstudentnumGreaterThan(Short value) {
            addCriterion("allStudentNum >", value, "allstudentnum");
            return (Criteria) this;
        }

        public Criteria andAllstudentnumGreaterThanOrEqualTo(Short value) {
            addCriterion("allStudentNum >=", value, "allstudentnum");
            return (Criteria) this;
        }

        public Criteria andAllstudentnumLessThan(Short value) {
            addCriterion("allStudentNum <", value, "allstudentnum");
            return (Criteria) this;
        }

        public Criteria andAllstudentnumLessThanOrEqualTo(Short value) {
            addCriterion("allStudentNum <=", value, "allstudentnum");
            return (Criteria) this;
        }

        public Criteria andAllstudentnumIn(List<Short> values) {
            addCriterion("allStudentNum in", values, "allstudentnum");
            return (Criteria) this;
        }

        public Criteria andAllstudentnumNotIn(List<Short> values) {
            addCriterion("allStudentNum not in", values, "allstudentnum");
            return (Criteria) this;
        }

        public Criteria andAllstudentnumBetween(Short value1, Short value2) {
            addCriterion("allStudentNum between", value1, value2, "allstudentnum");
            return (Criteria) this;
        }

        public Criteria andAllstudentnumNotBetween(Short value1, Short value2) {
            addCriterion("allStudentNum not between", value1, value2, "allstudentnum");
            return (Criteria) this;
        }

        public Criteria andTestmethodIsNull() {
            addCriterion("testMethod is null");
            return (Criteria) this;
        }

        public Criteria andTestmethodIsNotNull() {
            addCriterion("testMethod is not null");
            return (Criteria) this;
        }

        public Criteria andTestmethodEqualTo(String value) {
            addCriterion("testMethod =", value, "testmethod");
            return (Criteria) this;
        }

        public Criteria andTestmethodNotEqualTo(String value) {
            addCriterion("testMethod <>", value, "testmethod");
            return (Criteria) this;
        }

        public Criteria andTestmethodGreaterThan(String value) {
            addCriterion("testMethod >", value, "testmethod");
            return (Criteria) this;
        }

        public Criteria andTestmethodGreaterThanOrEqualTo(String value) {
            addCriterion("testMethod >=", value, "testmethod");
            return (Criteria) this;
        }

        public Criteria andTestmethodLessThan(String value) {
            addCriterion("testMethod <", value, "testmethod");
            return (Criteria) this;
        }

        public Criteria andTestmethodLessThanOrEqualTo(String value) {
            addCriterion("testMethod <=", value, "testmethod");
            return (Criteria) this;
        }

        public Criteria andTestmethodLike(String value) {
            addCriterion("testMethod like", value, "testmethod");
            return (Criteria) this;
        }

        public Criteria andTestmethodNotLike(String value) {
            addCriterion("testMethod not like", value, "testmethod");
            return (Criteria) this;
        }

        public Criteria andTestmethodIn(List<String> values) {
            addCriterion("testMethod in", values, "testmethod");
            return (Criteria) this;
        }

        public Criteria andTestmethodNotIn(List<String> values) {
            addCriterion("testMethod not in", values, "testmethod");
            return (Criteria) this;
        }

        public Criteria andTestmethodBetween(String value1, String value2) {
            addCriterion("testMethod between", value1, value2, "testmethod");
            return (Criteria) this;
        }

        public Criteria andTestmethodNotBetween(String value1, String value2) {
            addCriterion("testMethod not between", value1, value2, "testmethod");
            return (Criteria) this;
        }

        public Criteria andWeekperiodIsNull() {
            addCriterion("weekPeriod is null");
            return (Criteria) this;
        }

        public Criteria andWeekperiodIsNotNull() {
            addCriterion("weekPeriod is not null");
            return (Criteria) this;
        }

        public Criteria andWeekperiodEqualTo(String value) {
            addCriterion("weekPeriod =", value, "weekperiod");
            return (Criteria) this;
        }

        public Criteria andWeekperiodNotEqualTo(String value) {
            addCriterion("weekPeriod <>", value, "weekperiod");
            return (Criteria) this;
        }

        public Criteria andWeekperiodGreaterThan(String value) {
            addCriterion("weekPeriod >", value, "weekperiod");
            return (Criteria) this;
        }

        public Criteria andWeekperiodGreaterThanOrEqualTo(String value) {
            addCriterion("weekPeriod >=", value, "weekperiod");
            return (Criteria) this;
        }

        public Criteria andWeekperiodLessThan(String value) {
            addCriterion("weekPeriod <", value, "weekperiod");
            return (Criteria) this;
        }

        public Criteria andWeekperiodLessThanOrEqualTo(String value) {
            addCriterion("weekPeriod <=", value, "weekperiod");
            return (Criteria) this;
        }

        public Criteria andWeekperiodLike(String value) {
            addCriterion("weekPeriod like", value, "weekperiod");
            return (Criteria) this;
        }

        public Criteria andWeekperiodNotLike(String value) {
            addCriterion("weekPeriod not like", value, "weekperiod");
            return (Criteria) this;
        }

        public Criteria andWeekperiodIn(List<String> values) {
            addCriterion("weekPeriod in", values, "weekperiod");
            return (Criteria) this;
        }

        public Criteria andWeekperiodNotIn(List<String> values) {
            addCriterion("weekPeriod not in", values, "weekperiod");
            return (Criteria) this;
        }

        public Criteria andWeekperiodBetween(String value1, String value2) {
            addCriterion("weekPeriod between", value1, value2, "weekperiod");
            return (Criteria) this;
        }

        public Criteria andWeekperiodNotBetween(String value1, String value2) {
            addCriterion("weekPeriod not between", value1, value2, "weekperiod");
            return (Criteria) this;
        }

        public Criteria andPeriodtotalIsNull() {
            addCriterion("periodTotal is null");
            return (Criteria) this;
        }

        public Criteria andPeriodtotalIsNotNull() {
            addCriterion("periodTotal is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodtotalEqualTo(String value) {
            addCriterion("periodTotal =", value, "periodtotal");
            return (Criteria) this;
        }

        public Criteria andPeriodtotalNotEqualTo(String value) {
            addCriterion("periodTotal <>", value, "periodtotal");
            return (Criteria) this;
        }

        public Criteria andPeriodtotalGreaterThan(String value) {
            addCriterion("periodTotal >", value, "periodtotal");
            return (Criteria) this;
        }

        public Criteria andPeriodtotalGreaterThanOrEqualTo(String value) {
            addCriterion("periodTotal >=", value, "periodtotal");
            return (Criteria) this;
        }

        public Criteria andPeriodtotalLessThan(String value) {
            addCriterion("periodTotal <", value, "periodtotal");
            return (Criteria) this;
        }

        public Criteria andPeriodtotalLessThanOrEqualTo(String value) {
            addCriterion("periodTotal <=", value, "periodtotal");
            return (Criteria) this;
        }

        public Criteria andPeriodtotalLike(String value) {
            addCriterion("periodTotal like", value, "periodtotal");
            return (Criteria) this;
        }

        public Criteria andPeriodtotalNotLike(String value) {
            addCriterion("periodTotal not like", value, "periodtotal");
            return (Criteria) this;
        }

        public Criteria andPeriodtotalIn(List<String> values) {
            addCriterion("periodTotal in", values, "periodtotal");
            return (Criteria) this;
        }

        public Criteria andPeriodtotalNotIn(List<String> values) {
            addCriterion("periodTotal not in", values, "periodtotal");
            return (Criteria) this;
        }

        public Criteria andPeriodtotalBetween(String value1, String value2) {
            addCriterion("periodTotal between", value1, value2, "periodtotal");
            return (Criteria) this;
        }

        public Criteria andPeriodtotalNotBetween(String value1, String value2) {
            addCriterion("periodTotal not between", value1, value2, "periodtotal");
            return (Criteria) this;
        }

        public Criteria andStart2stopweekIsNull() {
            addCriterion("start2stopWeek is null");
            return (Criteria) this;
        }

        public Criteria andStart2stopweekIsNotNull() {
            addCriterion("start2stopWeek is not null");
            return (Criteria) this;
        }

        public Criteria andStart2stopweekEqualTo(String value) {
            addCriterion("start2stopWeek =", value, "start2stopweek");
            return (Criteria) this;
        }

        public Criteria andStart2stopweekNotEqualTo(String value) {
            addCriterion("start2stopWeek <>", value, "start2stopweek");
            return (Criteria) this;
        }

        public Criteria andStart2stopweekGreaterThan(String value) {
            addCriterion("start2stopWeek >", value, "start2stopweek");
            return (Criteria) this;
        }

        public Criteria andStart2stopweekGreaterThanOrEqualTo(String value) {
            addCriterion("start2stopWeek >=", value, "start2stopweek");
            return (Criteria) this;
        }

        public Criteria andStart2stopweekLessThan(String value) {
            addCriterion("start2stopWeek <", value, "start2stopweek");
            return (Criteria) this;
        }

        public Criteria andStart2stopweekLessThanOrEqualTo(String value) {
            addCriterion("start2stopWeek <=", value, "start2stopweek");
            return (Criteria) this;
        }

        public Criteria andStart2stopweekLike(String value) {
            addCriterion("start2stopWeek like", value, "start2stopweek");
            return (Criteria) this;
        }

        public Criteria andStart2stopweekNotLike(String value) {
            addCriterion("start2stopWeek not like", value, "start2stopweek");
            return (Criteria) this;
        }

        public Criteria andStart2stopweekIn(List<String> values) {
            addCriterion("start2stopWeek in", values, "start2stopweek");
            return (Criteria) this;
        }

        public Criteria andStart2stopweekNotIn(List<String> values) {
            addCriterion("start2stopWeek not in", values, "start2stopweek");
            return (Criteria) this;
        }

        public Criteria andStart2stopweekBetween(String value1, String value2) {
            addCriterion("start2stopWeek between", value1, value2, "start2stopweek");
            return (Criteria) this;
        }

        public Criteria andStart2stopweekNotBetween(String value1, String value2) {
            addCriterion("start2stopWeek not between", value1, value2, "start2stopweek");
            return (Criteria) this;
        }

        public Criteria andCoursehourIsNull() {
            addCriterion("courseHour is null");
            return (Criteria) this;
        }

        public Criteria andCoursehourIsNotNull() {
            addCriterion("courseHour is not null");
            return (Criteria) this;
        }

        public Criteria andCoursehourEqualTo(String value) {
            addCriterion("courseHour =", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourNotEqualTo(String value) {
            addCriterion("courseHour <>", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourGreaterThan(String value) {
            addCriterion("courseHour >", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourGreaterThanOrEqualTo(String value) {
            addCriterion("courseHour >=", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourLessThan(String value) {
            addCriterion("courseHour <", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourLessThanOrEqualTo(String value) {
            addCriterion("courseHour <=", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourLike(String value) {
            addCriterion("courseHour like", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourNotLike(String value) {
            addCriterion("courseHour not like", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourIn(List<String> values) {
            addCriterion("courseHour in", values, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourNotIn(List<String> values) {
            addCriterion("courseHour not in", values, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourBetween(String value1, String value2) {
            addCriterion("courseHour between", value1, value2, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourNotBetween(String value1, String value2) {
            addCriterion("courseHour not between", value1, value2, "coursehour");
            return (Criteria) this;
        }

        public Criteria andPracticeIsNull() {
            addCriterion("practice is null");
            return (Criteria) this;
        }

        public Criteria andPracticeIsNotNull() {
            addCriterion("practice is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeEqualTo(String value) {
            addCriterion("practice =", value, "practice");
            return (Criteria) this;
        }

        public Criteria andPracticeNotEqualTo(String value) {
            addCriterion("practice <>", value, "practice");
            return (Criteria) this;
        }

        public Criteria andPracticeGreaterThan(String value) {
            addCriterion("practice >", value, "practice");
            return (Criteria) this;
        }

        public Criteria andPracticeGreaterThanOrEqualTo(String value) {
            addCriterion("practice >=", value, "practice");
            return (Criteria) this;
        }

        public Criteria andPracticeLessThan(String value) {
            addCriterion("practice <", value, "practice");
            return (Criteria) this;
        }

        public Criteria andPracticeLessThanOrEqualTo(String value) {
            addCriterion("practice <=", value, "practice");
            return (Criteria) this;
        }

        public Criteria andPracticeLike(String value) {
            addCriterion("practice like", value, "practice");
            return (Criteria) this;
        }

        public Criteria andPracticeNotLike(String value) {
            addCriterion("practice not like", value, "practice");
            return (Criteria) this;
        }

        public Criteria andPracticeIn(List<String> values) {
            addCriterion("practice in", values, "practice");
            return (Criteria) this;
        }

        public Criteria andPracticeNotIn(List<String> values) {
            addCriterion("practice not in", values, "practice");
            return (Criteria) this;
        }

        public Criteria andPracticeBetween(String value1, String value2) {
            addCriterion("practice between", value1, value2, "practice");
            return (Criteria) this;
        }

        public Criteria andPracticeNotBetween(String value1, String value2) {
            addCriterion("practice not between", value1, value2, "practice");
            return (Criteria) this;
        }

        public Criteria andCoursecharacterIsNull() {
            addCriterion("courseCharacter is null");
            return (Criteria) this;
        }

        public Criteria andCoursecharacterIsNotNull() {
            addCriterion("courseCharacter is not null");
            return (Criteria) this;
        }

        public Criteria andCoursecharacterEqualTo(String value) {
            addCriterion("courseCharacter =", value, "coursecharacter");
            return (Criteria) this;
        }

        public Criteria andCoursecharacterNotEqualTo(String value) {
            addCriterion("courseCharacter <>", value, "coursecharacter");
            return (Criteria) this;
        }

        public Criteria andCoursecharacterGreaterThan(String value) {
            addCriterion("courseCharacter >", value, "coursecharacter");
            return (Criteria) this;
        }

        public Criteria andCoursecharacterGreaterThanOrEqualTo(String value) {
            addCriterion("courseCharacter >=", value, "coursecharacter");
            return (Criteria) this;
        }

        public Criteria andCoursecharacterLessThan(String value) {
            addCriterion("courseCharacter <", value, "coursecharacter");
            return (Criteria) this;
        }

        public Criteria andCoursecharacterLessThanOrEqualTo(String value) {
            addCriterion("courseCharacter <=", value, "coursecharacter");
            return (Criteria) this;
        }

        public Criteria andCoursecharacterLike(String value) {
            addCriterion("courseCharacter like", value, "coursecharacter");
            return (Criteria) this;
        }

        public Criteria andCoursecharacterNotLike(String value) {
            addCriterion("courseCharacter not like", value, "coursecharacter");
            return (Criteria) this;
        }

        public Criteria andCoursecharacterIn(List<String> values) {
            addCriterion("courseCharacter in", values, "coursecharacter");
            return (Criteria) this;
        }

        public Criteria andCoursecharacterNotIn(List<String> values) {
            addCriterion("courseCharacter not in", values, "coursecharacter");
            return (Criteria) this;
        }

        public Criteria andCoursecharacterBetween(String value1, String value2) {
            addCriterion("courseCharacter between", value1, value2, "coursecharacter");
            return (Criteria) this;
        }

        public Criteria andCoursecharacterNotBetween(String value1, String value2) {
            addCriterion("courseCharacter not between", value1, value2, "coursecharacter");
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