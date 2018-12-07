package com.tencent.day08;

/**
 * 基本数据类型与包装类
 * @author TangXin
 * 2018年7月18日
 */
public class Packaging {
	
	public static void main(String[] args) {
		
		int a=10;
		
		//基本数据类型直接赋予引用类型，称为装箱
		Integer b=a;
		System.out.println(b);
		
		Integer c=new Integer(a);//没有装箱应该这样定义
		System.out.println(c);
		
		//引用类型直接赋予基本数据类型，称为拆箱
		int d=b;
		System.out.println(d);
		
		String abc="abc";
	  //String abc=new String("abc");
		System.out.println(abc);
		
		
		
	}
}
