package com.tencent.day15;

import java.util.Date;
import java.util.Scanner;

/**
 * 
 * @author TangXin
 * 2018年7月28日
 */
public class Test {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		do{
			System.out.println("请输入购买电脑的类型(1.笔记本，2.台式机):");
			int type=sc.nextInt();
			Computer computer=null;
			switch(type){
				case 1:
					System.out.println("请您选择电池的类型(Intel与Lenovo):");
					String batteryName=sc.next();
					Battery a=new Battery(batteryName);
					computer=new NoteBook("T420d","lenovo",0,0,new Date(),a);
					flag=false;
					break;
				case 2:
					System.out.println("请您选择机箱的样式(立式与卧式):");
					String crateName=sc.next();
					Crate crate=new Crate(crateName);
					computer=new Desktop("K610D-i5","战神",3500,8,new Date(),crate);
					flag=false;
					break;
				default:
					computer=new Computer();
					flag=true;
					break;
			}
			computer.showInfo();
		}while(flag);
		
		sc.close();
	}

}
