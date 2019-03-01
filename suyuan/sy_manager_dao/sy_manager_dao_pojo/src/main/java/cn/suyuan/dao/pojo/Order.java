package cn.suyuan.dao.pojo;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private Long oderid;

    private Integer ordertype;

    private String companyid;

    private String personid;

    private String commodityid;

    private String orderstate;

    private String modepayment;

    private Integer ordermoney;

    private Date createtime;

    private Date updatetime;

    public Long getOderid() {
        return oderid;
    }

    public void setOderid(Long oderid) {
        this.oderid = oderid;
    }

    public Integer getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Integer ordertype) {
        this.ordertype = ordertype;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid == null ? null : personid.trim();
    }

    public String getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(String commodityid) {
        this.commodityid = commodityid == null ? null : commodityid.trim();
    }

    public String getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate == null ? null : orderstate.trim();
    }

    public String getModepayment() {
        return modepayment;
    }

    public void setModepayment(String modepayment) {
        this.modepayment = modepayment == null ? null : modepayment.trim();
    }

    public Integer getOrdermoney() {
        return ordermoney;
    }

    public void setOrdermoney(Integer ordermoney) {
        this.ordermoney = ordermoney;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}