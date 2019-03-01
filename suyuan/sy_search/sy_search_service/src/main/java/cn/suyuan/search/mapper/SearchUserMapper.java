package cn.suyuan.search.mapper;

import cn.suyuan.common.pojo.SearchUser;

import java.util.List;

/**
 * @Auther: YunHai
 * @Date: 2019/2/17 11:13
 * @Description: 用于获取SearchUser的Mapper
 */
public interface SearchUserMapper {

    List<SearchUser> getUserList();

    SearchUser getUserById(String userId);
}
