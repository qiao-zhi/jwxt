package cn.xm.jwxt.bean.trainScheme;

import java.util.ArrayList;
import java.util.List;

public class TTeachingprogramInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTeachingprogramInfoExample() {
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

        public Criteria andCoursefileidIsNull() {
            addCriterion("courseFileID is null");
            return (Criteria) this;
        }

        public Criteria andCoursefileidIsNotNull() {
            addCriterion("courseFileID is not null");
            return (Criteria) this;
        }

        public Criteria andCoursefileidEqualTo(Integer value) {
            addCriterion("courseFileID =", value, "coursefileid");
            return (Criteria) this;
        }

        public Criteria andCoursefileidNotEqualTo(Integer value) {
            addCriterion("courseFileID <>", value, "coursefileid");
            return (Criteria) this;
        }

        public Criteria andCoursefileidGreaterThan(Integer value) {
            addCriterion("courseFileID >", value, "coursefileid");
            return (Criteria) this;
        }

        public Criteria andCoursefileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseFileID >=", value, "coursefileid");
            return (Criteria) this;
        }

        public Criteria andCoursefileidLessThan(Integer value) {
            addCriterion("courseFileID <", value, "coursefileid");
            return (Criteria) this;
        }

        public Criteria andCoursefileidLessThanOrEqualTo(Integer value) {
            addCriterion("courseFileID <=", value, "coursefileid");
            return (Criteria) this;
        }

        public Criteria andCoursefileidIn(List<Integer> values) {
            addCriterion("courseFileID in", values, "coursefileid");
            return (Criteria) this;
        }

        public Criteria andCoursefileidNotIn(List<Integer> values) {
            addCriterion("courseFileID not in", values, "coursefileid");
            return (Criteria) this;
        }

        public Criteria andCoursefileidBetween(Integer value1, Integer value2) {
            addCriterion("courseFileID between", value1, value2, "coursefileid");
            return (Criteria) this;
        }

        public Criteria andCoursefileidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseFileID not between", value1, value2, "coursefileid");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNull() {
            addCriterion("courseID is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseID is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(String value) {
            addCriterion("courseID =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(String value) {
            addCriterion("courseID <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(String value) {
            addCriterion("courseID >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(String value) {
            addCriterion("courseID >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(String value) {
            addCriterion("courseID <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(String value) {
            addCriterion("courseID <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLike(String value) {
            addCriterion("courseID like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotLike(String value) {
            addCriterion("courseID not like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<String> values) {
            addCriterion("courseID in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<String> values) {
            addCriterion("courseID not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(String value1, String value2) {
            addCriterion("courseID between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(String value1, String value2) {
            addCriterion("courseID not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andFileorinameIsNull() {
            addCriterion("fileOriName is null");
            return (Criteria) this;
        }

        public Criteria andFileorinameIsNotNull() {
            addCriterion("fileOriName is not null");
            return (Criteria) this;
        }

        public Criteria andFileorinameEqualTo(String value) {
            addCriterion("fileOriName =", value, "fileoriname");
            return (Criteria) this;
        }

        public Criteria andFileorinameNotEqualTo(String value) {
            addCriterion("fileOriName <>", value, "fileoriname");
            return (Criteria) this;
        }

        public Criteria andFileorinameGreaterThan(String value) {
            addCriterion("fileOriName >", value, "fileoriname");
            return (Criteria) this;
        }

        public Criteria andFileorinameGreaterThanOrEqualTo(String value) {
            addCriterion("fileOriName >=", value, "fileoriname");
            return (Criteria) this;
        }

        public Criteria andFileorinameLessThan(String value) {
            addCriterion("fileOriName <", value, "fileoriname");
            return (Criteria) this;
        }

        public Criteria andFileorinameLessThanOrEqualTo(String value) {
            addCriterion("fileOriName <=", value, "fileoriname");
            return (Criteria) this;
        }

        public Criteria andFileorinameLike(String value) {
            addCriterion("fileOriName like", value, "fileoriname");
            return (Criteria) this;
        }

        public Criteria andFileorinameNotLike(String value) {
            addCriterion("fileOriName not like", value, "fileoriname");
            return (Criteria) this;
        }

        public Criteria andFileorinameIn(List<String> values) {
            addCriterion("fileOriName in", values, "fileoriname");
            return (Criteria) this;
        }

        public Criteria andFileorinameNotIn(List<String> values) {
            addCriterion("fileOriName not in", values, "fileoriname");
            return (Criteria) this;
        }

        public Criteria andFileorinameBetween(String value1, String value2) {
            addCriterion("fileOriName between", value1, value2, "fileoriname");
            return (Criteria) this;
        }

        public Criteria andFileorinameNotBetween(String value1, String value2) {
            addCriterion("fileOriName not between", value1, value2, "fileoriname");
            return (Criteria) this;
        }

        public Criteria andFilenownameIsNull() {
            addCriterion("fileNowName is null");
            return (Criteria) this;
        }

        public Criteria andFilenownameIsNotNull() {
            addCriterion("fileNowName is not null");
            return (Criteria) this;
        }

        public Criteria andFilenownameEqualTo(String value) {
            addCriterion("fileNowName =", value, "filenowname");
            return (Criteria) this;
        }

        public Criteria andFilenownameNotEqualTo(String value) {
            addCriterion("fileNowName <>", value, "filenowname");
            return (Criteria) this;
        }

        public Criteria andFilenownameGreaterThan(String value) {
            addCriterion("fileNowName >", value, "filenowname");
            return (Criteria) this;
        }

        public Criteria andFilenownameGreaterThanOrEqualTo(String value) {
            addCriterion("fileNowName >=", value, "filenowname");
            return (Criteria) this;
        }

        public Criteria andFilenownameLessThan(String value) {
            addCriterion("fileNowName <", value, "filenowname");
            return (Criteria) this;
        }

        public Criteria andFilenownameLessThanOrEqualTo(String value) {
            addCriterion("fileNowName <=", value, "filenowname");
            return (Criteria) this;
        }

        public Criteria andFilenownameLike(String value) {
            addCriterion("fileNowName like", value, "filenowname");
            return (Criteria) this;
        }

        public Criteria andFilenownameNotLike(String value) {
            addCriterion("fileNowName not like", value, "filenowname");
            return (Criteria) this;
        }

        public Criteria andFilenownameIn(List<String> values) {
            addCriterion("fileNowName in", values, "filenowname");
            return (Criteria) this;
        }

        public Criteria andFilenownameNotIn(List<String> values) {
            addCriterion("fileNowName not in", values, "filenowname");
            return (Criteria) this;
        }

        public Criteria andFilenownameBetween(String value1, String value2) {
            addCriterion("fileNowName between", value1, value2, "filenowname");
            return (Criteria) this;
        }

        public Criteria andFilenownameNotBetween(String value1, String value2) {
            addCriterion("fileNowName not between", value1, value2, "filenowname");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNull() {
            addCriterion("Filetype is null");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNotNull() {
            addCriterion("Filetype is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypeEqualTo(String value) {
            addCriterion("Filetype =", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotEqualTo(String value) {
            addCriterion("Filetype <>", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThan(String value) {
            addCriterion("Filetype >", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("Filetype >=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThan(String value) {
            addCriterion("Filetype <", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThanOrEqualTo(String value) {
            addCriterion("Filetype <=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLike(String value) {
            addCriterion("Filetype like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotLike(String value) {
            addCriterion("Filetype not like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeIn(List<String> values) {
            addCriterion("Filetype in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotIn(List<String> values) {
            addCriterion("Filetype not in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeBetween(String value1, String value2) {
            addCriterion("Filetype between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotBetween(String value1, String value2) {
            addCriterion("Filetype not between", value1, value2, "filetype");
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