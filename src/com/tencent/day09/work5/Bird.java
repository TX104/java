package com.tencent.day09.work5;

/**
 * 鸟类
 * @author TangXin
 * 2018年7月19日
 */
public class Bird extends Poultry implements Animal,Pet{

	@Override
	public void eggs() {
		System.out.println("我会下蛋");
		
	}

	@Override
	public void feed() {
		System.out.println("我会喂食");
		
	}

	@Override
	public void run() {
		System.out.println("我会跑");
		
	}

}
