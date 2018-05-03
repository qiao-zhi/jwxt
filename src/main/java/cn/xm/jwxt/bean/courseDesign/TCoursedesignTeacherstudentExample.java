package cn.xm.jwxt.bean.courseDesign;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCoursedesignTeacherstudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCoursedesignTeacherstudentExample() {
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

        public Criteria andCoursedesignteacherstudentidIsNull() {
            addCriterion("courseDesignTeacherStudentID is null");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherstudentidIsNotNull() {
            addCriterion("courseDesignTeacherStudentID is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherstudentidEqualTo(String value) {
            addCriterion("courseDesignTeacherStudentID =", value, "coursedesignteacherstudentid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherstudentidNotEqualTo(String value) {
            addCriterion("courseDesignTeacherStudentID <>", value, "coursedesignteacherstudentid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherstudentidGreaterThan(String value) {
            addCriterion("courseDesignTeacherStudentID >", value, "coursedesignteacherstudentid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherstudentidGreaterThanOrEqualTo(String value) {
            addCriterion("courseDesignTeacherStudentID >=", value, "coursedesignteacherstudentid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherstudentidLessThan(String value) {
            addCriterion("courseDesignTeacherStudentID <", value, "coursedesignteacherstudentid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherstudentidLessThanOrEqualTo(String value) {
            addCriterion("courseDesignTeacherStudentID <=", value, "coursedesignteacherstudentid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherstudentidLike(String value) {
            addCriterion("courseDesignTeacherStudentID like", value, "coursedesignteacherstudentid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherstudentidNotLike(String value) {
            addCriterion("courseDesignTeacherStudentID not like", value, "coursedesignteacherstudentid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherstudentidIn(List<String> values) {
            addCriterion("courseDesignTeacherStudentID in", values, "coursedesignteacherstudentid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherstudentidNotIn(List<String> values) {
            addCriterion("courseDesignTeacherStudentID not in", values, "coursedesignteacherstudentid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherstudentidBetween(String value1, String value2) {
            addCriterion("courseDesignTeacherStudentID between", value1, value2, "coursedesignteacherstudentid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignteacherstudentidNotBetween(String value1, String value2) {
            addCriterion("courseDesignTeacherStudentID not between", value1, value2, "coursedesignteacherstudentid");
            return (Criteria) this;
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

        public Criteria andStudentidIsNull() {
            addCriterion("studentID is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("studentID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(String value) {
            addCriterion("studentID =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(String value) {
            addCriterion("studentID <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(String value) {
            addCriterion("studentID >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(String value) {
            addCriterion("studentID >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(String value) {
            addCriterion("studentID <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(String value) {
            addCriterion("studentID <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLike(String value) {
            addCriterion("studentID like", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotLike(String value) {
            addCriterion("studentID not like", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<String> values) {
            addCriterion("studentID in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<String> values) {
            addCriterion("studentID not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(String value1, String value2) {
            addCriterion("studentID between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(String value1, String value2) {
            addCriterion("studentID not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangenumIsNull() {
            addCriterion("courseDesignArrangeNum is null");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangenumIsNotNull() {
            addCriterion("courseDesignArrangeNum is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangenumEqualTo(String value) {
            addCriterion("courseDesignArrangeNum =", value, "coursedesignarrangenum");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangenumNotEqualTo(String value) {
            addCriterion("courseDesignArrangeNum <>", value, "coursedesignarrangenum");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangenumGreaterThan(String value) {
            addCriterion("courseDesignArrangeNum >", value, "coursedesignarrangenum");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangenumGreaterThanOrEqualTo(String value) {
            addCriterion("courseDesignArrangeNum >=", value, "coursedesignarrangenum");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangenumLessThan(String value) {
            addCriterion("courseDesignArrangeNum <", value, "coursedesignarrangenum");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangenumLessThanOrEqualTo(String value) {
            addCriterion("courseDesignArrangeNum <=", value, "coursedesignarrangenum");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangenumLike(String value) {
            addCriterion("courseDesignArrangeNum like", value, "coursedesignarrangenum");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangenumNotLike(String value) {
            addCriterion("courseDesignArrangeNum not like", value, "coursedesignarrangenum");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangenumIn(List<String> values) {
            addCriterion("courseDesignArrangeNum in", values, "coursedesignarrangenum");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangenumNotIn(List<String> values) {
            addCriterion("courseDesignArrangeNum not in", values, "coursedesignarrangenum");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangenumBetween(String value1, String value2) {
            addCriterion("courseDesignArrangeNum between", value1, value2, "coursedesignarrangenum");
            return (Criteria) this;
        }

        public Criteria andCoursedesignarrangenumNotBetween(String value1, String value2) {
            addCriterion("courseDesignArrangeNum not between", value1, value2, "coursedesignarrangenum");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportnameIsNull() {
            addCriterion("courseDesignReportName is null");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportnameIsNotNull() {
            addCriterion("courseDesignReportName is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportnameEqualTo(String value) {
            addCriterion("courseDesignReportName =", value, "coursedesignreportname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportnameNotEqualTo(String value) {
            addCriterion("courseDesignReportName <>", value, "coursedesignreportname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportnameGreaterThan(String value) {
            addCriterion("courseDesignReportName >", value, "coursedesignreportname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportnameGreaterThanOrEqualTo(String value) {
            addCriterion("courseDesignReportName >=", value, "coursedesignreportname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportnameLessThan(String value) {
            addCriterion("courseDesignReportName <", value, "coursedesignreportname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportnameLessThanOrEqualTo(String value) {
            addCriterion("courseDesignReportName <=", value, "coursedesignreportname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportnameLike(String value) {
            addCriterion("courseDesignReportName like", value, "coursedesignreportname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportnameNotLike(String value) {
            addCriterion("courseDesignReportName not like", value, "coursedesignreportname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportnameIn(List<String> values) {
            addCriterion("courseDesignReportName in", values, "coursedesignreportname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportnameNotIn(List<String> values) {
            addCriterion("courseDesignReportName not in", values, "coursedesignreportname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportnameBetween(String value1, String value2) {
            addCriterion("courseDesignReportName between", value1, value2, "coursedesignreportname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportnameNotBetween(String value1, String value2) {
            addCriterion("courseDesignReportName not between", value1, value2, "coursedesignreportname");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportstoreIsNull() {
            addCriterion("courseDesignReportStore is null");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportstoreIsNotNull() {
            addCriterion("courseDesignReportStore is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportstoreEqualTo(String value) {
            addCriterion("courseDesignReportStore =", value, "coursedesignreportstore");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportstoreNotEqualTo(String value) {
            addCriterion("courseDesignReportStore <>", value, "coursedesignreportstore");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportstoreGreaterThan(String value) {
            addCriterion("courseDesignReportStore >", value, "coursedesignreportstore");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportstoreGreaterThanOrEqualTo(String value) {
            addCriterion("courseDesignReportStore >=", value, "coursedesignreportstore");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportstoreLessThan(String value) {
            addCriterion("courseDesignReportStore <", value, "coursedesignreportstore");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportstoreLessThanOrEqualTo(String value) {
            addCriterion("courseDesignReportStore <=", value, "coursedesignreportstore");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportstoreLike(String value) {
            addCriterion("courseDesignReportStore like", value, "coursedesignreportstore");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportstoreNotLike(String value) {
            addCriterion("courseDesignReportStore not like", value, "coursedesignreportstore");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportstoreIn(List<String> values) {
            addCriterion("courseDesignReportStore in", values, "coursedesignreportstore");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportstoreNotIn(List<String> values) {
            addCriterion("courseDesignReportStore not in", values, "coursedesignreportstore");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportstoreBetween(String value1, String value2) {
            addCriterion("courseDesignReportStore between", value1, value2, "coursedesignreportstore");
            return (Criteria) this;
        }

        public Criteria andCoursedesignreportstoreNotBetween(String value1, String value2) {
            addCriterion("courseDesignReportStore not between", value1, value2, "coursedesignreportstore");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNull() {
            addCriterion("uploadTime is null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNotNull() {
            addCriterion("uploadTime is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeEqualTo(Date value) {
            addCriterion("uploadTime =", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotEqualTo(Date value) {
            addCriterion("uploadTime <>", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThan(Date value) {
            addCriterion("uploadTime >", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uploadTime >=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThan(Date value) {
            addCriterion("uploadTime <", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThanOrEqualTo(Date value) {
            addCriterion("uploadTime <=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIn(List<Date> values) {
            addCriterion("uploadTime in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotIn(List<Date> values) {
            addCriterion("uploadTime not in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeBetween(Date value1, Date value2) {
            addCriterion("uploadTime between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotBetween(Date value1, Date value2) {
            addCriterion("uploadTime not between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadstatusIsNull() {
            addCriterion("uploadStatus is null");
            return (Criteria) this;
        }

        public Criteria andUploadstatusIsNotNull() {
            addCriterion("uploadStatus is not null");
            return (Criteria) this;
        }

        public Criteria andUploadstatusEqualTo(String value) {
            addCriterion("uploadStatus =", value, "uploadstatus");
            return (Criteria) this;
        }

        public Criteria andUploadstatusNotEqualTo(String value) {
            addCriterion("uploadStatus <>", value, "uploadstatus");
            return (Criteria) this;
        }

        public Criteria andUploadstatusGreaterThan(String value) {
            addCriterion("uploadStatus >", value, "uploadstatus");
            return (Criteria) this;
        }

        public Criteria andUploadstatusGreaterThanOrEqualTo(String value) {
            addCriterion("uploadStatus >=", value, "uploadstatus");
            return (Criteria) this;
        }

        public Criteria andUploadstatusLessThan(String value) {
            addCriterion("uploadStatus <", value, "uploadstatus");
            return (Criteria) this;
        }

        public Criteria andUploadstatusLessThanOrEqualTo(String value) {
            addCriterion("uploadStatus <=", value, "uploadstatus");
            return (Criteria) this;
        }

        public Criteria andUploadstatusLike(String value) {
            addCriterion("uploadStatus like", value, "uploadstatus");
            return (Criteria) this;
        }

        public Criteria andUploadstatusNotLike(String value) {
            addCriterion("uploadStatus not like", value, "uploadstatus");
            return (Criteria) this;
        }

        public Criteria andUploadstatusIn(List<String> values) {
            addCriterion("uploadStatus in", values, "uploadstatus");
            return (Criteria) this;
        }

        public Criteria andUploadstatusNotIn(List<String> values) {
            addCriterion("uploadStatus not in", values, "uploadstatus");
            return (Criteria) this;
        }

        public Criteria andUploadstatusBetween(String value1, String value2) {
            addCriterion("uploadStatus between", value1, value2, "uploadstatus");
            return (Criteria) this;
        }

        public Criteria andUploadstatusNotBetween(String value1, String value2) {
            addCriterion("uploadStatus not between", value1, value2, "uploadstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNull() {
            addCriterion("checkStatus is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNotNull() {
            addCriterion("checkStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusEqualTo(String value) {
            addCriterion("checkStatus =", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotEqualTo(String value) {
            addCriterion("checkStatus <>", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThan(String value) {
            addCriterion("checkStatus >", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThanOrEqualTo(String value) {
            addCriterion("checkStatus >=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThan(String value) {
            addCriterion("checkStatus <", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThanOrEqualTo(String value) {
            addCriterion("checkStatus <=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLike(String value) {
            addCriterion("checkStatus like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotLike(String value) {
            addCriterion("checkStatus not like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIn(List<String> values) {
            addCriterion("checkStatus in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotIn(List<String> values) {
            addCriterion("checkStatus not in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusBetween(String value1, String value2) {
            addCriterion("checkStatus between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotBetween(String value1, String value2) {
            addCriterion("checkStatus not between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckadviceIsNull() {
            addCriterion("checkAdvice is null");
            return (Criteria) this;
        }

        public Criteria andCheckadviceIsNotNull() {
            addCriterion("checkAdvice is not null");
            return (Criteria) this;
        }

        public Criteria andCheckadviceEqualTo(String value) {
            addCriterion("checkAdvice =", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceNotEqualTo(String value) {
            addCriterion("checkAdvice <>", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceGreaterThan(String value) {
            addCriterion("checkAdvice >", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceGreaterThanOrEqualTo(String value) {
            addCriterion("checkAdvice >=", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceLessThan(String value) {
            addCriterion("checkAdvice <", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceLessThanOrEqualTo(String value) {
            addCriterion("checkAdvice <=", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceLike(String value) {
            addCriterion("checkAdvice like", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceNotLike(String value) {
            addCriterion("checkAdvice not like", value, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceIn(List<String> values) {
            addCriterion("checkAdvice in", values, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceNotIn(List<String> values) {
            addCriterion("checkAdvice not in", values, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceBetween(String value1, String value2) {
            addCriterion("checkAdvice between", value1, value2, "checkadvice");
            return (Criteria) this;
        }

        public Criteria andCheckadviceNotBetween(String value1, String value2) {
            addCriterion("checkAdvice not between", value1, value2, "checkadvice");
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