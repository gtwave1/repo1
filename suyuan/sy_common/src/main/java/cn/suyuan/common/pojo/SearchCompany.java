package cn.suyuan.common.pojo;

import java.io.Serializable;

/**
 * @Auther: YunHai
 * @Date: 2018/12/12 17:36
 * @Description:
 */
public class SearchCompany implements Serializable{


    /*
    *
//    图标
	<field name="company_icon" type="string" indexed="false" stored="true" />
//	网址
	<field name="company_officeWebsite" type="string" indexed="false" stored="true" />
    * */

//   id 公司名 国家 员工数 行业 营业额 简介 图标 网址 资料齐全度
    private String id;
    private String name;
    private int country;
    private int employeeNum;
    private int industry;
    private int turnover;
    private String synopsis;
    private String icon;
    private String officeWebsite;
    private int dataCompleteness;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getOfficeWebsite() {
        return officeWebsite;
    }

    public void setOfficeWebsite(String officeWebsite) {
        this.officeWebsite = officeWebsite;
    }

    public int getDataCompleteness() {
        return dataCompleteness;
    }

    public void setDataCompleteness(int dataCompleteness) {
        this.dataCompleteness = dataCompleteness;
    }

    public int getTurnover() {
        return turnover;
    }

    public void setTurnover(int turnover) {
        this.turnover = turnover;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public int getIndustry() {
        return industry;
    }

    public void setIndustry(int industry) {
        this.industry = industry;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}
