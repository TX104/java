package com.tencent.day03;

/**
 * 循环中使用break;
 * @author TangXin
 * 2018年7月11日
 */
public class For4 {

	public static void main(String[] args) {
		out:for(int i=1;i<=10;i++){
			System.out.println("i="+i);
			for(int j=1;j<=5;j++){
				System.out.println("j="+j);
				if(j==2){
					break out;
				}
			}
			System.out.println("");
			
		}
	}

}
