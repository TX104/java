package com.tencent.day03;

import java.util.Scanner;

/**
 * 商城购物
 * @author TangXin
 * 2018年7月11日
 */
public class Store {

	public static void main(String[] args) {
		//商品列表
		System.out.println("编号\t商品名称\t价格\t库存数量");
		System.out.println("1\t牙膏\t25.5\t60");
		System.out.println("2\t毛巾\t50\t50");
		System.out.println("3\t拖鞋\t25\t20");
		System.out.println("4\tT桖\t100\t30");
		System.out.println("5\t洗面奶\t40\t20");	
		
		Scanner md=new Scanner(System.in);
		String choose="y";
		double moneySum=0;
		do{
			System.out.println("请输入您购买的商品编号");
			int code=md.nextInt();
			System.out.println("请您输入购买数量");
			int num=md.nextInt();
			double money=0;
			switch(code){
			case 1:
				money=num*25.5;
				System.out.println("购买牙膏"+num+"支，合计"+money+"元");
				num=60-num;
				System.out.println("牙膏的剩余数量为:"+num);
				break;
			case 2:
				money=num*50;
				System.out.println("购买毛巾"+num+"条，合计"+money+"元");
				num=50-num;
				System.out.println("毛巾的剩余数量为:"+num);
				break;
			case 3:
				money=num*25;
				System.out.println("购买拖鞋"+num+"双，合计"+money+"元");
				num=20-num;
				System.out.println("拖鞋的剩余数量为:"+num);
				break;
			case 4:
				money=num*100;
				System.out.println("购买T恤"+num+"件，合计"+money+"元");
				num=30-num;
				System.out.println("T桖剩余数量为:"+num);
				break;
			case 5:
				money=num*40;
				System.out.println("购买洗面奶"+num+"支，合计"+money+"元");
				num=20-num;
				System.out.println("洗面奶的剩余数量为:"+num);
				break;
			default:
				break;
			}
			System.out.println("您是否继续购买(y/n):");
			choose=md.next();
			
			moneySum=moneySum+money;//计算总金额
			
		}while(choose.equals("y"));//"y".equals(choose);
			System.out.println("总金额为:"+moneySum+"元");
			boolean state=false;//定义判断值
			do{
				System.out.println("请您输入付款金额:");
				double much=md.nextDouble();
				double balance=much-moneySum;
				if(balance>0){
					System.out.println("找零:"+balance+"元");
					state=false;
				}else if(balance<0){
					moneySum=(0-balance);
					System.out.println("您还需多付款:"+moneySum+"元");
					state=true;
				}else if(balance==0){
					System.out.println("付款金额正好，谢谢惠顾!");
					state=false;
				}
			}while(state);
			
		md.close();
	}

}
