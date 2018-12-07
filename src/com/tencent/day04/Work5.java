package com.tencent.day04;

import java.util.Scanner;
/**
 * 5.输入初一年级的成绩存储到二维数组中
初一年级一共有3个班
第一个班5个人
第二个班7个人
第三个班4个人
把他们的成绩装入二维数组中
 * @author TangXin
 * 2018年7月13日
 */
public class Work5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[][] array=new double[3][];
		double[] array1=new double[5];
		double[] array2=new double[7];
		double[] array3=new double[4];
		array[0]=array1;
		array[1]=array2;
		array[2]=array3;
		for(int i=0;i<array1.length;i++){
			System.out.println("请输入初一年级第一班第"+(i+1)+"人成绩");
			array[0][i]=sc.nextDouble();
		}
		for(int i=0;i<array2.length;i++){
			System.out.println("请输入初一年级第二班第"+(i+1)+"人成绩");
			array[1][i]=sc.nextDouble();
		}
		for(int i=0;i<array3.length;i++){
			System.out.println("请输入初一年级第三班第"+(i+1)+"人成绩");
			array[2][i]=sc.nextDouble();
		}
		//i代表班级，j代表成绩
//		for(int i=0;i<array.length;i++){
//			for(int j=0;j<array[i].length;j++){
//				System.out.println("请输入第"+(i+1)+"班的第"+(j+1)+"人成绩");
//				array[i][j]=sc.nextDouble();
//			}
//		}
//
		for(double[] elements:array){
			for(double element:elements){
				System.out.print(element+",");
			}
		}
		
		sc.close();

	}

}
