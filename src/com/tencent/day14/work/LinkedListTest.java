package com.tencent.day14.work;

import java.util.LinkedList;
import java.util.List;

/**
 * 2.使用LinkedList泛型添加5个学生对象，
	然后插入第6个学生至第二个位置，删除最后一位学生。
	然后遍历打印5位学生的自我介绍方法。
 * @author TangXin
 * 2018年7月28日
 */
public class LinkedListTest {

	public static void main(String[] args) {
		
		Student student1=new Student("李四",21,"男");
		Student student2=new Student("小红",20,"女");
		Student student3=new Student("小米",24,"男");
		Student student4=new Student("小王",23,"男");
		Student student5=new Student("小吴",21,"男");
		
		List<Student> list=new LinkedList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		
		Student student6=new Student("小美",21,"女");
		//插入元素
		list.add(1, student6);
		
		//删除元素
		list.remove(list.size()-1);
		
		for(Student s:list){
			s.printer();
		}

	}

}
