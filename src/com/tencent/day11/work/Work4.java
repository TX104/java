package com.tencent.day11.work;

import java.net.StandardSocketOptions;
import java.util.Arrays;

/**
 * 	给字符串"abcd&&&&122axd###ef***ajexgb"内容分类，字母、数字、符号，并用三个数组接收
 * 
 * @author TangXin
 * 2018年7月24日
 */
public class Work4 {

	public static void main(String[] args) {
		
		String s="abcd&&&&122axd###ef***ajexgb";
		byte[] Array=s.getBytes();
		int sum1=0;
		int sum2=0;
		int sum3=0;
		for(int i=0;i<Array.length;i++){
			if(Array[i]>=48 && Array[i]<=57){
				sum1++;
			}else if(Array[i]>=97 && Array[i]<=122){
				sum2++;
			}else{
				sum3++;
			}
		}
		byte[] array1=new byte[sum1];
		byte[] array2=new byte[sum2];
		byte[] array3=new byte[sum3];
		
		int a=0;
		int b=0;
		int c=0;
		for(int i=0;i<Array.length;i++){
			
			if(Array[i]>=48 && Array[i]<=57){
				array1[a]=Array[i];
				a++;
			}else if(Array[i]>=97 && Array[i]<=122){
				array2[b]=Array[i];
				b++;
			}else{
				array3[c]=Array[i];
				c++;
			}
		}
		
		for(byte e:array1){
			System.out.print(e+",");
		}
		System.out.println("");
		for(byte e:array2){
			System.out.print(e+",");
		}
		System.out.println("");
		for(byte e:array3){
			System.out.print(e+",");
		}
		System.out.println("");
		System.out.println("");
		
		String s1=new String(array1);
		char[] d1=s1.toCharArray();
		for(char e:d1){
			System.out.println(e);
		}
		System.out.println("");
		
		String s2=new String(array2);
		char[] d2=s2.toCharArray();
		for(char e:d2){
			System.out.println(e);
		}
		System.out.println("");
		
		String s3=new String(array3);
		char[] d3=s3.toCharArray();
		for(char e:d3){
			System.out.println(e);
		}
	}

}
