package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutsidegradesignagreemenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutsidegradesignagreemenExample() {
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

        public Criteria andAgreementidIsNull() {
            addCriterion("agreementID is null");
            return (Criteria) this;
        }

        public Criteria andAgreementidIsNotNull() {
            addCriterion("agreementID is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementidEqualTo(String value) {
            addCriterion("agreementID =", value, "agreementid");
            return (Criteria) this;
        }

        public Criteria andAgreementidNotEqualTo(String value) {
            addCriterion("agreementID <>", value, "agreementid");
            return (Criteria) this;
        }

        public Criteria andAgreementidGreaterThan(String value) {
            addCriterion("agreementID >", value, "agreementid");
            return (Criteria) this;
        }

        public Criteria andAgreementidGreaterThanOrEqualTo(String value) {
            addCriterion("agreementID >=", value, "agreementid");
            return (Criteria) this;
        }

        public Criteria andAgreementidLessThan(String value) {
            addCriterion("agreementID <", value, "agreementid");
            return (Criteria) this;
        }

        public Criteria andAgreementidLessThanOrEqualTo(String value) {
            addCriterion("agreementID <=", value, "agreementid");
            return (Criteria) this;
        }

        public Criteria andAgreementidLike(String value) {
            addCriterion("agreementID like", value, "agreementid");
            return (Criteria) this;
        }

        public Criteria andAgreementidNotLike(String value) {
            addCriterion("agreementID not like", value, "agreementid");
            return (Criteria) this;
        }

        public Criteria andAgreementidIn(List<String> values) {
            addCriterion("agreementID in", values, "agreementid");
            return (Criteria) this;
        }

        public Criteria andAgreementidNotIn(List<String> values) {
            addCriterion("agreementID not in", values, "agreementid");
            return (Criteria) this;
        }

        public Criteria andAgreementidBetween(String value1, String value2) {
            addCriterion("agreementID between", value1, value2, "agreementid");
            return (Criteria) this;
        }

        public Criteria andAgreementidNotBetween(String value1, String value2) {
            addCriterion("agreementID not between", value1, value2, "agreementid");
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

        public Criteria andAgreementnameIsNull() {
            addCriterion("agreementName is null");
            return (Criteria) this;
        }

        public Criteria andAgreementnameIsNotNull() {
            addCriterion("agreementName is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementnameEqualTo(String value) {
            addCriterion("agreementName =", value, "agreementname");
            return (Criteria) this;
        }

        public Criteria andAgreementnameNotEqualTo(String value) {
            addCriterion("agreementName <>", value, "agreementname");
            return (Criteria) this;
        }

        public Criteria andAgreementnameGreaterThan(String value) {
            addCriterion("agreementName >", value, "agreementname");
            return (Criteria) this;
        }

        public Criteria andAgreementnameGreaterThanOrEqualTo(String value) {
            addCriterion("agreementName >=", value, "agreementname");
            return (Criteria) this;
        }

        public Criteria andAgreementnameLessThan(String value) {
            addCriterion("agreementName <", value, "agreementname");
            return (Criteria) this;
        }

        public Criteria andAgreementnameLessThanOrEqualTo(String value) {
            addCriterion("agreementName <=", value, "agreementname");
            return (Criteria) this;
        }

        public Criteria andAgreementnameLike(String value) {
            addCriterion("agreementName like", value, "agreementname");
            return (Criteria) this;
        }

        public Criteria andAgreementnameNotLike(String value) {
            addCriterion("agreementName not like", value, "agreementname");
            return (Criteria) this;
        }

        public Criteria andAgreementnameIn(List<String> values) {
            addCriterion("agreementName in", values, "agreementname");
            return (Criteria) this;
        }

        public Criteria andAgreementnameNotIn(List<String> values) {
            addCriterion("agreementName not in", values, "agreementname");
            return (Criteria) this;
        }

        public Criteria andAgreementnameBetween(String value1, String value2) {
            addCriterion("agreementName between", value1, value2, "agreementname");
            return (Criteria) this;
        }

        public Criteria andAgreementnameNotBetween(String value1, String value2) {
            addCriterion("agreementName not between", value1, value2, "agreementname");
            return (Criteria) this;
        }

        public Criteria andCollegenameIsNull() {
            addCriterion("collegeName is null");
            return (Criteria) this;
        }

        public Criteria andCollegenameIsNotNull() {
            addCriterion("collegeName is not null");
            return (Criteria) this;
        }

        public Criteria andCollegenameEqualTo(String value) {
            addCriterion("collegeName =", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameNotEqualTo(String value) {
            addCriterion("collegeName <>", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameGreaterThan(String value) {
            addCriterion("collegeName >", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameGreaterThanOrEqualTo(String value) {
            addCriterion("collegeName >=", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameLessThan(String value) {
            addCriterion("collegeName <", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameLessThanOrEqualTo(String value) {
            addCriterion("collegeName <=", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameLike(String value) {
            addCriterion("collegeName like", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameNotLike(String value) {
            addCriterion("collegeName not like", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameIn(List<String> values) {
            addCriterion("collegeName in", values, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameNotIn(List<String> values) {
            addCriterion("collegeName not in", values, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameBetween(String value1, String value2) {
            addCriterion("collegeName between", value1, value2, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameNotBetween(String value1, String value2) {
            addCriterion("collegeName not between", value1, value2, "collegename");
            return (Criteria) this;
        }

        public Criteria andStudentidcardIsNull() {
            addCriterion("studentIdCard is null");
            return (Criteria) this;
        }

        public Criteria andStudentidcardIsNotNull() {
            addCriterion("studentIdCard is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidcardEqualTo(String value) {
            addCriterion("studentIdCard =", value, "studentidcard");
            return (Criteria) this;
        }

        public Criteria andStudentidcardNotEqualTo(String value) {
            addCriterion("studentIdCard <>", value, "studentidcard");
            return (Criteria) this;
        }

        public Criteria andStudentidcardGreaterThan(String value) {
            addCriterion("studentIdCard >", value, "studentidcard");
            return (Criteria) this;
        }

        public Criteria andStudentidcardGreaterThanOrEqualTo(String value) {
            addCriterion("studentIdCard >=", value, "studentidcard");
            return (Criteria) this;
        }

        public Criteria andStudentidcardLessThan(String value) {
            addCriterion("studentIdCard <", value, "studentidcard");
            return (Criteria) this;
        }

        public Criteria andStudentidcardLessThanOrEqualTo(String value) {
            addCriterion("studentIdCard <=", value, "studentidcard");
            return (Criteria) this;
        }

        public Criteria andStudentidcardLike(String value) {
            addCriterion("studentIdCard like", value, "studentidcard");
            return (Criteria) this;
        }

        public Criteria andStudentidcardNotLike(String value) {
            addCriterion("studentIdCard not like", value, "studentidcard");
            return (Criteria) this;
        }

        public Criteria andStudentidcardIn(List<String> values) {
            addCriterion("studentIdCard in", values, "studentidcard");
            return (Criteria) this;
        }

        public Criteria andStudentidcardNotIn(List<String> values) {
            addCriterion("studentIdCard not in", values, "studentidcard");
            return (Criteria) this;
        }

        public Criteria andStudentidcardBetween(String value1, String value2) {
            addCriterion("studentIdCard between", value1, value2, "studentidcard");
            return (Criteria) this;
        }

        public Criteria andStudentidcardNotBetween(String value1, String value2) {
            addCriterion("studentIdCard not between", value1, value2, "studentidcard");
            return (Criteria) this;
        }

        public Criteria andSchoolsignIsNull() {
            addCriterion("schoolSign is null");
            return (Criteria) this;
        }

        public Criteria andSchoolsignIsNotNull() {
            addCriterion("schoolSign is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolsignEqualTo(String value) {
            addCriterion("schoolSign =", value, "schoolsign");
            return (Criteria) this;
        }

        public Criteria andSchoolsignNotEqualTo(String value) {
            addCriterion("schoolSign <>", value, "schoolsign");
            return (Criteria) this;
        }

        public Criteria andSchoolsignGreaterThan(String value) {
            addCriterion("schoolSign >", value, "schoolsign");
            return (Criteria) this;
        }

        public Criteria andSchoolsignGreaterThanOrEqualTo(String value) {
            addCriterion("schoolSign >=", value, "schoolsign");
            return (Criteria) this;
        }

        public Criteria andSchoolsignLessThan(String value) {
            addCriterion("schoolSign <", value, "schoolsign");
            return (Criteria) this;
        }

        public Criteria andSchoolsignLessThanOrEqualTo(String value) {
            addCriterion("schoolSign <=", value, "schoolsign");
            return (Criteria) this;
        }

        public Criteria andSchoolsignLike(String value) {
            addCriterion("schoolSign like", value, "schoolsign");
            return (Criteria) this;
        }

        public Criteria andSchoolsignNotLike(String value) {
            addCriterion("schoolSign not like", value, "schoolsign");
            return (Criteria) this;
        }

        public Criteria andSchoolsignIn(List<String> values) {
            addCriterion("schoolSign in", values, "schoolsign");
            return (Criteria) this;
        }

        public Criteria andSchoolsignNotIn(List<String> values) {
            addCriterion("schoolSign not in", values, "schoolsign");
            return (Criteria) this;
        }

        public Criteria andSchoolsignBetween(String value1, String value2) {
            addCriterion("schoolSign between", value1, value2, "schoolsign");
            return (Criteria) this;
        }

        public Criteria andSchoolsignNotBetween(String value1, String value2) {
            addCriterion("schoolSign not between", value1, value2, "schoolsign");
            return (Criteria) this;
        }

        public Criteria andSchoolsigndateIsNull() {
            addCriterion("schoolSignDate is null");
            return (Criteria) this;
        }

        public Criteria andSchoolsigndateIsNotNull() {
            addCriterion("schoolSignDate is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolsigndateEqualTo(Date value) {
            addCriterion("schoolSignDate =", value, "schoolsigndate");
            return (Criteria) this;
        }

        public Criteria andSchoolsigndateNotEqualTo(Date value) {
            addCriterion("schoolSignDate <>", value, "schoolsigndate");
            return (Criteria) this;
        }

        public Criteria andSchoolsigndateGreaterThan(Date value) {
            addCriterion("schoolSignDate >", value, "schoolsigndate");
            return (Criteria) this;
        }

        public Criteria andSchoolsigndateGreaterThanOrEqualTo(Date value) {
            addCriterion("schoolSignDate >=", value, "schoolsigndate");
            return (Criteria) this;
        }

        public Criteria andSchoolsigndateLessThan(Date value) {
            addCriterion("schoolSignDate <", value, "schoolsigndate");
            return (Criteria) this;
        }

        public Criteria andSchoolsigndateLessThanOrEqualTo(Date value) {
            addCriterion("schoolSignDate <=", value, "schoolsigndate");
            return (Criteria) this;
        }

        public Criteria andSchoolsigndateIn(List<Date> values) {
            addCriterion("schoolSignDate in", values, "schoolsigndate");
            return (Criteria) this;
        }

        public Criteria andSchoolsigndateNotIn(List<Date> values) {
            addCriterion("schoolSignDate not in", values, "schoolsigndate");
            return (Criteria) this;
        }

        public Criteria andSchoolsigndateBetween(Date value1, Date value2) {
            addCriterion("schoolSignDate between", value1, value2, "schoolsigndate");
            return (Criteria) this;
        }

        public Criteria andSchoolsigndateNotBetween(Date value1, Date value2) {
            addCriterion("schoolSignDate not between", value1, value2, "schoolsigndate");
            return (Criteria) this;
        }

        public Criteria andStudentsignIsNull() {
            addCriterion("studentSign is null");
            return (Criteria) this;
        }

        public Criteria andStudentsignIsNotNull() {
            addCriterion("studentSign is not null");
            return (Criteria) this;
        }

        public Criteria andStudentsignEqualTo(String value) {
            addCriterion("studentSign =", value, "studentsign");
            return (Criteria) this;
        }

        public Criteria andStudentsignNotEqualTo(String value) {
            addCriterion("studentSign <>", value, "studentsign");
            return (Criteria) this;
        }

        public Criteria andStudentsignGreaterThan(String value) {
            addCriterion("studentSign >", value, "studentsign");
            return (Criteria) this;
        }

        public Criteria andStudentsignGreaterThanOrEqualTo(String value) {
            addCriterion("studentSign >=", value, "studentsign");
            return (Criteria) this;
        }

        public Criteria andStudentsignLessThan(String value) {
            addCriterion("studentSign <", value, "studentsign");
            return (Criteria) this;
        }

        public Criteria andStudentsignLessThanOrEqualTo(String value) {
            addCriterion("studentSign <=", value, "studentsign");
            return (Criteria) this;
        }

        public Criteria andStudentsignLike(String value) {
            addCriterion("studentSign like", value, "studentsign");
            return (Criteria) this;
        }

        public Criteria andStudentsignNotLike(String value) {
            addCriterion("studentSign not like", value, "studentsign");
            return (Criteria) this;
        }

        public Criteria andStudentsignIn(List<String> values) {
            addCriterion("studentSign in", values, "studentsign");
            return (Criteria) this;
        }

        public Criteria andStudentsignNotIn(List<String> values) {
            addCriterion("studentSign not in", values, "studentsign");
            return (Criteria) this;
        }

        public Criteria andStudentsignBetween(String value1, String value2) {
            addCriterion("studentSign between", value1, value2, "studentsign");
            return (Criteria) this;
        }

        public Criteria andStudentsignNotBetween(String value1, String value2) {
            addCriterion("studentSign not between", value1, value2, "studentsign");
            return (Criteria) this;
        }

        public Criteria andStudentsigndateIsNull() {
            addCriterion("studentSignDate is null");
            return (Criteria) this;
        }

        public Criteria andStudentsigndateIsNotNull() {
            addCriterion("studentSignDate is not null");
            return (Criteria) this;
        }

        public Criteria andStudentsigndateEqualTo(Date value) {
            addCriterion("studentSignDate =", value, "studentsigndate");
            return (Criteria) this;
        }

        public Criteria andStudentsigndateNotEqualTo(Date value) {
            addCriterion("studentSignDate <>", value, "studentsigndate");
            return (Criteria) this;
        }

        public Criteria andStudentsigndateGreaterThan(Date value) {
            addCriterion("studentSignDate >", value, "studentsigndate");
            return (Criteria) this;
        }

        public Criteria andStudentsigndateGreaterThanOrEqualTo(Date value) {
            addCriterion("studentSignDate >=", value, "studentsigndate");
            return (Criteria) this;
        }

        public Criteria andStudentsigndateLessThan(Date value) {
            addCriterion("studentSignDate <", value, "studentsigndate");
            return (Criteria) this;
        }

        public Criteria andStudentsigndateLessThanOrEqualTo(Date value) {
            addCriterion("studentSignDate <=", value, "studentsigndate");
            return (Criteria) this;
        }

        public Criteria andStudentsigndateIn(List<Date> values) {
            addCriterion("studentSignDate in", values, "studentsigndate");
            return (Criteria) this;
        }

        public Criteria andStudentsigndateNotIn(List<Date> values) {
            addCriterion("studentSignDate not in", values, "studentsigndate");
            return (Criteria) this;
        }

        public Criteria andStudentsigndateBetween(Date value1, Date value2) {
            addCriterion("studentSignDate between", value1, value2, "studentsigndate");
            return (Criteria) this;
        }

        public Criteria andStudentsigndateNotBetween(Date value1, Date value2) {
            addCriterion("studentSignDate not between", value1, value2, "studentsigndate");
            return (Criteria) this;
        }

        public Criteria andApplystatusIsNull() {
            addCriterion("applyStatus is null");
            return (Criteria) this;
        }

        public Criteria andApplystatusIsNotNull() {
            addCriterion("applyStatus is not null");
            return (Criteria) this;
        }

        public Criteria andApplystatusEqualTo(String value) {
            addCriterion("applyStatus =", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotEqualTo(String value) {
            addCriterion("applyStatus <>", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusGreaterThan(String value) {
            addCriterion("applyStatus >", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusGreaterThanOrEqualTo(String value) {
            addCriterion("applyStatus >=", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusLessThan(String value) {
            addCriterion("applyStatus <", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusLessThanOrEqualTo(String value) {
            addCriterion("applyStatus <=", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusLike(String value) {
            addCriterion("applyStatus like", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotLike(String value) {
            addCriterion("applyStatus not like", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusIn(List<String> values) {
            addCriterion("applyStatus in", values, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotIn(List<String> values) {
            addCriterion("applyStatus not in", values, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusBetween(String value1, String value2) {
            addCriterion("applyStatus between", value1, value2, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotBetween(String value1, String value2) {
            addCriterion("applyStatus not between", value1, value2, "applystatus");
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