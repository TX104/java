package com.tencent.day09.work4;

/**
 * 研究生类
 * @author TangXin
 * 2018年7月19日
 */
public class Graduate implements Student,Teacher{
	public String name;
	
	public String sex;
	
	public int age;
	
	private double fee;
	
	private double pay;
	
	public void self(){
		System.out.println("我叫:"+name);
		System.out.println("性别:"+sex);
		System.out.println("年龄:"+age);
	}
	@Override
	public void setPay(double pay) {
		this.pay=pay;
	}

	@Override
	public double getPay() {
		return pay;
	}

	@Override
	public void setFee(double fee) {
		this.fee=fee;
	}

	@Override
	public double getFee() {
		return fee;
	}

}
