package com.lewis.service;

import java.util.List;

import com.lewis.pojo.Staff;
import com.lewis.pojo.StaffExample;
import com.lewis.pojo.StaffExt;
import com.lewis.pojo.StaffWithBLOBs;

public interface IStaffService {

	public void addStaff(StaffWithBLOBs staff);

	public String getStaffNum(StaffWithBLOBs staff);

	public List<Staff> selectUnchecked();

	public StaffWithBLOBs selectStaffById(int id);

	public void updateStaff(StaffWithBLOBs staff);

	public List<StaffWithBLOBs> selectByCondition(StaffExample example);
	
	public void deleteStaffById(int id);
	
	
	public List<Staff> selectChecked();
	
	
	public List<Staff> selectByJuniorDept(String junior);
	
	public List<StaffExt> selectStaffAndDetailsByJunior(String junior);
	
}
