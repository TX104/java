package com.tencent.day08;

/**
 * 猫类
 * @author TangXin
 * 2018年7月18日
 */
public class Cat extends Animal{
	
	private String pose;
	
	static{
		
		System.out.println("cat子类类静态语句块");
	}
	
	{
		System.out.println("cat子类动态语句块");
	}
	
	public Cat(){
		System.out.println("cat子类构造方法");
	}
	
	public void self(){
		super.self();
		System.out.println("我摆的造型是"+pose);
	}
	
	public String getPose(){
		return this.pose;
	}
	
	public void setPose(String pose){
		this.pose=pose;
	}
}
