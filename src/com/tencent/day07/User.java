package com.tencent.day07;

/**
 * 用户类
 */
import java.util.Scanner;

public class User {
	
	String username;
	
	String password;
	
	String name;
	
	/**
	 * 登录
	 * @param sc
	 * @return	成功与失败
	 * @author TangXin
	 * 2018年7月16日
	 */
	boolean login(Scanner sc){
		String choose="y";
		do{
			System.out.println("请输入用户名:");
			String username=sc.next();
			System.out.println("请输入密码:");
			String password=sc.next();
			if(username.equals(this.username) && password.equals(this.password)){
				//System.out.println("欢迎"+name+"登录网上商城");
				System.out.println("欢迎"+name+"登录新闻系统");
				return true;
			}else{
				System.out.println("登录失败，用户名或密码错误，是否重新登录(y:是/n:否):");
				choose=sc.next();
			}
		}while(choose.equals("y"));
		return false;
	}
}
