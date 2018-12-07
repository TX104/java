package com.tencent.day15;

public interface Animal {
	
	public void call();
	
	public default void run(){
		System.out.println("动物再跑");
	}

}
