package com.tencent.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author TangXin
 * 2018年7月30日
 */
public class User implements Comparable<User>{
	
	private int age;
	
	private String name;
	
	public User() {
		super();
	}

	public User(int age) {
		this.age = age;
	}

	public User(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(User u) {
		if(this.age>u.getAge()){
			return 1;
		}else if(this.age<u.getAge()){
			return -1;
		}else{
			return 0;
		}
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		User u1=new User(24,"小锐锐");
		User u2=new User(21,"小宝子");
		User u3=new User(22,"小 勇子");
		//CompareTo方法比较
//		System.out.println(""+u1.compareTo(u2));
		
		User[] uArray={u1,u2,u3};
		System.out.println("--------未排序--------------");
		for(User u:uArray){
			System.out.println(u.getName());
		}
		System.out.println("---------已排序--------------");
		Arrays.sort(uArray);
		for(User u:uArray){
			System.out.println(""+u.getName());
		}
		
		List<User> uList=new ArrayList<User>();
		uList.add(u1);
		uList.add(u2);
		uList.add(u3);
		System.out.println("--------未排序--------------");
		for(User u:uList){
			System.out.println(u.getName());
		}
		System.out.println("---------已排序(从小到大)--------------");
		//集合排序
		Collections.sort(uList);
		for(User u:uList){
			System.out.println(u.getName());
		}
		
		}

	
}
