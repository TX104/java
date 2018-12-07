package com.tencent.day04;
/**
 * 二维数组的遍历
 * @author TangXin
 * 2018年7月12日
 */
public class Array6 {

	public static void main(String[] args) {
		int[][]	array={{1,2,3},{10,20,30,40},{100,200,300,500,700}};
		System.out.println("数组的行数:"+array.length);
		System.out.println("");
		//先遍历行，在遍历列
		for(int i=0;i<array.length;i++){
			//array[i]本身是一个一维数组
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j]+",");
				
			}
			System.out.println("");
		}
		for(int[] elements:array){
			for(int element:elements){
				System.out.print(element+",");
			}
		}
	}

}
