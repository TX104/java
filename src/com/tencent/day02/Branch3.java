package com.tencent.day02;

import java.util.Scanner;

/**
 * 分支语句嵌套
 * if语句嵌套if语句
 * 朝腾科技，招聘前台文员
 * 1、女性
 * 2、20岁~22岁
 * 
 * @author TangXin
 * 2018年7月10日
 */
public class Branch3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入您的性别:");	
		String sex=sc.next();//字符串
		
		//字符串只能通过equals()方法进行比较内容
		if(sex.equals("女")){
			System.out.println("请输入您的年龄:");
			byte age=sc.nextByte();
			if(age>=20 && age<=22){
				System.out.println("congratulation！您成为朝腾的一员");
			}else{
				System.out.println("您不符合年龄要求");
			}
		}else{
			System.out.println("您不符合性别要求");
		}
		sc.close();

	}

}
