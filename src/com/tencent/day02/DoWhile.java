package com.tencent.day02;

import java.util.Scanner;

/**
 * 使用do..while实现一个用户登录
 * 用户名:admin
 * 密码:123456
 * @author TangXin
 * 2018年7月10日
 */
public class DoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean loginState=false;
		do{
			System.out.println("请输入用户名");
			String username=sc.next();
			System.out.println("请输入密码");
			String password=sc.next();
			if(username.equals("admin") && password.equals("123456")){
				System.out.println("恭喜您登录成功");
				loginState=true;
			}else{
				System.out.println("用户名或密码错误，请重新输入!");
				loginState=false;
			}
		}while(!loginState);//布尔表达式
		sc.close();
		
		

	}

}
