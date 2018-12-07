package com.tencent.day09.work44;

public class Graduate implements Student,Teacher{
	
	private String name;
	
	private String sex;
	
	private int age;
	
	private double pay;
	
	private double fee;
	
	public Graduate(){
		
	}
	//通过构造函数初始化变量
	public Graduate(String name,String sex,int age){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public int getAage(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
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
	
	public void count(){
		System.out.println("姓名:"+name);
		System.out.println("性别:"+sex);
		System.out.println("年龄:"+age);
		if(pay-fee<2000){
			System.out.println("load a plan");
		}
	}

}
