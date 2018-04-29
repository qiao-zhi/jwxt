package cn.xm.jwxt.bean.arrangeCourse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApArrangeCourseTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApArrangeCourseTaskExample() {
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

        public Criteria andArrangeTaskIdIsNull() {
            addCriterion("arrange_task_id is null");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdIsNotNull() {
            addCriterion("arrange_task_id is not null");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdEqualTo(String value) {
            addCriterion("arrange_task_id =", value, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdNotEqualTo(String value) {
            addCriterion("arrange_task_id <>", value, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdGreaterThan(String value) {
            addCriterion("arrange_task_id >", value, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("arrange_task_id >=", value, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdLessThan(String value) {
            addCriterion("arrange_task_id <", value, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdLessThanOrEqualTo(String value) {
            addCriterion("arrange_task_id <=", value, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdLike(String value) {
            addCriterion("arrange_task_id like", value, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdNotLike(String value) {
            addCriterion("arrange_task_id not like", value, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdIn(List<String> values) {
            addCriterion("arrange_task_id in", values, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdNotIn(List<String> values) {
            addCriterion("arrange_task_id not in", values, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdBetween(String value1, String value2) {
            addCriterion("arrange_task_id between", value1, value2, "arrangeTaskId");
            return (Criteria) this;
        }

        public Criteria andArrangeTaskIdNotBetween(String value1, String value2) {
            addCriterion("arrange_task_id not between", value1, value2, "arrangeTaskId");
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

        public Criteria andNoticeBookNameIsNull() {
            addCriterion("notice_book_name is null");
            return (Criteria) this;
        }

        public Criteria andNoticeBookNameIsNotNull() {
            addCriterion("notice_book_name is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeBookNameEqualTo(String value) {
            addCriterion("notice_book_name =", value, "noticeBookName");
            return (Criteria) this;
        }

        public Criteria andNoticeBookNameNotEqualTo(String value) {
            addCriterion("notice_book_name <>", value, "noticeBookName");
            return (Criteria) this;
        }

        public Criteria andNoticeBookNameGreaterThan(String value) {
            addCriterion("notice_book_name >", value, "noticeBookName");
            return (Criteria) this;
        }

        public Criteria andNoticeBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("notice_book_name >=", value, "noticeBookName");
            return (Criteria) this;
        }

        public Criteria andNoticeBookNameLessThan(String value) {
            addCriterion("notice_book_name <", value, "noticeBookName");
            return (Criteria) this;
        }

        public Criteria andNoticeBookNameLessThanOrEqualTo(String value) {
            addCriterion("notice_book_name <=", value, "noticeBookName");
            return (Criteria) this;
        }

        public Criteria andNoticeBookNameLike(String value) {
            addCriterion("notice_book_name like", value, "noticeBookName");
            return (Criteria) this;
        }

        public Criteria andNoticeBookNameNotLike(String value) {
            addCriterion("notice_book_name not like", value, "noticeBookName");
            return (Criteria) this;
        }

        public Criteria andNoticeBookNameIn(List<String> values) {
            addCriterion("notice_book_name in", values, "noticeBookName");
            return (Criteria) this;
        }

        public Criteria andNoticeBookNameNotIn(List<String> values) {
            addCriterion("notice_book_name not in", values, "noticeBookName");
            return (Criteria) this;
        }

        public Criteria andNoticeBookNameBetween(String value1, String value2) {
            addCriterion("notice_book_name between", value1, value2, "noticeBookName");
            return (Criteria) this;
        }

        public Criteria andNoticeBookNameNotBetween(String value1, String value2) {
            addCriterion("notice_book_name not between", value1, value2, "noticeBookName");
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

        public Criteria andMajorIdIsNull() {
            addCriterion("major_id is null");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNotNull() {
            addCriterion("major_id is not null");
            return (Criteria) this;
        }

        public Criteria andMajorIdEqualTo(String value) {
            addCriterion("major_id =", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotEqualTo(String value) {
            addCriterion("major_id <>", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThan(String value) {
            addCriterion("major_id >", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThanOrEqualTo(String value) {
            addCriterion("major_id >=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThan(String value) {
            addCriterion("major_id <", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThanOrEqualTo(String value) {
            addCriterion("major_id <=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLike(String value) {
            addCriterion("major_id like", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotLike(String value) {
            addCriterion("major_id not like", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIn(List<String> values) {
            addCriterion("major_id in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotIn(List<String> values) {
            addCriterion("major_id not in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdBetween(String value1, String value2) {
            addCriterion("major_id between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotBetween(String value1, String value2) {
            addCriterion("major_id not between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andAcademicYearIsNull() {
            addCriterion("academic_year is null");
            return (Criteria) this;
        }

        public Criteria andAcademicYearIsNotNull() {
            addCriterion("academic_year is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicYearEqualTo(String value) {
            addCriterion("academic_year =", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearNotEqualTo(String value) {
            addCriterion("academic_year <>", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearGreaterThan(String value) {
            addCriterion("academic_year >", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearGreaterThanOrEqualTo(String value) {
            addCriterion("academic_year >=", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearLessThan(String value) {
            addCriterion("academic_year <", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearLessThanOrEqualTo(String value) {
            addCriterion("academic_year <=", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearLike(String value) {
            addCriterion("academic_year like", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearNotLike(String value) {
            addCriterion("academic_year not like", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearIn(List<String> values) {
            addCriterion("academic_year in", values, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearNotIn(List<String> values) {
            addCriterion("academic_year not in", values, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearBetween(String value1, String value2) {
            addCriterion("academic_year between", value1, value2, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearNotBetween(String value1, String value2) {
            addCriterion("academic_year not between", value1, value2, "academicYear");
            return (Criteria) this;
        }

        public Criteria andTermIsNull() {
            addCriterion("term is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("term is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(String value) {
            addCriterion("term =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(String value) {
            addCriterion("term <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(String value) {
            addCriterion("term >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(String value) {
            addCriterion("term >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(String value) {
            addCriterion("term <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(String value) {
            addCriterion("term <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLike(String value) {
            addCriterion("term like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotLike(String value) {
            addCriterion("term not like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<String> values) {
            addCriterion("term in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<String> values) {
            addCriterion("term not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(String value1, String value2) {
            addCriterion("term between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(String value1, String value2) {
            addCriterion("term not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andOriginatorNameIsNull() {
            addCriterion("originator_name is null");
            return (Criteria) this;
        }

        public Criteria andOriginatorNameIsNotNull() {
            addCriterion("originator_name is not null");
            return (Criteria) this;
        }

        public Criteria andOriginatorNameEqualTo(String value) {
            addCriterion("originator_name =", value, "originatorName");
            return (Criteria) this;
        }

        public Criteria andOriginatorNameNotEqualTo(String value) {
            addCriterion("originator_name <>", value, "originatorName");
            return (Criteria) this;
        }

        public Criteria andOriginatorNameGreaterThan(String value) {
            addCriterion("originator_name >", value, "originatorName");
            return (Criteria) this;
        }

        public Criteria andOriginatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("originator_name >=", value, "originatorName");
            return (Criteria) this;
        }

        public Criteria andOriginatorNameLessThan(String value) {
            addCriterion("originator_name <", value, "originatorName");
            return (Criteria) this;
        }

        public Criteria andOriginatorNameLessThanOrEqualTo(String value) {
            addCriterion("originator_name <=", value, "originatorName");
            return (Criteria) this;
        }

        public Criteria andOriginatorNameLike(String value) {
            addCriterion("originator_name like", value, "originatorName");
            return (Criteria) this;
        }

        public Criteria andOriginatorNameNotLike(String value) {
            addCriterion("originator_name not like", value, "originatorName");
            return (Criteria) this;
        }

        public Criteria andOriginatorNameIn(List<String> values) {
            addCriterion("originator_name in", values, "originatorName");
            return (Criteria) this;
        }

        public Criteria andOriginatorNameNotIn(List<String> values) {
            addCriterion("originator_name not in", values, "originatorName");
            return (Criteria) this;
        }

        public Criteria andOriginatorNameBetween(String value1, String value2) {
            addCriterion("originator_name between", value1, value2, "originatorName");
            return (Criteria) this;
        }

        public Criteria andOriginatorNameNotBetween(String value1, String value2) {
            addCriterion("originator_name not between", value1, value2, "originatorName");
            return (Criteria) this;
        }

        public Criteria andOriginatorIdIsNull() {
            addCriterion("originator_id is null");
            return (Criteria) this;
        }

        public Criteria andOriginatorIdIsNotNull() {
            addCriterion("originator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOriginatorIdEqualTo(String value) {
            addCriterion("originator_id =", value, "originatorId");
            return (Criteria) this;
        }

        public Criteria andOriginatorIdNotEqualTo(String value) {
            addCriterion("originator_id <>", value, "originatorId");
            return (Criteria) this;
        }

        public Criteria andOriginatorIdGreaterThan(String value) {
            addCriterion("originator_id >", value, "originatorId");
            return (Criteria) this;
        }

        public Criteria andOriginatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("originator_id >=", value, "originatorId");
            return (Criteria) this;
        }

        public Criteria andOriginatorIdLessThan(String value) {
            addCriterion("originator_id <", value, "originatorId");
            return (Criteria) this;
        }

        public Criteria andOriginatorIdLessThanOrEqualTo(String value) {
            addCriterion("originator_id <=", value, "originatorId");
            return (Criteria) this;
        }

        public Criteria andOriginatorIdLike(String value) {
            addCriterion("originator_id like", value, "originatorId");
            return (Criteria) this;
        }

        public Criteria andOriginatorIdNotLike(String value) {
            addCriterion("originator_id not like", value, "originatorId");
            return (Criteria) this;
        }

        public Criteria andOriginatorIdIn(List<String> values) {
            addCriterion("originator_id in", values, "originatorId");
            return (Criteria) this;
        }

        public Criteria andOriginatorIdNotIn(List<String> values) {
            addCriterion("originator_id not in", values, "originatorId");
            return (Criteria) this;
        }

        public Criteria andOriginatorIdBetween(String value1, String value2) {
            addCriterion("originator_id between", value1, value2, "originatorId");
            return (Criteria) this;
        }

        public Criteria andOriginatorIdNotBetween(String value1, String value2) {
            addCriterion("originator_id not between", value1, value2, "originatorId");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeIsNull() {
            addCriterion("task_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeIsNotNull() {
            addCriterion("task_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeEqualTo(Date value) {
            addCriterion("task_create_time =", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotEqualTo(Date value) {
            addCriterion("task_create_time <>", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeGreaterThan(Date value) {
            addCriterion("task_create_time >", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("task_create_time >=", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeLessThan(Date value) {
            addCriterion("task_create_time <", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("task_create_time <=", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeIn(List<Date> values) {
            addCriterion("task_create_time in", values, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotIn(List<Date> values) {
            addCriterion("task_create_time not in", values, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeBetween(Date value1, Date value2) {
            addCriterion("task_create_time between", value1, value2, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("task_create_time not between", value1, value2, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptTimeIsNull() {
            addCriterion("task_receipt_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptTimeIsNotNull() {
            addCriterion("task_receipt_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptTimeEqualTo(Date value) {
            addCriterion("task_receipt_time =", value, "taskReceiptTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptTimeNotEqualTo(Date value) {
            addCriterion("task_receipt_time <>", value, "taskReceiptTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptTimeGreaterThan(Date value) {
            addCriterion("task_receipt_time >", value, "taskReceiptTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("task_receipt_time >=", value, "taskReceiptTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptTimeLessThan(Date value) {
            addCriterion("task_receipt_time <", value, "taskReceiptTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptTimeLessThanOrEqualTo(Date value) {
            addCriterion("task_receipt_time <=", value, "taskReceiptTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptTimeIn(List<Date> values) {
            addCriterion("task_receipt_time in", values, "taskReceiptTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptTimeNotIn(List<Date> values) {
            addCriterion("task_receipt_time not in", values, "taskReceiptTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptTimeBetween(Date value1, Date value2) {
            addCriterion("task_receipt_time between", value1, value2, "taskReceiptTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptTimeNotBetween(Date value1, Date value2) {
            addCriterion("task_receipt_time not between", value1, value2, "taskReceiptTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptNameIsNull() {
            addCriterion("task_receipt_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptNameIsNotNull() {
            addCriterion("task_receipt_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptNameEqualTo(String value) {
            addCriterion("task_receipt_name =", value, "taskReceiptName");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptNameNotEqualTo(String value) {
            addCriterion("task_receipt_name <>", value, "taskReceiptName");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptNameGreaterThan(String value) {
            addCriterion("task_receipt_name >", value, "taskReceiptName");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_receipt_name >=", value, "taskReceiptName");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptNameLessThan(String value) {
            addCriterion("task_receipt_name <", value, "taskReceiptName");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptNameLessThanOrEqualTo(String value) {
            addCriterion("task_receipt_name <=", value, "taskReceiptName");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptNameLike(String value) {
            addCriterion("task_receipt_name like", value, "taskReceiptName");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptNameNotLike(String value) {
            addCriterion("task_receipt_name not like", value, "taskReceiptName");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptNameIn(List<String> values) {
            addCriterion("task_receipt_name in", values, "taskReceiptName");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptNameNotIn(List<String> values) {
            addCriterion("task_receipt_name not in", values, "taskReceiptName");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptNameBetween(String value1, String value2) {
            addCriterion("task_receipt_name between", value1, value2, "taskReceiptName");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptNameNotBetween(String value1, String value2) {
            addCriterion("task_receipt_name not between", value1, value2, "taskReceiptName");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptIdIsNull() {
            addCriterion("task_receipt_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptIdIsNotNull() {
            addCriterion("task_receipt_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptIdEqualTo(String value) {
            addCriterion("task_receipt_id =", value, "taskReceiptId");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptIdNotEqualTo(String value) {
            addCriterion("task_receipt_id <>", value, "taskReceiptId");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptIdGreaterThan(String value) {
            addCriterion("task_receipt_id >", value, "taskReceiptId");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_receipt_id >=", value, "taskReceiptId");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptIdLessThan(String value) {
            addCriterion("task_receipt_id <", value, "taskReceiptId");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptIdLessThanOrEqualTo(String value) {
            addCriterion("task_receipt_id <=", value, "taskReceiptId");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptIdLike(String value) {
            addCriterion("task_receipt_id like", value, "taskReceiptId");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptIdNotLike(String value) {
            addCriterion("task_receipt_id not like", value, "taskReceiptId");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptIdIn(List<String> values) {
            addCriterion("task_receipt_id in", values, "taskReceiptId");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptIdNotIn(List<String> values) {
            addCriterion("task_receipt_id not in", values, "taskReceiptId");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptIdBetween(String value1, String value2) {
            addCriterion("task_receipt_id between", value1, value2, "taskReceiptId");
            return (Criteria) this;
        }

        public Criteria andTaskReceiptIdNotBetween(String value1, String value2) {
            addCriterion("task_receipt_id not between", value1, value2, "taskReceiptId");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNull() {
            addCriterion("task_status is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNotNull() {
            addCriterion("task_status is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusEqualTo(String value) {
            addCriterion("task_status =", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotEqualTo(String value) {
            addCriterion("task_status <>", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThan(String value) {
            addCriterion("task_status >", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThanOrEqualTo(String value) {
            addCriterion("task_status >=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThan(String value) {
            addCriterion("task_status <", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThanOrEqualTo(String value) {
            addCriterion("task_status <=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLike(String value) {
            addCriterion("task_status like", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotLike(String value) {
            addCriterion("task_status not like", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIn(List<String> values) {
            addCriterion("task_status in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotIn(List<String> values) {
            addCriterion("task_status not in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusBetween(String value1, String value2) {
            addCriterion("task_status between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotBetween(String value1, String value2) {
            addCriterion("task_status not between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(String value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(String value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(String value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(String value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLike(String value) {
            addCriterion("is_delete like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotLike(String value) {
            addCriterion("is_delete not like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<String> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<String> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(String value1, String value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(String value1, String value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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