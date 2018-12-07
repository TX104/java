package com.tencent.other;

import com.tencent.day07.Authority;

/**
 * 
 * @author TangXin
 * 2018年7月17日
 */
public class AuthorityTest {
	
	public static void main(String[] args) {
		
		Authority author=new Authority();
		System.out.println(author.public_var);
		
//		System.out.println(author.protected_var);
//		System.out.println(author.default_var);		
//		System.out.println(author.private_var);
		
		author.publicMethod();
		
//		author.protectedMethod();
//		author.defaultMethod();	
//		author.privateMethod();
	}
}
