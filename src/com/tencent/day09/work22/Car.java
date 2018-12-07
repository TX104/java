package com.tencent.day09.work22;

/**
 * 汽车
 * @author TangXin
 * 2018年7月20日
 */
public class Car extends Traffic{
	
	//通过构造方法初始化变量
	public Car(String name){
		this.name=name;
	}

	@Override
	public void run() {
		
		
		System.out.println("我是"+this.name+"汽车,我在马路是跑!");
		
	}

}
