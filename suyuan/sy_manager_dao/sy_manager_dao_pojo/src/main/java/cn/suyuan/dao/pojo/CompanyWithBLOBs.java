package cn.suyuan.dao.pojo;

public class CompanyWithBLOBs extends Company {
    private String desc;

    private String socialgraph;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getSocialgraph() {
        return socialgraph;
    }

    public void setSocialgraph(String socialgraph) {
        this.socialgraph = socialgraph == null ? null : socialgraph.trim();
    }
}