package com.tencent.day05;

/**
 * 女票类
 * @author TangXin
 * 2018年7月13日
 */
public class GirlFriend {
	String name;
	double height;
	double weight;
	
	/**
	 * 自我介绍方法
	 * 无返回值，无参数
	 */
	void self(){
		System.out.println("我女票叫:"+name);
		System.out.println("身高:"+height+"cm");
		System.out.println("体重:"+weight+"kg");
	}
	/**
	 * 有返回值，无参数列表
	 * @return
	 */
	String shopping(){
		System.out.println("我和"+name+"去购物");
		
		String productList="爱马仕包包、迪奥的护肤品、玛莎拉蒂跑车";
		return productList;

	}
	/**
	 * 求婚的方法
	 * 有返回值，有参数列表
	 * @param content
	 * @param diamond
	 * @return
	 */
	String proposal(String content,int diamond){
		System.out.println(content);
		System.out.println(diamond+"克拉的钻戒");
		if(diamond>=20){
			return "求婚成功";
		}else{
			return "没有20克拉的钻戒，还想要我嫁给你!骚年，继续奋斗吧!";
		}
		
		
	}
}
