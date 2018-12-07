package com.tencent.day15;

import java.util.Date;

/**
 * 笔记本
 * @author TangXin
 * 2018年7月28日
 */
public class NoteBook extends Computer{
	
	//电池
	private Battery battery;
	
	
	public NoteBook() {
		
	}
	public NoteBook(String style, String company, float price, int memory, Date outDate,Battery battery) {
		//父类有参构造
		super(style,company,price,memory,outDate);
		this.battery=battery;
		
	}
	
	@Override
	//重写父类的显示信息方法
	public void showInfo() {
		super.showInfo();
		System.out.println("电池类型:"+battery.getName());
	}
	
	//封装
	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	
	
}
