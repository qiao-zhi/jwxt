package cn.xm.jwxt.bean.graduateDesign;

import java.util.ArrayList;
import java.util.List;

public class GradeuatebaseinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradeuatebaseinfoExample() {
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

        public Criteria andGraduatedesignnameIsNull() {
            addCriterion("graduateDesignName is null");
            return (Criteria) this;
        }

        public Criteria andGraduatedesignnameIsNotNull() {
            addCriterion("graduateDesignName is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatedesignnameEqualTo(String value) {
            addCriterion("graduateDesignName =", value, "graduatedesignname");
            return (Criteria) this;
        }

        public Criteria andGraduatedesignnameNotEqualTo(String value) {
            addCriterion("graduateDesignName <>", value, "graduatedesignname");
            return (Criteria) this;
        }

        public Criteria andGraduatedesignnameGreaterThan(String value) {
            addCriterion("graduateDesignName >", value, "graduatedesignname");
            return (Criteria) this;
        }

        public Criteria andGraduatedesignnameGreaterThanOrEqualTo(String value) {
            addCriterion("graduateDesignName >=", value, "graduatedesignname");
            return (Criteria) this;
        }

        public Criteria andGraduatedesignnameLessThan(String value) {
            addCriterion("graduateDesignName <", value, "graduatedesignname");
            return (Criteria) this;
        }

        public Criteria andGraduatedesignnameLessThanOrEqualTo(String value) {
            addCriterion("graduateDesignName <=", value, "graduatedesignname");
            return (Criteria) this;
        }

        public Criteria andGraduatedesignnameLike(String value) {
            addCriterion("graduateDesignName like", value, "graduatedesignname");
            return (Criteria) this;
        }

        public Criteria andGraduatedesignnameNotLike(String value) {
            addCriterion("graduateDesignName not like", value, "graduatedesignname");
            return (Criteria) this;
        }

        public Criteria andGraduatedesignnameIn(List<String> values) {
            addCriterion("graduateDesignName in", values, "graduatedesignname");
            return (Criteria) this;
        }

        public Criteria andGraduatedesignnameNotIn(List<String> values) {
            addCriterion("graduateDesignName not in", values, "graduatedesignname");
            return (Criteria) this;
        }

        public Criteria andGraduatedesignnameBetween(String value1, String value2) {
            addCriterion("graduateDesignName between", value1, value2, "graduatedesignname");
            return (Criteria) this;
        }

        public Criteria andGraduatedesignnameNotBetween(String value1, String value2) {
            addCriterion("graduateDesignName not between", value1, value2, "graduatedesignname");
            return (Criteria) this;
        }

        public Criteria andMajoridIsNull() {
            addCriterion("majorId is null");
            return (Criteria) this;
        }

        public Criteria andMajoridIsNotNull() {
            addCriterion("majorId is not null");
            return (Criteria) this;
        }

        public Criteria andMajoridEqualTo(String value) {
            addCriterion("majorId =", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotEqualTo(String value) {
            addCriterion("majorId <>", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThan(String value) {
            addCriterion("majorId >", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThanOrEqualTo(String value) {
            addCriterion("majorId >=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThan(String value) {
            addCriterion("majorId <", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThanOrEqualTo(String value) {
            addCriterion("majorId <=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLike(String value) {
            addCriterion("majorId like", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotLike(String value) {
            addCriterion("majorId not like", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridIn(List<String> values) {
            addCriterion("majorId in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotIn(List<String> values) {
            addCriterion("majorId not in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridBetween(String value1, String value2) {
            addCriterion("majorId between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotBetween(String value1, String value2) {
            addCriterion("majorId not between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andGraduatedescIsNull() {
            addCriterion("graduateDesc is null");
            return (Criteria) this;
        }

        public Criteria andGraduatedescIsNotNull() {
            addCriterion("graduateDesc is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatedescEqualTo(String value) {
            addCriterion("graduateDesc =", value, "graduatedesc");
            return (Criteria) this;
        }

        public Criteria andGraduatedescNotEqualTo(String value) {
            addCriterion("graduateDesc <>", value, "graduatedesc");
            return (Criteria) this;
        }

        public Criteria andGraduatedescGreaterThan(String value) {
            addCriterion("graduateDesc >", value, "graduatedesc");
            return (Criteria) this;
        }

        public Criteria andGraduatedescGreaterThanOrEqualTo(String value) {
            addCriterion("graduateDesc >=", value, "graduatedesc");
            return (Criteria) this;
        }

        public Criteria andGraduatedescLessThan(String value) {
            addCriterion("graduateDesc <", value, "graduatedesc");
            return (Criteria) this;
        }

        public Criteria andGraduatedescLessThanOrEqualTo(String value) {
            addCriterion("graduateDesc <=", value, "graduatedesc");
            return (Criteria) this;
        }

        public Criteria andGraduatedescLike(String value) {
            addCriterion("graduateDesc like", value, "graduatedesc");
            return (Criteria) this;
        }

        public Criteria andGraduatedescNotLike(String value) {
            addCriterion("graduateDesc not like", value, "graduatedesc");
            return (Criteria) this;
        }

        public Criteria andGraduatedescIn(List<String> values) {
            addCriterion("graduateDesc in", values, "graduatedesc");
            return (Criteria) this;
        }

        public Criteria andGraduatedescNotIn(List<String> values) {
            addCriterion("graduateDesc not in", values, "graduatedesc");
            return (Criteria) this;
        }

        public Criteria andGraduatedescBetween(String value1, String value2) {
            addCriterion("graduateDesc between", value1, value2, "graduatedesc");
            return (Criteria) this;
        }

        public Criteria andGraduatedescNotBetween(String value1, String value2) {
            addCriterion("graduateDesc not between", value1, value2, "graduatedesc");
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

        public Criteria andSemesternumIsNull() {
            addCriterion("semesterNum is null");
            return (Criteria) this;
        }

        public Criteria andSemesternumIsNotNull() {
            addCriterion("semesterNum is not null");
            return (Criteria) this;
        }

        public Criteria andSemesternumEqualTo(String value) {
            addCriterion("semesterNum =", value, "semesternum");
            return (Criteria) this;
        }

        public Criteria andSemesternumNotEqualTo(String value) {
            addCriterion("semesterNum <>", value, "semesternum");
            return (Criteria) this;
        }

        public Criteria andSemesternumGreaterThan(String value) {
            addCriterion("semesterNum >", value, "semesternum");
            return (Criteria) this;
        }

        public Criteria andSemesternumGreaterThanOrEqualTo(String value) {
            addCriterion("semesterNum >=", value, "semesternum");
            return (Criteria) this;
        }

        public Criteria andSemesternumLessThan(String value) {
            addCriterion("semesterNum <", value, "semesternum");
            return (Criteria) this;
        }

        public Criteria andSemesternumLessThanOrEqualTo(String value) {
            addCriterion("semesterNum <=", value, "semesternum");
            return (Criteria) this;
        }

        public Criteria andSemesternumLike(String value) {
            addCriterion("semesterNum like", value, "semesternum");
            return (Criteria) this;
        }

        public Criteria andSemesternumNotLike(String value) {
            addCriterion("semesterNum not like", value, "semesternum");
            return (Criteria) this;
        }

        public Criteria andSemesternumIn(List<String> values) {
            addCriterion("semesterNum in", values, "semesternum");
            return (Criteria) this;
        }

        public Criteria andSemesternumNotIn(List<String> values) {
            addCriterion("semesterNum not in", values, "semesternum");
            return (Criteria) this;
        }

        public Criteria andSemesternumBetween(String value1, String value2) {
            addCriterion("semesterNum between", value1, value2, "semesternum");
            return (Criteria) this;
        }

        public Criteria andSemesternumNotBetween(String value1, String value2) {
            addCriterion("semesterNum not between", value1, value2, "semesternum");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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