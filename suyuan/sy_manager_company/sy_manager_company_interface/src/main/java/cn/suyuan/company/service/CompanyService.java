package cn.suyuan.company.service;

import cn.suyuan.common.utils.SYResult;
import cn.suyuan.dao.pojo.Company;
import cn.suyuan.dao.pojo.CompanyWithBLOBs;

/**
 * @Auther: YunHai
 * @Date: 2019/2/7 21:54
 * @Description: 获取公司表信息service
 */
public interface CompanyService {
    /**
     * 通过公司id  获取对应的信息
     * @param id
     * @return
     */
    CompanyWithBLOBs getComapanyById(String id);

    /**
     * 添加新的公司
     * @param company
     * @return
     */
    SYResult insertCompany(CompanyWithBLOBs company);

    /**
     * 修改公司信息
     * @param company
     * @return
     */
    SYResult updateCompany(CompanyWithBLOBs company);

    /**
     * 根据id 删除对应的公司信息
     * @param id
     * @return
     */
    SYResult deleteCompany(String id);

}
