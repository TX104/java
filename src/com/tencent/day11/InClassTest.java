package com.tencent.day11;

/**
 * 测试内部类
 * @author TangXin
 * 2018年7月24日
 */
public class InClassTest {

	public static void main(String[] args) {
		
		InClass ic=new InClass();
		ic.sayHello("汉语");
		
//		ic.count(100);
		System.out.println(ic.count(100));
		
		InClass.StaticClss.hello();
		
		/**
		 * Father的子类
		 */
		//匿名内部类，开发效率高，不需要建文件创建子类，只能使用一次
		new Father(){

			@Override
			public void buildHouse() {
				
				System.out.println("马尔代夫建房子");
				
			}
			
		}.buildHouse();;
		
		/**
		 * 接口的匿名内部类
		 */
		new Car(){
			@Override
			public void run() {
				System.out.println("蹦蹦跳跳");
				
			}
			
		};
	}

}
