package com.tencent.day10.work2;

/**
 * 
 * @author TangXin
 * 2018年7月20日
 */
public class Student {
	private int m;
	
	public void speak(int m) throws MyException{
		if(m>1000){
			MyException my=new MyException();
			throw my;
		}else{
			System.out.println("参数正常");
		}
	}
	
	public static void main(String[] args) {
		
		Student a=new Student();
		
		try{
			a.speak(8000);
		}catch(MyException e){
			e.printStackTrace();
		}finally{
			System.out.println("运行程序");
		}
	}
}
