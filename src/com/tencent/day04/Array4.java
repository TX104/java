package com.tencent.day04;

/**
 * JVM的堆内存与栈内存
 * @author TangXin
 * 2018年7月12日
 */
public class Array4 {

	public static void main(String[] args) {
		double ldh=175.2;
		double lm=ldh;
		System.out.println("2016年刘德华身高:"+ldh);
		System.out.println("2016年黎明身高:"+lm);
		
		ldh=180.5;
		System.out.println("2018年刘德华身高:"+ldh);
		System.out.println("2018年黎明身高:"+lm);
		
		double[] ldhArray={175.6};
		double[] lmArray=ldhArray;
		
		System.out.println("========================");
		System.out.println("2016年刘德华身高:"+ldhArray[0]);
		System.out.println("2016年黎明身高:"+lmArray[0]);
		
		ldhArray[0]=180.5;
		System.out.println("2018年刘德华身高:"+ldhArray[0]);
		System.out.println("2018年黎明身高:"+lmArray[0]);
		
		
	}

}
