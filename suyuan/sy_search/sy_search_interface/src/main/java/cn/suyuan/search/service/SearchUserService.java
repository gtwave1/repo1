package cn.suyuan.search.service;

import cn.suyuan.common.pojo.SearchUserResult;

/**
 * @Auther: YunHai
 * @Date: 2019/2/1 18:39
 * @Description: 用户信息的solrService
 */
public interface SearchUserService {

    /**
     * 通过查询条件 获取指定页数的SearchUser对象
     * @param keyword: 查询条件
     * @param fq: 额外查询条件  格式: 键:值   例:"user_country:1","user_industry:1"
     * @param page: 起始页
     * @param rows 每页有多少条
     * @return
     */
    SearchUserResult getSearchUserByPageRows(String keyword, String[] fq, int page, int rows) throws Exception;
}
