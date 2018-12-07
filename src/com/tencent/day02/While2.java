package com.tencent.day02;

/**
 * 计算2000年到2018年有多少个闰年
 * @author TangXin
 * 2018年7月10日
 */
public class While2 {

	public static void main(String[] args) {
		int year=2000;
		int sum=0;
		while(year<=2018){
			if((year%4==0 && year%100!=0)||(year%400==0)){
				System.out.println("闰年为:"+year);
				sum=sum+1;
			}
			year++;
		}
		System.out.println("闰年的个数为:"+sum);
	}

}
