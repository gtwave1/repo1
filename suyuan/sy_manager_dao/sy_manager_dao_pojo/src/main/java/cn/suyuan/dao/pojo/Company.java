package cn.suyuan.dao.pojo;

import java.io.Serializable;

public class Company implements Serializable{
    private String companyid;

    private String icon;

    private String companyname;

    private String officewebsite;

    private String synopsis;

    private String phone;

    private String address;

    private String fax;

    private String businesslicence;

    private String businesscard;

    private String wordcard;

    private Integer country;

    private String area;

    private Integer size;

    private Integer industry;

    private Integer employeenum;

    private Integer turnover;

    private Integer datacompleteness;

    private Double score;

    private String shoptrends;

    private String shopassess;

    private String socialmedia;

    private String consult;

    private String corporation;

    private String customservicephone;

    private String commodityid;

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getOfficewebsite() {
        return officewebsite;
    }

    public void setOfficewebsite(String officewebsite) {
        this.officewebsite = officewebsite == null ? null : officewebsite.trim();
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis == null ? null : synopsis.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getBusinesslicence() {
        return businesslicence;
    }

    public void setBusinesslicence(String businesslicence) {
        this.businesslicence = businesslicence == null ? null : businesslicence.trim();
    }

    public String getBusinesscard() {
        return businesscard;
    }

    public void setBusinesscard(String businesscard) {
        this.businesscard = businesscard == null ? null : businesscard.trim();
    }

    public String getWordcard() {
        return wordcard;
    }

    public void setWordcard(String wordcard) {
        this.wordcard = wordcard == null ? null : wordcard.trim();
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getIndustry() {
        return industry;
    }

    public void setIndustry(Integer industry) {
        this.industry = industry;
    }

    public Integer getEmployeenum() {
        return employeenum;
    }

    public void setEmployeenum(Integer employeenum) {
        this.employeenum = employeenum;
    }

    public Integer getTurnover() {
        return turnover;
    }

    public void setTurnover(Integer turnover) {
        this.turnover = turnover;
    }

    public Integer getDatacompleteness() {
        return datacompleteness;
    }

    public void setDatacompleteness(Integer datacompleteness) {
        this.datacompleteness = datacompleteness;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getShoptrends() {
        return shoptrends;
    }

    public void setShoptrends(String shoptrends) {
        this.shoptrends = shoptrends == null ? null : shoptrends.trim();
    }

    public String getShopassess() {
        return shopassess;
    }

    public void setShopassess(String shopassess) {
        this.shopassess = shopassess == null ? null : shopassess.trim();
    }

    public String getSocialmedia() {
        return socialmedia;
    }

    public void setSocialmedia(String socialmedia) {
        this.socialmedia = socialmedia == null ? null : socialmedia.trim();
    }

    public String getConsult() {
        return consult;
    }

    public void setConsult(String consult) {
        this.consult = consult == null ? null : consult.trim();
    }

    public String getCorporation() {
        return corporation;
    }

    public void setCorporation(String corporation) {
        this.corporation = corporation == null ? null : corporation.trim();
    }

    public String getCustomservicephone() {
        return customservicephone;
    }

    public void setCustomservicephone(String customservicephone) {
        this.customservicephone = customservicephone == null ? null : customservicephone.trim();
    }

    public String getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(String commodityid) {
        this.commodityid = commodityid == null ? null : commodityid.trim();
    }
}