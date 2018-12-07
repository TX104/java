package com.tencent.day04;
/**
 * 1. 逆序输出5句话
首先创建数组。放5句话。
逆序打印出来。
 * @author TangXin
 * 2018年7月13日
 */
public class Work1 {

	public static void main(String[] args) {
		String array[]=new String[5];
		array[0]="在朝腾学习怎么样";
		array[1]="第一阶段过完有何体会";
		array[2]="有没有养成好的学习习惯";
		array[3]="能不能够按时完成布置的作业";
		array[4]="成为一名IT男";
		for(int i=array.length-1;i>=0;i--){
			System.out.println(array[i]);
		}
	}

}
