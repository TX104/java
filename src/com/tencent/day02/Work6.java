package com.tencent.day02;

/**
 * 作业6：从1加到100，使用while、do while、for三种形式完成
 * @author TangXin
 * 2018年7月11日
 */
public class Work6 {

	public static void main(String[] args) {
		int a=1;
		int b=1;
		int c=1;
		int sum1=0;
		int sum2=0;
		int sum3=0;
		
		//while循环
		while(a<=100){
			sum1=sum1+a;
			a++;
		}
		System.out.println(sum1);
		
		//do...while
		do{
			sum2=sum2+b;
			b++;
		}while(b<=100);
		System.out.println(sum2);
		
		//for循环
		for(;c<=100;c++){
			sum3=sum3+c;
		}
		System.out.println(sum3);
	}

}
