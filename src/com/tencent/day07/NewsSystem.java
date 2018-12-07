package com.tencent.day07;

import java.util.Scanner;

/**
 * 新闻系统
 * @author TangXin
 * 2018年7月17日
 */
	//alt+shift+r
public class NewsSystem {
	
	User user=new User();
	
	NewsType[] ntArray=new NewsType[5];//五个新闻类别
	
	/**
	 * 构造方法
	 */
	NewsSystem(){
		init();//初始化方法
	}
	/**
	 * 新闻系统的入口
	 * @author TangXin
	 * 2018年7月17日
	 */
	void portal(){
		init();
		Scanner sc=new Scanner(System.in);
		boolean state=user.login(sc);
		System.out.println(state);
		if(state){
			lookNews(sc);//查看新闻
		}
		sc.close();
	}
	
	/**
	 * 初始化方法
	 * @author TangXin
	 * 2018年7月17日
	 */
	void init(){
		user.username="admin";
		user.password="12306";
		user.name="赏金猎人";
		
		//
		NewsType nt1=new NewsType();
		nt1.code=1;
		nt1.name="国际新闻";
		
		News n1=new News();
		n1.title="习大大访美";
		n1.content="习大大去白宫与特朗普交谈，并吃了小龙虾";
		nt1.nArray[0]=n1;//
		
		News n2=new News();
		n2.title="特朗普访华";
		n2.content="特朗普与习大大在人民大会堂交谈，并吃了KFC";
		nt1.nArray[1]=n2;//
		
		ntArray[0]=nt1;//
		
		//
		NewsType nt2=new NewsType();
		nt2.code=2;
		nt2.name="国内新闻";
		
		News n3=new News();
		n3.title="阿里巴巴ceo马云来参观朝腾科技";
		n3.content="马云带领阿里巴巴技术团队，来朝腾交流大数据技术";
		nt2.nArray[0]=n3;//
		
		News n4=new News();
		n4.title="国务院总理李克强来朝腾推广大数据";
		n4.content="李克强与讲师盖世英雄交流大数据心得，并且学习了java";
		nt2.nArray[1]=n4;//
		
		ntArray[1]=nt2;
		
		NewsType nt3=new NewsType();
		nt3.code=3;
		nt3.name="体育新闻";
		
		News n5=new News();
		n5.title="朝腾科技前往杭州参观阿里巴巴总部";
		n5.content="讲师盖世英雄与阿里巴巴管人员相互交流经验";
		nt3.nArray[0]=n5;//
		
		News n6=new News();
		n6.title="盖世英雄，无畏早就奇迹";
		n6.content="无畏英雄，那是人们心中的一处梦";
		nt3.nArray[1]=n6;//
		
		ntArray[2]=nt3;
		
		NewsType nt4=new NewsType();
		nt4.code=4;
		nt4.name="娱乐新闻";
		
		News n7=new News();
		n7.title="恭喜RNG获取春季赛冠军";
		n7.content="RNG与EDG在最终决赛中以3:1战胜，获得冠军";
		nt4.nArray[0]=n7;//
		
		News n8=new News();
		n8.title="特朗普访华";
		n8.content="特朗普与习大大在人民大会堂交谈，并吃了KFC";
		nt4.nArray[1]=n8;//
		
		ntArray[3]=nt4;
		
		NewsType nt5=new NewsType();
		nt5.code=5;
		nt5.name="其他新闻";
		
		News n9=new News();
		n9.title="习大大访美";
		n9.content="习大大去白宫与特朗普交谈，并吃了小龙虾";
		nt5.nArray[0]=n9;//
		
		News n10=new News();
		n10.title="特朗普访华";
		n10.content="特朗普与习大大在人民大会堂交谈，并吃了KFC";
		nt5.nArray[1]=n10;//
		
		ntArray[4]=nt5;
	}
	
	/**
	 * 显示新闻类型
	 * @author TangXin
	 * 2018年7月17日
	 */
	void showNewsType(){
		System.out.println("************新闻列表**************");
		System.out.println("\t编号\t新闻类别");
		//
		for(NewsType nt:ntArray){
			System.out.println("\t"+nt.code+"\t"+nt.name);
		}
		System.out.println("*********************************");
	}
	
	/**
	 *查看新闻
	 * @author TangXin
	 * 2018年7月17日
	 */
	void lookNews(Scanner sc){
		String choose="y";
		do{
			showNewsType();
			System.out.println("请选择浏览类型编号:");
			int code=sc.nextInt();
			NewsType nt=ntArray[code-1];//根据编号从新闻类别数组中找到新闻类别
			News[] nArray=nt.nArray;//得到新闻数组
			for(News n:nArray){
				System.out.println(n.title);
				System.out.println("-----------------------------------");
				System.out.println(n.content);
//				System.out.println("\n");
				System.out.println();
				System.out.println();
			}
			System.out.println("您是否还要继续浏览（否n/是y）?");
			choose=sc.next();
		}while(choose.equals("y"));
		//显示新闻类型
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
