package com.tencent.day09;

/**
 * 
 * @author TangXin
 * 2018年7月19日
 */
public class Dog implements Animal,Pet{

	@Override	//重写
	public void call() {
//		Animal.NAME="aaa";
		System.out.println("嗷嗷嗷哦!");
	}

	@Override
	public void eat() {
		System.out.println("来吃狗粮");
		
	}

}
