package cn.xm.jwxt.bean.graduateDesign;

import java.util.ArrayList;
import java.util.List;

public class StudenttitleresultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudenttitleresultExample() {
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

        public Criteria andGradesignidIsNull() {
            addCriterion("graDesignID is null");
            return (Criteria) this;
        }

        public Criteria andGradesignidIsNotNull() {
            addCriterion("graDesignID is not null");
            return (Criteria) this;
        }

        public Criteria andGradesignidEqualTo(String value) {
            addCriterion("graDesignID =", value, "gradesignid");
            return (Criteria) this;
        }

        public Criteria andGradesignidNotEqualTo(String value) {
            addCriterion("graDesignID <>", value, "gradesignid");
            return (Criteria) this;
        }

        public Criteria andGradesignidGreaterThan(String value) {
            addCriterion("graDesignID >", value, "gradesignid");
            return (Criteria) this;
        }

        public Criteria andGradesignidGreaterThanOrEqualTo(String value) {
            addCriterion("graDesignID >=", value, "gradesignid");
            return (Criteria) this;
        }

        public Criteria andGradesignidLessThan(String value) {
            addCriterion("graDesignID <", value, "gradesignid");
            return (Criteria) this;
        }

        public Criteria andGradesignidLessThanOrEqualTo(String value) {
            addCriterion("graDesignID <=", value, "gradesignid");
            return (Criteria) this;
        }

        public Criteria andGradesignidLike(String value) {
            addCriterion("graDesignID like", value, "gradesignid");
            return (Criteria) this;
        }

        public Criteria andGradesignidNotLike(String value) {
            addCriterion("graDesignID not like", value, "gradesignid");
            return (Criteria) this;
        }

        public Criteria andGradesignidIn(List<String> values) {
            addCriterion("graDesignID in", values, "gradesignid");
            return (Criteria) this;
        }

        public Criteria andGradesignidNotIn(List<String> values) {
            addCriterion("graDesignID not in", values, "gradesignid");
            return (Criteria) this;
        }

        public Criteria andGradesignidBetween(String value1, String value2) {
            addCriterion("graDesignID between", value1, value2, "gradesignid");
            return (Criteria) this;
        }

        public Criteria andGradesignidNotBetween(String value1, String value2) {
            addCriterion("graDesignID not between", value1, value2, "gradesignid");
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

        public Criteria andTeachertitleidIsNull() {
            addCriterion("teacherTitleID is null");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidIsNotNull() {
            addCriterion("teacherTitleID is not null");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidEqualTo(String value) {
            addCriterion("teacherTitleID =", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidNotEqualTo(String value) {
            addCriterion("teacherTitleID <>", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidGreaterThan(String value) {
            addCriterion("teacherTitleID >", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidGreaterThanOrEqualTo(String value) {
            addCriterion("teacherTitleID >=", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidLessThan(String value) {
            addCriterion("teacherTitleID <", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidLessThanOrEqualTo(String value) {
            addCriterion("teacherTitleID <=", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidLike(String value) {
            addCriterion("teacherTitleID like", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidNotLike(String value) {
            addCriterion("teacherTitleID not like", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidIn(List<String> values) {
            addCriterion("teacherTitleID in", values, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidNotIn(List<String> values) {
            addCriterion("teacherTitleID not in", values, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidBetween(String value1, String value2) {
            addCriterion("teacherTitleID between", value1, value2, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidNotBetween(String value1, String value2) {
            addCriterion("teacherTitleID not between", value1, value2, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andFinallynameIsNull() {
            addCriterion("finallyName is null");
            return (Criteria) this;
        }

        public Criteria andFinallynameIsNotNull() {
            addCriterion("finallyName is not null");
            return (Criteria) this;
        }

        public Criteria andFinallynameEqualTo(String value) {
            addCriterion("finallyName =", value, "finallyname");
            return (Criteria) this;
        }

        public Criteria andFinallynameNotEqualTo(String value) {
            addCriterion("finallyName <>", value, "finallyname");
            return (Criteria) this;
        }

        public Criteria andFinallynameGreaterThan(String value) {
            addCriterion("finallyName >", value, "finallyname");
            return (Criteria) this;
        }

        public Criteria andFinallynameGreaterThanOrEqualTo(String value) {
            addCriterion("finallyName >=", value, "finallyname");
            return (Criteria) this;
        }

        public Criteria andFinallynameLessThan(String value) {
            addCriterion("finallyName <", value, "finallyname");
            return (Criteria) this;
        }

        public Criteria andFinallynameLessThanOrEqualTo(String value) {
            addCriterion("finallyName <=", value, "finallyname");
            return (Criteria) this;
        }

        public Criteria andFinallynameLike(String value) {
            addCriterion("finallyName like", value, "finallyname");
            return (Criteria) this;
        }

        public Criteria andFinallynameNotLike(String value) {
            addCriterion("finallyName not like", value, "finallyname");
            return (Criteria) this;
        }

        public Criteria andFinallynameIn(List<String> values) {
            addCriterion("finallyName in", values, "finallyname");
            return (Criteria) this;
        }

        public Criteria andFinallynameNotIn(List<String> values) {
            addCriterion("finallyName not in", values, "finallyname");
            return (Criteria) this;
        }

        public Criteria andFinallynameBetween(String value1, String value2) {
            addCriterion("finallyName between", value1, value2, "finallyname");
            return (Criteria) this;
        }

        public Criteria andFinallynameNotBetween(String value1, String value2) {
            addCriterion("finallyName not between", value1, value2, "finallyname");
            return (Criteria) this;
        }

        public Criteria andIsoutIsNull() {
            addCriterion("isOut is null");
            return (Criteria) this;
        }

        public Criteria andIsoutIsNotNull() {
            addCriterion("isOut is not null");
            return (Criteria) this;
        }

        public Criteria andIsoutEqualTo(String value) {
            addCriterion("isOut =", value, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutNotEqualTo(String value) {
            addCriterion("isOut <>", value, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutGreaterThan(String value) {
            addCriterion("isOut >", value, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutGreaterThanOrEqualTo(String value) {
            addCriterion("isOut >=", value, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutLessThan(String value) {
            addCriterion("isOut <", value, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutLessThanOrEqualTo(String value) {
            addCriterion("isOut <=", value, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutLike(String value) {
            addCriterion("isOut like", value, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutNotLike(String value) {
            addCriterion("isOut not like", value, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutIn(List<String> values) {
            addCriterion("isOut in", values, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutNotIn(List<String> values) {
            addCriterion("isOut not in", values, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutBetween(String value1, String value2) {
            addCriterion("isOut between", value1, value2, "isout");
            return (Criteria) this;
        }

        public Criteria andIsoutNotBetween(String value1, String value2) {
            addCriterion("isOut not between", value1, value2, "isout");
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