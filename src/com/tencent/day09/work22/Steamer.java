package com.tencent.day09.work22;

/**
 * 轮船
 * @author TangXin
 * 2018年7月20日
 */
public class Steamer extends Traffic{
	
	public Steamer(String name){
		this.name=name;
	}

	@Override
	public void run() {
		System.out.println("我是"+this.name+"轮船，我在海上跑");
		
	}

}
