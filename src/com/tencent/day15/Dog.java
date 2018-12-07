package com.tencent.day15;

public class Dog implements Animal{

	@Override
	public void call() {
		System.out.println("嗷嗷嗷");
		
	}
	
	public static void main(String[] args) {
		
		Animal d=new Dog();
		d.call();
		d.run();
	}

}
