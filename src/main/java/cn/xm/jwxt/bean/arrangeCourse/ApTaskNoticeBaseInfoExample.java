package cn.xm.jwxt.bean.arrangeCourse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApTaskNoticeBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApTaskNoticeBaseInfoExample() {
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

        public Criteria andAcademicIdIsNull() {
            addCriterion("academic_id is null");
            return (Criteria) this;
        }

        public Criteria andAcademicIdIsNotNull() {
            addCriterion("academic_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicIdEqualTo(String value) {
            addCriterion("academic_id =", value, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdNotEqualTo(String value) {
            addCriterion("academic_id <>", value, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdGreaterThan(String value) {
            addCriterion("academic_id >", value, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdGreaterThanOrEqualTo(String value) {
            addCriterion("academic_id >=", value, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdLessThan(String value) {
            addCriterion("academic_id <", value, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdLessThanOrEqualTo(String value) {
            addCriterion("academic_id <=", value, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdLike(String value) {
            addCriterion("academic_id like", value, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdNotLike(String value) {
            addCriterion("academic_id not like", value, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdIn(List<String> values) {
            addCriterion("academic_id in", values, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdNotIn(List<String> values) {
            addCriterion("academic_id not in", values, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdBetween(String value1, String value2) {
            addCriterion("academic_id between", value1, value2, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdNotBetween(String value1, String value2) {
            addCriterion("academic_id not between", value1, value2, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicNameIsNull() {
            addCriterion("academic_name is null");
            return (Criteria) this;
        }

        public Criteria andAcademicNameIsNotNull() {
            addCriterion("academic_name is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicNameEqualTo(String value) {
            addCriterion("academic_name =", value, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameNotEqualTo(String value) {
            addCriterion("academic_name <>", value, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameGreaterThan(String value) {
            addCriterion("academic_name >", value, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameGreaterThanOrEqualTo(String value) {
            addCriterion("academic_name >=", value, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameLessThan(String value) {
            addCriterion("academic_name <", value, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameLessThanOrEqualTo(String value) {
            addCriterion("academic_name <=", value, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameLike(String value) {
            addCriterion("academic_name like", value, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameNotLike(String value) {
            addCriterion("academic_name not like", value, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameIn(List<String> values) {
            addCriterion("academic_name in", values, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameNotIn(List<String> values) {
            addCriterion("academic_name not in", values, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameBetween(String value1, String value2) {
            addCriterion("academic_name between", value1, value2, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameNotBetween(String value1, String value2) {
            addCriterion("academic_name not between", value1, value2, "academicName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameIsNull() {
            addCriterion("creater_name is null");
            return (Criteria) this;
        }

        public Criteria andCreaterNameIsNotNull() {
            addCriterion("creater_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterNameEqualTo(String value) {
            addCriterion("creater_name =", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameNotEqualTo(String value) {
            addCriterion("creater_name <>", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameGreaterThan(String value) {
            addCriterion("creater_name >", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameGreaterThanOrEqualTo(String value) {
            addCriterion("creater_name >=", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameLessThan(String value) {
            addCriterion("creater_name <", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameLessThanOrEqualTo(String value) {
            addCriterion("creater_name <=", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameLike(String value) {
            addCriterion("creater_name like", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameNotLike(String value) {
            addCriterion("creater_name not like", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameIn(List<String> values) {
            addCriterion("creater_name in", values, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameNotIn(List<String> values) {
            addCriterion("creater_name not in", values, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameBetween(String value1, String value2) {
            addCriterion("creater_name between", value1, value2, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameNotBetween(String value1, String value2) {
            addCriterion("creater_name not between", value1, value2, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNull() {
            addCriterion("creater_id is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNotNull() {
            addCriterion("creater_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdEqualTo(String value) {
            addCriterion("creater_id =", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotEqualTo(String value) {
            addCriterion("creater_id <>", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThan(String value) {
            addCriterion("creater_id >", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThanOrEqualTo(String value) {
            addCriterion("creater_id >=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThan(String value) {
            addCriterion("creater_id <", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThanOrEqualTo(String value) {
            addCriterion("creater_id <=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLike(String value) {
            addCriterion("creater_id like", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotLike(String value) {
            addCriterion("creater_id not like", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIn(List<String> values) {
            addCriterion("creater_id in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotIn(List<String> values) {
            addCriterion("creater_id not in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdBetween(String value1, String value2) {
            addCriterion("creater_id between", value1, value2, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotBetween(String value1, String value2) {
            addCriterion("creater_id not between", value1, value2, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIsInputIsNull() {
            addCriterion("is_input is null");
            return (Criteria) this;
        }

        public Criteria andIsInputIsNotNull() {
            addCriterion("is_input is not null");
            return (Criteria) this;
        }

        public Criteria andIsInputEqualTo(String value) {
            addCriterion("is_input =", value, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputNotEqualTo(String value) {
            addCriterion("is_input <>", value, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputGreaterThan(String value) {
            addCriterion("is_input >", value, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputGreaterThanOrEqualTo(String value) {
            addCriterion("is_input >=", value, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputLessThan(String value) {
            addCriterion("is_input <", value, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputLessThanOrEqualTo(String value) {
            addCriterion("is_input <=", value, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputLike(String value) {
            addCriterion("is_input like", value, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputNotLike(String value) {
            addCriterion("is_input not like", value, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputIn(List<String> values) {
            addCriterion("is_input in", values, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputNotIn(List<String> values) {
            addCriterion("is_input not in", values, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputBetween(String value1, String value2) {
            addCriterion("is_input between", value1, value2, "isInput");
            return (Criteria) this;
        }

        public Criteria andIsInputNotBetween(String value1, String value2) {
            addCriterion("is_input not between", value1, value2, "isInput");
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