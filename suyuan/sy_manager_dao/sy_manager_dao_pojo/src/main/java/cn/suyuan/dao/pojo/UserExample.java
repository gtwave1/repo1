package cn.suyuan.dao.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andWechartIsNull() {
            addCriterion("wechart is null");
            return (Criteria) this;
        }

        public Criteria andWechartIsNotNull() {
            addCriterion("wechart is not null");
            return (Criteria) this;
        }

        public Criteria andWechartEqualTo(String value) {
            addCriterion("wechart =", value, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartNotEqualTo(String value) {
            addCriterion("wechart <>", value, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartGreaterThan(String value) {
            addCriterion("wechart >", value, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartGreaterThanOrEqualTo(String value) {
            addCriterion("wechart >=", value, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartLessThan(String value) {
            addCriterion("wechart <", value, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartLessThanOrEqualTo(String value) {
            addCriterion("wechart <=", value, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartLike(String value) {
            addCriterion("wechart like", value, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartNotLike(String value) {
            addCriterion("wechart not like", value, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartIn(List<String> values) {
            addCriterion("wechart in", values, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartNotIn(List<String> values) {
            addCriterion("wechart not in", values, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartBetween(String value1, String value2) {
            addCriterion("wechart between", value1, value2, "wechart");
            return (Criteria) this;
        }

        public Criteria andWechartNotBetween(String value1, String value2) {
            addCriterion("wechart not between", value1, value2, "wechart");
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(Integer value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(Integer value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(Integer value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(Integer value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(Integer value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(Integer value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<Integer> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<Integer> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(Integer value1, Integer value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(Integer value1, Integer value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNull() {
            addCriterion("homeAddress is null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNotNull() {
            addCriterion("homeAddress is not null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressEqualTo(String value) {
            addCriterion("homeAddress =", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotEqualTo(String value) {
            addCriterion("homeAddress <>", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThan(String value) {
            addCriterion("homeAddress >", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("homeAddress >=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThan(String value) {
            addCriterion("homeAddress <", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThanOrEqualTo(String value) {
            addCriterion("homeAddress <=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLike(String value) {
            addCriterion("homeAddress like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotLike(String value) {
            addCriterion("homeAddress not like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIn(List<String> values) {
            addCriterion("homeAddress in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotIn(List<String> values) {
            addCriterion("homeAddress not in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressBetween(String value1, String value2) {
            addCriterion("homeAddress between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotBetween(String value1, String value2) {
            addCriterion("homeAddress not between", value1, value2, "homeaddress");
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

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andDutiesIsNull() {
            addCriterion("duties is null");
            return (Criteria) this;
        }

        public Criteria andDutiesIsNotNull() {
            addCriterion("duties is not null");
            return (Criteria) this;
        }

        public Criteria andDutiesEqualTo(String value) {
            addCriterion("duties =", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesNotEqualTo(String value) {
            addCriterion("duties <>", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesGreaterThan(String value) {
            addCriterion("duties >", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesGreaterThanOrEqualTo(String value) {
            addCriterion("duties >=", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesLessThan(String value) {
            addCriterion("duties <", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesLessThanOrEqualTo(String value) {
            addCriterion("duties <=", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesLike(String value) {
            addCriterion("duties like", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesNotLike(String value) {
            addCriterion("duties not like", value, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesIn(List<String> values) {
            addCriterion("duties in", values, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesNotIn(List<String> values) {
            addCriterion("duties not in", values, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesBetween(String value1, String value2) {
            addCriterion("duties between", value1, value2, "duties");
            return (Criteria) this;
        }

        public Criteria andDutiesNotBetween(String value1, String value2) {
            addCriterion("duties not between", value1, value2, "duties");
            return (Criteria) this;
        }

        public Criteria andWordcardpathIsNull() {
            addCriterion("wordCardPath is null");
            return (Criteria) this;
        }

        public Criteria andWordcardpathIsNotNull() {
            addCriterion("wordCardPath is not null");
            return (Criteria) this;
        }

        public Criteria andWordcardpathEqualTo(String value) {
            addCriterion("wordCardPath =", value, "wordcardpath");
            return (Criteria) this;
        }

        public Criteria andWordcardpathNotEqualTo(String value) {
            addCriterion("wordCardPath <>", value, "wordcardpath");
            return (Criteria) this;
        }

        public Criteria andWordcardpathGreaterThan(String value) {
            addCriterion("wordCardPath >", value, "wordcardpath");
            return (Criteria) this;
        }

        public Criteria andWordcardpathGreaterThanOrEqualTo(String value) {
            addCriterion("wordCardPath >=", value, "wordcardpath");
            return (Criteria) this;
        }

        public Criteria andWordcardpathLessThan(String value) {
            addCriterion("wordCardPath <", value, "wordcardpath");
            return (Criteria) this;
        }

        public Criteria andWordcardpathLessThanOrEqualTo(String value) {
            addCriterion("wordCardPath <=", value, "wordcardpath");
            return (Criteria) this;
        }

        public Criteria andWordcardpathLike(String value) {
            addCriterion("wordCardPath like", value, "wordcardpath");
            return (Criteria) this;
        }

        public Criteria andWordcardpathNotLike(String value) {
            addCriterion("wordCardPath not like", value, "wordcardpath");
            return (Criteria) this;
        }

        public Criteria andWordcardpathIn(List<String> values) {
            addCriterion("wordCardPath in", values, "wordcardpath");
            return (Criteria) this;
        }

        public Criteria andWordcardpathNotIn(List<String> values) {
            addCriterion("wordCardPath not in", values, "wordcardpath");
            return (Criteria) this;
        }

        public Criteria andWordcardpathBetween(String value1, String value2) {
            addCriterion("wordCardPath between", value1, value2, "wordcardpath");
            return (Criteria) this;
        }

        public Criteria andWordcardpathNotBetween(String value1, String value2) {
            addCriterion("wordCardPath not between", value1, value2, "wordcardpath");
            return (Criteria) this;
        }

        public Criteria andTwitterIsNull() {
            addCriterion("twitter is null");
            return (Criteria) this;
        }

        public Criteria andTwitterIsNotNull() {
            addCriterion("twitter is not null");
            return (Criteria) this;
        }

        public Criteria andTwitterEqualTo(String value) {
            addCriterion("twitter =", value, "twitter");
            return (Criteria) this;
        }

        public Criteria andTwitterNotEqualTo(String value) {
            addCriterion("twitter <>", value, "twitter");
            return (Criteria) this;
        }

        public Criteria andTwitterGreaterThan(String value) {
            addCriterion("twitter >", value, "twitter");
            return (Criteria) this;
        }

        public Criteria andTwitterGreaterThanOrEqualTo(String value) {
            addCriterion("twitter >=", value, "twitter");
            return (Criteria) this;
        }

        public Criteria andTwitterLessThan(String value) {
            addCriterion("twitter <", value, "twitter");
            return (Criteria) this;
        }

        public Criteria andTwitterLessThanOrEqualTo(String value) {
            addCriterion("twitter <=", value, "twitter");
            return (Criteria) this;
        }

        public Criteria andTwitterLike(String value) {
            addCriterion("twitter like", value, "twitter");
            return (Criteria) this;
        }

        public Criteria andTwitterNotLike(String value) {
            addCriterion("twitter not like", value, "twitter");
            return (Criteria) this;
        }

        public Criteria andTwitterIn(List<String> values) {
            addCriterion("twitter in", values, "twitter");
            return (Criteria) this;
        }

        public Criteria andTwitterNotIn(List<String> values) {
            addCriterion("twitter not in", values, "twitter");
            return (Criteria) this;
        }

        public Criteria andTwitterBetween(String value1, String value2) {
            addCriterion("twitter between", value1, value2, "twitter");
            return (Criteria) this;
        }

        public Criteria andTwitterNotBetween(String value1, String value2) {
            addCriterion("twitter not between", value1, value2, "twitter");
            return (Criteria) this;
        }

        public Criteria andFacebookIsNull() {
            addCriterion("facebook is null");
            return (Criteria) this;
        }

        public Criteria andFacebookIsNotNull() {
            addCriterion("facebook is not null");
            return (Criteria) this;
        }

        public Criteria andFacebookEqualTo(String value) {
            addCriterion("facebook =", value, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookNotEqualTo(String value) {
            addCriterion("facebook <>", value, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookGreaterThan(String value) {
            addCriterion("facebook >", value, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookGreaterThanOrEqualTo(String value) {
            addCriterion("facebook >=", value, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookLessThan(String value) {
            addCriterion("facebook <", value, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookLessThanOrEqualTo(String value) {
            addCriterion("facebook <=", value, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookLike(String value) {
            addCriterion("facebook like", value, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookNotLike(String value) {
            addCriterion("facebook not like", value, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookIn(List<String> values) {
            addCriterion("facebook in", values, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookNotIn(List<String> values) {
            addCriterion("facebook not in", values, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookBetween(String value1, String value2) {
            addCriterion("facebook between", value1, value2, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookNotBetween(String value1, String value2) {
            addCriterion("facebook not between", value1, value2, "facebook");
            return (Criteria) this;
        }

        public Criteria andWecharIsNull() {
            addCriterion("wechar is null");
            return (Criteria) this;
        }

        public Criteria andWecharIsNotNull() {
            addCriterion("wechar is not null");
            return (Criteria) this;
        }

        public Criteria andWecharEqualTo(String value) {
            addCriterion("wechar =", value, "wechar");
            return (Criteria) this;
        }

        public Criteria andWecharNotEqualTo(String value) {
            addCriterion("wechar <>", value, "wechar");
            return (Criteria) this;
        }

        public Criteria andWecharGreaterThan(String value) {
            addCriterion("wechar >", value, "wechar");
            return (Criteria) this;
        }

        public Criteria andWecharGreaterThanOrEqualTo(String value) {
            addCriterion("wechar >=", value, "wechar");
            return (Criteria) this;
        }

        public Criteria andWecharLessThan(String value) {
            addCriterion("wechar <", value, "wechar");
            return (Criteria) this;
        }

        public Criteria andWecharLessThanOrEqualTo(String value) {
            addCriterion("wechar <=", value, "wechar");
            return (Criteria) this;
        }

        public Criteria andWecharLike(String value) {
            addCriterion("wechar like", value, "wechar");
            return (Criteria) this;
        }

        public Criteria andWecharNotLike(String value) {
            addCriterion("wechar not like", value, "wechar");
            return (Criteria) this;
        }

        public Criteria andWecharIn(List<String> values) {
            addCriterion("wechar in", values, "wechar");
            return (Criteria) this;
        }

        public Criteria andWecharNotIn(List<String> values) {
            addCriterion("wechar not in", values, "wechar");
            return (Criteria) this;
        }

        public Criteria andWecharBetween(String value1, String value2) {
            addCriterion("wechar between", value1, value2, "wechar");
            return (Criteria) this;
        }

        public Criteria andWecharNotBetween(String value1, String value2) {
            addCriterion("wechar not between", value1, value2, "wechar");
            return (Criteria) this;
        }

        public Criteria andSmalltvIsNull() {
            addCriterion("smallTV is null");
            return (Criteria) this;
        }

        public Criteria andSmalltvIsNotNull() {
            addCriterion("smallTV is not null");
            return (Criteria) this;
        }

        public Criteria andSmalltvEqualTo(String value) {
            addCriterion("smallTV =", value, "smalltv");
            return (Criteria) this;
        }

        public Criteria andSmalltvNotEqualTo(String value) {
            addCriterion("smallTV <>", value, "smalltv");
            return (Criteria) this;
        }

        public Criteria andSmalltvGreaterThan(String value) {
            addCriterion("smallTV >", value, "smalltv");
            return (Criteria) this;
        }

        public Criteria andSmalltvGreaterThanOrEqualTo(String value) {
            addCriterion("smallTV >=", value, "smalltv");
            return (Criteria) this;
        }

        public Criteria andSmalltvLessThan(String value) {
            addCriterion("smallTV <", value, "smalltv");
            return (Criteria) this;
        }

        public Criteria andSmalltvLessThanOrEqualTo(String value) {
            addCriterion("smallTV <=", value, "smalltv");
            return (Criteria) this;
        }

        public Criteria andSmalltvLike(String value) {
            addCriterion("smallTV like", value, "smalltv");
            return (Criteria) this;
        }

        public Criteria andSmalltvNotLike(String value) {
            addCriterion("smallTV not like", value, "smalltv");
            return (Criteria) this;
        }

        public Criteria andSmalltvIn(List<String> values) {
            addCriterion("smallTV in", values, "smalltv");
            return (Criteria) this;
        }

        public Criteria andSmalltvNotIn(List<String> values) {
            addCriterion("smallTV not in", values, "smalltv");
            return (Criteria) this;
        }

        public Criteria andSmalltvBetween(String value1, String value2) {
            addCriterion("smallTV between", value1, value2, "smalltv");
            return (Criteria) this;
        }

        public Criteria andSmalltvNotBetween(String value1, String value2) {
            addCriterion("smallTV not between", value1, value2, "smalltv");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIsNull() {
            addCriterion("BusinessLicense is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIsNotNull() {
            addCriterion("BusinessLicense is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseEqualTo(String value) {
            addCriterion("BusinessLicense =", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotEqualTo(String value) {
            addCriterion("BusinessLicense <>", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseGreaterThan(String value) {
            addCriterion("BusinessLicense >", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessLicense >=", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseLessThan(String value) {
            addCriterion("BusinessLicense <", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseLessThanOrEqualTo(String value) {
            addCriterion("BusinessLicense <=", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseLike(String value) {
            addCriterion("BusinessLicense like", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotLike(String value) {
            addCriterion("BusinessLicense not like", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIn(List<String> values) {
            addCriterion("BusinessLicense in", values, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotIn(List<String> values) {
            addCriterion("BusinessLicense not in", values, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseBetween(String value1, String value2) {
            addCriterion("BusinessLicense between", value1, value2, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotBetween(String value1, String value2) {
            addCriterion("BusinessLicense not between", value1, value2, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andActivationcodeMeIsNull() {
            addCriterion("activationCode_me is null");
            return (Criteria) this;
        }

        public Criteria andActivationcodeMeIsNotNull() {
            addCriterion("activationCode_me is not null");
            return (Criteria) this;
        }

        public Criteria andActivationcodeMeEqualTo(String value) {
            addCriterion("activationCode_me =", value, "activationcodeMe");
            return (Criteria) this;
        }

        public Criteria andActivationcodeMeNotEqualTo(String value) {
            addCriterion("activationCode_me <>", value, "activationcodeMe");
            return (Criteria) this;
        }

        public Criteria andActivationcodeMeGreaterThan(String value) {
            addCriterion("activationCode_me >", value, "activationcodeMe");
            return (Criteria) this;
        }

        public Criteria andActivationcodeMeGreaterThanOrEqualTo(String value) {
            addCriterion("activationCode_me >=", value, "activationcodeMe");
            return (Criteria) this;
        }

        public Criteria andActivationcodeMeLessThan(String value) {
            addCriterion("activationCode_me <", value, "activationcodeMe");
            return (Criteria) this;
        }

        public Criteria andActivationcodeMeLessThanOrEqualTo(String value) {
            addCriterion("activationCode_me <=", value, "activationcodeMe");
            return (Criteria) this;
        }

        public Criteria andActivationcodeMeLike(String value) {
            addCriterion("activationCode_me like", value, "activationcodeMe");
            return (Criteria) this;
        }

        public Criteria andActivationcodeMeNotLike(String value) {
            addCriterion("activationCode_me not like", value, "activationcodeMe");
            return (Criteria) this;
        }

        public Criteria andActivationcodeMeIn(List<String> values) {
            addCriterion("activationCode_me in", values, "activationcodeMe");
            return (Criteria) this;
        }

        public Criteria andActivationcodeMeNotIn(List<String> values) {
            addCriterion("activationCode_me not in", values, "activationcodeMe");
            return (Criteria) this;
        }

        public Criteria andActivationcodeMeBetween(String value1, String value2) {
            addCriterion("activationCode_me between", value1, value2, "activationcodeMe");
            return (Criteria) this;
        }

        public Criteria andActivationcodeMeNotBetween(String value1, String value2) {
            addCriterion("activationCode_me not between", value1, value2, "activationcodeMe");
            return (Criteria) this;
        }

        public Criteria andActivationcodeWhoIsNull() {
            addCriterion("activationCode_who is null");
            return (Criteria) this;
        }

        public Criteria andActivationcodeWhoIsNotNull() {
            addCriterion("activationCode_who is not null");
            return (Criteria) this;
        }

        public Criteria andActivationcodeWhoEqualTo(String value) {
            addCriterion("activationCode_who =", value, "activationcodeWho");
            return (Criteria) this;
        }

        public Criteria andActivationcodeWhoNotEqualTo(String value) {
            addCriterion("activationCode_who <>", value, "activationcodeWho");
            return (Criteria) this;
        }

        public Criteria andActivationcodeWhoGreaterThan(String value) {
            addCriterion("activationCode_who >", value, "activationcodeWho");
            return (Criteria) this;
        }

        public Criteria andActivationcodeWhoGreaterThanOrEqualTo(String value) {
            addCriterion("activationCode_who >=", value, "activationcodeWho");
            return (Criteria) this;
        }

        public Criteria andActivationcodeWhoLessThan(String value) {
            addCriterion("activationCode_who <", value, "activationcodeWho");
            return (Criteria) this;
        }

        public Criteria andActivationcodeWhoLessThanOrEqualTo(String value) {
            addCriterion("activationCode_who <=", value, "activationcodeWho");
            return (Criteria) this;
        }

        public Criteria andActivationcodeWhoLike(String value) {
            addCriterion("activationCode_who like", value, "activationcodeWho");
            return (Criteria) this;
        }

        public Criteria andActivationcodeWhoNotLike(String value) {
            addCriterion("activationCode_who not like", value, "activationcodeWho");
            return (Criteria) this;
        }

        public Criteria andActivationcodeWhoIn(List<String> values) {
            addCriterion("activationCode_who in", values, "activationcodeWho");
            return (Criteria) this;
        }

        public Criteria andActivationcodeWhoNotIn(List<String> values) {
            addCriterion("activationCode_who not in", values, "activationcodeWho");
            return (Criteria) this;
        }

        public Criteria andActivationcodeWhoBetween(String value1, String value2) {
            addCriterion("activationCode_who between", value1, value2, "activationcodeWho");
            return (Criteria) this;
        }

        public Criteria andActivationcodeWhoNotBetween(String value1, String value2) {
            addCriterion("activationCode_who not between", value1, value2, "activationcodeWho");
            return (Criteria) this;
        }

        public Criteria andLimitIsNull() {
            addCriterion("limit is null");
            return (Criteria) this;
        }

        public Criteria andLimitIsNotNull() {
            addCriterion("limit is not null");
            return (Criteria) this;
        }

        public Criteria andLimitEqualTo(String value) {
            addCriterion("limit =", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotEqualTo(String value) {
            addCriterion("limit <>", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThan(String value) {
            addCriterion("limit >", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThanOrEqualTo(String value) {
            addCriterion("limit >=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThan(String value) {
            addCriterion("limit <", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThanOrEqualTo(String value) {
            addCriterion("limit <=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLike(String value) {
            addCriterion("limit like", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotLike(String value) {
            addCriterion("limit not like", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitIn(List<String> values) {
            addCriterion("limit in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotIn(List<String> values) {
            addCriterion("limit not in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitBetween(String value1, String value2) {
            addCriterion("limit between", value1, value2, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotBetween(String value1, String value2) {
            addCriterion("limit not between", value1, value2, "limit");
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