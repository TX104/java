package com.tencent.day03;

import java.util.Scanner;

/**
 * 输入十次成绩，统计80以上的有多少次
 * @author TangXin
 * 2018年7月11日
 */
public class For2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		/*for(int i=1;i<=10;i++){
			System.out.println("请输入第"+i+"个考试成绩");
			double score=sc.nextDouble();
			if(score>=80 && score<=100){
				count++;//++一元运算符
			}
		}*/
		for(int i=1;i<=10;i++){
			System.out.println("请输入第"+i+"个考试成绩");
			double score=sc.nextDouble();
			if(score<=80){
				continue;//结束本次循环，进入下一次循环
			}
			count++;
		}
		System.out.println("超过80分的个数有:"+count);
		sc.close();

	}

}
