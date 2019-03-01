package cn.suyuan.dao.mapper;

import cn.suyuan.dao.pojo.Pricingpackage;
import cn.suyuan.dao.pojo.PricingpackageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PricingpackageMapper {
    int countByExample(PricingpackageExample example);

    int deleteByExample(PricingpackageExample example);

    int deleteByPrimaryKey(String setmealid);

    int insert(Pricingpackage record);

    int insertSelective(Pricingpackage record);

    List<Pricingpackage> selectByExample(PricingpackageExample example);

    Pricingpackage selectByPrimaryKey(String setmealid);

    int updateByExampleSelective(@Param("record") Pricingpackage record, @Param("example") PricingpackageExample example);

    int updateByExample(@Param("record") Pricingpackage record, @Param("example") PricingpackageExample example);

    int updateByPrimaryKeySelective(Pricingpackage record);

    int updateByPrimaryKey(Pricingpackage record);
}