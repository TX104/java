package com.tencent.day09.work2;

public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle a=new Car();
		a.age=2;
		a.name="汽车";
		a.see();
		a.self();
		
		Vehicle b=new Steamer();
		b.age=3;
		b.name="轮船";
		b.see();
		b.self();
		
		Vehicle c=new Train();
		c.age=4;
		c.name="火车";
		c.see();
		c.self();

	}

}
