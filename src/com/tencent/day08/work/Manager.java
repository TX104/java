package com.tencent.day08.work;

/**
 * 经理子类
 * @author TangXin
 * 2018年7月18日
 */
public class Manager extends Employee{
	
	public double getSalary(){
		
		System.out.println("经理薪水"+super.getSalary());
		return super.getSalary();
	}
}
	
	
