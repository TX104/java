package com.tencent.day10;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
	
	public static boolean checkNumString(String str){
		
		//把字符串转数字
		try{
			Integer.parseInt(str);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}

	public static void main(String[] args) {
		
		
		
		File file=new File("A:\\a.txt");
		//checkedException 检查性异常，必须用try catch捕获
		try {
			file.createNewFile();
		}catch(IOException e){
			System.out.println("aaaaaaaaaaaaaaa");
			//打印错误信息
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("bbbbbbbbbbbbbbb");
			//打印错误信息
			e.printStackTrace();
		}finally{
			//finally语句块，不管发布发生异常，一定会被执行
			System.out.println("我被执行了!");
		}
		
		int[] array=new int[2];
		
		try{
			array[2]=1;
		}catch(Exception e){
			e.printStackTrace();
			System.err.println("数组下标越界!");
		}
		//判断字符串是否为数字字符串
		System.out.println(checkNumString("1212"));
		
 
	}

}
