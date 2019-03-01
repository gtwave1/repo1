package cn.suyuan.dao.pojo;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
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

        public Criteria andOfficewebsiteIsNull() {
            addCriterion("officeWebsite is null");
            return (Criteria) this;
        }

        public Criteria andOfficewebsiteIsNotNull() {
            addCriterion("officeWebsite is not null");
            return (Criteria) this;
        }

        public Criteria andOfficewebsiteEqualTo(String value) {
            addCriterion("officeWebsite =", value, "officewebsite");
            return (Criteria) this;
        }

        public Criteria andOfficewebsiteNotEqualTo(String value) {
            addCriterion("officeWebsite <>", value, "officewebsite");
            return (Criteria) this;
        }

        public Criteria andOfficewebsiteGreaterThan(String value) {
            addCriterion("officeWebsite >", value, "officewebsite");
            return (Criteria) this;
        }

        public Criteria andOfficewebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("officeWebsite >=", value, "officewebsite");
            return (Criteria) this;
        }

        public Criteria andOfficewebsiteLessThan(String value) {
            addCriterion("officeWebsite <", value, "officewebsite");
            return (Criteria) this;
        }

        public Criteria andOfficewebsiteLessThanOrEqualTo(String value) {
            addCriterion("officeWebsite <=", value, "officewebsite");
            return (Criteria) this;
        }

        public Criteria andOfficewebsiteLike(String value) {
            addCriterion("officeWebsite like", value, "officewebsite");
            return (Criteria) this;
        }

        public Criteria andOfficewebsiteNotLike(String value) {
            addCriterion("officeWebsite not like", value, "officewebsite");
            return (Criteria) this;
        }

        public Criteria andOfficewebsiteIn(List<String> values) {
            addCriterion("officeWebsite in", values, "officewebsite");
            return (Criteria) this;
        }

        public Criteria andOfficewebsiteNotIn(List<String> values) {
            addCriterion("officeWebsite not in", values, "officewebsite");
            return (Criteria) this;
        }

        public Criteria andOfficewebsiteBetween(String value1, String value2) {
            addCriterion("officeWebsite between", value1, value2, "officewebsite");
            return (Criteria) this;
        }

        public Criteria andOfficewebsiteNotBetween(String value1, String value2) {
            addCriterion("officeWebsite not between", value1, value2, "officewebsite");
            return (Criteria) this;
        }

        public Criteria andSynopsisIsNull() {
            addCriterion("synopsis is null");
            return (Criteria) this;
        }

        public Criteria andSynopsisIsNotNull() {
            addCriterion("synopsis is not null");
            return (Criteria) this;
        }

        public Criteria andSynopsisEqualTo(String value) {
            addCriterion("synopsis =", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisNotEqualTo(String value) {
            addCriterion("synopsis <>", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisGreaterThan(String value) {
            addCriterion("synopsis >", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisGreaterThanOrEqualTo(String value) {
            addCriterion("synopsis >=", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisLessThan(String value) {
            addCriterion("synopsis <", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisLessThanOrEqualTo(String value) {
            addCriterion("synopsis <=", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisLike(String value) {
            addCriterion("synopsis like", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisNotLike(String value) {
            addCriterion("synopsis not like", value, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisIn(List<String> values) {
            addCriterion("synopsis in", values, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisNotIn(List<String> values) {
            addCriterion("synopsis not in", values, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisBetween(String value1, String value2) {
            addCriterion("synopsis between", value1, value2, "synopsis");
            return (Criteria) this;
        }

        public Criteria andSynopsisNotBetween(String value1, String value2) {
            addCriterion("synopsis not between", value1, value2, "synopsis");
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenceIsNull() {
            addCriterion("businessLicence is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenceIsNotNull() {
            addCriterion("businessLicence is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenceEqualTo(String value) {
            addCriterion("businessLicence =", value, "businesslicence");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenceNotEqualTo(String value) {
            addCriterion("businessLicence <>", value, "businesslicence");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenceGreaterThan(String value) {
            addCriterion("businessLicence >", value, "businesslicence");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenceGreaterThanOrEqualTo(String value) {
            addCriterion("businessLicence >=", value, "businesslicence");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenceLessThan(String value) {
            addCriterion("businessLicence <", value, "businesslicence");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenceLessThanOrEqualTo(String value) {
            addCriterion("businessLicence <=", value, "businesslicence");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenceLike(String value) {
            addCriterion("businessLicence like", value, "businesslicence");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenceNotLike(String value) {
            addCriterion("businessLicence not like", value, "businesslicence");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenceIn(List<String> values) {
            addCriterion("businessLicence in", values, "businesslicence");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenceNotIn(List<String> values) {
            addCriterion("businessLicence not in", values, "businesslicence");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenceBetween(String value1, String value2) {
            addCriterion("businessLicence between", value1, value2, "businesslicence");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenceNotBetween(String value1, String value2) {
            addCriterion("businessLicence not between", value1, value2, "businesslicence");
            return (Criteria) this;
        }

        public Criteria andBusinesscardIsNull() {
            addCriterion("businessCard is null");
            return (Criteria) this;
        }

        public Criteria andBusinesscardIsNotNull() {
            addCriterion("businessCard is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesscardEqualTo(String value) {
            addCriterion("businessCard =", value, "businesscard");
            return (Criteria) this;
        }

        public Criteria andBusinesscardNotEqualTo(String value) {
            addCriterion("businessCard <>", value, "businesscard");
            return (Criteria) this;
        }

        public Criteria andBusinesscardGreaterThan(String value) {
            addCriterion("businessCard >", value, "businesscard");
            return (Criteria) this;
        }

        public Criteria andBusinesscardGreaterThanOrEqualTo(String value) {
            addCriterion("businessCard >=", value, "businesscard");
            return (Criteria) this;
        }

        public Criteria andBusinesscardLessThan(String value) {
            addCriterion("businessCard <", value, "businesscard");
            return (Criteria) this;
        }

        public Criteria andBusinesscardLessThanOrEqualTo(String value) {
            addCriterion("businessCard <=", value, "businesscard");
            return (Criteria) this;
        }

        public Criteria andBusinesscardLike(String value) {
            addCriterion("businessCard like", value, "businesscard");
            return (Criteria) this;
        }

        public Criteria andBusinesscardNotLike(String value) {
            addCriterion("businessCard not like", value, "businesscard");
            return (Criteria) this;
        }

        public Criteria andBusinesscardIn(List<String> values) {
            addCriterion("businessCard in", values, "businesscard");
            return (Criteria) this;
        }

        public Criteria andBusinesscardNotIn(List<String> values) {
            addCriterion("businessCard not in", values, "businesscard");
            return (Criteria) this;
        }

        public Criteria andBusinesscardBetween(String value1, String value2) {
            addCriterion("businessCard between", value1, value2, "businesscard");
            return (Criteria) this;
        }

        public Criteria andBusinesscardNotBetween(String value1, String value2) {
            addCriterion("businessCard not between", value1, value2, "businesscard");
            return (Criteria) this;
        }

        public Criteria andWordcardIsNull() {
            addCriterion("wordCard is null");
            return (Criteria) this;
        }

        public Criteria andWordcardIsNotNull() {
            addCriterion("wordCard is not null");
            return (Criteria) this;
        }

        public Criteria andWordcardEqualTo(String value) {
            addCriterion("wordCard =", value, "wordcard");
            return (Criteria) this;
        }

        public Criteria andWordcardNotEqualTo(String value) {
            addCriterion("wordCard <>", value, "wordcard");
            return (Criteria) this;
        }

        public Criteria andWordcardGreaterThan(String value) {
            addCriterion("wordCard >", value, "wordcard");
            return (Criteria) this;
        }

        public Criteria andWordcardGreaterThanOrEqualTo(String value) {
            addCriterion("wordCard >=", value, "wordcard");
            return (Criteria) this;
        }

        public Criteria andWordcardLessThan(String value) {
            addCriterion("wordCard <", value, "wordcard");
            return (Criteria) this;
        }

        public Criteria andWordcardLessThanOrEqualTo(String value) {
            addCriterion("wordCard <=", value, "wordcard");
            return (Criteria) this;
        }

        public Criteria andWordcardLike(String value) {
            addCriterion("wordCard like", value, "wordcard");
            return (Criteria) this;
        }

        public Criteria andWordcardNotLike(String value) {
            addCriterion("wordCard not like", value, "wordcard");
            return (Criteria) this;
        }

        public Criteria andWordcardIn(List<String> values) {
            addCriterion("wordCard in", values, "wordcard");
            return (Criteria) this;
        }

        public Criteria andWordcardNotIn(List<String> values) {
            addCriterion("wordCard not in", values, "wordcard");
            return (Criteria) this;
        }

        public Criteria andWordcardBetween(String value1, String value2) {
            addCriterion("wordCard between", value1, value2, "wordcard");
            return (Criteria) this;
        }

        public Criteria andWordcardNotBetween(String value1, String value2) {
            addCriterion("wordCard not between", value1, value2, "wordcard");
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

        public Criteria andAreaIsNull() {
            addCriterion("Area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("Area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("Area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("Area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("Area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("Area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("Area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("Area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("Area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("Area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("Area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("Area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("Area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("Area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Integer value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Integer value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Integer value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Integer value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Integer value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Integer> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Integer> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Integer value1, Integer value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("size not between", value1, value2, "size");
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

        public Criteria andIndustryEqualTo(Integer value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(Integer value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(Integer value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(Integer value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<Integer> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<Integer> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(Integer value1, Integer value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andEmployeenumIsNull() {
            addCriterion("employeeNum is null");
            return (Criteria) this;
        }

        public Criteria andEmployeenumIsNotNull() {
            addCriterion("employeeNum is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeenumEqualTo(Integer value) {
            addCriterion("employeeNum =", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumNotEqualTo(Integer value) {
            addCriterion("employeeNum <>", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumGreaterThan(Integer value) {
            addCriterion("employeeNum >", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("employeeNum >=", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumLessThan(Integer value) {
            addCriterion("employeeNum <", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumLessThanOrEqualTo(Integer value) {
            addCriterion("employeeNum <=", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumIn(List<Integer> values) {
            addCriterion("employeeNum in", values, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumNotIn(List<Integer> values) {
            addCriterion("employeeNum not in", values, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumBetween(Integer value1, Integer value2) {
            addCriterion("employeeNum between", value1, value2, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumNotBetween(Integer value1, Integer value2) {
            addCriterion("employeeNum not between", value1, value2, "employeenum");
            return (Criteria) this;
        }

        public Criteria andTurnoverIsNull() {
            addCriterion("turnover is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverIsNotNull() {
            addCriterion("turnover is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverEqualTo(Integer value) {
            addCriterion("turnover =", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotEqualTo(Integer value) {
            addCriterion("turnover <>", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverGreaterThan(Integer value) {
            addCriterion("turnover >", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverGreaterThanOrEqualTo(Integer value) {
            addCriterion("turnover >=", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLessThan(Integer value) {
            addCriterion("turnover <", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLessThanOrEqualTo(Integer value) {
            addCriterion("turnover <=", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverIn(List<Integer> values) {
            addCriterion("turnover in", values, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotIn(List<Integer> values) {
            addCriterion("turnover not in", values, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverBetween(Integer value1, Integer value2) {
            addCriterion("turnover between", value1, value2, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotBetween(Integer value1, Integer value2) {
            addCriterion("turnover not between", value1, value2, "turnover");
            return (Criteria) this;
        }

        public Criteria andDatacompletenessIsNull() {
            addCriterion("dataCompleteness is null");
            return (Criteria) this;
        }

        public Criteria andDatacompletenessIsNotNull() {
            addCriterion("dataCompleteness is not null");
            return (Criteria) this;
        }

        public Criteria andDatacompletenessEqualTo(Integer value) {
            addCriterion("dataCompleteness =", value, "datacompleteness");
            return (Criteria) this;
        }

        public Criteria andDatacompletenessNotEqualTo(Integer value) {
            addCriterion("dataCompleteness <>", value, "datacompleteness");
            return (Criteria) this;
        }

        public Criteria andDatacompletenessGreaterThan(Integer value) {
            addCriterion("dataCompleteness >", value, "datacompleteness");
            return (Criteria) this;
        }

        public Criteria andDatacompletenessGreaterThanOrEqualTo(Integer value) {
            addCriterion("dataCompleteness >=", value, "datacompleteness");
            return (Criteria) this;
        }

        public Criteria andDatacompletenessLessThan(Integer value) {
            addCriterion("dataCompleteness <", value, "datacompleteness");
            return (Criteria) this;
        }

        public Criteria andDatacompletenessLessThanOrEqualTo(Integer value) {
            addCriterion("dataCompleteness <=", value, "datacompleteness");
            return (Criteria) this;
        }

        public Criteria andDatacompletenessIn(List<Integer> values) {
            addCriterion("dataCompleteness in", values, "datacompleteness");
            return (Criteria) this;
        }

        public Criteria andDatacompletenessNotIn(List<Integer> values) {
            addCriterion("dataCompleteness not in", values, "datacompleteness");
            return (Criteria) this;
        }

        public Criteria andDatacompletenessBetween(Integer value1, Integer value2) {
            addCriterion("dataCompleteness between", value1, value2, "datacompleteness");
            return (Criteria) this;
        }

        public Criteria andDatacompletenessNotBetween(Integer value1, Integer value2) {
            addCriterion("dataCompleteness not between", value1, value2, "datacompleteness");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Double value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Double value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Double value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Double value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Double value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Double> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Double> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Double value1, Double value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Double value1, Double value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andShoptrendsIsNull() {
            addCriterion("shopTrends is null");
            return (Criteria) this;
        }

        public Criteria andShoptrendsIsNotNull() {
            addCriterion("shopTrends is not null");
            return (Criteria) this;
        }

        public Criteria andShoptrendsEqualTo(String value) {
            addCriterion("shopTrends =", value, "shoptrends");
            return (Criteria) this;
        }

        public Criteria andShoptrendsNotEqualTo(String value) {
            addCriterion("shopTrends <>", value, "shoptrends");
            return (Criteria) this;
        }

        public Criteria andShoptrendsGreaterThan(String value) {
            addCriterion("shopTrends >", value, "shoptrends");
            return (Criteria) this;
        }

        public Criteria andShoptrendsGreaterThanOrEqualTo(String value) {
            addCriterion("shopTrends >=", value, "shoptrends");
            return (Criteria) this;
        }

        public Criteria andShoptrendsLessThan(String value) {
            addCriterion("shopTrends <", value, "shoptrends");
            return (Criteria) this;
        }

        public Criteria andShoptrendsLessThanOrEqualTo(String value) {
            addCriterion("shopTrends <=", value, "shoptrends");
            return (Criteria) this;
        }

        public Criteria andShoptrendsLike(String value) {
            addCriterion("shopTrends like", value, "shoptrends");
            return (Criteria) this;
        }

        public Criteria andShoptrendsNotLike(String value) {
            addCriterion("shopTrends not like", value, "shoptrends");
            return (Criteria) this;
        }

        public Criteria andShoptrendsIn(List<String> values) {
            addCriterion("shopTrends in", values, "shoptrends");
            return (Criteria) this;
        }

        public Criteria andShoptrendsNotIn(List<String> values) {
            addCriterion("shopTrends not in", values, "shoptrends");
            return (Criteria) this;
        }

        public Criteria andShoptrendsBetween(String value1, String value2) {
            addCriterion("shopTrends between", value1, value2, "shoptrends");
            return (Criteria) this;
        }

        public Criteria andShoptrendsNotBetween(String value1, String value2) {
            addCriterion("shopTrends not between", value1, value2, "shoptrends");
            return (Criteria) this;
        }

        public Criteria andShopassessIsNull() {
            addCriterion("shopAssess is null");
            return (Criteria) this;
        }

        public Criteria andShopassessIsNotNull() {
            addCriterion("shopAssess is not null");
            return (Criteria) this;
        }

        public Criteria andShopassessEqualTo(String value) {
            addCriterion("shopAssess =", value, "shopassess");
            return (Criteria) this;
        }

        public Criteria andShopassessNotEqualTo(String value) {
            addCriterion("shopAssess <>", value, "shopassess");
            return (Criteria) this;
        }

        public Criteria andShopassessGreaterThan(String value) {
            addCriterion("shopAssess >", value, "shopassess");
            return (Criteria) this;
        }

        public Criteria andShopassessGreaterThanOrEqualTo(String value) {
            addCriterion("shopAssess >=", value, "shopassess");
            return (Criteria) this;
        }

        public Criteria andShopassessLessThan(String value) {
            addCriterion("shopAssess <", value, "shopassess");
            return (Criteria) this;
        }

        public Criteria andShopassessLessThanOrEqualTo(String value) {
            addCriterion("shopAssess <=", value, "shopassess");
            return (Criteria) this;
        }

        public Criteria andShopassessLike(String value) {
            addCriterion("shopAssess like", value, "shopassess");
            return (Criteria) this;
        }

        public Criteria andShopassessNotLike(String value) {
            addCriterion("shopAssess not like", value, "shopassess");
            return (Criteria) this;
        }

        public Criteria andShopassessIn(List<String> values) {
            addCriterion("shopAssess in", values, "shopassess");
            return (Criteria) this;
        }

        public Criteria andShopassessNotIn(List<String> values) {
            addCriterion("shopAssess not in", values, "shopassess");
            return (Criteria) this;
        }

        public Criteria andShopassessBetween(String value1, String value2) {
            addCriterion("shopAssess between", value1, value2, "shopassess");
            return (Criteria) this;
        }

        public Criteria andShopassessNotBetween(String value1, String value2) {
            addCriterion("shopAssess not between", value1, value2, "shopassess");
            return (Criteria) this;
        }

        public Criteria andSocialmediaIsNull() {
            addCriterion("socialMedia is null");
            return (Criteria) this;
        }

        public Criteria andSocialmediaIsNotNull() {
            addCriterion("socialMedia is not null");
            return (Criteria) this;
        }

        public Criteria andSocialmediaEqualTo(String value) {
            addCriterion("socialMedia =", value, "socialmedia");
            return (Criteria) this;
        }

        public Criteria andSocialmediaNotEqualTo(String value) {
            addCriterion("socialMedia <>", value, "socialmedia");
            return (Criteria) this;
        }

        public Criteria andSocialmediaGreaterThan(String value) {
            addCriterion("socialMedia >", value, "socialmedia");
            return (Criteria) this;
        }

        public Criteria andSocialmediaGreaterThanOrEqualTo(String value) {
            addCriterion("socialMedia >=", value, "socialmedia");
            return (Criteria) this;
        }

        public Criteria andSocialmediaLessThan(String value) {
            addCriterion("socialMedia <", value, "socialmedia");
            return (Criteria) this;
        }

        public Criteria andSocialmediaLessThanOrEqualTo(String value) {
            addCriterion("socialMedia <=", value, "socialmedia");
            return (Criteria) this;
        }

        public Criteria andSocialmediaLike(String value) {
            addCriterion("socialMedia like", value, "socialmedia");
            return (Criteria) this;
        }

        public Criteria andSocialmediaNotLike(String value) {
            addCriterion("socialMedia not like", value, "socialmedia");
            return (Criteria) this;
        }

        public Criteria andSocialmediaIn(List<String> values) {
            addCriterion("socialMedia in", values, "socialmedia");
            return (Criteria) this;
        }

        public Criteria andSocialmediaNotIn(List<String> values) {
            addCriterion("socialMedia not in", values, "socialmedia");
            return (Criteria) this;
        }

        public Criteria andSocialmediaBetween(String value1, String value2) {
            addCriterion("socialMedia between", value1, value2, "socialmedia");
            return (Criteria) this;
        }

        public Criteria andSocialmediaNotBetween(String value1, String value2) {
            addCriterion("socialMedia not between", value1, value2, "socialmedia");
            return (Criteria) this;
        }

        public Criteria andConsultIsNull() {
            addCriterion("consult is null");
            return (Criteria) this;
        }

        public Criteria andConsultIsNotNull() {
            addCriterion("consult is not null");
            return (Criteria) this;
        }

        public Criteria andConsultEqualTo(String value) {
            addCriterion("consult =", value, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultNotEqualTo(String value) {
            addCriterion("consult <>", value, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultGreaterThan(String value) {
            addCriterion("consult >", value, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultGreaterThanOrEqualTo(String value) {
            addCriterion("consult >=", value, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultLessThan(String value) {
            addCriterion("consult <", value, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultLessThanOrEqualTo(String value) {
            addCriterion("consult <=", value, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultLike(String value) {
            addCriterion("consult like", value, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultNotLike(String value) {
            addCriterion("consult not like", value, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultIn(List<String> values) {
            addCriterion("consult in", values, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultNotIn(List<String> values) {
            addCriterion("consult not in", values, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultBetween(String value1, String value2) {
            addCriterion("consult between", value1, value2, "consult");
            return (Criteria) this;
        }

        public Criteria andConsultNotBetween(String value1, String value2) {
            addCriterion("consult not between", value1, value2, "consult");
            return (Criteria) this;
        }

        public Criteria andCorporationIsNull() {
            addCriterion("corporation is null");
            return (Criteria) this;
        }

        public Criteria andCorporationIsNotNull() {
            addCriterion("corporation is not null");
            return (Criteria) this;
        }

        public Criteria andCorporationEqualTo(String value) {
            addCriterion("corporation =", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotEqualTo(String value) {
            addCriterion("corporation <>", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationGreaterThan(String value) {
            addCriterion("corporation >", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationGreaterThanOrEqualTo(String value) {
            addCriterion("corporation >=", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationLessThan(String value) {
            addCriterion("corporation <", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationLessThanOrEqualTo(String value) {
            addCriterion("corporation <=", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationLike(String value) {
            addCriterion("corporation like", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotLike(String value) {
            addCriterion("corporation not like", value, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationIn(List<String> values) {
            addCriterion("corporation in", values, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotIn(List<String> values) {
            addCriterion("corporation not in", values, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationBetween(String value1, String value2) {
            addCriterion("corporation between", value1, value2, "corporation");
            return (Criteria) this;
        }

        public Criteria andCorporationNotBetween(String value1, String value2) {
            addCriterion("corporation not between", value1, value2, "corporation");
            return (Criteria) this;
        }

        public Criteria andCustomservicephoneIsNull() {
            addCriterion("customServicePhone is null");
            return (Criteria) this;
        }

        public Criteria andCustomservicephoneIsNotNull() {
            addCriterion("customServicePhone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomservicephoneEqualTo(String value) {
            addCriterion("customServicePhone =", value, "customservicephone");
            return (Criteria) this;
        }

        public Criteria andCustomservicephoneNotEqualTo(String value) {
            addCriterion("customServicePhone <>", value, "customservicephone");
            return (Criteria) this;
        }

        public Criteria andCustomservicephoneGreaterThan(String value) {
            addCriterion("customServicePhone >", value, "customservicephone");
            return (Criteria) this;
        }

        public Criteria andCustomservicephoneGreaterThanOrEqualTo(String value) {
            addCriterion("customServicePhone >=", value, "customservicephone");
            return (Criteria) this;
        }

        public Criteria andCustomservicephoneLessThan(String value) {
            addCriterion("customServicePhone <", value, "customservicephone");
            return (Criteria) this;
        }

        public Criteria andCustomservicephoneLessThanOrEqualTo(String value) {
            addCriterion("customServicePhone <=", value, "customservicephone");
            return (Criteria) this;
        }

        public Criteria andCustomservicephoneLike(String value) {
            addCriterion("customServicePhone like", value, "customservicephone");
            return (Criteria) this;
        }

        public Criteria andCustomservicephoneNotLike(String value) {
            addCriterion("customServicePhone not like", value, "customservicephone");
            return (Criteria) this;
        }

        public Criteria andCustomservicephoneIn(List<String> values) {
            addCriterion("customServicePhone in", values, "customservicephone");
            return (Criteria) this;
        }

        public Criteria andCustomservicephoneNotIn(List<String> values) {
            addCriterion("customServicePhone not in", values, "customservicephone");
            return (Criteria) this;
        }

        public Criteria andCustomservicephoneBetween(String value1, String value2) {
            addCriterion("customServicePhone between", value1, value2, "customservicephone");
            return (Criteria) this;
        }

        public Criteria andCustomservicephoneNotBetween(String value1, String value2) {
            addCriterion("customServicePhone not between", value1, value2, "customservicephone");
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