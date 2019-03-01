package cn.suyuan.search.service.impl;

import cn.suyuan.common.pojo.SearchCompanyResult;
import cn.suyuan.search.mapper.SearchCompanyMapper;
import cn.suyuan.search.service.SearchCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: YunHai
 * @Date: 2019/2/24 14:00
 * @Description: SearchCompany搜索的实现类
 */
@Service
public class SearchCompanyServiceImpl implements SearchCompanyService {
    @Autowired
    private SearchCompanyMapper searchCompanyMapper;

    /**
     * 传入查询条件和对应的数据
     * @param keyword: 查询条件
     * @param fq
     * @param page: 起始页
     * @param rows 每页有多少条
     * @return
     */
    @Override
    public SearchCompanyResult getSearchCompanyByPageRows(String keyword, String[] fq, int page, int rows) {
        return null;
    }
}
