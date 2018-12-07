package com.tencent.day08.work;

/**
 * 計算器
 * @author TangXin
 * 2018年7月18日
 */
public class Computer {
	
	public int addition(int num1,int num2,String operator){
		int sum=0;
		//
		switch(operator){
			case "+":
				sum=num1+num2;
				break;
			case "-":
				sum=num1-num2;
				break;
			case "*":
				sum=num1*num2;
				break;
			case "/":
				sum=num1-num2;
				break;
		}
		return sum;
	}
	
	public double addition(double num1,double num2,String operator){
		double sum=0.0;
		//
		switch(operator){
		case "+":
			sum=num1+num2;
			break;
		case "-":
			sum=num1-num2;
			break;
		case "*":
			sum=num1*num2;
			break;
		case "/":
			sum=num1-num2;
			break;
		}
		return sum;
	}
	
	
 
	public static void main(String[] args) {
		
	Computer a=new Computer();
	int code=a.addition(2, 1, "-");
	System.out.println(code);
	
	double coat=a.addition(2.6, 3.5, "*");
	System.out.println(coat);
	
	
	
	}

}
