package com.tencent.day11.work;

/**
 * 	3、给字符串"abcd122axdefajexgb"反过来赋予一个新的字符串，并输出
 * 
 * @author TangXin
 * 2018年7月24日
 */
public class Work3 {

	public static void main(String[] args) {
		
		String s="abcd122axdefajexgb";
		char[] array1=s.toCharArray();
		char array2[]=new char[18];
		for(int i=0;i<array1.length;i++){
			
			array2[array1.length-1-i]=array1[i];
			
		}
		
		for(char s1:array2){
			System.out.print(s1);
		}
		String st=new String(array2);
		System.out.println(st);
		
		//
		String str="abcd122axdefajexgb";
		char[] ch=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=ch.length-1;i>=0;i--){
			sb.append(ch[i]);
		}
		System.out.println(sb.toString());

	}

}
