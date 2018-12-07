package com.tencent.day08.work;

public class BirdTest {

	public static void main(String[] args) {
		
		BirdsOne one=new BirdsOne();
		one.setColor("蓝色");
		one.setAge(5);
		one.setCall("吱吱吱");
		one.self();
		one.cry();
		
		System.out.println("--------------------------");
		
		BirdsTwo two=new BirdsTwo();
		two.setColor("天蓝色");
		two.setAge(4);
		two.setCall("喳喳喳");
		two.self();
		two.cry();

	}

}
