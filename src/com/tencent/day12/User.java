package com.tencent.day12;

/**
 * 
 * @author TangXin
 * 2018年7月25日
 */
public class User implements Comparable<User>{
	
	private String name;
	private int age;

	public User(String name,int age){
		this.setName(name);
		this.age=age;
	}

	@Override
	/**
	 * 自定义规则比较两个对象的大小
	 * 年龄大的为1
	 * 年龄小的为-1
	 * 年龄相同为0
	 */
	public int compareTo(User o) {
		
		if(this.age>o.age){
			return 1;
		}else if(this.age<o.age){
			return -1;
		}else{
			return 0;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
