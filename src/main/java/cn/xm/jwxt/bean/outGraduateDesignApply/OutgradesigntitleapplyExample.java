package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.ArrayList;
import java.util.List;

public class OutgradesigntitleapplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutgradesigntitleapplyExample() {
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

        public Criteria andOutgradesignapplyidIsNull() {
            addCriterion("outGraDesignApplyID is null");
            return (Criteria) this;
        }

        public Criteria andOutgradesignapplyidIsNotNull() {
            addCriterion("outGraDesignApplyID is not null");
            return (Criteria) this;
        }

        public Criteria andOutgradesignapplyidEqualTo(String value) {
            addCriterion("outGraDesignApplyID =", value, "outgradesignapplyid");
            return (Criteria) this;
        }

        public Criteria andOutgradesignapplyidNotEqualTo(String value) {
            addCriterion("outGraDesignApplyID <>", value, "outgradesignapplyid");
            return (Criteria) this;
        }

        public Criteria andOutgradesignapplyidGreaterThan(String value) {
            addCriterion("outGraDesignApplyID >", value, "outgradesignapplyid");
            return (Criteria) this;
        }

        public Criteria andOutgradesignapplyidGreaterThanOrEqualTo(String value) {
            addCriterion("outGraDesignApplyID >=", value, "outgradesignapplyid");
            return (Criteria) this;
        }

        public Criteria andOutgradesignapplyidLessThan(String value) {
            addCriterion("outGraDesignApplyID <", value, "outgradesignapplyid");
            return (Criteria) this;
        }

        public Criteria andOutgradesignapplyidLessThanOrEqualTo(String value) {
            addCriterion("outGraDesignApplyID <=", value, "outgradesignapplyid");
            return (Criteria) this;
        }

        public Criteria andOutgradesignapplyidLike(String value) {
            addCriterion("outGraDesignApplyID like", value, "outgradesignapplyid");
            return (Criteria) this;
        }

        public Criteria andOutgradesignapplyidNotLike(String value) {
            addCriterion("outGraDesignApplyID not like", value, "outgradesignapplyid");
            return (Criteria) this;
        }

        public Criteria andOutgradesignapplyidIn(List<String> values) {
            addCriterion("outGraDesignApplyID in", values, "outgradesignapplyid");
            return (Criteria) this;
        }

        public Criteria andOutgradesignapplyidNotIn(List<String> values) {
            addCriterion("outGraDesignApplyID not in", values, "outgradesignapplyid");
            return (Criteria) this;
        }

        public Criteria andOutgradesignapplyidBetween(String value1, String value2) {
            addCriterion("outGraDesignApplyID between", value1, value2, "outgradesignapplyid");
            return (Criteria) this;
        }

