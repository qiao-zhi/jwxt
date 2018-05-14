package cn.xm.jwxt.bean.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogtableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogtableExample() {
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

        public Criteria andLogidIsNull() {
            addCriterion("logid is null");
            return (Criteria) this;
        }

        public Criteria andLogidIsNotNull() {
            addCriterion("logid is not null");
            return (Criteria) this;
        }

        public Criteria andLogidEqualTo(Integer value) {
            addCriterion("logid =", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotEqualTo(Integer value) {
            addCriterion("logid <>", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThan(Integer value) {
            addCriterion("logid >", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("logid >=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThan(Integer value) {
            addCriterion("logid <", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThanOrEqualTo(Integer value) {
            addCriterion("logid <=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidIn(List<Integer> values) {
            addCriterion("logid in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotIn(List<Integer> values) {
            addCriterion("logid not in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidBetween(Integer value1, Integer value2) {
            addCriterion("logid between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("logid not between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andOperatornameIsNull() {
            addCriterion("operatorName is null");
            return (Criteria) this;
        }

        public Criteria andOperatornameIsNotNull() {
            addCriterion("operatorName is not null");
            return (Criteria) this;
        }

        public Criteria andOperatornameEqualTo(String value) {
            addCriterion("operatorName =", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotEqualTo(String value) {
            addCriterion("operatorName <>", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThan(String value) {
            addCriterion("operatorName >", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThanOrEqualTo(String value) {
            addCriterion("operatorName >=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThan(String value) {
            addCriterion("operatorName <", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThanOrEqualTo(String value) {
            addCriterion("operatorName <=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLike(String value) {
            addCriterion("operatorName like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotLike(String value) {
            addCriterion("operatorName not like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameIn(List<String> values) {
            addCriterion("operatorName in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotIn(List<String> values) {
            addCriterion("operatorName not in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameBetween(String value1, String value2) {
            addCriterion("operatorName between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotBetween(String value1, String value2) {
            addCriterion("operatorName not between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNull() {
            addCriterion("operatorId is null");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNotNull() {
            addCriterion("operatorId is not null");
            return (Criteria) this;
        }

        public Criteria andOperatoridEqualTo(String value) {
            addCriterion("operatorId =", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotEqualTo(String value) {
            addCriterion("operatorId <>", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThan(String value) {
            addCriterion("operatorId >", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThanOrEqualTo(String value) {
            addCriterion("operatorId >=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThan(String value) {
            addCriterion("operatorId <", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThanOrEqualTo(String value) {
            addCriterion("operatorId <=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLike(String value) {
            addCriterion("operatorId like", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotLike(String value) {
            addCriterion("operatorId not like", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridIn(List<String> values) {
            addCriterion("operatorId in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotIn(List<String> values) {
            addCriterion("operatorId not in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridBetween(String value1, String value2) {
            addCriterion("operatorId between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotBetween(String value1, String value2) {
            addCriterion("operatorId not between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatortypeIsNull() {
            addCriterion("operatorType is null");
            return (Criteria) this;
        }

        public Criteria andOperatortypeIsNotNull() {
            addCriterion("operatorType is not null");
            return (Criteria) this;
        }

        public Criteria andOperatortypeEqualTo(String value) {
            addCriterion("operatorType =", value, "operatortype");
            return (Criteria) this;
        }

        public Criteria andOperatortypeNotEqualTo(String value) {
            addCriterion("operatorType <>", value, "operatortype");
            return (Criteria) this;
        }

        public Criteria andOperatortypeGreaterThan(String value) {
            addCriterion("operatorType >", value, "operatortype");
            return (Criteria) this;
        }

        public Criteria andOperatortypeGreaterThanOrEqualTo(String value) {
            addCriterion("operatorType >=", value, "operatortype");
            return (Criteria) this;
        }

        public Criteria andOperatortypeLessThan(String value) {
            addCriterion("operatorType <", value, "operatortype");
            return (Criteria) this;
        }

        public Criteria andOperatortypeLessThanOrEqualTo(String value) {
            addCriterion("operatorType <=", value, "operatortype");
            return (Criteria) this;
        }

        public Criteria andOperatortypeLike(String value) {
            addCriterion("operatorType like", value, "operatortype");
            return (Criteria) this;
        }

        public Criteria andOperatortypeNotLike(String value) {
            addCriterion("operatorType not like", value, "operatortype");
            return (Criteria) this;
        }

        public Criteria andOperatortypeIn(List<String> values) {
            addCriterion("operatorType in", values, "operatortype");
            return (Criteria) this;
        }

        public Criteria andOperatortypeNotIn(List<String> values) {
            addCriterion("operatorType not in", values, "operatortype");
            return (Criteria) this;
        }

        public Criteria andOperatortypeBetween(String value1, String value2) {
            addCriterion("operatorType between", value1, value2, "operatortype");
            return (Criteria) this;
        }

        public Criteria andOperatortypeNotBetween(String value1, String value2) {
            addCriterion("operatorType not between", value1, value2, "operatortype");
            return (Criteria) this;
        }

        public Criteria andOperatorunitnameIsNull() {
            addCriterion("operatorUnitName is null");
            return (Criteria) this;
        }

        public Criteria andOperatorunitnameIsNotNull() {
            addCriterion("operatorUnitName is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorunitnameEqualTo(String value) {
            addCriterion("operatorUnitName =", value, "operatorunitname");
            return (Criteria) this;
        }

        public Criteria andOperatorunitnameNotEqualTo(String value) {
            addCriterion("operatorUnitName <>", value, "operatorunitname");
            return (Criteria) this;
        }

        public Criteria andOperatorunitnameGreaterThan(String value) {
            addCriterion("operatorUnitName >", value, "operatorunitname");
            return (Criteria) this;
        }

        public Criteria andOperatorunitnameGreaterThanOrEqualTo(String value) {
            addCriterion("operatorUnitName >=", value, "operatorunitname");
            return (Criteria) this;
        }

        public Criteria andOperatorunitnameLessThan(String value) {
            addCriterion("operatorUnitName <", value, "operatorunitname");
            return (Criteria) this;
        }

        public Criteria andOperatorunitnameLessThanOrEqualTo(String value) {
            addCriterion("operatorUnitName <=", value, "operatorunitname");
            return (Criteria) this;
        }

        public Criteria andOperatorunitnameLike(String value) {
            addCriterion("operatorUnitName like", value, "operatorunitname");
            return (Criteria) this;
        }

        public Criteria andOperatorunitnameNotLike(String value) {
            addCriterion("operatorUnitName not like", value, "operatorunitname");
            return (Criteria) this;
        }

        public Criteria andOperatorunitnameIn(List<String> values) {
            addCriterion("operatorUnitName in", values, "operatorunitname");
            return (Criteria) this;
        }

        public Criteria andOperatorunitnameNotIn(List<String> values) {
            addCriterion("operatorUnitName not in", values, "operatorunitname");
            return (Criteria) this;
        }

        public Criteria andOperatorunitnameBetween(String value1, String value2) {
            addCriterion("operatorUnitName between", value1, value2, "operatorunitname");
            return (Criteria) this;
        }

        public Criteria andOperatorunitnameNotBetween(String value1, String value2) {
            addCriterion("operatorUnitName not between", value1, value2, "operatorunitname");
            return (Criteria) this;
        }

        public Criteria andOperatedescriptionIsNull() {
            addCriterion("operateDescription is null");
            return (Criteria) this;
        }

        public Criteria andOperatedescriptionIsNotNull() {
            addCriterion("operateDescription is not null");
            return (Criteria) this;
        }

        public Criteria andOperatedescriptionEqualTo(String value) {
            addCriterion("operateDescription =", value, "operatedescription");
            return (Criteria) this;
        }

        public Criteria andOperatedescriptionNotEqualTo(String value) {
            addCriterion("operateDescription <>", value, "operatedescription");
            return (Criteria) this;
        }

        public Criteria andOperatedescriptionGreaterThan(String value) {
            addCriterion("operateDescription >", value, "operatedescription");
            return (Criteria) this;
        }

        public Criteria andOperatedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("operateDescription >=", value, "operatedescription");
            return (Criteria) this;
        }

        public Criteria andOperatedescriptionLessThan(String value) {
            addCriterion("operateDescription <", value, "operatedescription");
            return (Criteria) this;
        }

        public Criteria andOperatedescriptionLessThanOrEqualTo(String value) {
            addCriterion("operateDescription <=", value, "operatedescription");
            return (Criteria) this;
        }

        public Criteria andOperatedescriptionLike(String value) {
            addCriterion("operateDescription like", value, "operatedescription");
            return (Criteria) this;
        }

        public Criteria andOperatedescriptionNotLike(String value) {
            addCriterion("operateDescription not like", value, "operatedescription");
            return (Criteria) this;
        }

        public Criteria andOperatedescriptionIn(List<String> values) {
            addCriterion("operateDescription in", values, "operatedescription");
            return (Criteria) this;
        }

        public Criteria andOperatedescriptionNotIn(List<String> values) {
            addCriterion("operateDescription not in", values, "operatedescription");
            return (Criteria) this;
        }

        public Criteria andOperatedescriptionBetween(String value1, String value2) {
            addCriterion("operateDescription between", value1, value2, "operatedescription");
            return (Criteria) this;
        }

        public Criteria andOperatedescriptionNotBetween(String value1, String value2) {
            addCriterion("operateDescription not between", value1, value2, "operatedescription");
            return (Criteria) this;
        }

        public Criteria andOperateresultIsNull() {
            addCriterion("operateResult is null");
            return (Criteria) this;
        }

        public Criteria andOperateresultIsNotNull() {
            addCriterion("operateResult is not null");
            return (Criteria) this;
        }

        public Criteria andOperateresultEqualTo(String value) {
            addCriterion("operateResult =", value, "operateresult");
            return (Criteria) this;
        }

        public Criteria andOperateresultNotEqualTo(String value) {
            addCriterion("operateResult <>", value, "operateresult");
            return (Criteria) this;
        }

        public Criteria andOperateresultGreaterThan(String value) {
            addCriterion("operateResult >", value, "operateresult");
            return (Criteria) this;
        }

        public Criteria andOperateresultGreaterThanOrEqualTo(String value) {
            addCriterion("operateResult >=", value, "operateresult");
            return (Criteria) this;
        }

        public Criteria andOperateresultLessThan(String value) {
            addCriterion("operateResult <", value, "operateresult");
            return (Criteria) this;
        }

        public Criteria andOperateresultLessThanOrEqualTo(String value) {
            addCriterion("operateResult <=", value, "operateresult");
            return (Criteria) this;
        }

        public Criteria andOperateresultLike(String value) {
            addCriterion("operateResult like", value, "operateresult");
            return (Criteria) this;
        }

        public Criteria andOperateresultNotLike(String value) {
            addCriterion("operateResult not like", value, "operateresult");
            return (Criteria) this;
        }

        public Criteria andOperateresultIn(List<String> values) {
            addCriterion("operateResult in", values, "operateresult");
            return (Criteria) this;
        }

        public Criteria andOperateresultNotIn(List<String> values) {
            addCriterion("operateResult not in", values, "operateresult");
            return (Criteria) this;
        }

        public Criteria andOperateresultBetween(String value1, String value2) {
            addCriterion("operateResult between", value1, value2, "operateresult");
            return (Criteria) this;
        }

        public Criteria andOperateresultNotBetween(String value1, String value2) {
            addCriterion("operateResult not between", value1, value2, "operateresult");
            return (Criteria) this;
        }

        public Criteria andOperateclassIsNull() {
            addCriterion("operateClass is null");
            return (Criteria) this;
        }

        public Criteria andOperateclassIsNotNull() {
            addCriterion("operateClass is not null");
            return (Criteria) this;
        }

        public Criteria andOperateclassEqualTo(String value) {
            addCriterion("operateClass =", value, "operateclass");
            return (Criteria) this;
        }

        public Criteria andOperateclassNotEqualTo(String value) {
            addCriterion("operateClass <>", value, "operateclass");
            return (Criteria) this;
        }

        public Criteria andOperateclassGreaterThan(String value) {
            addCriterion("operateClass >", value, "operateclass");
            return (Criteria) this;
        }

        public Criteria andOperateclassGreaterThanOrEqualTo(String value) {
            addCriterion("operateClass >=", value, "operateclass");
            return (Criteria) this;
        }

        public Criteria andOperateclassLessThan(String value) {
            addCriterion("operateClass <", value, "operateclass");
            return (Criteria) this;
        }

        public Criteria andOperateclassLessThanOrEqualTo(String value) {
            addCriterion("operateClass <=", value, "operateclass");
            return (Criteria) this;
        }

        public Criteria andOperateclassLike(String value) {
            addCriterion("operateClass like", value, "operateclass");
            return (Criteria) this;
        }

        public Criteria andOperateclassNotLike(String value) {
            addCriterion("operateClass not like", value, "operateclass");
            return (Criteria) this;
        }

        public Criteria andOperateclassIn(List<String> values) {
            addCriterion("operateClass in", values, "operateclass");
            return (Criteria) this;
        }

        public Criteria andOperateclassNotIn(List<String> values) {
            addCriterion("operateClass not in", values, "operateclass");
            return (Criteria) this;
        }

        public Criteria andOperateclassBetween(String value1, String value2) {
            addCriterion("operateClass between", value1, value2, "operateclass");
            return (Criteria) this;
        }

        public Criteria andOperateclassNotBetween(String value1, String value2) {
            addCriterion("operateClass not between", value1, value2, "operateclass");
            return (Criteria) this;
        }

        public Criteria andOperatemethodIsNull() {
            addCriterion("operateMethod is null");
            return (Criteria) this;
        }

        public Criteria andOperatemethodIsNotNull() {
            addCriterion("operateMethod is not null");
            return (Criteria) this;
        }

        public Criteria andOperatemethodEqualTo(String value) {
            addCriterion("operateMethod =", value, "operatemethod");
            return (Criteria) this;
        }

        public Criteria andOperatemethodNotEqualTo(String value) {
            addCriterion("operateMethod <>", value, "operatemethod");
            return (Criteria) this;
        }

        public Criteria andOperatemethodGreaterThan(String value) {
            addCriterion("operateMethod >", value, "operatemethod");
            return (Criteria) this;
        }

        public Criteria andOperatemethodGreaterThanOrEqualTo(String value) {
            addCriterion("operateMethod >=", value, "operatemethod");
            return (Criteria) this;
        }

        public Criteria andOperatemethodLessThan(String value) {
            addCriterion("operateMethod <", value, "operatemethod");
            return (Criteria) this;
        }

        public Criteria andOperatemethodLessThanOrEqualTo(String value) {
            addCriterion("operateMethod <=", value, "operatemethod");
            return (Criteria) this;
        }

        public Criteria andOperatemethodLike(String value) {
            addCriterion("operateMethod like", value, "operatemethod");
            return (Criteria) this;
        }

        public Criteria andOperatemethodNotLike(String value) {
            addCriterion("operateMethod not like", value, "operatemethod");
            return (Criteria) this;
        }

        public Criteria andOperatemethodIn(List<String> values) {
            addCriterion("operateMethod in", values, "operatemethod");
            return (Criteria) this;
        }

        public Criteria andOperatemethodNotIn(List<String> values) {
            addCriterion("operateMethod not in", values, "operatemethod");
            return (Criteria) this;
        }

        public Criteria andOperatemethodBetween(String value1, String value2) {
            addCriterion("operateMethod between", value1, value2, "operatemethod");
            return (Criteria) this;
        }

        public Criteria andOperatemethodNotBetween(String value1, String value2) {
            addCriterion("operateMethod not between", value1, value2, "operatemethod");
            return (Criteria) this;
        }

        public Criteria andOperatedateIsNull() {
            addCriterion("operateDate is null");
            return (Criteria) this;
        }

        public Criteria andOperatedateIsNotNull() {
            addCriterion("operateDate is not null");
            return (Criteria) this;
        }

        public Criteria andOperatedateEqualTo(Date value) {
            addCriterion("operateDate =", value, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateNotEqualTo(Date value) {
            addCriterion("operateDate <>", value, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateGreaterThan(Date value) {
            addCriterion("operateDate >", value, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("operateDate >=", value, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateLessThan(Date value) {
            addCriterion("operateDate <", value, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateLessThanOrEqualTo(Date value) {
            addCriterion("operateDate <=", value, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateIn(List<Date> values) {
            addCriterion("operateDate in", values, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateNotIn(List<Date> values) {
            addCriterion("operateDate not in", values, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateBetween(Date value1, Date value2) {
            addCriterion("operateDate between", value1, value2, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperatedateNotBetween(Date value1, Date value2) {
            addCriterion("operateDate not between", value1, value2, "operatedate");
            return (Criteria) this;
        }

        public Criteria andOperateipIsNull() {
            addCriterion("operateIP is null");
            return (Criteria) this;
        }

        public Criteria andOperateipIsNotNull() {
            addCriterion("operateIP is not null");
            return (Criteria) this;
        }

        public Criteria andOperateipEqualTo(String value) {
            addCriterion("operateIP =", value, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipNotEqualTo(String value) {
            addCriterion("operateIP <>", value, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipGreaterThan(String value) {
            addCriterion("operateIP >", value, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipGreaterThanOrEqualTo(String value) {
            addCriterion("operateIP >=", value, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipLessThan(String value) {
            addCriterion("operateIP <", value, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipLessThanOrEqualTo(String value) {
            addCriterion("operateIP <=", value, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipLike(String value) {
            addCriterion("operateIP like", value, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipNotLike(String value) {
            addCriterion("operateIP not like", value, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipIn(List<String> values) {
            addCriterion("operateIP in", values, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipNotIn(List<String> values) {
            addCriterion("operateIP not in", values, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipBetween(String value1, String value2) {
            addCriterion("operateIP between", value1, value2, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipNotBetween(String value1, String value2) {
            addCriterion("operateIP not between", value1, value2, "operateip");
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