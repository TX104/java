package com.tencent.day12;

/**
 * 比较两个对象的大小
 * @author TangXin
 * 2018年7月25日
 */
public class ComparableTest {

	public static void main(String[] args) {
		
		User u1=new User("迪丽冷巴",24);
		User u2=new User("鹿晗",26);
		
		System.out.println(u1.compareTo(u2));

	}

}
