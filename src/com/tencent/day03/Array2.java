package com.tencent.day03;

/**
 * 数组的遍历
 * @author TangXin
 * 2018年7月11日
 */
public class Array2 {

	public static void main(String[] args) {
		int[] array=new int[]{10,20,30,40,50,60};
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		System.out.println("=========");
		
		//顺序遍历 foreach遍历		没有下标		效率高，推荐使用
		for(int element:array){ 
			System.out.println(element);
		}
		System.out.println("=========");
		
		//逆序遍历		下标
		int[] array2=new int[]{10,20,30,40,50,60};
		for(int j=array2.length-1;j>=0;j--){
			System.out.println(array2[j]);
		}
	}

}
