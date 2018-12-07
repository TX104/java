package com.tencent.day09;

/**
 * 第一只鸟子类
 * @author TangXin
 * 2018年7月18日
 */
public class BirdsOne extends Bird{
	
	
	public BirdsOne(String color,int age){
		//System.out.println("颜色为:"+color);
		//父类有参构造
		super(color,age);
	}
	
	public void cry(){
		System.out.println("我是第一只鸟的叫声:zzz");
	}
	
}
