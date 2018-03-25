package cn.xm.jwxt.bean.trainScheme;

import java.util.ArrayList;
import java.util.List;

public class Trainschemeinfo2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Trainschemeinfo2Example() {
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

        public Criteria andTrainningschemeid2IsNull() {
            addCriterion("trainningSchemeId2 is null");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeid2IsNotNull() {
            addCriterion("trainningSchemeId2 is not null");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeid2EqualTo(String value) {
            addCriterion("trainningSchemeId2 =", value, "trainningschemeid2");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeid2NotEqualTo(String value) {
            addCriterion("trainningSchemeId2 <>", value, "trainningschemeid2");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeid2GreaterThan(String value) {
            addCriterion("trainningSchemeId2 >", value, "trainningschemeid2");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeid2GreaterThanOrEqualTo(String value) {
            addCriterion("trainningSchemeId2 >=", value, "trainningschemeid2");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeid2LessThan(String value) {
            addCriterion("trainningSchemeId2 <", value, "trainningschemeid2");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeid2LessThanOrEqualTo(String value) {
            addCriterion("trainningSchemeId2 <=", value, "trainningschemeid2");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeid2Like(String value) {
            addCriterion("trainningSchemeId2 like", value, "trainningschemeid2");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeid2NotLike(String value) {
            addCriterion("trainningSchemeId2 not like", value, "trainningschemeid2");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeid2In(List<String> values) {
            addCriterion("trainningSchemeId2 in", values, "trainningschemeid2");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeid2NotIn(List<String> values) {
            addCriterion("trainningSchemeId2 not in", values, "trainningschemeid2");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeid2Between(String value1, String value2) {
            addCriterion("trainningSchemeId2 between", value1, value2, "trainningschemeid2");
            return (Criteria) this;
        }

        public Criteria andTrainningschemeid2NotBetween(String value1, String value2) {
            addCriterion("trainningSchemeId2 not between", value1, value2, "trainningschemeid2");
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