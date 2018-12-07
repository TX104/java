package com.tencent.day04;
/**
 * 4.有一组这样的数据  1,3,-1,5,-2
逆序拷贝到新的数组中。
新的数组为-2,5,-1,3,1.
拷贝的时候，如果为负数，就存为0；
新的数组为0,5,0,3,1.
 * @author TangXin
 * 2018年7月13日
 */
public class Work4 {

	public static void main(String[] args) {
		int array1[]={1,3,-1,5,-2};
		int array2[]=new int[5];
		for(int i=0;i<array1.length;i++){
			if(array1[i]<0){
				array1[i]=0;
			}
			array2[array2.length-1-i]=array1[i];
			
		}
		for(int i=0;i<array2.length;i++){
			System.out.print(array2[i]+",");
		}
		
	}

}
