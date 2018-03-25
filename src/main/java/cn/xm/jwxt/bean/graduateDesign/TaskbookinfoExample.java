package cn.xm.jwxt.bean.graduateDesign;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TaskbookinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskbookinfoExample() {
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

        public Criteria andBookidIsNull() {
            addCriterion("bookid is null");
            return (Criteria) this;
        }

        public Criteria andBookidIsNotNull() {
            addCriterion("bookid is not null");
            return (Criteria) this;
        }

        public Criteria andBookidEqualTo(Integer value) {
            addCriterion("bookid =", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotEqualTo(Integer value) {
            addCriterion("bookid <>", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThan(Integer value) {
            addCriterion("bookid >", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookid >=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThan(Integer value) {
            addCriterion("bookid <", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThanOrEqualTo(Integer value) {
            addCriterion("bookid <=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidIn(List<Integer> values) {
            addCriterion("bookid in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotIn(List<Integer> values) {
            addCriterion("bookid not in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidBetween(Integer value1, Integer value2) {
            addCriterion("bookid between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotBetween(Integer value1, Integer value2) {
            addCriterion("bookid not between", value1, value2, "bookid");
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

        public Criteria andTaskcontentIsNull() {
            addCriterion("taskContent is null");
            return (Criteria) this;
        }

        public Criteria andTaskcontentIsNotNull() {
            addCriterion("taskContent is not null");
            return (Criteria) this;
        }

        public Criteria andTaskcontentEqualTo(String value) {
            addCriterion("taskContent =", value, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentNotEqualTo(String value) {
            addCriterion("taskContent <>", value, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentGreaterThan(String value) {
            addCriterion("taskContent >", value, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentGreaterThanOrEqualTo(String value) {
            addCriterion("taskContent >=", value, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentLessThan(String value) {
            addCriterion("taskContent <", value, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentLessThanOrEqualTo(String value) {
            addCriterion("taskContent <=", value, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentLike(String value) {
            addCriterion("taskContent like", value, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentNotLike(String value) {
            addCriterion("taskContent not like", value, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentIn(List<String> values) {
            addCriterion("taskContent in", values, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentNotIn(List<String> values) {
            addCriterion("taskContent not in", values, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentBetween(String value1, String value2) {
            addCriterion("taskContent between", value1, value2, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentNotBetween(String value1, String value2) {
            addCriterion("taskContent not between", value1, value2, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskedittimeIsNull() {
            addCriterion("taskEditTime is null");
            return (Criteria) this;
        }

        public Criteria andTaskedittimeIsNotNull() {
            addCriterion("taskEditTime is not null");
            return (Criteria) this;
        }

        public Criteria andTaskedittimeEqualTo(Date value) {
            addCriterionForJDBCDate("taskEditTime =", value, "taskedittime");
            return (Criteria) this;
        }

        public Criteria andTaskedittimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("taskEditTime <>", value, "taskedittime");
            return (Criteria) this;
        }

        public Criteria andTaskedittimeGreaterThan(Date value) {
            addCriterionForJDBCDate("taskEditTime >", value, "taskedittime");
            return (Criteria) this;
        }

        public Criteria andTaskedittimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("taskEditTime >=", value, "taskedittime");
            return (Criteria) this;
        }

        public Criteria andTaskedittimeLessThan(Date value) {
            addCriterionForJDBCDate("taskEditTime <", value, "taskedittime");
            return (Criteria) this;
        }

        public Criteria andTaskedittimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("taskEditTime <=", value, "taskedittime");
            return (Criteria) this;
        }

        public Criteria andTaskedittimeIn(List<Date> values) {
            addCriterionForJDBCDate("taskEditTime in", values, "taskedittime");
            return (Criteria) this;
        }

        public Criteria andTaskedittimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("taskEditTime not in", values, "taskedittime");
            return (Criteria) this;
        }

        public Criteria andTaskedittimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("taskEditTime between", value1, value2, "taskedittime");
            return (Criteria) this;
        }

        public Criteria andTaskedittimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("taskEditTime not between", value1, value2, "taskedittime");
            return (Criteria) this;
        }

        public Criteria andTasksendtimeIsNull() {
            addCriterion("taskSendTime is null");
            return (Criteria) this;
        }

        public Criteria andTasksendtimeIsNotNull() {
            addCriterion("taskSendTime is not null");
            return (Criteria) this;
        }

        public Criteria andTasksendtimeEqualTo(Date value) {
            addCriterionForJDBCDate("taskSendTime =", value, "tasksendtime");
            return (Criteria) this;
        }

        public Criteria andTasksendtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("taskSendTime <>", value, "tasksendtime");
            return (Criteria) this;
        }

        public Criteria andTasksendtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("taskSendTime >", value, "tasksendtime");
            return (Criteria) this;
        }

        public Criteria andTasksendtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("taskSendTime >=", value, "tasksendtime");
            return (Criteria) this;
        }

        public Criteria andTasksendtimeLessThan(Date value) {
            addCriterionForJDBCDate("taskSendTime <", value, "tasksendtime");
            return (Criteria) this;
        }

        public Criteria andTasksendtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("taskSendTime <=", value, "tasksendtime");
            return (Criteria) this;
        }

        public Criteria andTasksendtimeIn(List<Date> values) {
            addCriterionForJDBCDate("taskSendTime in", values, "tasksendtime");
            return (Criteria) this;
        }

        public Criteria andTasksendtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("taskSendTime not in", values, "tasksendtime");
            return (Criteria) this;
        }

        public Criteria andTasksendtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("taskSendTime between", value1, value2, "tasksendtime");
            return (Criteria) this;
        }

        public Criteria andTasksendtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("taskSendTime not between", value1, value2, "tasksendtime");
            return (Criteria) this;
        }

        public Criteria andTaskcompletetimeIsNull() {
            addCriterion("taskCompleteTime is null");
            return (Criteria) this;
        }

        public Criteria andTaskcompletetimeIsNotNull() {
            addCriterion("taskCompleteTime is not null");
            return (Criteria) this;
        }

        public Criteria andTaskcompletetimeEqualTo(Date value) {
            addCriterionForJDBCDate("taskCompleteTime =", value, "taskcompletetime");
            return (Criteria) this;
        }

        public Criteria andTaskcompletetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("taskCompleteTime <>", value, "taskcompletetime");
            return (Criteria) this;
        }

        public Criteria andTaskcompletetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("taskCompleteTime >", value, "taskcompletetime");
            return (Criteria) this;
        }

        public Criteria andTaskcompletetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("taskCompleteTime >=", value, "taskcompletetime");
            return (Criteria) this;
        }

        public Criteria andTaskcompletetimeLessThan(Date value) {
            addCriterionForJDBCDate("taskCompleteTime <", value, "taskcompletetime");
            return (Criteria) this;
        }

        public Criteria andTaskcompletetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("taskCompleteTime <=", value, "taskcompletetime");
            return (Criteria) this;
        }

        public Criteria andTaskcompletetimeIn(List<Date> values) {
            addCriterionForJDBCDate("taskCompleteTime in", values, "taskcompletetime");
            return (Criteria) this;
        }

        public Criteria andTaskcompletetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("taskCompleteTime not in", values, "taskcompletetime");
            return (Criteria) this;
        }

        public Criteria andTaskcompletetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("taskCompleteTime between", value1, value2, "taskcompletetime");
            return (Criteria) this;
        }

        public Criteria andTaskcompletetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("taskCompleteTime not between", value1, value2, "taskcompletetime");
            return (Criteria) this;
        }

        public Criteria andThesistitleIsNull() {
            addCriterion("thesisTitle is null");
            return (Criteria) this;
        }

        public Criteria andThesistitleIsNotNull() {
            addCriterion("thesisTitle is not null");
            return (Criteria) this;
        }

        public Criteria andThesistitleEqualTo(String value) {
            addCriterion("thesisTitle =", value, "thesistitle");
            return (Criteria) this;
        }

        public Criteria andThesistitleNotEqualTo(String value) {
            addCriterion("thesisTitle <>", value, "thesistitle");
            return (Criteria) this;
        }

        public Criteria andThesistitleGreaterThan(String value) {
            addCriterion("thesisTitle >", value, "thesistitle");
            return (Criteria) this;
        }

        public Criteria andThesistitleGreaterThanOrEqualTo(String value) {
            addCriterion("thesisTitle >=", value, "thesistitle");
            return (Criteria) this;
        }

        public Criteria andThesistitleLessThan(String value) {
            addCriterion("thesisTitle <", value, "thesistitle");
            return (Criteria) this;
        }

        public Criteria andThesistitleLessThanOrEqualTo(String value) {
            addCriterion("thesisTitle <=", value, "thesistitle");
            return (Criteria) this;
        }

        public Criteria andThesistitleLike(String value) {
            addCriterion("thesisTitle like", value, "thesistitle");
            return (Criteria) this;
        }

        public Criteria andThesistitleNotLike(String value) {
            addCriterion("thesisTitle not like", value, "thesistitle");
            return (Criteria) this;
        }

        public Criteria andThesistitleIn(List<String> values) {
            addCriterion("thesisTitle in", values, "thesistitle");
            return (Criteria) this;
        }

        public Criteria andThesistitleNotIn(List<String> values) {
            addCriterion("thesisTitle not in", values, "thesistitle");
            return (Criteria) this;
        }

        public Criteria andThesistitleBetween(String value1, String value2) {
            addCriterion("thesisTitle between", value1, value2, "thesistitle");
            return (Criteria) this;
        }

        public Criteria andThesistitleNotBetween(String value1, String value2) {
            addCriterion("thesisTitle not between", value1, value2, "thesistitle");
            return (Criteria) this;
        }

        public Criteria andDesigntargetrequireIsNull() {
            addCriterion("designTargetRequire is null");
            return (Criteria) this;
        }

        public Criteria andDesigntargetrequireIsNotNull() {
            addCriterion("designTargetRequire is not null");
            return (Criteria) this;
        }

        public Criteria andDesigntargetrequireEqualTo(String value) {
            addCriterion("designTargetRequire =", value, "designtargetrequire");
            return (Criteria) this;
        }

        public Criteria andDesigntargetrequireNotEqualTo(String value) {
            addCriterion("designTargetRequire <>", value, "designtargetrequire");
            return (Criteria) this;
        }

        public Criteria andDesigntargetrequireGreaterThan(String value) {
            addCriterion("designTargetRequire >", value, "designtargetrequire");
            return (Criteria) this;
        }

        public Criteria andDesigntargetrequireGreaterThanOrEqualTo(String value) {
            addCriterion("designTargetRequire >=", value, "designtargetrequire");
            return (Criteria) this;
        }

        public Criteria andDesigntargetrequireLessThan(String value) {
            addCriterion("designTargetRequire <", value, "designtargetrequire");
            return (Criteria) this;
        }

        public Criteria andDesigntargetrequireLessThanOrEqualTo(String value) {
            addCriterion("designTargetRequire <=", value, "designtargetrequire");
            return (Criteria) this;
        }

        public Criteria andDesigntargetrequireLike(String value) {
            addCriterion("designTargetRequire like", value, "designtargetrequire");
            return (Criteria) this;
        }

        public Criteria andDesigntargetrequireNotLike(String value) {
            addCriterion("designTargetRequire not like", value, "designtargetrequire");
            return (Criteria) this;
        }

        public Criteria andDesigntargetrequireIn(List<String> values) {
            addCriterion("designTargetRequire in", values, "designtargetrequire");
            return (Criteria) this;
        }

        public Criteria andDesigntargetrequireNotIn(List<String> values) {
            addCriterion("designTargetRequire not in", values, "designtargetrequire");
            return (Criteria) this;
        }

        public Criteria andDesigntargetrequireBetween(String value1, String value2) {
            addCriterion("designTargetRequire between", value1, value2, "designtargetrequire");
            return (Criteria) this;
        }

        public Criteria andDesigntargetrequireNotBetween(String value1, String value2) {
            addCriterion("designTargetRequire not between", value1, value2, "designtargetrequire");
            return (Criteria) this;
        }

        public Criteria andDesigncontentIsNull() {
            addCriterion("designContent is null");
            return (Criteria) this;
        }

        public Criteria andDesigncontentIsNotNull() {
            addCriterion("designContent is not null");
            return (Criteria) this;
        }

        public Criteria andDesigncontentEqualTo(String value) {
            addCriterion("designContent =", value, "designcontent");
            return (Criteria) this;
        }

        public Criteria andDesigncontentNotEqualTo(String value) {
            addCriterion("designContent <>", value, "designcontent");
            return (Criteria) this;
        }

        public Criteria andDesigncontentGreaterThan(String value) {
            addCriterion("designContent >", value, "designcontent");
            return (Criteria) this;
        }

        public Criteria andDesigncontentGreaterThanOrEqualTo(String value) {
            addCriterion("designContent >=", value, "designcontent");
            return (Criteria) this;
        }

        public Criteria andDesigncontentLessThan(String value) {
            addCriterion("designContent <", value, "designcontent");
            return (Criteria) this;
        }

        public Criteria andDesigncontentLessThanOrEqualTo(String value) {
            addCriterion("designContent <=", value, "designcontent");
            return (Criteria) this;
        }

        public Criteria andDesigncontentLike(String value) {
            addCriterion("designContent like", value, "designcontent");
            return (Criteria) this;
        }

        public Criteria andDesigncontentNotLike(String value) {
            addCriterion("designContent not like", value, "designcontent");
            return (Criteria) this;
        }

        public Criteria andDesigncontentIn(List<String> values) {
            addCriterion("designContent in", values, "designcontent");
            return (Criteria) this;
        }

        public Criteria andDesigncontentNotIn(List<String> values) {
            addCriterion("designContent not in", values, "designcontent");
            return (Criteria) this;
        }

        public Criteria andDesigncontentBetween(String value1, String value2) {
            addCriterion("designContent between", value1, value2, "designcontent");
            return (Criteria) this;
        }

        public Criteria andDesigncontentNotBetween(String value1, String value2) {
            addCriterion("designContent not between", value1, value2, "designcontent");
            return (Criteria) this;
        }

        public Criteria andDesignsubmitfileIsNull() {
            addCriterion("designSubmitFile is null");
            return (Criteria) this;
        }

        public Criteria andDesignsubmitfileIsNotNull() {
            addCriterion("designSubmitFile is not null");
            return (Criteria) this;
        }

        public Criteria andDesignsubmitfileEqualTo(String value) {
            addCriterion("designSubmitFile =", value, "designsubmitfile");
            return (Criteria) this;
        }

        public Criteria andDesignsubmitfileNotEqualTo(String value) {
            addCriterion("designSubmitFile <>", value, "designsubmitfile");
            return (Criteria) this;
        }

        public Criteria andDesignsubmitfileGreaterThan(String value) {
            addCriterion("designSubmitFile >", value, "designsubmitfile");
            return (Criteria) this;
        }

        public Criteria andDesignsubmitfileGreaterThanOrEqualTo(String value) {
            addCriterion("designSubmitFile >=", value, "designsubmitfile");
            return (Criteria) this;
        }

        public Criteria andDesignsubmitfileLessThan(String value) {
            addCriterion("designSubmitFile <", value, "designsubmitfile");
            return (Criteria) this;
        }

        public Criteria andDesignsubmitfileLessThanOrEqualTo(String value) {
            addCriterion("designSubmitFile <=", value, "designsubmitfile");
            return (Criteria) this;
        }

        public Criteria andDesignsubmitfileLike(String value) {
            addCriterion("designSubmitFile like", value, "designsubmitfile");
            return (Criteria) this;
        }

        public Criteria andDesignsubmitfileNotLike(String value) {
            addCriterion("designSubmitFile not like", value, "designsubmitfile");
            return (Criteria) this;
        }

        public Criteria andDesignsubmitfileIn(List<String> values) {
            addCriterion("designSubmitFile in", values, "designsubmitfile");
            return (Criteria) this;
        }

        public Criteria andDesignsubmitfileNotIn(List<String> values) {
            addCriterion("designSubmitFile not in", values, "designsubmitfile");
            return (Criteria) this;
        }

        public Criteria andDesignsubmitfileBetween(String value1, String value2) {
            addCriterion("designSubmitFile between", value1, value2, "designsubmitfile");
            return (Criteria) this;
        }

        public Criteria andDesignsubmitfileNotBetween(String value1, String value2) {
            addCriterion("designSubmitFile not between", value1, value2, "designsubmitfile");
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