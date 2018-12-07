package com.tencent.day09;

/**
 * 接口测试
 * @author TangXin
 * 2018年7月19日
 */
public class IntefactTest {
	
	public static void main(String[] args) {
		Animal animal=new Dog();	//animal可以叫接口回调
		animal.call();	//只能调用Animal接口的方法
		
		Pet pet=new Dog();		
		pet.eat();		//只能调用Pet接口的方法
		
		Dog dog=new Dog();	//	子类最大，都能调用
		dog.call();
		dog.eat();
	}
}
