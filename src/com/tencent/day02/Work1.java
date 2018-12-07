package com.tencent.day02;

/**
 * 作业1：使用if完成
输入赵本山的考试成绩，显示所获奖励
成绩==100分，爸爸给他买辆车
成绩>=90分，妈妈给他买MP4
90分>成绩>=60分，妈妈给他买本参考书
成绩<60分，什么都不买

 */
import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入赵本山的考试成绩");
		double score=sc.nextDouble();
		if(score==100){
			System.out.println("爸爸给他买辆车");
		}else if(score>=90 && score<100){
			System.out.println("妈妈给他买mp4");
		}else if(score>=60 && score<90){
			System.out.println("妈妈给他买本参考书");
		}else if(score>=0 && score<60){
			System.out.println("什么都不买");
		}else{
			System.out.println("输入赵本山的考试成绩有误");
		}
		sc.close();

	}

}
