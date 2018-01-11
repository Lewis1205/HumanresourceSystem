package com.lewis.service;

import java.util.List;

import com.lewis.pojo.PosCategory;
import com.lewis.pojo.PosName;

public interface IPositionService {

	public List<PosCategory> getCategories();

	public List<PosName> getPosByCatId(int categoryId);
}
