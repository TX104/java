package com.tencent.day04;

/**
 * 选择排序
 * 
 * @author TangXin 找出最小数，跟第一个位置互换 2018年7月12日
 */
public class Array3 {

	public static void main(String[] args) {
		int[] array = { 5, 18, 1, 3, 9, 4, 7 };
		// 第一个循环，比较位置的次数
		for (int i =0; i<array.length; i++) {
			// 第二个循环，找出最小数的下标
			int k = i;// k为最小数下标
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < array[k]) {
					k = j;
				}
				
			}
			//两数交换	!=k表示当前数是最小数，无需互换
			if(i!=k){
				array[i]=array[i]+array[k];
				array[k]=array[i]-array[k];
				array[i]=array[i]-array[k];
			}
			for(int element:array){
				System.out.print(element+",");
			}
			System.out.println();
			System.out.println("=================");
		}
		for(int element:array){
			System.out.print(element+",");
		}
	}

}
