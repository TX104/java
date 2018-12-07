package com.tencent.day05;

/**
 * 人类的属性
 * @author TangXin
 * 2018年7月13日
 */
public class Person {

	String name;
	
	int age;
	
	char sex;
	
	double height;
	
	String blood;
	
	void self(){
		System.out.println("姓名:"+name);
		System.out.println("年龄:"+age);
		System.out.println("性别:"+sex);
		System.out.println("身高:"+height);
		System.out.println("血型:"+blood);
	}

}
