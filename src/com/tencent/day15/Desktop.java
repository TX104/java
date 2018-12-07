package com.tencent.day15;

import java.util.Date;

/**
 * 台式机
 * @author TangXin
 * 2018年7月28日
 */
public class Desktop extends Computer{
	
	private Crate crate;
	
	public Desktop() {
		super();
	}
	public Desktop(String style, String company, float price, int memory, Date outDate,Crate crate) {
		//父类有参构造
		super(style,company,price,memory,outDate);
		this.crate=crate;
	}
	//@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("机箱样式:"+crate.getName());
	}
	

	
	public Crate getCrate() {
		return crate;
	}

	
	public void setCrate(Crate crate) {
		this.crate = crate;
	}

	
}
