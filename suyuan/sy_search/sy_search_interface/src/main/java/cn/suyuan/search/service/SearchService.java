package cn.suyuan.search.service;

import cn.suyuan.common.utils.SYResult;

import java.io.IOException;

/**
 * @Auther: YunHai
 * @Date: 2019/2/16 13:08
 * @Description: search的日常维护
 */
public interface SearchService {

    /**
     * 一键更新user索引库
     * @return
     */
    SYResult importAllUser();


    /**
     * 一键更新Company索引库
     * @return
     */
    SYResult importAllCompany() throws IOException /*,SolrServerException, Exception*/;

    /**
     * 一键更新所有索引库
     * @return
     */
    SYResult importAll();

}
