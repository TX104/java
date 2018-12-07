package com.tencent.day02;

import java.util.Scanner;

/**
 * while循环
 * 南昌市2015年人口数量
 * 每年人口按照15%的增长率，问五年后有多少人口
 * @author TangXin
 * 2018年7月10日
 */
public class While1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.close();
		int year=2015;
		double population=400;
		
		while(year<=2020){
			population=population*(1+15.0/100);
			year++;
			
		}
		System.out.println("2020年人口数量:"+population);
	}

}
