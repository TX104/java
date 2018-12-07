package com.tencent.day04;

import java.util.Arrays;

/**
 * 数组的复制与容量的扩展
 * @author TangXin
 * 2018年7月13日
 */
public class Array7 {

	public static void main(String[] args) {
		int[] a=new int[8];
		int[] b={11,12,13,14,15};
		a[0]=1;
		a[1]=2;
		a[a.length-1]=100;
		
		//复制数组
		//第一个参数:原数组
		//第二个参数:原数组的起始位置
		//第三个参数:目标数组
		//第四个参数:目标数组的起始位置
		//第五个参数:复制的长度
		System.arraycopy(b, 0, a, 2, 5);
		for(int i:a){
			System.out.print(i+",");
		}
		System.out.println("");
		System.out.println("======================");
	
		//长度扩展
		a=Arrays.copyOf(a, a.length+1);
		a[8]=101;
		for(int i:a){
			System.out.print(i+",");
		}
	}

}
