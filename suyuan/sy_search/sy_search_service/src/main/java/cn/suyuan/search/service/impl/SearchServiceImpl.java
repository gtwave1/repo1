package cn.suyuan.search.service.impl;

import cn.suyuan.common.pojo.SearchCompany;
import cn.suyuan.common.pojo.SearchUser;
import cn.suyuan.common.utils.SYResult;
import cn.suyuan.search.mapper.SearchCompanyMapper;
import cn.suyuan.search.mapper.SearchUserMapper;
import cn.suyuan.search.service.SearchService;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @Auther: YunHai
 * @Date: 2019/2/16 13:19
 * @Description: 索引库维护
 */
@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private SolrServer solrServer;

    @Autowired
    private SearchUserMapper userMapper;
    @Autowired
    private SearchCompanyMapper companyMapper;

    /**
     * 一键更新user索引库
     * @return
     */
    @Override
    public SYResult importAllUser() {
        try{
            List<SearchUser> list = userMapper.getUserList();
            for(SearchUser user : list){
                SolrInputDocument document = new SolrInputDocument();
                document.addField("id", user.getId());
                document.addField("user_nickname", user.getNickname());
                document.addField("user_name", user.getName());
                document.addField("user_country", user.getCountry());
                document.addField("user_duties", user.getDuties());
                document.addField("user_company", user.getCompany());
                document.addField("user_officeWebsite", user.getOfficeWebsite());
                document.addField("user_industry", user.getIndustry());
                System.out.println(user);
                solrServer.add(document);
            }
            solrServer.commit();
            return SYResult.ok();

        }catch (Exception e){
            e.printStackTrace();
            return SYResult.build(500, "导入失败");
        }
    }

    /**
     * 一键更新Company索引库
     * @return
     */
    @Override
    public SYResult importAllCompany() throws Exception {
        List<SearchCompany> companyList = companyMapper.getCompanyList();
        for(SearchCompany company : companyList){
//            创建InputDocument对象 将数据置入对应的域   存入solrService
            SolrInputDocument document = new SolrInputDocument();

            document.addField("id", company.getId());
            document.addField("company_name", company.getName());
            document.addField("company_country", company.getCountry());
            document.addField("company_employeenum", company.getEmployeeNum());
            document.addField("company_industry", company.getIndustry());
            document.addField("company_synopsis", company.getSynopsis());
            document.addField("company_turnover", company.getTurnover());
            document.addField("company_icon", company.getIcon());
            document.addField("company_officeWebsite", company.getOfficeWebsite());
            document.addField("company_dataCompleteness", company.getDataCompleteness());

            solrServer.add(document);
        }
        return null;
    }

    /**
     * 一键更新所有索引库
     * @return
     */
    @Override
    public SYResult importAll() {
        return null;
    }
}
