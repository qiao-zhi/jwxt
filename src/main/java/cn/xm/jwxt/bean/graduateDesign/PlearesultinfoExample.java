package cn.xm.jwxt.bean.graduateDesign;

import java.util.ArrayList;
import java.util.List;

public class PlearesultinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlearesultinfoExample() {
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

        public Criteria andPlearesultidIsNull() {
            addCriterion("plearesultid is null");
            return (Criteria) this;
        }

        public Criteria andPlearesultidIsNotNull() {
            addCriterion("plearesultid is not null");
            return (Criteria) this;
        }

        public Criteria andPlearesultidEqualTo(Integer value) {
            addCriterion("plearesultid =", value, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidNotEqualTo(Integer value) {
            addCriterion("plearesultid <>", value, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidGreaterThan(Integer value) {
            addCriterion("plearesultid >", value, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidGreaterThanOrEqualTo(Integer value) {
            addCriterion("plearesultid >=", value, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidLessThan(Integer value) {
            addCriterion("plearesultid <", value, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidLessThanOrEqualTo(Integer value) {
            addCriterion("plearesultid <=", value, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidIn(List<Integer> values) {
            addCriterion("plearesultid in", values, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidNotIn(List<Integer> values) {
            addCriterion("plearesultid not in", values, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidBetween(Integer value1, Integer value2) {
            addCriterion("plearesultid between", value1, value2, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andPlearesultidNotBetween(Integer value1, Integer value2) {
            addCriterion("plearesultid not between", value1, value2, "plearesultid");
            return (Criteria) this;
        }

        public Criteria andArrangeidIsNull() {
            addCriterion("arrangeid is null");
            return (Criteria) this;
        }

        public Criteria andArrangeidIsNotNull() {
            addCriterion("arrangeid is not null");
            return (Criteria) this;
        }

        public Criteria andArrangeidEqualTo(Integer value) {
            addCriterion("arrangeid =", value, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidNotEqualTo(Integer value) {
            addCriterion("arrangeid <>", value, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidGreaterThan(Integer value) {
            addCriterion("arrangeid >", value, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("arrangeid >=", value, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidLessThan(Integer value) {
            addCriterion("arrangeid <", value, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidLessThanOrEqualTo(Integer value) {
            addCriterion("arrangeid <=", value, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidIn(List<Integer> values) {
            addCriterion("arrangeid in", values, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidNotIn(List<Integer> values) {
            addCriterion("arrangeid not in", values, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidBetween(Integer value1, Integer value2) {
            addCriterion("arrangeid between", value1, value2, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andArrangeidNotBetween(Integer value1, Integer value2) {
            addCriterion("arrangeid not between", value1, value2, "arrangeid");
            return (Criteria) this;
        }

        public Criteria andGuideteacheradviceIsNull() {
            addCriterion("guideTeacherAdvice is null");
            return (Criteria) this;
        }

        public Criteria andGuideteacheradviceIsNotNull() {
            addCriterion("guideTeacherAdvice is not null");
            return (Criteria) this;
        }

        public Criteria andGuideteacheradviceEqualTo(String value) {
            addCriterion("guideTeacherAdvice =", value, "guideteacheradvice");
            return (Criteria) this;
        }

        public Criteria andGuideteacheradviceNotEqualTo(String value) {
            addCriterion("guideTeacherAdvice <>", value, "guideteacheradvice");
            return (Criteria) this;
        }

        public Criteria andGuideteacheradviceGreaterThan(String value) {
            addCriterion("guideTeacherAdvice >", value, "guideteacheradvice");
            return (Criteria) this;
        }

        public Criteria andGuideteacheradviceGreaterThanOrEqualTo(String value) {
            addCriterion("guideTeacherAdvice >=", value, "guideteacheradvice");
            return (Criteria) this;
        }

        public Criteria andGuideteacheradviceLessThan(String value) {
            addCriterion("guideTeacherAdvice <", value, "guideteacheradvice");
            return (Criteria) this;
        }

        public Criteria andGuideteacheradviceLessThanOrEqualTo(String value) {
            addCriterion("guideTeacherAdvice <=", value, "guideteacheradvice");
            return (Criteria) this;
        }

        public Criteria andGuideteacheradviceLike(String value) {
            addCriterion("guideTeacherAdvice like", value, "guideteacheradvice");
            return (Criteria) this;
        }

        public Criteria andGuideteacheradviceNotLike(String value) {
            addCriterion("guideTeacherAdvice not like", value, "guideteacheradvice");
            return (Criteria) this;
        }

        public Criteria andGuideteacheradviceIn(List<String> values) {
            addCriterion("guideTeacherAdvice in", values, "guideteacheradvice");
            return (Criteria) this;
        }

        public Criteria andGuideteacheradviceNotIn(List<String> values) {
            addCriterion("guideTeacherAdvice not in", values, "guideteacheradvice");
            return (Criteria) this;
        }

        public Criteria andGuideteacheradviceBetween(String value1, String value2) {
            addCriterion("guideTeacherAdvice between", value1, value2, "guideteacheradvice");
            return (Criteria) this;
        }

        public Criteria andGuideteacheradviceNotBetween(String value1, String value2) {
            addCriterion("guideTeacherAdvice not between", value1, value2, "guideteacheradvice");
            return (Criteria) this;
        }

        public Criteria andGuideteacherscoreIsNull() {
            addCriterion("guideTeacherScore is null");
            return (Criteria) this;
        }

        public Criteria andGuideteacherscoreIsNotNull() {
            addCriterion("guideTeacherScore is not null");
            return (Criteria) this;
        }

        public Criteria andGuideteacherscoreEqualTo(String value) {
            addCriterion("guideTeacherScore =", value, "guideteacherscore");
            return (Criteria) this;
        }

        public Criteria andGuideteacherscoreNotEqualTo(String value) {
            addCriterion("guideTeacherScore <>", value, "guideteacherscore");
            return (Criteria) this;
        }

        public Criteria andGuideteacherscoreGreaterThan(String value) {
            addCriterion("guideTeacherScore >", value, "guideteacherscore");
            return (Criteria) this;
        }

        public Criteria andGuideteacherscoreGreaterThanOrEqualTo(String value) {
            addCriterion("guideTeacherScore >=", value, "guideteacherscore");
            return (Criteria) this;
        }

        public Criteria andGuideteacherscoreLessThan(String value) {
            addCriterion("guideTeacherScore <", value, "guideteacherscore");
            return (Criteria) this;
        }

        public Criteria andGuideteacherscoreLessThanOrEqualTo(String value) {
            addCriterion("guideTeacherScore <=", value, "guideteacherscore");
            return (Criteria) this;
        }

        public Criteria andGuideteacherscoreLike(String value) {
            addCriterion("guideTeacherScore like", value, "guideteacherscore");
            return (Criteria) this;
        }

        public Criteria andGuideteacherscoreNotLike(String value) {
            addCriterion("guideTeacherScore not like", value, "guideteacherscore");
            return (Criteria) this;
        }

        public Criteria andGuideteacherscoreIn(List<String> values) {
            addCriterion("guideTeacherScore in", values, "guideteacherscore");
            return (Criteria) this;
        }

        public Criteria andGuideteacherscoreNotIn(List<String> values) {
            addCriterion("guideTeacherScore not in", values, "guideteacherscore");
            return (Criteria) this;
        }

        public Criteria andGuideteacherscoreBetween(String value1, String value2) {
            addCriterion("guideTeacherScore between", value1, value2, "guideteacherscore");
            return (Criteria) this;
        }

        public Criteria andGuideteacherscoreNotBetween(String value1, String value2) {
            addCriterion("guideTeacherScore not between", value1, value2, "guideteacherscore");
            return (Criteria) this;
        }

        public Criteria andReadteacheradviceIsNull() {
            addCriterion("readTeacherAdvice is null");
            return (Criteria) this;
        }

        public Criteria andReadteacheradviceIsNotNull() {
            addCriterion("readTeacherAdvice is not null");
            return (Criteria) this;
        }

        public Criteria andReadteacheradviceEqualTo(String value) {
            addCriterion("readTeacherAdvice =", value, "readteacheradvice");
            return (Criteria) this;
        }

        public Criteria andReadteacheradviceNotEqualTo(String value) {
            addCriterion("readTeacherAdvice <>", value, "readteacheradvice");
            return (Criteria) this;
        }

        public Criteria andReadteacheradviceGreaterThan(String value) {
            addCriterion("readTeacherAdvice >", value, "readteacheradvice");
            return (Criteria) this;
        }

        public Criteria andReadteacheradviceGreaterThanOrEqualTo(String value) {
            addCriterion("readTeacherAdvice >=", value, "readteacheradvice");
            return (Criteria) this;
        }

        public Criteria andReadteacheradviceLessThan(String value) {
            addCriterion("readTeacherAdvice <", value, "readteacheradvice");
            return (Criteria) this;
        }

        public Criteria andReadteacheradviceLessThanOrEqualTo(String value) {
            addCriterion("readTeacherAdvice <=", value, "readteacheradvice");
            return (Criteria) this;
        }

        public Criteria andReadteacheradviceLike(String value) {
            addCriterion("readTeacherAdvice like", value, "readteacheradvice");
            return (Criteria) this;
        }

        public Criteria andReadteacheradviceNotLike(String value) {
            addCriterion("readTeacherAdvice not like", value, "readteacheradvice");
            return (Criteria) this;
        }

        public Criteria andReadteacheradviceIn(List<String> values) {
            addCriterion("readTeacherAdvice in", values, "readteacheradvice");
            return (Criteria) this;
        }

        public Criteria andReadteacheradviceNotIn(List<String> values) {
            addCriterion("readTeacherAdvice not in", values, "readteacheradvice");
            return (Criteria) this;
        }

        public Criteria andReadteacheradviceBetween(String value1, String value2) {
            addCriterion("readTeacherAdvice between", value1, value2, "readteacheradvice");
            return (Criteria) this;
        }

        public Criteria andReadteacheradviceNotBetween(String value1, String value2) {
            addCriterion("readTeacherAdvice not between", value1, value2, "readteacheradvice");
            return (Criteria) this;
        }

        public Criteria andReadteacherscoreIsNull() {
            addCriterion("readTeacherScore is null");
            return (Criteria) this;
        }

        public Criteria andReadteacherscoreIsNotNull() {
            addCriterion("readTeacherScore is not null");
            return (Criteria) this;
        }

        public Criteria andReadteacherscoreEqualTo(String value) {
            addCriterion("readTeacherScore =", value, "readteacherscore");
            return (Criteria) this;
        }

        public Criteria andReadteacherscoreNotEqualTo(String value) {
            addCriterion("readTeacherScore <>", value, "readteacherscore");
            return (Criteria) this;
        }

        public Criteria andReadteacherscoreGreaterThan(String value) {
            addCriterion("readTeacherScore >", value, "readteacherscore");
            return (Criteria) this;
        }

        public Criteria andReadteacherscoreGreaterThanOrEqualTo(String value) {
            addCriterion("readTeacherScore >=", value, "readteacherscore");
            return (Criteria) this;
        }

        public Criteria andReadteacherscoreLessThan(String value) {
            addCriterion("readTeacherScore <", value, "readteacherscore");
            return (Criteria) this;
        }

        public Criteria andReadteacherscoreLessThanOrEqualTo(String value) {
            addCriterion("readTeacherScore <=", value, "readteacherscore");
            return (Criteria) this;
        }

        public Criteria andReadteacherscoreLike(String value) {
            addCriterion("readTeacherScore like", value, "readteacherscore");
            return (Criteria) this;
        }

        public Criteria andReadteacherscoreNotLike(String value) {
            addCriterion("readTeacherScore not like", value, "readteacherscore");
            return (Criteria) this;
        }

        public Criteria andReadteacherscoreIn(List<String> values) {
            addCriterion("readTeacherScore in", values, "readteacherscore");
            return (Criteria) this;
        }

        public Criteria andReadteacherscoreNotIn(List<String> values) {
            addCriterion("readTeacherScore not in", values, "readteacherscore");
            return (Criteria) this;
        }

        public Criteria andReadteacherscoreBetween(String value1, String value2) {
            addCriterion("readTeacherScore between", value1, value2, "readteacherscore");
            return (Criteria) this;
        }

        public Criteria andReadteacherscoreNotBetween(String value1, String value2) {
            addCriterion("readTeacherScore not between", value1, value2, "readteacherscore");
            return (Criteria) this;
        }

        public Criteria andPlearesultscoreIsNull() {
            addCriterion("pleaResultScore is null");
            return (Criteria) this;
        }

        public Criteria andPlearesultscoreIsNotNull() {
            addCriterion("pleaResultScore is not null");
            return (Criteria) this;
        }

        public Criteria andPlearesultscoreEqualTo(Float value) {
            addCriterion("pleaResultScore =", value, "plearesultscore");
            return (Criteria) this;
        }

        public Criteria andPlearesultscoreNotEqualTo(Float value) {
            addCriterion("pleaResultScore <>", value, "plearesultscore");
            return (Criteria) this;
        }

        public Criteria andPlearesultscoreGreaterThan(Float value) {
            addCriterion("pleaResultScore >", value, "plearesultscore");
            return (Criteria) this;
        }

        public Criteria andPlearesultscoreGreaterThanOrEqualTo(Float value) {
            addCriterion("pleaResultScore >=", value, "plearesultscore");
            return (Criteria) this;
        }

        public Criteria andPlearesultscoreLessThan(Float value) {
            addCriterion("pleaResultScore <", value, "plearesultscore");
            return (Criteria) this;
        }

        public Criteria andPlearesultscoreLessThanOrEqualTo(Float value) {
            addCriterion("pleaResultScore <=", value, "plearesultscore");
            return (Criteria) this;
        }

        public Criteria andPlearesultscoreIn(List<Float> values) {
            addCriterion("pleaResultScore in", values, "plearesultscore");
            return (Criteria) this;
        }

        public Criteria andPlearesultscoreNotIn(List<Float> values) {
            addCriterion("pleaResultScore not in", values, "plearesultscore");
            return (Criteria) this;
        }

        public Criteria andPlearesultscoreBetween(Float value1, Float value2) {
            addCriterion("pleaResultScore between", value1, value2, "plearesultscore");
            return (Criteria) this;
        }

        public Criteria andPlearesultscoreNotBetween(Float value1, Float value2) {
            addCriterion("pleaResultScore not between", value1, value2, "plearesultscore");
            return (Criteria) this;
        }

        public Criteria andFinallyscoreIsNull() {
            addCriterion("finallyScore is null");
            return (Criteria) this;
        }

        public Criteria andFinallyscoreIsNotNull() {
            addCriterion("finallyScore is not null");
            return (Criteria) this;
        }

        public Criteria andFinallyscoreEqualTo(Float value) {
            addCriterion("finallyScore =", value, "finallyscore");
            return (Criteria) this;
        }

        public Criteria andFinallyscoreNotEqualTo(Float value) {
            addCriterion("finallyScore <>", value, "finallyscore");
            return (Criteria) this;
        }

        public Criteria andFinallyscoreGreaterThan(Float value) {
            addCriterion("finallyScore >", value, "finallyscore");
            return (Criteria) this;
        }

        public Criteria andFinallyscoreGreaterThanOrEqualTo(Float value) {
            addCriterion("finallyScore >=", value, "finallyscore");
            return (Criteria) this;
        }

        public Criteria andFinallyscoreLessThan(Float value) {
            addCriterion("finallyScore <", value, "finallyscore");
            return (Criteria) this;
        }

        public Criteria andFinallyscoreLessThanOrEqualTo(Float value) {
            addCriterion("finallyScore <=", value, "finallyscore");
            return (Criteria) this;
        }

        public Criteria andFinallyscoreIn(List<Float> values) {
            addCriterion("finallyScore in", values, "finallyscore");
            return (Criteria) this;
        }

        public Criteria andFinallyscoreNotIn(List<Float> values) {
            addCriterion("finallyScore not in", values, "finallyscore");
            return (Criteria) this;
        }

        public Criteria andFinallyscoreBetween(Float value1, Float value2) {
            addCriterion("finallyScore between", value1, value2, "finallyscore");
            return (Criteria) this;
        }

        public Criteria andFinallyscoreNotBetween(Float value1, Float value2) {
            addCriterion("finallyScore not between", value1, value2, "finallyscore");
            return (Criteria) this;
        }

        public Criteria andPleamainmatterIsNull() {
            addCriterion("pleaMainMatter is null");
            return (Criteria) this;
        }

        public Criteria andPleamainmatterIsNotNull() {
            addCriterion("pleaMainMatter is not null");
            return (Criteria) this;
        }

        public Criteria andPleamainmatterEqualTo(String value) {
            addCriterion("pleaMainMatter =", value, "pleamainmatter");
            return (Criteria) this;
        }

        public Criteria andPleamainmatterNotEqualTo(String value) {
            addCriterion("pleaMainMatter <>", value, "pleamainmatter");
            return (Criteria) this;
        }

        public Criteria andPleamainmatterGreaterThan(String value) {
            addCriterion("pleaMainMatter >", value, "pleamainmatter");
            return (Criteria) this;
        }

        public Criteria andPleamainmatterGreaterThanOrEqualTo(String value) {
            addCriterion("pleaMainMatter >=", value, "pleamainmatter");
            return (Criteria) this;
        }

        public Criteria andPleamainmatterLessThan(String value) {
            addCriterion("pleaMainMatter <", value, "pleamainmatter");
            return (Criteria) this;
        }

        public Criteria andPleamainmatterLessThanOrEqualTo(String value) {
            addCriterion("pleaMainMatter <=", value, "pleamainmatter");
            return (Criteria) this;
        }

        public Criteria andPleamainmatterLike(String value) {
            addCriterion("pleaMainMatter like", value, "pleamainmatter");
            return (Criteria) this;
        }

        public Criteria andPleamainmatterNotLike(String value) {
            addCriterion("pleaMainMatter not like", value, "pleamainmatter");
            return (Criteria) this;
        }

        public Criteria andPleamainmatterIn(List<String> values) {
            addCriterion("pleaMainMatter in", values, "pleamainmatter");
            return (Criteria) this;
        }

        public Criteria andPleamainmatterNotIn(List<String> values) {
            addCriterion("pleaMainMatter not in", values, "pleamainmatter");
            return (Criteria) this;
        }

        public Criteria andPleamainmatterBetween(String value1, String value2) {
            addCriterion("pleaMainMatter between", value1, value2, "pleamainmatter");
            return (Criteria) this;
        }

        public Criteria andPleamainmatterNotBetween(String value1, String value2) {
            addCriterion("pleaMainMatter not between", value1, value2, "pleamainmatter");
            return (Criteria) this;
        }

        public Criteria andCommitteeadviceIsNull() {
            addCriterion("committeeAdvice is null");
            return (Criteria) this;
        }

        public Criteria andCommitteeadviceIsNotNull() {
            addCriterion("committeeAdvice is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteeadviceEqualTo(String value) {
            addCriterion("committeeAdvice =", value, "committeeadvice");
            return (Criteria) this;
        }

        public Criteria andCommitteeadviceNotEqualTo(String value) {
            addCriterion("committeeAdvice <>", value, "committeeadvice");
            return (Criteria) this;
        }

        public Criteria andCommitteeadviceGreaterThan(String value) {
            addCriterion("committeeAdvice >", value, "committeeadvice");
            return (Criteria) this;
        }

        public Criteria andCommitteeadviceGreaterThanOrEqualTo(String value) {
            addCriterion("committeeAdvice >=", value, "committeeadvice");
            return (Criteria) this;
        }

        public Criteria andCommitteeadviceLessThan(String value) {
            addCriterion("committeeAdvice <", value, "committeeadvice");
            return (Criteria) this;
        }

        public Criteria andCommitteeadviceLessThanOrEqualTo(String value) {
            addCriterion("committeeAdvice <=", value, "committeeadvice");
            return (Criteria) this;
        }

        public Criteria andCommitteeadviceLike(String value) {
            addCriterion("committeeAdvice like", value, "committeeadvice");
            return (Criteria) this;
        }

        public Criteria andCommitteeadviceNotLike(String value) {
            addCriterion("committeeAdvice not like", value, "committeeadvice");
            return (Criteria) this;
        }

        public Criteria andCommitteeadviceIn(List<String> values) {
            addCriterion("committeeAdvice in", values, "committeeadvice");
            return (Criteria) this;
        }

        public Criteria andCommitteeadviceNotIn(List<String> values) {
            addCriterion("committeeAdvice not in", values, "committeeadvice");
            return (Criteria) this;
        }

        public Criteria andCommitteeadviceBetween(String value1, String value2) {
            addCriterion("committeeAdvice between", value1, value2, "committeeadvice");
            return (Criteria) this;
        }

        public Criteria andCommitteeadviceNotBetween(String value1, String value2) {
            addCriterion("committeeAdvice not between", value1, value2, "committeeadvice");
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