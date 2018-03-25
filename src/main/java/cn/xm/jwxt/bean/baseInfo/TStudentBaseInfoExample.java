package cn.xm.jwxt.bean.baseInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TStudentBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStudentBaseInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andStudentnumIsNull() {
            addCriterion("studentNum is null");
            return (Criteria) this;
        }

        public Criteria andStudentnumIsNotNull() {
            addCriterion("studentNum is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnumEqualTo(String value) {
            addCriterion("studentNum =", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotEqualTo(String value) {
            addCriterion("studentNum <>", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumGreaterThan(String value) {
            addCriterion("studentNum >", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumGreaterThanOrEqualTo(String value) {
            addCriterion("studentNum >=", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLessThan(String value) {
            addCriterion("studentNum <", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLessThanOrEqualTo(String value) {
            addCriterion("studentNum <=", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLike(String value) {
            addCriterion("studentNum like", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotLike(String value) {
            addCriterion("studentNum not like", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumIn(List<String> values) {
            addCriterion("studentNum in", values, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotIn(List<String> values) {
            addCriterion("studentNum not in", values, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumBetween(String value1, String value2) {
            addCriterion("studentNum between", value1, value2, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotBetween(String value1, String value2) {
            addCriterion("studentNum not between", value1, value2, "studentnum");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("classID is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classID is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(String value) {
            addCriterion("classID =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(String value) {
            addCriterion("classID <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(String value) {
            addCriterion("classID >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(String value) {
            addCriterion("classID >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(String value) {
            addCriterion("classID <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(String value) {
            addCriterion("classID <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLike(String value) {
            addCriterion("classID like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotLike(String value) {
            addCriterion("classID not like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<String> values) {
            addCriterion("classID in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<String> values) {
            addCriterion("classID not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(String value1, String value2) {
            addCriterion("classID between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(String value1, String value2) {
            addCriterion("classID not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNull() {
            addCriterion("studentName is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNotNull() {
            addCriterion("studentName is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameEqualTo(String value) {
            addCriterion("studentName =", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotEqualTo(String value) {
            addCriterion("studentName <>", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThan(String value) {
            addCriterion("studentName >", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("studentName >=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThan(String value) {
            addCriterion("studentName <", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThanOrEqualTo(String value) {
            addCriterion("studentName <=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLike(String value) {
            addCriterion("studentName like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotLike(String value) {
            addCriterion("studentName not like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameIn(List<String> values) {
            addCriterion("studentName in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotIn(List<String> values) {
            addCriterion("studentName not in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameBetween(String value1, String value2) {
            addCriterion("studentName between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotBetween(String value1, String value2) {
            addCriterion("studentName not between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentsexIsNull() {
            addCriterion("studentSex is null");
            return (Criteria) this;
        }

        public Criteria andStudentsexIsNotNull() {
            addCriterion("studentSex is not null");
            return (Criteria) this;
        }

        public Criteria andStudentsexEqualTo(String value) {
            addCriterion("studentSex =", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexNotEqualTo(String value) {
            addCriterion("studentSex <>", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexGreaterThan(String value) {
            addCriterion("studentSex >", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexGreaterThanOrEqualTo(String value) {
            addCriterion("studentSex >=", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexLessThan(String value) {
            addCriterion("studentSex <", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexLessThanOrEqualTo(String value) {
            addCriterion("studentSex <=", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexLike(String value) {
            addCriterion("studentSex like", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexNotLike(String value) {
            addCriterion("studentSex not like", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexIn(List<String> values) {
            addCriterion("studentSex in", values, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexNotIn(List<String> values) {
            addCriterion("studentSex not in", values, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexBetween(String value1, String value2) {
            addCriterion("studentSex between", value1, value2, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexNotBetween(String value1, String value2) {
            addCriterion("studentSex not between", value1, value2, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentbirthIsNull() {
            addCriterion("studentBirth is null");
            return (Criteria) this;
        }

        public Criteria andStudentbirthIsNotNull() {
            addCriterion("studentBirth is not null");
            return (Criteria) this;
        }

        public Criteria andStudentbirthEqualTo(Date value) {
            addCriterionForJDBCDate("studentBirth =", value, "studentbirth");
            return (Criteria) this;
        }

        public Criteria andStudentbirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("studentBirth <>", value, "studentbirth");
            return (Criteria) this;
        }

        public Criteria andStudentbirthGreaterThan(Date value) {
            addCriterionForJDBCDate("studentBirth >", value, "studentbirth");
            return (Criteria) this;
        }

        public Criteria andStudentbirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("studentBirth >=", value, "studentbirth");
            return (Criteria) this;
        }

        public Criteria andStudentbirthLessThan(Date value) {
            addCriterionForJDBCDate("studentBirth <", value, "studentbirth");
            return (Criteria) this;
        }

        public Criteria andStudentbirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("studentBirth <=", value, "studentbirth");
            return (Criteria) this;
        }

        public Criteria andStudentbirthIn(List<Date> values) {
            addCriterionForJDBCDate("studentBirth in", values, "studentbirth");
            return (Criteria) this;
        }

        public Criteria andStudentbirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("studentBirth not in", values, "studentbirth");
            return (Criteria) this;
        }

        public Criteria andStudentbirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("studentBirth between", value1, value2, "studentbirth");
            return (Criteria) this;
        }

        public Criteria andStudentbirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("studentBirth not between", value1, value2, "studentbirth");
            return (Criteria) this;
        }

        public Criteria andStudentphotoIsNull() {
            addCriterion("studentPhoto is null");
            return (Criteria) this;
        }

        public Criteria andStudentphotoIsNotNull() {
            addCriterion("studentPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andStudentphotoEqualTo(String value) {
            addCriterion("studentPhoto =", value, "studentphoto");
            return (Criteria) this;
        }

        public Criteria andStudentphotoNotEqualTo(String value) {
            addCriterion("studentPhoto <>", value, "studentphoto");
            return (Criteria) this;
        }

        public Criteria andStudentphotoGreaterThan(String value) {
            addCriterion("studentPhoto >", value, "studentphoto");
            return (Criteria) this;
        }

        public Criteria andStudentphotoGreaterThanOrEqualTo(String value) {
            addCriterion("studentPhoto >=", value, "studentphoto");
            return (Criteria) this;
        }

        public Criteria andStudentphotoLessThan(String value) {
            addCriterion("studentPhoto <", value, "studentphoto");
            return (Criteria) this;
        }

        public Criteria andStudentphotoLessThanOrEqualTo(String value) {
            addCriterion("studentPhoto <=", value, "studentphoto");
            return (Criteria) this;
        }

        public Criteria andStudentphotoLike(String value) {
            addCriterion("studentPhoto like", value, "studentphoto");
            return (Criteria) this;
        }

        public Criteria andStudentphotoNotLike(String value) {
            addCriterion("studentPhoto not like", value, "studentphoto");
            return (Criteria) this;
        }

        public Criteria andStudentphotoIn(List<String> values) {
            addCriterion("studentPhoto in", values, "studentphoto");
            return (Criteria) this;
        }

        public Criteria andStudentphotoNotIn(List<String> values) {
            addCriterion("studentPhoto not in", values, "studentphoto");
            return (Criteria) this;
        }

        public Criteria andStudentphotoBetween(String value1, String value2) {
            addCriterion("studentPhoto between", value1, value2, "studentphoto");
            return (Criteria) this;
        }

        public Criteria andStudentphotoNotBetween(String value1, String value2) {
            addCriterion("studentPhoto not between", value1, value2, "studentphoto");
            return (Criteria) this;
        }

        public Criteria andIdnumIsNull() {
            addCriterion("IDnum is null");
            return (Criteria) this;
        }

        public Criteria andIdnumIsNotNull() {
            addCriterion("IDnum is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumEqualTo(String value) {
            addCriterion("IDnum =", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumNotEqualTo(String value) {
            addCriterion("IDnum <>", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumGreaterThan(String value) {
            addCriterion("IDnum >", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumGreaterThanOrEqualTo(String value) {
            addCriterion("IDnum >=", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumLessThan(String value) {
            addCriterion("IDnum <", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumLessThanOrEqualTo(String value) {
            addCriterion("IDnum <=", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumLike(String value) {
            addCriterion("IDnum like", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumNotLike(String value) {
            addCriterion("IDnum not like", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumIn(List<String> values) {
            addCriterion("IDnum in", values, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumNotIn(List<String> values) {
            addCriterion("IDnum not in", values, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumBetween(String value1, String value2) {
            addCriterion("IDnum between", value1, value2, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumNotBetween(String value1, String value2) {
            addCriterion("IDnum not between", value1, value2, "idnum");
            return (Criteria) this;
        }

        public Criteria andEnrollmenttimeIsNull() {
            addCriterion("enrollmentTime is null");
            return (Criteria) this;
        }

        public Criteria andEnrollmenttimeIsNotNull() {
            addCriterion("enrollmentTime is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollmenttimeEqualTo(Date value) {
            addCriterionForJDBCDate("enrollmentTime =", value, "enrollmenttime");
            return (Criteria) this;
        }

        public Criteria andEnrollmenttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("enrollmentTime <>", value, "enrollmenttime");
            return (Criteria) this;
        }

        public Criteria andEnrollmenttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("enrollmentTime >", value, "enrollmenttime");
            return (Criteria) this;
        }

        public Criteria andEnrollmenttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enrollmentTime >=", value, "enrollmenttime");
            return (Criteria) this;
        }

        public Criteria andEnrollmenttimeLessThan(Date value) {
            addCriterionForJDBCDate("enrollmentTime <", value, "enrollmenttime");
            return (Criteria) this;
        }

        public Criteria andEnrollmenttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enrollmentTime <=", value, "enrollmenttime");
            return (Criteria) this;
        }

        public Criteria andEnrollmenttimeIn(List<Date> values) {
            addCriterionForJDBCDate("enrollmentTime in", values, "enrollmenttime");
            return (Criteria) this;
        }

        public Criteria andEnrollmenttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("enrollmentTime not in", values, "enrollmenttime");
            return (Criteria) this;
        }

        public Criteria andEnrollmenttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enrollmentTime between", value1, value2, "enrollmenttime");
            return (Criteria) this;
        }

        public Criteria andEnrollmenttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enrollmentTime not between", value1, value2, "enrollmenttime");
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

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andIsgraduateIsNull() {
            addCriterion("isGraduate is null");
            return (Criteria) this;
        }

        public Criteria andIsgraduateIsNotNull() {
            addCriterion("isGraduate is not null");
            return (Criteria) this;
        }

        public Criteria andIsgraduateEqualTo(String value) {
            addCriterion("isGraduate =", value, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateNotEqualTo(String value) {
            addCriterion("isGraduate <>", value, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateGreaterThan(String value) {
            addCriterion("isGraduate >", value, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateGreaterThanOrEqualTo(String value) {
            addCriterion("isGraduate >=", value, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateLessThan(String value) {
            addCriterion("isGraduate <", value, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateLessThanOrEqualTo(String value) {
            addCriterion("isGraduate <=", value, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateLike(String value) {
            addCriterion("isGraduate like", value, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateNotLike(String value) {
            addCriterion("isGraduate not like", value, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateIn(List<String> values) {
            addCriterion("isGraduate in", values, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateNotIn(List<String> values) {
            addCriterion("isGraduate not in", values, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateBetween(String value1, String value2) {
            addCriterion("isGraduate between", value1, value2, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsgraduateNotBetween(String value1, String value2) {
            addCriterion("isGraduate not between", value1, value2, "isgraduate");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(String value) {
            addCriterion("isDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(String value) {
            addCriterion("isDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(String value) {
            addCriterion("isDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(String value) {
            addCriterion("isDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(String value) {
            addCriterion("isDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(String value) {
            addCriterion("isDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLike(String value) {
            addCriterion("isDelete like", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotLike(String value) {
            addCriterion("isDelete not like", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<String> values) {
            addCriterion("isDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<String> values) {
            addCriterion("isDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(String value1, String value2) {
            addCriterion("isDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(String value1, String value2) {
            addCriterion("isDelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
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