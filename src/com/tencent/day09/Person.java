package com.tencent.day09;

/**
 * abstract抽象类 人类 
 * @author TangXin
 * 2018年7月19日
 */
public abstract class Person {
	
	/**
	 * 说语言
	 * 抽象方法，没有实体
	 * 只有定义，没有实现
	 * @author TangXin
	 * 2018年7月19日
	 */
	public abstract void sayLanguage();
	
	public void parent(){
		System.out.println("父类方法");
	}
	
	public void rewrite(){
		System.out.println("父类重写方法");
		
	}
	
	public static void reset(){
		System.out.println("父类静态方法");
	}
	
	public Bird getBird(int type){
		Bird bird=null;
		if(type==1){
			bird=new BirdsOne("黑色",1);
		}else if(type==2){
			bird=new BirdsTwo("绿色",2);
		}
		return bird;
	}


	
}
