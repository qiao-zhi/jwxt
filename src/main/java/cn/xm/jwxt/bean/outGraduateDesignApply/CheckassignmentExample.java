package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.ArrayList;
import java.util.List;

public class CheckassignmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckassignmentExample() {
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

        public Criteria andCheckIdIsNull() {
            addCriterion("check_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckIdIsNotNull() {
            addCriterion("check_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckIdEqualTo(String value) {
            addCriterion("check_id =", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotEqualTo(String value) {
            addCriterion("check_id <>", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdGreaterThan(String value) {
            addCriterion("check_id >", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdGreaterThanOrEqualTo(String value) {
            addCriterion("check_id >=", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLessThan(String value) {
            addCriterion("check_id <", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLessThanOrEqualTo(String value) {
            addCriterion("check_id <=", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLike(String value) {
            addCriterion("check_id like", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotLike(String value) {
            addCriterion("check_id not like", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdIn(List<String> values) {
            addCriterion("check_id in", values, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotIn(List<String> values) {
            addCriterion("check_id not in", values, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdBetween(String value1, String value2) {
            addCriterion("check_id between", value1, value2, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotBetween(String value1, String value2) {
            addCriterion("check_id not between", value1, value2, "checkId");
            return (Criteria) this;
        }

        public Criteria andAssignmentidIsNull() {
            addCriterion("assignmentID is null");
            return (Criteria) this;
        }

        public Criteria andAssignmentidIsNotNull() {
            addCriterion("assignmentID is not null");
            return (Criteria) this;
        }

        public Criteria andAssignmentidEqualTo(String value) {
            addCriterion("assignmentID =", value, "assignmentid");
            return (Criteria) this;
        }

        public Criteria andAssignmentidNotEqualTo(String value) {
            addCriterion("assignmentID <>", value, "assignmentid");
            return (Criteria) this;
        }

        public Criteria andAssignmentidGreaterThan(String value) {
            addCriterion("assignmentID >", value, "assignmentid");
            return (Criteria) this;
        }

        public Criteria andAssignmentidGreaterThanOrEqualTo(String value) {
            addCriterion("assignmentID >=", value, "assignmentid");
            return (Criteria) this;
        }

        public Criteria andAssignmentidLessThan(String value) {
            addCriterion("assignmentID <", value, "assignmentid");
            return (Criteria) this;
        }

        public Criteria andAssignmentidLessThanOrEqualTo(String value) {
            addCriterion("assignmentID <=", value, "assignmentid");
            return (Criteria) this;
        }

        public Criteria andAssignmentidLike(String value) {
            addCriterion("assignmentID like", value, "assignmentid");
            return (Criteria) this;
        }

        public Criteria andAssignmentidNotLike(String value) {
            addCriterion("assignmentID not like", value, "assignmentid");
            return (Criteria) this;
        }

        public Criteria andAssignmentidIn(List<String> values) {
            addCriterion("assignmentID in", values, "assignmentid");
            return (Criteria) this;
        }

        public Criteria andAssignmentidNotIn(List<String> values) {
            addCriterion("assignmentID not in", values, "assignmentid");
            return (Criteria) this;
        }

        public Criteria andAssignmentidBetween(String value1, String value2) {
            addCriterion("assignmentID between", value1, value2, "assignmentid");
            return (Criteria) this;
        }

        public Criteria andAssignmentidNotBetween(String value1, String value2) {
            addCriterion("assignmentID not between", value1, value2, "assignmentid");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleIsNull() {
            addCriterion("checkPeople is null");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleIsNotNull() {
            addCriterion("checkPeople is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleEqualTo(String value) {
            addCriterion("checkPeople =", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleNotEqualTo(String value) {
            addCriterion("checkPeople <>", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleGreaterThan(String value) {
            addCriterion("checkPeople >", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("checkPeople >=", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleLessThan(String value) {
            addCriterion("checkPeople <", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleLessThanOrEqualTo(String value) {
            addCriterion("checkPeople <=", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleLike(String value) {
            addCriterion("checkPeople like", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleNotLike(String value) {
            addCriterion("checkPeople not like", value, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleIn(List<String> values) {
            addCriterion("checkPeople in", values, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleNotIn(List<String> values) {
            addCriterion("checkPeople not in", values, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleBetween(String value1, String value2) {
            addCriterion("checkPeople between", value1, value2, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andCheckpeopleNotBetween(String value1, String value2) {
            addCriterion("checkPeople not between", value1, value2, "checkpeople");
            return (Criteria) this;
        }

        public Criteria andTeachersignIsNull() {
            addCriterion("teacherSign is null");
            return (Criteria) this;
        }

        public Criteria andTeachersignIsNotNull() {
            addCriterion("teacherSign is not null");
            return (Criteria) this;
        }

        public Criteria andTeachersignEqualTo(String value) {
            addCriterion("teacherSign =", value, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignNotEqualTo(String value) {
            addCriterion("teacherSign <>", value, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignGreaterThan(String value) {
            addCriterion("teacherSign >", value, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignGreaterThanOrEqualTo(String value) {
            addCriterion("teacherSign >=", value, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignLessThan(String value) {
            addCriterion("teacherSign <", value, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignLessThanOrEqualTo(String value) {
            addCriterion("teacherSign <=", value, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignLike(String value) {
            addCriterion("teacherSign like", value, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignNotLike(String value) {
            addCriterion("teacherSign not like", value, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignIn(List<String> values) {
            addCriterion("teacherSign in", values, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignNotIn(List<String> values) {
            addCriterion("teacherSign not in", values, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignBetween(String value1, String value2) {
            addCriterion("teacherSign between", value1, value2, "teachersign");
            return (Criteria) this;
        }

        public Criteria andTeachersignNotBetween(String value1, String value2) {
            addCriterion("teacherSign not between", value1, value2, "teachersign");
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