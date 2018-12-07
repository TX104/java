package com.tencent.day10;

/**
 * 测试try
 * @author TangXin
 * 2018年7月20日
 */
public class TryTest {
	
	/**
	 * 只认最后一次的return
	 * @param num
	 * @return
	 * @author TangXin
	 * 2018年7月20日
	 */
	public static int count(int num){
		
		
		try{
			num++;
			Integer.parseInt("aaaa");//异常
			//程序退出
			System.exit(0);
			System.out.println("aaa");
			return num;
		}catch(Exception e){
			num++;
			System.out.println("bbb");
			return num;
		}finally{
			num++;
			System.out.println("ccc");
			return num;
		}
		
	}
	//只认第一个return出去的东西

	public static void main(String[] args) {
		
		System.out.println(count(100));
		
		int num=100;
		try{
			num++;
			System.out.println("aaa");
		}catch(Exception e){
			num++;
			System.out.println("bbb");
		}finally{
			num++;
			System.out.println("ccc");
		}
		System.out.println(num);
	}

}
