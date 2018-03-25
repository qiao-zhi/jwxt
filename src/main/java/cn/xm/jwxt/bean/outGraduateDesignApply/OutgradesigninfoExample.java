package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutgradesigninfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutgradesigninfoExample() {
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

        public Criteria andStudenttitleresultidIsNull() {
            addCriterion("StudentTitleresultID is null");
            return (Criteria) this;
        }

        public Criteria andStudenttitleresultidIsNotNull() {
            addCriterion("StudentTitleresultID is not null");
            return (Criteria) this;
        }

        public Criteria andStudenttitleresultidEqualTo(String value) {
            addCriterion("StudentTitleresultID =", value, "studenttitleresultid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleresultidNotEqualTo(String value) {
            addCriterion("StudentTitleresultID <>", value, "studenttitleresultid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleresultidGreaterThan(String value) {
            addCriterion("StudentTitleresultID >", value, "studenttitleresultid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleresultidGreaterThanOrEqualTo(String value) {
            addCriterion("StudentTitleresultID >=", value, "studenttitleresultid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleresultidLessThan(String value) {
            addCriterion("StudentTitleresultID <", value, "studenttitleresultid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleresultidLessThanOrEqualTo(String value) {
            addCriterion("StudentTitleresultID <=", value, "studenttitleresultid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleresultidLike(String value) {
            addCriterion("StudentTitleresultID like", value, "studenttitleresultid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleresultidNotLike(String value) {
            addCriterion("StudentTitleresultID not like", value, "studenttitleresultid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleresultidIn(List<String> values) {
            addCriterion("StudentTitleresultID in", values, "studenttitleresultid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleresultidNotIn(List<String> values) {
            addCriterion("StudentTitleresultID not in", values, "studenttitleresultid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleresultidBetween(String value1, String value2) {
            addCriterion("StudentTitleresultID between", value1, value2, "studenttitleresultid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleresultidNotBetween(String value1, String value2) {
            addCriterion("StudentTitleresultID not between", value1, value2, "studenttitleresultid");
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andMajorclassIsNull() {
            addCriterion("majorClass is null");
            return (Criteria) this;
        }

        public Criteria andMajorclassIsNotNull() {
            addCriterion("majorClass is not null");
            return (Criteria) this;
        }

        public Criteria andMajorclassEqualTo(String value) {
            addCriterion("majorClass =", value, "majorclass");
            return (Criteria) this;
        }

        public Criteria andMajorclassNotEqualTo(String value) {
            addCriterion("majorClass <>", value, "majorclass");
            return (Criteria) this;
        }

        public Criteria andMajorclassGreaterThan(String value) {
            addCriterion("majorClass >", value, "majorclass");
            return (Criteria) this;
        }

        public Criteria andMajorclassGreaterThanOrEqualTo(String value) {
            addCriterion("majorClass >=", value, "majorclass");
            return (Criteria) this;
        }

        public Criteria andMajorclassLessThan(String value) {
            addCriterion("majorClass <", value, "majorclass");
            return (Criteria) this;
        }

        public Criteria andMajorclassLessThanOrEqualTo(String value) {
            addCriterion("majorClass <=", value, "majorclass");
            return (Criteria) this;
        }

        public Criteria andMajorclassLike(String value) {
            addCriterion("majorClass like", value, "majorclass");
            return (Criteria) this;
        }

        public Criteria andMajorclassNotLike(String value) {
            addCriterion("majorClass not like", value, "majorclass");
            return (Criteria) this;
        }

        public Criteria andMajorclassIn(List<String> values) {
            addCriterion("majorClass in", values, "majorclass");
            return (Criteria) this;
        }

        public Criteria andMajorclassNotIn(List<String> values) {
            addCriterion("majorClass not in", values, "majorclass");
            return (Criteria) this;
        }

        public Criteria andMajorclassBetween(String value1, String value2) {
            addCriterion("majorClass between", value1, value2, "majorclass");
            return (Criteria) this;
        }

        public Criteria andMajorclassNotBetween(String value1, String value2) {
            addCriterion("majorClass not between", value1, value2, "majorclass");
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

        public Criteria andReceiveunitIsNull() {
            addCriterion("receiveUnit is null");
            return (Criteria) this;
        }

        public Criteria andReceiveunitIsNotNull() {
            addCriterion("receiveUnit is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveunitEqualTo(String value) {
            addCriterion("receiveUnit =", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitNotEqualTo(String value) {
            addCriterion("receiveUnit <>", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitGreaterThan(String value) {
            addCriterion("receiveUnit >", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitGreaterThanOrEqualTo(String value) {
            addCriterion("receiveUnit >=", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitLessThan(String value) {
            addCriterion("receiveUnit <", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitLessThanOrEqualTo(String value) {
            addCriterion("receiveUnit <=", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitLike(String value) {
            addCriterion("receiveUnit like", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitNotLike(String value) {
            addCriterion("receiveUnit not like", value, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitIn(List<String> values) {
            addCriterion("receiveUnit in", values, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitNotIn(List<String> values) {
            addCriterion("receiveUnit not in", values, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitBetween(String value1, String value2) {
            addCriterion("receiveUnit between", value1, value2, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andReceiveunitNotBetween(String value1, String value2) {
            addCriterion("receiveUnit not between", value1, value2, "receiveunit");
            return (Criteria) this;
        }

        public Criteria andApplyreasonIsNull() {
            addCriterion("applyReason is null");
            return (Criteria) this;
        }

        public Criteria andApplyreasonIsNotNull() {
            addCriterion("applyReason is not null");
            return (Criteria) this;
        }

        public Criteria andApplyreasonEqualTo(String value) {
            addCriterion("applyReason =", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonNotEqualTo(String value) {
            addCriterion("applyReason <>", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonGreaterThan(String value) {
            addCriterion("applyReason >", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonGreaterThanOrEqualTo(String value) {
            addCriterion("applyReason >=", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonLessThan(String value) {
            addCriterion("applyReason <", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonLessThanOrEqualTo(String value) {
            addCriterion("applyReason <=", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonLike(String value) {
            addCriterion("applyReason like", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonNotLike(String value) {
            addCriterion("applyReason not like", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonIn(List<String> values) {
            addCriterion("applyReason in", values, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonNotIn(List<String> values) {
            addCriterion("applyReason not in", values, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonBetween(String value1, String value2) {
            addCriterion("applyReason between", value1, value2, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonNotBetween(String value1, String value2) {
            addCriterion("applyReason not between", value1, value2, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNull() {
            addCriterion("applyDate is null");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNotNull() {
            addCriterion("applyDate is not null");
            return (Criteria) this;
        }

        public Criteria andApplydateEqualTo(Date value) {
            addCriterion("applyDate =", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotEqualTo(Date value) {
            addCriterion("applyDate <>", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThan(Date value) {
            addCriterion("applyDate >", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThanOrEqualTo(Date value) {
            addCriterion("applyDate >=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThan(Date value) {
            addCriterion("applyDate <", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThanOrEqualTo(Date value) {
            addCriterion("applyDate <=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateIn(List<Date> values) {
            addCriterion("applyDate in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotIn(List<Date> values) {
            addCriterion("applyDate not in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateBetween(Date value1, Date value2) {
            addCriterion("applyDate between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotBetween(Date value1, Date value2) {
            addCriterion("applyDate not between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andStusignurlIsNull() {
            addCriterion("stuSignUrl is null");
            return (Criteria) this;
        }

        public Criteria andStusignurlIsNotNull() {
            addCriterion("stuSignUrl is not null");
            return (Criteria) this;
        }

        public Criteria andStusignurlEqualTo(String value) {
            addCriterion("stuSignUrl =", value, "stusignurl");
            return (Criteria) this;
        }

        public Criteria andStusignurlNotEqualTo(String value) {
            addCriterion("stuSignUrl <>", value, "stusignurl");
            return (Criteria) this;
        }

        public Criteria andStusignurlGreaterThan(String value) {
            addCriterion("stuSignUrl >", value, "stusignurl");
            return (Criteria) this;
        }

        public Criteria andStusignurlGreaterThanOrEqualTo(String value) {
            addCriterion("stuSignUrl >=", value, "stusignurl");
            return (Criteria) this;
        }

        public Criteria andStusignurlLessThan(String value) {
            addCriterion("stuSignUrl <", value, "stusignurl");
            return (Criteria) this;
        }

        public Criteria andStusignurlLessThanOrEqualTo(String value) {
            addCriterion("stuSignUrl <=", value, "stusignurl");
            return (Criteria) this;
        }

        public Criteria andStusignurlLike(String value) {
            addCriterion("stuSignUrl like", value, "stusignurl");
            return (Criteria) this;
        }

        public Criteria andStusignurlNotLike(String value) {
            addCriterion("stuSignUrl not like", value, "stusignurl");
            return (Criteria) this;
        }

        public Criteria andStusignurlIn(List<String> values) {
            addCriterion("stuSignUrl in", values, "stusignurl");
            return (Criteria) this;
        }

        public Criteria andStusignurlNotIn(List<String> values) {
            addCriterion("stuSignUrl not in", values, "stusignurl");
            return (Criteria) this;
        }

        public Criteria andStusignurlBetween(String value1, String value2) {
            addCriterion("stuSignUrl between", value1, value2, "stusignurl");
            return (Criteria) this;
        }

        public Criteria andStusignurlNotBetween(String value1, String value2) {
            addCriterion("stuSignUrl not between", value1, value2, "stusignurl");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIscommitIsNull() {
            addCriterion("isCommit is null");
            return (Criteria) this;
        }

        public Criteria andIscommitIsNotNull() {
            addCriterion("isCommit is not null");
            return (Criteria) this;
        }

        public Criteria andIscommitEqualTo(String value) {
            addCriterion("isCommit =", value, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitNotEqualTo(String value) {
            addCriterion("isCommit <>", value, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitGreaterThan(String value) {
            addCriterion("isCommit >", value, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitGreaterThanOrEqualTo(String value) {
            addCriterion("isCommit >=", value, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitLessThan(String value) {
            addCriterion("isCommit <", value, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitLessThanOrEqualTo(String value) {
            addCriterion("isCommit <=", value, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitLike(String value) {
            addCriterion("isCommit like", value, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitNotLike(String value) {
            addCriterion("isCommit not like", value, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitIn(List<String> values) {
            addCriterion("isCommit in", values, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitNotIn(List<String> values) {
            addCriterion("isCommit not in", values, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitBetween(String value1, String value2) {
            addCriterion("isCommit between", value1, value2, "iscommit");
            return (Criteria) this;
        }

        public Criteria andIscommitNotBetween(String value1, String value2) {
            addCriterion("isCommit not between", value1, value2, "iscommit");
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