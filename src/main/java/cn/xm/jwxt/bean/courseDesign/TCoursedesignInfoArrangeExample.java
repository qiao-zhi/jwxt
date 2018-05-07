package cn.xm.jwxt.bean.courseDesign;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCoursedesignInfoArrangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCoursedesignInfoArrangeExample() {
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

        public Criteria andTraincourseidIsNull() {
            addCriterion("trainCourseID is null");
            return (Criteria) this;
        }

        public Criteria andTraincourseidIsNotNull() {
            addCriterion("trainCourseID is not null");
            return (Criteria) this;
        }

        public Criteria andTraincourseidEqualTo(String value) {
            addCriterion("trainCourseID =", value, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidNotEqualTo(String value) {
            addCriterion("trainCourseID <>", value, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidGreaterThan(String value) {
            addCriterion("trainCourseID >", value, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidGreaterThanOrEqualTo(String value) {
            addCriterion("trainCourseID >=", value, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidLessThan(String value) {
            addCriterion("trainCourseID <", value, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidLessThanOrEqualTo(String value) {
            addCriterion("trainCourseID <=", value, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidLike(String value) {
            addCriterion("trainCourseID like", value, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidNotLike(String value) {
            addCriterion("trainCourseID not like", value, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidIn(List<String> values) {
            addCriterion("trainCourseID in", values, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidNotIn(List<String> values) {
            addCriterion("trainCourseID not in", values, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidBetween(String value1, String value2) {
            addCriterion("trainCourseID between", value1, value2, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andTraincourseidNotBetween(String value1, String value2) {
            addCriterion("trainCourseID not between", value1, value2, "traincourseid");
            return (Criteria) this;
        }

        public Criteria andMajoridIsNull() {
            addCriterion("majorID is null");
            return (Criteria) this;
        }

        public Criteria andMajoridIsNotNull() {
            addCriterion("majorID is not null");
            return (Criteria) this;
        }

        public Criteria andMajoridEqualTo(String value) {
            addCriterion("majorID =", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotEqualTo(String value) {
            addCriterion("majorID <>", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThan(String value) {
            addCriterion("majorID >", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThanOrEqualTo(String value) {
            addCriterion("majorID >=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThan(String value) {
            addCriterion("majorID <", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThanOrEqualTo(String value) {
            addCriterion("majorID <=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLike(String value) {
            addCriterion("majorID like", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotLike(String value) {
            addCriterion("majorID not like", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridIn(List<String> values) {
            addCriterion("majorID in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotIn(List<String> values) {
            addCriterion("majorID not in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridBetween(String value1, String value2) {
            addCriterion("majorID between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotBetween(String value1, String value2) {
            addCriterion("majorID not between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("startTime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("startTime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("endTime like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("endTime not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
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

        public Criteria andCoursearrangeinfoIsNull() {
            addCriterion("CourseArrangeInfo is null");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeinfoIsNotNull() {
            addCriterion("CourseArrangeInfo is not null");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeinfoEqualTo(String value) {
            addCriterion("CourseArrangeInfo =", value, "coursearrangeinfo");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeinfoNotEqualTo(String value) {
            addCriterion("CourseArrangeInfo <>", value, "coursearrangeinfo");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeinfoGreaterThan(String value) {
            addCriterion("CourseArrangeInfo >", value, "coursearrangeinfo");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeinfoGreaterThanOrEqualTo(String value) {
            addCriterion("CourseArrangeInfo >=", value, "coursearrangeinfo");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeinfoLessThan(String value) {
            addCriterion("CourseArrangeInfo <", value, "coursearrangeinfo");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeinfoLessThanOrEqualTo(String value) {
            addCriterion("CourseArrangeInfo <=", value, "coursearrangeinfo");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeinfoLike(String value) {
            addCriterion("CourseArrangeInfo like", value, "coursearrangeinfo");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeinfoNotLike(String value) {
            addCriterion("CourseArrangeInfo not like", value, "coursearrangeinfo");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeinfoIn(List<String> values) {
            addCriterion("CourseArrangeInfo in", values, "coursearrangeinfo");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeinfoNotIn(List<String> values) {
            addCriterion("CourseArrangeInfo not in", values, "coursearrangeinfo");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeinfoBetween(String value1, String value2) {
            addCriterion("CourseArrangeInfo between", value1, value2, "coursearrangeinfo");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeinfoNotBetween(String value1, String value2) {
            addCriterion("CourseArrangeInfo not between", value1, value2, "coursearrangeinfo");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeteacherIsNull() {
            addCriterion("CourseArrangeTeacher is null");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeteacherIsNotNull() {
            addCriterion("CourseArrangeTeacher is not null");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeteacherEqualTo(String value) {
            addCriterion("CourseArrangeTeacher =", value, "coursearrangeteacher");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeteacherNotEqualTo(String value) {
            addCriterion("CourseArrangeTeacher <>", value, "coursearrangeteacher");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeteacherGreaterThan(String value) {
            addCriterion("CourseArrangeTeacher >", value, "coursearrangeteacher");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeteacherGreaterThanOrEqualTo(String value) {
            addCriterion("CourseArrangeTeacher >=", value, "coursearrangeteacher");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeteacherLessThan(String value) {
            addCriterion("CourseArrangeTeacher <", value, "coursearrangeteacher");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeteacherLessThanOrEqualTo(String value) {
            addCriterion("CourseArrangeTeacher <=", value, "coursearrangeteacher");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeteacherLike(String value) {
            addCriterion("CourseArrangeTeacher like", value, "coursearrangeteacher");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeteacherNotLike(String value) {
            addCriterion("CourseArrangeTeacher not like", value, "coursearrangeteacher");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeteacherIn(List<String> values) {
            addCriterion("CourseArrangeTeacher in", values, "coursearrangeteacher");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeteacherNotIn(List<String> values) {
            addCriterion("CourseArrangeTeacher not in", values, "coursearrangeteacher");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeteacherBetween(String value1, String value2) {
            addCriterion("CourseArrangeTeacher between", value1, value2, "coursearrangeteacher");
            return (Criteria) this;
        }

        public Criteria andCoursearrangeteacherNotBetween(String value1, String value2) {
            addCriterion("CourseArrangeTeacher not between", value1, value2, "coursearrangeteacher");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeIsNull() {
            addCriterion("CourseArrangeTime is null");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeIsNotNull() {
            addCriterion("CourseArrangeTime is not null");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeEqualTo(Date value) {
            addCriterion("CourseArrangeTime =", value, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeNotEqualTo(Date value) {
            addCriterion("CourseArrangeTime <>", value, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeGreaterThan(Date value) {
            addCriterion("CourseArrangeTime >", value, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CourseArrangeTime >=", value, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeLessThan(Date value) {
            addCriterion("CourseArrangeTime <", value, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeLessThanOrEqualTo(Date value) {
            addCriterion("CourseArrangeTime <=", value, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeIn(List<Date> values) {
            addCriterion("CourseArrangeTime in", values, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeNotIn(List<Date> values) {
            addCriterion("CourseArrangeTime not in", values, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeBetween(Date value1, Date value2) {
            addCriterion("CourseArrangeTime between", value1, value2, "coursearrangetime");
            return (Criteria) this;
        }

        public Criteria andCoursearrangetimeNotBetween(Date value1, Date value2) {
            addCriterion("CourseArrangeTime not between", value1, value2, "coursearrangetime");
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

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
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