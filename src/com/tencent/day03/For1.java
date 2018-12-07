package com.tencent.day03;
/**
 * for循环
 * @author TangXin
 * 2018年7月11日
 */
public class For1 {

	public static void main(String[] args) {
		int sum=0;
		int i=0;
		
		//表达式1省略不写
//		for(;i<=100;i++){
//			sum+=i;
//		}
		
		//表达式2省略不写
//		for(;;i++){
//			if(i>100){
//				break;//跳出循环
//			}
//			sum+=i;
//		}
		//表达式3省略不写
		for(;;){
			if(i>100){
				break;
			}
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		//for循环的死循环
//		for(;;){
//			System.out.println("=================");
//		}
	}

}
