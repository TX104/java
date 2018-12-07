package com.tencent.day16;

import java.util.HashSet;
import java.util.Set;

/**
 * equals与==的区别
 * @author TangXin
 * 2018年7月30日
 */
public class EqualsTest {

	public static void main(String[] args) {
		
		Student stu1=new Student("刘亦菲",78.9);
		Student stu2=new Student("刘亦菲",78.9);
		
		System.out.println(stu1==stu2);				//比较指针
		System.out.println(stu1.equals(stu2));		//没有重写equals方法，比较的是指针，与==没区别
		
		
		System.out.println("--------------------------");
		
		String str1=new String("刘");
		String str2=new String("刘");
		System.out.println(str1==str2);				//比较指针
		System.out.println(str1.equals(str2));		//比较内容，重写了equals方法
		
		Set<Student> stuSet=new HashSet<Student>();
		stuSet.add(stu1);
		stuSet.add(stu2);
		System.out.println(stuSet.size());

	}

}
