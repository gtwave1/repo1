package cn.suyuan.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: YunHai
 * @Date: 2018/12/14 10:32
 * @Description:
 */
public class SearchUserResult implements Serializable {
//    查询总数
    private long recordCount;
//    当前页
    private int totalCount;
    private List<SearchUser> userList;


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



    public List<SearchUser> getUserList() {
        return userList;
    }

    public void setUserList(List<SearchUser> userList) {
        this.userList = userList;
    }
}
