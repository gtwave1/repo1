package cn.suyuan.dao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOderidIsNull() {
            addCriterion("oderId is null");
            return (Criteria) this;
        }

        public Criteria andOderidIsNotNull() {
            addCriterion("oderId is not null");
            return (Criteria) this;
        }

        public Criteria andOderidEqualTo(Long value) {
            addCriterion("oderId =", value, "oderid");
            return (Criteria) this;
        }

        public Criteria andOderidNotEqualTo(Long value) {
            addCriterion("oderId <>", value, "oderid");
            return (Criteria) this;
        }

        public Criteria andOderidGreaterThan(Long value) {
            addCriterion("oderId >", value, "oderid");
            return (Criteria) this;
        }

        public Criteria andOderidGreaterThanOrEqualTo(Long value) {
            addCriterion("oderId >=", value, "oderid");
            return (Criteria) this;
        }

        public Criteria andOderidLessThan(Long value) {
            addCriterion("oderId <", value, "oderid");
            return (Criteria) this;
        }

        public Criteria andOderidLessThanOrEqualTo(Long value) {
            addCriterion("oderId <=", value, "oderid");
            return (Criteria) this;
        }

        public Criteria andOderidIn(List<Long> values) {
            addCriterion("oderId in", values, "oderid");
            return (Criteria) this;
        }

        public Criteria andOderidNotIn(List<Long> values) {
            addCriterion("oderId not in", values, "oderid");
            return (Criteria) this;
        }

        public Criteria andOderidBetween(Long value1, Long value2) {
            addCriterion("oderId between", value1, value2, "oderid");
            return (Criteria) this;
        }

        public Criteria andOderidNotBetween(Long value1, Long value2) {
            addCriterion("oderId not between", value1, value2, "oderid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIsNull() {
            addCriterion("orderType is null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIsNotNull() {
            addCriterion("orderType is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeEqualTo(Integer value) {
            addCriterion("orderType =", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotEqualTo(Integer value) {
            addCriterion("orderType <>", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThan(Integer value) {
            addCriterion("orderType >", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderType >=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThan(Integer value) {
            addCriterion("orderType <", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThanOrEqualTo(Integer value) {
            addCriterion("orderType <=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIn(List<Integer> values) {
            addCriterion("orderType in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotIn(List<Integer> values) {
            addCriterion("orderType not in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeBetween(Integer value1, Integer value2) {
            addCriterion("orderType between", value1, value2, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("orderType not between", value1, value2, "ordertype");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("companyId is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyId is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(String value) {
            addCriterion("companyId =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(String value) {
            addCriterion("companyId <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(String value) {
            addCriterion("companyId >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(String value) {
            addCriterion("companyId >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(String value) {
            addCriterion("companyId <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(String value) {
            addCriterion("companyId <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLike(String value) {
            addCriterion("companyId like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotLike(String value) {
            addCriterion("companyId not like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<String> values) {
            addCriterion("companyId in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<String> values) {
            addCriterion("companyId not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(String value1, String value2) {
            addCriterion("companyId between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(String value1, String value2) {
            addCriterion("companyId not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andPersonidIsNull() {
            addCriterion("personId is null");
            return (Criteria) this;
        }

        public Criteria andPersonidIsNotNull() {
            addCriterion("personId is not null");
            return (Criteria) this;
        }

        public Criteria andPersonidEqualTo(String value) {
            addCriterion("personId =", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotEqualTo(String value) {
            addCriterion("personId <>", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidGreaterThan(String value) {
            addCriterion("personId >", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidGreaterThanOrEqualTo(String value) {
            addCriterion("personId >=", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLessThan(String value) {
            addCriterion("personId <", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLessThanOrEqualTo(String value) {
            addCriterion("personId <=", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLike(String value) {
            addCriterion("personId like", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotLike(String value) {
            addCriterion("personId not like", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidIn(List<String> values) {
            addCriterion("personId in", values, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotIn(List<String> values) {
            addCriterion("personId not in", values, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidBetween(String value1, String value2) {
            addCriterion("personId between", value1, value2, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotBetween(String value1, String value2) {
            addCriterion("personId not between", value1, value2, "personid");
            return (Criteria) this;
        }

        public Criteria andCommodityidIsNull() {
            addCriterion("commodityId is null");
            return (Criteria) this;
        }

        public Criteria andCommodityidIsNotNull() {
            addCriterion("commodityId is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityidEqualTo(String value) {
            addCriterion("commodityId =", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotEqualTo(String value) {
            addCriterion("commodityId <>", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidGreaterThan(String value) {
            addCriterion("commodityId >", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidGreaterThanOrEqualTo(String value) {
            addCriterion("commodityId >=", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidLessThan(String value) {
            addCriterion("commodityId <", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidLessThanOrEqualTo(String value) {
            addCriterion("commodityId <=", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidLike(String value) {
            addCriterion("commodityId like", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotLike(String value) {
            addCriterion("commodityId not like", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidIn(List<String> values) {
            addCriterion("commodityId in", values, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotIn(List<String> values) {
            addCriterion("commodityId not in", values, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidBetween(String value1, String value2) {
            addCriterion("commodityId between", value1, value2, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotBetween(String value1, String value2) {
            addCriterion("commodityId not between", value1, value2, "commodityid");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNull() {
            addCriterion("orderstate is null");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNotNull() {
            addCriterion("orderstate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstateEqualTo(String value) {
            addCriterion("orderstate =", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotEqualTo(String value) {
            addCriterion("orderstate <>", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThan(String value) {
            addCriterion("orderstate >", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThanOrEqualTo(String value) {
            addCriterion("orderstate >=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThan(String value) {
            addCriterion("orderstate <", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThanOrEqualTo(String value) {
            addCriterion("orderstate <=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLike(String value) {
            addCriterion("orderstate like", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotLike(String value) {
            addCriterion("orderstate not like", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateIn(List<String> values) {
            addCriterion("orderstate in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotIn(List<String> values) {
            addCriterion("orderstate not in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateBetween(String value1, String value2) {
            addCriterion("orderstate between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotBetween(String value1, String value2) {
            addCriterion("orderstate not between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andModepaymentIsNull() {
            addCriterion("ModePayment is null");
            return (Criteria) this;
        }

        public Criteria andModepaymentIsNotNull() {
            addCriterion("ModePayment is not null");
            return (Criteria) this;
        }

        public Criteria andModepaymentEqualTo(String value) {
            addCriterion("ModePayment =", value, "modepayment");
            return (Criteria) this;
        }

        public Criteria andModepaymentNotEqualTo(String value) {
            addCriterion("ModePayment <>", value, "modepayment");
            return (Criteria) this;
        }

        public Criteria andModepaymentGreaterThan(String value) {
            addCriterion("ModePayment >", value, "modepayment");
            return (Criteria) this;
        }

        public Criteria andModepaymentGreaterThanOrEqualTo(String value) {
            addCriterion("ModePayment >=", value, "modepayment");
            return (Criteria) this;
        }

        public Criteria andModepaymentLessThan(String value) {
            addCriterion("ModePayment <", value, "modepayment");
            return (Criteria) this;
        }

        public Criteria andModepaymentLessThanOrEqualTo(String value) {
            addCriterion("ModePayment <=", value, "modepayment");
            return (Criteria) this;
        }

        public Criteria andModepaymentLike(String value) {
            addCriterion("ModePayment like", value, "modepayment");
            return (Criteria) this;
        }

        public Criteria andModepaymentNotLike(String value) {
            addCriterion("ModePayment not like", value, "modepayment");
            return (Criteria) this;
        }

        public Criteria andModepaymentIn(List<String> values) {
            addCriterion("ModePayment in", values, "modepayment");
            return (Criteria) this;
        }

        public Criteria andModepaymentNotIn(List<String> values) {
            addCriterion("ModePayment not in", values, "modepayment");
            return (Criteria) this;
        }

        public Criteria andModepaymentBetween(String value1, String value2) {
            addCriterion("ModePayment between", value1, value2, "modepayment");
            return (Criteria) this;
        }

        public Criteria andModepaymentNotBetween(String value1, String value2) {
            addCriterion("ModePayment not between", value1, value2, "modepayment");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyIsNull() {
            addCriterion("orderMoney is null");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyIsNotNull() {
            addCriterion("orderMoney is not null");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyEqualTo(Integer value) {
            addCriterion("orderMoney =", value, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyNotEqualTo(Integer value) {
            addCriterion("orderMoney <>", value, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyGreaterThan(Integer value) {
            addCriterion("orderMoney >", value, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderMoney >=", value, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyLessThan(Integer value) {
            addCriterion("orderMoney <", value, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyLessThanOrEqualTo(Integer value) {
            addCriterion("orderMoney <=", value, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyIn(List<Integer> values) {
            addCriterion("orderMoney in", values, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyNotIn(List<Integer> values) {
            addCriterion("orderMoney not in", values, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyBetween(Integer value1, Integer value2) {
            addCriterion("orderMoney between", value1, value2, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("orderMoney not between", value1, value2, "ordermoney");
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

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
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