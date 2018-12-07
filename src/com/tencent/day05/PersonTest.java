package com.tencent.day05;

/**
 * 人类测试类
 * @author TangXin
 * 2018年7月13日
 */
public class PersonTest {
	public static void main(String[] args){
		Person zsf=new Person();
		zsf.name="张三丰";
		zsf.age=150;
		zsf.sex='男';
		zsf.height=165.5;
		zsf.blood="O";
		
		//自我介绍
		zsf.self();
		
		Person mj=new Person();
		mj.name="灭绝师太";
		mj.age=45;
		mj.sex='女';
		mj.height=155.5;
		mj.blood="AB";
		
		//自我介绍
		mj.self();
	}

}
