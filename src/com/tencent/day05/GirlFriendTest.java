package com.tencent.day05;

/**
 * 测试女票类
 * @author TangXin
 * 2018年7月13日
 */
public class GirlFriendTest {

	public static void main(String[] args) {
		GirlFriend gf=new GirlFriend();
		gf.name="赏金猎人-厄运小姐";
		gf.height=165;
		gf.weight=50;
		
		//无返回值，无参数列表
		gf.self();
		
		//有返回值，无参数列表
		String productList=gf.shopping();
		System.out.println(productList);
		
		//有返回值，有参数
		String result=gf.proposal("您就是我心中的日月，没有你我人生就没有色彩，嫁给我吧!", 15);
		System.out.println("求婚结果:"+result);

	}

}
