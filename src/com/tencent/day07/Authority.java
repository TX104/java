package com.tencent.day07;

/**
 * 访问权限
 * @author TangXin
 * 2018年7月17日
 */
public class Authority {
	
	public int public_var;
	
	protected int protected_var;
	
	int default_var;
	
	private int private_var;
	
	
	public void publicMethod(){
		System.out.println("=========公共方法============");
	}
	
	protected void protectedMethod(){
		System.out.println("=========受保护方法============");
	}
	
	void defaultMethod(){
		System.out.println("=========默认方法============");
	}
	
	private void privateMethod(){
		System.out.println("=========私有方法============");
	}
	
	public static void main(String[] args) {
		Authority author=new Authority();
		
		System.out.println(author.public_var);
		System.out.println(author.protected_var);
		System.out.println(author.default_var);
		System.out.println(author.private_var);
		
		author.publicMethod();
		author.protectedMethod();
		author.defaultMethod();
		author.privateMethod();
		
		
	}
	
}
