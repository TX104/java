package com.tencent.day08.work;

/**
 * 鸟父类
 * @author TangXin
 * 2018年7月18日
 */
public class Bird {
	
	private String color;
	
	private int age;
	
	private String call;
	
	public void self(){
		System.out.println("羽毛的颜色为:"+color);
		System.out.println("年龄为:"+age);
	}
	
	public void cry(){
		System.out.println("叫声为:"+call);
	}
	
	public String getColor(){
		return this.color;
	}
	public void setColor(String color){
		this.color=color;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	
	public String getCall(){
		return this.call;
	}
	public void setCall(String call){
		this.call=call;
	}
}
