package com.tencent.day02;

import java.util.Scanner;

/**
 * switch语句
 * @author TangXin
 * 2018年7月10日
 */
public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请您颜色编号:");
		int color=sc.nextInt();
		byte b=(byte)color;
		short sh=(short)color;
		
//		long l=color;	不可以
//		float f=color;	不可以
//		double d=color;	不可以
		
		char ch='1';
		String str="1";	//JDK1.7后支持
		switch(color){
		case 1:
			System.out.println("红色");
			break;
		case 2:
			System.out.println("蓝色");
			break;
		case 3:
			System.out.println("黄色");
			break;
		case 4:
			System.out.println("绿色");
			break;
		case 5:
			System.out.println("紫色");
			break;
		default:
			System.out.println("白色");
		}
		
		sc.close();

	}

}
