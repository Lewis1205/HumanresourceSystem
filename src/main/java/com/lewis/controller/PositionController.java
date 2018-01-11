package com.lewis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lewis.pojo.PosCategory;
import com.lewis.pojo.PosName;
import com.lewis.service.IPositionService;

@RequestMapping("/pos")
@Controller
public class PositionController {

	@Autowired
	private IPositionService posService;

	@ResponseBody
	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	public List<PosCategory> getAllCategories() {

		List<PosCategory> list = posService.getCategories();
		return list;
	}

	@ResponseBody
	@RequestMapping(value = "/{categoryId}/position", method = RequestMethod.GET)
	public List<PosName> getPosByCatId(
			@PathVariable("categoryId") int categoryId) {

		List<PosName> list = posService.getPosByCatId(categoryId);
		return list;
	}
}
