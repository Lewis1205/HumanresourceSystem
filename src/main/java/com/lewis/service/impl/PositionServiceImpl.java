package com.lewis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lewis.mapper.PosCategoryMapper;
import com.lewis.mapper.PosNameMapper;
import com.lewis.pojo.PosCategory;
import com.lewis.pojo.PosCategoryExample;
import com.lewis.pojo.PosName;
import com.lewis.pojo.PosNameExample;
import com.lewis.pojo.PosNameExample.Criteria;
import com.lewis.service.IPositionService;

@Service
public class PositionServiceImpl implements IPositionService {

	@Autowired
	private PosCategoryMapper categoryMapper;
	@Autowired
	private PosNameMapper nameMapper;

	@Override
	public List<PosCategory> getCategories() {
		PosCategoryExample example = new PosCategoryExample();
		List<PosCategory> list = categoryMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<PosName> getPosByCatId(int categoryId) {
		PosNameExample example = new PosNameExample();
		Criteria criteria = example.createCriteria();
		criteria.andCategoryIdEqualTo(categoryId);
		List<PosName> list = nameMapper.selectByExample(example);
		return list;
	}

}
