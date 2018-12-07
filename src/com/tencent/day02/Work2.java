package com.tencent.day02;

/**
 * 作业2.使用switch完成
机票原价为4000
用户输入出行的月份，
用户选择头等舱或经济舱
5,6,7,8,9,10  视为旺季
头等舱9折，经济舱7.5折。

其他月份  视为淡季
头等舱6折， 经济舱3折。
 */
import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		double price = 4000;
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择做什么舱");
		String a = sc.next();

		if (a.equals("头等舱")) {
			System.out.println("请输入月份:");
			byte month = sc.nextByte();
			switch (month) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 11:
			case 12:
				price = price * 0.6;
				System.out.println("机票价格为:" + price);
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				price = price * 0.9;
				System.out.println("机票价格为:" + price);
				break;
			default:
				System.out.println("输入的月份有误");
			}
		} else if (a.equals("经济舱")) {
			System.out.println("请输入月份:");
			byte month = sc.nextByte();
			switch (month) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 11:
			case 12:
				price = price * 0.3;
				System.out.println("机票价格为:" + price);
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				price = price * 0.75;
				System.out.println("机票价格为:" + price);
				break;
			default:
				System.out.println("输入的月份有误");
			}
		} else {
			System.out.println("您选择的舱有误");
		}
		sc.close();
	}
}
