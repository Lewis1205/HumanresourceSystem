package com.lewis.service;

import java.util.List;

import com.lewis.pojo.SalaryRecord;
import com.lewis.pojo.SalaryRecordExt;
import com.lewis.webmodel.SalaryRecordWeb;

public interface ISalaryRecordService {

	public void addSalaryRecord(List<SalaryRecord> records);
	public List<SalaryRecordExt> getUnCheckedRecords();
	
	public SalaryRecord selectRecordById(Integer recordId);
	
	public void checkRecord(SalaryRecord record);
}
