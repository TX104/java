package com.tencent.day11;

/**
 * 测试外部类
 * @author TangXin
 * 2018年7月24日
 */
public class OutClassTest {

	public static void main(String[] args) {
		
		OutClass out=new OutClass();
		out.leftSelf();
		
		//同包下，外部类可以直接new
		Left left=new Left("杨逍");
		left.self();
		
	}

}
