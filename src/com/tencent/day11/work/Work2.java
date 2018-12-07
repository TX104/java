package com.tencent.day11.work;

import java.util.Arrays;

/**
 * 	2、给字符串"abcd122axdefajexgb"排序，数字比字母优先
 * 
 * @author TangXin
 * 2018年7月24日
 */
public class Work2 {

	public static void main(String[] args) {
		
		String str="abcd122axdefajexgb";
		char[] array=str.toCharArray();
		Arrays.sort(array);
		System.out.println(new String(array));
		for(char s1:array){
			System.out.print(s1+",");
		}
		
		

	}

}
