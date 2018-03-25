package cn.xm.jwxt.bean.baseInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TTeacherBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTeacherBaseInfoExample() {
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

        public Criteria andTeacheridIsNull() {
            addCriterion("teacherID is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("teacherID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(String value) {
            addCriterion("teacherID =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(String value) {
            addCriterion("teacherID <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(String value) {
            addCriterion("teacherID >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(String value) {
            addCriterion("teacherID >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(String value) {
            addCriterion("teacherID <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(String value) {
            addCriterion("teacherID <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLike(String value) {
            addCriterion("teacherID like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotLike(String value) {
            addCriterion("teacherID not like", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<String> values) {
            addCriterion("teacherID in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<String> values) {
            addCriterion("teacherID not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(String value1, String value2) {
            addCriterion("teacherID between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(String value1, String value2) {
            addCriterion("teacherID not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeachernumIsNull() {
            addCriterion("teacherNum is null");
            return (Criteria) this;
        }

        public Criteria andTeachernumIsNotNull() {
            addCriterion("teacherNum is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernumEqualTo(String value) {
            addCriterion("teacherNum =", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotEqualTo(String value) {
            addCriterion("teacherNum <>", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumGreaterThan(String value) {
            addCriterion("teacherNum >", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumGreaterThanOrEqualTo(String value) {
            addCriterion("teacherNum >=", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumLessThan(String value) {
            addCriterion("teacherNum <", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumLessThanOrEqualTo(String value) {
            addCriterion("teacherNum <=", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumLike(String value) {
            addCriterion("teacherNum like", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotLike(String value) {
            addCriterion("teacherNum not like", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumIn(List<String> values) {
            addCriterion("teacherNum in", values, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotIn(List<String> values) {
            addCriterion("teacherNum not in", values, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumBetween(String value1, String value2) {
            addCriterion("teacherNum between", value1, value2, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotBetween(String value1, String value2) {
            addCriterion("teacherNum not between", value1, value2, "teachernum");
            return (Criteria) this;
        }

        public Criteria andCollegeidIsNull() {
            addCriterion("collegeID is null");
            return (Criteria) this;
        }

        public Criteria andCollegeidIsNotNull() {
            addCriterion("collegeID is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeidEqualTo(String value) {
            addCriterion("collegeID =", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotEqualTo(String value) {
            addCriterion("collegeID <>", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidGreaterThan(String value) {
            addCriterion("collegeID >", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidGreaterThanOrEqualTo(String value) {
            addCriterion("collegeID >=", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidLessThan(String value) {
            addCriterion("collegeID <", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidLessThanOrEqualTo(String value) {
            addCriterion("collegeID <=", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidLike(String value) {
            addCriterion("collegeID like", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotLike(String value) {
            addCriterion("collegeID not like", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidIn(List<String> values) {
            addCriterion("collegeID in", values, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotIn(List<String> values) {
            addCriterion("collegeID not in", values, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidBetween(String value1, String value2) {
            addCriterion("collegeID between", value1, value2, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotBetween(String value1, String value2) {
            addCriterion("collegeID not between", value1, value2, "collegeid");
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

        public Criteria andTeachernameIsNull() {
            addCriterion("teacherName is null");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNotNull() {
            addCriterion("teacherName is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernameEqualTo(String value) {
            addCriterion("teacherName =", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotEqualTo(String value) {
            addCriterion("teacherName <>", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThan(String value) {
            addCriterion("teacherName >", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThanOrEqualTo(String value) {
            addCriterion("teacherName >=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThan(String value) {
            addCriterion("teacherName <", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThanOrEqualTo(String value) {
            addCriterion("teacherName <=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLike(String value) {
            addCriterion("teacherName like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotLike(String value) {
            addCriterion("teacherName not like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameIn(List<String> values) {
            addCriterion("teacherName in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotIn(List<String> values) {
            addCriterion("teacherName not in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameBetween(String value1, String value2) {
            addCriterion("teacherName between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotBetween(String value1, String value2) {
            addCriterion("teacherName not between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachersexIsNull() {
            addCriterion("teacherSex is null");
            return (Criteria) this;
        }

        public Criteria andTeachersexIsNotNull() {
            addCriterion("teacherSex is not null");
            return (Criteria) this;
        }

        public Criteria andTeachersexEqualTo(String value) {
            addCriterion("teacherSex =", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexNotEqualTo(String value) {
            addCriterion("teacherSex <>", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexGreaterThan(String value) {
            addCriterion("teacherSex >", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexGreaterThanOrEqualTo(String value) {
            addCriterion("teacherSex >=", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexLessThan(String value) {
            addCriterion("teacherSex <", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexLessThanOrEqualTo(String value) {
            addCriterion("teacherSex <=", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexLike(String value) {
            addCriterion("teacherSex like", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexNotLike(String value) {
            addCriterion("teacherSex not like", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexIn(List<String> values) {
            addCriterion("teacherSex in", values, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexNotIn(List<String> values) {
            addCriterion("teacherSex not in", values, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexBetween(String value1, String value2) {
            addCriterion("teacherSex between", value1, value2, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexNotBetween(String value1, String value2) {
            addCriterion("teacherSex not between", value1, value2, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthIsNull() {
            addCriterion("teacherBirth is null");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthIsNotNull() {
            addCriterion("teacherBirth is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthEqualTo(Date value) {
            addCriterionForJDBCDate("teacherBirth =", value, "teacherbirth");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("teacherBirth <>", value, "teacherbirth");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthGreaterThan(Date value) {
            addCriterionForJDBCDate("teacherBirth >", value, "teacherbirth");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("teacherBirth >=", value, "teacherbirth");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthLessThan(Date value) {
            addCriterionForJDBCDate("teacherBirth <", value, "teacherbirth");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("teacherBirth <=", value, "teacherbirth");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthIn(List<Date> values) {
            addCriterionForJDBCDate("teacherBirth in", values, "teacherbirth");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("teacherBirth not in", values, "teacherbirth");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("teacherBirth between", value1, value2, "teacherbirth");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("teacherBirth not between", value1, value2, "teacherbirth");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("degree like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("degree not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolIsNull() {
            addCriterion("graduateSchool is null");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolIsNotNull() {
            addCriterion("graduateSchool is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolEqualTo(String value) {
            addCriterion("graduateSchool =", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotEqualTo(String value) {
            addCriterion("graduateSchool <>", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolGreaterThan(String value) {
            addCriterion("graduateSchool >", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolGreaterThanOrEqualTo(String value) {
            addCriterion("graduateSchool >=", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLessThan(String value) {
            addCriterion("graduateSchool <", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLessThanOrEqualTo(String value) {
            addCriterion("graduateSchool <=", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLike(String value) {
            addCriterion("graduateSchool like", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotLike(String value) {
            addCriterion("graduateSchool not like", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolIn(List<String> values) {
            addCriterion("graduateSchool in", values, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotIn(List<String> values) {
            addCriterion("graduateSchool not in", values, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolBetween(String value1, String value2) {
            addCriterion("graduateSchool between", value1, value2, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotBetween(String value1, String value2) {
            addCriterion("graduateSchool not between", value1, value2, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduatemajorIsNull() {
            addCriterion("graduateMajor is null");
            return (Criteria) this;
        }

        public Criteria andGraduatemajorIsNotNull() {
            addCriterion("graduateMajor is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatemajorEqualTo(String value) {
            addCriterion("graduateMajor =", value, "graduatemajor");
            return (Criteria) this;
        }

        public Criteria andGraduatemajorNotEqualTo(String value) {
            addCriterion("graduateMajor <>", value, "graduatemajor");
            return (Criteria) this;
        }

        public Criteria andGraduatemajorGreaterThan(String value) {
            addCriterion("graduateMajor >", value, "graduatemajor");
            return (Criteria) this;
        }

        public Criteria andGraduatemajorGreaterThanOrEqualTo(String value) {
            addCriterion("graduateMajor >=", value, "graduatemajor");
            return (Criteria) this;
        }

        public Criteria andGraduatemajorLessThan(String value) {
            addCriterion("graduateMajor <", value, "graduatemajor");
            return (Criteria) this;
        }

        public Criteria andGraduatemajorLessThanOrEqualTo(String value) {
            addCriterion("graduateMajor <=", value, "graduatemajor");
            return (Criteria) this;
        }

        public Criteria andGraduatemajorLike(String value) {
            addCriterion("graduateMajor like", value, "graduatemajor");
            return (Criteria) this;
        }

        public Criteria andGraduatemajorNotLike(String value) {
            addCriterion("graduateMajor not like", value, "graduatemajor");
            return (Criteria) this;
        }

        public Criteria andGraduatemajorIn(List<String> values) {
            addCriterion("graduateMajor in", values, "graduatemajor");
            return (Criteria) this;
        }

        public Criteria andGraduatemajorNotIn(List<String> values) {
            addCriterion("graduateMajor not in", values, "graduatemajor");
            return (Criteria) this;
        }

        public Criteria andGraduatemajorBetween(String value1, String value2) {
            addCriterion("graduateMajor between", value1, value2, "graduatemajor");
            return (Criteria) this;
        }

        public Criteria andGraduatemajorNotBetween(String value1, String value2) {
            addCriterion("graduateMajor not between", value1, value2, "graduatemajor");
            return (Criteria) this;
        }

        public Criteria andTeacherphotoIsNull() {
            addCriterion("teacherPhoto is null");
            return (Criteria) this;
        }

        public Criteria andTeacherphotoIsNotNull() {
            addCriterion("teacherPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherphotoEqualTo(String value) {
            addCriterion("teacherPhoto =", value, "teacherphoto");
            return (Criteria) this;
        }

        public Criteria andTeacherphotoNotEqualTo(String value) {
            addCriterion("teacherPhoto <>", value, "teacherphoto");
            return (Criteria) this;
        }

        public Criteria andTeacherphotoGreaterThan(String value) {
            addCriterion("teacherPhoto >", value, "teacherphoto");
            return (Criteria) this;
        }

        public Criteria andTeacherphotoGreaterThanOrEqualTo(String value) {
            addCriterion("teacherPhoto >=", value, "teacherphoto");
            return (Criteria) this;
        }

        public Criteria andTeacherphotoLessThan(String value) {
            addCriterion("teacherPhoto <", value, "teacherphoto");
            return (Criteria) this;
        }

        public Criteria andTeacherphotoLessThanOrEqualTo(String value) {
            addCriterion("teacherPhoto <=", value, "teacherphoto");
            return (Criteria) this;
        }

        public Criteria andTeacherphotoLike(String value) {
            addCriterion("teacherPhoto like", value, "teacherphoto");
            return (Criteria) this;
        }

        public Criteria andTeacherphotoNotLike(String value) {
            addCriterion("teacherPhoto not like", value, "teacherphoto");
            return (Criteria) this;
        }

        public Criteria andTeacherphotoIn(List<String> values) {
            addCriterion("teacherPhoto in", values, "teacherphoto");
            return (Criteria) this;
        }

        public Criteria andTeacherphotoNotIn(List<String> values) {
            addCriterion("teacherPhoto not in", values, "teacherphoto");
            return (Criteria) this;
        }

        public Criteria andTeacherphotoBetween(String value1, String value2) {
            addCriterion("teacherPhoto between", value1, value2, "teacherphoto");
            return (Criteria) this;
        }

        public Criteria andTeacherphotoNotBetween(String value1, String value2) {
            addCriterion("teacherPhoto not between", value1, value2, "teacherphoto");
            return (Criteria) this;
        }

        public Criteria andTeachertelIsNull() {
            addCriterion("teacherTel is null");
            return (Criteria) this;
        }

        public Criteria andTeachertelIsNotNull() {
            addCriterion("teacherTel is not null");
            return (Criteria) this;
        }

        public Criteria andTeachertelEqualTo(String value) {
            addCriterion("teacherTel =", value, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelNotEqualTo(String value) {
            addCriterion("teacherTel <>", value, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelGreaterThan(String value) {
            addCriterion("teacherTel >", value, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelGreaterThanOrEqualTo(String value) {
            addCriterion("teacherTel >=", value, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelLessThan(String value) {
            addCriterion("teacherTel <", value, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelLessThanOrEqualTo(String value) {
            addCriterion("teacherTel <=", value, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelLike(String value) {
            addCriterion("teacherTel like", value, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelNotLike(String value) {
            addCriterion("teacherTel not like", value, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelIn(List<String> values) {
            addCriterion("teacherTel in", values, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelNotIn(List<String> values) {
            addCriterion("teacherTel not in", values, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelBetween(String value1, String value2) {
            addCriterion("teacherTel between", value1, value2, "teachertel");
            return (Criteria) this;
        }

        public Criteria andTeachertelNotBetween(String value1, String value2) {
            addCriterion("teacherTel not between", value1, value2, "teachertel");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleIsNull() {
            addCriterion("positionalTitle is null");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleIsNotNull() {
            addCriterion("positionalTitle is not null");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleEqualTo(String value) {
            addCriterion("positionalTitle =", value, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleNotEqualTo(String value) {
            addCriterion("positionalTitle <>", value, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleGreaterThan(String value) {
            addCriterion("positionalTitle >", value, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleGreaterThanOrEqualTo(String value) {
            addCriterion("positionalTitle >=", value, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleLessThan(String value) {
            addCriterion("positionalTitle <", value, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleLessThanOrEqualTo(String value) {
            addCriterion("positionalTitle <=", value, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleLike(String value) {
            addCriterion("positionalTitle like", value, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleNotLike(String value) {
            addCriterion("positionalTitle not like", value, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleIn(List<String> values) {
            addCriterion("positionalTitle in", values, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleNotIn(List<String> values) {
            addCriterion("positionalTitle not in", values, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleBetween(String value1, String value2) {
            addCriterion("positionalTitle between", value1, value2, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andPositionaltitleNotBetween(String value1, String value2) {
            addCriterion("positionalTitle not between", value1, value2, "positionaltitle");
            return (Criteria) this;
        }

        public Criteria andJoinschooltimeIsNull() {
            addCriterion("joinSchoolTime is null");
            return (Criteria) this;
        }

        public Criteria andJoinschooltimeIsNotNull() {
            addCriterion("joinSchoolTime is not null");
            return (Criteria) this;
        }

        public Criteria andJoinschooltimeEqualTo(Date value) {
            addCriterionForJDBCDate("joinSchoolTime =", value, "joinschooltime");
            return (Criteria) this;
        }

        public Criteria andJoinschooltimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("joinSchoolTime <>", value, "joinschooltime");
            return (Criteria) this;
        }

        public Criteria andJoinschooltimeGreaterThan(Date value) {
            addCriterionForJDBCDate("joinSchoolTime >", value, "joinschooltime");
            return (Criteria) this;
        }

        public Criteria andJoinschooltimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("joinSchoolTime >=", value, "joinschooltime");
            return (Criteria) this;
        }

        public Criteria andJoinschooltimeLessThan(Date value) {
            addCriterionForJDBCDate("joinSchoolTime <", value, "joinschooltime");
            return (Criteria) this;
        }

        public Criteria andJoinschooltimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("joinSchoolTime <=", value, "joinschooltime");
            return (Criteria) this;
        }

        public Criteria andJoinschooltimeIn(List<Date> values) {
            addCriterionForJDBCDate("joinSchoolTime in", values, "joinschooltime");
            return (Criteria) this;
        }

        public Criteria andJoinschooltimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("joinSchoolTime not in", values, "joinschooltime");
            return (Criteria) this;
        }

        public Criteria andJoinschooltimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("joinSchoolTime between", value1, value2, "joinschooltime");
            return (Criteria) this;
        }

        public Criteria andJoinschooltimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("joinSchoolTime not between", value1, value2, "joinschooltime");
            return (Criteria) this;
        }

        public Criteria andTeacherpositionIsNull() {
            addCriterion("teacherPosition is null");
            return (Criteria) this;
        }

        public Criteria andTeacherpositionIsNotNull() {
            addCriterion("teacherPosition is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherpositionEqualTo(String value) {
            addCriterion("teacherPosition =", value, "teacherposition");
            return (Criteria) this;
        }

        public Criteria andTeacherpositionNotEqualTo(String value) {
            addCriterion("teacherPosition <>", value, "teacherposition");
            return (Criteria) this;
        }

        public Criteria andTeacherpositionGreaterThan(String value) {
            addCriterion("teacherPosition >", value, "teacherposition");
            return (Criteria) this;
        }

        public Criteria andTeacherpositionGreaterThanOrEqualTo(String value) {
            addCriterion("teacherPosition >=", value, "teacherposition");
            return (Criteria) this;
        }

        public Criteria andTeacherpositionLessThan(String value) {
            addCriterion("teacherPosition <", value, "teacherposition");
            return (Criteria) this;
        }

        public Criteria andTeacherpositionLessThanOrEqualTo(String value) {
            addCriterion("teacherPosition <=", value, "teacherposition");
            return (Criteria) this;
        }

        public Criteria andTeacherpositionLike(String value) {
            addCriterion("teacherPosition like", value, "teacherposition");
            return (Criteria) this;
        }

        public Criteria andTeacherpositionNotLike(String value) {
            addCriterion("teacherPosition not like", value, "teacherposition");
            return (Criteria) this;
        }

        public Criteria andTeacherpositionIn(List<String> values) {
            addCriterion("teacherPosition in", values, "teacherposition");
            return (Criteria) this;
        }

        public Criteria andTeacherpositionNotIn(List<String> values) {
            addCriterion("teacherPosition not in", values, "teacherposition");
            return (Criteria) this;
        }

        public Criteria andTeacherpositionBetween(String value1, String value2) {
            addCriterion("teacherPosition between", value1, value2, "teacherposition");
            return (Criteria) this;
        }

        public Criteria andTeacherpositionNotBetween(String value1, String value2) {
            addCriterion("teacherPosition not between", value1, value2, "teacherposition");
            return (Criteria) this;
        }

        public Criteria andInpositionIsNull() {
            addCriterion("inPosition is null");
            return (Criteria) this;
        }

        public Criteria andInpositionIsNotNull() {
            addCriterion("inPosition is not null");
            return (Criteria) this;
        }

        public Criteria andInpositionEqualTo(String value) {
            addCriterion("inPosition =", value, "inposition");
            return (Criteria) this;
        }

        public Criteria andInpositionNotEqualTo(String value) {
            addCriterion("inPosition <>", value, "inposition");
            return (Criteria) this;
        }

        public Criteria andInpositionGreaterThan(String value) {
            addCriterion("inPosition >", value, "inposition");
            return (Criteria) this;
        }

        public Criteria andInpositionGreaterThanOrEqualTo(String value) {
            addCriterion("inPosition >=", value, "inposition");
            return (Criteria) this;
        }

        public Criteria andInpositionLessThan(String value) {
            addCriterion("inPosition <", value, "inposition");
            return (Criteria) this;
        }

        public Criteria andInpositionLessThanOrEqualTo(String value) {
            addCriterion("inPosition <=", value, "inposition");
            return (Criteria) this;
        }

        public Criteria andInpositionLike(String value) {
            addCriterion("inPosition like", value, "inposition");
            return (Criteria) this;
        }

        public Criteria andInpositionNotLike(String value) {
            addCriterion("inPosition not like", value, "inposition");
            return (Criteria) this;
        }

        public Criteria andInpositionIn(List<String> values) {
            addCriterion("inPosition in", values, "inposition");
            return (Criteria) this;
        }

        public Criteria andInpositionNotIn(List<String> values) {
            addCriterion("inPosition not in", values, "inposition");
            return (Criteria) this;
        }

        public Criteria andInpositionBetween(String value1, String value2) {
            addCriterion("inPosition between", value1, value2, "inposition");
            return (Criteria) this;
        }

        public Criteria andInpositionNotBetween(String value1, String value2) {
            addCriterion("inPosition not between", value1, value2, "inposition");
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