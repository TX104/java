package com.tencent.other;

import com.tencent.day07.Authority;

/**
 * 权限测试子类
 * @author TangXin
 * 2018年7月17日
 */
public class AuthoritySon extends Authority{
	
	public static void main(String[] args) {
		
		AuthoritySon author=new AuthoritySon();
		System.out.println(author.public_var);
		System.out.println(author.protected_var);
		
//		System.out.println(author.default_var);	
//		System.out.println(author.private_var);
		
		author.publicMethod();
		author.protectedMethod();
		
//		author.defaultMethod();		
//		author.privateMethod();
	}

}
