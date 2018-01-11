package com.lewis.pojo;

public class PosCategory {
	private Integer categoryId;

	private String posCategory;

	@Override
	public String toString() {
		return "PosCategory [categoryId=" + categoryId + ", posCategory="
				+ posCategory + "]";
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getPosCategory() {
		return posCategory;
	}

	public void setPosCategory(String posCategory) {
		this.posCategory = posCategory == null ? null : posCategory.trim();
	}
}