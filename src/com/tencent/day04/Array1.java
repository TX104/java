package com.tencent.day04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入10个数，装入数字，找出最大值与最小值
 * @author TangXin
 * 2018年7月12日
 */
public class Array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array[]=new int[10];
		for(int i=0;i<array.length;i++){
			System.out.println("请输入第"+(i+1)+"个数字:");
			array[i]=sc.nextInt();
		}
		//数组辅助类
		Arrays.sort(array);
		int max=array[0];
		int min=array[0];
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
			if(array[i]>max){
				max=array[i];
			}
			if(array[i]<min){
				min=array[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(""+array[array.length-1]);
		System.out.println(""+array[0]);
		sc.close();
	}

}
