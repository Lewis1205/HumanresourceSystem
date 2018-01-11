package com.lewis.mapper;

import com.lewis.pojo.SalaryRecord;
import com.lewis.pojo.SalaryRecordExample;
import com.lewis.pojo.SalaryRecordExt;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SalaryRecordMapper {
	int countByExample(SalaryRecordExample example);

	int deleteByExample(SalaryRecordExample example);

	int deleteByPrimaryKey(Integer recordId);

	int insert(SalaryRecord record);

	int insertSelective(SalaryRecord record);

	List<SalaryRecord> selectByExample(SalaryRecordExample example);

	SalaryRecord selectByPrimaryKey(Integer recordId);

	int updateByExampleSelective(@Param("record") SalaryRecord record,
			@Param("example") SalaryRecordExample example);

	int updateByExample(@Param("record") SalaryRecord record,
			@Param("example") SalaryRecordExample example);

	int updateByPrimaryKeySelective(SalaryRecord record);

	int updateByPrimaryKey(SalaryRecord record);

	List<SalaryRecordExt> selectUncheckedRecordAndDetails();
}