package com.tencent.day04;

/**
 * 2.输入5个积分。
打印出最低积分，和所在的位置。
 */
import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double array[]=new double[5];
		for(int i=0;i<5;i++){
			System.out.println("请输入第"+(i+1)+"个积分");
			array[i]=sc.nextDouble();
		}
		//
		//Arrays.sort(array);
		//System.out.println("最低积分为:"+array[0]);
		double min=array[0];
		int x=0;
		for(int j=0;j<array.length;j++){
			if(array[j]<min){
				min=array[j];
				x=j;
			}
			//System.out.println("最小数的下标为:"+j);
		}
		System.out.println("最小数为:"+min);
		System.out.println("最小数的下标为:"+x);
		
		sc.close();

	}

}
