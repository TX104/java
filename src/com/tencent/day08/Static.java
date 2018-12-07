package com.tencent.day08;

public class Static {

		static User user=new User();
		
		String a="abc";//两个""代表静态常量，共享一片内存
		
		String b=new String("abcd");	//每次分配新的内存
		
		static{
			System.out.println("静态语句块");
		}
		
		{
			System.out.println("动态语句块");
		}
		
		public Static(){
			System.out.println("构造方法");
		}
		
		public static void show(){
			System.out.println("静态方法"+user);
			
		}
		
		public static void self(){
			show();
//			dynamic()	//静态方法不能调用动态方法
			
			
		}
		
		public void dynamic(){
			System.out.println("动态方法"+user);
			System.out.println("动态方法"+this.a);
//			show();		//动态方法能调用静态方法
		}
		
		public static void main(String[] args) {
//			Static s1=new Static();
//			System.out.println(s1);
//			System.out.println(Static.user);
//			System.out.println(s1.a);
//			System.out.println("================================");
//			Static s2=new Static();
//			System.out.println(s2);
//			System.out.println(Static.user);
//			System.out.println(s2.a);
//			
//			System.out.println(s1==s2);
//			System.out.println(s1.user==s2.user);
//			
//			System.out.println(s1.a==s2.a);//内存地址相同
//			
//			System.out.println(s1.b==s2.b);//内存地址不同
			
//			System.out.println(Static.user);
			self();
//			Static s=new Static();
//			Static ss=new Static();//动态语句块与构造方法与对象有关
			
//			s.dynamic();
			
		}
}
