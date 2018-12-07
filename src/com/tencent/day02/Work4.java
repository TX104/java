package com.tencent.day02;

/**
 * 作业4：求1~100之间不能被3整除的数之和
 * @author TangXin
 * 2018年7月11日
 */
public class Work4 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%3!=0){
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("1~100之间不能被3整除的数之和为:"+sum);

	}

}
