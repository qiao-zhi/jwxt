package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckleaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckleaveExample() {
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

        public Criteria andCheckleaveidIsNull() {
            addCriterion("checkLeaveID is null");
            return (Criteria) this;
        }

        public Criteria andCheckleaveidIsNotNull() {
            addCriterion("checkLeaveID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckleaveidEqualTo(Integer value) {
            addCriterion("checkLeaveID =", value, "checkleaveid");
            return (Criteria) this;
        }

        public Criteria andCheckleaveidNotEqualTo(Integer value) {
            addCriterion("checkLeaveID <>", value, "checkleaveid");
            return (Criteria) this;
        }

        public Criteria andCheckleaveidGreaterThan(Integer value) {
            addCriterion("checkLeaveID >", value, "checkleaveid");
            return (Criteria) this;
        }

        public Criteria andCheckleaveidGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkLeaveID >=", value, "checkleaveid");
            return (Criteria) this;
        }

        public Criteria andCheckleaveidLessThan(Integer value) {
            addCriterion("checkLeaveID <", value, "checkleaveid");
            return (Criteria) this;
        }

        public Criteria andCheckleaveidLessThanOrEqualTo(Integer value) {
            addCriterion("checkLeaveID <=", value, "checkleaveid");
            return (Criteria) this;
        }

        public Criteria andCheckleaveidIn(List<Integer> values) {
            addCriterion("checkLeaveID in", values, "checkleaveid");
            return (Criteria) this;
        }

        public Criteria andCheckleaveidNotIn(List<Integer> values) {
            addCriterion("checkLeaveID not in", values, "checkleaveid");
            return (Criteria) this;
        }

        public Criteria andCheckleaveidBetween(Integer value1, Integer value2) {
            addCriterion("checkLeaveID between", value1, value2, "checkleaveid");
            return (Criteria) this;
        }

        public Criteria andCheckleaveidNotBetween(Integer value1, Integer value2) {
            addCriterion("checkLeaveID not between", value1, value2, "checkleaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidIsNull() {
            addCriterion("leaveID is null");
            return (Criteria) this;
        }

        public Criteria andLeaveidIsNotNull() {
            addCriterion("leaveID is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveidEqualTo(Integer value) {
            addCriterion("leaveID =", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidNotEqualTo(Integer value) {
            addCriterion("leaveID <>", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidGreaterThan(Integer value) {
            addCriterion("leaveID >", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidGreaterThanOrEqualTo(Integer value) {
            addCriterion("leaveID >=", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidLessThan(Integer value) {
            addCriterion("leaveID <", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidLessThanOrEqualTo(Integer value) {
            addCriterion("leaveID <=", value, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidIn(List<Integer> values) {
            addCriterion("leaveID in", values, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidNotIn(List<Integer> values) {
            addCriterion("leaveID not in", values, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidBetween(Integer value1, Integer value2) {
            addCriterion("leaveID between", value1, value2, "leaveid");
            return (Criteria) this;
        }

        public Criteria andLeaveidNotBetween(Integer value1, Integer value2) {
            addCriterion("leaveID not between", value1, value2, "leaveid");
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

        public Criteria andCheckopinionIsNull() {
            addCriterion("checkOpinion is null");
            return (Criteria) this;
        }

        public Criteria andCheckopinionIsNotNull() {
            addCriterion("checkOpinion is not null");
            return (Criteria) this;
        }

        public Criteria andCheckopinionEqualTo(String value) {
            addCriterion("checkOpinion =", value, "checkopinion");
            return (Criteria) this;
        }

        public Criteria andCheckopinionNotEqualTo(String value) {
            addCriterion("checkOpinion <>", value, "checkopinion");
            return (Criteria) this;
        }

        public Criteria andCheckopinionGreaterThan(String value) {
            addCriterion("checkOpinion >", value, "checkopinion");
            return (Criteria) this;
        }

        public Criteria andCheckopinionGreaterThanOrEqualTo(String value) {
            addCriterion("checkOpinion >=", value, "checkopinion");
            return (Criteria) this;
        }

        public Criteria andCheckopinionLessThan(String value) {
            addCriterion("checkOpinion <", value, "checkopinion");
            return (Criteria) this;
        }

        public Criteria andCheckopinionLessThanOrEqualTo(String value) {
            addCriterion("checkOpinion <=", value, "checkopinion");
            return (Criteria) this;
        }

        public Criteria andCheckopinionLike(String value) {
            addCriterion("checkOpinion like", value, "checkopinion");
            return (Criteria) this;
        }

        public Criteria andCheckopinionNotLike(String value) {
            addCriterion("checkOpinion not like", value, "checkopinion");
            return (Criteria) this;
        }

        public Criteria andCheckopinionIn(List<String> values) {
            addCriterion("checkOpinion in", values, "checkopinion");
            return (Criteria) this;
        }

        public Criteria andCheckopinionNotIn(List<String> values) {
            addCriterion("checkOpinion not in", values, "checkopinion");
            return (Criteria) this;
        }

        public Criteria andCheckopinionBetween(String value1, String value2) {
            addCriterion("checkOpinion between", value1, value2, "checkopinion");
            return (Criteria) this;
        }

        public Criteria andCheckopinionNotBetween(String value1, String value2) {
            addCriterion("checkOpinion not between", value1, value2, "checkopinion");
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

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNull() {
            addCriterion("applyTime is null");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNotNull() {
            addCriterion("applyTime is not null");
            return (Criteria) this;
        }

        public Criteria andApplytimeEqualTo(Date value) {
            addCriterion("applyTime =", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotEqualTo(Date value) {
            addCriterion("applyTime <>", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThan(Date value) {
            addCriterion("applyTime >", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("applyTime >=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThan(Date value) {
            addCriterion("applyTime <", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThanOrEqualTo(Date value) {
            addCriterion("applyTime <=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeIn(List<Date> values) {
            addCriterion("applyTime in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotIn(List<Date> values) {
            addCriterion("applyTime not in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeBetween(Date value1, Date value2) {
            addCriterion("applyTime between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotBetween(Date value1, Date value2) {
            addCriterion("applyTime not between", value1, value2, "applytime");
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