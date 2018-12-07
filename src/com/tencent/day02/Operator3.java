package com.tencent.day02;

import java.util.Scanner;

/**
 * 输入一个秒数，转换成xx小时xx分钟xx秒
 * 比如:7200秒=2小时0分0秒
 * @author TangXin
 * 2018年7月10日
 */
public class Operator3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入秒数");
		int snum=sc.nextInt();
		int hour=snum/3600;
		int minute=(snum%3600)/60;
		int second=(snum%3600)%60;//sum%60
		System.out.println("您输入的时间为:"+hour+"小时"+minute+"分钟"+second+"秒");
		
		sc.close();

	}

}
