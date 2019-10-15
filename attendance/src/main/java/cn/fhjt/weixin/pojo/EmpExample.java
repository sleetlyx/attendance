package cn.fhjt.weixin.pojo;

import java.util.ArrayList;
import java.util.List;

public class EmpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmpExample() {
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

        public Criteria andAvocationIsNull() {
            addCriterion("avocation is null");
            return (Criteria) this;
        }

        public Criteria andAvocationIsNotNull() {
            addCriterion("avocation is not null");
            return (Criteria) this;
        }

        public Criteria andAvocationEqualTo(String value) {
            addCriterion("avocation =", value, "avocation");
            return (Criteria) this;
        }

        public Criteria andAvocationNotEqualTo(String value) {
            addCriterion("avocation <>", value, "avocation");
            return (Criteria) this;
        }

        public Criteria andAvocationGreaterThan(String value) {
            addCriterion("avocation >", value, "avocation");
            return (Criteria) this;
        }

        public Criteria andAvocationGreaterThanOrEqualTo(String value) {
            addCriterion("avocation >=", value, "avocation");
            return (Criteria) this;
        }

        public Criteria andAvocationLessThan(String value) {
            addCriterion("avocation <", value, "avocation");
            return (Criteria) this;
        }

        public Criteria andAvocationLessThanOrEqualTo(String value) {
            addCriterion("avocation <=", value, "avocation");
            return (Criteria) this;
        }

        public Criteria andAvocationLike(String value) {
            addCriterion("avocation like", value, "avocation");
            return (Criteria) this;
        }

        public Criteria andAvocationNotLike(String value) {
            addCriterion("avocation not like", value, "avocation");
            return (Criteria) this;
        }

        public Criteria andAvocationIn(List<String> values) {
            addCriterion("avocation in", values, "avocation");
            return (Criteria) this;
        }

        public Criteria andAvocationNotIn(List<String> values) {
            addCriterion("avocation not in", values, "avocation");
            return (Criteria) this;
        }

        public Criteria andAvocationBetween(String value1, String value2) {
            addCriterion("avocation between", value1, value2, "avocation");
            return (Criteria) this;
        }

