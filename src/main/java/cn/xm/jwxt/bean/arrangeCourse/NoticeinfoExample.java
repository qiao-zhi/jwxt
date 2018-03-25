package cn.xm.jwxt.bean.arrangeCourse;

import java.util.ArrayList;
import java.util.List;

public class NoticeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeinfoExample() {
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

        public Criteria andNoticebookidIsNull() {
            addCriterion("noticeBookId is null");
            return (Criteria) this;
        }

        public Criteria andNoticebookidIsNotNull() {
            addCriterion("noticeBookId is not null");
            return (Criteria) this;
        }

        public Criteria andNoticebookidEqualTo(String value) {
            addCriterion("noticeBookId =", value, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidNotEqualTo(String value) {
            addCriterion("noticeBookId <>", value, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidGreaterThan(String value) {
            addCriterion("noticeBookId >", value, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidGreaterThanOrEqualTo(String value) {
            addCriterion("noticeBookId >=", value, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidLessThan(String value) {
            addCriterion("noticeBookId <", value, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidLessThanOrEqualTo(String value) {
            addCriterion("noticeBookId <=", value, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidLike(String value) {
            addCriterion("noticeBookId like", value, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidNotLike(String value) {
            addCriterion("noticeBookId not like", value, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidIn(List<String> values) {
            addCriterion("noticeBookId in", values, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidNotIn(List<String> values) {
            addCriterion("noticeBookId not in", values, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidBetween(String value1, String value2) {
            addCriterion("noticeBookId between", value1, value2, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebookidNotBetween(String value1, String value2) {
            addCriterion("noticeBookId not between", value1, value2, "noticebookid");
            return (Criteria) this;
        }

        public Criteria andNoticebooknameIsNull() {
            addCriterion("noticeBookName is null");
            return (Criteria) this;
        }

        public Criteria andNoticebooknameIsNotNull() {
            addCriterion("noticeBookName is not null");
            return (Criteria) this;
        }

        public Criteria andNoticebooknameEqualTo(String value) {
            addCriterion("noticeBookName =", value, "noticebookname");
            return (Criteria) this;
        }

        public Criteria andNoticebooknameNotEqualTo(String value) {
            addCriterion("noticeBookName <>", value, "noticebookname");
            return (Criteria) this;
        }

        public Criteria andNoticebooknameGreaterThan(String value) {
            addCriterion("noticeBookName >", value, "noticebookname");
            return (Criteria) this;
        }

        public Criteria andNoticebooknameGreaterThanOrEqualTo(String value) {
            addCriterion("noticeBookName >=", value, "noticebookname");
            return (Criteria) this;
        }

        public Criteria andNoticebooknameLessThan(String value) {
            addCriterion("noticeBookName <", value, "noticebookname");
            return (Criteria) this;
        }

        public Criteria andNoticebooknameLessThanOrEqualTo(String value) {
            addCriterion("noticeBookName <=", value, "noticebookname");
            return (Criteria) this;
        }

        public Criteria andNoticebooknameLike(String value) {
            addCriterion("noticeBookName like", value, "noticebookname");
            return (Criteria) this;
        }

        public Criteria andNoticebooknameNotLike(String value) {
            addCriterion("noticeBookName not like", value, "noticebookname");
            return (Criteria) this;
        }

        public Criteria andNoticebooknameIn(List<String> values) {
            addCriterion("noticeBookName in", values, "noticebookname");
            return (Criteria) this;
        }

        public Criteria andNoticebooknameNotIn(List<String> values) {
            addCriterion("noticeBookName not in", values, "noticebookname");
            return (Criteria) this;
        }

        public Criteria andNoticebooknameBetween(String value1, String value2) {
            addCriterion("noticeBookName between", value1, value2, "noticebookname");
            return (Criteria) this;
        }

        public Criteria andNoticebooknameNotBetween(String value1, String value2) {
            addCriterion("noticeBookName not between", value1, value2, "noticebookname");
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

        public Criteria andInstitutenameIsNull() {
            addCriterion("instituteName is null");
            return (Criteria) this;
        }

        public Criteria andInstitutenameIsNotNull() {
            addCriterion("instituteName is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutenameEqualTo(String value) {
            addCriterion("instituteName =", value, "institutename");
            return (Criteria) this;
        }

        public Criteria andInstitutenameNotEqualTo(String value) {
            addCriterion("instituteName <>", value, "institutename");
            return (Criteria) this;
        }

        public Criteria andInstitutenameGreaterThan(String value) {
            addCriterion("instituteName >", value, "institutename");
            return (Criteria) this;
        }

        public Criteria andInstitutenameGreaterThanOrEqualTo(String value) {
            addCriterion("instituteName >=", value, "institutename");
            return (Criteria) this;
        }

        public Criteria andInstitutenameLessThan(String value) {
            addCriterion("instituteName <", value, "institutename");
            return (Criteria) this;
        }

        public Criteria andInstitutenameLessThanOrEqualTo(String value) {
            addCriterion("instituteName <=", value, "institutename");
            return (Criteria) this;
        }

        public Criteria andInstitutenameLike(String value) {
            addCriterion("instituteName like", value, "institutename");
            return (Criteria) this;
        }

        public Criteria andInstitutenameNotLike(String value) {
            addCriterion("instituteName not like", value, "institutename");
            return (Criteria) this;
        }

        public Criteria andInstitutenameIn(List<String> values) {
            addCriterion("instituteName in", values, "institutename");
            return (Criteria) this;
        }

        public Criteria andInstitutenameNotIn(List<String> values) {
            addCriterion("instituteName not in", values, "institutename");
            return (Criteria) this;
        }

        public Criteria andInstitutenameBetween(String value1, String value2) {
            addCriterion("instituteName between", value1, value2, "institutename");
            return (Criteria) this;
        }

        public Criteria andInstitutenameNotBetween(String value1, String value2) {
            addCriterion("instituteName not between", value1, value2, "institutename");
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