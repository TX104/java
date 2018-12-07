package com.tencent.day11;

/**
 * 外部类
 * @author TangXin
 * 2018年7月24日
 */
public class OutClass {

	private Left left=new Left("杨晓");
	
	public void leftSelf(){
		left.self();
	}
}

/**
 * 外部类
 * @author TangXin
 * 2018年7月24日
 */
class Left{
	
	private String name;
	
	public Left(String name){
		this.name=name;
	}
	
	public void self(){
		
		System.out.println("我是光明左使:"+name);
	}
}

