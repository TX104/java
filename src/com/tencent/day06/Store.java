package com.tencent.day06;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 商城
 * 拥有两个属性:用户、商品
 * 拥有哪些方法:购物、结账、呈现商品列表、商城入口
 * @author TangXin
 * 2018年7月16日
 */
public class Store {
	
	User user=new User();
	
	Product[] products=new Product[5];
	
	/**
	 * 商城入口
	 * @author TangXin
	 * 2018年7月16日
	 */
	void portal(){
		init();///初始化数据
		Scanner sc=new Scanner(System.in);
		//调用用户类的登录状态，返回登录状态
		boolean state=user.login(sc);
		if(state){
			//显示商品
			showProduct();
			//购物,返回消费总金额
			double sumMoney=shopping(sc);
			System.out.println("消费总金额:"+sumMoney+"元");
			//结算
			settleAccounts(sc,sumMoney);
		}
		sc.close();
	}
	
	/**
	 * 初始化数据
	 * @author TangXin
	 * 2018年7月16日
	 */
	void init(){
		//初始化用户
		user.username="admin";
		user.password="123456";
		user.name="厄运小姐";
		
		//初始化商品
		Product p1=new Product();
		p1.code=1;
		p1.name="电风扇";
		p1.price=124.23;
		products[0]=p1;
		Product p2=new Product();
		p2.code=2;
		p2.name="洗衣机";
		p2.price=4500.0;
		products[1]=p2;
		Product p3=new Product();
		p3.code=3;
		p3.name="电视机";
		p3.price=8800.9;
		products[2]=p3;
		Product p4=new Product();
		p4.code=4;
		p4.name="冰箱";
		p4.price=5500.88;
		products[3]=p4;
		Product p5=new Product();
		p5.code=5;
		p5.name="空调";
		p5.price=4456.0;
		products[4]=p5;
	}
	
	/**
	 * 显示商品
	 * @author TangXin
	 * 2018年7月16日
	 */
	void showProduct(){
		System.out.println("***********欢迎进入商品批发城***************");
		System.out.println("\t编号\t商品\t价格");
		for(Product p:products){
			System.out.println("\t"+p.code+"\t"+p.name+"\t"+p.price);
		}
		System.out.println("******************************************");
	}
	
	/**
	 * 购物
	 * @param sc
	 * @return	返回购物金额
	 * @author TangXin
	 * 2018年7月16日
	 */
	double shopping(Scanner sc){
		String choose="y";
		double sumMoney=0;//总消费金额
		do{
			System.out.println("请您输入商品编号:");
			int code=sc.nextInt();
			System.out.println("请您输入批发数量");
			int num=sc.nextInt();
			double price=products[code-1].price;//商品单价
			System.out.println("本次消费:"+(price*num)+"元");
			sumMoney+=(price*num);
			System.out.println("总共消费:"+sumMoney+"元");
			System.out.println("是否继续购物(y:是/n:否):");
			choose=sc.next();
		}while(choose.equals("y"));
		return sumMoney;
	}
	
	/**
	 * 结算
	 * @param sc	控制台
	 * @param sumMoney	消费总金额
	 * @author TangXin
	 * 2018年7月16日
	 */
	void settleAccounts(Scanner sc,double sumMoney){
		DecimalFormat df=new DecimalFormat("###,###.00");
		System.out.println("您需要付款:"+df.format(sumMoney)+"元");
		do{
			System.out.println("请输入付款金额:");
			double money=sc.nextDouble();
			double balance=money-sumMoney;
			if(balance>0){
				System.out.println("找零："+df.format(balance)+"元");
				break;
			}else if(balance==0){
				System.out.println("付款成功，谢谢惠顾!");
				break;
			}else if(balance<0){
				sumMoney=(0-balance);
				System.out.println("您还需付款:"+df.format(sumMoney)+"元");
			}
		}while(true);
	}
	
	
}
