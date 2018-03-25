package cn.xm.jwxt.bean.trainScheme;

import java.util.ArrayList;
import java.util.List;

public class TrainningcapacitybaseinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainningcapacitybaseinfoExample() {
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

        public Criteria andCapacityidIsNull() {
            addCriterion("capacityId is null");
            return (Criteria) this;
        }

        public Criteria andCapacityidIsNotNull() {
            addCriterion("capacityId is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityidEqualTo(Integer value) {
            addCriterion("capacityId =", value, "capacityid");
            return (Criteria) this;
        }

        public Criteria andCapacityidNotEqualTo(Integer value) {
            addCriterion("capacityId <>", value, "capacityid");
            return (Criteria) this;
        }

        public Criteria andCapacityidGreaterThan(Integer value) {
            addCriterion("capacityId >", value, "capacityid");
            return (Criteria) this;
        }

        public Criteria andCapacityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("capacityId >=", value, "capacityid");
            return (Criteria) this;
        }

        public Criteria andCapacityidLessThan(Integer value) {
            addCriterion("capacityId <", value, "capacityid");
            return (Criteria) this;
        }

        public Criteria andCapacityidLessThanOrEqualTo(Integer value) {
            addCriterion("capacityId <=", value, "capacityid");
            return (Criteria) this;
        }

        public Criteria andCapacityidIn(List<Integer> values) {
            addCriterion("capacityId in", values, "capacityid");
            return (Criteria) this;
        }

        public Criteria andCapacityidNotIn(List<Integer> values) {
            addCriterion("capacityId not in", values, "capacityid");
            return (Criteria) this;
        }

        public Criteria andCapacityidBetween(Integer value1, Integer value2) {
            addCriterion("capacityId between", value1, value2, "capacityid");
            return (Criteria) this;
        }

