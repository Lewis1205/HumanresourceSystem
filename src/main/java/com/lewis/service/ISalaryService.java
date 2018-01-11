package com.lewis.service;

import java.util.List;

import com.lewis.pojo.SalaryDetail;
import com.lewis.pojo.SalaryStandard;
import com.lewis.webmodel.SalaryQuery;

public interface ISalaryService {

	public List<SalaryStandard> getSalaryStandards();

	public List<SalaryDetail> getDetailsById(Integer id);

	public void addStandard(SalaryStandard standard);

	public void addDetail(List<SalaryDetail> details);
	
	public List<SalaryStandard> queryByConditions(SalaryQuery salaryQuery);
	
	public SalaryStandard getStandardById(int standardId);
	
	public void checkStandard(SalaryStandard salaryStandard);
}
