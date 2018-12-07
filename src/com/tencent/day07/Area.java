package com.tencent.day07;

/**
 * 求面积
 * 
 * @author TangXin 2018年7月17日
 */
public class Area {

	/**
	 * 圆的面积
	 * 
	 * @param r
	 * @return
	 * @author TangXin 2018年7月17日
	 */
	double getArea(double r) {
		System.out.println("圆的面积:");
		double PI = 3.14;
		return (r * r * PI);
	}

	/**
	 * 方形的面积
	 * 
	 * @param a
	 * @param b
	 * @return
	 * @author TangXin 2018年7月17日
	 */
	int getArea(int a, int b) {
		System.out.println("方形面积:");
		return (a * b);
	}
	
	/**
	 * 三角形面积
	 * @param x
	 * @param h
	 * @return
	 * @author TangXin
	 * 2018年7月17日
	 */
	double getArea(double x,double h){
		System.out.println("三角形面积:");
		return ((x*h)/2);
	}
	
	/**
	 * 梯形的面积
	 * @param a
	 * @param b
	 * @param h
	 * @return
	 * @author TangXin
	 * 2018年7月17日
	 */
	double getArea(double a,double b,double h){
		System.out.println("梯形面积:");
		return (a+b)*h/2;
	}
	public static void main(String[] args) {
		Area area = new Area();
		double a = area.getArea(5.5,25.8,4.2);
		System.out.println(a);

	}
}