        public Criteria andAvocationNotBetween(String value1, String value2) {
            addCriterion("avocation not between", value1, value2, "avocation");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("bank_code =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("bank_code <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("bank_code >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_code >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("bank_code <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("bank_code <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("bank_code like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("bank_code not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("bank_code in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("bank_code not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("bank_code between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("bank_code not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBegWorkDateIsNull() {
            addCriterion("beg_work_date is null");
            return (Criteria) this;
        }

        public Criteria andBegWorkDateIsNotNull() {
            addCriterion("beg_work_date is not null");
            return (Criteria) this;
        }

        public Criteria andBegWorkDateEqualTo(String value) {
            addCriterion("beg_work_date =", value, "begWorkDate");
            return (Criteria) this;
        }

        public Criteria andBegWorkDateNotEqualTo(String value) {
            addCriterion("beg_work_date <>", value, "begWorkDate");
            return (Criteria) this;
        }

        public Criteria andBegWorkDateGreaterThan(String value) {
            addCriterion("beg_work_date >", value, "begWorkDate");
            return (Criteria) this;
        }

        public Criteria andBegWorkDateGreaterThanOrEqualTo(String value) {
            addCriterion("beg_work_date >=", value, "begWorkDate");
            return (Criteria) this;
        }

        public Criteria andBegWorkDateLessThan(String value) {
            addCriterion("beg_work_date <", value, "begWorkDate");
            return (Criteria) this;
        }

        public Criteria andBegWorkDateLessThanOrEqualTo(String value) {
            addCriterion("beg_work_date <=", value, "begWorkDate");
            return (Criteria) this;
        }

        public Criteria andBegWorkDateLike(String value) {
            addCriterion("beg_work_date like", value, "begWorkDate");
            return (Criteria) this;
        }

        public Criteria andBegWorkDateNotLike(String value) {
            addCriterion("beg_work_date not like", value, "begWorkDate");
            return (Criteria) this;
        }

        public Criteria andBegWorkDateIn(List<String> values) {
            addCriterion("beg_work_date in", values, "begWorkDate");
            return (Criteria) this;
        }

        public Criteria andBegWorkDateNotIn(List<String> values) {
            addCriterion("beg_work_date not in", values, "begWorkDate");
            return (Criteria) this;
        }

        public Criteria andBegWorkDateBetween(String value1, String value2) {
            addCriterion("beg_work_date between", value1, value2, "begWorkDate");
            return (Criteria) this;
        }

        public Criteria andBegWorkDateNotBetween(String value1, String value2) {
            addCriterion("beg_work_date not between", value1, value2, "begWorkDate");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarIsNull() {
            addCriterion("birthday_lunar is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarIsNotNull() {
            addCriterion("birthday_lunar is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarEqualTo(String value) {
            addCriterion("birthday_lunar =", value, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarNotEqualTo(String value) {
            addCriterion("birthday_lunar <>", value, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarGreaterThan(String value) {
            addCriterion("birthday_lunar >", value, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarGreaterThanOrEqualTo(String value) {
            addCriterion("birthday_lunar >=", value, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarLessThan(String value) {
            addCriterion("birthday_lunar <", value, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarLessThanOrEqualTo(String value) {
            addCriterion("birthday_lunar <=", value, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarLike(String value) {
            addCriterion("birthday_lunar like", value, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarNotLike(String value) {
            addCriterion("birthday_lunar not like", value, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarIn(List<String> values) {
            addCriterion("birthday_lunar in", values, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarNotIn(List<String> values) {
            addCriterion("birthday_lunar not in", values, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarBetween(String value1, String value2) {
            addCriterion("birthday_lunar between", value1, value2, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andBirthdayLunarNotBetween(String value1, String value2) {
            addCriterion("birthday_lunar not between", value1, value2, "birthdayLunar");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNull() {
            addCriterion("college is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNotNull() {
            addCriterion("college is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeEqualTo(String value) {
            addCriterion("college =", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotEqualTo(String value) {
            addCriterion("college <>", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThan(String value) {
            addCriterion("college >", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("college >=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThan(String value) {
            addCriterion("college <", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThanOrEqualTo(String value) {
            addCriterion("college <=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLike(String value) {
            addCriterion("college like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotLike(String value) {
            addCriterion("college not like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeIn(List<String> values) {
            addCriterion("college in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotIn(List<String> values) {
            addCriterion("college not in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeBetween(String value1, String value2) {
            addCriterion("college between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotBetween(String value1, String value2) {
            addCriterion("college not between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andContractBegDateIsNull() {
            addCriterion("contract_beg_date is null");
            return (Criteria) this;
        }

        public Criteria andContractBegDateIsNotNull() {
            addCriterion("contract_beg_date is not null");
            return (Criteria) this;
        }

        public Criteria andContractBegDateEqualTo(String value) {
            addCriterion("contract_beg_date =", value, "contractBegDate");
            return (Criteria) this;
        }

        public Criteria andContractBegDateNotEqualTo(String value) {
            addCriterion("contract_beg_date <>", value, "contractBegDate");
            return (Criteria) this;
        }

        public Criteria andContractBegDateGreaterThan(String value) {
            addCriterion("contract_beg_date >", value, "contractBegDate");
            return (Criteria) this;
        }

        public Criteria andContractBegDateGreaterThanOrEqualTo(String value) {
            addCriterion("contract_beg_date >=", value, "contractBegDate");
            return (Criteria) this;
        }

        public Criteria andContractBegDateLessThan(String value) {
            addCriterion("contract_beg_date <", value, "contractBegDate");
            return (Criteria) this;
        }

        public Criteria andContractBegDateLessThanOrEqualTo(String value) {
            addCriterion("contract_beg_date <=", value, "contractBegDate");
            return (Criteria) this;
        }

        public Criteria andContractBegDateLike(String value) {
            addCriterion("contract_beg_date like", value, "contractBegDate");
            return (Criteria) this;
        }

        public Criteria andContractBegDateNotLike(String value) {
            addCriterion("contract_beg_date not like", value, "contractBegDate");
            return (Criteria) this;
        }

        public Criteria andContractBegDateIn(List<String> values) {
            addCriterion("contract_beg_date in", values, "contractBegDate");
            return (Criteria) this;
        }

        public Criteria andContractBegDateNotIn(List<String> values) {
            addCriterion("contract_beg_date not in", values, "contractBegDate");
            return (Criteria) this;
        }

        public Criteria andContractBegDateBetween(String value1, String value2) {
            addCriterion("contract_beg_date between", value1, value2, "contractBegDate");
            return (Criteria) this;
        }

        public Criteria andContractBegDateNotBetween(String value1, String value2) {
            addCriterion("contract_beg_date not between", value1, value2, "contractBegDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateIsNull() {
            addCriterion("contract_end_date is null");
            return (Criteria) this;
        }

        public Criteria andContractEndDateIsNotNull() {
            addCriterion("contract_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andContractEndDateEqualTo(String value) {
            addCriterion("contract_end_date =", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateNotEqualTo(String value) {
            addCriterion("contract_end_date <>", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateGreaterThan(String value) {
            addCriterion("contract_end_date >", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("contract_end_date >=", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateLessThan(String value) {
            addCriterion("contract_end_date <", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateLessThanOrEqualTo(String value) {
            addCriterion("contract_end_date <=", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateLike(String value) {
            addCriterion("contract_end_date like", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateNotLike(String value) {
            addCriterion("contract_end_date not like", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateIn(List<String> values) {
            addCriterion("contract_end_date in", values, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateNotIn(List<String> values) {
            addCriterion("contract_end_date not in", values, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateBetween(String value1, String value2) {
            addCriterion("contract_end_date between", value1, value2, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateNotBetween(String value1, String value2) {
            addCriterion("contract_end_date not between", value1, value2, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNull() {
            addCriterion("contract_type is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("contract_type is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(String value) {
            addCriterion("contract_type =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(String value) {
            addCriterion("contract_type <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(String value) {
            addCriterion("contract_type >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(String value) {
            addCriterion("contract_type >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(String value) {
            addCriterion("contract_type <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(String value) {
            addCriterion("contract_type <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLike(String value) {
            addCriterion("contract_type like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotLike(String value) {
            addCriterion("contract_type not like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<String> values) {
            addCriterion("contract_type in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<String> values) {
            addCriterion("contract_type not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(String value1, String value2) {
            addCriterion("contract_type between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(String value1, String value2) {
            addCriterion("contract_type not between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andCrossGroupIdIsNull() {
            addCriterion("cross_group_id is null");
            return (Criteria) this;
        }

        public Criteria andCrossGroupIdIsNotNull() {
            addCriterion("cross_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andCrossGroupIdEqualTo(String value) {
            addCriterion("cross_group_id =", value, "crossGroupId");
            return (Criteria) this;
        }

        public Criteria andCrossGroupIdNotEqualTo(String value) {
            addCriterion("cross_group_id <>", value, "crossGroupId");
            return (Criteria) this;
        }

        public Criteria andCrossGroupIdGreaterThan(String value) {
            addCriterion("cross_group_id >", value, "crossGroupId");
            return (Criteria) this;
        }

        public Criteria andCrossGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("cross_group_id >=", value, "crossGroupId");
            return (Criteria) this;
        }

        public Criteria andCrossGroupIdLessThan(String value) {
            addCriterion("cross_group_id <", value, "crossGroupId");
            return (Criteria) this;
        }

        public Criteria andCrossGroupIdLessThanOrEqualTo(String value) {
            addCriterion("cross_group_id <=", value, "crossGroupId");
            return (Criteria) this;
        }

        public Criteria andCrossGroupIdLike(String value) {
            addCriterion("cross_group_id like", value, "crossGroupId");
            return (Criteria) this;
        }

        public Criteria andCrossGroupIdNotLike(String value) {
            addCriterion("cross_group_id not like", value, "crossGroupId");
            return (Criteria) this;
        }

        public Criteria andCrossGroupIdIn(List<String> values) {
            addCriterion("cross_group_id in", values, "crossGroupId");
            return (Criteria) this;
        }

        public Criteria andCrossGroupIdNotIn(List<String> values) {
            addCriterion("cross_group_id not in", values, "crossGroupId");
            return (Criteria) this;
        }

        public Criteria andCrossGroupIdBetween(String value1, String value2) {
            addCriterion("cross_group_id between", value1, value2, "crossGroupId");
            return (Criteria) this;
        }

        public Criteria andCrossGroupIdNotBetween(String value1, String value2) {
            addCriterion("cross_group_id not between", value1, value2, "crossGroupId");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeIsNull() {
            addCriterion("culture_degree is null");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeIsNotNull() {
            addCriterion("culture_degree is not null");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeEqualTo(String value) {
            addCriterion("culture_degree =", value, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeNotEqualTo(String value) {
            addCriterion("culture_degree <>", value, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeGreaterThan(String value) {
            addCriterion("culture_degree >", value, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("culture_degree >=", value, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeLessThan(String value) {
            addCriterion("culture_degree <", value, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeLessThanOrEqualTo(String value) {
            addCriterion("culture_degree <=", value, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeLike(String value) {
            addCriterion("culture_degree like", value, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeNotLike(String value) {
            addCriterion("culture_degree not like", value, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeIn(List<String> values) {
            addCriterion("culture_degree in", values, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeNotIn(List<String> values) {
            addCriterion("culture_degree not in", values, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeBetween(String value1, String value2) {
            addCriterion("culture_degree between", value1, value2, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureDegreeNotBetween(String value1, String value2) {
            addCriterion("culture_degree not between", value1, value2, "cultureDegree");
            return (Criteria) this;
        }

        public Criteria andCultureLevelIsNull() {
            addCriterion("culture_level is null");
            return (Criteria) this;
        }

        public Criteria andCultureLevelIsNotNull() {
            addCriterion("culture_level is not null");
            return (Criteria) this;
        }

        public Criteria andCultureLevelEqualTo(String value) {
            addCriterion("culture_level =", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelNotEqualTo(String value) {
            addCriterion("culture_level <>", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelGreaterThan(String value) {
            addCriterion("culture_level >", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelGreaterThanOrEqualTo(String value) {
            addCriterion("culture_level >=", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelLessThan(String value) {
            addCriterion("culture_level <", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelLessThanOrEqualTo(String value) {
            addCriterion("culture_level <=", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelLike(String value) {
            addCriterion("culture_level like", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelNotLike(String value) {
            addCriterion("culture_level not like", value, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelIn(List<String> values) {
            addCriterion("culture_level in", values, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelNotIn(List<String> values) {
            addCriterion("culture_level not in", values, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelBetween(String value1, String value2) {
            addCriterion("culture_level between", value1, value2, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andCultureLevelNotBetween(String value1, String value2) {
            addCriterion("culture_level not between", value1, value2, "cultureLevel");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("dept_id like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("dept_id not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptPostIsNull() {
            addCriterion("dept_post is null");
            return (Criteria) this;
        }

        public Criteria andDeptPostIsNotNull() {
            addCriterion("dept_post is not null");
            return (Criteria) this;
        }

        public Criteria andDeptPostEqualTo(String value) {
            addCriterion("dept_post =", value, "deptPost");
            return (Criteria) this;
        }

        public Criteria andDeptPostNotEqualTo(String value) {
            addCriterion("dept_post <>", value, "deptPost");
            return (Criteria) this;
        }

        public Criteria andDeptPostGreaterThan(String value) {
            addCriterion("dept_post >", value, "deptPost");
            return (Criteria) this;
        }

        public Criteria andDeptPostGreaterThanOrEqualTo(String value) {
            addCriterion("dept_post >=", value, "deptPost");
            return (Criteria) this;
        }

        public Criteria andDeptPostLessThan(String value) {
            addCriterion("dept_post <", value, "deptPost");
            return (Criteria) this;
        }

        public Criteria andDeptPostLessThanOrEqualTo(String value) {
            addCriterion("dept_post <=", value, "deptPost");
            return (Criteria) this;
        }

        public Criteria andDeptPostLike(String value) {
            addCriterion("dept_post like", value, "deptPost");
            return (Criteria) this;
        }

        public Criteria andDeptPostNotLike(String value) {
            addCriterion("dept_post not like", value, "deptPost");
            return (Criteria) this;
        }

        public Criteria andDeptPostIn(List<String> values) {
            addCriterion("dept_post in", values, "deptPost");
            return (Criteria) this;
        }

        public Criteria andDeptPostNotIn(List<String> values) {
            addCriterion("dept_post not in", values, "deptPost");
            return (Criteria) this;
        }

        public Criteria andDeptPostBetween(String value1, String value2) {
            addCriterion("dept_post between", value1, value2, "deptPost");
            return (Criteria) this;
        }

        public Criteria andDeptPostNotBetween(String value1, String value2) {
            addCriterion("dept_post not between", value1, value2, "deptPost");
            return (Criteria) this;
        }

        public Criteria andEasyCodeIsNull() {
            addCriterion("easy_code is null");
            return (Criteria) this;
        }

        public Criteria andEasyCodeIsNotNull() {
            addCriterion("easy_code is not null");
            return (Criteria) this;
        }

        public Criteria andEasyCodeEqualTo(String value) {
            addCriterion("easy_code =", value, "easyCode");
            return (Criteria) this;
        }

        public Criteria andEasyCodeNotEqualTo(String value) {
            addCriterion("easy_code <>", value, "easyCode");
            return (Criteria) this;
        }

        public Criteria andEasyCodeGreaterThan(String value) {
            addCriterion("easy_code >", value, "easyCode");
            return (Criteria) this;
        }

        public Criteria andEasyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("easy_code >=", value, "easyCode");
            return (Criteria) this;
        }

        public Criteria andEasyCodeLessThan(String value) {
            addCriterion("easy_code <", value, "easyCode");
            return (Criteria) this;
        }

        public Criteria andEasyCodeLessThanOrEqualTo(String value) {
            addCriterion("easy_code <=", value, "easyCode");
            return (Criteria) this;
        }

        public Criteria andEasyCodeLike(String value) {
            addCriterion("easy_code like", value, "easyCode");
            return (Criteria) this;
        }

        public Criteria andEasyCodeNotLike(String value) {
            addCriterion("easy_code not like", value, "easyCode");
            return (Criteria) this;
        }

        public Criteria andEasyCodeIn(List<String> values) {
            addCriterion("easy_code in", values, "easyCode");
            return (Criteria) this;
        }

        public Criteria andEasyCodeNotIn(List<String> values) {
            addCriterion("easy_code not in", values, "easyCode");
            return (Criteria) this;
        }

        public Criteria andEasyCodeBetween(String value1, String value2) {
            addCriterion("easy_code between", value1, value2, "easyCode");
            return (Criteria) this;
        }

        public Criteria andEasyCodeNotBetween(String value1, String value2) {
            addCriterion("easy_code not between", value1, value2, "easyCode");
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

        public Criteria andEmpCardNoIsNull() {
            addCriterion("emp_card_no is null");
            return (Criteria) this;
        }

        public Criteria andEmpCardNoIsNotNull() {
            addCriterion("emp_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCardNoEqualTo(String value) {
            addCriterion("emp_card_no =", value, "empCardNo");
            return (Criteria) this;
        }

        public Criteria andEmpCardNoNotEqualTo(String value) {
            addCriterion("emp_card_no <>", value, "empCardNo");
            return (Criteria) this;
        }

        public Criteria andEmpCardNoGreaterThan(String value) {
            addCriterion("emp_card_no >", value, "empCardNo");
            return (Criteria) this;
        }

        public Criteria andEmpCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("emp_card_no >=", value, "empCardNo");
            return (Criteria) this;
        }

        public Criteria andEmpCardNoLessThan(String value) {
            addCriterion("emp_card_no <", value, "empCardNo");
            return (Criteria) this;
        }

        public Criteria andEmpCardNoLessThanOrEqualTo(String value) {
            addCriterion("emp_card_no <=", value, "empCardNo");
            return (Criteria) this;
        }

        public Criteria andEmpCardNoLike(String value) {
            addCriterion("emp_card_no like", value, "empCardNo");
            return (Criteria) this;
        }

        public Criteria andEmpCardNoNotLike(String value) {
            addCriterion("emp_card_no not like", value, "empCardNo");
            return (Criteria) this;
        }

        public Criteria andEmpCardNoIn(List<String> values) {
            addCriterion("emp_card_no in", values, "empCardNo");
            return (Criteria) this;
        }

        public Criteria andEmpCardNoNotIn(List<String> values) {
            addCriterion("emp_card_no not in", values, "empCardNo");
            return (Criteria) this;
        }

        public Criteria andEmpCardNoBetween(String value1, String value2) {
            addCriterion("emp_card_no between", value1, value2, "empCardNo");
            return (Criteria) this;
        }

        public Criteria andEmpCardNoNotBetween(String value1, String value2) {
            addCriterion("emp_card_no not between", value1, value2, "empCardNo");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(String value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(String value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(String value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(String value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(String value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLike(String value) {
            addCriterion("emp_id like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotLike(String value) {
            addCriterion("emp_id not like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<String> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<String> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(String value1, String value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(String value1, String value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpWageTypeIsNull() {
            addCriterion("emp_wage_type is null");
            return (Criteria) this;
        }

        public Criteria andEmpWageTypeIsNotNull() {
            addCriterion("emp_wage_type is not null");
            return (Criteria) this;
        }

        public Criteria andEmpWageTypeEqualTo(String value) {
            addCriterion("emp_wage_type =", value, "empWageType");
            return (Criteria) this;
        }

        public Criteria andEmpWageTypeNotEqualTo(String value) {
            addCriterion("emp_wage_type <>", value, "empWageType");
            return (Criteria) this;
        }

        public Criteria andEmpWageTypeGreaterThan(String value) {
            addCriterion("emp_wage_type >", value, "empWageType");
            return (Criteria) this;
        }

        public Criteria andEmpWageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("emp_wage_type >=", value, "empWageType");
            return (Criteria) this;
        }

        public Criteria andEmpWageTypeLessThan(String value) {
            addCriterion("emp_wage_type <", value, "empWageType");
            return (Criteria) this;
        }

        public Criteria andEmpWageTypeLessThanOrEqualTo(String value) {
            addCriterion("emp_wage_type <=", value, "empWageType");
            return (Criteria) this;
        }

        public Criteria andEmpWageTypeLike(String value) {
            addCriterion("emp_wage_type like", value, "empWageType");
            return (Criteria) this;
        }

        public Criteria andEmpWageTypeNotLike(String value) {
            addCriterion("emp_wage_type not like", value, "empWageType");
            return (Criteria) this;
        }

        public Criteria andEmpWageTypeIn(List<String> values) {
            addCriterion("emp_wage_type in", values, "empWageType");
            return (Criteria) this;
        }

        public Criteria andEmpWageTypeNotIn(List<String> values) {
            addCriterion("emp_wage_type not in", values, "empWageType");
            return (Criteria) this;
        }

        public Criteria andEmpWageTypeBetween(String value1, String value2) {
            addCriterion("emp_wage_type between", value1, value2, "empWageType");
            return (Criteria) this;
        }

        public Criteria andEmpWageTypeNotBetween(String value1, String value2) {
            addCriterion("emp_wage_type not between", value1, value2, "empWageType");
            return (Criteria) this;
        }

        public Criteria andEmployFromIsNull() {
            addCriterion("employ_from is null");
            return (Criteria) this;
        }

        public Criteria andEmployFromIsNotNull() {
            addCriterion("employ_from is not null");
            return (Criteria) this;
        }

        public Criteria andEmployFromEqualTo(String value) {
            addCriterion("employ_from =", value, "employFrom");
            return (Criteria) this;
        }

        public Criteria andEmployFromNotEqualTo(String value) {
            addCriterion("employ_from <>", value, "employFrom");
            return (Criteria) this;
        }

        public Criteria andEmployFromGreaterThan(String value) {
            addCriterion("employ_from >", value, "employFrom");
            return (Criteria) this;
        }

        public Criteria andEmployFromGreaterThanOrEqualTo(String value) {
            addCriterion("employ_from >=", value, "employFrom");
            return (Criteria) this;
        }

        public Criteria andEmployFromLessThan(String value) {
            addCriterion("employ_from <", value, "employFrom");
            return (Criteria) this;
        }

        public Criteria andEmployFromLessThanOrEqualTo(String value) {
            addCriterion("employ_from <=", value, "employFrom");
            return (Criteria) this;
        }

        public Criteria andEmployFromLike(String value) {
            addCriterion("employ_from like", value, "employFrom");
            return (Criteria) this;
        }

        public Criteria andEmployFromNotLike(String value) {
            addCriterion("employ_from not like", value, "employFrom");
            return (Criteria) this;
        }

        public Criteria andEmployFromIn(List<String> values) {
            addCriterion("employ_from in", values, "employFrom");
            return (Criteria) this;
        }

        public Criteria andEmployFromNotIn(List<String> values) {
            addCriterion("employ_from not in", values, "employFrom");
            return (Criteria) this;
        }

        public Criteria andEmployFromBetween(String value1, String value2) {
            addCriterion("employ_from between", value1, value2, "employFrom");
            return (Criteria) this;
        }

        public Criteria andEmployFromNotBetween(String value1, String value2) {
            addCriterion("employ_from not between", value1, value2, "employFrom");
            return (Criteria) this;
        }

        public Criteria andEmployTypeIsNull() {
            addCriterion("employ_type is null");
            return (Criteria) this;
        }

        public Criteria andEmployTypeIsNotNull() {
            addCriterion("employ_type is not null");
            return (Criteria) this;
        }

        public Criteria andEmployTypeEqualTo(String value) {
            addCriterion("employ_type =", value, "employType");
            return (Criteria) this;
        }

        public Criteria andEmployTypeNotEqualTo(String value) {
            addCriterion("employ_type <>", value, "employType");
            return (Criteria) this;
        }

        public Criteria andEmployTypeGreaterThan(String value) {
            addCriterion("employ_type >", value, "employType");
            return (Criteria) this;
        }

        public Criteria andEmployTypeGreaterThanOrEqualTo(String value) {
            addCriterion("employ_type >=", value, "employType");
            return (Criteria) this;
        }

        public Criteria andEmployTypeLessThan(String value) {
            addCriterion("employ_type <", value, "employType");
            return (Criteria) this;
        }

        public Criteria andEmployTypeLessThanOrEqualTo(String value) {
            addCriterion("employ_type <=", value, "employType");
            return (Criteria) this;
        }

        public Criteria andEmployTypeLike(String value) {
            addCriterion("employ_type like", value, "employType");
            return (Criteria) this;
        }

        public Criteria andEmployTypeNotLike(String value) {
            addCriterion("employ_type not like", value, "employType");
            return (Criteria) this;
        }

        public Criteria andEmployTypeIn(List<String> values) {
            addCriterion("employ_type in", values, "employType");
            return (Criteria) this;
        }

        public Criteria andEmployTypeNotIn(List<String> values) {
            addCriterion("employ_type not in", values, "employType");
            return (Criteria) this;
        }

        public Criteria andEmployTypeBetween(String value1, String value2) {
            addCriterion("employ_type between", value1, value2, "employType");
            return (Criteria) this;
        }

        public Criteria andEmployTypeNotBetween(String value1, String value2) {
            addCriterion("employ_type not between", value1, value2, "employType");
            return (Criteria) this;
        }

        public Criteria andEndowmentAccountIsNull() {
            addCriterion("endowment_account is null");
            return (Criteria) this;
        }

        public Criteria andEndowmentAccountIsNotNull() {
            addCriterion("endowment_account is not null");
            return (Criteria) this;
        }

        public Criteria andEndowmentAccountEqualTo(String value) {
            addCriterion("endowment_account =", value, "endowmentAccount");
            return (Criteria) this;
        }

        public Criteria andEndowmentAccountNotEqualTo(String value) {
            addCriterion("endowment_account <>", value, "endowmentAccount");
            return (Criteria) this;
        }

        public Criteria andEndowmentAccountGreaterThan(String value) {
            addCriterion("endowment_account >", value, "endowmentAccount");
            return (Criteria) this;
        }

        public Criteria andEndowmentAccountGreaterThanOrEqualTo(String value) {
            addCriterion("endowment_account >=", value, "endowmentAccount");
            return (Criteria) this;
        }

        public Criteria andEndowmentAccountLessThan(String value) {
            addCriterion("endowment_account <", value, "endowmentAccount");
            return (Criteria) this;
        }

        public Criteria andEndowmentAccountLessThanOrEqualTo(String value) {
            addCriterion("endowment_account <=", value, "endowmentAccount");
            return (Criteria) this;
        }

        public Criteria andEndowmentAccountLike(String value) {
            addCriterion("endowment_account like", value, "endowmentAccount");
            return (Criteria) this;
        }

        public Criteria andEndowmentAccountNotLike(String value) {
            addCriterion("endowment_account not like", value, "endowmentAccount");
            return (Criteria) this;
        }

        public Criteria andEndowmentAccountIn(List<String> values) {
            addCriterion("endowment_account in", values, "endowmentAccount");
            return (Criteria) this;
        }

        public Criteria andEndowmentAccountNotIn(List<String> values) {
            addCriterion("endowment_account not in", values, "endowmentAccount");
            return (Criteria) this;
        }

        public Criteria andEndowmentAccountBetween(String value1, String value2) {
            addCriterion("endowment_account between", value1, value2, "endowmentAccount");
            return (Criteria) this;
        }

        public Criteria andEndowmentAccountNotBetween(String value1, String value2) {
            addCriterion("endowment_account not between", value1, value2, "endowmentAccount");
            return (Criteria) this;
        }

        public Criteria andExt1IsNull() {
            addCriterion("ext_1 is null");
            return (Criteria) this;
        }

        public Criteria andExt1IsNotNull() {
            addCriterion("ext_1 is not null");
            return (Criteria) this;
        }

        public Criteria andExt1EqualTo(String value) {
            addCriterion("ext_1 =", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotEqualTo(String value) {
            addCriterion("ext_1 <>", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThan(String value) {
            addCriterion("ext_1 >", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThanOrEqualTo(String value) {
            addCriterion("ext_1 >=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThan(String value) {
            addCriterion("ext_1 <", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThanOrEqualTo(String value) {
            addCriterion("ext_1 <=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Like(String value) {
            addCriterion("ext_1 like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotLike(String value) {
            addCriterion("ext_1 not like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1In(List<String> values) {
            addCriterion("ext_1 in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotIn(List<String> values) {
            addCriterion("ext_1 not in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Between(String value1, String value2) {
            addCriterion("ext_1 between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotBetween(String value1, String value2) {
            addCriterion("ext_1 not between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt2IsNull() {
            addCriterion("ext_2 is null");
            return (Criteria) this;
        }

        public Criteria andExt2IsNotNull() {
            addCriterion("ext_2 is not null");
            return (Criteria) this;
        }

        public Criteria andExt2EqualTo(String value) {
            addCriterion("ext_2 =", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotEqualTo(String value) {
            addCriterion("ext_2 <>", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThan(String value) {
            addCriterion("ext_2 >", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThanOrEqualTo(String value) {
            addCriterion("ext_2 >=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThan(String value) {
            addCriterion("ext_2 <", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThanOrEqualTo(String value) {
            addCriterion("ext_2 <=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Like(String value) {
            addCriterion("ext_2 like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotLike(String value) {
            addCriterion("ext_2 not like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2In(List<String> values) {
            addCriterion("ext_2 in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotIn(List<String> values) {
            addCriterion("ext_2 not in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Between(String value1, String value2) {
            addCriterion("ext_2 between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotBetween(String value1, String value2) {
            addCriterion("ext_2 not between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt3IsNull() {
            addCriterion("ext_3 is null");
            return (Criteria) this;
        }

        public Criteria andExt3IsNotNull() {
            addCriterion("ext_3 is not null");
            return (Criteria) this;
        }

        public Criteria andExt3EqualTo(String value) {
            addCriterion("ext_3 =", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotEqualTo(String value) {
            addCriterion("ext_3 <>", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThan(String value) {
            addCriterion("ext_3 >", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThanOrEqualTo(String value) {
            addCriterion("ext_3 >=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThan(String value) {
            addCriterion("ext_3 <", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThanOrEqualTo(String value) {
            addCriterion("ext_3 <=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Like(String value) {
            addCriterion("ext_3 like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotLike(String value) {
            addCriterion("ext_3 not like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3In(List<String> values) {
            addCriterion("ext_3 in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotIn(List<String> values) {
            addCriterion("ext_3 not in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Between(String value1, String value2) {
            addCriterion("ext_3 between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotBetween(String value1, String value2) {
            addCriterion("ext_3 not between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt4IsNull() {
            addCriterion("ext_4 is null");
            return (Criteria) this;
        }

        public Criteria andExt4IsNotNull() {
            addCriterion("ext_4 is not null");
            return (Criteria) this;
        }

        public Criteria andExt4EqualTo(String value) {
            addCriterion("ext_4 =", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotEqualTo(String value) {
            addCriterion("ext_4 <>", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThan(String value) {
            addCriterion("ext_4 >", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThanOrEqualTo(String value) {
            addCriterion("ext_4 >=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThan(String value) {
            addCriterion("ext_4 <", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThanOrEqualTo(String value) {
            addCriterion("ext_4 <=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Like(String value) {
            addCriterion("ext_4 like", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotLike(String value) {
            addCriterion("ext_4 not like", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4In(List<String> values) {
            addCriterion("ext_4 in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotIn(List<String> values) {
            addCriterion("ext_4 not in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Between(String value1, String value2) {
            addCriterion("ext_4 between", value1, value2, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotBetween(String value1, String value2) {
            addCriterion("ext_4 not between", value1, value2, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt5IsNull() {
            addCriterion("ext_5 is null");
            return (Criteria) this;
        }

        public Criteria andExt5IsNotNull() {
            addCriterion("ext_5 is not null");
            return (Criteria) this;
        }

        public Criteria andExt5EqualTo(String value) {
            addCriterion("ext_5 =", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotEqualTo(String value) {
            addCriterion("ext_5 <>", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5GreaterThan(String value) {
            addCriterion("ext_5 >", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5GreaterThanOrEqualTo(String value) {
            addCriterion("ext_5 >=", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5LessThan(String value) {
            addCriterion("ext_5 <", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5LessThanOrEqualTo(String value) {
            addCriterion("ext_5 <=", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5Like(String value) {
            addCriterion("ext_5 like", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotLike(String value) {
            addCriterion("ext_5 not like", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5In(List<String> values) {
            addCriterion("ext_5 in", values, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotIn(List<String> values) {
            addCriterion("ext_5 not in", values, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5Between(String value1, String value2) {
            addCriterion("ext_5 between", value1, value2, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotBetween(String value1, String value2) {
            addCriterion("ext_5 not between", value1, value2, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt6IsNull() {
            addCriterion("ext_6 is null");
            return (Criteria) this;
        }

        public Criteria andExt6IsNotNull() {
            addCriterion("ext_6 is not null");
            return (Criteria) this;
        }

        public Criteria andExt6EqualTo(String value) {
            addCriterion("ext_6 =", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6NotEqualTo(String value) {
            addCriterion("ext_6 <>", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6GreaterThan(String value) {
            addCriterion("ext_6 >", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6GreaterThanOrEqualTo(String value) {
            addCriterion("ext_6 >=", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6LessThan(String value) {
            addCriterion("ext_6 <", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6LessThanOrEqualTo(String value) {
            addCriterion("ext_6 <=", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6Like(String value) {
            addCriterion("ext_6 like", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6NotLike(String value) {
            addCriterion("ext_6 not like", value, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6In(List<String> values) {
            addCriterion("ext_6 in", values, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6NotIn(List<String> values) {
            addCriterion("ext_6 not in", values, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6Between(String value1, String value2) {
            addCriterion("ext_6 between", value1, value2, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt6NotBetween(String value1, String value2) {
            addCriterion("ext_6 not between", value1, value2, "ext6");
            return (Criteria) this;
        }

        public Criteria andExt7IsNull() {
            addCriterion("ext_7 is null");
            return (Criteria) this;
        }

        public Criteria andExt7IsNotNull() {
            addCriterion("ext_7 is not null");
            return (Criteria) this;
        }

        public Criteria andExt7EqualTo(String value) {
            addCriterion("ext_7 =", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7NotEqualTo(String value) {
            addCriterion("ext_7 <>", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7GreaterThan(String value) {
            addCriterion("ext_7 >", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7GreaterThanOrEqualTo(String value) {
            addCriterion("ext_7 >=", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7LessThan(String value) {
            addCriterion("ext_7 <", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7LessThanOrEqualTo(String value) {
            addCriterion("ext_7 <=", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7Like(String value) {
            addCriterion("ext_7 like", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7NotLike(String value) {
            addCriterion("ext_7 not like", value, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7In(List<String> values) {
            addCriterion("ext_7 in", values, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7NotIn(List<String> values) {
            addCriterion("ext_7 not in", values, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7Between(String value1, String value2) {
            addCriterion("ext_7 between", value1, value2, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt7NotBetween(String value1, String value2) {
            addCriterion("ext_7 not between", value1, value2, "ext7");
            return (Criteria) this;
        }

        public Criteria andExt8IsNull() {
            addCriterion("ext_8 is null");
            return (Criteria) this;
        }

        public Criteria andExt8IsNotNull() {
            addCriterion("ext_8 is not null");
            return (Criteria) this;
        }

        public Criteria andExt8EqualTo(String value) {
            addCriterion("ext_8 =", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8NotEqualTo(String value) {
            addCriterion("ext_8 <>", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8GreaterThan(String value) {
            addCriterion("ext_8 >", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8GreaterThanOrEqualTo(String value) {
            addCriterion("ext_8 >=", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8LessThan(String value) {
            addCriterion("ext_8 <", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8LessThanOrEqualTo(String value) {
            addCriterion("ext_8 <=", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8Like(String value) {
            addCriterion("ext_8 like", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8NotLike(String value) {
            addCriterion("ext_8 not like", value, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8In(List<String> values) {
            addCriterion("ext_8 in", values, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8NotIn(List<String> values) {
            addCriterion("ext_8 not in", values, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8Between(String value1, String value2) {
            addCriterion("ext_8 between", value1, value2, "ext8");
            return (Criteria) this;
        }

        public Criteria andExt8NotBetween(String value1, String value2) {
            addCriterion("ext_8 not between", value1, value2, "ext8");
            return (Criteria) this;
        }

        public Criteria andFileLocationIsNull() {
            addCriterion("file_location is null");
            return (Criteria) this;
        }

        public Criteria andFileLocationIsNotNull() {
            addCriterion("file_location is not null");
            return (Criteria) this;
        }

        public Criteria andFileLocationEqualTo(String value) {
            addCriterion("file_location =", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationNotEqualTo(String value) {
            addCriterion("file_location <>", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationGreaterThan(String value) {
            addCriterion("file_location >", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationGreaterThanOrEqualTo(String value) {
            addCriterion("file_location >=", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationLessThan(String value) {
            addCriterion("file_location <", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationLessThanOrEqualTo(String value) {
            addCriterion("file_location <=", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationLike(String value) {
            addCriterion("file_location like", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationNotLike(String value) {
            addCriterion("file_location not like", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationIn(List<String> values) {
            addCriterion("file_location in", values, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationNotIn(List<String> values) {
            addCriterion("file_location not in", values, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationBetween(String value1, String value2) {
            addCriterion("file_location between", value1, value2, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationNotBetween(String value1, String value2) {
            addCriterion("file_location not between", value1, value2, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andGraduateDateIsNull() {
            addCriterion("graduate_date is null");
            return (Criteria) this;
        }

        public Criteria andGraduateDateIsNotNull() {
            addCriterion("graduate_date is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateDateEqualTo(String value) {
            addCriterion("graduate_date =", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateNotEqualTo(String value) {
            addCriterion("graduate_date <>", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateGreaterThan(String value) {
            addCriterion("graduate_date >", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateGreaterThanOrEqualTo(String value) {
            addCriterion("graduate_date >=", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateLessThan(String value) {
            addCriterion("graduate_date <", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateLessThanOrEqualTo(String value) {
            addCriterion("graduate_date <=", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateLike(String value) {
            addCriterion("graduate_date like", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateNotLike(String value) {
            addCriterion("graduate_date not like", value, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateIn(List<String> values) {
            addCriterion("graduate_date in", values, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateNotIn(List<String> values) {
            addCriterion("graduate_date not in", values, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateBetween(String value1, String value2) {
            addCriterion("graduate_date between", value1, value2, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andGraduateDateNotBetween(String value1, String value2) {
            addCriterion("graduate_date not between", value1, value2, "graduateDate");
            return (Criteria) this;
        }

        public Criteria andHireDateIsNull() {
            addCriterion("hire_date is null");
            return (Criteria) this;
        }

        public Criteria andHireDateIsNotNull() {
            addCriterion("hire_date is not null");
            return (Criteria) this;
        }

        public Criteria andHireDateEqualTo(String value) {
            addCriterion("hire_date =", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateNotEqualTo(String value) {
            addCriterion("hire_date <>", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateGreaterThan(String value) {
            addCriterion("hire_date >", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateGreaterThanOrEqualTo(String value) {
            addCriterion("hire_date >=", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateLessThan(String value) {
            addCriterion("hire_date <", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateLessThanOrEqualTo(String value) {
            addCriterion("hire_date <=", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateLike(String value) {
            addCriterion("hire_date like", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateNotLike(String value) {
            addCriterion("hire_date not like", value, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateIn(List<String> values) {
            addCriterion("hire_date in", values, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateNotIn(List<String> values) {
            addCriterion("hire_date not in", values, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateBetween(String value1, String value2) {
            addCriterion("hire_date between", value1, value2, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHireDateNotBetween(String value1, String value2) {
            addCriterion("hire_date not between", value1, value2, "hireDate");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNull() {
            addCriterion("home_address is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNotNull() {
            addCriterion("home_address is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressEqualTo(String value) {
            addCriterion("home_address =", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotEqualTo(String value) {
            addCriterion("home_address <>", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThan(String value) {
            addCriterion("home_address >", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("home_address >=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThan(String value) {
            addCriterion("home_address <", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("home_address <=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLike(String value) {
            addCriterion("home_address like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotLike(String value) {
            addCriterion("home_address not like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIn(List<String> values) {
            addCriterion("home_address in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotIn(List<String> values) {
            addCriterion("home_address not in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressBetween(String value1, String value2) {
            addCriterion("home_address between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotBetween(String value1, String value2) {
            addCriterion("home_address not between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNull() {
            addCriterion("home_phone is null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNotNull() {
            addCriterion("home_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneEqualTo(String value) {
            addCriterion("home_phone =", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotEqualTo(String value) {
            addCriterion("home_phone <>", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThan(String value) {
            addCriterion("home_phone >", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("home_phone >=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThan(String value) {
            addCriterion("home_phone <", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThanOrEqualTo(String value) {
            addCriterion("home_phone <=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLike(String value) {
            addCriterion("home_phone like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotLike(String value) {
            addCriterion("home_phone not like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIn(List<String> values) {
            addCriterion("home_phone in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotIn(List<String> values) {
            addCriterion("home_phone not in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneBetween(String value1, String value2) {
            addCriterion("home_phone between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotBetween(String value1, String value2) {
            addCriterion("home_phone not between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHousingAccountIsNull() {
            addCriterion("housing_account is null");
            return (Criteria) this;
        }

        public Criteria andHousingAccountIsNotNull() {
            addCriterion("housing_account is not null");
            return (Criteria) this;
        }

        public Criteria andHousingAccountEqualTo(String value) {
            addCriterion("housing_account =", value, "housingAccount");
            return (Criteria) this;
        }

        public Criteria andHousingAccountNotEqualTo(String value) {
            addCriterion("housing_account <>", value, "housingAccount");
            return (Criteria) this;
        }

        public Criteria andHousingAccountGreaterThan(String value) {
            addCriterion("housing_account >", value, "housingAccount");
            return (Criteria) this;
        }

        public Criteria andHousingAccountGreaterThanOrEqualTo(String value) {
            addCriterion("housing_account >=", value, "housingAccount");
            return (Criteria) this;
        }

        public Criteria andHousingAccountLessThan(String value) {
            addCriterion("housing_account <", value, "housingAccount");
            return (Criteria) this;
        }

        public Criteria andHousingAccountLessThanOrEqualTo(String value) {
            addCriterion("housing_account <=", value, "housingAccount");
            return (Criteria) this;
        }

        public Criteria andHousingAccountLike(String value) {
            addCriterion("housing_account like", value, "housingAccount");
            return (Criteria) this;
        }

        public Criteria andHousingAccountNotLike(String value) {
            addCriterion("housing_account not like", value, "housingAccount");
            return (Criteria) this;
        }

        public Criteria andHousingAccountIn(List<String> values) {
            addCriterion("housing_account in", values, "housingAccount");
            return (Criteria) this;
        }

        public Criteria andHousingAccountNotIn(List<String> values) {
            addCriterion("housing_account not in", values, "housingAccount");
            return (Criteria) this;
        }

        public Criteria andHousingAccountBetween(String value1, String value2) {
            addCriterion("housing_account between", value1, value2, "housingAccount");
            return (Criteria) this;
        }

        public Criteria andHousingAccountNotBetween(String value1, String value2) {
            addCriterion("housing_account not between", value1, value2, "housingAccount");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseIsNull() {
            addCriterion("leave_cause is null");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseIsNotNull() {
            addCriterion("leave_cause is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseEqualTo(String value) {
            addCriterion("leave_cause =", value, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseNotEqualTo(String value) {
            addCriterion("leave_cause <>", value, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseGreaterThan(String value) {
            addCriterion("leave_cause >", value, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseGreaterThanOrEqualTo(String value) {
            addCriterion("leave_cause >=", value, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseLessThan(String value) {
            addCriterion("leave_cause <", value, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseLessThanOrEqualTo(String value) {
            addCriterion("leave_cause <=", value, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseLike(String value) {
            addCriterion("leave_cause like", value, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseNotLike(String value) {
            addCriterion("leave_cause not like", value, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseIn(List<String> values) {
            addCriterion("leave_cause in", values, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseNotIn(List<String> values) {
            addCriterion("leave_cause not in", values, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseBetween(String value1, String value2) {
            addCriterion("leave_cause between", value1, value2, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseNotBetween(String value1, String value2) {
            addCriterion("leave_cause not between", value1, value2, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveDateIsNull() {
            addCriterion("leave_date is null");
            return (Criteria) this;
        }

        public Criteria andLeaveDateIsNotNull() {
            addCriterion("leave_date is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveDateEqualTo(String value) {
            addCriterion("leave_date =", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateNotEqualTo(String value) {
            addCriterion("leave_date <>", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateGreaterThan(String value) {
            addCriterion("leave_date >", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateGreaterThanOrEqualTo(String value) {
            addCriterion("leave_date >=", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateLessThan(String value) {
            addCriterion("leave_date <", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateLessThanOrEqualTo(String value) {
            addCriterion("leave_date <=", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateLike(String value) {
            addCriterion("leave_date like", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateNotLike(String value) {
            addCriterion("leave_date not like", value, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateIn(List<String> values) {
            addCriterion("leave_date in", values, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateNotIn(List<String> values) {
            addCriterion("leave_date not in", values, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateBetween(String value1, String value2) {
            addCriterion("leave_date between", value1, value2, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveDateNotBetween(String value1, String value2) {
            addCriterion("leave_date not between", value1, value2, "leaveDate");
            return (Criteria) this;
        }

        public Criteria andLeaveMethodIsNull() {
            addCriterion("leave_method is null");
            return (Criteria) this;
        }

        public Criteria andLeaveMethodIsNotNull() {
            addCriterion("leave_method is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveMethodEqualTo(String value) {
            addCriterion("leave_method =", value, "leaveMethod");
            return (Criteria) this;
        }

        public Criteria andLeaveMethodNotEqualTo(String value) {
            addCriterion("leave_method <>", value, "leaveMethod");
            return (Criteria) this;
        }

        public Criteria andLeaveMethodGreaterThan(String value) {
            addCriterion("leave_method >", value, "leaveMethod");
            return (Criteria) this;
        }

        public Criteria andLeaveMethodGreaterThanOrEqualTo(String value) {
            addCriterion("leave_method >=", value, "leaveMethod");
            return (Criteria) this;
        }

        public Criteria andLeaveMethodLessThan(String value) {
            addCriterion("leave_method <", value, "leaveMethod");
            return (Criteria) this;
        }

        public Criteria andLeaveMethodLessThanOrEqualTo(String value) {
            addCriterion("leave_method <=", value, "leaveMethod");
            return (Criteria) this;
        }

        public Criteria andLeaveMethodLike(String value) {
            addCriterion("leave_method like", value, "leaveMethod");
            return (Criteria) this;
        }

        public Criteria andLeaveMethodNotLike(String value) {
            addCriterion("leave_method not like", value, "leaveMethod");
            return (Criteria) this;
        }

        public Criteria andLeaveMethodIn(List<String> values) {
            addCriterion("leave_method in", values, "leaveMethod");
            return (Criteria) this;
        }

        public Criteria andLeaveMethodNotIn(List<String> values) {
            addCriterion("leave_method not in", values, "leaveMethod");
            return (Criteria) this;
        }

        public Criteria andLeaveMethodBetween(String value1, String value2) {
            addCriterion("leave_method between", value1, value2, "leaveMethod");
            return (Criteria) this;
        }

        public Criteria andLeaveMethodNotBetween(String value1, String value2) {
            addCriterion("leave_method not between", value1, value2, "leaveMethod");
            return (Criteria) this;
        }

        public Criteria andMarriageFlagIsNull() {
            addCriterion("marriage_flag is null");
            return (Criteria) this;
        }

        public Criteria andMarriageFlagIsNotNull() {
            addCriterion("marriage_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageFlagEqualTo(String value) {
            addCriterion("marriage_flag =", value, "marriageFlag");
            return (Criteria) this;
        }

        public Criteria andMarriageFlagNotEqualTo(String value) {
            addCriterion("marriage_flag <>", value, "marriageFlag");
            return (Criteria) this;
        }

        public Criteria andMarriageFlagGreaterThan(String value) {
            addCriterion("marriage_flag >", value, "marriageFlag");
            return (Criteria) this;
        }

        public Criteria andMarriageFlagGreaterThanOrEqualTo(String value) {
            addCriterion("marriage_flag >=", value, "marriageFlag");
            return (Criteria) this;
        }

        public Criteria andMarriageFlagLessThan(String value) {
            addCriterion("marriage_flag <", value, "marriageFlag");
            return (Criteria) this;
        }

        public Criteria andMarriageFlagLessThanOrEqualTo(String value) {
            addCriterion("marriage_flag <=", value, "marriageFlag");
            return (Criteria) this;
        }

        public Criteria andMarriageFlagLike(String value) {
            addCriterion("marriage_flag like", value, "marriageFlag");
            return (Criteria) this;
        }

        public Criteria andMarriageFlagNotLike(String value) {
            addCriterion("marriage_flag not like", value, "marriageFlag");
            return (Criteria) this;
        }

        public Criteria andMarriageFlagIn(List<String> values) {
            addCriterion("marriage_flag in", values, "marriageFlag");
            return (Criteria) this;
        }

        public Criteria andMarriageFlagNotIn(List<String> values) {
            addCriterion("marriage_flag not in", values, "marriageFlag");
            return (Criteria) this;
        }

        public Criteria andMarriageFlagBetween(String value1, String value2) {
            addCriterion("marriage_flag between", value1, value2, "marriageFlag");
            return (Criteria) this;
        }

        public Criteria andMarriageFlagNotBetween(String value1, String value2) {
            addCriterion("marriage_flag not between", value1, value2, "marriageFlag");
            return (Criteria) this;
        }

        public Criteria andMedicareAccountIsNull() {
            addCriterion("medicare_account is null");
            return (Criteria) this;
        }

        public Criteria andMedicareAccountIsNotNull() {
            addCriterion("medicare_account is not null");
            return (Criteria) this;
        }

        public Criteria andMedicareAccountEqualTo(String value) {
            addCriterion("medicare_account =", value, "medicareAccount");
            return (Criteria) this;
        }

        public Criteria andMedicareAccountNotEqualTo(String value) {
            addCriterion("medicare_account <>", value, "medicareAccount");
            return (Criteria) this;
        }

        public Criteria andMedicareAccountGreaterThan(String value) {
            addCriterion("medicare_account >", value, "medicareAccount");
            return (Criteria) this;
        }

        public Criteria andMedicareAccountGreaterThanOrEqualTo(String value) {
            addCriterion("medicare_account >=", value, "medicareAccount");
            return (Criteria) this;
        }

        public Criteria andMedicareAccountLessThan(String value) {
            addCriterion("medicare_account <", value, "medicareAccount");
            return (Criteria) this;
        }

        public Criteria andMedicareAccountLessThanOrEqualTo(String value) {
            addCriterion("medicare_account <=", value, "medicareAccount");
            return (Criteria) this;
        }

        public Criteria andMedicareAccountLike(String value) {
            addCriterion("medicare_account like", value, "medicareAccount");
            return (Criteria) this;
        }

        public Criteria andMedicareAccountNotLike(String value) {
            addCriterion("medicare_account not like", value, "medicareAccount");
            return (Criteria) this;
        }

        public Criteria andMedicareAccountIn(List<String> values) {
            addCriterion("medicare_account in", values, "medicareAccount");
            return (Criteria) this;
        }

        public Criteria andMedicareAccountNotIn(List<String> values) {
            addCriterion("medicare_account not in", values, "medicareAccount");
            return (Criteria) this;
        }

        public Criteria andMedicareAccountBetween(String value1, String value2) {
            addCriterion("medicare_account between", value1, value2, "medicareAccount");
            return (Criteria) this;
        }

        public Criteria andMedicareAccountNotBetween(String value1, String value2) {
            addCriterion("medicare_account not between", value1, value2, "medicareAccount");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMsnNoIsNull() {
            addCriterion("msn_no is null");
            return (Criteria) this;
        }

        public Criteria andMsnNoIsNotNull() {
            addCriterion("msn_no is not null");
            return (Criteria) this;
        }

        public Criteria andMsnNoEqualTo(String value) {
            addCriterion("msn_no =", value, "msnNo");
            return (Criteria) this;
        }

        public Criteria andMsnNoNotEqualTo(String value) {
            addCriterion("msn_no <>", value, "msnNo");
            return (Criteria) this;
        }

        public Criteria andMsnNoGreaterThan(String value) {
            addCriterion("msn_no >", value, "msnNo");
            return (Criteria) this;
        }

        public Criteria andMsnNoGreaterThanOrEqualTo(String value) {
            addCriterion("msn_no >=", value, "msnNo");
            return (Criteria) this;
        }

        public Criteria andMsnNoLessThan(String value) {
            addCriterion("msn_no <", value, "msnNo");
            return (Criteria) this;
        }

        public Criteria andMsnNoLessThanOrEqualTo(String value) {
            addCriterion("msn_no <=", value, "msnNo");
            return (Criteria) this;
        }

        public Criteria andMsnNoLike(String value) {
            addCriterion("msn_no like", value, "msnNo");
            return (Criteria) this;
        }

        public Criteria andMsnNoNotLike(String value) {
            addCriterion("msn_no not like", value, "msnNo");
            return (Criteria) this;
        }

        public Criteria andMsnNoIn(List<String> values) {
            addCriterion("msn_no in", values, "msnNo");
            return (Criteria) this;
        }

        public Criteria andMsnNoNotIn(List<String> values) {
            addCriterion("msn_no not in", values, "msnNo");
            return (Criteria) this;
        }

        public Criteria andMsnNoBetween(String value1, String value2) {
            addCriterion("msn_no between", value1, value2, "msnNo");
            return (Criteria) this;
        }

        public Criteria andMsnNoNotBetween(String value1, String value2) {
            addCriterion("msn_no not between", value1, value2, "msnNo");
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

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNull() {
            addCriterion("native_place is null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNotNull() {
            addCriterion("native_place is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceEqualTo(String value) {
            addCriterion("native_place =", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotEqualTo(String value) {
            addCriterion("native_place <>", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThan(String value) {
            addCriterion("native_place >", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("native_place >=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThan(String value) {
            addCriterion("native_place <", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("native_place <=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLike(String value) {
            addCriterion("native_place like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotLike(String value) {
            addCriterion("native_place not like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIn(List<String> values) {
            addCriterion("native_place in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotIn(List<String> values) {
            addCriterion("native_place not in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceBetween(String value1, String value2) {
            addCriterion("native_place between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotBetween(String value1, String value2) {
            addCriterion("native_place not between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNoteInfoIsNull() {
            addCriterion("note_info is null");
            return (Criteria) this;
        }

        public Criteria andNoteInfoIsNotNull() {
            addCriterion("note_info is not null");
            return (Criteria) this;
        }

        public Criteria andNoteInfoEqualTo(String value) {
            addCriterion("note_info =", value, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoNotEqualTo(String value) {
            addCriterion("note_info <>", value, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoGreaterThan(String value) {
            addCriterion("note_info >", value, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoGreaterThanOrEqualTo(String value) {
            addCriterion("note_info >=", value, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoLessThan(String value) {
            addCriterion("note_info <", value, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoLessThanOrEqualTo(String value) {
            addCriterion("note_info <=", value, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoLike(String value) {
            addCriterion("note_info like", value, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoNotLike(String value) {
            addCriterion("note_info not like", value, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoIn(List<String> values) {
            addCriterion("note_info in", values, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoNotIn(List<String> values) {
            addCriterion("note_info not in", values, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoBetween(String value1, String value2) {
            addCriterion("note_info between", value1, value2, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andNoteInfoNotBetween(String value1, String value2) {
            addCriterion("note_info not between", value1, value2, "noteInfo");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOtherImNoIsNull() {
            addCriterion("other_im_no is null");
            return (Criteria) this;
        }

        public Criteria andOtherImNoIsNotNull() {
            addCriterion("other_im_no is not null");
            return (Criteria) this;
        }

        public Criteria andOtherImNoEqualTo(String value) {
            addCriterion("other_im_no =", value, "otherImNo");
            return (Criteria) this;
        }

        public Criteria andOtherImNoNotEqualTo(String value) {
            addCriterion("other_im_no <>", value, "otherImNo");
            return (Criteria) this;
        }

        public Criteria andOtherImNoGreaterThan(String value) {
            addCriterion("other_im_no >", value, "otherImNo");
            return (Criteria) this;
        }

        public Criteria andOtherImNoGreaterThanOrEqualTo(String value) {
            addCriterion("other_im_no >=", value, "otherImNo");
            return (Criteria) this;
        }

        public Criteria andOtherImNoLessThan(String value) {
            addCriterion("other_im_no <", value, "otherImNo");
            return (Criteria) this;
        }

        public Criteria andOtherImNoLessThanOrEqualTo(String value) {
            addCriterion("other_im_no <=", value, "otherImNo");
            return (Criteria) this;
        }

        public Criteria andOtherImNoLike(String value) {
            addCriterion("other_im_no like", value, "otherImNo");
            return (Criteria) this;
        }

        public Criteria andOtherImNoNotLike(String value) {
            addCriterion("other_im_no not like", value, "otherImNo");
            return (Criteria) this;
        }

        public Criteria andOtherImNoIn(List<String> values) {
            addCriterion("other_im_no in", values, "otherImNo");
            return (Criteria) this;
        }

        public Criteria andOtherImNoNotIn(List<String> values) {
            addCriterion("other_im_no not in", values, "otherImNo");
            return (Criteria) this;
        }

        public Criteria andOtherImNoBetween(String value1, String value2) {
            addCriterion("other_im_no between", value1, value2, "otherImNo");
            return (Criteria) this;
        }

        public Criteria andOtherImNoNotBetween(String value1, String value2) {
            addCriterion("other_im_no not between", value1, value2, "otherImNo");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNull() {
            addCriterion("paper_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNotNull() {
            addCriterion("paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperIdEqualTo(String value) {
            addCriterion("paper_id =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotEqualTo(String value) {
            addCriterion("paper_id <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThan(String value) {
            addCriterion("paper_id >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThanOrEqualTo(String value) {
            addCriterion("paper_id >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThan(String value) {
            addCriterion("paper_id <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThanOrEqualTo(String value) {
            addCriterion("paper_id <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLike(String value) {
            addCriterion("paper_id like", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotLike(String value) {
            addCriterion("paper_id not like", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIn(List<String> values) {
            addCriterion("paper_id in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotIn(List<String> values) {
            addCriterion("paper_id not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdBetween(String value1, String value2) {
            addCriterion("paper_id between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotBetween(String value1, String value2) {
            addCriterion("paper_id not between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPersonWebIsNull() {
            addCriterion("person_web is null");
            return (Criteria) this;
        }

        public Criteria andPersonWebIsNotNull() {
            addCriterion("person_web is not null");
            return (Criteria) this;
        }

        public Criteria andPersonWebEqualTo(String value) {
            addCriterion("person_web =", value, "personWeb");
            return (Criteria) this;
        }

        public Criteria andPersonWebNotEqualTo(String value) {
            addCriterion("person_web <>", value, "personWeb");
            return (Criteria) this;
        }

        public Criteria andPersonWebGreaterThan(String value) {
            addCriterion("person_web >", value, "personWeb");
            return (Criteria) this;
        }

        public Criteria andPersonWebGreaterThanOrEqualTo(String value) {
            addCriterion("person_web >=", value, "personWeb");
            return (Criteria) this;
        }

        public Criteria andPersonWebLessThan(String value) {
            addCriterion("person_web <", value, "personWeb");
            return (Criteria) this;
        }

        public Criteria andPersonWebLessThanOrEqualTo(String value) {
            addCriterion("person_web <=", value, "personWeb");
            return (Criteria) this;
        }

        public Criteria andPersonWebLike(String value) {
            addCriterion("person_web like", value, "personWeb");
            return (Criteria) this;
        }

        public Criteria andPersonWebNotLike(String value) {
            addCriterion("person_web not like", value, "personWeb");
            return (Criteria) this;
        }

        public Criteria andPersonWebIn(List<String> values) {
            addCriterion("person_web in", values, "personWeb");
            return (Criteria) this;
        }

        public Criteria andPersonWebNotIn(List<String> values) {
            addCriterion("person_web not in", values, "personWeb");
            return (Criteria) this;
        }

        public Criteria andPersonWebBetween(String value1, String value2) {
            addCriterion("person_web between", value1, value2, "personWeb");
            return (Criteria) this;
        }

        public Criteria andPersonWebNotBetween(String value1, String value2) {
            addCriterion("person_web not between", value1, value2, "personWeb");
            return (Criteria) this;
        }

        public Criteria andPolityIsNull() {
            addCriterion("polity is null");
            return (Criteria) this;
        }

        public Criteria andPolityIsNotNull() {
            addCriterion("polity is not null");
            return (Criteria) this;
        }

        public Criteria andPolityEqualTo(String value) {
            addCriterion("polity =", value, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityNotEqualTo(String value) {
            addCriterion("polity <>", value, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityGreaterThan(String value) {
            addCriterion("polity >", value, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityGreaterThanOrEqualTo(String value) {
            addCriterion("polity >=", value, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityLessThan(String value) {
            addCriterion("polity <", value, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityLessThanOrEqualTo(String value) {
            addCriterion("polity <=", value, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityLike(String value) {
            addCriterion("polity like", value, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityNotLike(String value) {
            addCriterion("polity not like", value, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityIn(List<String> values) {
            addCriterion("polity in", values, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityNotIn(List<String> values) {
            addCriterion("polity not in", values, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityBetween(String value1, String value2) {
            addCriterion("polity between", value1, value2, "polity");
            return (Criteria) this;
        }

        public Criteria andPolityNotBetween(String value1, String value2) {
            addCriterion("polity not between", value1, value2, "polity");
            return (Criteria) this;
        }

        public Criteria andPostDateIsNull() {
            addCriterion("post_date is null");
            return (Criteria) this;
        }

        public Criteria andPostDateIsNotNull() {
            addCriterion("post_date is not null");
            return (Criteria) this;
        }

        public Criteria andPostDateEqualTo(String value) {
            addCriterion("post_date =", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateNotEqualTo(String value) {
            addCriterion("post_date <>", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateGreaterThan(String value) {
            addCriterion("post_date >", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateGreaterThanOrEqualTo(String value) {
            addCriterion("post_date >=", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateLessThan(String value) {
            addCriterion("post_date <", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateLessThanOrEqualTo(String value) {
            addCriterion("post_date <=", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateLike(String value) {
            addCriterion("post_date like", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateNotLike(String value) {
            addCriterion("post_date not like", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateIn(List<String> values) {
            addCriterion("post_date in", values, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateNotIn(List<String> values) {
            addCriterion("post_date not in", values, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateBetween(String value1, String value2) {
            addCriterion("post_date between", value1, value2, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateNotBetween(String value1, String value2) {
            addCriterion("post_date not between", value1, value2, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDegreeIsNull() {
            addCriterion("post_degree is null");
            return (Criteria) this;
        }

        public Criteria andPostDegreeIsNotNull() {
            addCriterion("post_degree is not null");
            return (Criteria) this;
        }

        public Criteria andPostDegreeEqualTo(String value) {
            addCriterion("post_degree =", value, "postDegree");
            return (Criteria) this;
        }

        public Criteria andPostDegreeNotEqualTo(String value) {
            addCriterion("post_degree <>", value, "postDegree");
            return (Criteria) this;
        }

        public Criteria andPostDegreeGreaterThan(String value) {
            addCriterion("post_degree >", value, "postDegree");
            return (Criteria) this;
        }

        public Criteria andPostDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("post_degree >=", value, "postDegree");
            return (Criteria) this;
        }

        public Criteria andPostDegreeLessThan(String value) {
            addCriterion("post_degree <", value, "postDegree");
            return (Criteria) this;
        }

        public Criteria andPostDegreeLessThanOrEqualTo(String value) {
            addCriterion("post_degree <=", value, "postDegree");
            return (Criteria) this;
        }

        public Criteria andPostDegreeLike(String value) {
            addCriterion("post_degree like", value, "postDegree");
            return (Criteria) this;
        }

        public Criteria andPostDegreeNotLike(String value) {
            addCriterion("post_degree not like", value, "postDegree");
            return (Criteria) this;
        }

        public Criteria andPostDegreeIn(List<String> values) {
            addCriterion("post_degree in", values, "postDegree");
            return (Criteria) this;
        }

        public Criteria andPostDegreeNotIn(List<String> values) {
            addCriterion("post_degree not in", values, "postDegree");
            return (Criteria) this;
        }

        public Criteria andPostDegreeBetween(String value1, String value2) {
            addCriterion("post_degree between", value1, value2, "postDegree");
            return (Criteria) this;
        }

        public Criteria andPostDegreeNotBetween(String value1, String value2) {
            addCriterion("post_degree not between", value1, value2, "postDegree");
            return (Criteria) this;
        }

        public Criteria andPracticeBegDateIsNull() {
            addCriterion("practice_beg_date is null");
            return (Criteria) this;
        }

        public Criteria andPracticeBegDateIsNotNull() {
            addCriterion("practice_beg_date is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeBegDateEqualTo(String value) {
            addCriterion("practice_beg_date =", value, "practiceBegDate");
            return (Criteria) this;
        }

        public Criteria andPracticeBegDateNotEqualTo(String value) {
            addCriterion("practice_beg_date <>", value, "practiceBegDate");
            return (Criteria) this;
        }

        public Criteria andPracticeBegDateGreaterThan(String value) {
            addCriterion("practice_beg_date >", value, "practiceBegDate");
            return (Criteria) this;
        }

        public Criteria andPracticeBegDateGreaterThanOrEqualTo(String value) {
            addCriterion("practice_beg_date >=", value, "practiceBegDate");
            return (Criteria) this;
        }

        public Criteria andPracticeBegDateLessThan(String value) {
            addCriterion("practice_beg_date <", value, "practiceBegDate");
            return (Criteria) this;
        }

        public Criteria andPracticeBegDateLessThanOrEqualTo(String value) {
            addCriterion("practice_beg_date <=", value, "practiceBegDate");
            return (Criteria) this;
        }

        public Criteria andPracticeBegDateLike(String value) {
            addCriterion("practice_beg_date like", value, "practiceBegDate");
            return (Criteria) this;
        }

        public Criteria andPracticeBegDateNotLike(String value) {
            addCriterion("practice_beg_date not like", value, "practiceBegDate");
            return (Criteria) this;
        }

        public Criteria andPracticeBegDateIn(List<String> values) {
            addCriterion("practice_beg_date in", values, "practiceBegDate");
            return (Criteria) this;
        }

        public Criteria andPracticeBegDateNotIn(List<String> values) {
            addCriterion("practice_beg_date not in", values, "practiceBegDate");
            return (Criteria) this;
        }

        public Criteria andPracticeBegDateBetween(String value1, String value2) {
            addCriterion("practice_beg_date between", value1, value2, "practiceBegDate");
            return (Criteria) this;
        }

        public Criteria andPracticeBegDateNotBetween(String value1, String value2) {
            addCriterion("practice_beg_date not between", value1, value2, "practiceBegDate");
            return (Criteria) this;
        }

        public Criteria andPracticeEndDateIsNull() {
            addCriterion("practice_end_date is null");
            return (Criteria) this;
        }

        public Criteria andPracticeEndDateIsNotNull() {
            addCriterion("practice_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeEndDateEqualTo(String value) {
            addCriterion("practice_end_date =", value, "practiceEndDate");
            return (Criteria) this;
        }

        public Criteria andPracticeEndDateNotEqualTo(String value) {
            addCriterion("practice_end_date <>", value, "practiceEndDate");
            return (Criteria) this;
        }

        public Criteria andPracticeEndDateGreaterThan(String value) {
            addCriterion("practice_end_date >", value, "practiceEndDate");
            return (Criteria) this;
        }

        public Criteria andPracticeEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("practice_end_date >=", value, "practiceEndDate");
            return (Criteria) this;
        }

        public Criteria andPracticeEndDateLessThan(String value) {
            addCriterion("practice_end_date <", value, "practiceEndDate");
            return (Criteria) this;
        }

        public Criteria andPracticeEndDateLessThanOrEqualTo(String value) {
            addCriterion("practice_end_date <=", value, "practiceEndDate");
            return (Criteria) this;
        }

        public Criteria andPracticeEndDateLike(String value) {
            addCriterion("practice_end_date like", value, "practiceEndDate");
            return (Criteria) this;
        }

        public Criteria andPracticeEndDateNotLike(String value) {
            addCriterion("practice_end_date not like", value, "practiceEndDate");
            return (Criteria) this;
        }

        public Criteria andPracticeEndDateIn(List<String> values) {
            addCriterion("practice_end_date in", values, "practiceEndDate");
            return (Criteria) this;
        }

        public Criteria andPracticeEndDateNotIn(List<String> values) {
            addCriterion("practice_end_date not in", values, "practiceEndDate");
            return (Criteria) this;
        }

        public Criteria andPracticeEndDateBetween(String value1, String value2) {
            addCriterion("practice_end_date between", value1, value2, "practiceEndDate");
            return (Criteria) this;
        }

        public Criteria andPracticeEndDateNotBetween(String value1, String value2) {
            addCriterion("practice_end_date not between", value1, value2, "practiceEndDate");
            return (Criteria) this;
        }

        public Criteria andProbationBegDateIsNull() {
            addCriterion("probation_beg_date is null");
            return (Criteria) this;
        }

        public Criteria andProbationBegDateIsNotNull() {
            addCriterion("probation_beg_date is not null");
            return (Criteria) this;
        }

        public Criteria andProbationBegDateEqualTo(String value) {
            addCriterion("probation_beg_date =", value, "probationBegDate");
            return (Criteria) this;
        }

        public Criteria andProbationBegDateNotEqualTo(String value) {
            addCriterion("probation_beg_date <>", value, "probationBegDate");
            return (Criteria) this;
        }

        public Criteria andProbationBegDateGreaterThan(String value) {
            addCriterion("probation_beg_date >", value, "probationBegDate");
            return (Criteria) this;
        }

        public Criteria andProbationBegDateGreaterThanOrEqualTo(String value) {
            addCriterion("probation_beg_date >=", value, "probationBegDate");
            return (Criteria) this;
        }

        public Criteria andProbationBegDateLessThan(String value) {
            addCriterion("probation_beg_date <", value, "probationBegDate");
            return (Criteria) this;
        }

        public Criteria andProbationBegDateLessThanOrEqualTo(String value) {
            addCriterion("probation_beg_date <=", value, "probationBegDate");
            return (Criteria) this;
        }

        public Criteria andProbationBegDateLike(String value) {
            addCriterion("probation_beg_date like", value, "probationBegDate");
            return (Criteria) this;
        }

        public Criteria andProbationBegDateNotLike(String value) {
            addCriterion("probation_beg_date not like", value, "probationBegDate");
            return (Criteria) this;
        }

        public Criteria andProbationBegDateIn(List<String> values) {
            addCriterion("probation_beg_date in", values, "probationBegDate");
            return (Criteria) this;
        }

        public Criteria andProbationBegDateNotIn(List<String> values) {
            addCriterion("probation_beg_date not in", values, "probationBegDate");
            return (Criteria) this;
        }

        public Criteria andProbationBegDateBetween(String value1, String value2) {
            addCriterion("probation_beg_date between", value1, value2, "probationBegDate");
            return (Criteria) this;
        }

        public Criteria andProbationBegDateNotBetween(String value1, String value2) {
            addCriterion("probation_beg_date not between", value1, value2, "probationBegDate");
            return (Criteria) this;
        }

        public Criteria andProbationEndDateIsNull() {
            addCriterion("probation_end_date is null");
            return (Criteria) this;
        }

        public Criteria andProbationEndDateIsNotNull() {
            addCriterion("probation_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andProbationEndDateEqualTo(String value) {
            addCriterion("probation_end_date =", value, "probationEndDate");
            return (Criteria) this;
        }

        public Criteria andProbationEndDateNotEqualTo(String value) {
            addCriterion("probation_end_date <>", value, "probationEndDate");
            return (Criteria) this;
        }

        public Criteria andProbationEndDateGreaterThan(String value) {
            addCriterion("probation_end_date >", value, "probationEndDate");
            return (Criteria) this;
        }

        public Criteria andProbationEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("probation_end_date >=", value, "probationEndDate");
            return (Criteria) this;
        }

        public Criteria andProbationEndDateLessThan(String value) {
            addCriterion("probation_end_date <", value, "probationEndDate");
            return (Criteria) this;
        }

        public Criteria andProbationEndDateLessThanOrEqualTo(String value) {
            addCriterion("probation_end_date <=", value, "probationEndDate");
            return (Criteria) this;
        }

        public Criteria andProbationEndDateLike(String value) {
            addCriterion("probation_end_date like", value, "probationEndDate");
            return (Criteria) this;
        }

        public Criteria andProbationEndDateNotLike(String value) {
            addCriterion("probation_end_date not like", value, "probationEndDate");
            return (Criteria) this;
        }

        public Criteria andProbationEndDateIn(List<String> values) {
            addCriterion("probation_end_date in", values, "probationEndDate");
            return (Criteria) this;
        }

        public Criteria andProbationEndDateNotIn(List<String> values) {
            addCriterion("probation_end_date not in", values, "probationEndDate");
            return (Criteria) this;
        }

        public Criteria andProbationEndDateBetween(String value1, String value2) {
            addCriterion("probation_end_date between", value1, value2, "probationEndDate");
            return (Criteria) this;
        }

        public Criteria andProbationEndDateNotBetween(String value1, String value2) {
            addCriterion("probation_end_date not between", value1, value2, "probationEndDate");
            return (Criteria) this;
        }

        public Criteria andQqNoIsNull() {
            addCriterion("qq_no is null");
            return (Criteria) this;
        }

        public Criteria andQqNoIsNotNull() {
            addCriterion("qq_no is not null");
            return (Criteria) this;
        }

        public Criteria andQqNoEqualTo(String value) {
            addCriterion("qq_no =", value, "qqNo");
            return (Criteria) this;
        }

        public Criteria andQqNoNotEqualTo(String value) {
            addCriterion("qq_no <>", value, "qqNo");
            return (Criteria) this;
        }

        public Criteria andQqNoGreaterThan(String value) {
            addCriterion("qq_no >", value, "qqNo");
            return (Criteria) this;
        }

        public Criteria andQqNoGreaterThanOrEqualTo(String value) {
            addCriterion("qq_no >=", value, "qqNo");
            return (Criteria) this;
        }

        public Criteria andQqNoLessThan(String value) {
            addCriterion("qq_no <", value, "qqNo");
            return (Criteria) this;
        }

        public Criteria andQqNoLessThanOrEqualTo(String value) {
            addCriterion("qq_no <=", value, "qqNo");
            return (Criteria) this;
        }

        public Criteria andQqNoLike(String value) {
            addCriterion("qq_no like", value, "qqNo");
            return (Criteria) this;
        }

        public Criteria andQqNoNotLike(String value) {
            addCriterion("qq_no not like", value, "qqNo");
            return (Criteria) this;
        }

        public Criteria andQqNoIn(List<String> values) {
            addCriterion("qq_no in", values, "qqNo");
            return (Criteria) this;
        }

        public Criteria andQqNoNotIn(List<String> values) {
            addCriterion("qq_no not in", values, "qqNo");
            return (Criteria) this;
        }

        public Criteria andQqNoBetween(String value1, String value2) {
            addCriterion("qq_no between", value1, value2, "qqNo");
            return (Criteria) this;
        }

        public Criteria andQqNoNotBetween(String value1, String value2) {
            addCriterion("qq_no not between", value1, value2, "qqNo");
            return (Criteria) this;
        }

        public Criteria andRegisterLocationIsNull() {
            addCriterion("register_location is null");
            return (Criteria) this;
        }

        public Criteria andRegisterLocationIsNotNull() {
            addCriterion("register_location is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterLocationEqualTo(String value) {
            addCriterion("register_location =", value, "registerLocation");
            return (Criteria) this;
        }

        public Criteria andRegisterLocationNotEqualTo(String value) {
            addCriterion("register_location <>", value, "registerLocation");
            return (Criteria) this;
        }

        public Criteria andRegisterLocationGreaterThan(String value) {
            addCriterion("register_location >", value, "registerLocation");
            return (Criteria) this;
        }

        public Criteria andRegisterLocationGreaterThanOrEqualTo(String value) {
            addCriterion("register_location >=", value, "registerLocation");
            return (Criteria) this;
        }

        public Criteria andRegisterLocationLessThan(String value) {
            addCriterion("register_location <", value, "registerLocation");
            return (Criteria) this;
        }

        public Criteria andRegisterLocationLessThanOrEqualTo(String value) {
            addCriterion("register_location <=", value, "registerLocation");
            return (Criteria) this;
        }

        public Criteria andRegisterLocationLike(String value) {
            addCriterion("register_location like", value, "registerLocation");
            return (Criteria) this;
        }

        public Criteria andRegisterLocationNotLike(String value) {
            addCriterion("register_location not like", value, "registerLocation");
            return (Criteria) this;
        }

        public Criteria andRegisterLocationIn(List<String> values) {
            addCriterion("register_location in", values, "registerLocation");
            return (Criteria) this;
        }

        public Criteria andRegisterLocationNotIn(List<String> values) {
            addCriterion("register_location not in", values, "registerLocation");
            return (Criteria) this;
        }

        public Criteria andRegisterLocationBetween(String value1, String value2) {
            addCriterion("register_location between", value1, value2, "registerLocation");
            return (Criteria) this;
        }

        public Criteria andRegisterLocationNotBetween(String value1, String value2) {
            addCriterion("register_location not between", value1, value2, "registerLocation");
            return (Criteria) this;
        }

        public Criteria andRelatedManIsNull() {
            addCriterion("related_man is null");
            return (Criteria) this;
        }

        public Criteria andRelatedManIsNotNull() {
            addCriterion("related_man is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedManEqualTo(String value) {
            addCriterion("related_man =", value, "relatedMan");
            return (Criteria) this;
        }

        public Criteria andRelatedManNotEqualTo(String value) {
            addCriterion("related_man <>", value, "relatedMan");
            return (Criteria) this;
        }

        public Criteria andRelatedManGreaterThan(String value) {
            addCriterion("related_man >", value, "relatedMan");
            return (Criteria) this;
        }

        public Criteria andRelatedManGreaterThanOrEqualTo(String value) {
            addCriterion("related_man >=", value, "relatedMan");
            return (Criteria) this;
        }

        public Criteria andRelatedManLessThan(String value) {
            addCriterion("related_man <", value, "relatedMan");
            return (Criteria) this;
        }

        public Criteria andRelatedManLessThanOrEqualTo(String value) {
            addCriterion("related_man <=", value, "relatedMan");
            return (Criteria) this;
        }

        public Criteria andRelatedManLike(String value) {
            addCriterion("related_man like", value, "relatedMan");
            return (Criteria) this;
        }

        public Criteria andRelatedManNotLike(String value) {
            addCriterion("related_man not like", value, "relatedMan");
            return (Criteria) this;
        }

        public Criteria andRelatedManIn(List<String> values) {
            addCriterion("related_man in", values, "relatedMan");
            return (Criteria) this;
        }

        public Criteria andRelatedManNotIn(List<String> values) {
            addCriterion("related_man not in", values, "relatedMan");
            return (Criteria) this;
        }

        public Criteria andRelatedManBetween(String value1, String value2) {
            addCriterion("related_man between", value1, value2, "relatedMan");
            return (Criteria) this;
        }

        public Criteria andRelatedManNotBetween(String value1, String value2) {
            addCriterion("related_man not between", value1, value2, "relatedMan");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeIsNull() {
            addCriterion("residence_type is null");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeIsNotNull() {
            addCriterion("residence_type is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeEqualTo(String value) {
            addCriterion("residence_type =", value, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeNotEqualTo(String value) {
            addCriterion("residence_type <>", value, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeGreaterThan(String value) {
            addCriterion("residence_type >", value, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("residence_type >=", value, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeLessThan(String value) {
            addCriterion("residence_type <", value, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeLessThanOrEqualTo(String value) {
            addCriterion("residence_type <=", value, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeLike(String value) {
            addCriterion("residence_type like", value, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeNotLike(String value) {
            addCriterion("residence_type not like", value, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeIn(List<String> values) {
            addCriterion("residence_type in", values, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeNotIn(List<String> values) {
            addCriterion("residence_type not in", values, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeBetween(String value1, String value2) {
            addCriterion("residence_type between", value1, value2, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeNotBetween(String value1, String value2) {
            addCriterion("residence_type not between", value1, value2, "residenceType");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNull() {
            addCriterion("specialty is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNotNull() {
            addCriterion("specialty is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyEqualTo(String value) {
            addCriterion("specialty =", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotEqualTo(String value) {
            addCriterion("specialty <>", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThan(String value) {
            addCriterion("specialty >", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("specialty >=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThan(String value) {
            addCriterion("specialty <", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThanOrEqualTo(String value) {
            addCriterion("specialty <=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLike(String value) {
            addCriterion("specialty like", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotLike(String value) {
            addCriterion("specialty not like", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIn(List<String> values) {
            addCriterion("specialty in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotIn(List<String> values) {
            addCriterion("specialty not in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyBetween(String value1, String value2) {
            addCriterion("specialty between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotBetween(String value1, String value2) {
            addCriterion("specialty not between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTaxGroupIdIsNull() {
            addCriterion("tax_group_id is null");
            return (Criteria) this;
        }

        public Criteria andTaxGroupIdIsNotNull() {
            addCriterion("tax_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaxGroupIdEqualTo(String value) {
            addCriterion("tax_group_id =", value, "taxGroupId");
            return (Criteria) this;
        }

        public Criteria andTaxGroupIdNotEqualTo(String value) {
            addCriterion("tax_group_id <>", value, "taxGroupId");
            return (Criteria) this;
        }

        public Criteria andTaxGroupIdGreaterThan(String value) {
            addCriterion("tax_group_id >", value, "taxGroupId");
            return (Criteria) this;
        }

        public Criteria andTaxGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("tax_group_id >=", value, "taxGroupId");
            return (Criteria) this;
        }

        public Criteria andTaxGroupIdLessThan(String value) {
            addCriterion("tax_group_id <", value, "taxGroupId");
            return (Criteria) this;
        }

        public Criteria andTaxGroupIdLessThanOrEqualTo(String value) {
            addCriterion("tax_group_id <=", value, "taxGroupId");
            return (Criteria) this;
        }

        public Criteria andTaxGroupIdLike(String value) {
            addCriterion("tax_group_id like", value, "taxGroupId");
            return (Criteria) this;
        }

        public Criteria andTaxGroupIdNotLike(String value) {
            addCriterion("tax_group_id not like", value, "taxGroupId");
            return (Criteria) this;
        }

        public Criteria andTaxGroupIdIn(List<String> values) {
            addCriterion("tax_group_id in", values, "taxGroupId");
            return (Criteria) this;
        }

        public Criteria andTaxGroupIdNotIn(List<String> values) {
            addCriterion("tax_group_id not in", values, "taxGroupId");
            return (Criteria) this;
        }

        public Criteria andTaxGroupIdBetween(String value1, String value2) {
            addCriterion("tax_group_id between", value1, value2, "taxGroupId");
            return (Criteria) this;
        }

        public Criteria andTaxGroupIdNotBetween(String value1, String value2) {
            addCriterion("tax_group_id not between", value1, value2, "taxGroupId");
            return (Criteria) this;
        }

        public Criteria andTechnicalIsNull() {
            addCriterion("technical is null");
            return (Criteria) this;
        }

        public Criteria andTechnicalIsNotNull() {
            addCriterion("technical is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicalEqualTo(String value) {
            addCriterion("technical =", value, "technical");
            return (Criteria) this;
        }

        public Criteria andTechnicalNotEqualTo(String value) {
            addCriterion("technical <>", value, "technical");
            return (Criteria) this;
        }

        public Criteria andTechnicalGreaterThan(String value) {
            addCriterion("technical >", value, "technical");
            return (Criteria) this;
        }

        public Criteria andTechnicalGreaterThanOrEqualTo(String value) {
            addCriterion("technical >=", value, "technical");
            return (Criteria) this;
        }

        public Criteria andTechnicalLessThan(String value) {
            addCriterion("technical <", value, "technical");
            return (Criteria) this;
        }

        public Criteria andTechnicalLessThanOrEqualTo(String value) {
            addCriterion("technical <=", value, "technical");
            return (Criteria) this;
        }

        public Criteria andTechnicalLike(String value) {
            addCriterion("technical like", value, "technical");
            return (Criteria) this;
        }

        public Criteria andTechnicalNotLike(String value) {
            addCriterion("technical not like", value, "technical");
            return (Criteria) this;
        }

        public Criteria andTechnicalIn(List<String> values) {
            addCriterion("technical in", values, "technical");
            return (Criteria) this;
        }

        public Criteria andTechnicalNotIn(List<String> values) {
            addCriterion("technical not in", values, "technical");
            return (Criteria) this;
        }

        public Criteria andTechnicalBetween(String value1, String value2) {
            addCriterion("technical between", value1, value2, "technical");
            return (Criteria) this;
        }

        public Criteria andTechnicalNotBetween(String value1, String value2) {
            addCriterion("technical not between", value1, value2, "technical");
            return (Criteria) this;
        }

        public Criteria andTechnicalDateIsNull() {
            addCriterion("technical_date is null");
            return (Criteria) this;
        }

        public Criteria andTechnicalDateIsNotNull() {
            addCriterion("technical_date is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicalDateEqualTo(String value) {
            addCriterion("technical_date =", value, "technicalDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalDateNotEqualTo(String value) {
            addCriterion("technical_date <>", value, "technicalDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalDateGreaterThan(String value) {
            addCriterion("technical_date >", value, "technicalDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalDateGreaterThanOrEqualTo(String value) {
            addCriterion("technical_date >=", value, "technicalDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalDateLessThan(String value) {
            addCriterion("technical_date <", value, "technicalDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalDateLessThanOrEqualTo(String value) {
            addCriterion("technical_date <=", value, "technicalDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalDateLike(String value) {
            addCriterion("technical_date like", value, "technicalDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalDateNotLike(String value) {
            addCriterion("technical_date not like", value, "technicalDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalDateIn(List<String> values) {
            addCriterion("technical_date in", values, "technicalDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalDateNotIn(List<String> values) {
            addCriterion("technical_date not in", values, "technicalDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalDateBetween(String value1, String value2) {
            addCriterion("technical_date between", value1, value2, "technicalDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalDateNotBetween(String value1, String value2) {
            addCriterion("technical_date not between", value1, value2, "technicalDate");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTimerPasswdIsNull() {
            addCriterion("timer_passwd is null");
            return (Criteria) this;
        }

        public Criteria andTimerPasswdIsNotNull() {
            addCriterion("timer_passwd is not null");
            return (Criteria) this;
        }

        public Criteria andTimerPasswdEqualTo(String value) {
            addCriterion("timer_passwd =", value, "timerPasswd");
            return (Criteria) this;
        }

        public Criteria andTimerPasswdNotEqualTo(String value) {
            addCriterion("timer_passwd <>", value, "timerPasswd");
            return (Criteria) this;
        }

        public Criteria andTimerPasswdGreaterThan(String value) {
            addCriterion("timer_passwd >", value, "timerPasswd");
            return (Criteria) this;
        }

        public Criteria andTimerPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("timer_passwd >=", value, "timerPasswd");
            return (Criteria) this;
        }

        public Criteria andTimerPasswdLessThan(String value) {
            addCriterion("timer_passwd <", value, "timerPasswd");
            return (Criteria) this;
        }

        public Criteria andTimerPasswdLessThanOrEqualTo(String value) {
            addCriterion("timer_passwd <=", value, "timerPasswd");
            return (Criteria) this;
        }

        public Criteria andTimerPasswdLike(String value) {
            addCriterion("timer_passwd like", value, "timerPasswd");
            return (Criteria) this;
        }

        public Criteria andTimerPasswdNotLike(String value) {
            addCriterion("timer_passwd not like", value, "timerPasswd");
            return (Criteria) this;
        }

        public Criteria andTimerPasswdIn(List<String> values) {
            addCriterion("timer_passwd in", values, "timerPasswd");
            return (Criteria) this;
        }

        public Criteria andTimerPasswdNotIn(List<String> values) {
            addCriterion("timer_passwd not in", values, "timerPasswd");
            return (Criteria) this;
        }

        public Criteria andTimerPasswdBetween(String value1, String value2) {
            addCriterion("timer_passwd between", value1, value2, "timerPasswd");
            return (Criteria) this;
        }

        public Criteria andTimerPasswdNotBetween(String value1, String value2) {
            addCriterion("timer_passwd not between", value1, value2, "timerPasswd");
            return (Criteria) this;
        }

        public Criteria andUnemploymentAccountIsNull() {
            addCriterion("unemployment_account is null");
            return (Criteria) this;
        }

        public Criteria andUnemploymentAccountIsNotNull() {
            addCriterion("unemployment_account is not null");
            return (Criteria) this;
        }

        public Criteria andUnemploymentAccountEqualTo(String value) {
            addCriterion("unemployment_account =", value, "unemploymentAccount");
            return (Criteria) this;
        }

        public Criteria andUnemploymentAccountNotEqualTo(String value) {
            addCriterion("unemployment_account <>", value, "unemploymentAccount");
            return (Criteria) this;
        }

        public Criteria andUnemploymentAccountGreaterThan(String value) {
            addCriterion("unemployment_account >", value, "unemploymentAccount");
            return (Criteria) this;
        }

        public Criteria andUnemploymentAccountGreaterThanOrEqualTo(String value) {
            addCriterion("unemployment_account >=", value, "unemploymentAccount");
            return (Criteria) this;
        }

        public Criteria andUnemploymentAccountLessThan(String value) {
            addCriterion("unemployment_account <", value, "unemploymentAccount");
            return (Criteria) this;
        }

        public Criteria andUnemploymentAccountLessThanOrEqualTo(String value) {
            addCriterion("unemployment_account <=", value, "unemploymentAccount");
            return (Criteria) this;
        }

        public Criteria andUnemploymentAccountLike(String value) {
            addCriterion("unemployment_account like", value, "unemploymentAccount");
            return (Criteria) this;
        }

        public Criteria andUnemploymentAccountNotLike(String value) {
            addCriterion("unemployment_account not like", value, "unemploymentAccount");
            return (Criteria) this;
        }

        public Criteria andUnemploymentAccountIn(List<String> values) {
            addCriterion("unemployment_account in", values, "unemploymentAccount");
            return (Criteria) this;
        }

        public Criteria andUnemploymentAccountNotIn(List<String> values) {
            addCriterion("unemployment_account not in", values, "unemploymentAccount");
            return (Criteria) this;
        }

        public Criteria andUnemploymentAccountBetween(String value1, String value2) {
            addCriterion("unemployment_account between", value1, value2, "unemploymentAccount");
            return (Criteria) this;
        }

        public Criteria andUnemploymentAccountNotBetween(String value1, String value2) {
            addCriterion("unemployment_account not between", value1, value2, "unemploymentAccount");
            return (Criteria) this;
        }

        public Criteria andUrgentTelephoneIsNull() {
            addCriterion("urgent_telephone is null");
            return (Criteria) this;
        }

        public Criteria andUrgentTelephoneIsNotNull() {
            addCriterion("urgent_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentTelephoneEqualTo(String value) {
            addCriterion("urgent_telephone =", value, "urgentTelephone");
            return (Criteria) this;
        }

        public Criteria andUrgentTelephoneNotEqualTo(String value) {
            addCriterion("urgent_telephone <>", value, "urgentTelephone");
            return (Criteria) this;
        }

        public Criteria andUrgentTelephoneGreaterThan(String value) {
            addCriterion("urgent_telephone >", value, "urgentTelephone");
            return (Criteria) this;
        }

        public Criteria andUrgentTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("urgent_telephone >=", value, "urgentTelephone");
            return (Criteria) this;
        }

        public Criteria andUrgentTelephoneLessThan(String value) {
            addCriterion("urgent_telephone <", value, "urgentTelephone");
            return (Criteria) this;
        }

        public Criteria andUrgentTelephoneLessThanOrEqualTo(String value) {
            addCriterion("urgent_telephone <=", value, "urgentTelephone");
            return (Criteria) this;
        }

        public Criteria andUrgentTelephoneLike(String value) {
            addCriterion("urgent_telephone like", value, "urgentTelephone");
            return (Criteria) this;
        }

        public Criteria andUrgentTelephoneNotLike(String value) {
            addCriterion("urgent_telephone not like", value, "urgentTelephone");
            return (Criteria) this;
        }

        public Criteria andUrgentTelephoneIn(List<String> values) {
            addCriterion("urgent_telephone in", values, "urgentTelephone");
            return (Criteria) this;
        }

        public Criteria andUrgentTelephoneNotIn(List<String> values) {
            addCriterion("urgent_telephone not in", values, "urgentTelephone");
            return (Criteria) this;
        }

        public Criteria andUrgentTelephoneBetween(String value1, String value2) {
            addCriterion("urgent_telephone between", value1, value2, "urgentTelephone");
            return (Criteria) this;
        }

        public Criteria andUrgentTelephoneNotBetween(String value1, String value2) {
            addCriterion("urgent_telephone not between", value1, value2, "urgentTelephone");
            return (Criteria) this;
        }

        public Criteria andWorkLocationIsNull() {
            addCriterion("work_location is null");
            return (Criteria) this;
        }

        public Criteria andWorkLocationIsNotNull() {
            addCriterion("work_location is not null");
            return (Criteria) this;
        }

        public Criteria andWorkLocationEqualTo(String value) {
            addCriterion("work_location =", value, "workLocation");
            return (Criteria) this;
        }

        public Criteria andWorkLocationNotEqualTo(String value) {
            addCriterion("work_location <>", value, "workLocation");
            return (Criteria) this;
        }

        public Criteria andWorkLocationGreaterThan(String value) {
            addCriterion("work_location >", value, "workLocation");
            return (Criteria) this;
        }

        public Criteria andWorkLocationGreaterThanOrEqualTo(String value) {
            addCriterion("work_location >=", value, "workLocation");
            return (Criteria) this;
        }

        public Criteria andWorkLocationLessThan(String value) {
            addCriterion("work_location <", value, "workLocation");
            return (Criteria) this;
        }

        public Criteria andWorkLocationLessThanOrEqualTo(String value) {
            addCriterion("work_location <=", value, "workLocation");
            return (Criteria) this;
        }

        public Criteria andWorkLocationLike(String value) {
            addCriterion("work_location like", value, "workLocation");
            return (Criteria) this;
        }

        public Criteria andWorkLocationNotLike(String value) {
            addCriterion("work_location not like", value, "workLocation");
            return (Criteria) this;
        }

        public Criteria andWorkLocationIn(List<String> values) {
            addCriterion("work_location in", values, "workLocation");
            return (Criteria) this;
        }

        public Criteria andWorkLocationNotIn(List<String> values) {
            addCriterion("work_location not in", values, "workLocation");
            return (Criteria) this;
        }

        public Criteria andWorkLocationBetween(String value1, String value2) {
            addCriterion("work_location between", value1, value2, "workLocation");
            return (Criteria) this;
        }

        public Criteria andWorkLocationNotBetween(String value1, String value2) {
            addCriterion("work_location not between", value1, value2, "workLocation");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("bz is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("bz is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("bz =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("bz <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("bz >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("bz >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("bz <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("bz <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("bz like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("bz not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("bz in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("bz not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("bz between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("bz not between", value1, value2, "bz");
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