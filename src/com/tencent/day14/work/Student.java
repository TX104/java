package com.tencent.day14.work;

/**
 * 学生类
 * 基础类，必须生成get/set方法	构造方法
 * @author TangXin
 * 2018年7月28日
 */
public class Student {
	
	private String name;
	
	private int age;
	
	private String gender;
	
	public Student() {
		super();
	}

	public Student(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//自我介绍
	public void printer(){
		System.out.println("名字:"+name);
		System.out.println("年龄:"+age);
		System.out.println("性别:"+gender);
		System.out.println("");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

		
}
