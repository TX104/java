package com.tencent.day05;

public class VariableTest {
	//声明对象，并没有分配内存空间，因为没有new
	static Variable var=new Variable();
	
	public static void main(String[] args) {
		//对象没有被创建时，打印null
		//对象已创建，打印包名+@+内存地址(指针)
		System.out.println(var);
		var.init();
		
		
		//局部变量方法
		var.part();

	}

}
