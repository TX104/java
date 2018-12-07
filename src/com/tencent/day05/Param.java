package com.tencent.day05;

/**
 * 测试形参与实参
 * @author TangXin
 * 2018年7月13日
 */
public class Param {
	
	void change(int num,char ch,int[] array,GirlFriend gf,String str){
		num=20;
		ch='z';
		array[0]=-10;
		
		gf.name="古力娜扎";
		str="面向过程";//
	}

	public static void main(String[] args) {
		int num=100;
		char ch='a';
		int[] array={1};
		
		GirlFriend gf=new GirlFriend();
		
		gf.name="刘亦菲";
		
		String str="面向对象";//
		
		Param param=new Param();
		param.change(num, ch, array,gf,str);
		System.out.println(num);
		System.out.println(ch);
		System.out.println(array[0]);
		System.out.println(gf.name);
		System.out.println(str);
		
	}

}
