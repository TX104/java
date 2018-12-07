package com.tencent.day05;

/**
 * 变量
 * @author TangXin
 * 2018年7月13日
 */
public class Variable {
	
	int i;
	boolean b;
	char ch;
	double d;
	String  str;
	
	//
	void init(){
		System.out.println("整数:"+i);
		System.out.println("布尔:"+b);
		System.out.println("字符:"+ch);
		System.out.println("浮点:"+d);
		System.out.println("引用类型:"+str);
	}
	//
	void part(){
		int i=100; //局部变量
		this.i=1; //全局变量
		System.out.println("局部变量i:"+i);
		System.out.println("全局变量i:"+this.i);
		
		//全局变量与局部变量可以重名
		//局部变量与局部变量不能重名
		int num=20;
		if(i>=100){
			num=10;
			System.out.println(num);
		}else{
			
		}
	}

}
