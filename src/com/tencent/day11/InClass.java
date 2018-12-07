package com.tencent.day11;

/**
 * 内部类
 * @author TangXin
 * 2018年7月24日
 */
public class InClass {
	
	private HelloWorld hw=new HelloWorld();
	
	
	
	public void sayHello(String language){
		hw.sayHello(language);
	}
	
	public int count(int num){
		
		/**
		 * 局部内部类
		 * @author TangXin
		 * 2018年7月24日
		 */
		class Computer{
			public int calculate(){
				int sum=0;
				for(int i=0;i<=num;i++){
					sum+=i;
				}
				return sum;
			}
		}
//		匿名对象，对象只用一次
//		new computer();
		return new Computer().calculate();
	}
	
	/**
	 * 成员内部类
	 * @author TangXin
	 * 2018年7月24日
	 */
	private class HelloWorld {
		public void sayHello(String language){
			System.out.println("hello world!"+language);
		}
	}
	
	/**
	 * 静态内部类
	 * @author TangXin
	 * 2018年7月24日
	 */
	static class StaticClss{
		
		public static void hello(){
			System.out.println("你好，静态内部类!");
		}
	}
}
