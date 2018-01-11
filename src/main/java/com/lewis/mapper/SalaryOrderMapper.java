package com.lewis.mapper;

import com.lewis.pojo.SalaryOrder;
import com.lewis.pojo.SalaryOrderExample;
import com.lewis.webmodel.OrderQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SalaryOrderMapper {
	int countByExample(SalaryOrderExample example);

	int deleteByExample(SalaryOrderExample example);

	int deleteByPrimaryKey(Integer orderId);

	int insert(SalaryOrder record);

	int insertSelective(SalaryOrder record);

	List<SalaryOrder> selectByExample(SalaryOrderExample example);

	SalaryOrder selectByPrimaryKey(Integer orderId);

	int updateByExampleSelective(@Param("record") SalaryOrder record,
			@Param("example") SalaryOrderExample example);

	int updateByExample(@Param("record") SalaryOrder record,
			@Param("example") SalaryOrderExample example);

	int updateByPrimaryKeySelective(SalaryOrder record);

	int updateByPrimaryKey(SalaryOrder record);

	List<SalaryOrder> selectByConditions(OrderQuery orderQuery);
}