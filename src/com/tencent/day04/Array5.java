package com.tencent.day04;

/**
 * 二维数组的创建
 * @author TangXin
 * 2018年7月12日
 */
public class Array5 {

	public static void main(String[] args) {
		int[][] array1=new int[3][5];
		array1[1][2]=15;
		System.out.println(array1[1][2]);
		int[][]  array2=new int[3][];
		int[] a1={1,2,3};
		int[] a2={10,20};
		int[] a3={7,8,9,0,1};
		
		array2[0]=a1;
		array2[1]=a2;
		array2[2]=a3;
		System.out.println(array2[0][2]);
 	}

}
