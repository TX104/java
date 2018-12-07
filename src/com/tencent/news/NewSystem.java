package com.tencent.news;

import java.util.Scanner;

/**
 * 新闻系统
 * @author TangXin
 * 2018年7月16日
 */
public class NewSystem {
	
	User user=new User();
	NewsCategory[] newsCates=new NewsCategory[5];
	
	/**
	 * 新闻系统入口
	 * @author TangXin
	 * 2018年7月16日
	 */
	void profit(){
		init();//初始化数据
		Scanner sc=new Scanner(System.in);
		//调用用户类的登录状态，返回登录状态
		boolean state=user.login(sc);
		String choose="y";
		if(state){
			//显示新闻列表
			do{
				showNews();
				showNewsContent(sc);
				System.out.println("您是否还要继续浏览(否n/是y)");
				choose=sc.next();
			}while(choose.equals("y"));
		}
		sc.close();
	}
	
	/**
	 * 初始化
	 * @author TangXin
	 * 2018年7月16日
	 */
	void init(){
		user.username="admin";
		user.password="123456";
		user.name="厄运小姐";
		
		//初始化新闻列表
		NewsCategory p1=new NewsCategory();
		p1.code=1;
		p1.newsCate="国际新闻";
		
		News x01=new News();
		x01.headline="\t习大大访美";
		x01.content="\t习大大访美\n\t习大大访美\n\t习大大访美\n\t习大大访美";
		News x02=new News();
		x02.headline="\t奥巴马访华";
		x02.content="\t奥巴马访华\n\t奥巴马访华\n\t奥巴马访华\n\t奥巴马访华";
		p1.newsArray[0]=x01;
		p1.newsArray[1]=x02;
		
		newsCates[0]=p1;
		
		NewsCategory p2=new NewsCategory();
		p2.code=2;
		p2.newsCate="国内新闻";
		
		News x11=new News();
		x11.headline="\t朝腾科技与阿里巴巴合作";
		x11.content="\t朝腾科技与阿里巴巴合作\n\t朝腾科技与阿里巴巴合作\n\t朝腾科技与阿里巴巴合作\n\t朝腾科技与阿里巴巴合作";
		News x12=new News();
		x12.headline="\t朝腾科技1703去谷歌上班";
		x12.content="\t朝腾科技1703去谷歌上班\n\t朝腾科技1703去谷歌上班\n\t朝腾科技1703去谷歌上班\n\t朝腾科技1703去谷歌上班";
		p2.newsArray[0]=x11;
		p2.newsArray[1]=x12;
		
		newsCates[1]=p2;
		
		NewsCategory p3=new NewsCategory();
		p3.code=3;
		p3.newsCate="体育新闻";
		
		News x21=new News();
		x21.headline="\t南昌朝腾";
		x21.content="\t习大大访美\n\t习大大访美\n\t习大大访美\n\t习大大访美";
		News x22=new News();
		x22.headline="\t谷歌朝腾";
		x22.content="\t习大大访美\n\t习大大访美\n\t习大大访美\n\t习大大访美";
		p3.newsArray[0]=x21;
		p3.newsArray[1]=x22;
		
		newsCates[2]=p3;
		
		NewsCategory p4=new NewsCategory();
		p4.code=4;
		p4.newsCate="娱乐新闻";
		newsCates[3]=p4;
		NewsCategory p5=new NewsCategory();
		p5.code=5;
		p5.newsCate="洽谈新闻";
		newsCates[4]=p5;
		
	}
	
	/**
	 * 
	 * 
	 * @author TangXin
	 * 2018年7月16日
	 */
	void showNews(){
		System.out.println("***********新闻列表**************");
		System.out.println("\t编号\t新闻类别");
		for(NewsCategory p:newsCates){
			System.out.println("\t"+p.code+"\t"+p.newsCate);
		}
		System.out.println("********************************");
	}
	
	
	boolean showNewsContent(Scanner sc){
		System.out.println("请您选择浏览新闻类别编号:");
		int code=sc.nextInt();
	
		System.out.println(newsCates[code-1].newsArray[0].headline);
		System.out.println("-----------------------------------");
		System.out.println(newsCates[code-1].newsArray[0].content);
		System.out.println("\n");
		System.out.println(newsCates[code-1].newsArray[1].headline);
		System.out.println("-----------------------------------");
		System.out.println(newsCates[code-1].newsArray[1].content);
		
		return true;
	}
	
}
