package com.tencent.day03;

/**
 * 循环嵌套
 * 每周的周一到周五，每天吃三个桃子
 * 问三周后，吃了多少桃子
 * @author TangXin
 * 2018年7月11日
 */
public class For3 {

	public static void main(String[] args) {
		int peach=0;
		for(int week=1;week<=3;week++){
			for(int day=1;day<=5;day++){
				peach+=3;
			}
		}
		System.out.println(""+peach);
	}

}
