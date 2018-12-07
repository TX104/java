package com.tencent.day09.work4;

public class GraduateTest {

	public static void main(String[] args) {
		
		Graduate zg=new Graduate();
		zg.name="zhangsan";
		zg.age=24;
		zg.sex="男";
		
		zg.setFee(6000.6);
		zg.setPay(7500.0);
		
		zg.self();
		System.out.println("学费"+zg.getFee());
		System.out.println("工资"+zg.getPay());
		
		if(zg.getPay()-zg.getFee()<2000){
			System.out.println("provide a loan");
		}
		
	}

}