        public Criteria andCapacityidNotBetween(Integer value1, Integer value2) {
            addCriterion("capacityId not between", value1, value2, "capacityid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidIsNull() {
            addCriterion("trainingSchemeID is null");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidIsNotNull() {
            addCriterion("trainingSchemeID is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidEqualTo(String value) {
            addCriterion("trainingSchemeID =", value, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidNotEqualTo(String value) {
            addCriterion("trainingSchemeID <>", value, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidGreaterThan(String value) {
            addCriterion("trainingSchemeID >", value, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidGreaterThanOrEqualTo(String value) {
            addCriterion("trainingSchemeID >=", value, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidLessThan(String value) {
            addCriterion("trainingSchemeID <", value, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidLessThanOrEqualTo(String value) {
            addCriterion("trainingSchemeID <=", value, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidLike(String value) {
            addCriterion("trainingSchemeID like", value, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidNotLike(String value) {
            addCriterion("trainingSchemeID not like", value, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidIn(List<String> values) {
            addCriterion("trainingSchemeID in", values, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidNotIn(List<String> values) {
            addCriterion("trainingSchemeID not in", values, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidBetween(String value1, String value2) {
            addCriterion("trainingSchemeID between", value1, value2, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andTrainingschemeidNotBetween(String value1, String value2) {
            addCriterion("trainingSchemeID not between", value1, value2, "trainingschemeid");
            return (Criteria) this;
        }

        public Criteria andCapacitysortIsNull() {
            addCriterion("capacitySort is null");
            return (Criteria) this;
        }

        public Criteria andCapacitysortIsNotNull() {
            addCriterion("capacitySort is not null");
            return (Criteria) this;
        }

        public Criteria andCapacitysortEqualTo(String value) {
            addCriterion("capacitySort =", value, "capacitysort");
            return (Criteria) this;
        }

        public Criteria andCapacitysortNotEqualTo(String value) {
            addCriterion("capacitySort <>", value, "capacitysort");
            return (Criteria) this;
        }

        public Criteria andCapacitysortGreaterThan(String value) {
            addCriterion("capacitySort >", value, "capacitysort");
            return (Criteria) this;
        }

        public Criteria andCapacitysortGreaterThanOrEqualTo(String value) {
            addCriterion("capacitySort >=", value, "capacitysort");
            return (Criteria) this;
        }

        public Criteria andCapacitysortLessThan(String value) {
            addCriterion("capacitySort <", value, "capacitysort");
            return (Criteria) this;
        }

        public Criteria andCapacitysortLessThanOrEqualTo(String value) {
            addCriterion("capacitySort <=", value, "capacitysort");
            return (Criteria) this;
        }

        public Criteria andCapacitysortLike(String value) {
            addCriterion("capacitySort like", value, "capacitysort");
            return (Criteria) this;
        }

        public Criteria andCapacitysortNotLike(String value) {
            addCriterion("capacitySort not like", value, "capacitysort");
            return (Criteria) this;
        }

        public Criteria andCapacitysortIn(List<String> values) {
            addCriterion("capacitySort in", values, "capacitysort");
            return (Criteria) this;
        }

        public Criteria andCapacitysortNotIn(List<String> values) {
            addCriterion("capacitySort not in", values, "capacitysort");
            return (Criteria) this;
        }

        public Criteria andCapacitysortBetween(String value1, String value2) {
            addCriterion("capacitySort between", value1, value2, "capacitysort");
            return (Criteria) this;
        }

        public Criteria andCapacitysortNotBetween(String value1, String value2) {
            addCriterion("capacitySort not between", value1, value2, "capacitysort");
            return (Criteria) this;
        }

        public Criteria andCapacitynameIsNull() {
            addCriterion("capacityName is null");
            return (Criteria) this;
        }

        public Criteria andCapacitynameIsNotNull() {
            addCriterion("capacityName is not null");
            return (Criteria) this;
        }

        public Criteria andCapacitynameEqualTo(String value) {
            addCriterion("capacityName =", value, "capacityname");
            return (Criteria) this;
        }

        public Criteria andCapacitynameNotEqualTo(String value) {
            addCriterion("capacityName <>", value, "capacityname");
            return (Criteria) this;
        }

        public Criteria andCapacitynameGreaterThan(String value) {
            addCriterion("capacityName >", value, "capacityname");
            return (Criteria) this;
        }

        public Criteria andCapacitynameGreaterThanOrEqualTo(String value) {
            addCriterion("capacityName >=", value, "capacityname");
            return (Criteria) this;
        }

        public Criteria andCapacitynameLessThan(String value) {
            addCriterion("capacityName <", value, "capacityname");
            return (Criteria) this;
        }

        public Criteria andCapacitynameLessThanOrEqualTo(String value) {
            addCriterion("capacityName <=", value, "capacityname");
            return (Criteria) this;
        }

        public Criteria andCapacitynameLike(String value) {
            addCriterion("capacityName like", value, "capacityname");
            return (Criteria) this;
        }

        public Criteria andCapacitynameNotLike(String value) {
            addCriterion("capacityName not like", value, "capacityname");
            return (Criteria) this;
        }

        public Criteria andCapacitynameIn(List<String> values) {
            addCriterion("capacityName in", values, "capacityname");
            return (Criteria) this;
        }

        public Criteria andCapacitynameNotIn(List<String> values) {
            addCriterion("capacityName not in", values, "capacityname");
            return (Criteria) this;
        }

        public Criteria andCapacitynameBetween(String value1, String value2) {
            addCriterion("capacityName between", value1, value2, "capacityname");
            return (Criteria) this;
        }

        public Criteria andCapacitynameNotBetween(String value1, String value2) {
            addCriterion("capacityName not between", value1, value2, "capacityname");
            return (Criteria) this;
        }

        public Criteria andCapacitydescriptionIsNull() {
            addCriterion("capacityDescription is null");
            return (Criteria) this;
        }

        public Criteria andCapacitydescriptionIsNotNull() {
            addCriterion("capacityDescription is not null");
            return (Criteria) this;
        }

        public Criteria andCapacitydescriptionEqualTo(String value) {
            addCriterion("capacityDescription =", value, "capacitydescription");
            return (Criteria) this;
        }

        public Criteria andCapacitydescriptionNotEqualTo(String value) {
            addCriterion("capacityDescription <>", value, "capacitydescription");
            return (Criteria) this;
        }

        public Criteria andCapacitydescriptionGreaterThan(String value) {
            addCriterion("capacityDescription >", value, "capacitydescription");
            return (Criteria) this;
        }

        public Criteria andCapacitydescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("capacityDescription >=", value, "capacitydescription");
            return (Criteria) this;
        }

        public Criteria andCapacitydescriptionLessThan(String value) {
            addCriterion("capacityDescription <", value, "capacitydescription");
            return (Criteria) this;
        }

        public Criteria andCapacitydescriptionLessThanOrEqualTo(String value) {
            addCriterion("capacityDescription <=", value, "capacitydescription");
            return (Criteria) this;
        }

        public Criteria andCapacitydescriptionLike(String value) {
            addCriterion("capacityDescription like", value, "capacitydescription");
            return (Criteria) this;
        }

        public Criteria andCapacitydescriptionNotLike(String value) {
            addCriterion("capacityDescription not like", value, "capacitydescription");
            return (Criteria) this;
        }

        public Criteria andCapacitydescriptionIn(List<String> values) {
            addCriterion("capacityDescription in", values, "capacitydescription");
            return (Criteria) this;
        }

        public Criteria andCapacitydescriptionNotIn(List<String> values) {
            addCriterion("capacityDescription not in", values, "capacitydescription");
            return (Criteria) this;
        }

        public Criteria andCapacitydescriptionBetween(String value1, String value2) {
            addCriterion("capacityDescription between", value1, value2, "capacitydescription");
            return (Criteria) this;
        }

        public Criteria andCapacitydescriptionNotBetween(String value1, String value2) {
            addCriterion("capacityDescription not between", value1, value2, "capacitydescription");
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