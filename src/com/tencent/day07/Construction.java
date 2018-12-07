package com.tencent.day07;

/**
 * 构造方法
 * @author TangXin
 * 2018年7月17日
 */
public class Construction {
	
	String name;
	
	int age;
	
	
	
	/**
	 * 无参构造
	 */
	Construction(){
		System.out.println("======无参构造======");
		show();
	}
	
	Construction(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void show(){
		System.out.println("=========显示新闻信息===========");
	}
	public static void main(String[] args) {
		//java中规定创建对象必须满足两个条件
		//new + 构造方法
		Construction con1=new Construction();//默认的无参构造
		Construction con=new Construction("盖世英雄",18);	//	new 是给新的对象分配内存空间
		
		//con.name="盖世英雄";
		//con.age=18;
		System.out.println(con.name);
		System.out.println(con.age);
		//构造方法不能被对象调用
		//con.Construction();
	}
}
