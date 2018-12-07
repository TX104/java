package com.tencent.day03;
/**
 * 百元百鸡
 * 一百块钱要买一百只鸡，问公鸡多少只，母鸡多少只，小鸡多少只，每种鸡的都要买
 * 公鸡五元一只
 * 母鸡三元一只
 * 小鸡三只一元
 * x+y+z=100;
 * 5x+3y+z/3=100;
 * 
 * @author TangXin
 * 2018年7月11日
 */
public class For5 {

	public static void main(String[] args) {
		for(int x=1;x<20;x++){
			for(int y=1;y<33;y++){
				int z=100-x-y;
				if(5*x+3*y+z/3==100 && z%3==0){
					System.out.println("公鸡"+x+"只");
					System.out.println("母鸡"+y+"只");
					System.out.println("小鸡"+z+"只");
					System.out.println("================");
					
				}
			}
		}

	}

}
