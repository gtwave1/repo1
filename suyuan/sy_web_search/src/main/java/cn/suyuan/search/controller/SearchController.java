package cn.suyuan.search.controller;

import cn.suyuan.common.pojo.SearchCompanyResult;
import cn.suyuan.common.pojo.SearchUserResult;
import cn.suyuan.common.utils.SYResult;
import cn.suyuan.search.service.SearchCompanyService;
import cn.suyuan.search.service.SearchService;
import cn.suyuan.search.service.SearchUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: YunHai
 * @Date: 2019/2/2 19:30
 * @Description: 搜索页面的comtroller
 */
@Controller
@RequestMapping("search")
public class SearchController {

//    @Autowired
//    private SearchCompanyService searchCompanyService;

    @Autowired
    private SearchUserService searchUserService;

    @Autowired
    private SearchService searchService;

    @Autowired
    private SearchCompanyService searchCompanyService;

    @Value("${SEARCH_COMPANY_ROWS}")
    private Integer SEARCH_COMPANY_ROWS;

    /**
     * 返回指定的公司展示数据
     * @param keyword: 查询条件
     * @param page: 第x页
     * @param model: 需要解释?
     * @return
     */
    @RequestMapping("/company")
    @ResponseBody
   public SYResult searchCompanyList(String keyword, @RequestParam(defaultValue = "1") Integer page,String[] fq, Model model){
        //根据条件获取指定数据
      SearchCompanyResult searchCompanyResult = searchCompanyService.getSearchCompanyByPageRows(keyword,fq, page, SEARCH_COMPANY_ROWS);
      // 存入model
       model.addAttribute("companyResult", searchCompanyResult);
      // 返回search下的company.jsp
       return SYResult.ok();
    }
    /**
     * 返回指定的用户展示数据
     * @param keyword: 查询条件
     * @param page: 第x页
     * @param model: 需要解释?
     * @return
     */
    @RequestMapping("user")
    public String searchUserList(@RequestParam(defaultValue = "*") String keyword, String[] fq, @RequestParam(defaultValue = "1") Integer page, Model model) throws Exception {
//        转utf-8
        keyword = new String(keyword.getBytes("iso-8859-1"), "utf-8");

//        根据条件获取指定数据
        SearchUserResult userResult = searchUserService.getSearchUserByPageRows(keyword, fq, page, SEARCH_COMPANY_ROWS);
//        存入model
        model.addAttribute("query", keyword);
        model.addAttribute("totalPages", userResult.getTotalCount());
        model.addAttribute("page", page);
        model.addAttribute("recourdCount", userResult.getRecordCount());
        model.addAttribute("userList", userResult.getUserList());

//        返回search下的user.jsp
        return "search";
    }

    @RequestMapping("update")
    @ResponseBody
    public String searchUpdate(){
//        System.out.println("--------\n\n--------");
        SYResult syResult = searchService.importAllUser();
        return "" + syResult.getStatus();
    }



}
