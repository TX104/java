package com.tencent.day10.work2;

/**
 * 
 * @author TangXin
 * 2018年7月20日
 */
public class MyException extends Exception{
	

	@Override
	public void printStackTrace() {
		System.out.println("参数异常");
		super.printStackTrace();
	}

}
