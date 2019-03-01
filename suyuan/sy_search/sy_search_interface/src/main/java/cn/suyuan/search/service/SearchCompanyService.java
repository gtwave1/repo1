package cn.suyuan.search.service;

import cn.suyuan.common.pojo.SearchCompanyResult;

/**
 * @Auther: YunHai
 * @Date: 2019/2/1 18:58
 * @Description: 公司信息的Service
 */
public interface SearchCompanyService {

    /**
     * 通过查询条件 获取指定页数的SearchCommpany对象
     * @param keyword: 查询条件
     * @param page: 起始页
     * @param rows 每页有多少条
     * @return
     */
    SearchCompanyResult getSearchCompanyByPageRows(String keyword, String[] fq, int page, int rows);
}
