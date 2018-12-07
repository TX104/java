package com.tencent.day09;

/**
 * 鸟父类
 * @author TangXin
 * 2018年7月18日
 */
public class Bird {
	
	private String color;
	
	private int age;
	
	private String call;
	
	public Bird(){
		System.out.println("========父类无参构造=========");
	}
	public Bird(String color,int age){
		this.color=color;
		this.age=age;
	}
	public void self(){
		System.out.println("羽毛的颜色为:"+color);
		System.out.println("年龄为:"+age);
	}
	
	public void cry(){
		System.out.println("叫声为:"+call);
		
	}
	
	public final void run(){
		System.out.println("");
	}
	
}
