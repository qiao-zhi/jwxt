package cn.xm.jwxt.bean.graduateDesign;

import java.util.ArrayList;
import java.util.List;

public class TeachergredesigntitleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeachergredesigntitleExample() {
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

        public Criteria andTeachertitleidIsNull() {
            addCriterion("teacherTitleID is null");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidIsNotNull() {
            addCriterion("teacherTitleID is not null");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidEqualTo(String value) {
            addCriterion("teacherTitleID =", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidNotEqualTo(String value) {
            addCriterion("teacherTitleID <>", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidGreaterThan(String value) {
            addCriterion("teacherTitleID >", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidGreaterThanOrEqualTo(String value) {
            addCriterion("teacherTitleID >=", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidLessThan(String value) {
            addCriterion("teacherTitleID <", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidLessThanOrEqualTo(String value) {
            addCriterion("teacherTitleID <=", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidLike(String value) {
            addCriterion("teacherTitleID like", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidNotLike(String value) {
            addCriterion("teacherTitleID not like", value, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidIn(List<String> values) {
            addCriterion("teacherTitleID in", values, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidNotIn(List<String> values) {
            addCriterion("teacherTitleID not in", values, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidBetween(String value1, String value2) {
            addCriterion("teacherTitleID between", value1, value2, "teachertitleid");
            return (Criteria) this;
        }

        public Criteria andTeachertitleidNotBetween(String value1, String value2) {
            addCriterion("teacherTitleID not between", value1, value2, "teachertitleid");
            return (Criteria) this;
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

        public Criteria andTeacheridIsNull() {
            addCriterion("teacherId is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("teacherId is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(String value) {
            addCriterion("teacherId =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(String value) {
            addCriterion("teacherId <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(String value) {
            addCriterion("teacherId >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(String value) {
            addCriterion("teacherId >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(String value) {
            addCriterion("teacherId <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(String value) {
            addCriterion("teacherId <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLike(String value) {
            addCriterion("teacherId like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotLike(String value) {
            addCriterion("teacherId not like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<String> values) {
            addCriterion("teacherId in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<String> values) {
            addCriterion("teacherId not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(String value1, String value2) {
            addCriterion("teacherId between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(String value1, String value2) {
            addCriterion("teacherId not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTitlenameIsNull() {
            addCriterion("titlename is null");
            return (Criteria) this;
        }

        public Criteria andTitlenameIsNotNull() {
            addCriterion("titlename is not null");
            return (Criteria) this;
        }

        public Criteria andTitlenameEqualTo(String value) {
            addCriterion("titlename =", value, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameNotEqualTo(String value) {
            addCriterion("titlename <>", value, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameGreaterThan(String value) {
            addCriterion("titlename >", value, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameGreaterThanOrEqualTo(String value) {
            addCriterion("titlename >=", value, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameLessThan(String value) {
            addCriterion("titlename <", value, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameLessThanOrEqualTo(String value) {
            addCriterion("titlename <=", value, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameLike(String value) {
            addCriterion("titlename like", value, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameNotLike(String value) {
            addCriterion("titlename not like", value, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameIn(List<String> values) {
            addCriterion("titlename in", values, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameNotIn(List<String> values) {
            addCriterion("titlename not in", values, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameBetween(String value1, String value2) {
            addCriterion("titlename between", value1, value2, "titlename");
            return (Criteria) this;
        }

        public Criteria andTitlenameNotBetween(String value1, String value2) {
            addCriterion("titlename not between", value1, value2, "titlename");
            return (Criteria) this;
        }

        public Criteria andResulttypeIsNull() {
            addCriterion("resultType is null");
            return (Criteria) this;
        }

        public Criteria andResulttypeIsNotNull() {
            addCriterion("resultType is not null");
            return (Criteria) this;
        }

        public Criteria andResulttypeEqualTo(String value) {
            addCriterion("resultType =", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotEqualTo(String value) {
            addCriterion("resultType <>", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeGreaterThan(String value) {
            addCriterion("resultType >", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeGreaterThanOrEqualTo(String value) {
            addCriterion("resultType >=", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeLessThan(String value) {
            addCriterion("resultType <", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeLessThanOrEqualTo(String value) {
            addCriterion("resultType <=", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeLike(String value) {
            addCriterion("resultType like", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotLike(String value) {
            addCriterion("resultType not like", value, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeIn(List<String> values) {
            addCriterion("resultType in", values, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotIn(List<String> values) {
            addCriterion("resultType not in", values, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeBetween(String value1, String value2) {
            addCriterion("resultType between", value1, value2, "resulttype");
            return (Criteria) this;
        }

        public Criteria andResulttypeNotBetween(String value1, String value2) {
            addCriterion("resultType not between", value1, value2, "resulttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIsNull() {
            addCriterion("projectType is null");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIsNotNull() {
            addCriterion("projectType is not null");
            return (Criteria) this;
        }

        public Criteria andProjecttypeEqualTo(String value) {
            addCriterion("projectType =", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotEqualTo(String value) {
            addCriterion("projectType <>", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeGreaterThan(String value) {
            addCriterion("projectType >", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeGreaterThanOrEqualTo(String value) {
            addCriterion("projectType >=", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeLessThan(String value) {
            addCriterion("projectType <", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeLessThanOrEqualTo(String value) {
            addCriterion("projectType <=", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeLike(String value) {
            addCriterion("projectType like", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotLike(String value) {
            addCriterion("projectType not like", value, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeIn(List<String> values) {
            addCriterion("projectType in", values, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotIn(List<String> values) {
            addCriterion("projectType not in", values, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeBetween(String value1, String value2) {
            addCriterion("projectType between", value1, value2, "projecttype");
            return (Criteria) this;
        }

        public Criteria andProjecttypeNotBetween(String value1, String value2) {
            addCriterion("projectType not between", value1, value2, "projecttype");
            return (Criteria) this;
        }

        public Criteria andTargetrequireIsNull() {
            addCriterion("targetRequire is null");
            return (Criteria) this;
        }

        public Criteria andTargetrequireIsNotNull() {
            addCriterion("targetRequire is not null");
            return (Criteria) this;
        }

        public Criteria andTargetrequireEqualTo(String value) {
            addCriterion("targetRequire =", value, "targetrequire");
            return (Criteria) this;
        }

        public Criteria andTargetrequireNotEqualTo(String value) {
            addCriterion("targetRequire <>", value, "targetrequire");
            return (Criteria) this;
        }

        public Criteria andTargetrequireGreaterThan(String value) {
            addCriterion("targetRequire >", value, "targetrequire");
            return (Criteria) this;
        }

        public Criteria andTargetrequireGreaterThanOrEqualTo(String value) {
            addCriterion("targetRequire >=", value, "targetrequire");
            return (Criteria) this;
        }

        public Criteria andTargetrequireLessThan(String value) {
            addCriterion("targetRequire <", value, "targetrequire");
            return (Criteria) this;
        }

        public Criteria andTargetrequireLessThanOrEqualTo(String value) {
            addCriterion("targetRequire <=", value, "targetrequire");
            return (Criteria) this;
        }

        public Criteria andTargetrequireLike(String value) {
            addCriterion("targetRequire like", value, "targetrequire");
            return (Criteria) this;
        }

        public Criteria andTargetrequireNotLike(String value) {
            addCriterion("targetRequire not like", value, "targetrequire");
            return (Criteria) this;
        }

        public Criteria andTargetrequireIn(List<String> values) {
            addCriterion("targetRequire in", values, "targetrequire");
            return (Criteria) this;
        }

        public Criteria andTargetrequireNotIn(List<String> values) {
            addCriterion("targetRequire not in", values, "targetrequire");
            return (Criteria) this;
        }

        public Criteria andTargetrequireBetween(String value1, String value2) {
            addCriterion("targetRequire between", value1, value2, "targetrequire");
            return (Criteria) this;
        }

        public Criteria andTargetrequireNotBetween(String value1, String value2) {
            addCriterion("targetRequire not between", value1, value2, "targetrequire");
            return (Criteria) this;
        }

        public Criteria andResearchcontentIsNull() {
            addCriterion("researchContent is null");
            return (Criteria) this;
        }

        public Criteria andResearchcontentIsNotNull() {
            addCriterion("researchContent is not null");
            return (Criteria) this;
        }

        public Criteria andResearchcontentEqualTo(String value) {
            addCriterion("researchContent =", value, "researchcontent");
            return (Criteria) this;
        }

        public Criteria andResearchcontentNotEqualTo(String value) {
            addCriterion("researchContent <>", value, "researchcontent");
            return (Criteria) this;
        }

        public Criteria andResearchcontentGreaterThan(String value) {
            addCriterion("researchContent >", value, "researchcontent");
            return (Criteria) this;
        }

        public Criteria andResearchcontentGreaterThanOrEqualTo(String value) {
            addCriterion("researchContent >=", value, "researchcontent");
            return (Criteria) this;
        }

        public Criteria andResearchcontentLessThan(String value) {
            addCriterion("researchContent <", value, "researchcontent");
            return (Criteria) this;
        }

        public Criteria andResearchcontentLessThanOrEqualTo(String value) {
            addCriterion("researchContent <=", value, "researchcontent");
            return (Criteria) this;
        }

        public Criteria andResearchcontentLike(String value) {
            addCriterion("researchContent like", value, "researchcontent");
            return (Criteria) this;
        }

        public Criteria andResearchcontentNotLike(String value) {
            addCriterion("researchContent not like", value, "researchcontent");
            return (Criteria) this;
        }

        public Criteria andResearchcontentIn(List<String> values) {
            addCriterion("researchContent in", values, "researchcontent");
            return (Criteria) this;
        }

        public Criteria andResearchcontentNotIn(List<String> values) {
            addCriterion("researchContent not in", values, "researchcontent");
            return (Criteria) this;
        }

        public Criteria andResearchcontentBetween(String value1, String value2) {
            addCriterion("researchContent between", value1, value2, "researchcontent");
            return (Criteria) this;
        }

        public Criteria andResearchcontentNotBetween(String value1, String value2) {
            addCriterion("researchContent not between", value1, value2, "researchcontent");
            return (Criteria) this;
        }

        public Criteria andTitleoriginIsNull() {
            addCriterion("titleOrigin is null");
            return (Criteria) this;
        }

        public Criteria andTitleoriginIsNotNull() {
            addCriterion("titleOrigin is not null");
            return (Criteria) this;
        }

        public Criteria andTitleoriginEqualTo(String value) {
            addCriterion("titleOrigin =", value, "titleorigin");
            return (Criteria) this;
        }

        public Criteria andTitleoriginNotEqualTo(String value) {
            addCriterion("titleOrigin <>", value, "titleorigin");
            return (Criteria) this;
        }

        public Criteria andTitleoriginGreaterThan(String value) {
            addCriterion("titleOrigin >", value, "titleorigin");
            return (Criteria) this;
        }

        public Criteria andTitleoriginGreaterThanOrEqualTo(String value) {
            addCriterion("titleOrigin >=", value, "titleorigin");
            return (Criteria) this;
        }

        public Criteria andTitleoriginLessThan(String value) {
            addCriterion("titleOrigin <", value, "titleorigin");
            return (Criteria) this;
        }

        public Criteria andTitleoriginLessThanOrEqualTo(String value) {
            addCriterion("titleOrigin <=", value, "titleorigin");
            return (Criteria) this;
        }

        public Criteria andTitleoriginLike(String value) {
            addCriterion("titleOrigin like", value, "titleorigin");
            return (Criteria) this;
        }

        public Criteria andTitleoriginNotLike(String value) {
            addCriterion("titleOrigin not like", value, "titleorigin");
            return (Criteria) this;
        }

        public Criteria andTitleoriginIn(List<String> values) {
            addCriterion("titleOrigin in", values, "titleorigin");
            return (Criteria) this;
        }

        public Criteria andTitleoriginNotIn(List<String> values) {
            addCriterion("titleOrigin not in", values, "titleorigin");
            return (Criteria) this;
        }

        public Criteria andTitleoriginBetween(String value1, String value2) {
            addCriterion("titleOrigin between", value1, value2, "titleorigin");
            return (Criteria) this;
        }

        public Criteria andTitleoriginNotBetween(String value1, String value2) {
            addCriterion("titleOrigin not between", value1, value2, "titleorigin");
            return (Criteria) this;
        }

        public Criteria andTitletypeIsNull() {
            addCriterion("titleType is null");
            return (Criteria) this;
        }

        public Criteria andTitletypeIsNotNull() {
            addCriterion("titleType is not null");
            return (Criteria) this;
        }

        public Criteria andTitletypeEqualTo(String value) {
            addCriterion("titleType =", value, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeNotEqualTo(String value) {
            addCriterion("titleType <>", value, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeGreaterThan(String value) {
            addCriterion("titleType >", value, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeGreaterThanOrEqualTo(String value) {
            addCriterion("titleType >=", value, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeLessThan(String value) {
            addCriterion("titleType <", value, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeLessThanOrEqualTo(String value) {
            addCriterion("titleType <=", value, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeLike(String value) {
            addCriterion("titleType like", value, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeNotLike(String value) {
            addCriterion("titleType not like", value, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeIn(List<String> values) {
            addCriterion("titleType in", values, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeNotIn(List<String> values) {
            addCriterion("titleType not in", values, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeBetween(String value1, String value2) {
            addCriterion("titleType between", value1, value2, "titletype");
            return (Criteria) this;
        }

        public Criteria andTitletypeNotBetween(String value1, String value2) {
            addCriterion("titleType not between", value1, value2, "titletype");
            return (Criteria) this;
        }

        public Criteria andReqirestudentnumIsNull() {
            addCriterion("reqireStudentNum is null");
            return (Criteria) this;
        }

        public Criteria andReqirestudentnumIsNotNull() {
            addCriterion("reqireStudentNum is not null");
            return (Criteria) this;
        }

        public Criteria andReqirestudentnumEqualTo(Short value) {
            addCriterion("reqireStudentNum =", value, "reqirestudentnum");
            return (Criteria) this;
        }

        public Criteria andReqirestudentnumNotEqualTo(Short value) {
            addCriterion("reqireStudentNum <>", value, "reqirestudentnum");
            return (Criteria) this;
        }

        public Criteria andReqirestudentnumGreaterThan(Short value) {
            addCriterion("reqireStudentNum >", value, "reqirestudentnum");
            return (Criteria) this;
        }

        public Criteria andReqirestudentnumGreaterThanOrEqualTo(Short value) {
            addCriterion("reqireStudentNum >=", value, "reqirestudentnum");
            return (Criteria) this;
        }

        public Criteria andReqirestudentnumLessThan(Short value) {
            addCriterion("reqireStudentNum <", value, "reqirestudentnum");
            return (Criteria) this;
        }

        public Criteria andReqirestudentnumLessThanOrEqualTo(Short value) {
            addCriterion("reqireStudentNum <=", value, "reqirestudentnum");
            return (Criteria) this;
        }

        public Criteria andReqirestudentnumIn(List<Short> values) {
            addCriterion("reqireStudentNum in", values, "reqirestudentnum");
            return (Criteria) this;
        }

        public Criteria andReqirestudentnumNotIn(List<Short> values) {
            addCriterion("reqireStudentNum not in", values, "reqirestudentnum");
            return (Criteria) this;
        }

        public Criteria andReqirestudentnumBetween(Short value1, Short value2) {
            addCriterion("reqireStudentNum between", value1, value2, "reqirestudentnum");
            return (Criteria) this;
        }

        public Criteria andReqirestudentnumNotBetween(Short value1, Short value2) {
            addCriterion("reqireStudentNum not between", value1, value2, "reqirestudentnum");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNull() {
            addCriterion("checkStatus is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNotNull() {
            addCriterion("checkStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusEqualTo(String value) {
            addCriterion("checkStatus =", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotEqualTo(String value) {
            addCriterion("checkStatus <>", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThan(String value) {
            addCriterion("checkStatus >", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThanOrEqualTo(String value) {
            addCriterion("checkStatus >=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThan(String value) {
            addCriterion("checkStatus <", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThanOrEqualTo(String value) {
            addCriterion("checkStatus <=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLike(String value) {
            addCriterion("checkStatus like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotLike(String value) {
            addCriterion("checkStatus not like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIn(List<String> values) {
            addCriterion("checkStatus in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotIn(List<String> values) {
            addCriterion("checkStatus not in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusBetween(String value1, String value2) {
            addCriterion("checkStatus between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotBetween(String value1, String value2) {
            addCriterion("checkStatus not between", value1, value2, "checkstatus");
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