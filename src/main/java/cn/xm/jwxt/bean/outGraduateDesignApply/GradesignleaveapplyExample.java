package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GradesignleaveapplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradesignleaveapplyExample() {
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

        public Criteria andLeaveidIsNull() {
            addCriterion("leaveID is null");
            return (Criteria) this;
        }

        public Criteria andLeaveidIsNotNull() {
            addCriterion("leaveID is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveidEqualTo(String value) {
            addCriterion("leaveID =", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidNotEqualTo(String value) {
            addCriterion("leaveID <>", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidGreaterThan(String value) {
            addCriterion("leaveID >", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidGreaterThanOrEqualTo(String value) {
            addCriterion("leaveID >=", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidLessThan(String value) {
            addCriterion("leaveID <", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidLessThanOrEqualTo(String value) {
            addCriterion("leaveID <=", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidLike(String value) {
            addCriterion("leaveID like", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidNotLike(String value) {
            addCriterion("leaveID not like", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidIn(List<String> values) {
            addCriterion("leaveID in", values, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidNotIn(List<String> values) {
            addCriterion("leaveID not in", values, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidBetween(String value1, String value2) {
            addCriterion("leaveID between", value1, value2, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidNotBetween(String value1, String value2) {
            addCriterion("leaveID not between", value1, value2, "leaveid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidIsNull() {
            addCriterion("outsideApplyID is null");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidIsNotNull() {
            addCriterion("outsideApplyID is not null");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidEqualTo(String value) {
            addCriterion("outsideApplyID =", value, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidNotEqualTo(String value) {
            addCriterion("outsideApplyID <>", value, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidGreaterThan(String value) {
            addCriterion("outsideApplyID >", value, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidGreaterThanOrEqualTo(String value) {
            addCriterion("outsideApplyID >=", value, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidLessThan(String value) {
            addCriterion("outsideApplyID <", value, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidLessThanOrEqualTo(String value) {
            addCriterion("outsideApplyID <=", value, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidLike(String value) {
            addCriterion("outsideApplyID like", value, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidNotLike(String value) {
            addCriterion("outsideApplyID not like", value, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidIn(List<String> values) {
            addCriterion("outsideApplyID in", values, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidNotIn(List<String> values) {
            addCriterion("outsideApplyID not in", values, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidBetween(String value1, String value2) {
            addCriterion("outsideApplyID between", value1, value2, "outsideapplyid");
            return (Criteria) this;
        }

        public Criteria andOutsideapplyidNotBetween(String value1, String value2) {
            addCriterion("outsideApplyID not between", value1, value2, "outsideapplyid");
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

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startDate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("endDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("endDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("endDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("endDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("endDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("endDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("endDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("endDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("endDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("endDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("endDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("endDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andLeavedaysIsNull() {
            addCriterion("leaveDays is null");
            return (Criteria) this;
        }

        public Criteria andLeavedaysIsNotNull() {
            addCriterion("leaveDays is not null");
            return (Criteria) this;
        }

        public Criteria andLeavedaysEqualTo(Integer value) {
            addCriterion("leaveDays =", value, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysNotEqualTo(Integer value) {
            addCriterion("leaveDays <>", value, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysGreaterThan(Integer value) {
            addCriterion("leaveDays >", value, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("leaveDays >=", value, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysLessThan(Integer value) {
            addCriterion("leaveDays <", value, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysLessThanOrEqualTo(Integer value) {
            addCriterion("leaveDays <=", value, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysIn(List<Integer> values) {
            addCriterion("leaveDays in", values, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysNotIn(List<Integer> values) {
            addCriterion("leaveDays not in", values, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysBetween(Integer value1, Integer value2) {
            addCriterion("leaveDays between", value1, value2, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeavedaysNotBetween(Integer value1, Integer value2) {
            addCriterion("leaveDays not between", value1, value2, "leavedays");
            return (Criteria) this;
        }

        public Criteria andLeaveaddressIsNull() {
            addCriterion("leaveAddress is null");
            return (Criteria) this;
        }

        public Criteria andLeaveaddressIsNotNull() {
            addCriterion("leaveAddress is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveaddressEqualTo(String value) {
            addCriterion("leaveAddress =", value, "leaveaddress");
            return (Criteria) this;
        }

        public Criteria andLeaveaddressNotEqualTo(String value) {
            addCriterion("leaveAddress <>", value, "leaveaddress");
            return (Criteria) this;
        }

        public Criteria andLeaveaddressGreaterThan(String value) {
            addCriterion("leaveAddress >", value, "leaveaddress");
            return (Criteria) this;
        }

        public Criteria andLeaveaddressGreaterThanOrEqualTo(String value) {
            addCriterion("leaveAddress >=", value, "leaveaddress");
            return (Criteria) this;
        }

        public Criteria andLeaveaddressLessThan(String value) {
            addCriterion("leaveAddress <", value, "leaveaddress");
            return (Criteria) this;
        }

        public Criteria andLeaveaddressLessThanOrEqualTo(String value) {
            addCriterion("leaveAddress <=", value, "leaveaddress");
            return (Criteria) this;
        }

        public Criteria andLeaveaddressLike(String value) {
            addCriterion("leaveAddress like", value, "leaveaddress");
            return (Criteria) this;
        }

        public Criteria andLeaveaddressNotLike(String value) {
            addCriterion("leaveAddress not like", value, "leaveaddress");
            return (Criteria) this;
        }

        public Criteria andLeaveaddressIn(List<String> values) {
            addCriterion("leaveAddress in", values, "leaveaddress");
            return (Criteria) this;
        }

        public Criteria andLeaveaddressNotIn(List<String> values) {
            addCriterion("leaveAddress not in", values, "leaveaddress");
            return (Criteria) this;
        }

        public Criteria andLeaveaddressBetween(String value1, String value2) {
            addCriterion("leaveAddress between", value1, value2, "leaveaddress");
            return (Criteria) this;
        }

        public Criteria andLeaveaddressNotBetween(String value1, String value2) {
            addCriterion("leaveAddress not between", value1, value2, "leaveaddress");
            return (Criteria) this;
        }

        public Criteria andStudenttelIsNull() {
            addCriterion("studentTel is null");
            return (Criteria) this;
        }

        public Criteria andStudenttelIsNotNull() {
            addCriterion("studentTel is not null");
            return (Criteria) this;
        }

        public Criteria andStudenttelEqualTo(String value) {
            addCriterion("studentTel =", value, "studenttel");
            return (Criteria) this;
        }

        public Criteria andStudenttelNotEqualTo(String value) {
            addCriterion("studentTel <>", value, "studenttel");
            return (Criteria) this;
        }

        public Criteria andStudenttelGreaterThan(String value) {
            addCriterion("studentTel >", value, "studenttel");
            return (Criteria) this;
        }

        public Criteria andStudenttelGreaterThanOrEqualTo(String value) {
            addCriterion("studentTel >=", value, "studenttel");
            return (Criteria) this;
        }

        public Criteria andStudenttelLessThan(String value) {
            addCriterion("studentTel <", value, "studenttel");
            return (Criteria) this;
        }

        public Criteria andStudenttelLessThanOrEqualTo(String value) {
            addCriterion("studentTel <=", value, "studenttel");
            return (Criteria) this;
        }

        public Criteria andStudenttelLike(String value) {
            addCriterion("studentTel like", value, "studenttel");
            return (Criteria) this;
        }

        public Criteria andStudenttelNotLike(String value) {
            addCriterion("studentTel not like", value, "studenttel");
            return (Criteria) this;
        }

        public Criteria andStudenttelIn(List<String> values) {
            addCriterion("studentTel in", values, "studenttel");
            return (Criteria) this;
        }

        public Criteria andStudenttelNotIn(List<String> values) {
            addCriterion("studentTel not in", values, "studenttel");
            return (Criteria) this;
        }

        public Criteria andStudenttelBetween(String value1, String value2) {
            addCriterion("studentTel between", value1, value2, "studenttel");
            return (Criteria) this;
        }

        public Criteria andStudenttelNotBetween(String value1, String value2) {
            addCriterion("studentTel not between", value1, value2, "studenttel");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNull() {
            addCriterion("homeAddress is null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNotNull() {
            addCriterion("homeAddress is not null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressEqualTo(String value) {
            addCriterion("homeAddress =", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotEqualTo(String value) {
            addCriterion("homeAddress <>", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThan(String value) {
            addCriterion("homeAddress >", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("homeAddress >=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThan(String value) {
            addCriterion("homeAddress <", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThanOrEqualTo(String value) {
            addCriterion("homeAddress <=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLike(String value) {
            addCriterion("homeAddress like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotLike(String value) {
            addCriterion("homeAddress not like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIn(List<String> values) {
            addCriterion("homeAddress in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotIn(List<String> values) {
            addCriterion("homeAddress not in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressBetween(String value1, String value2) {
            addCriterion("homeAddress between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotBetween(String value1, String value2) {
            addCriterion("homeAddress not between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHometelIsNull() {
            addCriterion("homeTel is null");
            return (Criteria) this;
        }

        public Criteria andHometelIsNotNull() {
            addCriterion("homeTel is not null");
            return (Criteria) this;
        }

        public Criteria andHometelEqualTo(String value) {
            addCriterion("homeTel =", value, "hometel");
            return (Criteria) this;
        }

        public Criteria andHometelNotEqualTo(String value) {
            addCriterion("homeTel <>", value, "hometel");
            return (Criteria) this;
        }

        public Criteria andHometelGreaterThan(String value) {
            addCriterion("homeTel >", value, "hometel");
            return (Criteria) this;
        }

        public Criteria andHometelGreaterThanOrEqualTo(String value) {
            addCriterion("homeTel >=", value, "hometel");
            return (Criteria) this;
        }

        public Criteria andHometelLessThan(String value) {
            addCriterion("homeTel <", value, "hometel");
            return (Criteria) this;
        }

        public Criteria andHometelLessThanOrEqualTo(String value) {
            addCriterion("homeTel <=", value, "hometel");
            return (Criteria) this;
        }

        public Criteria andHometelLike(String value) {
            addCriterion("homeTel like", value, "hometel");
            return (Criteria) this;
        }

        public Criteria andHometelNotLike(String value) {
            addCriterion("homeTel not like", value, "hometel");
            return (Criteria) this;
        }

        public Criteria andHometelIn(List<String> values) {
            addCriterion("homeTel in", values, "hometel");
            return (Criteria) this;
        }

        public Criteria andHometelNotIn(List<String> values) {
            addCriterion("homeTel not in", values, "hometel");
            return (Criteria) this;
        }

        public Criteria andHometelBetween(String value1, String value2) {
            addCriterion("homeTel between", value1, value2, "hometel");
            return (Criteria) this;
        }

        public Criteria andHometelNotBetween(String value1, String value2) {
            addCriterion("homeTel not between", value1, value2, "hometel");
            return (Criteria) this;
        }

        public Criteria andLeavereasonIsNull() {
            addCriterion("leaveReason is null");
            return (Criteria) this;
        }

        public Criteria andLeavereasonIsNotNull() {
            addCriterion("leaveReason is not null");
            return (Criteria) this;
        }

        public Criteria andLeavereasonEqualTo(String value) {
            addCriterion("leaveReason =", value, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonNotEqualTo(String value) {
            addCriterion("leaveReason <>", value, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonGreaterThan(String value) {
            addCriterion("leaveReason >", value, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonGreaterThanOrEqualTo(String value) {
            addCriterion("leaveReason >=", value, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonLessThan(String value) {
            addCriterion("leaveReason <", value, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonLessThanOrEqualTo(String value) {
            addCriterion("leaveReason <=", value, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonLike(String value) {
            addCriterion("leaveReason like", value, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonNotLike(String value) {
            addCriterion("leaveReason not like", value, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonIn(List<String> values) {
            addCriterion("leaveReason in", values, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonNotIn(List<String> values) {
            addCriterion("leaveReason not in", values, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonBetween(String value1, String value2) {
            addCriterion("leaveReason between", value1, value2, "leavereason");
            return (Criteria) this;
        }

        public Criteria andLeavereasonNotBetween(String value1, String value2) {
            addCriterion("leaveReason not between", value1, value2, "leavereason");
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

        public Criteria andIsokIsNull() {
            addCriterion("isOk is null");
            return (Criteria) this;
        }

        public Criteria andIsokIsNotNull() {
            addCriterion("isOk is not null");
            return (Criteria) this;
        }

        public Criteria andIsokEqualTo(String value) {
            addCriterion("isOk =", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotEqualTo(String value) {
            addCriterion("isOk <>", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokGreaterThan(String value) {
            addCriterion("isOk >", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokGreaterThanOrEqualTo(String value) {
            addCriterion("isOk >=", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokLessThan(String value) {
            addCriterion("isOk <", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokLessThanOrEqualTo(String value) {
            addCriterion("isOk <=", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokLike(String value) {
            addCriterion("isOk like", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotLike(String value) {
            addCriterion("isOk not like", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokIn(List<String> values) {
            addCriterion("isOk in", values, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotIn(List<String> values) {
            addCriterion("isOk not in", values, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokBetween(String value1, String value2) {
            addCriterion("isOk between", value1, value2, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotBetween(String value1, String value2) {
            addCriterion("isOk not between", value1, value2, "isok");
            return (Criteria) this;
        }

        public Criteria andIscancelIsNull() {
            addCriterion("isCancel is null");
            return (Criteria) this;
        }

        public Criteria andIscancelIsNotNull() {
            addCriterion("isCancel is not null");
            return (Criteria) this;
        }

        public Criteria andIscancelEqualTo(String value) {
            addCriterion("isCancel =", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelNotEqualTo(String value) {
            addCriterion("isCancel <>", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelGreaterThan(String value) {
            addCriterion("isCancel >", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelGreaterThanOrEqualTo(String value) {
            addCriterion("isCancel >=", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelLessThan(String value) {
            addCriterion("isCancel <", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelLessThanOrEqualTo(String value) {
            addCriterion("isCancel <=", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelLike(String value) {
            addCriterion("isCancel like", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelNotLike(String value) {
            addCriterion("isCancel not like", value, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelIn(List<String> values) {
            addCriterion("isCancel in", values, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelNotIn(List<String> values) {
            addCriterion("isCancel not in", values, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelBetween(String value1, String value2) {
            addCriterion("isCancel between", value1, value2, "iscancel");
            return (Criteria) this;
        }

        public Criteria andIscancelNotBetween(String value1, String value2) {
            addCriterion("isCancel not between", value1, value2, "iscancel");
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