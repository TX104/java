package com.tencent.day14.work;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.使用ArrayList泛型添加5个学生对象，
	然后遍历打印5位学生的自我介绍方法。
	（需创建学生类）
	Student.java包含 name,age,gender属性，
	printer介绍方法。
 * @author TangXin
 * 2018年7月28日
 */
public class ArrayListTest {

	public static void main(String[] args) {
		
		Student student1=new Student("李四",21,"男");
		Student student2=new Student("小红",20,"女");
		Student student3=new Student("小米",24,"男");
		Student student4=new Student("小王",23,"男");
		Student student5=new Student("小吴",21,"男");
		
		
		List<Student> list=new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		
		//foreach遍历
		for(Student s:list){
			s.printer();
		}
		

	}

}
