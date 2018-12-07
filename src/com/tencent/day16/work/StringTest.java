package com.tencent.day16.work;

/**
 * 1.String s = "12ab 34cd 56ef 78gh"; 要求输出 ab12 cd34 ef56 gh78   
 * @author TangXin
 * 2018年7月30日
 */
public class StringTest {

	public static void main(String[] args) {

		String s="12ab 34cd 56ef 78gh";
		String[] sArray=s.split(" ");
		StringBuffer sb=new StringBuffer();
		for(String e:sArray){
			String st1=e.substring(0, 2);
			String st2=e.substring(2, 4);
			sb.append(st2);
			sb.append(st1);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
		
	}

}
