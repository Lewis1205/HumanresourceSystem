package com.lewis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lewis.mapper.SalaryDetailMapper;
import com.lewis.mapper.SalaryQueryMapper;
import com.lewis.mapper.SalaryStandardMapper;
import com.lewis.pojo.SalaryDetail;
import com.lewis.pojo.SalaryDetailExample;
import com.lewis.pojo.SalaryDetailExample.Criteria;
import com.lewis.pojo.SalaryStandard;
import com.lewis.pojo.SalaryStandardExample;
import com.lewis.service.ISalaryService;
import com.lewis.webmodel.SalaryQuery;

@Service
public class SalaryServiceImpl implements ISalaryService {

	@Autowired
	private SalaryStandardMapper ssMapper;

	@Autowired
	private SalaryDetailMapper sdMapper;

	@Autowired
	private SalaryQueryMapper sqMapper;

	@Override
	public List<SalaryStandard> getSalaryStandards() {
		SalaryStandardExample example = new SalaryStandardExample();
		com.lewis.pojo.SalaryStandardExample.Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(true);
		List<SalaryStandard> list = ssMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<SalaryDetail> getDetailsById(Integer id) {
		SalaryDetailExample example = new SalaryDetailExample();
		Criteria criteria = example.createCriteria();
		criteria.andStandardIdEqualTo(id);
		List<SalaryDetail> list = sdMapper.selectByExample(example);
		return list;
	}

	@Transactional
	@Override
	public void addStandard(SalaryStandard standard) {
		ssMapper.insert(standard);

	}

	@Transactional
	@Override
	public void addDetail(List<SalaryDetail> details) {
		for (int i = 0; i < details.size(); i++) {
			sdMapper.insert(details.get(i));
		}
	}

	@Override
	public List<SalaryStandard> queryByConditions(SalaryQuery salaryQuery) {
		List<SalaryStandard> list = sqMapper.selectByConditions(salaryQuery);
		return list;
	}

	@Override
	public SalaryStandard getStandardById(int standardId) {
		SalaryStandard salaryStandard = ssMapper.selectByPrimaryKey(standardId);

		return salaryStandard;
	}

	@Transactional
	@Override
	public void checkStandard(SalaryStandard salaryStandard) {
		salaryStandard.setStatus(true);
		ssMapper.updateByPrimaryKey(salaryStandard);
	}
}
