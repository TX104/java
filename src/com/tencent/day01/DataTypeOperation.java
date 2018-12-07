package com.tencent.day01;

/**
 * 数据类型操作
 * @author TangXin
 * 2018年7月9日
 */
public class DataTypeOperation {
	
	static double dou;		//默认0
	static int num;			//0
	static boolean boo;		//false
	static char cch;		//0

	public static void main(String[] args){
		//隐式转换
		byte b=127;
		int m=b+1;
		System.out.println(m);
		byte bb=(byte)m;//强制转换
		System.out.println(bb);
		
		int n=1000;
		byte bbb=(byte)n;//强制转换
		System.out.println(bbb);
		
		//丢失精度
		double d=12.5;
		int su=(int)d;
		System.out.println(su);
		
		char ch='a';
		int code=ch;//隐式转换
		System.out.println(code);
		
		//数据类型超出范围，会变成最小值
		int i=2147483647;
		i=i+1;
		System.out.println(i);//超出了int的最大值，会输出成最小值
		
		System.out.println("----------------");
		System.out.println(dou);
		System.out.println(num);
		System.out.println(boo);
		System.out.println((int)cch);
		
	}
}
