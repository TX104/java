package com.tencent.work;

public class StringTest {

	public static void main(String[] args) {

		String s="12ab 34cd 56ef 78gh";
		
		String[] sArray=s.split(" ");
		
		String st1=sArray[0].toString();
		String st2=sArray[1].toString();
		String st3=sArray[2].toString();
		String st4=sArray[3].toString();
		
		String s1=st1.substring(0, 2);
		String s2=st1.substring(2,4);
		String s3=st2.substring(0, 2);
		String s4=st2.substring(2,4);
		String s5=st3.substring(0, 2);
		String s6=st3.substring(2,4);
		String s7=st4.substring(0, 2);
		String s8=st4.substring(2,4);

		StringBuffer sb=new StringBuffer();
		sb.append(s2);
		sb.append(s1);
		sb.append(" ");
		sb.append(s4);
		sb.append(s3);
		sb.append(" ");
		sb.append(s6);
		sb.append(s5);
		sb.append(" ");
		sb.append(s8);
		sb.append(s7);
		
//		System.out.println(sb);

		//第二种
		String t="12ab 34cd 56ef 78gh";
		
		String[] tArray=t.split(" ");
		
		
		
		
		
	}

}
