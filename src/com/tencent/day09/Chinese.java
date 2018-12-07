package com.tencent.day09;

/**
 * 中国人，子类一定要重写父类的抽象方法
 * @author TangXin
 * 2018年7月19日
 */
public class Chinese extends Person{

	@Override//重写
	public void sayLanguage() {
		System.out.println("瓦西里东东");
		
	}
	
	public void rewrite(){
		System.out.println("子类重写父类方法");
	}
	
	public void children(){
		System.out.println("子类方法");
	}
	
	public static void reset(){
		System.out.println("子类静态方法");
	}
	
}
