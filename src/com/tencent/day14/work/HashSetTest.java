package com.tencent.day14.work;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 3.使用HashSet完成第一题的功能。（使用迭代器和数组完成）
 * @author TangXin
 * 2018年7月28日
 */
public class HashSetTest {

	public static void main(String[] args) {
		
		Student student1=new Student("李四",21,"男");
		Student student2=new Student("小红",20,"女");
		Student student3=new Student("小米",24,"男");
		Student student4=new Student("小王",23,"男");
		Student student5=new Student("小吴",21,"男");
		
		Set<Student> list=new HashSet<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		
		//迭代器
		for(Iterator<Student> iter=list.iterator();iter.hasNext();){
			Student element=iter.next();
			element.printer();
		}
		System.out.println("--------------------数组------------------------");
		
		//数组
		Student[] sArray={student1,student2,student3,student4,student4,student5};
		for(Student st:sArray){
			st.printer();
		}
		
	}


}
