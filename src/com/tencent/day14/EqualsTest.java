package com.tencent.day14;

import java.util.HashSet;
import java.util.Set;

/**
 * 测试equals
 * @author TangXin
 * 2018年7月27日
 */
public class EqualsTest {

	public static void main(String[] args) {
		
		User u1=new User("小明",23);
		User u2=new User("小明",23);
		
		System.out.println(u1==u2);
		//equals是Object类中的方法，如果子类没有重写，与==没有区别
		System.out.println(u1.equals(u2));
		
		String str1=new String("abc");
		String str2=new String("abc");
		
		//Set集合去重根据equals和hashCode两个值去重
		//不是任何引用类型都会去重，必须重写equals和hashCode两个方法
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		Set<User> set1=new HashSet<User>();
		set1.add(u1);
		set1.add(u2);
		System.out.println(set1.size());
		
		Set<String> set2=new HashSet<String>();
		set2.add(str1);
		set2.add(str2);
		System.out.println(set1.size());
	

	}

}
