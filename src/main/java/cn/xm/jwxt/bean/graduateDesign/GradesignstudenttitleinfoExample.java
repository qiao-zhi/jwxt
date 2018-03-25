package cn.xm.jwxt.bean.graduateDesign;

import java.util.ArrayList;
import java.util.List;

public class GradesignstudenttitleinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradesignstudenttitleinfoExample() {
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

        public Criteria andStudenttitleidIsNull() {
            addCriterion("studentTitleID is null");
            return (Criteria) this;
        }

        public Criteria andStudenttitleidIsNotNull() {
            addCriterion("studentTitleID is not null");
            return (Criteria) this;
        }

        public Criteria andStudenttitleidEqualTo(String value) {
            addCriterion("studentTitleID =", value, "studenttitleid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleidNotEqualTo(String value) {
            addCriterion("studentTitleID <>", value, "studenttitleid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleidGreaterThan(String value) {
            addCriterion("studentTitleID >", value, "studenttitleid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleidGreaterThanOrEqualTo(String value) {
            addCriterion("studentTitleID >=", value, "studenttitleid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleidLessThan(String value) {
            addCriterion("studentTitleID <", value, "studenttitleid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleidLessThanOrEqualTo(String value) {
            addCriterion("studentTitleID <=", value, "studenttitleid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleidLike(String value) {
            addCriterion("studentTitleID like", value, "studenttitleid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleidNotLike(String value) {
            addCriterion("studentTitleID not like", value, "studenttitleid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleidIn(List<String> values) {
            addCriterion("studentTitleID in", values, "studenttitleid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleidNotIn(List<String> values) {
            addCriterion("studentTitleID not in", values, "studenttitleid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleidBetween(String value1, String value2) {
            addCriterion("studentTitleID between", value1, value2, "studenttitleid");
            return (Criteria) this;
        }

        public Criteria andStudenttitleidNotBetween(String value1, String value2) {
            addCriterion("studentTitleID not between", value1, value2, "studenttitleid");
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

        public Criteria andFirstteachertitleidIsNull() {
            addCriterion("firstTeacherTitleId is null");
            return (Criteria) this;
        }

        public Criteria andFirstteachertitleidIsNotNull() {
            addCriterion("firstTeacherTitleId is not null");
            return (Criteria) this;
        }

        public Criteria andFirstteachertitleidEqualTo(String value) {
            addCriterion("firstTeacherTitleId =", value, "firstteachertitleid");
            return (Criteria) this;
        }

        public Criteria andFirstteachertitleidNotEqualTo(String value) {
            addCriterion("firstTeacherTitleId <>", value, "firstteachertitleid");
            return (Criteria) this;
        }

        public Criteria andFirstteachertitleidGreaterThan(String value) {
            addCriterion("firstTeacherTitleId >", value, "firstteachertitleid");
            return (Criteria) this;
        }

        public Criteria andFirstteachertitleidGreaterThanOrEqualTo(String value) {
            addCriterion("firstTeacherTitleId >=", value, "firstteachertitleid");
            return (Criteria) this;
        }

        public Criteria andFirstteachertitleidLessThan(String value) {
            addCriterion("firstTeacherTitleId <", value, "firstteachertitleid");
            return (Criteria) this;
        }

        public Criteria andFirstteachertitleidLessThanOrEqualTo(String value) {
            addCriterion("firstTeacherTitleId <=", value, "firstteachertitleid");
            return (Criteria) this;
        }

        public Criteria andFirstteachertitleidLike(String value) {
            addCriterion("firstTeacherTitleId like", value, "firstteachertitleid");
            return (Criteria) this;
        }

        public Criteria andFirstteachertitleidNotLike(String value) {
            addCriterion("firstTeacherTitleId not like", value, "firstteachertitleid");
            return (Criteria) this;
        }

        public Criteria andFirstteachertitleidIn(List<String> values) {
            addCriterion("firstTeacherTitleId in", values, "firstteachertitleid");
            return (Criteria) this;
        }

        public Criteria andFirstteachertitleidNotIn(List<String> values) {
            addCriterion("firstTeacherTitleId not in", values, "firstteachertitleid");
            return (Criteria) this;
        }

        public Criteria andFirstteachertitleidBetween(String value1, String value2) {
            addCriterion("firstTeacherTitleId between", value1, value2, "firstteachertitleid");
            return (Criteria) this;
        }

        public Criteria andFirstteachertitleidNotBetween(String value1, String value2) {
            addCriterion("firstTeacherTitleId not between", value1, value2, "firstteachertitleid");
            return (Criteria) this;
        }

        public Criteria andSecteachertitleidIsNull() {
            addCriterion("secTeacherTitleId is null");
            return (Criteria) this;
        }

        public Criteria andSecteachertitleidIsNotNull() {
            addCriterion("secTeacherTitleId is not null");
            return (Criteria) this;
        }

        public Criteria andSecteachertitleidEqualTo(String value) {
            addCriterion("secTeacherTitleId =", value, "secteachertitleid");
            return (Criteria) this;
        }

        public Criteria andSecteachertitleidNotEqualTo(String value) {
            addCriterion("secTeacherTitleId <>", value, "secteachertitleid");
            return (Criteria) this;
        }

        public Criteria andSecteachertitleidGreaterThan(String value) {
            addCriterion("secTeacherTitleId >", value, "secteachertitleid");
            return (Criteria) this;
        }

        public Criteria andSecteachertitleidGreaterThanOrEqualTo(String value) {
            addCriterion("secTeacherTitleId >=", value, "secteachertitleid");
            return (Criteria) this;
        }

        public Criteria andSecteachertitleidLessThan(String value) {
            addCriterion("secTeacherTitleId <", value, "secteachertitleid");
            return (Criteria) this;
        }

        public Criteria andSecteachertitleidLessThanOrEqualTo(String value) {
            addCriterion("secTeacherTitleId <=", value, "secteachertitleid");
            return (Criteria) this;
        }

        public Criteria andSecteachertitleidLike(String value) {
            addCriterion("secTeacherTitleId like", value, "secteachertitleid");
            return (Criteria) this;
        }

        public Criteria andSecteachertitleidNotLike(String value) {
            addCriterion("secTeacherTitleId not like", value, "secteachertitleid");
            return (Criteria) this;
        }

        public Criteria andSecteachertitleidIn(List<String> values) {
            addCriterion("secTeacherTitleId in", values, "secteachertitleid");
            return (Criteria) this;
        }

        public Criteria andSecteachertitleidNotIn(List<String> values) {
            addCriterion("secTeacherTitleId not in", values, "secteachertitleid");
            return (Criteria) this;
        }

        public Criteria andSecteachertitleidBetween(String value1, String value2) {
            addCriterion("secTeacherTitleId between", value1, value2, "secteachertitleid");
            return (Criteria) this;
        }

        public Criteria andSecteachertitleidNotBetween(String value1, String value2) {
            addCriterion("secTeacherTitleId not between", value1, value2, "secteachertitleid");
            return (Criteria) this;
        }

        public Criteria andIscheckedIsNull() {
            addCriterion("isChecked is null");
            return (Criteria) this;
        }

        public Criteria andIscheckedIsNotNull() {
            addCriterion("isChecked is not null");
            return (Criteria) this;
        }

        public Criteria andIscheckedEqualTo(String value) {
            addCriterion("isChecked =", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotEqualTo(String value) {
            addCriterion("isChecked <>", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedGreaterThan(String value) {
            addCriterion("isChecked >", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedGreaterThanOrEqualTo(String value) {
            addCriterion("isChecked >=", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedLessThan(String value) {
            addCriterion("isChecked <", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedLessThanOrEqualTo(String value) {
            addCriterion("isChecked <=", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedLike(String value) {
            addCriterion("isChecked like", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotLike(String value) {
            addCriterion("isChecked not like", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedIn(List<String> values) {
            addCriterion("isChecked in", values, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotIn(List<String> values) {
            addCriterion("isChecked not in", values, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedBetween(String value1, String value2) {
            addCriterion("isChecked between", value1, value2, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotBetween(String value1, String value2) {
            addCriterion("isChecked not between", value1, value2, "ischecked");
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