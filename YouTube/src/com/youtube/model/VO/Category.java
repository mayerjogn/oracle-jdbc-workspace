package com.youtube.model.VO;

public class Category {
	
	private int categoryCode;
	private String categortName;
	public Category() {}
	
	public Category(int categoryCode, String categortName) {
		super();
		this.categoryCode = categoryCode;
		this.categortName = categortName;
	}
	public int getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategortName() {
		return categortName;
	}
	public void setCategortName(String categortName) {
		this.categortName = categortName;
	}
	@Override
	public String toString() {
		return "Category [categoryCode=" + categoryCode + ", categortName=" + categortName + "]";
	}
	
	

}
