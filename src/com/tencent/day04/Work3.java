package com.tencent.day04;

/**3.统计非法数字。
用户输入10个数字，其中1,2,3才是合法数字。
其他不合法。
打印出1，2，3分别的个数，和非法数字的个数。
 */
import java.util.Scanner;

public class Work3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array[]=new int[10];
		
		for(int i=0;i<array.length;i++){
			System.out.println("请输入第"+(i+1)+"个数字");
			array[i]=sc.nextInt();
		}
		int count1=0;
		int count2=0;
		int count3=0;
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+",");
			switch(array[i]){
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			case 3:
				count3++;
				break;
			default:
				break;
			}
//			int num=sc.nextInt();
//			int[] countArray=new int[10];
//			switch(num){
//			case 1:
//			case 2:
//			case 3:
//				countArray[num-1]++;
//				break;
//			default:
//				countArray[countArray.length-1]++;
				
//      	}
		}
		System.out.println("");
		System.out.println("1出现的个数:"+count1);
		System.out.println("2出现的个数"+count2);
		System.out.println("3出现的个数"+count3);
		System.out.println("非法数字的个数:"+(array.length-count1-count2-count3));
		
//		for(int i=0;i<countArray.length;i++){
//			if(i==countArray.length-1){
//				System.out.println("非法数字个数"+countArray[i]);
//			}else{
//				System.out.println("数字"+(i+1)+"个数"+countArray[i]);
//			}
//		}
		sc.close();

	}

}
