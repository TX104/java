package com.tencent.day12;

/**
 * 数学算术
 * @author TangXin
 * 2018年7月25日
 */
public class MathTest {

	public static void main(String[] args) {
		
		//绝对值
		System.out.println(Math.abs(-12));
		//余弦
		System.out.println(Math.acos(0.9));
		//正弦
		System.out.println(Math.asin(0.9));
		//平方根
		System.out.println(Math.sqrt(5));
		//立方根
		System.out.println(Math.cbrt(27));
		//次方
		System.out.println(Math.pow(2, 3));
		//最大数
		System.out.println(Math.max(3, 2));
		//最小数
		System.out.println(Math.min(9, 6));
		
		double num=12.5;
		//四舍五入取整
		System.out.println(Math.round(num));
		//向上取整
		System.out.println(Math.ceil(num));
		//向下取整
		System.out.println(Math.floor(num));
		
		//随机数,0~1之间的小数，不包含0和1
		System.out.println(Math.random());
		
		//抽取指定位数的随机数
		System.out.println(getNum(10));
		

	}
	
	public static String getNum(int digit){
		if(digit<=0){
			return null;
		}
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<digit;i++){
			int num=(int)(Math.random()*10);
			sb.append(num);
		}
		
		return sb.toString();
	}

}
