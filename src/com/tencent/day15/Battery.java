package com.tencent.day15;

/**
 * 电池类
 * @author TangXin
 * 2018年7月28日
 */
public class Battery {
	
	private String name;
	
	public Battery() {
		
	}

	public Battery(String name) {
		this.name = name;
	}
	
	//封装
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
