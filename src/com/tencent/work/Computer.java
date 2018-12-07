package com.tencent.work;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 电脑销售系统
 * @author TangXin
 * 2018年7月27日
 */
public class Computer {
	
	//属性
	private String style;
	
	private int memory;
	
	private String company;
	
	private float price;
	
	private Date outdate;
	
	//无参构造
	public Computer(){
		
	}
	
	//有参构造
	public Computer(String company,float price,Date outdate){
	
		this.company=company;
		this.price=price;
		this.outdate=outdate;
	}
	
	//封装方法
	public String getStyle(){
		return this.style;
	}
	public void setStyle(String style){
		this.style=style;
	}
	
	public int getMomory(){
		return this.memory;
	}
	public void setMomory(int momory){
		this.memory=momory;
	}
	
	//普通方法
	public void showInfo(){
		
		try{
			if(this.price<0){
				this.price=4000;
			}
			if(this.memory<0){
				this.memory=128;
			}
			
			List<String> notebook=new ArrayList<String>();
			notebook.add("Intel");
			notebook.add("Lenovo");
			
			List<String> desktop=new ArrayList<String>();
			desktop.add("立式");
			desktop.add("卧式");
			
			System.out.println("型号:"+style);
			System.out.println("产商:"+company);
			System.out.println("价格:"+price);
			System.out.println("内存容量:"+memory);
			System.out.println("出厂日期:"+outdate);
			
			for(String obj:notebook){
				System.out.println(obj);
			}
			for(String obj:desktop){
				System.out.println(obj);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("成功运行");
		}
		
	}
	
}
