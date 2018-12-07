package com.tencent.day09.work22;

/**
 * 对象的多态
 * @author TangXin
 * 2018年7月20日
 */
public class Test {

	public static void main(String[] args) {
		
		Traffic car=new Car("宝马");
		car.run();
		
		Traffic stemer=new Steamer("泰坦尼克号");
		stemer.run();
		
		Traffic train=new Train("和谐号");
		train.run();

	}

}
