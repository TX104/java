package com.tencent.day08.work;

/**
 * 第一只鸟子类
 * @author TangXin
 * 2018年7月18日
 */
public class BirdsOne extends Bird{
	
	private String kiss;
	
	public void cry(){
		System.out.println("我是第一只鸟的叫声:");
		super.cry();
	}
	
	public String getKiss(){
		return kiss;
	}
	public void setKiss(String kiss){
		this.kiss=kiss;
	}
}
