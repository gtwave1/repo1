package cn.suyuan.dao.pojo;

public class UserWithBLOBs extends User {
    private String whoseeme;

    private String collectioncompany;

    private String collectionpeople;

    private String setmealid;

    public String getWhoseeme() {
        return whoseeme;
    }

    public void setWhoseeme(String whoseeme) {
        this.whoseeme = whoseeme == null ? null : whoseeme.trim();
    }

    public String getCollectioncompany() {
        return collectioncompany;
    }

    public void setCollectioncompany(String collectioncompany) {
        this.collectioncompany = collectioncompany == null ? null : collectioncompany.trim();
    }

    public String getCollectionpeople() {
        return collectionpeople;
    }

    public void setCollectionpeople(String collectionpeople) {
        this.collectionpeople = collectionpeople == null ? null : collectionpeople.trim();
    }

    public String getSetmealid() {
        return setmealid;
    }

    public void setSetmealid(String setmealid) {
        this.setmealid = setmealid == null ? null : setmealid.trim();
    }
}