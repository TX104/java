package com.tencent.day02;

import java.util.Scanner;

/**
 * 分支结构
 * 
 * 输入期末考试成绩，如果每门都及格，
 * 就去水上乐园玩
 * 否则就去乡下抓青蛙
 * @author TangXin
 * 2018年7月10日
 */
public class Branch1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入您的语文成绩");
		double chinese=sc.nextDouble();
		System.out.println("请输入您的数学成绩");
		double math=sc.nextDouble();
		System.out.println("请输入您的英语成绩");
		double english=sc.nextDouble();
		
		if(chinese>=60 && math>=60 && english>=60){
			System.out.println("去水上乐园玩耍");
		}else{
			System.out.println("就去乡下抓青蛙");
		}
		sc.close();

	}

}