        public Criteria andOutgradesignapplyidNotBetween(String value1, String value2) {
            addCriterion("outGraDesignApplyID not between", value1, value2, "outgradesignapplyid");
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

        public Criteria andOutunitnameIsNull() {
            addCriterion("outUnitName is null");
            return (Criteria) this;
        }

        public Criteria andOutunitnameIsNotNull() {
            addCriterion("outUnitName is not null");
            return (Criteria) this;
        }

        public Criteria andOutunitnameEqualTo(String value) {
            addCriterion("outUnitName =", value, "outunitname");
            return (Criteria) this;
        }

        public Criteria andOutunitnameNotEqualTo(String value) {
            addCriterion("outUnitName <>", value, "outunitname");
            return (Criteria) this;
        }

        public Criteria andOutunitnameGreaterThan(String value) {
            addCriterion("outUnitName >", value, "outunitname");
            return (Criteria) this;
        }

        public Criteria andOutunitnameGreaterThanOrEqualTo(String value) {
            addCriterion("outUnitName >=", value, "outunitname");
            return (Criteria) this;
        }

        public Criteria andOutunitnameLessThan(String value) {
            addCriterion("outUnitName <", value, "outunitname");
            return (Criteria) this;
        }

        public Criteria andOutunitnameLessThanOrEqualTo(String value) {
            addCriterion("outUnitName <=", value, "outunitname");
            return (Criteria) this;
        }

        public Criteria andOutunitnameLike(String value) {
            addCriterion("outUnitName like", value, "outunitname");
            return (Criteria) this;
        }

        public Criteria andOutunitnameNotLike(String value) {
            addCriterion("outUnitName not like", value, "outunitname");
            return (Criteria) this;
        }

        public Criteria andOutunitnameIn(List<String> values) {
            addCriterion("outUnitName in", values, "outunitname");
            return (Criteria) this;
        }

        public Criteria andOutunitnameNotIn(List<String> values) {
            addCriterion("outUnitName not in", values, "outunitname");
            return (Criteria) this;
        }

        public Criteria andOutunitnameBetween(String value1, String value2) {
            addCriterion("outUnitName between", value1, value2, "outunitname");
            return (Criteria) this;
        }

        public Criteria andOutunitnameNotBetween(String value1, String value2) {
            addCriterion("outUnitName not between", value1, value2, "outunitname");
            return (Criteria) this;
        }

        public Criteria andOutunitphoneIsNull() {
            addCriterion("outUnitPhone is null");
            return (Criteria) this;
        }

        public Criteria andOutunitphoneIsNotNull() {
            addCriterion("outUnitPhone is not null");
            return (Criteria) this;
        }

        public Criteria andOutunitphoneEqualTo(String value) {
            addCriterion("outUnitPhone =", value, "outunitphone");
            return (Criteria) this;
        }

        public Criteria andOutunitphoneNotEqualTo(String value) {
            addCriterion("outUnitPhone <>", value, "outunitphone");
            return (Criteria) this;
        }

        public Criteria andOutunitphoneGreaterThan(String value) {
            addCriterion("outUnitPhone >", value, "outunitphone");
            return (Criteria) this;
        }

        public Criteria andOutunitphoneGreaterThanOrEqualTo(String value) {
            addCriterion("outUnitPhone >=", value, "outunitphone");
            return (Criteria) this;
        }

        public Criteria andOutunitphoneLessThan(String value) {
            addCriterion("outUnitPhone <", value, "outunitphone");
            return (Criteria) this;
        }

        public Criteria andOutunitphoneLessThanOrEqualTo(String value) {
            addCriterion("outUnitPhone <=", value, "outunitphone");
            return (Criteria) this;
        }

        public Criteria andOutunitphoneLike(String value) {
            addCriterion("outUnitPhone like", value, "outunitphone");
            return (Criteria) this;
        }

        public Criteria andOutunitphoneNotLike(String value) {
            addCriterion("outUnitPhone not like", value, "outunitphone");
            return (Criteria) this;
        }

        public Criteria andOutunitphoneIn(List<String> values) {
            addCriterion("outUnitPhone in", values, "outunitphone");
            return (Criteria) this;
        }

        public Criteria andOutunitphoneNotIn(List<String> values) {
            addCriterion("outUnitPhone not in", values, "outunitphone");
            return (Criteria) this;
        }

        public Criteria andOutunitphoneBetween(String value1, String value2) {
            addCriterion("outUnitPhone between", value1, value2, "outunitphone");
            return (Criteria) this;
        }

        public Criteria andOutunitphoneNotBetween(String value1, String value2) {
            addCriterion("outUnitPhone not between", value1, value2, "outunitphone");
            return (Criteria) this;
        }

        public Criteria andOutunitaddrIsNull() {
            addCriterion("outUnitAddr is null");
            return (Criteria) this;
        }

        public Criteria andOutunitaddrIsNotNull() {
            addCriterion("outUnitAddr is not null");
            return (Criteria) this;
        }

        public Criteria andOutunitaddrEqualTo(String value) {
            addCriterion("outUnitAddr =", value, "outunitaddr");
            return (Criteria) this;
        }

        public Criteria andOutunitaddrNotEqualTo(String value) {
            addCriterion("outUnitAddr <>", value, "outunitaddr");
            return (Criteria) this;
        }

        public Criteria andOutunitaddrGreaterThan(String value) {
            addCriterion("outUnitAddr >", value, "outunitaddr");
            return (Criteria) this;
        }

        public Criteria andOutunitaddrGreaterThanOrEqualTo(String value) {
            addCriterion("outUnitAddr >=", value, "outunitaddr");
            return (Criteria) this;
        }

        public Criteria andOutunitaddrLessThan(String value) {
            addCriterion("outUnitAddr <", value, "outunitaddr");
            return (Criteria) this;
        }

        public Criteria andOutunitaddrLessThanOrEqualTo(String value) {
            addCriterion("outUnitAddr <=", value, "outunitaddr");
            return (Criteria) this;
        }

        public Criteria andOutunitaddrLike(String value) {
            addCriterion("outUnitAddr like", value, "outunitaddr");
            return (Criteria) this;
        }

        public Criteria andOutunitaddrNotLike(String value) {
            addCriterion("outUnitAddr not like", value, "outunitaddr");
            return (Criteria) this;
        }

        public Criteria andOutunitaddrIn(List<String> values) {
            addCriterion("outUnitAddr in", values, "outunitaddr");
            return (Criteria) this;
        }

        public Criteria andOutunitaddrNotIn(List<String> values) {
            addCriterion("outUnitAddr not in", values, "outunitaddr");
            return (Criteria) this;
        }

        public Criteria andOutunitaddrBetween(String value1, String value2) {
            addCriterion("outUnitAddr between", value1, value2, "outunitaddr");
            return (Criteria) this;
        }

        public Criteria andOutunitaddrNotBetween(String value1, String value2) {
            addCriterion("outUnitAddr not between", value1, value2, "outunitaddr");
            return (Criteria) this;
        }

        public Criteria andStudentphoneIsNull() {
            addCriterion("studentPhone is null");
            return (Criteria) this;
        }

        public Criteria andStudentphoneIsNotNull() {
            addCriterion("studentPhone is not null");
            return (Criteria) this;
        }

        public Criteria andStudentphoneEqualTo(String value) {
            addCriterion("studentPhone =", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneNotEqualTo(String value) {
            addCriterion("studentPhone <>", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneGreaterThan(String value) {
            addCriterion("studentPhone >", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneGreaterThanOrEqualTo(String value) {
            addCriterion("studentPhone >=", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneLessThan(String value) {
            addCriterion("studentPhone <", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneLessThanOrEqualTo(String value) {
            addCriterion("studentPhone <=", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneLike(String value) {
            addCriterion("studentPhone like", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneNotLike(String value) {
            addCriterion("studentPhone not like", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneIn(List<String> values) {
            addCriterion("studentPhone in", values, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneNotIn(List<String> values) {
            addCriterion("studentPhone not in", values, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneBetween(String value1, String value2) {
            addCriterion("studentPhone between", value1, value2, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneNotBetween(String value1, String value2) {
            addCriterion("studentPhone not between", value1, value2, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStuparentphoneIsNull() {
            addCriterion("stuParentPhone is null");
            return (Criteria) this;
        }

        public Criteria andStuparentphoneIsNotNull() {
            addCriterion("stuParentPhone is not null");
            return (Criteria) this;
        }

        public Criteria andStuparentphoneEqualTo(String value) {
            addCriterion("stuParentPhone =", value, "stuparentphone");
            return (Criteria) this;
        }

        public Criteria andStuparentphoneNotEqualTo(String value) {
            addCriterion("stuParentPhone <>", value, "stuparentphone");
            return (Criteria) this;
        }

        public Criteria andStuparentphoneGreaterThan(String value) {
            addCriterion("stuParentPhone >", value, "stuparentphone");
            return (Criteria) this;
        }

        public Criteria andStuparentphoneGreaterThanOrEqualTo(String value) {
            addCriterion("stuParentPhone >=", value, "stuparentphone");
            return (Criteria) this;
        }

        public Criteria andStuparentphoneLessThan(String value) {
            addCriterion("stuParentPhone <", value, "stuparentphone");
            return (Criteria) this;
        }

        public Criteria andStuparentphoneLessThanOrEqualTo(String value) {
            addCriterion("stuParentPhone <=", value, "stuparentphone");
            return (Criteria) this;
        }

        public Criteria andStuparentphoneLike(String value) {
            addCriterion("stuParentPhone like", value, "stuparentphone");
            return (Criteria) this;
        }

        public Criteria andStuparentphoneNotLike(String value) {
            addCriterion("stuParentPhone not like", value, "stuparentphone");
            return (Criteria) this;
        }

        public Criteria andStuparentphoneIn(List<String> values) {
            addCriterion("stuParentPhone in", values, "stuparentphone");
            return (Criteria) this;
        }

        public Criteria andStuparentphoneNotIn(List<String> values) {
            addCriterion("stuParentPhone not in", values, "stuparentphone");
            return (Criteria) this;
        }

        public Criteria andStuparentphoneBetween(String value1, String value2) {
            addCriterion("stuParentPhone between", value1, value2, "stuparentphone");
            return (Criteria) this;
        }

        public Criteria andStuparentphoneNotBetween(String value1, String value2) {
            addCriterion("stuParentPhone not between", value1, value2, "stuparentphone");
            return (Criteria) this;
        }

        public Criteria andInteachernameIsNull() {
            addCriterion("inTeacherName is null");
            return (Criteria) this;
        }

        public Criteria andInteachernameIsNotNull() {
            addCriterion("inTeacherName is not null");
            return (Criteria) this;
        }

        public Criteria andInteachernameEqualTo(String value) {
            addCriterion("inTeacherName =", value, "inteachername");
            return (Criteria) this;
        }

        public Criteria andInteachernameNotEqualTo(String value) {
            addCriterion("inTeacherName <>", value, "inteachername");
            return (Criteria) this;
        }

        public Criteria andInteachernameGreaterThan(String value) {
            addCriterion("inTeacherName >", value, "inteachername");
            return (Criteria) this;
        }

        public Criteria andInteachernameGreaterThanOrEqualTo(String value) {
            addCriterion("inTeacherName >=", value, "inteachername");
            return (Criteria) this;
        }

        public Criteria andInteachernameLessThan(String value) {
            addCriterion("inTeacherName <", value, "inteachername");
            return (Criteria) this;
        }

        public Criteria andInteachernameLessThanOrEqualTo(String value) {
            addCriterion("inTeacherName <=", value, "inteachername");
            return (Criteria) this;
        }

        public Criteria andInteachernameLike(String value) {
            addCriterion("inTeacherName like", value, "inteachername");
            return (Criteria) this;
        }

        public Criteria andInteachernameNotLike(String value) {
            addCriterion("inTeacherName not like", value, "inteachername");
            return (Criteria) this;
        }

        public Criteria andInteachernameIn(List<String> values) {
            addCriterion("inTeacherName in", values, "inteachername");
            return (Criteria) this;
        }

        public Criteria andInteachernameNotIn(List<String> values) {
            addCriterion("inTeacherName not in", values, "inteachername");
            return (Criteria) this;
        }

        public Criteria andInteachernameBetween(String value1, String value2) {
            addCriterion("inTeacherName between", value1, value2, "inteachername");
            return (Criteria) this;
        }

        public Criteria andInteachernameNotBetween(String value1, String value2) {
            addCriterion("inTeacherName not between", value1, value2, "inteachername");
            return (Criteria) this;
        }

        public Criteria andInteacherphoneIsNull() {
            addCriterion("inTeacherPhone is null");
            return (Criteria) this;
        }

        public Criteria andInteacherphoneIsNotNull() {
            addCriterion("inTeacherPhone is not null");
            return (Criteria) this;
        }

        public Criteria andInteacherphoneEqualTo(String value) {
            addCriterion("inTeacherPhone =", value, "inteacherphone");
            return (Criteria) this;
        }

        public Criteria andInteacherphoneNotEqualTo(String value) {
            addCriterion("inTeacherPhone <>", value, "inteacherphone");
            return (Criteria) this;
        }

        public Criteria andInteacherphoneGreaterThan(String value) {
            addCriterion("inTeacherPhone >", value, "inteacherphone");
            return (Criteria) this;
        }

        public Criteria andInteacherphoneGreaterThanOrEqualTo(String value) {
            addCriterion("inTeacherPhone >=", value, "inteacherphone");
            return (Criteria) this;
        }

        public Criteria andInteacherphoneLessThan(String value) {
            addCriterion("inTeacherPhone <", value, "inteacherphone");
            return (Criteria) this;
        }

        public Criteria andInteacherphoneLessThanOrEqualTo(String value) {
            addCriterion("inTeacherPhone <=", value, "inteacherphone");
            return (Criteria) this;
        }

        public Criteria andInteacherphoneLike(String value) {
            addCriterion("inTeacherPhone like", value, "inteacherphone");
            return (Criteria) this;
        }

        public Criteria andInteacherphoneNotLike(String value) {
            addCriterion("inTeacherPhone not like", value, "inteacherphone");
            return (Criteria) this;
        }

        public Criteria andInteacherphoneIn(List<String> values) {
            addCriterion("inTeacherPhone in", values, "inteacherphone");
            return (Criteria) this;
        }

        public Criteria andInteacherphoneNotIn(List<String> values) {
            addCriterion("inTeacherPhone not in", values, "inteacherphone");
            return (Criteria) this;
        }

        public Criteria andInteacherphoneBetween(String value1, String value2) {
            addCriterion("inTeacherPhone between", value1, value2, "inteacherphone");
            return (Criteria) this;
        }

        public Criteria andInteacherphoneNotBetween(String value1, String value2) {
            addCriterion("inTeacherPhone not between", value1, value2, "inteacherphone");
            return (Criteria) this;
        }

        public Criteria andOutteachernameIsNull() {
            addCriterion("outTeacherName is null");
            return (Criteria) this;
        }

        public Criteria andOutteachernameIsNotNull() {
            addCriterion("outTeacherName is not null");
            return (Criteria) this;
        }

        public Criteria andOutteachernameEqualTo(String value) {
            addCriterion("outTeacherName =", value, "outteachername");
            return (Criteria) this;
        }

        public Criteria andOutteachernameNotEqualTo(String value) {
            addCriterion("outTeacherName <>", value, "outteachername");
            return (Criteria) this;
        }

        public Criteria andOutteachernameGreaterThan(String value) {
            addCriterion("outTeacherName >", value, "outteachername");
            return (Criteria) this;
        }

        public Criteria andOutteachernameGreaterThanOrEqualTo(String value) {
            addCriterion("outTeacherName >=", value, "outteachername");
            return (Criteria) this;
        }

        public Criteria andOutteachernameLessThan(String value) {
            addCriterion("outTeacherName <", value, "outteachername");
            return (Criteria) this;
        }

        public Criteria andOutteachernameLessThanOrEqualTo(String value) {
            addCriterion("outTeacherName <=", value, "outteachername");
            return (Criteria) this;
        }

        public Criteria andOutteachernameLike(String value) {
            addCriterion("outTeacherName like", value, "outteachername");
            return (Criteria) this;
        }

        public Criteria andOutteachernameNotLike(String value) {
            addCriterion("outTeacherName not like", value, "outteachername");
            return (Criteria) this;
        }

        public Criteria andOutteachernameIn(List<String> values) {
            addCriterion("outTeacherName in", values, "outteachername");
            return (Criteria) this;
        }

        public Criteria andOutteachernameNotIn(List<String> values) {
            addCriterion("outTeacherName not in", values, "outteachername");
            return (Criteria) this;
        }

        public Criteria andOutteachernameBetween(String value1, String value2) {
            addCriterion("outTeacherName between", value1, value2, "outteachername");
            return (Criteria) this;
        }

        public Criteria andOutteachernameNotBetween(String value1, String value2) {
            addCriterion("outTeacherName not between", value1, value2, "outteachername");
            return (Criteria) this;
        }

        public Criteria andOutteacherphoneIsNull() {
            addCriterion("outTeacherPhone is null");
            return (Criteria) this;
        }

        public Criteria andOutteacherphoneIsNotNull() {
            addCriterion("outTeacherPhone is not null");
            return (Criteria) this;
        }

        public Criteria andOutteacherphoneEqualTo(String value) {
            addCriterion("outTeacherPhone =", value, "outteacherphone");
            return (Criteria) this;
        }

        public Criteria andOutteacherphoneNotEqualTo(String value) {
            addCriterion("outTeacherPhone <>", value, "outteacherphone");
            return (Criteria) this;
        }

        public Criteria andOutteacherphoneGreaterThan(String value) {
            addCriterion("outTeacherPhone >", value, "outteacherphone");
            return (Criteria) this;
        }

        public Criteria andOutteacherphoneGreaterThanOrEqualTo(String value) {
            addCriterion("outTeacherPhone >=", value, "outteacherphone");
            return (Criteria) this;
        }

        public Criteria andOutteacherphoneLessThan(String value) {
            addCriterion("outTeacherPhone <", value, "outteacherphone");
            return (Criteria) this;
        }

        public Criteria andOutteacherphoneLessThanOrEqualTo(String value) {
            addCriterion("outTeacherPhone <=", value, "outteacherphone");
            return (Criteria) this;
        }

        public Criteria andOutteacherphoneLike(String value) {
            addCriterion("outTeacherPhone like", value, "outteacherphone");
            return (Criteria) this;
        }

        public Criteria andOutteacherphoneNotLike(String value) {
            addCriterion("outTeacherPhone not like", value, "outteacherphone");
            return (Criteria) this;
        }

        public Criteria andOutteacherphoneIn(List<String> values) {
            addCriterion("outTeacherPhone in", values, "outteacherphone");
            return (Criteria) this;
        }

        public Criteria andOutteacherphoneNotIn(List<String> values) {
            addCriterion("outTeacherPhone not in", values, "outteacherphone");
            return (Criteria) this;
        }

        public Criteria andOutteacherphoneBetween(String value1, String value2) {
            addCriterion("outTeacherPhone between", value1, value2, "outteacherphone");
            return (Criteria) this;
        }

        public Criteria andOutteacherphoneNotBetween(String value1, String value2) {
            addCriterion("outTeacherPhone not between", value1, value2, "outteacherphone");
            return (Criteria) this;
        }

        public Criteria andCoursedescriptionIsNull() {
            addCriterion("courseDescription is null");
            return (Criteria) this;
        }

        public Criteria andCoursedescriptionIsNotNull() {
            addCriterion("courseDescription is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedescriptionEqualTo(String value) {
            addCriterion("courseDescription =", value, "coursedescription");
            return (Criteria) this;
        }

        public Criteria andCoursedescriptionNotEqualTo(String value) {
            addCriterion("courseDescription <>", value, "coursedescription");
            return (Criteria) this;
        }

        public Criteria andCoursedescriptionGreaterThan(String value) {
            addCriterion("courseDescription >", value, "coursedescription");
            return (Criteria) this;
        }

        public Criteria andCoursedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("courseDescription >=", value, "coursedescription");
            return (Criteria) this;
        }

        public Criteria andCoursedescriptionLessThan(String value) {
            addCriterion("courseDescription <", value, "coursedescription");
            return (Criteria) this;
        }

        public Criteria andCoursedescriptionLessThanOrEqualTo(String value) {
            addCriterion("courseDescription <=", value, "coursedescription");
            return (Criteria) this;
        }

        public Criteria andCoursedescriptionLike(String value) {
            addCriterion("courseDescription like", value, "coursedescription");
            return (Criteria) this;
        }

        public Criteria andCoursedescriptionNotLike(String value) {
            addCriterion("courseDescription not like", value, "coursedescription");
            return (Criteria) this;
        }

        public Criteria andCoursedescriptionIn(List<String> values) {
            addCriterion("courseDescription in", values, "coursedescription");
            return (Criteria) this;
        }

        public Criteria andCoursedescriptionNotIn(List<String> values) {
            addCriterion("courseDescription not in", values, "coursedescription");
            return (Criteria) this;
        }

        public Criteria andCoursedescriptionBetween(String value1, String value2) {
            addCriterion("courseDescription between", value1, value2, "coursedescription");
            return (Criteria) this;
        }

        public Criteria andCoursedescriptionNotBetween(String value1, String value2) {
            addCriterion("courseDescription not between", value1, value2, "coursedescription");
            return (Criteria) this;
        }

        public Criteria andTestcontentIsNull() {
            addCriterion("testContent is null");
            return (Criteria) this;
        }

        public Criteria andTestcontentIsNotNull() {
            addCriterion("testContent is not null");
            return (Criteria) this;
        }

        public Criteria andTestcontentEqualTo(String value) {
            addCriterion("testContent =", value, "testcontent");
            return (Criteria) this;
        }

        public Criteria andTestcontentNotEqualTo(String value) {
            addCriterion("testContent <>", value, "testcontent");
            return (Criteria) this;
        }

        public Criteria andTestcontentGreaterThan(String value) {
            addCriterion("testContent >", value, "testcontent");
            return (Criteria) this;
        }

        public Criteria andTestcontentGreaterThanOrEqualTo(String value) {
            addCriterion("testContent >=", value, "testcontent");
            return (Criteria) this;
        }

        public Criteria andTestcontentLessThan(String value) {
            addCriterion("testContent <", value, "testcontent");
            return (Criteria) this;
        }

        public Criteria andTestcontentLessThanOrEqualTo(String value) {
            addCriterion("testContent <=", value, "testcontent");
            return (Criteria) this;
        }

        public Criteria andTestcontentLike(String value) {
            addCriterion("testContent like", value, "testcontent");
            return (Criteria) this;
        }

        public Criteria andTestcontentNotLike(String value) {
            addCriterion("testContent not like", value, "testcontent");
            return (Criteria) this;
        }

        public Criteria andTestcontentIn(List<String> values) {
            addCriterion("testContent in", values, "testcontent");
            return (Criteria) this;
        }

        public Criteria andTestcontentNotIn(List<String> values) {
            addCriterion("testContent not in", values, "testcontent");
            return (Criteria) this;
        }

        public Criteria andTestcontentBetween(String value1, String value2) {
            addCriterion("testContent between", value1, value2, "testcontent");
            return (Criteria) this;
        }

        public Criteria andTestcontentNotBetween(String value1, String value2) {
            addCriterion("testContent not between", value1, value2, "testcontent");
            return (Criteria) this;
        }

        public Criteria andTeststandardIsNull() {
            addCriterion("testStandard is null");
            return (Criteria) this;
        }

        public Criteria andTeststandardIsNotNull() {
            addCriterion("testStandard is not null");
            return (Criteria) this;
        }

        public Criteria andTeststandardEqualTo(String value) {
            addCriterion("testStandard =", value, "teststandard");
            return (Criteria) this;
        }

        public Criteria andTeststandardNotEqualTo(String value) {
            addCriterion("testStandard <>", value, "teststandard");
            return (Criteria) this;
        }

        public Criteria andTeststandardGreaterThan(String value) {
            addCriterion("testStandard >", value, "teststandard");
            return (Criteria) this;
        }

        public Criteria andTeststandardGreaterThanOrEqualTo(String value) {
            addCriterion("testStandard >=", value, "teststandard");
            return (Criteria) this;
        }

        public Criteria andTeststandardLessThan(String value) {
            addCriterion("testStandard <", value, "teststandard");
            return (Criteria) this;
        }

        public Criteria andTeststandardLessThanOrEqualTo(String value) {
            addCriterion("testStandard <=", value, "teststandard");
            return (Criteria) this;
        }

        public Criteria andTeststandardLike(String value) {
            addCriterion("testStandard like", value, "teststandard");
            return (Criteria) this;
        }

        public Criteria andTeststandardNotLike(String value) {
            addCriterion("testStandard not like", value, "teststandard");
            return (Criteria) this;
        }

        public Criteria andTeststandardIn(List<String> values) {
            addCriterion("testStandard in", values, "teststandard");
            return (Criteria) this;
        }

        public Criteria andTeststandardNotIn(List<String> values) {
            addCriterion("testStandard not in", values, "teststandard");
            return (Criteria) this;
        }

        public Criteria andTeststandardBetween(String value1, String value2) {
            addCriterion("testStandard between", value1, value2, "teststandard");
            return (Criteria) this;
        }

        public Criteria andTeststandardNotBetween(String value1, String value2) {
            addCriterion("testStandard not between", value1, value2, "teststandard");
            return (Criteria) this;
        }

        public Criteria andResulttypeIsNull() {
            addCriterion("resultType is null");
            return (Criteria) this;
        }

        public Criteria andResulttypeIsNotNull() {
            addCriterion("resultType is not null");
            return (Criteria) this;
        }

        public Criteria andResulttypeEqualTo(String value) {
            addCriterion("resultType =", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotEqualTo(String value) {
            addCriterion("resultType <>", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeGreaterThan(String value) {
            addCriterion("resultType >", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeGreaterThanOrEqualTo(String value) {
            addCriterion("resultType >=", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeLessThan(String value) {
            addCriterion("resultType <", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeLessThanOrEqualTo(String value) {
            addCriterion("resultType <=", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeLike(String value) {
            addCriterion("resultType like", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotLike(String value) {
            addCriterion("resultType not like", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeIn(List<String> values) {
            addCriterion("resultType in", values, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotIn(List<String> values) {
            addCriterion("resultType not in", values, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeBetween(String value1, String value2) {
            addCriterion("resultType between", value1, value2, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotBetween(String value1, String value2) {
            addCriterion("resultType not between", value1, value2, "resulttype");
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