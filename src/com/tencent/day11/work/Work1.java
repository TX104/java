package com.tencent.day11.work;

import java.util.ArrayList;

/**
 *  1、有一个字符串"abcd122axdefajexgb"算出a出现的次数，并且告知出现的位置
 *  
 * @author TangXin
 * 2018年7月24日
 */
public class Work1 {
	
	public static int countString(String str,char queryChar,ArrayList<Integer>indexs){
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]==queryChar){
				count++;
				indexs.add(i);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		String str="abcd122axdefajexgb";
		ArrayList<Integer>indexs=new ArrayList<Integer>();
		int count=countString(str,'a',indexs);
		System.out.println(count);
		for(int i:indexs){
			System.out.println(i);
		}
		

	}

}
