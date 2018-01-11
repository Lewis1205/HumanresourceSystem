package com.lewis.mapper;

import java.util.List;

import com.lewis.pojo.SalaryStandard;
import com.lewis.webmodel.SalaryQuery;

public interface SalaryQueryMapper {
	public List<SalaryStandard> selectByConditions(SalaryQuery query);

}
