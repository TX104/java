package com.tencent.day12;

/**
 * 字符包装
 * @author TangXin
 * 2018年7月25日
 */
public class CharacterTest {

	public static void main(String[] args) {
		
		Character ch=new Character('a');
		
		//字符转字符串
		String s1=String.valueOf(ch);
		System.out.println(s1);
		
		//字符串转字符
		String s2="abc";
		s2.toCharArray();
		
		//字符转大写
		System.out.println(Character.toUpperCase(ch));
		//字符转小写
		System.out.println(Character.toLowerCase(ch));
		
		//判断是否大写
		System.out.println(Character.isUpperCase(ch));
		//判断是否小写
		System.out.println(Character.isLowerCase(ch));

	}

}
