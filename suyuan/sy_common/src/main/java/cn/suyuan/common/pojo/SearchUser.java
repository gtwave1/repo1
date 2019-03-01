package cn.suyuan.common.pojo;

import java.io.Serializable;

/**
 * @Auther: YunHai
 * @Date: 2018/12/12 17:36
 * @Description:
 */
public class SearchUser implements Serializable{
//   id 昵称 姓名 国家 职位 公司名 公司网站 行业
    private String id;
    private String nickname;
    private String name;
    private int country;
    private String duties;
    private String company;
    private String officeWebsite;
    private String industry;

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDuties() { return duties; }

    public void setDuties(String duties) { this.duties = duties; }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getOfficeWebsite() {
        return officeWebsite;
    }

    public void setOfficeWebsite(String officeWebsite) {
        this.officeWebsite = officeWebsite;
    }
}
