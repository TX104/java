package com.tencent.day09.work22;

public class Train extends Traffic{
	
	public Train(String name){
		this.name=name;
	}

	@Override
	public void run() {
		
		System.out.println("我是"+name+"火车，我在铁路是跑");
		
	}

}
