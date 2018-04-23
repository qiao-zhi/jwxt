package cn.xm.jwxt.bean.trainScheme;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TrainschemeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainschemeinfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andTrainingschemanameIsNull() {
            addCriterion("trainingSchemaName is null");
            return (Criteria) this;
        }

        public Criteria andTrainingschemanameIsNotNull() {
            addCriterion("trainingSchemaName is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingschemanameEqualTo(String value) {
            addCriterion("trainingSchemaName =", value, "trainingschemaname");
            return (Criteria) this;
        }

        public Criteria andTrainingschemanameNotEqualTo(String value) {
            addCriterion("trainingSchemaName <>", value, "trainingschemaname");
            return (Criteria) this;
        }

        public Criteria andTrainingschemanameGreaterThan(String value) {
            addCriterion("trainingSchemaName >", value, "trainingschemaname");
            return (Criteria) this;
        }

        public Criteria andTrainingschemanameGreaterThanOrEqualTo(String value) {
            addCriterion("trainingSchemaName >=", value, "trainingschemaname");
            return (Criteria) this;
        }

        public Criteria andTrainingschemanameLessThan(String value) {
            addCriterion("trainingSchemaName <", value, "trainingschemaname");
            return (Criteria) this;
        }

        public Criteria andTrainingschemanameLessThanOrEqualTo(String value) {
            addCriterion("trainingSchemaName <=", value, "trainingschemaname");
            return (Criteria) this;
        }

        public Criteria andTrainingschemanameLike(String value) {
            addCriterion("trainingSchemaName like", value, "trainingschemaname");
            return (Criteria) this;
        }

        public Criteria andTrainingschemanameNotLike(String value) {
            addCriterion("trainingSchemaName not like", value, "trainingschemaname");
            return (Criteria) this;
        }

        public Criteria andTrainingschemanameIn(List<String> values) {
            addCriterion("trainingSchemaName in", values, "trainingschemaname");
            return (Criteria) this;
        }

        public Criteria andTrainingschemanameNotIn(List<String> values) {
            addCriterion("trainingSchemaName not in", values, "trainingschemaname");
            return (Criteria) this;
        }

        public Criteria andTrainingschemanameBetween(String value1, String value2) {
            addCriterion("trainingSchemaName between", value1, value2, "trainingschemaname");
            return (Criteria) this;
        }

        public Criteria andTrainingschemanameNotBetween(String value1, String value2) {
            addCriterion("trainingSchemaName not between", value1, value2, "trainingschemaname");
            return (Criteria) this;
        }

        public Criteria andMajornameIsNull() {
            addCriterion("majorName is null");
            return (Criteria) this;
        }

        public Criteria andMajornameIsNotNull() {
            addCriterion("majorName is not null");
            return (Criteria) this;
        }

        public Criteria andMajornameEqualTo(String value) {
            addCriterion("majorName =", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotEqualTo(String value) {
            addCriterion("majorName <>", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameGreaterThan(String value) {
            addCriterion("majorName >", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameGreaterThanOrEqualTo(String value) {
            addCriterion("majorName >=", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLessThan(String value) {
            addCriterion("majorName <", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLessThanOrEqualTo(String value) {
            addCriterion("majorName <=", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLike(String value) {
            addCriterion("majorName like", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotLike(String value) {
            addCriterion("majorName not like", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameIn(List<String> values) {
            addCriterion("majorName in", values, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotIn(List<String> values) {
            addCriterion("majorName not in", values, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameBetween(String value1, String value2) {
            addCriterion("majorName between", value1, value2, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotBetween(String value1, String value2) {
            addCriterion("majorName not between", value1, value2, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajoridIsNull() {
            addCriterion("majorID is null");
            return (Criteria) this;
        }

        public Criteria andMajoridIsNotNull() {
            addCriterion("majorID is not null");
            return (Criteria) this;
        }

        public Criteria andMajoridEqualTo(String value) {
            addCriterion("majorID =", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotEqualTo(String value) {
            addCriterion("majorID <>", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThan(String value) {
            addCriterion("majorID >", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThanOrEqualTo(String value) {
            addCriterion("majorID >=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThan(String value) {
            addCriterion("majorID <", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThanOrEqualTo(String value) {
            addCriterion("majorID <=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLike(String value) {
            addCriterion("majorID like", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotLike(String value) {
            addCriterion("majorID not like", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridIn(List<String> values) {
            addCriterion("majorID in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotIn(List<String> values) {
            addCriterion("majorID not in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridBetween(String value1, String value2) {
            addCriterion("majorID between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotBetween(String value1, String value2) {
            addCriterion("majorID not between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andRevisepersonIsNull() {
            addCriterion("revisePerson is null");
            return (Criteria) this;
        }

        public Criteria andRevisepersonIsNotNull() {
            addCriterion("revisePerson is not null");
            return (Criteria) this;
        }

        public Criteria andRevisepersonEqualTo(String value) {
            addCriterion("revisePerson =", value, "reviseperson");
            return (Criteria) this;
        }

        public Criteria andRevisepersonNotEqualTo(String value) {
            addCriterion("revisePerson <>", value, "reviseperson");
            return (Criteria) this;
        }

        public Criteria andRevisepersonGreaterThan(String value) {
            addCriterion("revisePerson >", value, "reviseperson");
            return (Criteria) this;
        }

        public Criteria andRevisepersonGreaterThanOrEqualTo(String value) {
            addCriterion("revisePerson >=", value, "reviseperson");
            return (Criteria) this;
        }

        public Criteria andRevisepersonLessThan(String value) {
            addCriterion("revisePerson <", value, "reviseperson");
            return (Criteria) this;
        }

        public Criteria andRevisepersonLessThanOrEqualTo(String value) {
            addCriterion("revisePerson <=", value, "reviseperson");
            return (Criteria) this;
        }

        public Criteria andRevisepersonLike(String value) {
            addCriterion("revisePerson like", value, "reviseperson");
            return (Criteria) this;
        }

        public Criteria andRevisepersonNotLike(String value) {
            addCriterion("revisePerson not like", value, "reviseperson");
            return (Criteria) this;
        }

        public Criteria andRevisepersonIn(List<String> values) {
            addCriterion("revisePerson in", values, "reviseperson");
            return (Criteria) this;
        }

        public Criteria andRevisepersonNotIn(List<String> values) {
            addCriterion("revisePerson not in", values, "reviseperson");
            return (Criteria) this;
        }

        public Criteria andRevisepersonBetween(String value1, String value2) {
            addCriterion("revisePerson between", value1, value2, "reviseperson");
            return (Criteria) this;
        }

        public Criteria andRevisepersonNotBetween(String value1, String value2) {
            addCriterion("revisePerson not between", value1, value2, "reviseperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonIsNull() {
            addCriterion("checkPerson is null");
            return (Criteria) this;
        }

        public Criteria andCheckpersonIsNotNull() {
            addCriterion("checkPerson is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpersonEqualTo(String value) {
            addCriterion("checkPerson =", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotEqualTo(String value) {
            addCriterion("checkPerson <>", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonGreaterThan(String value) {
            addCriterion("checkPerson >", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonGreaterThanOrEqualTo(String value) {
            addCriterion("checkPerson >=", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLessThan(String value) {
            addCriterion("checkPerson <", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLessThanOrEqualTo(String value) {
            addCriterion("checkPerson <=", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLike(String value) {
            addCriterion("checkPerson like", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotLike(String value) {
            addCriterion("checkPerson not like", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonIn(List<String> values) {
            addCriterion("checkPerson in", values, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotIn(List<String> values) {
            addCriterion("checkPerson not in", values, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonBetween(String value1, String value2) {
            addCriterion("checkPerson between", value1, value2, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotBetween(String value1, String value2) {
            addCriterion("checkPerson not between", value1, value2, "checkperson");
            return (Criteria) this;
        }

        public Criteria andMajormanagerIsNull() {
            addCriterion("majorManager is null");
            return (Criteria) this;
        }

        public Criteria andMajormanagerIsNotNull() {
            addCriterion("majorManager is not null");
            return (Criteria) this;
        }

        public Criteria andMajormanagerEqualTo(String value) {
            addCriterion("majorManager =", value, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerNotEqualTo(String value) {
            addCriterion("majorManager <>", value, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerGreaterThan(String value) {
            addCriterion("majorManager >", value, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerGreaterThanOrEqualTo(String value) {
            addCriterion("majorManager >=", value, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerLessThan(String value) {
            addCriterion("majorManager <", value, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerLessThanOrEqualTo(String value) {
            addCriterion("majorManager <=", value, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerLike(String value) {
            addCriterion("majorManager like", value, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerNotLike(String value) {
            addCriterion("majorManager not like", value, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerIn(List<String> values) {
            addCriterion("majorManager in", values, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerNotIn(List<String> values) {
            addCriterion("majorManager not in", values, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerBetween(String value1, String value2) {
            addCriterion("majorManager between", value1, value2, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajormanagerNotBetween(String value1, String value2) {
            addCriterion("majorManager not between", value1, value2, "majormanager");
            return (Criteria) this;
        }

        public Criteria andMajortypeIsNull() {
            addCriterion("majorType is null");
            return (Criteria) this;
        }

        public Criteria andMajortypeIsNotNull() {
            addCriterion("majorType is not null");
            return (Criteria) this;
        }

        public Criteria andMajortypeEqualTo(String value) {
            addCriterion("majorType =", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeNotEqualTo(String value) {
            addCriterion("majorType <>", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeGreaterThan(String value) {
            addCriterion("majorType >", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeGreaterThanOrEqualTo(String value) {
            addCriterion("majorType >=", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeLessThan(String value) {
            addCriterion("majorType <", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeLessThanOrEqualTo(String value) {
            addCriterion("majorType <=", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeLike(String value) {
            addCriterion("majorType like", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeNotLike(String value) {
            addCriterion("majorType not like", value, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeIn(List<String> values) {
            addCriterion("majorType in", values, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeNotIn(List<String> values) {
            addCriterion("majorType not in", values, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeBetween(String value1, String value2) {
            addCriterion("majorType between", value1, value2, "majortype");
            return (Criteria) this;
        }

        public Criteria andMajortypeNotBetween(String value1, String value2) {
            addCriterion("majorType not between", value1, value2, "majortype");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andIsuseIsNull() {
            addCriterion("isUse is null");
            return (Criteria) this;
        }

        public Criteria andIsuseIsNotNull() {
            addCriterion("isUse is not null");
            return (Criteria) this;
        }

        public Criteria andIsuseEqualTo(String value) {
            addCriterion("isUse =", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseNotEqualTo(String value) {
            addCriterion("isUse <>", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseGreaterThan(String value) {
            addCriterion("isUse >", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseGreaterThanOrEqualTo(String value) {
            addCriterion("isUse >=", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseLessThan(String value) {
            addCriterion("isUse <", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseLessThanOrEqualTo(String value) {
            addCriterion("isUse <=", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseLike(String value) {
            addCriterion("isUse like", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseNotLike(String value) {
            addCriterion("isUse not like", value, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseIn(List<String> values) {
            addCriterion("isUse in", values, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseNotIn(List<String> values) {
            addCriterion("isUse not in", values, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseBetween(String value1, String value2) {
            addCriterion("isUse between", value1, value2, "isuse");
            return (Criteria) this;
        }

        public Criteria andIsuseNotBetween(String value1, String value2) {
            addCriterion("isUse not between", value1, value2, "isuse");
            return (Criteria) this;
        }

        public Criteria andTrainingtargetIsNull() {
            addCriterion("trainingtarget is null");
            return (Criteria) this;
        }

        public Criteria andTrainingtargetIsNotNull() {
            addCriterion("trainingtarget is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingtargetEqualTo(String value) {
            addCriterion("trainingtarget =", value, "trainingtarget");
            return (Criteria) this;
        }

        public Criteria andTrainingtargetNotEqualTo(String value) {
            addCriterion("trainingtarget <>", value, "trainingtarget");
            return (Criteria) this;
        }

        public Criteria andTrainingtargetGreaterThan(String value) {
            addCriterion("trainingtarget >", value, "trainingtarget");
            return (Criteria) this;
        }

        public Criteria andTrainingtargetGreaterThanOrEqualTo(String value) {
            addCriterion("trainingtarget >=", value, "trainingtarget");
            return (Criteria) this;
        }

        public Criteria andTrainingtargetLessThan(String value) {
            addCriterion("trainingtarget <", value, "trainingtarget");
            return (Criteria) this;
        }

        public Criteria andTrainingtargetLessThanOrEqualTo(String value) {
            addCriterion("trainingtarget <=", value, "trainingtarget");
            return (Criteria) this;
        }

        public Criteria andTrainingtargetLike(String value) {
            addCriterion("trainingtarget like", value, "trainingtarget");
            return (Criteria) this;
        }

        public Criteria andTrainingtargetNotLike(String value) {
            addCriterion("trainingtarget not like", value, "trainingtarget");
            return (Criteria) this;
        }

        public Criteria andTrainingtargetIn(List<String> values) {
            addCriterion("trainingtarget in", values, "trainingtarget");
            return (Criteria) this;
        }

        public Criteria andTrainingtargetNotIn(List<String> values) {
            addCriterion("trainingtarget not in", values, "trainingtarget");
            return (Criteria) this;
        }

        public Criteria andTrainingtargetBetween(String value1, String value2) {
            addCriterion("trainingtarget between", value1, value2, "trainingtarget");
            return (Criteria) this;
        }

        public Criteria andTrainingtargetNotBetween(String value1, String value2) {
            addCriterion("trainingtarget not between", value1, value2, "trainingtarget");
            return (Criteria) this;
        }

        public Criteria andTrainingrequireIsNull() {
            addCriterion("trainingRequire is null");
            return (Criteria) this;
        }

        public Criteria andTrainingrequireIsNotNull() {
            addCriterion("trainingRequire is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingrequireEqualTo(String value) {
            addCriterion("trainingRequire =", value, "trainingrequire");
            return (Criteria) this;
        }

        public Criteria andTrainingrequireNotEqualTo(String value) {
            addCriterion("trainingRequire <>", value, "trainingrequire");
            return (Criteria) this;
        }

        public Criteria andTrainingrequireGreaterThan(String value) {
            addCriterion("trainingRequire >", value, "trainingrequire");
            return (Criteria) this;
        }

        public Criteria andTrainingrequireGreaterThanOrEqualTo(String value) {
            addCriterion("trainingRequire >=", value, "trainingrequire");
            return (Criteria) this;
        }

        public Criteria andTrainingrequireLessThan(String value) {
            addCriterion("trainingRequire <", value, "trainingrequire");
            return (Criteria) this;
        }

        public Criteria andTrainingrequireLessThanOrEqualTo(String value) {
            addCriterion("trainingRequire <=", value, "trainingrequire");
            return (Criteria) this;
        }

        public Criteria andTrainingrequireLike(String value) {
            addCriterion("trainingRequire like", value, "trainingrequire");
            return (Criteria) this;
        }

        public Criteria andTrainingrequireNotLike(String value) {
            addCriterion("trainingRequire not like", value, "trainingrequire");
            return (Criteria) this;
        }

        public Criteria andTrainingrequireIn(List<String> values) {
            addCriterion("trainingRequire in", values, "trainingrequire");
            return (Criteria) this;
        }

        public Criteria andTrainingrequireNotIn(List<String> values) {
            addCriterion("trainingRequire not in", values, "trainingrequire");
            return (Criteria) this;
        }

        public Criteria andTrainingrequireBetween(String value1, String value2) {
            addCriterion("trainingRequire between", value1, value2, "trainingrequire");
            return (Criteria) this;
        }

        public Criteria andTrainingrequireNotBetween(String value1, String value2) {
            addCriterion("trainingRequire not between", value1, value2, "trainingrequire");
            return (Criteria) this;
        }

        public Criteria andTrainyearsIsNull() {
            addCriterion("trainYears is null");
            return (Criteria) this;
        }

        public Criteria andTrainyearsIsNotNull() {
            addCriterion("trainYears is not null");
            return (Criteria) this;
        }

        public Criteria andTrainyearsEqualTo(String value) {
            addCriterion("trainYears =", value, "trainyears");
            return (Criteria) this;
        }

        public Criteria andTrainyearsNotEqualTo(String value) {
            addCriterion("trainYears <>", value, "trainyears");
            return (Criteria) this;
        }

        public Criteria andTrainyearsGreaterThan(String value) {
            addCriterion("trainYears >", value, "trainyears");
            return (Criteria) this;
        }

        public Criteria andTrainyearsGreaterThanOrEqualTo(String value) {
            addCriterion("trainYears >=", value, "trainyears");
            return (Criteria) this;
        }

        public Criteria andTrainyearsLessThan(String value) {
            addCriterion("trainYears <", value, "trainyears");
            return (Criteria) this;
        }

        public Criteria andTrainyearsLessThanOrEqualTo(String value) {
            addCriterion("trainYears <=", value, "trainyears");
            return (Criteria) this;
        }

        public Criteria andTrainyearsLike(String value) {
            addCriterion("trainYears like", value, "trainyears");
            return (Criteria) this;
        }

        public Criteria andTrainyearsNotLike(String value) {
            addCriterion("trainYears not like", value, "trainyears");
            return (Criteria) this;
        }

        public Criteria andTrainyearsIn(List<String> values) {
            addCriterion("trainYears in", values, "trainyears");
            return (Criteria) this;
        }

        public Criteria andTrainyearsNotIn(List<String> values) {
            addCriterion("trainYears not in", values, "trainyears");
            return (Criteria) this;
        }

        public Criteria andTrainyearsBetween(String value1, String value2) {
            addCriterion("trainYears between", value1, value2, "trainyears");
            return (Criteria) this;
        }

        public Criteria andTrainyearsNotBetween(String value1, String value2) {
            addCriterion("trainYears not between", value1, value2, "trainyears");
            return (Criteria) this;
        }

        public Criteria andTraindegreeIsNull() {
            addCriterion("trainDegree is null");
            return (Criteria) this;
        }

        public Criteria andTraindegreeIsNotNull() {
            addCriterion("trainDegree is not null");
            return (Criteria) this;
        }

        public Criteria andTraindegreeEqualTo(String value) {
            addCriterion("trainDegree =", value, "traindegree");
            return (Criteria) this;
        }

        public Criteria andTraindegreeNotEqualTo(String value) {
            addCriterion("trainDegree <>", value, "traindegree");
            return (Criteria) this;
        }

        public Criteria andTraindegreeGreaterThan(String value) {
            addCriterion("trainDegree >", value, "traindegree");
            return (Criteria) this;
        }

        public Criteria andTraindegreeGreaterThanOrEqualTo(String value) {
            addCriterion("trainDegree >=", value, "traindegree");
            return (Criteria) this;
        }

        public Criteria andTraindegreeLessThan(String value) {
            addCriterion("trainDegree <", value, "traindegree");
            return (Criteria) this;
        }

        public Criteria andTraindegreeLessThanOrEqualTo(String value) {
            addCriterion("trainDegree <=", value, "traindegree");
            return (Criteria) this;
        }

        public Criteria andTraindegreeLike(String value) {
            addCriterion("trainDegree like", value, "traindegree");
            return (Criteria) this;
        }

        public Criteria andTraindegreeNotLike(String value) {
            addCriterion("trainDegree not like", value, "traindegree");
            return (Criteria) this;
        }

        public Criteria andTraindegreeIn(List<String> values) {
            addCriterion("trainDegree in", values, "traindegree");
            return (Criteria) this;
        }

        public Criteria andTraindegreeNotIn(List<String> values) {
            addCriterion("trainDegree not in", values, "traindegree");
            return (Criteria) this;
        }

        public Criteria andTraindegreeBetween(String value1, String value2) {
            addCriterion("trainDegree between", value1, value2, "traindegree");
            return (Criteria) this;
        }

        public Criteria andTraindegreeNotBetween(String value1, String value2) {
            addCriterion("trainDegree not between", value1, value2, "traindegree");
            return (Criteria) this;
        }

        public Criteria andMaincourseIsNull() {
            addCriterion("mainCourse is null");
            return (Criteria) this;
        }

        public Criteria andMaincourseIsNotNull() {
            addCriterion("mainCourse is not null");
            return (Criteria) this;
        }

        public Criteria andMaincourseEqualTo(String value) {
            addCriterion("mainCourse =", value, "maincourse");
            return (Criteria) this;
        }

        public Criteria andMaincourseNotEqualTo(String value) {
            addCriterion("mainCourse <>", value, "maincourse");
            return (Criteria) this;
        }

        public Criteria andMaincourseGreaterThan(String value) {
            addCriterion("mainCourse >", value, "maincourse");
            return (Criteria) this;
        }

        public Criteria andMaincourseGreaterThanOrEqualTo(String value) {
            addCriterion("mainCourse >=", value, "maincourse");
            return (Criteria) this;
        }

        public Criteria andMaincourseLessThan(String value) {
            addCriterion("mainCourse <", value, "maincourse");
            return (Criteria) this;
        }

        public Criteria andMaincourseLessThanOrEqualTo(String value) {
            addCriterion("mainCourse <=", value, "maincourse");
            return (Criteria) this;
        }

        public Criteria andMaincourseLike(String value) {
            addCriterion("mainCourse like", value, "maincourse");
            return (Criteria) this;
        }

        public Criteria andMaincourseNotLike(String value) {
            addCriterion("mainCourse not like", value, "maincourse");
            return (Criteria) this;
        }

        public Criteria andMaincourseIn(List<String> values) {
            addCriterion("mainCourse in", values, "maincourse");
            return (Criteria) this;
        }

        public Criteria andMaincourseNotIn(List<String> values) {
            addCriterion("mainCourse not in", values, "maincourse");
            return (Criteria) this;
        }

        public Criteria andMaincourseBetween(String value1, String value2) {
            addCriterion("mainCourse between", value1, value2, "maincourse");
            return (Criteria) this;
        }

        public Criteria andMaincourseNotBetween(String value1, String value2) {
            addCriterion("mainCourse not between", value1, value2, "maincourse");
            return (Criteria) this;
        }

        public Criteria andCorecourseIsNull() {
            addCriterion("coreCourse is null");
            return (Criteria) this;
        }

        public Criteria andCorecourseIsNotNull() {
            addCriterion("coreCourse is not null");
            return (Criteria) this;
        }

        public Criteria andCorecourseEqualTo(String value) {
            addCriterion("coreCourse =", value, "corecourse");
            return (Criteria) this;
        }

        public Criteria andCorecourseNotEqualTo(String value) {
            addCriterion("coreCourse <>", value, "corecourse");
            return (Criteria) this;
        }

        public Criteria andCorecourseGreaterThan(String value) {
            addCriterion("coreCourse >", value, "corecourse");
            return (Criteria) this;
        }

        public Criteria andCorecourseGreaterThanOrEqualTo(String value) {
            addCriterion("coreCourse >=", value, "corecourse");
            return (Criteria) this;
        }

        public Criteria andCorecourseLessThan(String value) {
            addCriterion("coreCourse <", value, "corecourse");
            return (Criteria) this;
        }

        public Criteria andCorecourseLessThanOrEqualTo(String value) {
            addCriterion("coreCourse <=", value, "corecourse");
            return (Criteria) this;
        }

        public Criteria andCorecourseLike(String value) {
            addCriterion("coreCourse like", value, "corecourse");
            return (Criteria) this;
        }

        public Criteria andCorecourseNotLike(String value) {
            addCriterion("coreCourse not like", value, "corecourse");
            return (Criteria) this;
        }

        public Criteria andCorecourseIn(List<String> values) {
            addCriterion("coreCourse in", values, "corecourse");
            return (Criteria) this;
        }

        public Criteria andCorecourseNotIn(List<String> values) {
            addCriterion("coreCourse not in", values, "corecourse");
            return (Criteria) this;
        }

        public Criteria andCorecourseBetween(String value1, String value2) {
            addCriterion("coreCourse between", value1, value2, "corecourse");
            return (Criteria) this;
        }

        public Criteria andCorecourseNotBetween(String value1, String value2) {
            addCriterion("coreCourse not between", value1, value2, "corecourse");
            return (Criteria) this;
        }

        public Criteria andMaintestitemIsNull() {
            addCriterion("mainTestItem is null");
            return (Criteria) this;
        }

        public Criteria andMaintestitemIsNotNull() {
            addCriterion("mainTestItem is not null");
            return (Criteria) this;
        }

        public Criteria andMaintestitemEqualTo(String value) {
            addCriterion("mainTestItem =", value, "maintestitem");
            return (Criteria) this;
        }

        public Criteria andMaintestitemNotEqualTo(String value) {
            addCriterion("mainTestItem <>", value, "maintestitem");
            return (Criteria) this;
        }

        public Criteria andMaintestitemGreaterThan(String value) {
            addCriterion("mainTestItem >", value, "maintestitem");
            return (Criteria) this;
        }

        public Criteria andMaintestitemGreaterThanOrEqualTo(String value) {
            addCriterion("mainTestItem >=", value, "maintestitem");
            return (Criteria) this;
        }

        public Criteria andMaintestitemLessThan(String value) {
            addCriterion("mainTestItem <", value, "maintestitem");
            return (Criteria) this;
        }

        public Criteria andMaintestitemLessThanOrEqualTo(String value) {
            addCriterion("mainTestItem <=", value, "maintestitem");
            return (Criteria) this;
        }

        public Criteria andMaintestitemLike(String value) {
            addCriterion("mainTestItem like", value, "maintestitem");
            return (Criteria) this;
        }

        public Criteria andMaintestitemNotLike(String value) {
            addCriterion("mainTestItem not like", value, "maintestitem");
            return (Criteria) this;
        }

        public Criteria andMaintestitemIn(List<String> values) {
            addCriterion("mainTestItem in", values, "maintestitem");
            return (Criteria) this;
        }

        public Criteria andMaintestitemNotIn(List<String> values) {
            addCriterion("mainTestItem not in", values, "maintestitem");
            return (Criteria) this;
        }

        public Criteria andMaintestitemBetween(String value1, String value2) {
            addCriterion("mainTestItem between", value1, value2, "maintestitem");
            return (Criteria) this;
        }

        public Criteria andMaintestitemNotBetween(String value1, String value2) {
            addCriterion("mainTestItem not between", value1, value2, "maintestitem");
            return (Criteria) this;
        }

        public Criteria andMainmajorexperienceIsNull() {
            addCriterion("mainMajorExperience is null");
            return (Criteria) this;
        }

        public Criteria andMainmajorexperienceIsNotNull() {
            addCriterion("mainMajorExperience is not null");
            return (Criteria) this;
        }

        public Criteria andMainmajorexperienceEqualTo(String value) {
            addCriterion("mainMajorExperience =", value, "mainmajorexperience");
            return (Criteria) this;
        }

        public Criteria andMainmajorexperienceNotEqualTo(String value) {
            addCriterion("mainMajorExperience <>", value, "mainmajorexperience");
            return (Criteria) this;
        }

        public Criteria andMainmajorexperienceGreaterThan(String value) {
            addCriterion("mainMajorExperience >", value, "mainmajorexperience");
            return (Criteria) this;
        }

        public Criteria andMainmajorexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("mainMajorExperience >=", value, "mainmajorexperience");
            return (Criteria) this;
        }

        public Criteria andMainmajorexperienceLessThan(String value) {
            addCriterion("mainMajorExperience <", value, "mainmajorexperience");
            return (Criteria) this;
        }

        public Criteria andMainmajorexperienceLessThanOrEqualTo(String value) {
            addCriterion("mainMajorExperience <=", value, "mainmajorexperience");
            return (Criteria) this;
        }

        public Criteria andMainmajorexperienceLike(String value) {
            addCriterion("mainMajorExperience like", value, "mainmajorexperience");
            return (Criteria) this;
        }

        public Criteria andMainmajorexperienceNotLike(String value) {
            addCriterion("mainMajorExperience not like", value, "mainmajorexperience");
            return (Criteria) this;
        }

        public Criteria andMainmajorexperienceIn(List<String> values) {
            addCriterion("mainMajorExperience in", values, "mainmajorexperience");
            return (Criteria) this;
        }

        public Criteria andMainmajorexperienceNotIn(List<String> values) {
            addCriterion("mainMajorExperience not in", values, "mainmajorexperience");
            return (Criteria) this;
        }

        public Criteria andMainmajorexperienceBetween(String value1, String value2) {
            addCriterion("mainMajorExperience between", value1, value2, "mainmajorexperience");
            return (Criteria) this;
        }

        public Criteria andMainmajorexperienceNotBetween(String value1, String value2) {
            addCriterion("mainMajorExperience not between", value1, value2, "mainmajorexperience");
            return (Criteria) this;
        }

        public Criteria andMajorfeatureIsNull() {
            addCriterion("majorfeature is null");
            return (Criteria) this;
        }

        public Criteria andMajorfeatureIsNotNull() {
            addCriterion("majorfeature is not null");
            return (Criteria) this;
        }

        public Criteria andMajorfeatureEqualTo(String value) {
            addCriterion("majorfeature =", value, "majorfeature");
            return (Criteria) this;
        }

        public Criteria andMajorfeatureNotEqualTo(String value) {
            addCriterion("majorfeature <>", value, "majorfeature");
            return (Criteria) this;
        }

        public Criteria andMajorfeatureGreaterThan(String value) {
            addCriterion("majorfeature >", value, "majorfeature");
            return (Criteria) this;
        }

        public Criteria andMajorfeatureGreaterThanOrEqualTo(String value) {
            addCriterion("majorfeature >=", value, "majorfeature");
            return (Criteria) this;
        }

        public Criteria andMajorfeatureLessThan(String value) {
            addCriterion("majorfeature <", value, "majorfeature");
            return (Criteria) this;
        }

        public Criteria andMajorfeatureLessThanOrEqualTo(String value) {
            addCriterion("majorfeature <=", value, "majorfeature");
            return (Criteria) this;
        }

        public Criteria andMajorfeatureLike(String value) {
            addCriterion("majorfeature like", value, "majorfeature");
            return (Criteria) this;
        }

        public Criteria andMajorfeatureNotLike(String value) {
            addCriterion("majorfeature not like", value, "majorfeature");
            return (Criteria) this;
        }

        public Criteria andMajorfeatureIn(List<String> values) {
            addCriterion("majorfeature in", values, "majorfeature");
            return (Criteria) this;
        }

        public Criteria andMajorfeatureNotIn(List<String> values) {
            addCriterion("majorfeature not in", values, "majorfeature");
            return (Criteria) this;
        }

        public Criteria andMajorfeatureBetween(String value1, String value2) {
            addCriterion("majorfeature between", value1, value2, "majorfeature");
            return (Criteria) this;
        }

        public Criteria andMajorfeatureNotBetween(String value1, String value2) {
            addCriterion("majorfeature not between", value1, value2, "majorfeature");
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

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
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