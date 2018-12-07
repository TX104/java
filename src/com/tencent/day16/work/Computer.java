package com.tencent.day16.work;

/**
 * 2.求  1+2-3+4-5+6.....+100  
 * @author TangXin
 * 2018年7月30日
 */
public class Computer {

	public static void main(String[] args) {
		
		int sum=1;
		for(int i=2;i<=100;i++){
			if(i%2==0){
				sum+=i;
			}else{
				sum-=i;
			}
		}
		System.out.println(sum);

	}

}
