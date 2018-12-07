package com.tencent.day02;

/**
 * 作业3：使用switch完成
张三为他的手机设定了自动拨号
按1：拨爸爸的号
按2：拨妈妈的号
按3：拨爷爷的号	
按4：拨奶奶的号
 */
import java.util.Scanner;

public class Work3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入自动拨号号码:");
		int number=sc.nextInt();
		switch(number){
			case 1:
				System.out.println("拨爸爸的号");
				break;
			case 2:
				System.out.println("拨妈妈的号");
				break;
			case 3:
				System.out.println("拨爷爷的号");
				break;
			case 4:
				System.out.println("拨奶奶的号");
				break;
			default:
				System.out.println("您输入的号码有误!");
		}
		sc.close();

	}

}
