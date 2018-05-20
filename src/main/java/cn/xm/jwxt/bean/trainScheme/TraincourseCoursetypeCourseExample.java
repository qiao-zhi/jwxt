package cn.xm.jwxt.bean.trainScheme;

import java.util.ArrayList;
import java.util.List;

public class TraincourseCoursetypeCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraincourseCoursetypeCourseExample() {
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

        public Criteria andCourseidIsNull() {
            addCriterion("courseId is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(String value) {
            addCriterion("courseId =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(String value) {
            addCriterion("courseId <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(String value) {
            addCriterion("courseId >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(String value) {
            addCriterion("courseId >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(String value) {
            addCriterion("courseId <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(String value) {
            addCriterion("courseId <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLike(String value) {
            addCriterion("courseId like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotLike(String value) {
            addCriterion("courseId not like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<String> values) {
            addCriterion("courseId in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<String> values) {
            addCriterion("courseId not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(String value1, String value2) {
            addCriterion("courseId between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(String value1, String value2) {
            addCriterion("courseId not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCoursenumIsNull() {
            addCriterion("courseNum is null");
            return (Criteria) this;
        }

        public Criteria andCoursenumIsNotNull() {
            addCriterion("courseNum is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenumEqualTo(String value) {
            addCriterion("courseNum =", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotEqualTo(String value) {
            addCriterion("courseNum <>", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumGreaterThan(String value) {
            addCriterion("courseNum >", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumGreaterThanOrEqualTo(String value) {
            addCriterion("courseNum >=", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumLessThan(String value) {
            addCriterion("courseNum <", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumLessThanOrEqualTo(String value) {
            addCriterion("courseNum <=", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumLike(String value) {
            addCriterion("courseNum like", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotLike(String value) {
            addCriterion("courseNum not like", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumIn(List<String> values) {
            addCriterion("courseNum in", values, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotIn(List<String> values) {
            addCriterion("courseNum not in", values, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumBetween(String value1, String value2) {
            addCriterion("courseNum between", value1, value2, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotBetween(String value1, String value2) {
            addCriterion("courseNum not between", value1, value2, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCourseplatformIsNull() {
            addCriterion("coursePlatform is null");
            return (Criteria) this;
        }

        public Criteria andCourseplatformIsNotNull() {
            addCriterion("coursePlatform is not null");
            return (Criteria) this;
        }

        public Criteria andCourseplatformEqualTo(String value) {
            addCriterion("coursePlatform =", value, "courseplatform");
            return (Criteria) this;
        }

        public Criteria andCourseplatformNotEqualTo(String value) {
            addCriterion("coursePlatform <>", value, "courseplatform");
            return (Criteria) this;
        }

        public Criteria andCourseplatformGreaterThan(String value) {
            addCriterion("coursePlatform >", value, "courseplatform");
            return (Criteria) this;
        }

        public Criteria andCourseplatformGreaterThanOrEqualTo(String value) {
            addCriterion("coursePlatform >=", value, "courseplatform");
            return (Criteria) this;
        }

        public Criteria andCourseplatformLessThan(String value) {
            addCriterion("coursePlatform <", value, "courseplatform");
            return (Criteria) this;
        }

        public Criteria andCourseplatformLessThanOrEqualTo(String value) {
            addCriterion("coursePlatform <=", value, "courseplatform");
            return (Criteria) this;
        }

        public Criteria andCourseplatformLike(String value) {
            addCriterion("coursePlatform like", value, "courseplatform");
            return (Criteria) this;
        }

        public Criteria andCourseplatformNotLike(String value) {
            addCriterion("coursePlatform not like", value, "courseplatform");
            return (Criteria) this;
        }

        public Criteria andCourseplatformIn(List<String> values) {
            addCriterion("coursePlatform in", values, "courseplatform");
            return (Criteria) this;
        }

        public Criteria andCourseplatformNotIn(List<String> values) {
            addCriterion("coursePlatform not in", values, "courseplatform");
            return (Criteria) this;
        }

        public Criteria andCourseplatformBetween(String value1, String value2) {
            addCriterion("coursePlatform between", value1, value2, "courseplatform");
            return (Criteria) this;
        }

        public Criteria andCourseplatformNotBetween(String value1, String value2) {
            addCriterion("coursePlatform not between", value1, value2, "courseplatform");
            return (Criteria) this;
        }

        public Criteria andCoursenatureIsNull() {
            addCriterion("courseNature is null");
            return (Criteria) this;
        }

        public Criteria andCoursenatureIsNotNull() {
            addCriterion("courseNature is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenatureEqualTo(String value) {
            addCriterion("courseNature =", value, "coursenature");
            return (Criteria) this;
        }

        public Criteria andCoursenatureNotEqualTo(String value) {
            addCriterion("courseNature <>", value, "coursenature");
            return (Criteria) this;
        }

        public Criteria andCoursenatureGreaterThan(String value) {
            addCriterion("courseNature >", value, "coursenature");
            return (Criteria) this;
        }

        public Criteria andCoursenatureGreaterThanOrEqualTo(String value) {
            addCriterion("courseNature >=", value, "coursenature");
            return (Criteria) this;
        }

        public Criteria andCoursenatureLessThan(String value) {
            addCriterion("courseNature <", value, "coursenature");
            return (Criteria) this;
        }

        public Criteria andCoursenatureLessThanOrEqualTo(String value) {
            addCriterion("courseNature <=", value, "coursenature");
            return (Criteria) this;
        }

        public Criteria andCoursenatureLike(String value) {
            addCriterion("courseNature like", value, "coursenature");
            return (Criteria) this;
        }

        public Criteria andCoursenatureNotLike(String value) {
            addCriterion("courseNature not like", value, "coursenature");
            return (Criteria) this;
        }

        public Criteria andCoursenatureIn(List<String> values) {
            addCriterion("courseNature in", values, "coursenature");
            return (Criteria) this;
        }

        public Criteria andCoursenatureNotIn(List<String> values) {
            addCriterion("courseNature not in", values, "coursenature");
            return (Criteria) this;
        }

        public Criteria andCoursenatureBetween(String value1, String value2) {
            addCriterion("courseNature between", value1, value2, "coursenature");
            return (Criteria) this;
        }

        public Criteria andCoursenatureNotBetween(String value1, String value2) {
            addCriterion("courseNature not between", value1, value2, "coursenature");
            return (Criteria) this;
        }

        public Criteria andCoursenamecnIsNull() {
            addCriterion("courseNameCN is null");
            return (Criteria) this;
        }

        public Criteria andCoursenamecnIsNotNull() {
            addCriterion("courseNameCN is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenamecnEqualTo(String value) {
            addCriterion("courseNameCN =", value, "coursenamecn");
            return (Criteria) this;
        }

        public Criteria andCoursenamecnNotEqualTo(String value) {
            addCriterion("courseNameCN <>", value, "coursenamecn");
            return (Criteria) this;
        }

        public Criteria andCoursenamecnGreaterThan(String value) {
            addCriterion("courseNameCN >", value, "coursenamecn");
            return (Criteria) this;
        }

        public Criteria andCoursenamecnGreaterThanOrEqualTo(String value) {
            addCriterion("courseNameCN >=", value, "coursenamecn");
            return (Criteria) this;
        }

        public Criteria andCoursenamecnLessThan(String value) {
            addCriterion("courseNameCN <", value, "coursenamecn");
            return (Criteria) this;
        }

        public Criteria andCoursenamecnLessThanOrEqualTo(String value) {
            addCriterion("courseNameCN <=", value, "coursenamecn");
            return (Criteria) this;
        }

        public Criteria andCoursenamecnLike(String value) {
            addCriterion("courseNameCN like", value, "coursenamecn");
            return (Criteria) this;
        }

        public Criteria andCoursenamecnNotLike(String value) {
            addCriterion("courseNameCN not like", value, "coursenamecn");
            return (Criteria) this;
        }

        public Criteria andCoursenamecnIn(List<String> values) {
            addCriterion("courseNameCN in", values, "coursenamecn");
            return (Criteria) this;
        }

        public Criteria andCoursenamecnNotIn(List<String> values) {
            addCriterion("courseNameCN not in", values, "coursenamecn");
            return (Criteria) this;
        }

        public Criteria andCoursenamecnBetween(String value1, String value2) {
            addCriterion("courseNameCN between", value1, value2, "coursenamecn");
            return (Criteria) this;
        }

        public Criteria andCoursenamecnNotBetween(String value1, String value2) {
            addCriterion("courseNameCN not between", value1, value2, "coursenamecn");
            return (Criteria) this;
        }

        public Criteria andCoursenameenIsNull() {
            addCriterion("courseNameEN is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameenIsNotNull() {
            addCriterion("courseNameEN is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameenEqualTo(String value) {
            addCriterion("courseNameEN =", value, "coursenameen");
            return (Criteria) this;
        }

        public Criteria andCoursenameenNotEqualTo(String value) {
            addCriterion("courseNameEN <>", value, "coursenameen");
            return (Criteria) this;
        }

        public Criteria andCoursenameenGreaterThan(String value) {
            addCriterion("courseNameEN >", value, "coursenameen");
            return (Criteria) this;
        }

        public Criteria andCoursenameenGreaterThanOrEqualTo(String value) {
            addCriterion("courseNameEN >=", value, "coursenameen");
            return (Criteria) this;
        }

        public Criteria andCoursenameenLessThan(String value) {
            addCriterion("courseNameEN <", value, "coursenameen");
            return (Criteria) this;
        }

        public Criteria andCoursenameenLessThanOrEqualTo(String value) {
            addCriterion("courseNameEN <=", value, "coursenameen");
            return (Criteria) this;
        }

        public Criteria andCoursenameenLike(String value) {
            addCriterion("courseNameEN like", value, "coursenameen");
            return (Criteria) this;
        }

        public Criteria andCoursenameenNotLike(String value) {
            addCriterion("courseNameEN not like", value, "coursenameen");
            return (Criteria) this;
        }

        public Criteria andCoursenameenIn(List<String> values) {
            addCriterion("courseNameEN in", values, "coursenameen");
            return (Criteria) this;
        }

        public Criteria andCoursenameenNotIn(List<String> values) {
            addCriterion("courseNameEN not in", values, "coursenameen");
            return (Criteria) this;
        }

        public Criteria andCoursenameenBetween(String value1, String value2) {
            addCriterion("courseNameEN between", value1, value2, "coursenameen");
            return (Criteria) this;
        }

        public Criteria andCoursenameenNotBetween(String value1, String value2) {
            addCriterion("courseNameEN not between", value1, value2, "coursenameen");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(String value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(String value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(String value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(String value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(String value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(String value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLike(String value) {
            addCriterion("credit like", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotLike(String value) {
            addCriterion("credit not like", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<String> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<String> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(String value1, String value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(String value1, String value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCoursehourIsNull() {
            addCriterion("courseHour is null");
            return (Criteria) this;
        }

        public Criteria andCoursehourIsNotNull() {
            addCriterion("courseHour is not null");
            return (Criteria) this;
        }

        public Criteria andCoursehourEqualTo(String value) {
            addCriterion("courseHour =", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourNotEqualTo(String value) {
            addCriterion("courseHour <>", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourGreaterThan(String value) {
            addCriterion("courseHour >", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourGreaterThanOrEqualTo(String value) {
            addCriterion("courseHour >=", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourLessThan(String value) {
            addCriterion("courseHour <", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourLessThanOrEqualTo(String value) {
            addCriterion("courseHour <=", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourLike(String value) {
            addCriterion("courseHour like", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourNotLike(String value) {
            addCriterion("courseHour not like", value, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourIn(List<String> values) {
            addCriterion("courseHour in", values, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourNotIn(List<String> values) {
            addCriterion("courseHour not in", values, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourBetween(String value1, String value2) {
            addCriterion("courseHour between", value1, value2, "coursehour");
            return (Criteria) this;
        }

        public Criteria andCoursehourNotBetween(String value1, String value2) {
            addCriterion("courseHour not between", value1, value2, "coursehour");
            return (Criteria) this;
        }

        public Criteria andTeachhourIsNull() {
            addCriterion("teachHour is null");
            return (Criteria) this;
        }

        public Criteria andTeachhourIsNotNull() {
            addCriterion("teachHour is not null");
            return (Criteria) this;
        }

        public Criteria andTeachhourEqualTo(String value) {
            addCriterion("teachHour =", value, "teachhour");
            return (Criteria) this;
        }

        public Criteria andTeachhourNotEqualTo(String value) {
            addCriterion("teachHour <>", value, "teachhour");
            return (Criteria) this;
        }

        public Criteria andTeachhourGreaterThan(String value) {
            addCriterion("teachHour >", value, "teachhour");
            return (Criteria) this;
        }

        public Criteria andTeachhourGreaterThanOrEqualTo(String value) {
            addCriterion("teachHour >=", value, "teachhour");
            return (Criteria) this;
        }

        public Criteria andTeachhourLessThan(String value) {
            addCriterion("teachHour <", value, "teachhour");
            return (Criteria) this;
        }

        public Criteria andTeachhourLessThanOrEqualTo(String value) {
            addCriterion("teachHour <=", value, "teachhour");
            return (Criteria) this;
        }

        public Criteria andTeachhourLike(String value) {
            addCriterion("teachHour like", value, "teachhour");
            return (Criteria) this;
        }

        public Criteria andTeachhourNotLike(String value) {
            addCriterion("teachHour not like", value, "teachhour");
            return (Criteria) this;
        }

        public Criteria andTeachhourIn(List<String> values) {
            addCriterion("teachHour in", values, "teachhour");
            return (Criteria) this;
        }

        public Criteria andTeachhourNotIn(List<String> values) {
            addCriterion("teachHour not in", values, "teachhour");
            return (Criteria) this;
        }

        public Criteria andTeachhourBetween(String value1, String value2) {
            addCriterion("teachHour between", value1, value2, "teachhour");
            return (Criteria) this;
        }

        public Criteria andTeachhourNotBetween(String value1, String value2) {
            addCriterion("teachHour not between", value1, value2, "teachhour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourIsNull() {
            addCriterion("experimentHour is null");
            return (Criteria) this;
        }

        public Criteria andExperimenthourIsNotNull() {
            addCriterion("experimentHour is not null");
            return (Criteria) this;
        }

        public Criteria andExperimenthourEqualTo(String value) {
            addCriterion("experimentHour =", value, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourNotEqualTo(String value) {
            addCriterion("experimentHour <>", value, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourGreaterThan(String value) {
            addCriterion("experimentHour >", value, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourGreaterThanOrEqualTo(String value) {
            addCriterion("experimentHour >=", value, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourLessThan(String value) {
            addCriterion("experimentHour <", value, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourLessThanOrEqualTo(String value) {
            addCriterion("experimentHour <=", value, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourLike(String value) {
            addCriterion("experimentHour like", value, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourNotLike(String value) {
            addCriterion("experimentHour not like", value, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourIn(List<String> values) {
            addCriterion("experimentHour in", values, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourNotIn(List<String> values) {
            addCriterion("experimentHour not in", values, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourBetween(String value1, String value2) {
            addCriterion("experimentHour between", value1, value2, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourNotBetween(String value1, String value2) {
            addCriterion("experimentHour not between", value1, value2, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andComputerhourIsNull() {
            addCriterion("computerHour is null");
            return (Criteria) this;
        }

        public Criteria andComputerhourIsNotNull() {
            addCriterion("computerHour is not null");
            return (Criteria) this;
        }

        public Criteria andComputerhourEqualTo(String value) {
            addCriterion("computerHour =", value, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourNotEqualTo(String value) {
            addCriterion("computerHour <>", value, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourGreaterThan(String value) {
            addCriterion("computerHour >", value, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourGreaterThanOrEqualTo(String value) {
            addCriterion("computerHour >=", value, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourLessThan(String value) {
            addCriterion("computerHour <", value, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourLessThanOrEqualTo(String value) {
            addCriterion("computerHour <=", value, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourLike(String value) {
            addCriterion("computerHour like", value, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourNotLike(String value) {
            addCriterion("computerHour not like", value, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourIn(List<String> values) {
            addCriterion("computerHour in", values, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourNotIn(List<String> values) {
            addCriterion("computerHour not in", values, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourBetween(String value1, String value2) {
            addCriterion("computerHour between", value1, value2, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourNotBetween(String value1, String value2) {
            addCriterion("computerHour not between", value1, value2, "computerhour");
            return (Criteria) this;
        }

        public Criteria andPracticehourIsNull() {
            addCriterion("practiceHour is null");
            return (Criteria) this;
        }

        public Criteria andPracticehourIsNotNull() {
            addCriterion("practiceHour is not null");
            return (Criteria) this;
        }

        public Criteria andPracticehourEqualTo(String value) {
            addCriterion("practiceHour =", value, "practicehour");
            return (Criteria) this;
        }

        public Criteria andPracticehourNotEqualTo(String value) {
            addCriterion("practiceHour <>", value, "practicehour");
            return (Criteria) this;
        }

        public Criteria andPracticehourGreaterThan(String value) {
            addCriterion("practiceHour >", value, "practicehour");
            return (Criteria) this;
        }

        public Criteria andPracticehourGreaterThanOrEqualTo(String value) {
            addCriterion("practiceHour >=", value, "practicehour");
            return (Criteria) this;
        }

        public Criteria andPracticehourLessThan(String value) {
            addCriterion("practiceHour <", value, "practicehour");
            return (Criteria) this;
        }

        public Criteria andPracticehourLessThanOrEqualTo(String value) {
            addCriterion("practiceHour <=", value, "practicehour");
            return (Criteria) this;
        }

        public Criteria andPracticehourLike(String value) {
            addCriterion("practiceHour like", value, "practicehour");
            return (Criteria) this;
        }

        public Criteria andPracticehourNotLike(String value) {
            addCriterion("practiceHour not like", value, "practicehour");
            return (Criteria) this;
        }

        public Criteria andPracticehourIn(List<String> values) {
            addCriterion("practiceHour in", values, "practicehour");
            return (Criteria) this;
        }

        public Criteria andPracticehourNotIn(List<String> values) {
            addCriterion("practiceHour not in", values, "practicehour");
            return (Criteria) this;
        }

        public Criteria andPracticehourBetween(String value1, String value2) {
            addCriterion("practiceHour between", value1, value2, "practicehour");
            return (Criteria) this;
        }

        public Criteria andPracticehourNotBetween(String value1, String value2) {
            addCriterion("practiceHour not between", value1, value2, "practicehour");
            return (Criteria) this;
        }

        public Criteria andWeeklyhourIsNull() {
            addCriterion("weeklyHour is null");
            return (Criteria) this;
        }

        public Criteria andWeeklyhourIsNotNull() {
            addCriterion("weeklyHour is not null");
            return (Criteria) this;
        }

        public Criteria andWeeklyhourEqualTo(String value) {
            addCriterion("weeklyHour =", value, "weeklyhour");
            return (Criteria) this;
        }

        public Criteria andWeeklyhourNotEqualTo(String value) {
            addCriterion("weeklyHour <>", value, "weeklyhour");
            return (Criteria) this;
        }

        public Criteria andWeeklyhourGreaterThan(String value) {
            addCriterion("weeklyHour >", value, "weeklyhour");
            return (Criteria) this;
        }

        public Criteria andWeeklyhourGreaterThanOrEqualTo(String value) {
            addCriterion("weeklyHour >=", value, "weeklyhour");
            return (Criteria) this;
        }

        public Criteria andWeeklyhourLessThan(String value) {
            addCriterion("weeklyHour <", value, "weeklyhour");
            return (Criteria) this;
        }

        public Criteria andWeeklyhourLessThanOrEqualTo(String value) {
            addCriterion("weeklyHour <=", value, "weeklyhour");
            return (Criteria) this;
        }

        public Criteria andWeeklyhourLike(String value) {
            addCriterion("weeklyHour like", value, "weeklyhour");
            return (Criteria) this;
        }

        public Criteria andWeeklyhourNotLike(String value) {
            addCriterion("weeklyHour not like", value, "weeklyhour");
            return (Criteria) this;
        }

        public Criteria andWeeklyhourIn(List<String> values) {
            addCriterion("weeklyHour in", values, "weeklyhour");
            return (Criteria) this;
        }

        public Criteria andWeeklyhourNotIn(List<String> values) {
            addCriterion("weeklyHour not in", values, "weeklyhour");
            return (Criteria) this;
        }

        public Criteria andWeeklyhourBetween(String value1, String value2) {
            addCriterion("weeklyHour between", value1, value2, "weeklyhour");
            return (Criteria) this;
        }

        public Criteria andWeeklyhourNotBetween(String value1, String value2) {
            addCriterion("weeklyHour not between", value1, value2, "weeklyhour");
            return (Criteria) this;
        }

        public Criteria andScoringwayIsNull() {
            addCriterion("scoringWay is null");
            return (Criteria) this;
        }

        public Criteria andScoringwayIsNotNull() {
            addCriterion("scoringWay is not null");
            return (Criteria) this;
        }

        public Criteria andScoringwayEqualTo(String value) {
            addCriterion("scoringWay =", value, "scoringway");
            return (Criteria) this;
        }

        public Criteria andScoringwayNotEqualTo(String value) {
            addCriterion("scoringWay <>", value, "scoringway");
            return (Criteria) this;
        }

        public Criteria andScoringwayGreaterThan(String value) {
            addCriterion("scoringWay >", value, "scoringway");
            return (Criteria) this;
        }

        public Criteria andScoringwayGreaterThanOrEqualTo(String value) {
            addCriterion("scoringWay >=", value, "scoringway");
            return (Criteria) this;
        }

        public Criteria andScoringwayLessThan(String value) {
            addCriterion("scoringWay <", value, "scoringway");
            return (Criteria) this;
        }

        public Criteria andScoringwayLessThanOrEqualTo(String value) {
            addCriterion("scoringWay <=", value, "scoringway");
            return (Criteria) this;
        }

        public Criteria andScoringwayLike(String value) {
            addCriterion("scoringWay like", value, "scoringway");
            return (Criteria) this;
        }

        public Criteria andScoringwayNotLike(String value) {
            addCriterion("scoringWay not like", value, "scoringway");
            return (Criteria) this;
        }

        public Criteria andScoringwayIn(List<String> values) {
            addCriterion("scoringWay in", values, "scoringway");
            return (Criteria) this;
        }

        public Criteria andScoringwayNotIn(List<String> values) {
            addCriterion("scoringWay not in", values, "scoringway");
            return (Criteria) this;
        }

        public Criteria andScoringwayBetween(String value1, String value2) {
            addCriterion("scoringWay between", value1, value2, "scoringway");
            return (Criteria) this;
        }

        public Criteria andScoringwayNotBetween(String value1, String value2) {
            addCriterion("scoringWay not between", value1, value2, "scoringway");
            return (Criteria) this;
        }

        public Criteria andCoursehourmethodIsNull() {
            addCriterion("courseHourMethod is null");
            return (Criteria) this;
        }

        public Criteria andCoursehourmethodIsNotNull() {
            addCriterion("courseHourMethod is not null");
            return (Criteria) this;
        }

        public Criteria andCoursehourmethodEqualTo(String value) {
            addCriterion("courseHourMethod =", value, "coursehourmethod");
            return (Criteria) this;
        }

        public Criteria andCoursehourmethodNotEqualTo(String value) {
            addCriterion("courseHourMethod <>", value, "coursehourmethod");
            return (Criteria) this;
        }

        public Criteria andCoursehourmethodGreaterThan(String value) {
            addCriterion("courseHourMethod >", value, "coursehourmethod");
            return (Criteria) this;
        }

        public Criteria andCoursehourmethodGreaterThanOrEqualTo(String value) {
            addCriterion("courseHourMethod >=", value, "coursehourmethod");
            return (Criteria) this;
        }

        public Criteria andCoursehourmethodLessThan(String value) {
            addCriterion("courseHourMethod <", value, "coursehourmethod");
            return (Criteria) this;
        }

        public Criteria andCoursehourmethodLessThanOrEqualTo(String value) {
            addCriterion("courseHourMethod <=", value, "coursehourmethod");
            return (Criteria) this;
        }

        public Criteria andCoursehourmethodLike(String value) {
            addCriterion("courseHourMethod like", value, "coursehourmethod");
            return (Criteria) this;
        }

        public Criteria andCoursehourmethodNotLike(String value) {
            addCriterion("courseHourMethod not like", value, "coursehourmethod");
            return (Criteria) this;
        }

        public Criteria andCoursehourmethodIn(List<String> values) {
            addCriterion("courseHourMethod in", values, "coursehourmethod");
            return (Criteria) this;
        }

        public Criteria andCoursehourmethodNotIn(List<String> values) {
            addCriterion("courseHourMethod not in", values, "coursehourmethod");
            return (Criteria) this;
        }

        public Criteria andCoursehourmethodBetween(String value1, String value2) {
            addCriterion("courseHourMethod between", value1, value2, "coursehourmethod");
            return (Criteria) this;
        }

        public Criteria andCoursehourmethodNotBetween(String value1, String value2) {
            addCriterion("courseHourMethod not between", value1, value2, "coursehourmethod");
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

        public Criteria andTypenumIsNull() {
            addCriterion("typeNum is null");
            return (Criteria) this;
        }

        public Criteria andTypenumIsNotNull() {
            addCriterion("typeNum is not null");
            return (Criteria) this;
        }

        public Criteria andTypenumEqualTo(String value) {
            addCriterion("typeNum =", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumNotEqualTo(String value) {
            addCriterion("typeNum <>", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumGreaterThan(String value) {
            addCriterion("typeNum >", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumGreaterThanOrEqualTo(String value) {
            addCriterion("typeNum >=", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumLessThan(String value) {
            addCriterion("typeNum <", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumLessThanOrEqualTo(String value) {
            addCriterion("typeNum <=", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumLike(String value) {
            addCriterion("typeNum like", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumNotLike(String value) {
            addCriterion("typeNum not like", value, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumIn(List<String> values) {
            addCriterion("typeNum in", values, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumNotIn(List<String> values) {
            addCriterion("typeNum not in", values, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumBetween(String value1, String value2) {
            addCriterion("typeNum between", value1, value2, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenumNotBetween(String value1, String value2) {
            addCriterion("typeNum not between", value1, value2, "typenum");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("typeName is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("typeName is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("typeName =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("typeName <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("typeName >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("typeName >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("typeName <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("typeName <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("typeName like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("typeName not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("typeName in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("typeName not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("typeName between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("typeName not between", value1, value2, "typename");
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

        public Criteria andSemesterIsNull() {
            addCriterion("semester is null");
            return (Criteria) this;
        }

        public Criteria andSemesterIsNotNull() {
            addCriterion("semester is not null");
            return (Criteria) this;
        }

        public Criteria andSemesterEqualTo(Short value) {
            addCriterion("semester =", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotEqualTo(Short value) {
            addCriterion("semester <>", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterGreaterThan(Short value) {
            addCriterion("semester >", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterGreaterThanOrEqualTo(Short value) {
            addCriterion("semester >=", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterLessThan(Short value) {
            addCriterion("semester <", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterLessThanOrEqualTo(Short value) {
            addCriterion("semester <=", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterIn(List<Short> values) {
            addCriterion("semester in", values, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotIn(List<Short> values) {
            addCriterion("semester not in", values, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterBetween(Short value1, Short value2) {
            addCriterion("semester between", value1, value2, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotBetween(Short value1, Short value2) {
            addCriterion("semester not between", value1, value2, "semester");
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