package com.tencent.day02;

import java.util.Scanner;

/**
 * if else if else
 * 根据薪水开始买车
 * @author TangXin
 * 2018年7月10日
 */
public class Branch2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请您输入月薪:");
		double salary=sc.nextDouble();
		if(salary>=100000){
			System.out.println("您可以拥有任何车，买买买");
		}else if(salary>=50000){
			System.out.println("您可以买路虎跑车，hi起来");
		}else if(salary>=20000){
			System.out.println("您可以买凯美瑞、迈腾、思域");
		}else if(salary>=10000){
			System.out.println("您可以买宝来、朗逸、卡罗拉");
		}else{
			System.out.println("租八戒了解一下！");
		}
		sc.close();

	}

}
