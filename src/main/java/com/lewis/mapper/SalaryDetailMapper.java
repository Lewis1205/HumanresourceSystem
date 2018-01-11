package com.lewis.mapper;

import com.lewis.pojo.SalaryDetail;
import com.lewis.pojo.SalaryDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalaryDetailMapper {
    int countByExample(SalaryDetailExample example);

    int deleteByExample(SalaryDetailExample example);

    int deleteByPrimaryKey(Integer sdetailId);

    int insert(SalaryDetail record);

    int insertSelective(SalaryDetail record);

    List<SalaryDetail> selectByExample(SalaryDetailExample example);

    SalaryDetail selectByPrimaryKey(Integer sdetailId);

    int updateByExampleSelective(@Param("record") SalaryDetail record, @Param("example") SalaryDetailExample example);

    int updateByExample(@Param("record") SalaryDetail record, @Param("example") SalaryDetailExample example);

    int updateByPrimaryKeySelective(SalaryDetail record);

    int updateByPrimaryKey(SalaryDetail record);
}