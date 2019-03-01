package cn.suyuan.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: YunHai
 * @Date: 2019/2/1 18:00
 * @Description: 首页Controller
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String showIndex(){
//        需要先获取search里面排名靠前的国家对象
        return "index";
    }
}
