package com.tencent.day09.work55;

/**
 * 鸟类
 * @author TangXin
 * 2018年7月20日
 */
public class Bird extends Poultry implements Pet,Animal{
	
	/**
	 * 动物接口的跑的方法
	 */
	@Override
	public void run() {
		
		System.out.println("疯狂奔跑");
	}
	
	/**
	 * 宠物接口的喂食方法
	 */
	@Override
	public void eat() {
		
		System.out.println("开心喂食");
	}
	
	/**
	 * 家禽抽象类的下蛋的方法
	 */
	@Override
	public void layeggs() {
		
		System.out.println("在鸟窝里下蛋");
	}

}
