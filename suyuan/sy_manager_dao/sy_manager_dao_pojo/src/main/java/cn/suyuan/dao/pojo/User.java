package cn.suyuan.dao.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private String personid;

    private String nickname;

    private String phone;

    private String wechart;

    private String email;

    private String username;

    private String password;

    private Integer sex;

    private Integer country;

    private String homeaddress;

    private String name;

    private String company;

    private String companyname;

    private String industry;

    private String duties;

    private String wordcardpath;

    private String twitter;

    private String facebook;

    private String wechar;

    private String smalltv;

    private String businesslicense;

    private String activationcodeMe;

    private String activationcodeWho;

    private String limit;

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid == null ? null : personid.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getWechart() {
        return wechart;
    }

    public void setWechart(String wechart) {
        this.wechart = wechart == null ? null : wechart.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress == null ? null : homeaddress.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties == null ? null : duties.trim();
    }

    public String getWordcardpath() {
        return wordcardpath;
    }

    public void setWordcardpath(String wordcardpath) {
        this.wordcardpath = wordcardpath == null ? null : wordcardpath.trim();
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter == null ? null : twitter.trim();
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook == null ? null : facebook.trim();
    }

    public String getWechar() {
        return wechar;
    }

    public void setWechar(String wechar) {
        this.wechar = wechar == null ? null : wechar.trim();
    }

    public String getSmalltv() {
        return smalltv;
    }

    public void setSmalltv(String smalltv) {
        this.smalltv = smalltv == null ? null : smalltv.trim();
    }

    public String getBusinesslicense() {
        return businesslicense;
    }

    public void setBusinesslicense(String businesslicense) {
        this.businesslicense = businesslicense == null ? null : businesslicense.trim();
    }

    public String getActivationcodeMe() {
        return activationcodeMe;
    }

    public void setActivationcodeMe(String activationcodeMe) {
        this.activationcodeMe = activationcodeMe == null ? null : activationcodeMe.trim();
    }

    public String getActivationcodeWho() {
        return activationcodeWho;
    }

    public void setActivationcodeWho(String activationcodeWho) {
        this.activationcodeWho = activationcodeWho == null ? null : activationcodeWho.trim();
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit == null ? null : limit.trim();
    }
}