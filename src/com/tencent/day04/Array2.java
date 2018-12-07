package com.tencent.day04;

/**
 * 冒泡排序
 * 小的数往前冒，大的数往后冒
 * @author TangXin
 * 2018年7月12日
 */
public class Array2 {

	public static void main(String[] args) {
		int[] array={5,18,1,3,9,4,7};
		//第一轮循环，比较次数
		for(int i=array.length-1;i>=0;i--){
			//第二个循环，比较元素大小
			for(int j=0;j<i;j++){
				if(array[j]>array[j+1]){
					array[j]=array[j]+array[j+1];
					array[j+1]=array[j]-array[j+1];
					array[j]=array[j]-array[j+1];
				}
			}
			for(int element:array){
				System.out.print(element+",");
			}
			System.out.println();
			System.out.println("=================");
		}
		
		for(int element:array){
			System.out.println(element);
		}
	}

}
