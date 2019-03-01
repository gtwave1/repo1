package cn.suyuan.dao.pojo;

public class Pricingpackage {
    private String setmealid;

    private String name;

    private Integer price;

    private Integer count;

    public String getSetmealid() {
        return setmealid;
    }

    public void setSetmealid(String setmealid) {
        this.setmealid = setmealid == null ? null : setmealid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}