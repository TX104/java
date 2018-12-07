package com.tencent.day09.work2;

/**
 * 交通工具抽象父类
 * @author TangXin
 * 2018年7月19日
 */
public abstract class Vehicle {
	
	public String name;
	
	public int age;
	
	public abstract void see();
	
	public void self(){
		System.out.println("年龄:"+age+"名字:"+name);
	}
}

