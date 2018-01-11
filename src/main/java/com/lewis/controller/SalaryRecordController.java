package com.lewis.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lewis.pojo.SalaryRecord;
import com.lewis.pojo.SalaryRecordExt;
import com.lewis.service.ISalaryRecordService;
import com.lewis.util.ResultJson;
import com.lewis.webmodel.SalaryRecordWeb;

@Controller
@RequestMapping("/record")
public class SalaryRecordController {

	@Autowired
	private ISalaryRecordService srService;

	@ResponseBody
	@RequestMapping("/add")
	public ResultJson addRecords(@RequestBody List<SalaryRecordWeb> srWebModels) {
		List<SalaryRecord> records = new ArrayList<SalaryRecord>();
		for (SalaryRecordWeb salaryRecordWeb : srWebModels) {
			SalaryRecord record = new SalaryRecord();
			record.setBonus(salaryRecordWeb.getBonus());
			record.setDeduction(salaryRecordWeb.getReduction());
			record.setRecordNum(System.currentTimeMillis() + "");
			record.setStaffId(salaryRecordWeb.getStaffId());
			record.setStandardId(salaryRecordWeb.getStandardId());
			record.setStatus(false);
			records.add(record);
		}
		srService.addSalaryRecord(records);
		return new ResultJson("success");
	}

	@ResponseBody
	@RequestMapping("/unchecked/records")
	public List<SalaryRecordExt> getUnCheckedRecords() {
		List<SalaryRecordExt> list = srService.getUnCheckedRecords();
		return list;
	}

	@ResponseBody
	@RequestMapping(value = "/checkRecord", method = RequestMethod.POST)
	public ResultJson checkRecord(@RequestBody List<SalaryRecord> records) {
		try {
			for (int i = 0; i < records.size(); i++) {
				SalaryRecord record = records.get(i);
				Integer recordId = record.getRecordId();
				SalaryRecord dbRecord = srService.selectRecordById(recordId);
				dbRecord.setBonus(record.getBonus());
				dbRecord.setDeduction(record.getDeduction());
				srService.checkRecord(dbRecord);
			}
			return new ResultJson("success");
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultJson("error", e);
		}

	}
}
