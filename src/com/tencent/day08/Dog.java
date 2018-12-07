package com.tencent.day08;

/**
 * 狗类
 * @author TangXin
 * 2018年7月18日
 */
public class Dog extends Animal{
	
	private String perform;
	
	static{
		System.out.println("dog子类类静态语句块");
	}
	
	{
		System.out.println("dog子类动态语句块");
	}
	
	public Dog(){
		System.out.println("dog子类构造方法");
	}
	
	public String getPerform(){
		return this.perform;
	}
	public void setPerform(String perform){
		this.perform=perform;
	}
	public void self(){
		//当前类的父类对象,子类需要调用父类中的方法，使用super关键字
		super.self();
		System.out.println("我会"+perform+"才艺");
	}
}

