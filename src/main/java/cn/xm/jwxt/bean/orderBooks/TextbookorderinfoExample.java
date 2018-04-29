package cn.xm.jwxt.bean.orderBooks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TextbookorderinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TextbookorderinfoExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrdernameIsNull() {
            addCriterion("orderName is null");
            return (Criteria) this;
        }

        public Criteria andOrdernameIsNotNull() {
            addCriterion("orderName is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernameEqualTo(String value) {
            addCriterion("orderName =", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameNotEqualTo(String value) {
            addCriterion("orderName <>", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameGreaterThan(String value) {
            addCriterion("orderName >", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameGreaterThanOrEqualTo(String value) {
            addCriterion("orderName >=", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameLessThan(String value) {
            addCriterion("orderName <", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameLessThanOrEqualTo(String value) {
            addCriterion("orderName <=", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameLike(String value) {
            addCriterion("orderName like", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameNotLike(String value) {
            addCriterion("orderName not like", value, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameIn(List<String> values) {
            addCriterion("orderName in", values, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameNotIn(List<String> values) {
            addCriterion("orderName not in", values, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameBetween(String value1, String value2) {
            addCriterion("orderName between", value1, value2, "ordername");
            return (Criteria) this;
        }

        public Criteria andOrdernameNotBetween(String value1, String value2) {
            addCriterion("orderName not between", value1, value2, "ordername");
            return (Criteria) this;
        }

        public Criteria andRoomnameIsNull() {
            addCriterion("roomName is null");
            return (Criteria) this;
        }

        public Criteria andRoomnameIsNotNull() {
            addCriterion("roomName is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnameEqualTo(String value) {
            addCriterion("roomName =", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotEqualTo(String value) {
            addCriterion("roomName <>", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameGreaterThan(String value) {
            addCriterion("roomName >", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameGreaterThanOrEqualTo(String value) {
            addCriterion("roomName >=", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameLessThan(String value) {
            addCriterion("roomName <", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameLessThanOrEqualTo(String value) {
            addCriterion("roomName <=", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameLike(String value) {
            addCriterion("roomName like", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotLike(String value) {
            addCriterion("roomName not like", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameIn(List<String> values) {
            addCriterion("roomName in", values, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotIn(List<String> values) {
            addCriterion("roomName not in", values, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameBetween(String value1, String value2) {
            addCriterion("roomName between", value1, value2, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotBetween(String value1, String value2) {
            addCriterion("roomName not between", value1, value2, "roomname");
            return (Criteria) this;
        }

        public Criteria andCreatepersonIsNull() {
            addCriterion("createPerson is null");
            return (Criteria) this;
        }

        public Criteria andCreatepersonIsNotNull() {
            addCriterion("createPerson is not null");
            return (Criteria) this;
        }

        public Criteria andCreatepersonEqualTo(String value) {
            addCriterion("createPerson =", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotEqualTo(String value) {
            addCriterion("createPerson <>", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonGreaterThan(String value) {
            addCriterion("createPerson >", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonGreaterThanOrEqualTo(String value) {
            addCriterion("createPerson >=", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonLessThan(String value) {
            addCriterion("createPerson <", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonLessThanOrEqualTo(String value) {
            addCriterion("createPerson <=", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonLike(String value) {
            addCriterion("createPerson like", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotLike(String value) {
            addCriterion("createPerson not like", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonIn(List<String> values) {
            addCriterion("createPerson in", values, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotIn(List<String> values) {
            addCriterion("createPerson not in", values, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonBetween(String value1, String value2) {
            addCriterion("createPerson between", value1, value2, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotBetween(String value1, String value2) {
            addCriterion("createPerson not between", value1, value2, "createperson");
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
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andYearnumIsNull() {
            addCriterion("yearNum is null");
            return (Criteria) this;
        }

        public Criteria andYearnumIsNotNull() {
            addCriterion("yearNum is not null");
            return (Criteria) this;
        }

        public Criteria andYearnumEqualTo(String value) {
            addCriterion("yearNum =", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumNotEqualTo(String value) {
            addCriterion("yearNum <>", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumGreaterThan(String value) {
            addCriterion("yearNum >", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumGreaterThanOrEqualTo(String value) {
            addCriterion("yearNum >=", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumLessThan(String value) {
            addCriterion("yearNum <", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumLessThanOrEqualTo(String value) {
            addCriterion("yearNum <=", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumLike(String value) {
            addCriterion("yearNum like", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumNotLike(String value) {
            addCriterion("yearNum not like", value, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumIn(List<String> values) {
            addCriterion("yearNum in", values, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumNotIn(List<String> values) {
            addCriterion("yearNum not in", values, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumBetween(String value1, String value2) {
            addCriterion("yearNum between", value1, value2, "yearnum");
            return (Criteria) this;
        }

        public Criteria andYearnumNotBetween(String value1, String value2) {
            addCriterion("yearNum not between", value1, value2, "yearnum");
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

        public Criteria andSemesterEqualTo(String value) {
            addCriterion("semester =", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotEqualTo(String value) {
            addCriterion("semester <>", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterGreaterThan(String value) {
            addCriterion("semester >", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterGreaterThanOrEqualTo(String value) {
            addCriterion("semester >=", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterLessThan(String value) {
            addCriterion("semester <", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterLessThanOrEqualTo(String value) {
            addCriterion("semester <=", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterLike(String value) {
            addCriterion("semester like", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotLike(String value) {
            addCriterion("semester not like", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterIn(List<String> values) {
            addCriterion("semester in", values, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotIn(List<String> values) {
            addCriterion("semester not in", values, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterBetween(String value1, String value2) {
            addCriterion("semester between", value1, value2, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotBetween(String value1, String value2) {
            addCriterion("semester not between", value1, value2, "semester");
            return (Criteria) this;
        }

        public Criteria andIsorderIsNull() {
            addCriterion("isOrder is null");
            return (Criteria) this;
        }

        public Criteria andIsorderIsNotNull() {
            addCriterion("isOrder is not null");
            return (Criteria) this;
        }

        public Criteria andIsorderEqualTo(String value) {
            addCriterion("isOrder =", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderNotEqualTo(String value) {
            addCriterion("isOrder <>", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderGreaterThan(String value) {
            addCriterion("isOrder >", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderGreaterThanOrEqualTo(String value) {
            addCriterion("isOrder >=", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderLessThan(String value) {
            addCriterion("isOrder <", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderLessThanOrEqualTo(String value) {
            addCriterion("isOrder <=", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderLike(String value) {
            addCriterion("isOrder like", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderNotLike(String value) {
            addCriterion("isOrder not like", value, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderIn(List<String> values) {
            addCriterion("isOrder in", values, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderNotIn(List<String> values) {
            addCriterion("isOrder not in", values, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderBetween(String value1, String value2) {
            addCriterion("isOrder between", value1, value2, "isorder");
            return (Criteria) this;
        }

        public Criteria andIsorderNotBetween(String value1, String value2) {
            addCriterion("isOrder not between", value1, value2, "isorder");
            return (Criteria) this;
        }

        public Criteria andIscheckIsNull() {
            addCriterion("isCheck is null");
            return (Criteria) this;
        }

        public Criteria andIscheckIsNotNull() {
            addCriterion("isCheck is not null");
            return (Criteria) this;
        }

        public Criteria andIscheckEqualTo(String value) {
            addCriterion("isCheck =", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotEqualTo(String value) {
            addCriterion("isCheck <>", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckGreaterThan(String value) {
            addCriterion("isCheck >", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckGreaterThanOrEqualTo(String value) {
            addCriterion("isCheck >=", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLessThan(String value) {
            addCriterion("isCheck <", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLessThanOrEqualTo(String value) {
            addCriterion("isCheck <=", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLike(String value) {
            addCriterion("isCheck like", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotLike(String value) {
            addCriterion("isCheck not like", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckIn(List<String> values) {
            addCriterion("isCheck in", values, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotIn(List<String> values) {
            addCriterion("isCheck not in", values, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckBetween(String value1, String value2) {
            addCriterion("isCheck between", value1, value2, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotBetween(String value1, String value2) {
            addCriterion("isCheck not between", value1, value2, "ischeck");
            return (Criteria) this;
        }

        public Criteria andCheckproposalIsNull() {
            addCriterion("checkProposal is null");
            return (Criteria) this;
        }

        public Criteria andCheckproposalIsNotNull() {
            addCriterion("checkProposal is not null");
            return (Criteria) this;
        }

        public Criteria andCheckproposalEqualTo(String value) {
            addCriterion("checkProposal =", value, "checkproposal");
            return (Criteria) this;
        }

        public Criteria andCheckproposalNotEqualTo(String value) {
            addCriterion("checkProposal <>", value, "checkproposal");
            return (Criteria) this;
        }

        public Criteria andCheckproposalGreaterThan(String value) {
            addCriterion("checkProposal >", value, "checkproposal");
            return (Criteria) this;
        }

        public Criteria andCheckproposalGreaterThanOrEqualTo(String value) {
            addCriterion("checkProposal >=", value, "checkproposal");
            return (Criteria) this;
        }

        public Criteria andCheckproposalLessThan(String value) {
            addCriterion("checkProposal <", value, "checkproposal");
            return (Criteria) this;
        }

        public Criteria andCheckproposalLessThanOrEqualTo(String value) {
            addCriterion("checkProposal <=", value, "checkproposal");
            return (Criteria) this;
        }

        public Criteria andCheckproposalLike(String value) {
            addCriterion("checkProposal like", value, "checkproposal");
            return (Criteria) this;
        }

        public Criteria andCheckproposalNotLike(String value) {
            addCriterion("checkProposal not like", value, "checkproposal");
            return (Criteria) this;
        }

        public Criteria andCheckproposalIn(List<String> values) {
            addCriterion("checkProposal in", values, "checkproposal");
            return (Criteria) this;
        }

        public Criteria andCheckproposalNotIn(List<String> values) {
            addCriterion("checkProposal not in", values, "checkproposal");
            return (Criteria) this;
        }

        public Criteria andCheckproposalBetween(String value1, String value2) {
            addCriterion("checkProposal between", value1, value2, "checkproposal");
            return (Criteria) this;
        }

        public Criteria andCheckproposalNotBetween(String value1, String value2) {
            addCriterion("checkProposal not between", value1, value2, "checkproposal");
            return (Criteria) this;
        }

        public Criteria andProposalnoteIsNull() {
            addCriterion("proposalNote is null");
            return (Criteria) this;
        }

        public Criteria andProposalnoteIsNotNull() {
            addCriterion("proposalNote is not null");
            return (Criteria) this;
        }

        public Criteria andProposalnoteEqualTo(String value) {
            addCriterion("proposalNote =", value, "proposalnote");
            return (Criteria) this;
        }

        public Criteria andProposalnoteNotEqualTo(String value) {
            addCriterion("proposalNote <>", value, "proposalnote");
            return (Criteria) this;
        }

        public Criteria andProposalnoteGreaterThan(String value) {
            addCriterion("proposalNote >", value, "proposalnote");
            return (Criteria) this;
        }

        public Criteria andProposalnoteGreaterThanOrEqualTo(String value) {
            addCriterion("proposalNote >=", value, "proposalnote");
            return (Criteria) this;
        }

        public Criteria andProposalnoteLessThan(String value) {
            addCriterion("proposalNote <", value, "proposalnote");
            return (Criteria) this;
        }

        public Criteria andProposalnoteLessThanOrEqualTo(String value) {
            addCriterion("proposalNote <=", value, "proposalnote");
            return (Criteria) this;
        }

        public Criteria andProposalnoteLike(String value) {
            addCriterion("proposalNote like", value, "proposalnote");
            return (Criteria) this;
        }

        public Criteria andProposalnoteNotLike(String value) {
            addCriterion("proposalNote not like", value, "proposalnote");
            return (Criteria) this;
        }

        public Criteria andProposalnoteIn(List<String> values) {
            addCriterion("proposalNote in", values, "proposalnote");
            return (Criteria) this;
        }

        public Criteria andProposalnoteNotIn(List<String> values) {
            addCriterion("proposalNote not in", values, "proposalnote");
            return (Criteria) this;
        }

        public Criteria andProposalnoteBetween(String value1, String value2) {
            addCriterion("proposalNote between", value1, value2, "proposalnote");
            return (Criteria) this;
        }

        public Criteria andProposalnoteNotBetween(String value1, String value2) {
            addCriterion("proposalNote not between", value1, value2, "proposalnote");
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