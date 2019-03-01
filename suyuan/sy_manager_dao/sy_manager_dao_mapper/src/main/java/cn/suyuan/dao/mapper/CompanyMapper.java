package cn.suyuan.dao.mapper;

import cn.suyuan.dao.pojo.Company;
import cn.suyuan.dao.pojo.CompanyExample;
import cn.suyuan.dao.pojo.CompanyWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompanyMapper {
    int countByExample(CompanyExample example);

    int deleteByExample(CompanyExample example);

    int deleteByPrimaryKey(String companyid);

    int insert(CompanyWithBLOBs record);

    int insertSelective(CompanyWithBLOBs record);

    List<CompanyWithBLOBs> selectByExampleWithBLOBs(CompanyExample example);

    List<Company> selectByExample(CompanyExample example);

    CompanyWithBLOBs selectByPrimaryKey(String companyid);

    int updateByExampleSelective(@Param("record") CompanyWithBLOBs record, @Param("example") CompanyExample example);

    int updateByExampleWithBLOBs(@Param("record") CompanyWithBLOBs record, @Param("example") CompanyExample example);

    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByPrimaryKeySelective(CompanyWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CompanyWithBLOBs record);

    int updateByPrimaryKey(Company record);
}