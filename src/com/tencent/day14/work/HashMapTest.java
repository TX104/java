package com.tencent.day14.work;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 	4.使用HashMap添加5位学生.  使用学生的name作为key。
  	用户从控制台输入要查询的学生姓名，
  	如果存在，输出该学生的自我介绍方法，
  	不存在，提示用户该学生不存在。
	最后遍历HashMap的所有的键值。
 * @author TangXin
 * 2018年7月28日
 */
public class HashMapTest {

	public static void main(String[] args) {
		
		Student student1=new Student("李四",21,"男");
		Student student2=new Student("小红",20,"女");
		Student student3=new Student("小米",24,"男");
		Student student4=new Student("小王",23,"男");
		Student student5=new Student("小吴",21,"男");
		
		Map<String,Student> map=new HashMap<String,Student>();
		
		map.put(student1.getName(), student1);
		map.put(student2.getName(), student2);
		map.put(student3.getName(), student3);
		map.put(student4.getName(), student4);
		map.put(student5.getName(), student5);
		
		/*Scanner sc=new Scanner(System.in);
		boolean flag=true;
		do{
			System.out.println("请输入查询的姓名:");
			String key=sc.next();
			switch(key){
				case "李四":
				case "小红":
				case "小米":
				case "小王":
				case "小吴":
					map.get(key).printer();
					flag=false;
					break;
				default:
					System.out.println("该学生不存在，请重新输入");
					flag=true;
			}
			Set<String>  keys=map.keySet();	
			//遍历key值
			if(flag==true){
				for(String element:keys){
					System.out.println(element);
				}
			}
		}while(flag);
		sc.close();*/
		//遍历Set集合
		/*for(String key:keys){
			Student value1=map.get(key);
			value1.printer();
		}*/
		
		//
		Scanner sd=new Scanner(System.in);
		System.out.println("请输入学生姓名:");
		String name=sd.next();
		Student stu=map.get(name);
		
		if(stu!=null){
			stu.printer();
		}else{
			System.out.println("该学生不存在!");
			
			//遍历键值(key)
			Set<String> keys=map.keySet();
			for(String key:keys){
				System.out.println(key);
			}
		}
		sd.close();

	}

}
