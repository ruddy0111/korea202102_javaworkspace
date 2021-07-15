package com.minssam.shoppingapp.model.domain;

//이 객체는 로직을 작성하기 위한 용도가 아니라, Topcategory테이블의 레코드를 담기 위한 객체이다. = VO(value Object)  : 은닉화 시키는 대표 사례.
//js의 JSON의 역할과 같다.
public class Topcategory {
	private int topcategory_id;
	private String top_name;
	public int getTopcategory_id() {
		return topcategory_id;
	}
	public void setTopcategory_id(int topcategory_id) {
		this.topcategory_id = topcategory_id;
	}
	public String getTop_name() {
		return top_name;
	}
	public void setTop_name(String top_name) {
		this.top_name = top_name;
	}
	
	
}
