package com.lewis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lewis.mapper.SalaryRecordMapper;
import com.lewis.pojo.SalaryRecord;
import com.lewis.pojo.SalaryRecordExample;
import com.lewis.pojo.SalaryRecordExample.Criteria;
import com.lewis.pojo.SalaryRecordExt;
import com.lewis.service.ISalaryRecordService;
import com.lewis.webmodel.SalaryRecordWeb;

@Service
public class SalaryRecordImpl implements ISalaryRecordService {

	@Autowired
	private SalaryRecordMapper srMapper;

	@Transactional
	@Override
	public void addSalaryRecord(List<SalaryRecord> records) {
		for (SalaryRecord salaryRecord : records) {
			srMapper.insert(salaryRecord);
		}

	}

	public List<SalaryRecordExt> getUnCheckedRecords() {
		List<SalaryRecordExt> list = srMapper.selectUncheckedRecordAndDetails();
		return list;
	}

	@Override
	public SalaryRecord selectRecordById(Integer recordId) {

		return srMapper.selectByPrimaryKey(recordId);
	}

	@Override
	public void checkRecord(SalaryRecord record) {
		record.setStatus(true);
		srMapper.updateByPrimaryKey(record);
		
	}

}
