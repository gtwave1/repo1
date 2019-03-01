package cn.suyuan.search.service.impl;

import cn.suyuan.common.pojo.SearchUser;
import cn.suyuan.common.pojo.SearchUserResult;
import cn.suyuan.search.service.SearchUserService;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Auther: YunHai
 * @Date: 2019/2/16 13:21
 * @Description: user索引库的读取
 */
@Service
public class SearchUserServiceImpl implements SearchUserService {

    @Autowired
    private SolrServer solrServer;

    /**
     * 根据条件查询search
     * @param keyword: 查询条件
     * @param page: 起始页
     * @param rows 每页有多少条
     * @return
     */
    @Override
    public SearchUserResult getSearchUserByPageRows(String keyword, String[] fq, int page, int rows) throws SolrServerException {
//        查询条件
        SolrQuery query = new SolrQuery();
        query.setQuery(keyword);
//        起始条数  如果<=0 说明是起始页
        if (page <= 0) page=1;
        query.setStart((page-1)*rows);
//        查询条数
        query.setRows(rows);
//        setQuery默认域
        query.set("df","user_copyname");

        query.setFilterQueries(fq);
//        高亮
        query.setHighlight(true);
        query.addHighlightField("user_nickname");
        query.addHighlightField("user_name");
        query.setHighlightSimplePre("<em style=\"color:red\">");
        query.setHighlightSimplePost("</em>");

//        获取查询结果
        SearchUserResult search = search(query);

//        获取当前页
        long recordCount = search.getRecordCount();
        int totalPage = (int) (recordCount / rows);
//        int类型向下取整 所以 如果% != 0   需要+1
        if(recordCount % rows != 0) ++totalPage;

//        赋值当前页
        search.setTotalCount(totalPage);

        return search;
    }


    /**
     * 执行query查询
     * @param solrQuery: 查询条件
     * @return 查询结果
     * @throws SolrServerException
     */
    private SearchUserResult search(SolrQuery solrQuery) throws SolrServerException {
        SearchUserResult result = new SearchUserResult();

//        查询并获取
        QueryResponse queryResponse = solrServer.query(solrQuery);
//        获取结果
        SolrDocumentList documentList = queryResponse.getResults();
//        总记录数
        long numFound = documentList.getNumFound();
        result.setRecordCount(numFound);

//        保存结果的list集合
        List<SearchUser> userList = new ArrayList<>(documentList.size());

//            id,         field       value   高亮集合
        Map<String, Map<String, List<String>>> highMap = queryResponse.getHighlighting();

        for(SolrDocument doc : documentList){
//            获取对应值
            SearchUser searchUser = new SearchUser();
            searchUser.setId((String) doc.get("id"));
            searchUser.setCompany((String) doc.get("user_company"));
            searchUser.setCountry((Integer) doc.get("user_country"));
            searchUser.setDuties((String) doc.get("user_duties"));
            searchUser.setOfficeWebsite((String) doc.get("user_officeWebsite"));

//            获取高亮
            List<String> userNickNameHigh = highMap.get(doc.get("id")).get("user_nickname");
//            如果list里面有值  说明有高亮    否则 没有高亮值
            String userNickname = userNickNameHigh != null && userNickNameHigh.size() > 0 ? userNickNameHigh.get(0) : (String) doc.get("user_nickname");

            List<String> userNameHigh = highMap.get(doc.get("id")).get("user_name");
            String userName = userNameHigh != null && userNameHigh.size() > 0 ? userNameHigh.get(0) : (String) doc.get("user_name");

//            赋值高亮
            searchUser.setName(userName);
            searchUser.setNickname(userNickname);

            userList.add(searchUser);
        }

//        将结果值赋给result
        result.setUserList(userList);

        return result;
    }
}
