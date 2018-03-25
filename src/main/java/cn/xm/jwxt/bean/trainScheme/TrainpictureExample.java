package cn.xm.jwxt.bean.trainScheme;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrainpictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainpictureExample() {
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

        public Criteria andPictureidIsNull() {
            addCriterion("pictureId is null");
            return (Criteria) this;
        }

        public Criteria andPictureidIsNotNull() {
            addCriterion("pictureId is not null");
            return (Criteria) this;
        }

        public Criteria andPictureidEqualTo(Integer value) {
            addCriterion("pictureId =", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidNotEqualTo(Integer value) {
            addCriterion("pictureId <>", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidGreaterThan(Integer value) {
            addCriterion("pictureId >", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pictureId >=", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidLessThan(Integer value) {
            addCriterion("pictureId <", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidLessThanOrEqualTo(Integer value) {
            addCriterion("pictureId <=", value, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidIn(List<Integer> values) {
            addCriterion("pictureId in", values, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidNotIn(List<Integer> values) {
            addCriterion("pictureId not in", values, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidBetween(Integer value1, Integer value2) {
            addCriterion("pictureId between", value1, value2, "pictureid");
            return (Criteria) this;
        }

        public Criteria andPictureidNotBetween(Integer value1, Integer value2) {
            addCriterion("pictureId not between", value1, value2, "pictureid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidIsNull() {
            addCriterion("trainningSchemeID is null");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidIsNotNull() {
            addCriterion("trainningSchemeID is not null");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidEqualTo(String value) {
            addCriterion("trainningSchemeID =", value, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidNotEqualTo(String value) {
            addCriterion("trainningSchemeID <>", value, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidGreaterThan(String value) {
            addCriterion("trainningSchemeID >", value, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidGreaterThanOrEqualTo(String value) {
            addCriterion("trainningSchemeID >=", value, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidLessThan(String value) {
            addCriterion("trainningSchemeID <", value, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidLessThanOrEqualTo(String value) {
            addCriterion("trainningSchemeID <=", value, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidLike(String value) {
            addCriterion("trainningSchemeID like", value, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidNotLike(String value) {
            addCriterion("trainningSchemeID not like", value, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidIn(List<String> values) {
            addCriterion("trainningSchemeID in", values, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidNotIn(List<String> values) {
            addCriterion("trainningSchemeID not in", values, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidBetween(String value1, String value2) {
            addCriterion("trainningSchemeID between", value1, value2, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeidNotBetween(String value1, String value2) {
            addCriterion("trainningSchemeID not between", value1, value2, "trainningschemeid");
            return (Criteria) this;
        }

        public Criteria andPicturetypeIsNull() {
            addCriterion("pictureType is null");
            return (Criteria) this;
        }

        public Criteria andPicturetypeIsNotNull() {
            addCriterion("pictureType is not null");
            return (Criteria) this;
        }

        public Criteria andPicturetypeEqualTo(Integer value) {
            addCriterion("pictureType =", value, "picturetype");
            return (Criteria) this;
        }

        public Criteria andPicturetypeNotEqualTo(Integer value) {
            addCriterion("pictureType <>", value, "picturetype");
            return (Criteria) this;
        }

        public Criteria andPicturetypeGreaterThan(Integer value) {
            addCriterion("pictureType >", value, "picturetype");
            return (Criteria) this;
        }

        public Criteria andPicturetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pictureType >=", value, "picturetype");
            return (Criteria) this;
        }

        public Criteria andPicturetypeLessThan(Integer value) {
            addCriterion("pictureType <", value, "picturetype");
            return (Criteria) this;
        }

        public Criteria andPicturetypeLessThanOrEqualTo(Integer value) {
            addCriterion("pictureType <=", value, "picturetype");
            return (Criteria) this;
        }

        public Criteria andPicturetypeIn(List<Integer> values) {
            addCriterion("pictureType in", values, "picturetype");
            return (Criteria) this;
        }

        public Criteria andPicturetypeNotIn(List<Integer> values) {
            addCriterion("pictureType not in", values, "picturetype");
            return (Criteria) this;
        }

        public Criteria andPicturetypeBetween(Integer value1, Integer value2) {
            addCriterion("pictureType between", value1, value2, "picturetype");
            return (Criteria) this;
        }

        public Criteria andPicturetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pictureType not between", value1, value2, "picturetype");
            return (Criteria) this;
        }

        public Criteria andPictureorinameIsNull() {
            addCriterion("pictureOriName is null");
            return (Criteria) this;
        }

        public Criteria andPictureorinameIsNotNull() {
            addCriterion("pictureOriName is not null");
            return (Criteria) this;
        }

        public Criteria andPictureorinameEqualTo(String value) {
            addCriterion("pictureOriName =", value, "pictureoriname");
            return (Criteria) this;
        }

        public Criteria andPictureorinameNotEqualTo(String value) {
            addCriterion("pictureOriName <>", value, "pictureoriname");
            return (Criteria) this;
        }

        public Criteria andPictureorinameGreaterThan(String value) {
            addCriterion("pictureOriName >", value, "pictureoriname");
            return (Criteria) this;
        }

        public Criteria andPictureorinameGreaterThanOrEqualTo(String value) {
            addCriterion("pictureOriName >=", value, "pictureoriname");
            return (Criteria) this;
        }

        public Criteria andPictureorinameLessThan(String value) {
            addCriterion("pictureOriName <", value, "pictureoriname");
            return (Criteria) this;
        }

        public Criteria andPictureorinameLessThanOrEqualTo(String value) {
            addCriterion("pictureOriName <=", value, "pictureoriname");
            return (Criteria) this;
        }

        public Criteria andPictureorinameLike(String value) {
            addCriterion("pictureOriName like", value, "pictureoriname");
            return (Criteria) this;
        }

        public Criteria andPictureorinameNotLike(String value) {
            addCriterion("pictureOriName not like", value, "pictureoriname");
            return (Criteria) this;
        }

        public Criteria andPictureorinameIn(List<String> values) {
            addCriterion("pictureOriName in", values, "pictureoriname");
            return (Criteria) this;
        }

        public Criteria andPictureorinameNotIn(List<String> values) {
            addCriterion("pictureOriName not in", values, "pictureoriname");
            return (Criteria) this;
        }

        public Criteria andPictureorinameBetween(String value1, String value2) {
            addCriterion("pictureOriName between", value1, value2, "pictureoriname");
            return (Criteria) this;
        }

        public Criteria andPictureorinameNotBetween(String value1, String value2) {
            addCriterion("pictureOriName not between", value1, value2, "pictureoriname");
            return (Criteria) this;
        }

        public Criteria andPicturenownameIsNull() {
            addCriterion("pictureNowName is null");
            return (Criteria) this;
        }

        public Criteria andPicturenownameIsNotNull() {
            addCriterion("pictureNowName is not null");
            return (Criteria) this;
        }

        public Criteria andPicturenownameEqualTo(String value) {
            addCriterion("pictureNowName =", value, "picturenowname");
            return (Criteria) this;
        }

        public Criteria andPicturenownameNotEqualTo(String value) {
            addCriterion("pictureNowName <>", value, "picturenowname");
            return (Criteria) this;
        }

        public Criteria andPicturenownameGreaterThan(String value) {
            addCriterion("pictureNowName >", value, "picturenowname");
            return (Criteria) this;
        }

        public Criteria andPicturenownameGreaterThanOrEqualTo(String value) {
            addCriterion("pictureNowName >=", value, "picturenowname");
            return (Criteria) this;
        }

        public Criteria andPicturenownameLessThan(String value) {
            addCriterion("pictureNowName <", value, "picturenowname");
            return (Criteria) this;
        }

        public Criteria andPicturenownameLessThanOrEqualTo(String value) {
            addCriterion("pictureNowName <=", value, "picturenowname");
            return (Criteria) this;
        }

        public Criteria andPicturenownameLike(String value) {
            addCriterion("pictureNowName like", value, "picturenowname");
            return (Criteria) this;
        }

        public Criteria andPicturenownameNotLike(String value) {
            addCriterion("pictureNowName not like", value, "picturenowname");
            return (Criteria) this;
        }

        public Criteria andPicturenownameIn(List<String> values) {
            addCriterion("pictureNowName in", values, "picturenowname");
            return (Criteria) this;
        }

        public Criteria andPicturenownameNotIn(List<String> values) {
            addCriterion("pictureNowName not in", values, "picturenowname");
            return (Criteria) this;
        }

        public Criteria andPicturenownameBetween(String value1, String value2) {
            addCriterion("pictureNowName between", value1, value2, "picturenowname");
            return (Criteria) this;
        }

        public Criteria andPicturenownameNotBetween(String value1, String value2) {
            addCriterion("pictureNowName not between", value1, value2, "picturenowname");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNull() {
            addCriterion("upTime is null");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNotNull() {
            addCriterion("upTime is not null");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(Date value) {
            addCriterion("upTime =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(Date value) {
            addCriterion("upTime <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(Date value) {
            addCriterion("upTime >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upTime >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(Date value) {
            addCriterion("upTime <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(Date value) {
            addCriterion("upTime <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<Date> values) {
            addCriterion("upTime in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<Date> values) {
            addCriterion("upTime not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(Date value1, Date value2) {
            addCriterion("upTime between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(Date value1, Date value2) {
            addCriterion("upTime not between", value1, value2, "uptime");
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