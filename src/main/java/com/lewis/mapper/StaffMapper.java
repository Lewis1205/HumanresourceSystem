package com.lewis.mapper;

import com.lewis.pojo.SalaryOrder;
import com.lewis.pojo.Staff;
import com.lewis.pojo.StaffExample;
import com.lewis.pojo.StaffExt;
import com.lewis.pojo.StaffWithBLOBs;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface StaffMapper {
	int countByExample(StaffExample example);

	int deleteByExample(StaffExample example);

	int deleteByPrimaryKey(Integer staffId);

	int insert(StaffWithBLOBs record);

	int insertSelective(StaffWithBLOBs record);

	List<StaffWithBLOBs> selectByExampleWithBLOBs(StaffExample example);

	List<Staff> selectByExample(StaffExample example);

	StaffWithBLOBs selectByPrimaryKey(Integer staffId);

	int updateByExampleSelective(@Param("record") StaffWithBLOBs record,
			@Param("example") StaffExample example);

	int updateByExampleWithBLOBs(@Param("record") StaffWithBLOBs record,
			@Param("example") StaffExample example);

	int updateByExample(@Param("record") Staff record,
			@Param("example") StaffExample example);

	int updateByPrimaryKeySelective(StaffWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(StaffWithBLOBs record);

	int updateByPrimaryKey(Staff record);

	void deleteStaffById(Integer staffId);

	List<SalaryOrder> groupByJuniorDept();

	List<StaffExt> selectStaffAndDetails(String junior);
}