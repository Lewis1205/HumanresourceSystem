package com.lewis.mapper;

import com.lewis.pojo.SalaryStandard;
import com.lewis.pojo.SalaryStandardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalaryStandardMapper {
    int countByExample(SalaryStandardExample example);

    int deleteByExample(SalaryStandardExample example);

    int deleteByPrimaryKey(Integer standardId);

    int insert(SalaryStandard record);

    int insertSelective(SalaryStandard record);

    List<SalaryStandard> selectByExample(SalaryStandardExample example);

    SalaryStandard selectByPrimaryKey(Integer standardId);

    int updateByExampleSelective(@Param("record") SalaryStandard record, @Param("example") SalaryStandardExample example);

    int updateByExample(@Param("record") SalaryStandard record, @Param("example") SalaryStandardExample example);

    int updateByPrimaryKeySelective(SalaryStandard record);

    int updateByPrimaryKey(SalaryStandard record);
}