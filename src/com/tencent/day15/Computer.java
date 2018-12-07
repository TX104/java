package com.tencent.day15;

import java.util.Date;

/**
 * 电脑类
 * @author TangXin
 * 2018年7月28日
 */
public class Computer {
	
	private String style;
	
	private String company;
	
	private float price;
	
	private int memory;
	
	private Date outDate;

	public Computer() {
		
	}

	public Computer(String company, float price, Date outDate) {
		this.company = company;
		this.price = price;
		this.outDate = outDate;
	}
	
	
	public Computer(String style, String company, float price, int memory, Date outDate) {
		this.style = style;
		this.company = company;
		this.price = price;
		this.memory = memory;
		this.outDate = outDate;
	}
	
	/**
	 * 显示信息的方法
	 * @author TangXin
	 * 2018年7月28日
	 */
	public void showInfo(){
		
		if(style==null && company==null && price==0 && memory==0 && outDate==null){
			System.out.println("您购买的电脑类型不存在,请重新输入:");
			return ;
		}
		if(price<0){
			price=4000;
		}
		if(memory<0){
			memory=128;
		}
		System.out.println("型号:"+style);
		System.out.println("厂商:"+company);
		System.out.println("价格:"+price);
		System.out.println("内存大小:"+memory);
		String dateStr=DateUtil.dateToString(outDate, DateUtil.DATE_LONG);
		System.out.println("出厂日期:"+dateStr);
	}
	

	//封装
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public Date getOutDate() {
		return outDate;
	}

	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}
	
}
