package cn.suyuan.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: YunHai
 * @Date: 2018/12/14 10:32
 * @Description:
 */
public class SearchCompanyResult implements Serializable {
    private long recordCount;
    private int totalCount;
    private List<SearchCompany> companyList;


    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public long getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(long recordCount) {
        this.recordCount = recordCount;
    }



    public List<SearchCompany> getItenList() {
        return companyList;
    }

    public void setItenList(List<SearchCompany> companyList) {
        this.companyList = companyList;
    }
}
