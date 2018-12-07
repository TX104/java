package com.tencent.day10;

import java.io.IOException;

/**
 * 人类
 * @author TangXin
 * 2018年7月20日
 */
public class Person {
	
	private int age;
	
	
	public void setAge(int age) throws AgeException{
		if(age>=0 && age<=130){
			this.age=age;
		}else{
			AgeException ageException=new AgeException(age);
			throw ageException;
		}
	}
	
	public void call() throws IOException{
		
	}
	public int getAge(){
		return age;
	}

	public static void main(String[] args) {
		
		
		Person p=new Person();
		try{
			p.setAge(180);
		}catch(AgeException e){
			e.printStackTrace();
		}
		System.out.println(p.getAge());
	}

}
