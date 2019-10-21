package cn.fhjt.weixin.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbLogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbLogsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperationInterfaceIsNull() {
            addCriterion("operation_interface is null");
            return (Criteria) this;
        }

        public Criteria andOperationInterfaceIsNotNull() {
            addCriterion("operation_interface is not null");
            return (Criteria) this;
        }

        public Criteria andOperationInterfaceEqualTo(String value) {
            addCriterion("operation_interface =", value, "operationInterface");
            return (Criteria) this;
        }

        public Criteria andOperationInterfaceNotEqualTo(String value) {
            addCriterion("operation_interface <>", value, "operationInterface");
            return (Criteria) this;
        }

        public Criteria andOperationInterfaceGreaterThan(String value) {
            addCriterion("operation_interface >", value, "operationInterface");
            return (Criteria) this;
        }

        public Criteria andOperationInterfaceGreaterThanOrEqualTo(String value) {
            addCriterion("operation_interface >=", value, "operationInterface");
            return (Criteria) this;
        }

        public Criteria andOperationInterfaceLessThan(String value) {
            addCriterion("operation_interface <", value, "operationInterface");
            return (Criteria) this;
        }

        public Criteria andOperationInterfaceLessThanOrEqualTo(String value) {
            addCriterion("operation_interface <=", value, "operationInterface");
            return (Criteria) this;
        }

        public Criteria andOperationInterfaceLike(String value) {
            addCriterion("operation_interface like", value, "operationInterface");
            return (Criteria) this;
        }

        public Criteria andOperationInterfaceNotLike(String value) {
            addCriterion("operation_interface not like", value, "operationInterface");
            return (Criteria) this;
        }

        public Criteria andOperationInterfaceIn(List<String> values) {
            addCriterion("operation_interface in", values, "operationInterface");
            return (Criteria) this;
        }

        public Criteria andOperationInterfaceNotIn(List<String> values) {
            addCriterion("operation_interface not in", values, "operationInterface");
            return (Criteria) this;
        }

        public Criteria andOperationInterfaceBetween(String value1, String value2) {
            addCriterion("operation_interface between", value1, value2, "operationInterface");
            return (Criteria) this;
        }

        public Criteria andOperationInterfaceNotBetween(String value1, String value2) {
            addCriterion("operation_interface not between", value1, value2, "operationInterface");
            return (Criteria) this;
        }

        public Criteria andCIpIsNull() {
            addCriterion("c_ip is null");
            return (Criteria) this;
        }

        public Criteria andCIpIsNotNull() {
            addCriterion("c_ip is not null");
            return (Criteria) this;
        }

        public Criteria andCIpEqualTo(String value) {
            addCriterion("c_ip =", value, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpNotEqualTo(String value) {
            addCriterion("c_ip <>", value, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpGreaterThan(String value) {
            addCriterion("c_ip >", value, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpGreaterThanOrEqualTo(String value) {
            addCriterion("c_ip >=", value, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpLessThan(String value) {
            addCriterion("c_ip <", value, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpLessThanOrEqualTo(String value) {
            addCriterion("c_ip <=", value, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpLike(String value) {
            addCriterion("c_ip like", value, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpNotLike(String value) {
            addCriterion("c_ip not like", value, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpIn(List<String> values) {
            addCriterion("c_ip in", values, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpNotIn(List<String> values) {
            addCriterion("c_ip not in", values, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpBetween(String value1, String value2) {
            addCriterion("c_ip between", value1, value2, "cIp");
            return (Criteria) this;
        }

        public Criteria andCIpNotBetween(String value1, String value2) {
            addCriterion("c_ip not between", value1, value2, "cIp");
            return (Criteria) this;
        }

        public Criteria andExecutiveBusinessIsNull() {
            addCriterion("executive_business is null");
            return (Criteria) this;
        }

        public Criteria andExecutiveBusinessIsNotNull() {
            addCriterion("executive_business is not null");
            return (Criteria) this;
        }

        public Criteria andExecutiveBusinessEqualTo(String value) {
            addCriterion("executive_business =", value, "executiveBusiness");
            return (Criteria) this;
        }

        public Criteria andExecutiveBusinessNotEqualTo(String value) {
            addCriterion("executive_business <>", value, "executiveBusiness");
            return (Criteria) this;
        }

        public Criteria andExecutiveBusinessGreaterThan(String value) {
            addCriterion("executive_business >", value, "executiveBusiness");
            return (Criteria) this;
        }

        public Criteria andExecutiveBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("executive_business >=", value, "executiveBusiness");
            return (Criteria) this;
        }

        public Criteria andExecutiveBusinessLessThan(String value) {
            addCriterion("executive_business <", value, "executiveBusiness");
            return (Criteria) this;
        }

        public Criteria andExecutiveBusinessLessThanOrEqualTo(String value) {
            addCriterion("executive_business <=", value, "executiveBusiness");
            return (Criteria) this;
        }

        public Criteria andExecutiveBusinessLike(String value) {
            addCriterion("executive_business like", value, "executiveBusiness");
            return (Criteria) this;
        }

        public Criteria andExecutiveBusinessNotLike(String value) {
            addCriterion("executive_business not like", value, "executiveBusiness");
            return (Criteria) this;
        }

        public Criteria andExecutiveBusinessIn(List<String> values) {
            addCriterion("executive_business in", values, "executiveBusiness");
            return (Criteria) this;
        }

        public Criteria andExecutiveBusinessNotIn(List<String> values) {
            addCriterion("executive_business not in", values, "executiveBusiness");
            return (Criteria) this;
        }

        public Criteria andExecutiveBusinessBetween(String value1, String value2) {
            addCriterion("executive_business between", value1, value2, "executiveBusiness");
            return (Criteria) this;
        }

        public Criteria andExecutiveBusinessNotBetween(String value1, String value2) {
            addCriterion("executive_business not between", value1, value2, "executiveBusiness");
            return (Criteria) this;
        }

        public Criteria andSuccessFlagIsNull() {
            addCriterion("success_flag is null");
            return (Criteria) this;
        }

        public Criteria andSuccessFlagIsNotNull() {
            addCriterion("success_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessFlagEqualTo(String value) {
            addCriterion("success_flag =", value, "successFlag");
            return (Criteria) this;
        }

        public Criteria andSuccessFlagNotEqualTo(String value) {
            addCriterion("success_flag <>", value, "successFlag");
            return (Criteria) this;
        }

        public Criteria andSuccessFlagGreaterThan(String value) {
            addCriterion("success_flag >", value, "successFlag");
            return (Criteria) this;
        }

        public Criteria andSuccessFlagGreaterThanOrEqualTo(String value) {
            addCriterion("success_flag >=", value, "successFlag");
            return (Criteria) this;
        }

        public Criteria andSuccessFlagLessThan(String value) {
            addCriterion("success_flag <", value, "successFlag");
            return (Criteria) this;
        }

        public Criteria andSuccessFlagLessThanOrEqualTo(String value) {
            addCriterion("success_flag <=", value, "successFlag");
            return (Criteria) this;
        }

        public Criteria andSuccessFlagLike(String value) {
            addCriterion("success_flag like", value, "successFlag");
            return (Criteria) this;
        }

        public Criteria andSuccessFlagNotLike(String value) {
            addCriterion("success_flag not like", value, "successFlag");
            return (Criteria) this;
        }

        public Criteria andSuccessFlagIn(List<String> values) {
            addCriterion("success_flag in", values, "successFlag");
            return (Criteria) this;
        }

        public Criteria andSuccessFlagNotIn(List<String> values) {
            addCriterion("success_flag not in", values, "successFlag");
            return (Criteria) this;
        }

        public Criteria andSuccessFlagBetween(String value1, String value2) {
            addCriterion("success_flag between", value1, value2, "successFlag");
            return (Criteria) this;
        }

        public Criteria andSuccessFlagNotBetween(String value1, String value2) {
            addCriterion("success_flag not between", value1, value2, "successFlag");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingIsNull() {
            addCriterion("time_consuming is null");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingIsNotNull() {
            addCriterion("time_consuming is not null");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingEqualTo(String value) {
            addCriterion("time_consuming =", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingNotEqualTo(String value) {
            addCriterion("time_consuming <>", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingGreaterThan(String value) {
            addCriterion("time_consuming >", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingGreaterThanOrEqualTo(String value) {
            addCriterion("time_consuming >=", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingLessThan(String value) {
            addCriterion("time_consuming <", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingLessThanOrEqualTo(String value) {
            addCriterion("time_consuming <=", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingLike(String value) {
            addCriterion("time_consuming like", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingNotLike(String value) {
            addCriterion("time_consuming not like", value, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingIn(List<String> values) {
            addCriterion("time_consuming in", values, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingNotIn(List<String> values) {
            addCriterion("time_consuming not in", values, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingBetween(String value1, String value2) {
            addCriterion("time_consuming between", value1, value2, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andTimeConsumingNotBetween(String value1, String value2) {
            addCriterion("time_consuming not between", value1, value2, "timeConsuming");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNull() {
            addCriterion("creation_time is null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNotNull() {
            addCriterion("creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeEqualTo(Date value) {
            addCriterion("creation_time =", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotEqualTo(Date value) {
            addCriterion("creation_time <>", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThan(Date value) {
            addCriterion("creation_time >", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_time >=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThan(Date value) {
            addCriterion("creation_time <", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThanOrEqualTo(Date value) {
            addCriterion("creation_time <=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIn(List<Date> values) {
            addCriterion("creation_time in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotIn(List<Date> values) {
            addCriterion("creation_time not in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeBetween(Date value1, Date value2) {
            addCriterion("creation_time between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotBetween(Date value1, Date value2) {
            addCriterion("creation_time not between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andSpare1IsNull() {
            addCriterion("spare1 is null");
            return (Criteria) this;
        }

        public Criteria andSpare1IsNotNull() {
            addCriterion("spare1 is not null");
            return (Criteria) this;
        }

        public Criteria andSpare1EqualTo(String value) {
            addCriterion("spare1 =", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1NotEqualTo(String value) {
            addCriterion("spare1 <>", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1GreaterThan(String value) {
            addCriterion("spare1 >", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1GreaterThanOrEqualTo(String value) {
            addCriterion("spare1 >=", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1LessThan(String value) {
            addCriterion("spare1 <", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1LessThanOrEqualTo(String value) {
            addCriterion("spare1 <=", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1Like(String value) {
            addCriterion("spare1 like", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1NotLike(String value) {
            addCriterion("spare1 not like", value, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1In(List<String> values) {
            addCriterion("spare1 in", values, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1NotIn(List<String> values) {
            addCriterion("spare1 not in", values, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1Between(String value1, String value2) {
            addCriterion("spare1 between", value1, value2, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare1NotBetween(String value1, String value2) {
            addCriterion("spare1 not between", value1, value2, "spare1");
            return (Criteria) this;
        }

        public Criteria andSpare2IsNull() {
            addCriterion("spare2 is null");
            return (Criteria) this;
        }

        public Criteria andSpare2IsNotNull() {
            addCriterion("spare2 is not null");
            return (Criteria) this;
        }

        public Criteria andSpare2EqualTo(String value) {
            addCriterion("spare2 =", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2NotEqualTo(String value) {
            addCriterion("spare2 <>", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2GreaterThan(String value) {
            addCriterion("spare2 >", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2GreaterThanOrEqualTo(String value) {
            addCriterion("spare2 >=", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2LessThan(String value) {
            addCriterion("spare2 <", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2LessThanOrEqualTo(String value) {
            addCriterion("spare2 <=", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2Like(String value) {
            addCriterion("spare2 like", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2NotLike(String value) {
            addCriterion("spare2 not like", value, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2In(List<String> values) {
            addCriterion("spare2 in", values, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2NotIn(List<String> values) {
            addCriterion("spare2 not in", values, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2Between(String value1, String value2) {
            addCriterion("spare2 between", value1, value2, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare2NotBetween(String value1, String value2) {
            addCriterion("spare2 not between", value1, value2, "spare2");
            return (Criteria) this;
        }

        public Criteria andSpare3IsNull() {
            addCriterion("spare3 is null");
            return (Criteria) this;
        }

        public Criteria andSpare3IsNotNull() {
            addCriterion("spare3 is not null");
            return (Criteria) this;
        }

        public Criteria andSpare3EqualTo(String value) {
            addCriterion("spare3 =", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3NotEqualTo(String value) {
            addCriterion("spare3 <>", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3GreaterThan(String value) {
            addCriterion("spare3 >", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3GreaterThanOrEqualTo(String value) {
            addCriterion("spare3 >=", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3LessThan(String value) {
            addCriterion("spare3 <", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3LessThanOrEqualTo(String value) {
            addCriterion("spare3 <=", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3Like(String value) {
            addCriterion("spare3 like", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3NotLike(String value) {
            addCriterion("spare3 not like", value, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3In(List<String> values) {
            addCriterion("spare3 in", values, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3NotIn(List<String> values) {
            addCriterion("spare3 not in", values, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3Between(String value1, String value2) {
            addCriterion("spare3 between", value1, value2, "spare3");
            return (Criteria) this;
        }

        public Criteria andSpare3NotBetween(String value1, String value2) {
            addCriterion("spare3 not between", value1, value2, "spare3");
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