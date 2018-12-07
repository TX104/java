package com.tencent.day11;

/**
 * 儿子类
 * @author TangXin
 * 2018年7月24日
 */
public class Son {
	
	private Father fc=new FatherChild();
	
	private Mother mc=new MotherChild();
	
	public void bulidHouse(){
		fc.buildHouse();
	}
	
	public void travel(){
		mc.travel();
	}
	
}

class FatherChild extends Father{

	@Override
	public void buildHouse() {
		System.out.println("在三亚建立海景别墅");
		
	}
	
}

class MotherChild extends Mother{

	@Override
	public void travel() {
		System.out.println("去三亚旅游");
		
	}
	
}