package com.tencent.day08;

public class ExtendsText {

	public static void main(String[] args) {
		//
		Dog dog=new Dog();
		
		dog.setName("哈士奇狗狗");
		dog.setAge(3);
		dog.setPerform("钻火圈");
		dog.self();
		dog.getClass();

		System.out.println("---------------------");
		//
		Cat cat=new Cat();
		cat.setName("招财猫");
		cat.setAge(2);
		cat.setPose("招手");
		cat.self();

	}

}
