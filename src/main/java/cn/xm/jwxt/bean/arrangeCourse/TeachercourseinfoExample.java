package cn.xm.jwxt.bean.arrangeCourse;

import java.util.ArrayList;
import java.util.List;

public class TeachercourseinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeachercourseinfoExample() {
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

        public Criteria andTeachercourseidIsNull() {
            addCriterion("teacherCourseId is null");
            return (Criteria) this;
        }

        public Criteria andTeachercourseidIsNotNull() {
            addCriterion("teacherCourseId is not null");
            return (Criteria) this;
        }

        public Criteria andTeachercourseidEqualTo(Integer value) {
            addCriterion("teacherCourseId =", value, "teachercourseid");
            return (Criteria) this;
        }

        public Criteria andTeachercourseidNotEqualTo(Integer value) {
            addCriterion("teacherCourseId <>", value, "teachercourseid");
            return (Criteria) this;
        }

        public Criteria andTeachercourseidGreaterThan(Integer value) {
            addCriterion("teacherCourseId >", value, "teachercourseid");
            return (Criteria) this;
        }

        public Criteria andTeachercourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherCourseId >=", value, "teachercourseid");
            return (Criteria) this;
        }

        public Criteria andTeachercourseidLessThan(Integer value) {
            addCriterion("teacherCourseId <", value, "teachercourseid");
            return (Criteria) this;
        }

        public Criteria andTeachercourseidLessThanOrEqualTo(Integer value) {
            addCriterion("teacherCourseId <=", value, "teachercourseid");
            return (Criteria) this;
        }

        public Criteria andTeachercourseidIn(List<Integer> values) {
            addCriterion("teacherCourseId in", values, "teachercourseid");
            return (Criteria) this;
        }

        public Criteria andTeachercourseidNotIn(List<Integer> values) {
            addCriterion("teacherCourseId not in", values, "teachercourseid");
            return (Criteria) this;
        }

        public Criteria andTeachercourseidBetween(Integer value1, Integer value2) {
            addCriterion("teacherCourseId between", value1, value2, "teachercourseid");
            return (Criteria) this;
        }

        public Criteria andTeachercourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherCourseId not between", value1, value2, "teachercourseid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidIsNull() {
            addCriterion("arrangeBaseInfoId is null");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidIsNotNull() {
            addCriterion("arrangeBaseInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidEqualTo(String value) {
            addCriterion("arrangeBaseInfoId =", value, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidNotEqualTo(String value) {
            addCriterion("arrangeBaseInfoId <>", value, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidGreaterThan(String value) {
            addCriterion("arrangeBaseInfoId >", value, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidGreaterThanOrEqualTo(String value) {
            addCriterion("arrangeBaseInfoId >=", value, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidLessThan(String value) {
            addCriterion("arrangeBaseInfoId <", value, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidLessThanOrEqualTo(String value) {
            addCriterion("arrangeBaseInfoId <=", value, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidLike(String value) {
            addCriterion("arrangeBaseInfoId like", value, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidNotLike(String value) {
            addCriterion("arrangeBaseInfoId not like", value, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidIn(List<String> values) {
            addCriterion("arrangeBaseInfoId in", values, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidNotIn(List<String> values) {
            addCriterion("arrangeBaseInfoId not in", values, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidBetween(String value1, String value2) {
            addCriterion("arrangeBaseInfoId between", value1, value2, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andArrangebaseinfoidNotBetween(String value1, String value2) {
            addCriterion("arrangeBaseInfoId not between", value1, value2, "arrangebaseinfoid");
            return (Criteria) this;
        }

        public Criteria andTeachercourseIsNull() {
            addCriterion("teacherCourse is null");
            return (Criteria) this;
        }

        public Criteria andTeachercourseIsNotNull() {
            addCriterion("teacherCourse is not null");
            return (Criteria) this;
        }

        public Criteria andTeachercourseEqualTo(String value) {
            addCriterion("teacherCourse =", value, "teachercourse");
            return (Criteria) this;
        }

        public Criteria andTeachercourseNotEqualTo(String value) {
            addCriterion("teacherCourse <>", value, "teachercourse");
            return (Criteria) this;
        }

        public Criteria andTeachercourseGreaterThan(String value) {
            addCriterion("teacherCourse >", value, "teachercourse");
            return (Criteria) this;
        }

        public Criteria andTeachercourseGreaterThanOrEqualTo(String value) {
            addCriterion("teacherCourse >=", value, "teachercourse");
            return (Criteria) this;
        }

        public Criteria andTeachercourseLessThan(String value) {
            addCriterion("teacherCourse <", value, "teachercourse");
            return (Criteria) this;
        }

        public Criteria andTeachercourseLessThanOrEqualTo(String value) {
            addCriterion("teacherCourse <=", value, "teachercourse");
            return (Criteria) this;
        }

        public Criteria andTeachercourseLike(String value) {
            addCriterion("teacherCourse like", value, "teachercourse");
            return (Criteria) this;
        }

        public Criteria andTeachercourseNotLike(String value) {
            addCriterion("teacherCourse not like", value, "teachercourse");
            return (Criteria) this;
        }

        public Criteria andTeachercourseIn(List<String> values) {
            addCriterion("teacherCourse in", values, "teachercourse");
            return (Criteria) this;
        }

        public Criteria andTeachercourseNotIn(List<String> values) {
            addCriterion("teacherCourse not in", values, "teachercourse");
            return (Criteria) this;
        }

        public Criteria andTeachercourseBetween(String value1, String value2) {
            addCriterion("teacherCourse between", value1, value2, "teachercourse");
            return (Criteria) this;
        }

        public Criteria andTeachercourseNotBetween(String value1, String value2) {
            addCriterion("teacherCourse not between", value1, value2, "teachercourse");
            return (Criteria) this;
        }

        public Criteria andTrainscjemeidIsNull() {
            addCriterion("trainScjemeID is null");
            return (Criteria) this;
        }

        public Criteria andTrainscjemeidIsNotNull() {
            addCriterion("trainScjemeID is not null");
            return (Criteria) this;
        }

        public Criteria andTrainscjemeidEqualTo(Integer value) {
            addCriterion("trainScjemeID =", value, "trainscjemeid");
            return (Criteria) this;
        }

        public Criteria andTrainscjemeidNotEqualTo(Integer value) {
            addCriterion("trainScjemeID <>", value, "trainscjemeid");
            return (Criteria) this;
        }

        public Criteria andTrainscjemeidGreaterThan(Integer value) {
            addCriterion("trainScjemeID >", value, "trainscjemeid");
            return (Criteria) this;
        }

        public Criteria andTrainscjemeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("trainScjemeID >=", value, "trainscjemeid");
            return (Criteria) this;
        }

        public Criteria andTrainscjemeidLessThan(Integer value) {
            addCriterion("trainScjemeID <", value, "trainscjemeid");
            return (Criteria) this;
        }

        public Criteria andTrainscjemeidLessThanOrEqualTo(Integer value) {
            addCriterion("trainScjemeID <=", value, "trainscjemeid");
            return (Criteria) this;
        }

        public Criteria andTrainscjemeidIn(List<Integer> values) {
            addCriterion("trainScjemeID in", values, "trainscjemeid");
            return (Criteria) this;
        }

        public Criteria andTrainscjemeidNotIn(List<Integer> values) {
            addCriterion("trainScjemeID not in", values, "trainscjemeid");
            return (Criteria) this;
        }

        public Criteria andTrainscjemeidBetween(Integer value1, Integer value2) {
            addCriterion("trainScjemeID between", value1, value2, "trainscjemeid");
            return (Criteria) this;
        }

        public Criteria andTrainscjemeidNotBetween(Integer value1, Integer value2) {
            addCriterion("trainScjemeID not between", value1, value2, "trainscjemeid");
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