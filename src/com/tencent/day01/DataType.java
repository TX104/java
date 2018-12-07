package com.tencent.day01;

/**
 * 数据类型
 * @author TangXin
 * 2018年7月9日
 */
public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//字节型
		byte b=127;	
		System.out.println(b);
		System.out.println("byte最大取值:"+Byte.MAX_VALUE);
		System.out.println("byte最小取值:"+Byte.MIN_VALUE);
		//短整型
		short c=9999;	
		System.out.println(c);
		System.out.println("short最大取值:"+Short.MAX_VALUE);
		System.out.println("short最小取值:"+Short.MIN_VALUE);
		//整型
		int i=888;	
		System.out.println(i);
		System.out.println("int最大取值:"+Integer.MAX_VALUE);
		System.out.println("int最小取值:"+Integer.MIN_VALUE);
		//长整型
		long l=4556655556688785L;	
		System.out.println(l);
		System.out.println("long最大取值:"+Long.MAX_VALUE);
		System.out.println("long最小取值:"+Long.MIN_VALUE);
		
		float f=12.5f;	
		System.out.println(f);
		System.out.println("float最大取值:"+Float.MAX_VALUE);
		System.out.println("float最小取值:"+Float.MIN_VALUE);
		
		double dd=12.5;	
		System.out.println(dd);
		System.out.println("Double最大取值:"+Double.MAX_VALUE);
		System.out.println("Double最小取值:"+Double.MIN_VALUE);
		
		char ch='我';
		System.out.println(ch);
		System.out.println((int)ch);

	}

}
