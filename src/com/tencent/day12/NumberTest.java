package com.tencent.day12;

import java.text.DecimalFormat;

/**
 * 测试数字
 * @author TangXin
 * 2018年7月25日
 */
public class NumberTest {

	public static void main(String[] args) {
		
		Double d=new Double(3.14);
		
		//longValue是Number父类中的方法，Number类用来完成数据转换的
		long l=d.longValue();
		System.out.println(""+l);
		
		//字符串转Double
		
		Double d1=new Double("12.5");
		Double d2=Double.valueOf("11.5");
		Double d3=Double.parseDouble("11.5");
		
		System.out.println("------------------");
		
		//两数比较
//		System.err.println(d1>d2);
		//d1>d2		返回1
		//d1=d2		返回0
		//d1<d2		返回-1
		System.out.println(d1.compareTo(d2));	//动态方法
		System.out.println(Double.compare(d1,d2));	//静态方法	
		
		//double转字符串
		double d31=34.5;
		String d3Str=String.valueOf(d31);
		System.out.println(d3Str);
		
		//格式化数字
		double d4=23479885.3457876;
		
		//整数位每三位一个逗号隔开，保留两位小数
		DecimalFormat df=new DecimalFormat("###,###.00");
		
		String d4Str=df.format(d4);
		System.out.println(d4Str);
		
		//整数位保留五位，不够补零，小数位保留三位，不够补零
		DecimalFormat df1=new DecimalFormat("00000.000");
		
		String dStr=df1.format(34.5);
		System.out.println(dStr);
		
		System.out.println("-------------");
	
		Integer i1=new Integer(13);
		//字符串转整数
		Integer i2=new Integer("11");	//第一种方法
		//两数比较
				//d1>d2		返回1
				//d1=d2		返回0
				//d1<d2		返回-1
		System.out.println(i1.compareTo(i2));
	
		//字符串转整数	
		Integer i3=Integer.valueOf("15");		//第二种方法
		Integer i4=Integer.parseInt("15");		//第三种方法
		
		System.out.println(i3==i4);	//比较的是指针
		System.out.println(i3.equals(i4));	//比较的是值
		
		//
		double di=i3.doubleValue();
		System.out.println(di);
		
		//数字转字符串
		String.valueOf(12);
		
//		String s=""+12;		不推荐，会产生新的对象
		
		
	}
	

}
