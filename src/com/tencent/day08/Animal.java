package com.tencent.day08;

/**
 * 动物类
 * @author TangXin
 * 2018年7月18日
 */
public class Animal{
	
	private String name;
	
	private int age;
	
	static{
		System.out.println("父类静态语句块");
	}
	
	{
		System.out.println("父类动态语句块");
	}
	
	public Animal(){
		System.out.println("父类构造方法");
	}
	
	public void self(){
		System.out.println("我是一只"+name+"动物");
		System.out.println("今年"+age+"岁");
		
	}
	public String getName(){
		return this.name;
		
	}
	public void setName(String name){
		this.name=name;
	}
	
	public int getage(){
		return this.age;
		
	}
	public void setAge(int age){
		this.age=age;
	}
	
}
