package com.tencent.day09;

/**
 * final关键字
 * @author TangXin
 * 2018年7月19日
 */
public class Final extends Bird{
	
	private final static Bird NUM=new Bird();
	//常量，值不可以被修改，常量名一定是大写
	//一般常量结合static使用，称为静态常量,此对象永远不会被回收
	
	public void change(){
		int a=10;
		//NAME="";
	}
	
	public static void main(String[] args) {
		Final f1=new Final();
		System.out.println(f1.NUM);
		
		Final f2=new Final();
		System.out.println(f2.NUM);
	}
	
}
