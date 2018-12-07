package com.tencent.day10;

/**
 * 年龄异常类
 * @author TangXin
 * 2018年7月20日
 */
public class AgeException extends Exception{
	
	private String info;
	
	public AgeException(int age){
		info="您输入的"+age+"年龄超出范围，有异常!";
	}
	
	/**
	 * 重写异常信息方法
	 */
	@Override
	public void printStackTrace(){
		System.out.println(info);
		super.printStackTrace();
	}

	
}
