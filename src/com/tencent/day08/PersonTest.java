package com.tencent.day08;

/**
 * 人类的测试类
 * @author TangXin
 * 2018年7月18日
 */
public class PersonTest {

	public static void main(String[] args) {
		Person p=new Person();
		
		p.setName("周芷若");
		p.setAge(22);
		p.setHeight(156.5);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getHeight());
	}

}
