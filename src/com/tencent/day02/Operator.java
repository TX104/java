package com.tencent.day02;

/**
 * 运算符
 * @author TangXin
 * 2018年7月10日
 */
public class Operator {
	public static void main(String[] args){
		long value=(Byte.MAX_VALUE+(long)Integer.MAX_VALUE);
		System.out.println(value);
		//
		int i=10;
		int m=i++ + ++i +10-i;
		System.out.println(m);
		//整数=整数/整数
		int x=10;
		int y=3;
		System.out.println(x/y);
		//浮点=浮点/浮点
		double a=10;
		double b=4;
		System.out.println(a/b);
		//浮点=浮点/整数
		//浮点=浮点+整数
		int j=10;
		double n=2.5;
		System.out.println(j+n);
		
		
		
	}
}
