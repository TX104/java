package com.tencent.day15;

/**
 * 测试手动回收对象
 * @author TangXin
 * 2018年7月28日
 */
public class Gc {
	
	/**
	 * 垃圾回收器调用此方法
	 */
	@Override
	protected void finalize() throws Throwable {
		System.out.println("不好了，要被回收了!");
	}
	public static void main(String[] args) {
		
		Gc gc=new Gc();
		gc=null;
		
		//手动回收
		System.gc();
		
	}

}
