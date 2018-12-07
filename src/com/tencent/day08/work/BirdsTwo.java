package com.tencent.day08.work;

/**
 * 第二只鸟之类
 * @author TangXin
 * 2018年7月18日
 */
public class BirdsTwo extends Bird{
	
	private String skit;
	
	public void cry(){
		System.out.println("我是第二只鸟");
		super.cry();
	}
	
	public String getSkit(){
		return skit;
	}
	public void setSkit(String skit){
		this.skit=skit;
	}
	
}
