package cn.xm.jwxt.bean.graduateDesign;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CencheckresultinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CencheckresultinfoExample() {
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

        public Criteria andCenterresultidIsNull() {
            addCriterion("centerResultid is null");
            return (Criteria) this;
        }

        public Criteria andCenterresultidIsNotNull() {
            addCriterion("centerResultid is not null");
            return (Criteria) this;
        }

        public Criteria andCenterresultidEqualTo(Integer value) {
            addCriterion("centerResultid =", value, "centerresultid");
            return (Criteria) this;
        }

        public Criteria andCenterresultidNotEqualTo(Integer value) {
            addCriterion("centerResultid <>", value, "centerresultid");
            return (Criteria) this;
        }

        public Criteria andCenterresultidGreaterThan(Integer value) {
            addCriterion("centerResultid >", value, "centerresultid");
            return (Criteria) this;
        }

        public Criteria andCenterresultidGreaterThanOrEqualTo(Integer value) {
            addCriterion("centerResultid >=", value, "centerresultid");
            return (Criteria) this;
        }

        public Criteria andCenterresultidLessThan(Integer value) {
            addCriterion("centerResultid <", value, "centerresultid");
            return (Criteria) this;
        }

        public Criteria andCenterresultidLessThanOrEqualTo(Integer value) {
            addCriterion("centerResultid <=", value, "centerresultid");
            return (Criteria) this;
        }

        public Criteria andCenterresultidIn(List<Integer> values) {
            addCriterion("centerResultid in", values, "centerresultid");
            return (Criteria) this;
        }

        public Criteria andCenterresultidNotIn(List<Integer> values) {
            addCriterion("centerResultid not in", values, "centerresultid");
            return (Criteria) this;
        }

        public Criteria andCenterresultidBetween(Integer value1, Integer value2) {
            addCriterion("centerResultid between", value1, value2, "centerresultid");
            return (Criteria) this;
        }

        public Criteria andCenterresultidNotBetween(Integer value1, Integer value2) {
            addCriterion("centerResultid not between", value1, value2, "centerresultid");
            return (Criteria) this;
        }

        public Criteria andCenarrangeinfoidIsNull() {
            addCriterion("cenArrangeInfoId is null");
            return (Criteria) this;
        }

        public Criteria andCenarrangeinfoidIsNotNull() {
            addCriterion("cenArrangeInfoId is not null");
            return (Criteria) this;
        }

        public Criteria andCenarrangeinfoidEqualTo(Integer value) {
            addCriterion("cenArrangeInfoId =", value, "cenarrangeinfoid");
            return (Criteria) this;
        }

        public Criteria andCenarrangeinfoidNotEqualTo(Integer value) {
            addCriterion("cenArrangeInfoId <>", value, "cenarrangeinfoid");
            return (Criteria) this;
        }

        public Criteria andCenarrangeinfoidGreaterThan(Integer value) {
            addCriterion("cenArrangeInfoId >", value, "cenarrangeinfoid");
            return (Criteria) this;
        }

        public Criteria andCenarrangeinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cenArrangeInfoId >=", value, "cenarrangeinfoid");
            return (Criteria) this;
        }

        public Criteria andCenarrangeinfoidLessThan(Integer value) {
            addCriterion("cenArrangeInfoId <", value, "cenarrangeinfoid");
            return (Criteria) this;
        }

        public Criteria andCenarrangeinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("cenArrangeInfoId <=", value, "cenarrangeinfoid");
            return (Criteria) this;
        }

        public Criteria andCenarrangeinfoidIn(List<Integer> values) {
            addCriterion("cenArrangeInfoId in", values, "cenarrangeinfoid");
            return (Criteria) this;
        }

        public Criteria andCenarrangeinfoidNotIn(List<Integer> values) {
            addCriterion("cenArrangeInfoId not in", values, "cenarrangeinfoid");
            return (Criteria) this;
        }

        public Criteria andCenarrangeinfoidBetween(Integer value1, Integer value2) {
            addCriterion("cenArrangeInfoId between", value1, value2, "cenarrangeinfoid");
            return (Criteria) this;
        }

        public Criteria andCenarrangeinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("cenArrangeInfoId not between", value1, value2, "cenarrangeinfoid");
            return (Criteria) this;
        }

        public Criteria andWordprogressIsNull() {
            addCriterion("wordProgress is null");
            return (Criteria) this;
        }

        public Criteria andWordprogressIsNotNull() {
            addCriterion("wordProgress is not null");
            return (Criteria) this;
        }

        public Criteria andWordprogressEqualTo(String value) {
            addCriterion("wordProgress =", value, "wordprogress");
            return (Criteria) this;
        }

        public Criteria andWordprogressNotEqualTo(String value) {
            addCriterion("wordProgress <>", value, "wordprogress");
            return (Criteria) this;
        }

        public Criteria andWordprogressGreaterThan(String value) {
            addCriterion("wordProgress >", value, "wordprogress");
            return (Criteria) this;
        }

        public Criteria andWordprogressGreaterThanOrEqualTo(String value) {
            addCriterion("wordProgress >=", value, "wordprogress");
            return (Criteria) this;
        }

        public Criteria andWordprogressLessThan(String value) {
            addCriterion("wordProgress <", value, "wordprogress");
            return (Criteria) this;
        }

        public Criteria andWordprogressLessThanOrEqualTo(String value) {
            addCriterion("wordProgress <=", value, "wordprogress");
            return (Criteria) this;
        }

        public Criteria andWordprogressLike(String value) {
            addCriterion("wordProgress like", value, "wordprogress");
            return (Criteria) this;
        }

        public Criteria andWordprogressNotLike(String value) {
            addCriterion("wordProgress not like", value, "wordprogress");
            return (Criteria) this;
        }

        public Criteria andWordprogressIn(List<String> values) {
            addCriterion("wordProgress in", values, "wordprogress");
            return (Criteria) this;
        }

        public Criteria andWordprogressNotIn(List<String> values) {
            addCriterion("wordProgress not in", values, "wordprogress");
            return (Criteria) this;
        }

        public Criteria andWordprogressBetween(String value1, String value2) {
            addCriterion("wordProgress between", value1, value2, "wordprogress");
            return (Criteria) this;
        }

        public Criteria andWordprogressNotBetween(String value1, String value2) {
            addCriterion("wordProgress not between", value1, value2, "wordprogress");
            return (Criteria) this;
        }

        public Criteria andWorkattitudeIsNull() {
            addCriterion("workAttitude is null");
            return (Criteria) this;
        }

        public Criteria andWorkattitudeIsNotNull() {
            addCriterion("workAttitude is not null");
            return (Criteria) this;
        }

        public Criteria andWorkattitudeEqualTo(String value) {
            addCriterion("workAttitude =", value, "workattitude");
            return (Criteria) this;
        }

        public Criteria andWorkattitudeNotEqualTo(String value) {
            addCriterion("workAttitude <>", value, "workattitude");
            return (Criteria) this;
        }

        public Criteria andWorkattitudeGreaterThan(String value) {
            addCriterion("workAttitude >", value, "workattitude");
            return (Criteria) this;
        }

        public Criteria andWorkattitudeGreaterThanOrEqualTo(String value) {
            addCriterion("workAttitude >=", value, "workattitude");
            return (Criteria) this;
        }

        public Criteria andWorkattitudeLessThan(String value) {
            addCriterion("workAttitude <", value, "workattitude");
            return (Criteria) this;
        }

        public Criteria andWorkattitudeLessThanOrEqualTo(String value) {
            addCriterion("workAttitude <=", value, "workattitude");
            return (Criteria) this;
        }

        public Criteria andWorkattitudeLike(String value) {
            addCriterion("workAttitude like", value, "workattitude");
            return (Criteria) this;
        }

        public Criteria andWorkattitudeNotLike(String value) {
            addCriterion("workAttitude not like", value, "workattitude");
            return (Criteria) this;
        }

        public Criteria andWorkattitudeIn(List<String> values) {
            addCriterion("workAttitude in", values, "workattitude");
            return (Criteria) this;
        }

        public Criteria andWorkattitudeNotIn(List<String> values) {
            addCriterion("workAttitude not in", values, "workattitude");
            return (Criteria) this;
        }

        public Criteria andWorkattitudeBetween(String value1, String value2) {
            addCriterion("workAttitude between", value1, value2, "workattitude");
            return (Criteria) this;
        }

        public Criteria andWorkattitudeNotBetween(String value1, String value2) {
            addCriterion("workAttitude not between", value1, value2, "workattitude");
            return (Criteria) this;
        }

        public Criteria andQualityadviceIsNull() {
            addCriterion("qualityAdvice is null");
            return (Criteria) this;
        }

        public Criteria andQualityadviceIsNotNull() {
            addCriterion("qualityAdvice is not null");
            return (Criteria) this;
        }

        public Criteria andQualityadviceEqualTo(String value) {
            addCriterion("qualityAdvice =", value, "qualityadvice");
            return (Criteria) this;
        }

        public Criteria andQualityadviceNotEqualTo(String value) {
            addCriterion("qualityAdvice <>", value, "qualityadvice");
            return (Criteria) this;
        }

        public Criteria andQualityadviceGreaterThan(String value) {
            addCriterion("qualityAdvice >", value, "qualityadvice");
            return (Criteria) this;
        }

        public Criteria andQualityadviceGreaterThanOrEqualTo(String value) {
            addCriterion("qualityAdvice >=", value, "qualityadvice");
            return (Criteria) this;
        }

        public Criteria andQualityadviceLessThan(String value) {
            addCriterion("qualityAdvice <", value, "qualityadvice");
            return (Criteria) this;
        }

        public Criteria andQualityadviceLessThanOrEqualTo(String value) {
            addCriterion("qualityAdvice <=", value, "qualityadvice");
            return (Criteria) this;
        }

        public Criteria andQualityadviceLike(String value) {
            addCriterion("qualityAdvice like", value, "qualityadvice");
            return (Criteria) this;
        }

        public Criteria andQualityadviceNotLike(String value) {
            addCriterion("qualityAdvice not like", value, "qualityadvice");
            return (Criteria) this;
        }

        public Criteria andQualityadviceIn(List<String> values) {
            addCriterion("qualityAdvice in", values, "qualityadvice");
            return (Criteria) this;
        }

        public Criteria andQualityadviceNotIn(List<String> values) {
            addCriterion("qualityAdvice not in", values, "qualityadvice");
            return (Criteria) this;
        }

        public Criteria andQualityadviceBetween(String value1, String value2) {
            addCriterion("qualityAdvice between", value1, value2, "qualityadvice");
            return (Criteria) this;
        }

        public Criteria andQualityadviceNotBetween(String value1, String value2) {
            addCriterion("qualityAdvice not between", value1, value2, "qualityadvice");
            return (Criteria) this;
        }

        public Criteria andProblemandaatterIsNull() {
            addCriterion("problemAndAatter is null");
            return (Criteria) this;
        }

        public Criteria andProblemandaatterIsNotNull() {
            addCriterion("problemAndAatter is not null");
            return (Criteria) this;
        }

        public Criteria andProblemandaatterEqualTo(String value) {
            addCriterion("problemAndAatter =", value, "problemandaatter");
            return (Criteria) this;
        }

        public Criteria andProblemandaatterNotEqualTo(String value) {
            addCriterion("problemAndAatter <>", value, "problemandaatter");
            return (Criteria) this;
        }

        public Criteria andProblemandaatterGreaterThan(String value) {
            addCriterion("problemAndAatter >", value, "problemandaatter");
            return (Criteria) this;
        }

        public Criteria andProblemandaatterGreaterThanOrEqualTo(String value) {
            addCriterion("problemAndAatter >=", value, "problemandaatter");
            return (Criteria) this;
        }

        public Criteria andProblemandaatterLessThan(String value) {
            addCriterion("problemAndAatter <", value, "problemandaatter");
            return (Criteria) this;
        }

        public Criteria andProblemandaatterLessThanOrEqualTo(String value) {
            addCriterion("problemAndAatter <=", value, "problemandaatter");
            return (Criteria) this;
        }

        public Criteria andProblemandaatterLike(String value) {
            addCriterion("problemAndAatter like", value, "problemandaatter");
            return (Criteria) this;
        }

        public Criteria andProblemandaatterNotLike(String value) {
            addCriterion("problemAndAatter not like", value, "problemandaatter");
            return (Criteria) this;
        }

        public Criteria andProblemandaatterIn(List<String> values) {
            addCriterion("problemAndAatter in", values, "problemandaatter");
            return (Criteria) this;
        }

        public Criteria andProblemandaatterNotIn(List<String> values) {
            addCriterion("problemAndAatter not in", values, "problemandaatter");
            return (Criteria) this;
        }

        public Criteria andProblemandaatterBetween(String value1, String value2) {
            addCriterion("problemAndAatter between", value1, value2, "problemandaatter");
            return (Criteria) this;
        }

        public Criteria andProblemandaatterNotBetween(String value1, String value2) {
            addCriterion("problemAndAatter not between", value1, value2, "problemandaatter");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("checkTime is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("checkTime is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(Date value) {
            addCriterion("checkTime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(Date value) {
            addCriterion("checkTime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(Date value) {
            addCriterion("checkTime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("checkTime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(Date value) {
            addCriterion("checkTime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(Date value) {
            addCriterion("checkTime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<Date> values) {
            addCriterion("checkTime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<Date> values) {
            addCriterion("checkTime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(Date value1, Date value2) {
            addCriterion("checkTime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(Date value1, Date value2) {
            addCriterion("checkTime not between", value1, value2, "checktime");
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