package cn.fhjt.weixin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LsUserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LsUserinfoExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andBadgenumberIsNull() {
            addCriterion("badgenumber is null");
            return (Criteria) this;
        }

        public Criteria andBadgenumberIsNotNull() {
            addCriterion("badgenumber is not null");
            return (Criteria) this;
        }

        public Criteria andBadgenumberEqualTo(String value) {
            addCriterion("badgenumber =", value, "badgenumber");
            return (Criteria) this;
        }

        public Criteria andBadgenumberNotEqualTo(String value) {
            addCriterion("badgenumber <>", value, "badgenumber");
            return (Criteria) this;
        }

        public Criteria andBadgenumberGreaterThan(String value) {
            addCriterion("badgenumber >", value, "badgenumber");
            return (Criteria) this;
        }

        public Criteria andBadgenumberGreaterThanOrEqualTo(String value) {
            addCriterion("badgenumber >=", value, "badgenumber");
            return (Criteria) this;
        }

        public Criteria andBadgenumberLessThan(String value) {
            addCriterion("badgenumber <", value, "badgenumber");
            return (Criteria) this;
        }

        public Criteria andBadgenumberLessThanOrEqualTo(String value) {
            addCriterion("badgenumber <=", value, "badgenumber");
            return (Criteria) this;
        }

        public Criteria andBadgenumberLike(String value) {
            addCriterion("badgenumber like", value, "badgenumber");
            return (Criteria) this;
        }

        public Criteria andBadgenumberNotLike(String value) {
            addCriterion("badgenumber not like", value, "badgenumber");
            return (Criteria) this;
        }

        public Criteria andBadgenumberIn(List<String> values) {
            addCriterion("badgenumber in", values, "badgenumber");
            return (Criteria) this;
        }

        public Criteria andBadgenumberNotIn(List<String> values) {
            addCriterion("badgenumber not in", values, "badgenumber");
            return (Criteria) this;
        }

        public Criteria andBadgenumberBetween(String value1, String value2) {
            addCriterion("badgenumber between", value1, value2, "badgenumber");
            return (Criteria) this;
        }

        public Criteria andBadgenumberNotBetween(String value1, String value2) {
            addCriterion("badgenumber not between", value1, value2, "badgenumber");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDefaultdeptidIsNull() {
            addCriterion("defaultdeptid is null");
            return (Criteria) this;
        }

        public Criteria andDefaultdeptidIsNotNull() {
            addCriterion("defaultdeptid is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultdeptidEqualTo(Integer value) {
            addCriterion("defaultdeptid =", value, "defaultdeptid");
            return (Criteria) this;
        }

        public Criteria andDefaultdeptidNotEqualTo(Integer value) {
            addCriterion("defaultdeptid <>", value, "defaultdeptid");
            return (Criteria) this;
        }

        public Criteria andDefaultdeptidGreaterThan(Integer value) {
            addCriterion("defaultdeptid >", value, "defaultdeptid");
            return (Criteria) this;
        }

        public Criteria andDefaultdeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("defaultdeptid >=", value, "defaultdeptid");
            return (Criteria) this;
        }

        public Criteria andDefaultdeptidLessThan(Integer value) {
            addCriterion("defaultdeptid <", value, "defaultdeptid");
            return (Criteria) this;
        }

        public Criteria andDefaultdeptidLessThanOrEqualTo(Integer value) {
            addCriterion("defaultdeptid <=", value, "defaultdeptid");
            return (Criteria) this;
        }

        public Criteria andDefaultdeptidIn(List<Integer> values) {
            addCriterion("defaultdeptid in", values, "defaultdeptid");
            return (Criteria) this;
        }

        public Criteria andDefaultdeptidNotIn(List<Integer> values) {
            addCriterion("defaultdeptid not in", values, "defaultdeptid");
            return (Criteria) this;
        }

        public Criteria andDefaultdeptidBetween(Integer value1, Integer value2) {
            addCriterion("defaultdeptid between", value1, value2, "defaultdeptid");
            return (Criteria) this;
        }

        public Criteria andDefaultdeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("defaultdeptid not between", value1, value2, "defaultdeptid");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andMverifypassIsNull() {
            addCriterion("MVerifyPass is null");
            return (Criteria) this;
        }

        public Criteria andMverifypassIsNotNull() {
            addCriterion("MVerifyPass is not null");
            return (Criteria) this;
        }

        public Criteria andMverifypassEqualTo(String value) {
            addCriterion("MVerifyPass =", value, "mverifypass");
            return (Criteria) this;
        }

        public Criteria andMverifypassNotEqualTo(String value) {
            addCriterion("MVerifyPass <>", value, "mverifypass");
            return (Criteria) this;
        }

        public Criteria andMverifypassGreaterThan(String value) {
            addCriterion("MVerifyPass >", value, "mverifypass");
            return (Criteria) this;
        }

        public Criteria andMverifypassGreaterThanOrEqualTo(String value) {
            addCriterion("MVerifyPass >=", value, "mverifypass");
            return (Criteria) this;
        }

        public Criteria andMverifypassLessThan(String value) {
            addCriterion("MVerifyPass <", value, "mverifypass");
            return (Criteria) this;
        }

        public Criteria andMverifypassLessThanOrEqualTo(String value) {
            addCriterion("MVerifyPass <=", value, "mverifypass");
            return (Criteria) this;
        }

        public Criteria andMverifypassLike(String value) {
            addCriterion("MVerifyPass like", value, "mverifypass");
            return (Criteria) this;
        }

        public Criteria andMverifypassNotLike(String value) {
            addCriterion("MVerifyPass not like", value, "mverifypass");
            return (Criteria) this;
        }

        public Criteria andMverifypassIn(List<String> values) {
            addCriterion("MVerifyPass in", values, "mverifypass");
            return (Criteria) this;
        }

        public Criteria andMverifypassNotIn(List<String> values) {
            addCriterion("MVerifyPass not in", values, "mverifypass");
            return (Criteria) this;
        }

        public Criteria andMverifypassBetween(String value1, String value2) {
            addCriterion("MVerifyPass between", value1, value2, "mverifypass");
            return (Criteria) this;
        }

        public Criteria andMverifypassNotBetween(String value1, String value2) {
            addCriterion("MVerifyPass not between", value1, value2, "mverifypass");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsNull() {
            addCriterion("Privilege is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsNotNull() {
            addCriterion("Privilege is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeEqualTo(Integer value) {
            addCriterion("Privilege =", value, "privilege");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNotEqualTo(Integer value) {
            addCriterion("Privilege <>", value, "privilege");
            return (Criteria) this;
        }

        public Criteria andPrivilegeGreaterThan(Integer value) {
            addCriterion("Privilege >", value, "privilege");
            return (Criteria) this;
        }

        public Criteria andPrivilegeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Privilege >=", value, "privilege");
            return (Criteria) this;
        }

        public Criteria andPrivilegeLessThan(Integer value) {
            addCriterion("Privilege <", value, "privilege");
            return (Criteria) this;
        }

        public Criteria andPrivilegeLessThanOrEqualTo(Integer value) {
            addCriterion("Privilege <=", value, "privilege");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIn(List<Integer> values) {
            addCriterion("Privilege in", values, "privilege");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNotIn(List<Integer> values) {
            addCriterion("Privilege not in", values, "privilege");
            return (Criteria) this;
        }

        public Criteria andPrivilegeBetween(Integer value1, Integer value2) {
            addCriterion("Privilege between", value1, value2, "privilege");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNotBetween(Integer value1, Integer value2) {
            addCriterion("Privilege not between", value1, value2, "privilege");
            return (Criteria) this;
        }

        public Criteria andCardIsNull() {
            addCriterion("Card is null");
            return (Criteria) this;
        }

        public Criteria andCardIsNotNull() {
            addCriterion("Card is not null");
            return (Criteria) this;
        }

        public Criteria andCardEqualTo(String value) {
            addCriterion("Card =", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotEqualTo(String value) {
            addCriterion("Card <>", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThan(String value) {
            addCriterion("Card >", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThanOrEqualTo(String value) {
            addCriterion("Card >=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThan(String value) {
            addCriterion("Card <", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThanOrEqualTo(String value) {
            addCriterion("Card <=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLike(String value) {
            addCriterion("Card like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotLike(String value) {
            addCriterion("Card not like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardIn(List<String> values) {
            addCriterion("Card in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotIn(List<String> values) {
            addCriterion("Card not in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardBetween(String value1, String value2) {
            addCriterion("Card between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotBetween(String value1, String value2) {
            addCriterion("Card not between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andAccgroupIsNull() {
            addCriterion("AccGroup is null");
            return (Criteria) this;
        }

        public Criteria andAccgroupIsNotNull() {
            addCriterion("AccGroup is not null");
            return (Criteria) this;
        }

        public Criteria andAccgroupEqualTo(Integer value) {
            addCriterion("AccGroup =", value, "accgroup");
            return (Criteria) this;
        }

        public Criteria andAccgroupNotEqualTo(Integer value) {
            addCriterion("AccGroup <>", value, "accgroup");
            return (Criteria) this;
        }

        public Criteria andAccgroupGreaterThan(Integer value) {
            addCriterion("AccGroup >", value, "accgroup");
            return (Criteria) this;
        }

        public Criteria andAccgroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccGroup >=", value, "accgroup");
            return (Criteria) this;
        }

        public Criteria andAccgroupLessThan(Integer value) {
            addCriterion("AccGroup <", value, "accgroup");
            return (Criteria) this;
        }

        public Criteria andAccgroupLessThanOrEqualTo(Integer value) {
            addCriterion("AccGroup <=", value, "accgroup");
            return (Criteria) this;
        }

        public Criteria andAccgroupIn(List<Integer> values) {
            addCriterion("AccGroup in", values, "accgroup");
            return (Criteria) this;
        }

        public Criteria andAccgroupNotIn(List<Integer> values) {
            addCriterion("AccGroup not in", values, "accgroup");
            return (Criteria) this;
        }

        public Criteria andAccgroupBetween(Integer value1, Integer value2) {
            addCriterion("AccGroup between", value1, value2, "accgroup");
            return (Criteria) this;
        }

        public Criteria andAccgroupNotBetween(Integer value1, Integer value2) {
            addCriterion("AccGroup not between", value1, value2, "accgroup");
            return (Criteria) this;
        }

        public Criteria andTimezonesIsNull() {
            addCriterion("TimeZones is null");
            return (Criteria) this;
        }

        public Criteria andTimezonesIsNotNull() {
            addCriterion("TimeZones is not null");
            return (Criteria) this;
        }

        public Criteria andTimezonesEqualTo(String value) {
            addCriterion("TimeZones =", value, "timezones");
            return (Criteria) this;
        }

        public Criteria andTimezonesNotEqualTo(String value) {
            addCriterion("TimeZones <>", value, "timezones");
            return (Criteria) this;
        }

        public Criteria andTimezonesGreaterThan(String value) {
            addCriterion("TimeZones >", value, "timezones");
            return (Criteria) this;
        }

        public Criteria andTimezonesGreaterThanOrEqualTo(String value) {
            addCriterion("TimeZones >=", value, "timezones");
            return (Criteria) this;
        }

        public Criteria andTimezonesLessThan(String value) {
            addCriterion("TimeZones <", value, "timezones");
            return (Criteria) this;
        }

        public Criteria andTimezonesLessThanOrEqualTo(String value) {
            addCriterion("TimeZones <=", value, "timezones");
            return (Criteria) this;
        }

        public Criteria andTimezonesLike(String value) {
            addCriterion("TimeZones like", value, "timezones");
            return (Criteria) this;
        }

        public Criteria andTimezonesNotLike(String value) {
            addCriterion("TimeZones not like", value, "timezones");
            return (Criteria) this;
        }

        public Criteria andTimezonesIn(List<String> values) {
            addCriterion("TimeZones in", values, "timezones");
            return (Criteria) this;
        }

        public Criteria andTimezonesNotIn(List<String> values) {
            addCriterion("TimeZones not in", values, "timezones");
            return (Criteria) this;
        }

        public Criteria andTimezonesBetween(String value1, String value2) {
            addCriterion("TimeZones between", value1, value2, "timezones");
            return (Criteria) this;
        }

        public Criteria andTimezonesNotBetween(String value1, String value2) {
            addCriterion("TimeZones not between", value1, value2, "timezones");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("Gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("Gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("Gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("Gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("Gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("Gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("Gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("Gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("Gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("Gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("Gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("Gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("Gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("Gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("Birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("Birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("Birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("Birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("Birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("Birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("Birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("Birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("Birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("Birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("Birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("street is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("street is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("street =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("street <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("street >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("street >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("street <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("street <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("street like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("street not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("street in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("street not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("street between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("street not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andZipIsNull() {
            addCriterion("zip is null");
            return (Criteria) this;
        }

        public Criteria andZipIsNotNull() {
            addCriterion("zip is not null");
            return (Criteria) this;
        }

        public Criteria andZipEqualTo(String value) {
            addCriterion("zip =", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotEqualTo(String value) {
            addCriterion("zip <>", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThan(String value) {
            addCriterion("zip >", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThanOrEqualTo(String value) {
            addCriterion("zip >=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThan(String value) {
            addCriterion("zip <", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThanOrEqualTo(String value) {
            addCriterion("zip <=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLike(String value) {
            addCriterion("zip like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotLike(String value) {
            addCriterion("zip not like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipIn(List<String> values) {
            addCriterion("zip in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotIn(List<String> values) {
            addCriterion("zip not in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipBetween(String value1, String value2) {
            addCriterion("zip between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotBetween(String value1, String value2) {
            addCriterion("zip not between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andOphoneIsNull() {
            addCriterion("ophone is null");
            return (Criteria) this;
        }

        public Criteria andOphoneIsNotNull() {
            addCriterion("ophone is not null");
            return (Criteria) this;
        }

        public Criteria andOphoneEqualTo(String value) {
            addCriterion("ophone =", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotEqualTo(String value) {
            addCriterion("ophone <>", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneGreaterThan(String value) {
            addCriterion("ophone >", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneGreaterThanOrEqualTo(String value) {
            addCriterion("ophone >=", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneLessThan(String value) {
            addCriterion("ophone <", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneLessThanOrEqualTo(String value) {
            addCriterion("ophone <=", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneLike(String value) {
            addCriterion("ophone like", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotLike(String value) {
            addCriterion("ophone not like", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneIn(List<String> values) {
            addCriterion("ophone in", values, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotIn(List<String> values) {
            addCriterion("ophone not in", values, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneBetween(String value1, String value2) {
            addCriterion("ophone between", value1, value2, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotBetween(String value1, String value2) {
            addCriterion("ophone not between", value1, value2, "ophone");
            return (Criteria) this;
        }

        public Criteria andFphoneIsNull() {
            addCriterion("FPHONE is null");
            return (Criteria) this;
        }

        public Criteria andFphoneIsNotNull() {
            addCriterion("FPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andFphoneEqualTo(String value) {
            addCriterion("FPHONE =", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotEqualTo(String value) {
            addCriterion("FPHONE <>", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneGreaterThan(String value) {
            addCriterion("FPHONE >", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneGreaterThanOrEqualTo(String value) {
            addCriterion("FPHONE >=", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneLessThan(String value) {
            addCriterion("FPHONE <", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneLessThanOrEqualTo(String value) {
            addCriterion("FPHONE <=", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneLike(String value) {
            addCriterion("FPHONE like", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotLike(String value) {
            addCriterion("FPHONE not like", value, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneIn(List<String> values) {
            addCriterion("FPHONE in", values, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotIn(List<String> values) {
            addCriterion("FPHONE not in", values, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneBetween(String value1, String value2) {
            addCriterion("FPHONE between", value1, value2, "fphone");
            return (Criteria) this;
        }

        public Criteria andFphoneNotBetween(String value1, String value2) {
            addCriterion("FPHONE not between", value1, value2, "fphone");
            return (Criteria) this;
        }

        public Criteria andPagerIsNull() {
            addCriterion("pager is null");
            return (Criteria) this;
        }

        public Criteria andPagerIsNotNull() {
            addCriterion("pager is not null");
            return (Criteria) this;
        }

        public Criteria andPagerEqualTo(String value) {
            addCriterion("pager =", value, "pager");
            return (Criteria) this;
        }

        public Criteria andPagerNotEqualTo(String value) {
            addCriterion("pager <>", value, "pager");
            return (Criteria) this;
        }

        public Criteria andPagerGreaterThan(String value) {
            addCriterion("pager >", value, "pager");
            return (Criteria) this;
        }

        public Criteria andPagerGreaterThanOrEqualTo(String value) {
            addCriterion("pager >=", value, "pager");
            return (Criteria) this;
        }

        public Criteria andPagerLessThan(String value) {
            addCriterion("pager <", value, "pager");
            return (Criteria) this;
        }

        public Criteria andPagerLessThanOrEqualTo(String value) {
            addCriterion("pager <=", value, "pager");
            return (Criteria) this;
        }

        public Criteria andPagerLike(String value) {
            addCriterion("pager like", value, "pager");
            return (Criteria) this;
        }

        public Criteria andPagerNotLike(String value) {
            addCriterion("pager not like", value, "pager");
            return (Criteria) this;
        }

        public Criteria andPagerIn(List<String> values) {
            addCriterion("pager in", values, "pager");
            return (Criteria) this;
        }

        public Criteria andPagerNotIn(List<String> values) {
            addCriterion("pager not in", values, "pager");
            return (Criteria) this;
        }

        public Criteria andPagerBetween(String value1, String value2) {
            addCriterion("pager between", value1, value2, "pager");
            return (Criteria) this;
        }

        public Criteria andPagerNotBetween(String value1, String value2) {
            addCriterion("pager not between", value1, value2, "pager");
            return (Criteria) this;
        }

        public Criteria andMinzuIsNull() {
            addCriterion("minzu is null");
            return (Criteria) this;
        }

        public Criteria andMinzuIsNotNull() {
            addCriterion("minzu is not null");
            return (Criteria) this;
        }

        public Criteria andMinzuEqualTo(String value) {
            addCriterion("minzu =", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotEqualTo(String value) {
            addCriterion("minzu <>", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuGreaterThan(String value) {
            addCriterion("minzu >", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuGreaterThanOrEqualTo(String value) {
            addCriterion("minzu >=", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLessThan(String value) {
            addCriterion("minzu <", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLessThanOrEqualTo(String value) {
            addCriterion("minzu <=", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuLike(String value) {
            addCriterion("minzu like", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotLike(String value) {
            addCriterion("minzu not like", value, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuIn(List<String> values) {
            addCriterion("minzu in", values, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotIn(List<String> values) {
            addCriterion("minzu not in", values, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuBetween(String value1, String value2) {
            addCriterion("minzu between", value1, value2, "minzu");
            return (Criteria) this;
        }

        public Criteria andMinzuNotBetween(String value1, String value2) {
            addCriterion("minzu not between", value1, value2, "minzu");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("SN is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("SN is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("SN =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("SN <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("SN >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("SN >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("SN <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("SN <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("SN like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("SN not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("SN in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("SN not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("SN between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("SN not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSsnIsNull() {
            addCriterion("SSN is null");
            return (Criteria) this;
        }

        public Criteria andSsnIsNotNull() {
            addCriterion("SSN is not null");
            return (Criteria) this;
        }

        public Criteria andSsnEqualTo(String value) {
            addCriterion("SSN =", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotEqualTo(String value) {
            addCriterion("SSN <>", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnGreaterThan(String value) {
            addCriterion("SSN >", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnGreaterThanOrEqualTo(String value) {
            addCriterion("SSN >=", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnLessThan(String value) {
            addCriterion("SSN <", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnLessThanOrEqualTo(String value) {
            addCriterion("SSN <=", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnLike(String value) {
            addCriterion("SSN like", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotLike(String value) {
            addCriterion("SSN not like", value, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnIn(List<String> values) {
            addCriterion("SSN in", values, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotIn(List<String> values) {
            addCriterion("SSN not in", values, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnBetween(String value1, String value2) {
            addCriterion("SSN between", value1, value2, "ssn");
            return (Criteria) this;
        }

        public Criteria andSsnNotBetween(String value1, String value2) {
            addCriterion("SSN not between", value1, value2, "ssn");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNull() {
            addCriterion("UTime is null");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNotNull() {
            addCriterion("UTime is not null");
            return (Criteria) this;
        }

        public Criteria andUtimeEqualTo(Date value) {
            addCriterion("UTime =", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotEqualTo(Date value) {
            addCriterion("UTime <>", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThan(Date value) {
            addCriterion("UTime >", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UTime >=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThan(Date value) {
            addCriterion("UTime <", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThanOrEqualTo(Date value) {
            addCriterion("UTime <=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeIn(List<Date> values) {
            addCriterion("UTime in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotIn(List<Date> values) {
            addCriterion("UTime not in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeBetween(Date value1, Date value2) {
            addCriterion("UTime between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotBetween(Date value1, Date value2) {
            addCriterion("UTime not between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andHireddayIsNull() {
            addCriterion("Hiredday is null");
            return (Criteria) this;
        }

        public Criteria andHireddayIsNotNull() {
            addCriterion("Hiredday is not null");
            return (Criteria) this;
        }

        public Criteria andHireddayEqualTo(Date value) {
            addCriterion("Hiredday =", value, "hiredday");
            return (Criteria) this;
        }

        public Criteria andHireddayNotEqualTo(Date value) {
            addCriterion("Hiredday <>", value, "hiredday");
            return (Criteria) this;
        }

        public Criteria andHireddayGreaterThan(Date value) {
            addCriterion("Hiredday >", value, "hiredday");
            return (Criteria) this;
        }

        public Criteria andHireddayGreaterThanOrEqualTo(Date value) {
            addCriterion("Hiredday >=", value, "hiredday");
            return (Criteria) this;
        }

        public Criteria andHireddayLessThan(Date value) {
            addCriterion("Hiredday <", value, "hiredday");
            return (Criteria) this;
        }

        public Criteria andHireddayLessThanOrEqualTo(Date value) {
            addCriterion("Hiredday <=", value, "hiredday");
            return (Criteria) this;
        }

        public Criteria andHireddayIn(List<Date> values) {
            addCriterion("Hiredday in", values, "hiredday");
            return (Criteria) this;
        }

        public Criteria andHireddayNotIn(List<Date> values) {
            addCriterion("Hiredday not in", values, "hiredday");
            return (Criteria) this;
        }

        public Criteria andHireddayBetween(Date value1, Date value2) {
            addCriterion("Hiredday between", value1, value2, "hiredday");
            return (Criteria) this;
        }

        public Criteria andHireddayNotBetween(Date value1, Date value2) {
            addCriterion("Hiredday not between", value1, value2, "hiredday");
            return (Criteria) this;
        }

        public Criteria andVerificationmethodIsNull() {
            addCriterion("VERIFICATIONMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andVerificationmethodIsNotNull() {
            addCriterion("VERIFICATIONMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andVerificationmethodEqualTo(Short value) {
            addCriterion("VERIFICATIONMETHOD =", value, "verificationmethod");
            return (Criteria) this;
        }

        public Criteria andVerificationmethodNotEqualTo(Short value) {
            addCriterion("VERIFICATIONMETHOD <>", value, "verificationmethod");
            return (Criteria) this;
        }

        public Criteria andVerificationmethodGreaterThan(Short value) {
            addCriterion("VERIFICATIONMETHOD >", value, "verificationmethod");
            return (Criteria) this;
        }

        public Criteria andVerificationmethodGreaterThanOrEqualTo(Short value) {
            addCriterion("VERIFICATIONMETHOD >=", value, "verificationmethod");
            return (Criteria) this;
        }

        public Criteria andVerificationmethodLessThan(Short value) {
            addCriterion("VERIFICATIONMETHOD <", value, "verificationmethod");
            return (Criteria) this;
        }

        public Criteria andVerificationmethodLessThanOrEqualTo(Short value) {
            addCriterion("VERIFICATIONMETHOD <=", value, "verificationmethod");
            return (Criteria) this;
        }

        public Criteria andVerificationmethodIn(List<Short> values) {
            addCriterion("VERIFICATIONMETHOD in", values, "verificationmethod");
            return (Criteria) this;
        }

        public Criteria andVerificationmethodNotIn(List<Short> values) {
            addCriterion("VERIFICATIONMETHOD not in", values, "verificationmethod");
            return (Criteria) this;
        }

        public Criteria andVerificationmethodBetween(Short value1, Short value2) {
            addCriterion("VERIFICATIONMETHOD between", value1, value2, "verificationmethod");
            return (Criteria) this;
        }

        public Criteria andVerificationmethodNotBetween(Short value1, Short value2) {
            addCriterion("VERIFICATIONMETHOD not between", value1, value2, "verificationmethod");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("State like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("State not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("City is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("City is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("City =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("City <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("City >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("City >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("City <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("City <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("City like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("City not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("City in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("City not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("City between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("City not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andSecurityflagsIsNull() {
            addCriterion("SECURITYFLAGS is null");
            return (Criteria) this;
        }

        public Criteria andSecurityflagsIsNotNull() {
            addCriterion("SECURITYFLAGS is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityflagsEqualTo(Short value) {
            addCriterion("SECURITYFLAGS =", value, "securityflags");
            return (Criteria) this;
        }

        public Criteria andSecurityflagsNotEqualTo(Short value) {
            addCriterion("SECURITYFLAGS <>", value, "securityflags");
            return (Criteria) this;
        }

        public Criteria andSecurityflagsGreaterThan(Short value) {
            addCriterion("SECURITYFLAGS >", value, "securityflags");
            return (Criteria) this;
        }

        public Criteria andSecurityflagsGreaterThanOrEqualTo(Short value) {
            addCriterion("SECURITYFLAGS >=", value, "securityflags");
            return (Criteria) this;
        }

        public Criteria andSecurityflagsLessThan(Short value) {
            addCriterion("SECURITYFLAGS <", value, "securityflags");
            return (Criteria) this;
        }

        public Criteria andSecurityflagsLessThanOrEqualTo(Short value) {
            addCriterion("SECURITYFLAGS <=", value, "securityflags");
            return (Criteria) this;
        }

        public Criteria andSecurityflagsIn(List<Short> values) {
            addCriterion("SECURITYFLAGS in", values, "securityflags");
            return (Criteria) this;
        }

        public Criteria andSecurityflagsNotIn(List<Short> values) {
            addCriterion("SECURITYFLAGS not in", values, "securityflags");
            return (Criteria) this;
        }

        public Criteria andSecurityflagsBetween(Short value1, Short value2) {
            addCriterion("SECURITYFLAGS between", value1, value2, "securityflags");
            return (Criteria) this;
        }

        public Criteria andSecurityflagsNotBetween(Short value1, Short value2) {
            addCriterion("SECURITYFLAGS not between", value1, value2, "securityflags");
            return (Criteria) this;
        }

        public Criteria andAttIsNull() {
            addCriterion("ATT is null");
            return (Criteria) this;
        }

        public Criteria andAttIsNotNull() {
            addCriterion("ATT is not null");
            return (Criteria) this;
        }

        public Criteria andAttEqualTo(Boolean value) {
            addCriterion("ATT =", value, "att");
            return (Criteria) this;
        }

        public Criteria andAttNotEqualTo(Boolean value) {
            addCriterion("ATT <>", value, "att");
            return (Criteria) this;
        }

        public Criteria andAttGreaterThan(Boolean value) {
            addCriterion("ATT >", value, "att");
            return (Criteria) this;
        }

        public Criteria andAttGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ATT >=", value, "att");
            return (Criteria) this;
        }

        public Criteria andAttLessThan(Boolean value) {
            addCriterion("ATT <", value, "att");
            return (Criteria) this;
        }

        public Criteria andAttLessThanOrEqualTo(Boolean value) {
            addCriterion("ATT <=", value, "att");
            return (Criteria) this;
        }

        public Criteria andAttIn(List<Boolean> values) {
            addCriterion("ATT in", values, "att");
            return (Criteria) this;
        }

        public Criteria andAttNotIn(List<Boolean> values) {
            addCriterion("ATT not in", values, "att");
            return (Criteria) this;
        }

        public Criteria andAttBetween(Boolean value1, Boolean value2) {
            addCriterion("ATT between", value1, value2, "att");
            return (Criteria) this;
        }

        public Criteria andAttNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ATT not between", value1, value2, "att");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNull() {
            addCriterion("OverTime is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNotNull() {
            addCriterion("OverTime is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeEqualTo(Boolean value) {
            addCriterion("OverTime =", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotEqualTo(Boolean value) {
            addCriterion("OverTime <>", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThan(Boolean value) {
            addCriterion("OverTime >", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("OverTime >=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThan(Boolean value) {
            addCriterion("OverTime <", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThanOrEqualTo(Boolean value) {
            addCriterion("OverTime <=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn(List<Boolean> values) {
            addCriterion("OverTime in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotIn(List<Boolean> values) {
            addCriterion("OverTime not in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeBetween(Boolean value1, Boolean value2) {
            addCriterion("OverTime between", value1, value2, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("OverTime not between", value1, value2, "overtime");
            return (Criteria) this;
        }

        public Criteria andHolidayIsNull() {
            addCriterion("Holiday is null");
            return (Criteria) this;
        }

        public Criteria andHolidayIsNotNull() {
            addCriterion("Holiday is not null");
            return (Criteria) this;
        }

        public Criteria andHolidayEqualTo(Boolean value) {
            addCriterion("Holiday =", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayNotEqualTo(Boolean value) {
            addCriterion("Holiday <>", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayGreaterThan(Boolean value) {
            addCriterion("Holiday >", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Holiday >=", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayLessThan(Boolean value) {
            addCriterion("Holiday <", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayLessThanOrEqualTo(Boolean value) {
            addCriterion("Holiday <=", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayIn(List<Boolean> values) {
            addCriterion("Holiday in", values, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayNotIn(List<Boolean> values) {
            addCriterion("Holiday not in", values, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayBetween(Boolean value1, Boolean value2) {
            addCriterion("Holiday between", value1, value2, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Holiday not between", value1, value2, "holiday");
            return (Criteria) this;
        }

        public Criteria andInlateIsNull() {
            addCriterion("INLATE is null");
            return (Criteria) this;
        }

        public Criteria andInlateIsNotNull() {
            addCriterion("INLATE is not null");
            return (Criteria) this;
        }

        public Criteria andInlateEqualTo(Short value) {
            addCriterion("INLATE =", value, "inlate");
            return (Criteria) this;
        }

        public Criteria andInlateNotEqualTo(Short value) {
            addCriterion("INLATE <>", value, "inlate");
            return (Criteria) this;
        }

        public Criteria andInlateGreaterThan(Short value) {
            addCriterion("INLATE >", value, "inlate");
            return (Criteria) this;
        }

        public Criteria andInlateGreaterThanOrEqualTo(Short value) {
            addCriterion("INLATE >=", value, "inlate");
            return (Criteria) this;
        }

        public Criteria andInlateLessThan(Short value) {
            addCriterion("INLATE <", value, "inlate");
            return (Criteria) this;
        }

        public Criteria andInlateLessThanOrEqualTo(Short value) {
            addCriterion("INLATE <=", value, "inlate");
            return (Criteria) this;
        }

        public Criteria andInlateIn(List<Short> values) {
            addCriterion("INLATE in", values, "inlate");
            return (Criteria) this;
        }

        public Criteria andInlateNotIn(List<Short> values) {
            addCriterion("INLATE not in", values, "inlate");
            return (Criteria) this;
        }

        public Criteria andInlateBetween(Short value1, Short value2) {
            addCriterion("INLATE between", value1, value2, "inlate");
            return (Criteria) this;
        }

        public Criteria andInlateNotBetween(Short value1, Short value2) {
            addCriterion("INLATE not between", value1, value2, "inlate");
            return (Criteria) this;
        }

        public Criteria andOutearlyIsNull() {
            addCriterion("OutEarly is null");
            return (Criteria) this;
        }

        public Criteria andOutearlyIsNotNull() {
            addCriterion("OutEarly is not null");
            return (Criteria) this;
        }

        public Criteria andOutearlyEqualTo(Short value) {
            addCriterion("OutEarly =", value, "outearly");
            return (Criteria) this;
        }

        public Criteria andOutearlyNotEqualTo(Short value) {
            addCriterion("OutEarly <>", value, "outearly");
            return (Criteria) this;
        }

        public Criteria andOutearlyGreaterThan(Short value) {
            addCriterion("OutEarly >", value, "outearly");
            return (Criteria) this;
        }

        public Criteria andOutearlyGreaterThanOrEqualTo(Short value) {
            addCriterion("OutEarly >=", value, "outearly");
            return (Criteria) this;
        }

        public Criteria andOutearlyLessThan(Short value) {
            addCriterion("OutEarly <", value, "outearly");
            return (Criteria) this;
        }

        public Criteria andOutearlyLessThanOrEqualTo(Short value) {
            addCriterion("OutEarly <=", value, "outearly");
            return (Criteria) this;
        }

        public Criteria andOutearlyIn(List<Short> values) {
            addCriterion("OutEarly in", values, "outearly");
            return (Criteria) this;
        }

        public Criteria andOutearlyNotIn(List<Short> values) {
            addCriterion("OutEarly not in", values, "outearly");
            return (Criteria) this;
        }

        public Criteria andOutearlyBetween(Short value1, Short value2) {
            addCriterion("OutEarly between", value1, value2, "outearly");
            return (Criteria) this;
        }

        public Criteria andOutearlyNotBetween(Short value1, Short value2) {
            addCriterion("OutEarly not between", value1, value2, "outearly");
            return (Criteria) this;
        }

        public Criteria andLunchdurationIsNull() {
            addCriterion("Lunchduration is null");
            return (Criteria) this;
        }

        public Criteria andLunchdurationIsNotNull() {
            addCriterion("Lunchduration is not null");
            return (Criteria) this;
        }

        public Criteria andLunchdurationEqualTo(Short value) {
            addCriterion("Lunchduration =", value, "lunchduration");
            return (Criteria) this;
        }

        public Criteria andLunchdurationNotEqualTo(Short value) {
            addCriterion("Lunchduration <>", value, "lunchduration");
            return (Criteria) this;
        }

        public Criteria andLunchdurationGreaterThan(Short value) {
            addCriterion("Lunchduration >", value, "lunchduration");
            return (Criteria) this;
        }

        public Criteria andLunchdurationGreaterThanOrEqualTo(Short value) {
            addCriterion("Lunchduration >=", value, "lunchduration");
            return (Criteria) this;
        }

        public Criteria andLunchdurationLessThan(Short value) {
            addCriterion("Lunchduration <", value, "lunchduration");
            return (Criteria) this;
        }

        public Criteria andLunchdurationLessThanOrEqualTo(Short value) {
            addCriterion("Lunchduration <=", value, "lunchduration");
            return (Criteria) this;
        }

        public Criteria andLunchdurationIn(List<Short> values) {
            addCriterion("Lunchduration in", values, "lunchduration");
            return (Criteria) this;
        }

        public Criteria andLunchdurationNotIn(List<Short> values) {
            addCriterion("Lunchduration not in", values, "lunchduration");
            return (Criteria) this;
        }

        public Criteria andLunchdurationBetween(Short value1, Short value2) {
            addCriterion("Lunchduration between", value1, value2, "lunchduration");
            return (Criteria) this;
        }

        public Criteria andLunchdurationNotBetween(Short value1, Short value2) {
            addCriterion("Lunchduration not between", value1, value2, "lunchduration");
            return (Criteria) this;
        }

        public Criteria andSepIsNull() {
            addCriterion("SEP is null");
            return (Criteria) this;
        }

        public Criteria andSepIsNotNull() {
            addCriterion("SEP is not null");
            return (Criteria) this;
        }

        public Criteria andSepEqualTo(Short value) {
            addCriterion("SEP =", value, "sep");
            return (Criteria) this;
        }

        public Criteria andSepNotEqualTo(Short value) {
            addCriterion("SEP <>", value, "sep");
            return (Criteria) this;
        }

        public Criteria andSepGreaterThan(Short value) {
            addCriterion("SEP >", value, "sep");
            return (Criteria) this;
        }

        public Criteria andSepGreaterThanOrEqualTo(Short value) {
            addCriterion("SEP >=", value, "sep");
            return (Criteria) this;
        }

        public Criteria andSepLessThan(Short value) {
            addCriterion("SEP <", value, "sep");
            return (Criteria) this;
        }

        public Criteria andSepLessThanOrEqualTo(Short value) {
            addCriterion("SEP <=", value, "sep");
            return (Criteria) this;
        }

        public Criteria andSepIn(List<Short> values) {
            addCriterion("SEP in", values, "sep");
            return (Criteria) this;
        }

        public Criteria andSepNotIn(List<Short> values) {
            addCriterion("SEP not in", values, "sep");
            return (Criteria) this;
        }

        public Criteria andSepBetween(Short value1, Short value2) {
            addCriterion("SEP between", value1, value2, "sep");
            return (Criteria) this;
        }

        public Criteria andSepNotBetween(Short value1, Short value2) {
            addCriterion("SEP not between", value1, value2, "sep");
            return (Criteria) this;
        }

        public Criteria andOffdutyIsNull() {
            addCriterion("OffDuty is null");
            return (Criteria) this;
        }

        public Criteria andOffdutyIsNotNull() {
            addCriterion("OffDuty is not null");
            return (Criteria) this;
        }

        public Criteria andOffdutyEqualTo(Short value) {
            addCriterion("OffDuty =", value, "offduty");
            return (Criteria) this;
        }

        public Criteria andOffdutyNotEqualTo(Short value) {
            addCriterion("OffDuty <>", value, "offduty");
            return (Criteria) this;
        }

        public Criteria andOffdutyGreaterThan(Short value) {
            addCriterion("OffDuty >", value, "offduty");
            return (Criteria) this;
        }

        public Criteria andOffdutyGreaterThanOrEqualTo(Short value) {
            addCriterion("OffDuty >=", value, "offduty");
            return (Criteria) this;
        }

        public Criteria andOffdutyLessThan(Short value) {
            addCriterion("OffDuty <", value, "offduty");
            return (Criteria) this;
        }

        public Criteria andOffdutyLessThanOrEqualTo(Short value) {
            addCriterion("OffDuty <=", value, "offduty");
            return (Criteria) this;
        }

        public Criteria andOffdutyIn(List<Short> values) {
            addCriterion("OffDuty in", values, "offduty");
            return (Criteria) this;
        }

        public Criteria andOffdutyNotIn(List<Short> values) {
            addCriterion("OffDuty not in", values, "offduty");
            return (Criteria) this;
        }

        public Criteria andOffdutyBetween(Short value1, Short value2) {
            addCriterion("OffDuty between", value1, value2, "offduty");
            return (Criteria) this;
        }

        public Criteria andOffdutyNotBetween(Short value1, Short value2) {
            addCriterion("OffDuty not between", value1, value2, "offduty");
            return (Criteria) this;
        }

        public Criteria andDeltagIsNull() {
            addCriterion("DelTag is null");
            return (Criteria) this;
        }

        public Criteria andDeltagIsNotNull() {
            addCriterion("DelTag is not null");
            return (Criteria) this;
        }

        public Criteria andDeltagEqualTo(Short value) {
            addCriterion("DelTag =", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagNotEqualTo(Short value) {
            addCriterion("DelTag <>", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagGreaterThan(Short value) {
            addCriterion("DelTag >", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagGreaterThanOrEqualTo(Short value) {
            addCriterion("DelTag >=", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagLessThan(Short value) {
            addCriterion("DelTag <", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagLessThanOrEqualTo(Short value) {
            addCriterion("DelTag <=", value, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagIn(List<Short> values) {
            addCriterion("DelTag in", values, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagNotIn(List<Short> values) {
            addCriterion("DelTag not in", values, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagBetween(Short value1, Short value2) {
            addCriterion("DelTag between", value1, value2, "deltag");
            return (Criteria) this;
        }

        public Criteria andDeltagNotBetween(Short value1, Short value2) {
            addCriterion("DelTag not between", value1, value2, "deltag");
            return (Criteria) this;
        }

        public Criteria andAutoschplanIsNull() {
            addCriterion("AutoSchPlan is null");
            return (Criteria) this;
        }

        public Criteria andAutoschplanIsNotNull() {
            addCriterion("AutoSchPlan is not null");
            return (Criteria) this;
        }

        public Criteria andAutoschplanEqualTo(Short value) {
            addCriterion("AutoSchPlan =", value, "autoschplan");
            return (Criteria) this;
        }

        public Criteria andAutoschplanNotEqualTo(Short value) {
            addCriterion("AutoSchPlan <>", value, "autoschplan");
            return (Criteria) this;
        }

        public Criteria andAutoschplanGreaterThan(Short value) {
            addCriterion("AutoSchPlan >", value, "autoschplan");
            return (Criteria) this;
        }

        public Criteria andAutoschplanGreaterThanOrEqualTo(Short value) {
            addCriterion("AutoSchPlan >=", value, "autoschplan");
            return (Criteria) this;
        }

        public Criteria andAutoschplanLessThan(Short value) {
            addCriterion("AutoSchPlan <", value, "autoschplan");
            return (Criteria) this;
        }

        public Criteria andAutoschplanLessThanOrEqualTo(Short value) {
            addCriterion("AutoSchPlan <=", value, "autoschplan");
            return (Criteria) this;
        }

        public Criteria andAutoschplanIn(List<Short> values) {
            addCriterion("AutoSchPlan in", values, "autoschplan");
            return (Criteria) this;
        }

        public Criteria andAutoschplanNotIn(List<Short> values) {
            addCriterion("AutoSchPlan not in", values, "autoschplan");
            return (Criteria) this;
        }

        public Criteria andAutoschplanBetween(Short value1, Short value2) {
            addCriterion("AutoSchPlan between", value1, value2, "autoschplan");
            return (Criteria) this;
        }

        public Criteria andAutoschplanNotBetween(Short value1, Short value2) {
            addCriterion("AutoSchPlan not between", value1, value2, "autoschplan");
            return (Criteria) this;
        }

        public Criteria andMinautoschintervalIsNull() {
            addCriterion("MinAutoSchInterval is null");
            return (Criteria) this;
        }

        public Criteria andMinautoschintervalIsNotNull() {
            addCriterion("MinAutoSchInterval is not null");
            return (Criteria) this;
        }

        public Criteria andMinautoschintervalEqualTo(Integer value) {
            addCriterion("MinAutoSchInterval =", value, "minautoschinterval");
            return (Criteria) this;
        }

        public Criteria andMinautoschintervalNotEqualTo(Integer value) {
            addCriterion("MinAutoSchInterval <>", value, "minautoschinterval");
            return (Criteria) this;
        }

        public Criteria andMinautoschintervalGreaterThan(Integer value) {
            addCriterion("MinAutoSchInterval >", value, "minautoschinterval");
            return (Criteria) this;
        }

        public Criteria andMinautoschintervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("MinAutoSchInterval >=", value, "minautoschinterval");
            return (Criteria) this;
        }

        public Criteria andMinautoschintervalLessThan(Integer value) {
            addCriterion("MinAutoSchInterval <", value, "minautoschinterval");
            return (Criteria) this;
        }

        public Criteria andMinautoschintervalLessThanOrEqualTo(Integer value) {
            addCriterion("MinAutoSchInterval <=", value, "minautoschinterval");
            return (Criteria) this;
        }

        public Criteria andMinautoschintervalIn(List<Integer> values) {
            addCriterion("MinAutoSchInterval in", values, "minautoschinterval");
            return (Criteria) this;
        }

        public Criteria andMinautoschintervalNotIn(List<Integer> values) {
            addCriterion("MinAutoSchInterval not in", values, "minautoschinterval");
            return (Criteria) this;
        }

        public Criteria andMinautoschintervalBetween(Integer value1, Integer value2) {
            addCriterion("MinAutoSchInterval between", value1, value2, "minautoschinterval");
            return (Criteria) this;
        }

        public Criteria andMinautoschintervalNotBetween(Integer value1, Integer value2) {
            addCriterion("MinAutoSchInterval not between", value1, value2, "minautoschinterval");
            return (Criteria) this;
        }

        public Criteria andRegisterotIsNull() {
            addCriterion("RegisterOT is null");
            return (Criteria) this;
        }

        public Criteria andRegisterotIsNotNull() {
            addCriterion("RegisterOT is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterotEqualTo(Integer value) {
            addCriterion("RegisterOT =", value, "registerot");
            return (Criteria) this;
        }

        public Criteria andRegisterotNotEqualTo(Integer value) {
            addCriterion("RegisterOT <>", value, "registerot");
            return (Criteria) this;
        }

        public Criteria andRegisterotGreaterThan(Integer value) {
            addCriterion("RegisterOT >", value, "registerot");
            return (Criteria) this;
        }

        public Criteria andRegisterotGreaterThanOrEqualTo(Integer value) {
            addCriterion("RegisterOT >=", value, "registerot");
            return (Criteria) this;
        }

        public Criteria andRegisterotLessThan(Integer value) {
            addCriterion("RegisterOT <", value, "registerot");
            return (Criteria) this;
        }

        public Criteria andRegisterotLessThanOrEqualTo(Integer value) {
            addCriterion("RegisterOT <=", value, "registerot");
            return (Criteria) this;
        }

        public Criteria andRegisterotIn(List<Integer> values) {
            addCriterion("RegisterOT in", values, "registerot");
            return (Criteria) this;
        }

        public Criteria andRegisterotNotIn(List<Integer> values) {
            addCriterion("RegisterOT not in", values, "registerot");
            return (Criteria) this;
        }

        public Criteria andRegisterotBetween(Integer value1, Integer value2) {
            addCriterion("RegisterOT between", value1, value2, "registerot");
            return (Criteria) this;
        }

        public Criteria andRegisterotNotBetween(Integer value1, Integer value2) {
            addCriterion("RegisterOT not between", value1, value2, "registerot");
            return (Criteria) this;
        }

        public Criteria andSyspassIsNull() {
            addCriterion("sysPass is null");
            return (Criteria) this;
        }

        public Criteria andSyspassIsNotNull() {
            addCriterion("sysPass is not null");
            return (Criteria) this;
        }

        public Criteria andSyspassEqualTo(String value) {
            addCriterion("sysPass =", value, "syspass");
            return (Criteria) this;
        }

        public Criteria andSyspassNotEqualTo(String value) {
            addCriterion("sysPass <>", value, "syspass");
            return (Criteria) this;
        }

        public Criteria andSyspassGreaterThan(String value) {
            addCriterion("sysPass >", value, "syspass");
            return (Criteria) this;
        }

        public Criteria andSyspassGreaterThanOrEqualTo(String value) {
            addCriterion("sysPass >=", value, "syspass");
            return (Criteria) this;
        }

        public Criteria andSyspassLessThan(String value) {
            addCriterion("sysPass <", value, "syspass");
            return (Criteria) this;
        }

        public Criteria andSyspassLessThanOrEqualTo(String value) {
            addCriterion("sysPass <=", value, "syspass");
            return (Criteria) this;
        }

        public Criteria andSyspassLike(String value) {
            addCriterion("sysPass like", value, "syspass");
            return (Criteria) this;
        }

        public Criteria andSyspassNotLike(String value) {
            addCriterion("sysPass not like", value, "syspass");
            return (Criteria) this;
        }

        public Criteria andSyspassIn(List<String> values) {
            addCriterion("sysPass in", values, "syspass");
            return (Criteria) this;
        }

        public Criteria andSyspassNotIn(List<String> values) {
            addCriterion("sysPass not in", values, "syspass");
            return (Criteria) this;
        }

        public Criteria andSyspassBetween(String value1, String value2) {
            addCriterion("sysPass between", value1, value2, "syspass");
            return (Criteria) this;
        }

        public Criteria andSyspassNotBetween(String value1, String value2) {
            addCriterion("sysPass not between", value1, value2, "syspass");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andOpstampIsNull() {
            addCriterion("OpStamp is null");
            return (Criteria) this;
        }

        public Criteria andOpstampIsNotNull() {
            addCriterion("OpStamp is not null");
            return (Criteria) this;
        }

        public Criteria andOpstampEqualTo(Date value) {
            addCriterion("OpStamp =", value, "opstamp");
            return (Criteria) this;
        }

        public Criteria andOpstampNotEqualTo(Date value) {
            addCriterion("OpStamp <>", value, "opstamp");
            return (Criteria) this;
        }

        public Criteria andOpstampGreaterThan(Date value) {
            addCriterion("OpStamp >", value, "opstamp");
            return (Criteria) this;
        }

        public Criteria andOpstampGreaterThanOrEqualTo(Date value) {
            addCriterion("OpStamp >=", value, "opstamp");
            return (Criteria) this;
        }

        public Criteria andOpstampLessThan(Date value) {
            addCriterion("OpStamp <", value, "opstamp");
            return (Criteria) this;
        }

        public Criteria andOpstampLessThanOrEqualTo(Date value) {
            addCriterion("OpStamp <=", value, "opstamp");
            return (Criteria) this;
        }

        public Criteria andOpstampIn(List<Date> values) {
            addCriterion("OpStamp in", values, "opstamp");
            return (Criteria) this;
        }

        public Criteria andOpstampNotIn(List<Date> values) {
            addCriterion("OpStamp not in", values, "opstamp");
            return (Criteria) this;
        }

        public Criteria andOpstampBetween(Date value1, Date value2) {
            addCriterion("OpStamp between", value1, value2, "opstamp");
            return (Criteria) this;
        }

        public Criteria andOpstampNotBetween(Date value1, Date value2) {
            addCriterion("OpStamp not between", value1, value2, "opstamp");
            return (Criteria) this;
        }

        public Criteria andReservedIsNull() {
            addCriterion("Reserved is null");
            return (Criteria) this;
        }

        public Criteria andReservedIsNotNull() {
            addCriterion("Reserved is not null");
            return (Criteria) this;
        }

        public Criteria andReservedEqualTo(Integer value) {
            addCriterion("Reserved =", value, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedNotEqualTo(Integer value) {
            addCriterion("Reserved <>", value, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedGreaterThan(Integer value) {
            addCriterion("Reserved >", value, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedGreaterThanOrEqualTo(Integer value) {
            addCriterion("Reserved >=", value, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedLessThan(Integer value) {
            addCriterion("Reserved <", value, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedLessThanOrEqualTo(Integer value) {
            addCriterion("Reserved <=", value, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedIn(List<Integer> values) {
            addCriterion("Reserved in", values, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedNotIn(List<Integer> values) {
            addCriterion("Reserved not in", values, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedBetween(Integer value1, Integer value2) {
            addCriterion("Reserved between", value1, value2, "reserved");
            return (Criteria) this;
        }

        public Criteria andReservedNotBetween(Integer value1, Integer value2) {
            addCriterion("Reserved not between", value1, value2, "reserved");
            return (Criteria) this;
        }

        public Criteria andAnnualleaveIsNull() {
            addCriterion("Annualleave is null");
            return (Criteria) this;
        }

        public Criteria andAnnualleaveIsNotNull() {
            addCriterion("Annualleave is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualleaveEqualTo(Double value) {
            addCriterion("Annualleave =", value, "annualleave");
            return (Criteria) this;
        }

        public Criteria andAnnualleaveNotEqualTo(Double value) {
            addCriterion("Annualleave <>", value, "annualleave");
            return (Criteria) this;
        }

        public Criteria andAnnualleaveGreaterThan(Double value) {
            addCriterion("Annualleave >", value, "annualleave");
            return (Criteria) this;
        }

        public Criteria andAnnualleaveGreaterThanOrEqualTo(Double value) {
            addCriterion("Annualleave >=", value, "annualleave");
            return (Criteria) this;
        }

        public Criteria andAnnualleaveLessThan(Double value) {
            addCriterion("Annualleave <", value, "annualleave");
            return (Criteria) this;
        }

        public Criteria andAnnualleaveLessThanOrEqualTo(Double value) {
            addCriterion("Annualleave <=", value, "annualleave");
            return (Criteria) this;
        }

        public Criteria andAnnualleaveIn(List<Double> values) {
            addCriterion("Annualleave in", values, "annualleave");
            return (Criteria) this;
        }

        public Criteria andAnnualleaveNotIn(List<Double> values) {
            addCriterion("Annualleave not in", values, "annualleave");
            return (Criteria) this;
        }

        public Criteria andAnnualleaveBetween(Double value1, Double value2) {
            addCriterion("Annualleave between", value1, value2, "annualleave");
            return (Criteria) this;
        }

        public Criteria andAnnualleaveNotBetween(Double value1, Double value2) {
            addCriterion("Annualleave not between", value1, value2, "annualleave");
            return (Criteria) this;
        }

        public Criteria andEducationalIsNull() {
            addCriterion("Educational is null");
            return (Criteria) this;
        }

        public Criteria andEducationalIsNotNull() {
            addCriterion("Educational is not null");
            return (Criteria) this;
        }

        public Criteria andEducationalEqualTo(String value) {
            addCriterion("Educational =", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotEqualTo(String value) {
            addCriterion("Educational <>", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalGreaterThan(String value) {
            addCriterion("Educational >", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalGreaterThanOrEqualTo(String value) {
            addCriterion("Educational >=", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalLessThan(String value) {
            addCriterion("Educational <", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalLessThanOrEqualTo(String value) {
            addCriterion("Educational <=", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalLike(String value) {
            addCriterion("Educational like", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotLike(String value) {
            addCriterion("Educational not like", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalIn(List<String> values) {
            addCriterion("Educational in", values, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotIn(List<String> values) {
            addCriterion("Educational not in", values, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalBetween(String value1, String value2) {
            addCriterion("Educational between", value1, value2, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotBetween(String value1, String value2) {
            addCriterion("Educational not between", value1, value2, "educational");
            return (Criteria) this;
        }

        public Criteria andTrialstarttimeIsNull() {
            addCriterion("Trialstarttime is null");
            return (Criteria) this;
        }

        public Criteria andTrialstarttimeIsNotNull() {
            addCriterion("Trialstarttime is not null");
            return (Criteria) this;
        }

        public Criteria andTrialstarttimeEqualTo(Date value) {
            addCriterion("Trialstarttime =", value, "trialstarttime");
            return (Criteria) this;
        }

        public Criteria andTrialstarttimeNotEqualTo(Date value) {
            addCriterion("Trialstarttime <>", value, "trialstarttime");
            return (Criteria) this;
        }

        public Criteria andTrialstarttimeGreaterThan(Date value) {
            addCriterion("Trialstarttime >", value, "trialstarttime");
            return (Criteria) this;
        }

        public Criteria andTrialstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Trialstarttime >=", value, "trialstarttime");
            return (Criteria) this;
        }

        public Criteria andTrialstarttimeLessThan(Date value) {
            addCriterion("Trialstarttime <", value, "trialstarttime");
            return (Criteria) this;
        }

        public Criteria andTrialstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("Trialstarttime <=", value, "trialstarttime");
            return (Criteria) this;
        }

        public Criteria andTrialstarttimeIn(List<Date> values) {
            addCriterion("Trialstarttime in", values, "trialstarttime");
            return (Criteria) this;
        }

        public Criteria andTrialstarttimeNotIn(List<Date> values) {
            addCriterion("Trialstarttime not in", values, "trialstarttime");
            return (Criteria) this;
        }

        public Criteria andTrialstarttimeBetween(Date value1, Date value2) {
            addCriterion("Trialstarttime between", value1, value2, "trialstarttime");
            return (Criteria) this;
        }

        public Criteria andTrialstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("Trialstarttime not between", value1, value2, "trialstarttime");
            return (Criteria) this;
        }

        public Criteria andTrialendtimeIsNull() {
            addCriterion("Trialendtime is null");
            return (Criteria) this;
        }

        public Criteria andTrialendtimeIsNotNull() {
            addCriterion("Trialendtime is not null");
            return (Criteria) this;
        }

        public Criteria andTrialendtimeEqualTo(Date value) {
            addCriterion("Trialendtime =", value, "trialendtime");
            return (Criteria) this;
        }

        public Criteria andTrialendtimeNotEqualTo(Date value) {
            addCriterion("Trialendtime <>", value, "trialendtime");
            return (Criteria) this;
        }

        public Criteria andTrialendtimeGreaterThan(Date value) {
            addCriterion("Trialendtime >", value, "trialendtime");
            return (Criteria) this;
        }

        public Criteria andTrialendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Trialendtime >=", value, "trialendtime");
            return (Criteria) this;
        }

        public Criteria andTrialendtimeLessThan(Date value) {
            addCriterion("Trialendtime <", value, "trialendtime");
            return (Criteria) this;
        }

        public Criteria andTrialendtimeLessThanOrEqualTo(Date value) {
            addCriterion("Trialendtime <=", value, "trialendtime");
            return (Criteria) this;
        }

        public Criteria andTrialendtimeIn(List<Date> values) {
            addCriterion("Trialendtime in", values, "trialendtime");
            return (Criteria) this;
        }

        public Criteria andTrialendtimeNotIn(List<Date> values) {
            addCriterion("Trialendtime not in", values, "trialendtime");
            return (Criteria) this;
        }

        public Criteria andTrialendtimeBetween(Date value1, Date value2) {
            addCriterion("Trialendtime between", value1, value2, "trialendtime");
            return (Criteria) this;
        }

        public Criteria andTrialendtimeNotBetween(Date value1, Date value2) {
            addCriterion("Trialendtime not between", value1, value2, "trialendtime");
            return (Criteria) this;
        }

        public Criteria andContractstarttimeIsNull() {
            addCriterion("Contractstarttime is null");
            return (Criteria) this;
        }

        public Criteria andContractstarttimeIsNotNull() {
            addCriterion("Contractstarttime is not null");
            return (Criteria) this;
        }

        public Criteria andContractstarttimeEqualTo(Date value) {
            addCriterion("Contractstarttime =", value, "contractstarttime");
            return (Criteria) this;
        }

        public Criteria andContractstarttimeNotEqualTo(Date value) {
            addCriterion("Contractstarttime <>", value, "contractstarttime");
            return (Criteria) this;
        }

        public Criteria andContractstarttimeGreaterThan(Date value) {
            addCriterion("Contractstarttime >", value, "contractstarttime");
            return (Criteria) this;
        }

        public Criteria andContractstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Contractstarttime >=", value, "contractstarttime");
            return (Criteria) this;
        }

        public Criteria andContractstarttimeLessThan(Date value) {
            addCriterion("Contractstarttime <", value, "contractstarttime");
            return (Criteria) this;
        }

        public Criteria andContractstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("Contractstarttime <=", value, "contractstarttime");
            return (Criteria) this;
        }

        public Criteria andContractstarttimeIn(List<Date> values) {
            addCriterion("Contractstarttime in", values, "contractstarttime");
            return (Criteria) this;
        }

        public Criteria andContractstarttimeNotIn(List<Date> values) {
            addCriterion("Contractstarttime not in", values, "contractstarttime");
            return (Criteria) this;
        }

        public Criteria andContractstarttimeBetween(Date value1, Date value2) {
            addCriterion("Contractstarttime between", value1, value2, "contractstarttime");
            return (Criteria) this;
        }

        public Criteria andContractstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("Contractstarttime not between", value1, value2, "contractstarttime");
            return (Criteria) this;
        }

        public Criteria andContractendtimeIsNull() {
            addCriterion("Contractendtime is null");
            return (Criteria) this;
        }

        public Criteria andContractendtimeIsNotNull() {
            addCriterion("Contractendtime is not null");
            return (Criteria) this;
        }

        public Criteria andContractendtimeEqualTo(Date value) {
            addCriterion("Contractendtime =", value, "contractendtime");
            return (Criteria) this;
        }

        public Criteria andContractendtimeNotEqualTo(Date value) {
            addCriterion("Contractendtime <>", value, "contractendtime");
            return (Criteria) this;
        }

        public Criteria andContractendtimeGreaterThan(Date value) {
            addCriterion("Contractendtime >", value, "contractendtime");
            return (Criteria) this;
        }

        public Criteria andContractendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Contractendtime >=", value, "contractendtime");
            return (Criteria) this;
        }

        public Criteria andContractendtimeLessThan(Date value) {
            addCriterion("Contractendtime <", value, "contractendtime");
            return (Criteria) this;
        }

        public Criteria andContractendtimeLessThanOrEqualTo(Date value) {
            addCriterion("Contractendtime <=", value, "contractendtime");
            return (Criteria) this;
        }

        public Criteria andContractendtimeIn(List<Date> values) {
            addCriterion("Contractendtime in", values, "contractendtime");
            return (Criteria) this;
        }

        public Criteria andContractendtimeNotIn(List<Date> values) {
            addCriterion("Contractendtime not in", values, "contractendtime");
            return (Criteria) this;
        }

        public Criteria andContractendtimeBetween(Date value1, Date value2) {
            addCriterion("Contractendtime between", value1, value2, "contractendtime");
            return (Criteria) this;
        }

        public Criteria andContractendtimeNotBetween(Date value1, Date value2) {
            addCriterion("Contractendtime not between", value1, value2, "contractendtime");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeIsNull() {
            addCriterion("Employeetype is null");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeIsNotNull() {
            addCriterion("Employeetype is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeEqualTo(String value) {
            addCriterion("Employeetype =", value, "employeetype");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeNotEqualTo(String value) {
            addCriterion("Employeetype <>", value, "employeetype");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeGreaterThan(String value) {
            addCriterion("Employeetype >", value, "employeetype");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeGreaterThanOrEqualTo(String value) {
            addCriterion("Employeetype >=", value, "employeetype");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeLessThan(String value) {
            addCriterion("Employeetype <", value, "employeetype");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeLessThanOrEqualTo(String value) {
            addCriterion("Employeetype <=", value, "employeetype");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeLike(String value) {
            addCriterion("Employeetype like", value, "employeetype");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeNotLike(String value) {
            addCriterion("Employeetype not like", value, "employeetype");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeIn(List<String> values) {
            addCriterion("Employeetype in", values, "employeetype");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeNotIn(List<String> values) {
            addCriterion("Employeetype not in", values, "employeetype");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeBetween(String value1, String value2) {
            addCriterion("Employeetype between", value1, value2, "employeetype");
            return (Criteria) this;
        }

        public Criteria andEmployeetypeNotBetween(String value1, String value2) {
            addCriterion("Employeetype not between", value1, value2, "employeetype");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNull() {
            addCriterion("Image_id is null");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNotNull() {
            addCriterion("Image_id is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdEqualTo(Integer value) {
            addCriterion("Image_id =", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotEqualTo(Integer value) {
            addCriterion("Image_id <>", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThan(Integer value) {
            addCriterion("Image_id >", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Image_id >=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThan(Integer value) {
            addCriterion("Image_id <", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThanOrEqualTo(Integer value) {
            addCriterion("Image_id <=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdIn(List<Integer> values) {
            addCriterion("Image_id in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotIn(List<Integer> values) {
            addCriterion("Image_id not in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdBetween(Integer value1, Integer value2) {
            addCriterion("Image_id between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Image_id not between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andSimnameIsNull() {
            addCriterion("SimName is null");
            return (Criteria) this;
        }

        public Criteria andSimnameIsNotNull() {
            addCriterion("SimName is not null");
            return (Criteria) this;
        }

        public Criteria andSimnameEqualTo(String value) {
            addCriterion("SimName =", value, "simname");
            return (Criteria) this;
        }

        public Criteria andSimnameNotEqualTo(String value) {
            addCriterion("SimName <>", value, "simname");
            return (Criteria) this;
        }

        public Criteria andSimnameGreaterThan(String value) {
            addCriterion("SimName >", value, "simname");
            return (Criteria) this;
        }

        public Criteria andSimnameGreaterThanOrEqualTo(String value) {
            addCriterion("SimName >=", value, "simname");
            return (Criteria) this;
        }

        public Criteria andSimnameLessThan(String value) {
            addCriterion("SimName <", value, "simname");
            return (Criteria) this;
        }

        public Criteria andSimnameLessThanOrEqualTo(String value) {
            addCriterion("SimName <=", value, "simname");
            return (Criteria) this;
        }

        public Criteria andSimnameLike(String value) {
            addCriterion("SimName like", value, "simname");
            return (Criteria) this;
        }

        public Criteria andSimnameNotLike(String value) {
            addCriterion("SimName not like", value, "simname");
            return (Criteria) this;
        }

        public Criteria andSimnameIn(List<String> values) {
            addCriterion("SimName in", values, "simname");
            return (Criteria) this;
        }

        public Criteria andSimnameNotIn(List<String> values) {
            addCriterion("SimName not in", values, "simname");
            return (Criteria) this;
        }

        public Criteria andSimnameBetween(String value1, String value2) {
            addCriterion("SimName between", value1, value2, "simname");
            return (Criteria) this;
        }

        public Criteria andSimnameNotBetween(String value1, String value2) {
            addCriterion("SimName not between", value1, value2, "simname");
            return (Criteria) this;
        }

        public Criteria andSimnumberIsNull() {
            addCriterion("SimNumber is null");
            return (Criteria) this;
        }

        public Criteria andSimnumberIsNotNull() {
            addCriterion("SimNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSimnumberEqualTo(String value) {
            addCriterion("SimNumber =", value, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberNotEqualTo(String value) {
            addCriterion("SimNumber <>", value, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberGreaterThan(String value) {
            addCriterion("SimNumber >", value, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberGreaterThanOrEqualTo(String value) {
            addCriterion("SimNumber >=", value, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberLessThan(String value) {
            addCriterion("SimNumber <", value, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberLessThanOrEqualTo(String value) {
            addCriterion("SimNumber <=", value, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberLike(String value) {
            addCriterion("SimNumber like", value, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberNotLike(String value) {
            addCriterion("SimNumber not like", value, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberIn(List<String> values) {
            addCriterion("SimNumber in", values, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberNotIn(List<String> values) {
            addCriterion("SimNumber not in", values, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberBetween(String value1, String value2) {
            addCriterion("SimNumber between", value1, value2, "simnumber");
            return (Criteria) this;
        }

        public Criteria andSimnumberNotBetween(String value1, String value2) {
            addCriterion("SimNumber not between", value1, value2, "simnumber");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSimztIsNull() {
            addCriterion("SimZt is null");
            return (Criteria) this;
        }

        public Criteria andSimztIsNotNull() {
            addCriterion("SimZt is not null");
            return (Criteria) this;
        }

        public Criteria andSimztEqualTo(String value) {
            addCriterion("SimZt =", value, "simzt");
            return (Criteria) this;
        }

        public Criteria andSimztNotEqualTo(String value) {
            addCriterion("SimZt <>", value, "simzt");
            return (Criteria) this;
        }

        public Criteria andSimztGreaterThan(String value) {
            addCriterion("SimZt >", value, "simzt");
            return (Criteria) this;
        }

        public Criteria andSimztGreaterThanOrEqualTo(String value) {
            addCriterion("SimZt >=", value, "simzt");
            return (Criteria) this;
        }

        public Criteria andSimztLessThan(String value) {
            addCriterion("SimZt <", value, "simzt");
            return (Criteria) this;
        }

        public Criteria andSimztLessThanOrEqualTo(String value) {
            addCriterion("SimZt <=", value, "simzt");
            return (Criteria) this;
        }

        public Criteria andSimztLike(String value) {
            addCriterion("SimZt like", value, "simzt");
            return (Criteria) this;
        }

        public Criteria andSimztNotLike(String value) {
            addCriterion("SimZt not like", value, "simzt");
            return (Criteria) this;
        }

        public Criteria andSimztIn(List<String> values) {
            addCriterion("SimZt in", values, "simzt");
            return (Criteria) this;
        }

        public Criteria andSimztNotIn(List<String> values) {
            addCriterion("SimZt not in", values, "simzt");
            return (Criteria) this;
        }

        public Criteria andSimztBetween(String value1, String value2) {
            addCriterion("SimZt between", value1, value2, "simzt");
            return (Criteria) this;
        }

        public Criteria andSimztNotBetween(String value1, String value2) {
            addCriterion("SimZt not between", value1, value2, "simzt");
            return (Criteria) this;
        }

        public Criteria andSimtimeIsNull() {
            addCriterion("SimTime is null");
            return (Criteria) this;
        }

        public Criteria andSimtimeIsNotNull() {
            addCriterion("SimTime is not null");
            return (Criteria) this;
        }

        public Criteria andSimtimeEqualTo(Date value) {
            addCriterion("SimTime =", value, "simtime");
            return (Criteria) this;
        }

        public Criteria andSimtimeNotEqualTo(Date value) {
            addCriterion("SimTime <>", value, "simtime");
            return (Criteria) this;
        }

        public Criteria andSimtimeGreaterThan(Date value) {
            addCriterion("SimTime >", value, "simtime");
            return (Criteria) this;
        }

        public Criteria andSimtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SimTime >=", value, "simtime");
            return (Criteria) this;
        }

        public Criteria andSimtimeLessThan(Date value) {
            addCriterion("SimTime <", value, "simtime");
            return (Criteria) this;
        }

        public Criteria andSimtimeLessThanOrEqualTo(Date value) {
            addCriterion("SimTime <=", value, "simtime");
            return (Criteria) this;
        }

        public Criteria andSimtimeIn(List<Date> values) {
            addCriterion("SimTime in", values, "simtime");
            return (Criteria) this;
        }

        public Criteria andSimtimeNotIn(List<Date> values) {
            addCriterion("SimTime not in", values, "simtime");
            return (Criteria) this;
        }

        public Criteria andSimtimeBetween(Date value1, Date value2) {
            addCriterion("SimTime between", value1, value2, "simtime");
            return (Criteria) this;
        }

        public Criteria andSimtimeNotBetween(Date value1, Date value2) {
            addCriterion("SimTime not between", value1, value2, "simtime");
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