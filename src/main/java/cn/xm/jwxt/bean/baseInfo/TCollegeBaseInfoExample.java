package cn.xm.jwxt.bean.baseInfo;

import java.util.ArrayList;
import java.util.List;

public class TCollegeBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCollegeBaseInfoExample() {
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

        public Criteria andCollegeidIsNull() {
            addCriterion("collegeId is null");
            return (Criteria) this;
        }

        public Criteria andCollegeidIsNotNull() {
            addCriterion("collegeId is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeidEqualTo(String value) {
            addCriterion("collegeId =", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotEqualTo(String value) {
            addCriterion("collegeId <>", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidGreaterThan(String value) {
            addCriterion("collegeId >", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidGreaterThanOrEqualTo(String value) {
            addCriterion("collegeId >=", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidLessThan(String value) {
            addCriterion("collegeId <", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidLessThanOrEqualTo(String value) {
            addCriterion("collegeId <=", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidLike(String value) {
            addCriterion("collegeId like", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotLike(String value) {
            addCriterion("collegeId not like", value, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidIn(List<String> values) {
            addCriterion("collegeId in", values, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotIn(List<String> values) {
            addCriterion("collegeId not in", values, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidBetween(String value1, String value2) {
            addCriterion("collegeId between", value1, value2, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegeidNotBetween(String value1, String value2) {
            addCriterion("collegeId not between", value1, value2, "collegeid");
            return (Criteria) this;
        }

        public Criteria andCollegenumIsNull() {
            addCriterion("collegeNum is null");
            return (Criteria) this;
        }

        public Criteria andCollegenumIsNotNull() {
            addCriterion("collegeNum is not null");
            return (Criteria) this;
        }

        public Criteria andCollegenumEqualTo(String value) {
            addCriterion("collegeNum =", value, "collegenum");
            return (Criteria) this;
        }

        public Criteria andCollegenumNotEqualTo(String value) {
            addCriterion("collegeNum <>", value, "collegenum");
            return (Criteria) this;
        }

        public Criteria andCollegenumGreaterThan(String value) {
            addCriterion("collegeNum >", value, "collegenum");
            return (Criteria) this;
        }

        public Criteria andCollegenumGreaterThanOrEqualTo(String value) {
            addCriterion("collegeNum >=", value, "collegenum");
            return (Criteria) this;
        }

        public Criteria andCollegenumLessThan(String value) {
            addCriterion("collegeNum <", value, "collegenum");
            return (Criteria) this;
        }

        public Criteria andCollegenumLessThanOrEqualTo(String value) {
            addCriterion("collegeNum <=", value, "collegenum");
            return (Criteria) this;
        }

        public Criteria andCollegenumLike(String value) {
            addCriterion("collegeNum like", value, "collegenum");
            return (Criteria) this;
        }

        public Criteria andCollegenumNotLike(String value) {
            addCriterion("collegeNum not like", value, "collegenum");
            return (Criteria) this;
        }

        public Criteria andCollegenumIn(List<String> values) {
            addCriterion("collegeNum in", values, "collegenum");
            return (Criteria) this;
        }

        public Criteria andCollegenumNotIn(List<String> values) {
            addCriterion("collegeNum not in", values, "collegenum");
            return (Criteria) this;
        }

        public Criteria andCollegenumBetween(String value1, String value2) {
            addCriterion("collegeNum between", value1, value2, "collegenum");
            return (Criteria) this;
        }

        public Criteria andCollegenumNotBetween(String value1, String value2) {
            addCriterion("collegeNum not between", value1, value2, "collegenum");
            return (Criteria) this;
        }

        public Criteria andCollegenameIsNull() {
            addCriterion("collegeName is null");
            return (Criteria) this;
        }

        public Criteria andCollegenameIsNotNull() {
            addCriterion("collegeName is not null");
            return (Criteria) this;
        }

        public Criteria andCollegenameEqualTo(String value) {
            addCriterion("collegeName =", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameNotEqualTo(String value) {
            addCriterion("collegeName <>", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameGreaterThan(String value) {
            addCriterion("collegeName >", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameGreaterThanOrEqualTo(String value) {
            addCriterion("collegeName >=", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameLessThan(String value) {
            addCriterion("collegeName <", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameLessThanOrEqualTo(String value) {
            addCriterion("collegeName <=", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameLike(String value) {
            addCriterion("collegeName like", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameNotLike(String value) {
            addCriterion("collegeName not like", value, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameIn(List<String> values) {
            addCriterion("collegeName in", values, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameNotIn(List<String> values) {
            addCriterion("collegeName not in", values, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameBetween(String value1, String value2) {
            addCriterion("collegeName between", value1, value2, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegenameNotBetween(String value1, String value2) {
            addCriterion("collegeName not between", value1, value2, "collegename");
            return (Criteria) this;
        }

        public Criteria andCollegeshortnameIsNull() {
            addCriterion("collegeShortName is null");
            return (Criteria) this;
        }

        public Criteria andCollegeshortnameIsNotNull() {
            addCriterion("collegeShortName is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeshortnameEqualTo(String value) {
            addCriterion("collegeShortName =", value, "collegeshortname");
            return (Criteria) this;
        }

        public Criteria andCollegeshortnameNotEqualTo(String value) {
            addCriterion("collegeShortName <>", value, "collegeshortname");
            return (Criteria) this;
        }

        public Criteria andCollegeshortnameGreaterThan(String value) {
            addCriterion("collegeShortName >", value, "collegeshortname");
            return (Criteria) this;
        }

        public Criteria andCollegeshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("collegeShortName >=", value, "collegeshortname");
            return (Criteria) this;
        }

        public Criteria andCollegeshortnameLessThan(String value) {
            addCriterion("collegeShortName <", value, "collegeshortname");
            return (Criteria) this;
        }

        public Criteria andCollegeshortnameLessThanOrEqualTo(String value) {
            addCriterion("collegeShortName <=", value, "collegeshortname");
            return (Criteria) this;
        }

        public Criteria andCollegeshortnameLike(String value) {
            addCriterion("collegeShortName like", value, "collegeshortname");
            return (Criteria) this;
        }

        public Criteria andCollegeshortnameNotLike(String value) {
            addCriterion("collegeShortName not like", value, "collegeshortname");
            return (Criteria) this;
        }

        public Criteria andCollegeshortnameIn(List<String> values) {
            addCriterion("collegeShortName in", values, "collegeshortname");
            return (Criteria) this;
        }

        public Criteria andCollegeshortnameNotIn(List<String> values) {
            addCriterion("collegeShortName not in", values, "collegeshortname");
            return (Criteria) this;
        }

        public Criteria andCollegeshortnameBetween(String value1, String value2) {
            addCriterion("collegeShortName between", value1, value2, "collegeshortname");
            return (Criteria) this;
        }

        public Criteria andCollegeshortnameNotBetween(String value1, String value2) {
            addCriterion("collegeShortName not between", value1, value2, "collegeshortname");
            return (Criteria) this;
        }

        public Criteria andCollegeintroductionIsNull() {
            addCriterion("collegeIntroduction is null");
            return (Criteria) this;
        }

        public Criteria andCollegeintroductionIsNotNull() {
            addCriterion("collegeIntroduction is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeintroductionEqualTo(String value) {
            addCriterion("collegeIntroduction =", value, "collegeintroduction");
            return (Criteria) this;
        }

        public Criteria andCollegeintroductionNotEqualTo(String value) {
            addCriterion("collegeIntroduction <>", value, "collegeintroduction");
            return (Criteria) this;
        }

        public Criteria andCollegeintroductionGreaterThan(String value) {
            addCriterion("collegeIntroduction >", value, "collegeintroduction");
            return (Criteria) this;
        }

        public Criteria andCollegeintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("collegeIntroduction >=", value, "collegeintroduction");
            return (Criteria) this;
        }

        public Criteria andCollegeintroductionLessThan(String value) {
            addCriterion("collegeIntroduction <", value, "collegeintroduction");
            return (Criteria) this;
        }

        public Criteria andCollegeintroductionLessThanOrEqualTo(String value) {
            addCriterion("collegeIntroduction <=", value, "collegeintroduction");
            return (Criteria) this;
        }

        public Criteria andCollegeintroductionLike(String value) {
            addCriterion("collegeIntroduction like", value, "collegeintroduction");
            return (Criteria) this;
        }

        public Criteria andCollegeintroductionNotLike(String value) {
            addCriterion("collegeIntroduction not like", value, "collegeintroduction");
            return (Criteria) this;
        }

        public Criteria andCollegeintroductionIn(List<String> values) {
            addCriterion("collegeIntroduction in", values, "collegeintroduction");
            return (Criteria) this;
        }

        public Criteria andCollegeintroductionNotIn(List<String> values) {
            addCriterion("collegeIntroduction not in", values, "collegeintroduction");
            return (Criteria) this;
        }

        public Criteria andCollegeintroductionBetween(String value1, String value2) {
            addCriterion("collegeIntroduction between", value1, value2, "collegeintroduction");
            return (Criteria) this;
        }

        public Criteria andCollegeintroductionNotBetween(String value1, String value2) {
            addCriterion("collegeIntroduction not between", value1, value2, "collegeintroduction");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentIsNull() {
            addCriterion("collegePresident is null");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentIsNotNull() {
            addCriterion("collegePresident is not null");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentEqualTo(String value) {
            addCriterion("collegePresident =", value, "collegepresident");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentNotEqualTo(String value) {
            addCriterion("collegePresident <>", value, "collegepresident");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentGreaterThan(String value) {
            addCriterion("collegePresident >", value, "collegepresident");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentGreaterThanOrEqualTo(String value) {
            addCriterion("collegePresident >=", value, "collegepresident");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentLessThan(String value) {
            addCriterion("collegePresident <", value, "collegepresident");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentLessThanOrEqualTo(String value) {
            addCriterion("collegePresident <=", value, "collegepresident");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentLike(String value) {
            addCriterion("collegePresident like", value, "collegepresident");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentNotLike(String value) {
            addCriterion("collegePresident not like", value, "collegepresident");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentIn(List<String> values) {
            addCriterion("collegePresident in", values, "collegepresident");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentNotIn(List<String> values) {
            addCriterion("collegePresident not in", values, "collegepresident");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentBetween(String value1, String value2) {
            addCriterion("collegePresident between", value1, value2, "collegepresident");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentNotBetween(String value1, String value2) {
            addCriterion("collegePresident not between", value1, value2, "collegepresident");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentfIsNull() {
            addCriterion("collegePresidentF is null");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentfIsNotNull() {
            addCriterion("collegePresidentF is not null");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentfEqualTo(String value) {
            addCriterion("collegePresidentF =", value, "collegepresidentf");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentfNotEqualTo(String value) {
            addCriterion("collegePresidentF <>", value, "collegepresidentf");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentfGreaterThan(String value) {
            addCriterion("collegePresidentF >", value, "collegepresidentf");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentfGreaterThanOrEqualTo(String value) {
            addCriterion("collegePresidentF >=", value, "collegepresidentf");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentfLessThan(String value) {
            addCriterion("collegePresidentF <", value, "collegepresidentf");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentfLessThanOrEqualTo(String value) {
            addCriterion("collegePresidentF <=", value, "collegepresidentf");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentfLike(String value) {
            addCriterion("collegePresidentF like", value, "collegepresidentf");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentfNotLike(String value) {
            addCriterion("collegePresidentF not like", value, "collegepresidentf");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentfIn(List<String> values) {
            addCriterion("collegePresidentF in", values, "collegepresidentf");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentfNotIn(List<String> values) {
            addCriterion("collegePresidentF not in", values, "collegepresidentf");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentfBetween(String value1, String value2) {
            addCriterion("collegePresidentF between", value1, value2, "collegepresidentf");
            return (Criteria) this;
        }

        public Criteria andCollegepresidentfNotBetween(String value1, String value2) {
            addCriterion("collegePresidentF not between", value1, value2, "collegepresidentf");
            return (Criteria) this;
        }

        public Criteria andUpcollegenumIsNull() {
            addCriterion("upCollegeNum is null");
            return (Criteria) this;
        }

        public Criteria andUpcollegenumIsNotNull() {
            addCriterion("upCollegeNum is not null");
            return (Criteria) this;
        }

        public Criteria andUpcollegenumEqualTo(String value) {
            addCriterion("upCollegeNum =", value, "upcollegenum");
            return (Criteria) this;
        }

        public Criteria andUpcollegenumNotEqualTo(String value) {
            addCriterion("upCollegeNum <>", value, "upcollegenum");
            return (Criteria) this;
        }

        public Criteria andUpcollegenumGreaterThan(String value) {
            addCriterion("upCollegeNum >", value, "upcollegenum");
            return (Criteria) this;
        }

        public Criteria andUpcollegenumGreaterThanOrEqualTo(String value) {
            addCriterion("upCollegeNum >=", value, "upcollegenum");
            return (Criteria) this;
        }

        public Criteria andUpcollegenumLessThan(String value) {
            addCriterion("upCollegeNum <", value, "upcollegenum");
            return (Criteria) this;
        }

        public Criteria andUpcollegenumLessThanOrEqualTo(String value) {
            addCriterion("upCollegeNum <=", value, "upcollegenum");
            return (Criteria) this;
        }

        public Criteria andUpcollegenumLike(String value) {
            addCriterion("upCollegeNum like", value, "upcollegenum");
            return (Criteria) this;
        }

        public Criteria andUpcollegenumNotLike(String value) {
            addCriterion("upCollegeNum not like", value, "upcollegenum");
            return (Criteria) this;
        }

        public Criteria andUpcollegenumIn(List<String> values) {
            addCriterion("upCollegeNum in", values, "upcollegenum");
            return (Criteria) this;
        }

        public Criteria andUpcollegenumNotIn(List<String> values) {
            addCriterion("upCollegeNum not in", values, "upcollegenum");
            return (Criteria) this;
        }

        public Criteria andUpcollegenumBetween(String value1, String value2) {
            addCriterion("upCollegeNum between", value1, value2, "upcollegenum");
            return (Criteria) this;
        }

        public Criteria andUpcollegenumNotBetween(String value1, String value2) {
            addCriterion("upCollegeNum not between", value1, value2, "upcollegenum");
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