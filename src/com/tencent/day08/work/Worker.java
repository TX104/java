package com.tencent.day08.work;

/**
 * 工人之类
 * @author TangXin
 * 2018年7月18日
 */
public class Worker extends Employee{
	
	public double getSalary(){
		
		System.out.println("工人薪水:"+super.getSalary());
		return super.getSalary();
	}
}
