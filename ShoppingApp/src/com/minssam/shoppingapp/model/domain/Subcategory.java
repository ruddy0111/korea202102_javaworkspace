package com.minssam.shoppingapp.model.domain;
//이 객체는 로직을 작성하기 위한 용도가 아니라, Topcategory테이블의 레코드를 담기 위한 객체이다. = VO(value Object)  : 은닉화 시키는 대표 사례.
//js의 JSON의 역할과 같다.
public class Subcategory {
	private int subcategory_id;
	private int topcategory_id;
	private String sub_name;
	public int getSubcategory_id() {
		return subcategory_id;
	}
	public void setSubcategory_id(int subcategory_id) {
		this.subcategory_id = subcategory_id;
	}
	public int getTopcategory_id() {
		return topcategory_id;
	}
	public void setTopcategory_id(int topcategory_id) {
		this.topcategory_id = topcategory_id;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	
	
}
