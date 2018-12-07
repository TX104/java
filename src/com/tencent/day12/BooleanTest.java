package com.tencent.day12;

public class BooleanTest {

	public static void main(String[] args) {
		
		//静态常量
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		//构造
		Boolean b1=new Boolean(true);
		Boolean b2=new Boolean("true");
		
		//比较内容
		System.out.println(b1.equals(b2));
		
		//布尔转字符串
		String bStr=String.valueOf(b1);
		System.out.println(bStr);
		
		//字符串转布尔
		Boolean b3=Boolean.valueOf("true");
		Boolean b4=Boolean.parseBoolean("false");
		System.out.println(b3);
		System.out.println(b4);
		
		//

	}

}
