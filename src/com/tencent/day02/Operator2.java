package com.tencent.day02;

import java.util.Scanner;

/**
 * 在控制台输入：语文成绩、数学成绩、英语成绩
 * 计算出三门的平均分分和总分
 * @author TangXin
 * 2018年7月10日
 */
public class Operator2 {

	public static void main(String[] args) {
		//创建一个控制台
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入语文成绩:");
		double chinese=sc.nextDouble();
		
		System.out.println("请输入数学成绩:");
		double math=sc.nextDouble();
		
		System.out.println("请输入英语成绩:");
		double English=sc.nextDouble();
		
		System.out.println("语文成绩"+chinese);
		System.out.println("数学成绩"+math);
		System.out.println("英语成绩"+English);
		
		double num=chinese+math+English;
		System.out.println("总分"+num);
		
		double sum=num/3;
		System.out.println("平均分"+sum);
		
		
		//关闭控制台
		sc.close();
	}

}
