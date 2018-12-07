package com.tencent.day09;

/**
 * 测试人类(抽象类)
 * @author TangXin
 * 2018年7月19日
 */
public class PersonText {
	
	public static void main(String[] args) {
		Person p1=new Chinese();	//p1为上转型对象	对象的多态		
		p1.sayLanguage();
		p1.parent();	//父类方法
		p1.rewrite();	//父类重写子类方法
//		p1.children();	//子类的方法
		p1.reset();     //子类重写父类的静态方法
		
		System.out.println("============");
		
			
		System.out.println("============");
		
		Chinese p=new Chinese();
//		p.sayLanguage();
//		p.parent();		//父类方法
//		p.rewrite();	//父类重写子类方法
//		p.children();
		p.reset();
		
		Person p2=new America();
		p2.sayLanguage();
	}
}
