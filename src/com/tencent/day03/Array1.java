package com.tencent.day03;

public class Array1 {

	public static void main(String[] args) {
		int[] array1=new int[10];
		int[] array2={1,2,3,4,5};
		int[] array3=new int[]{10,20,30,40,50};
		String[] StrArray={"ab","aa","ac"};
		boolean[] array5=new boolean[5];
		byte[] array6=new byte[6];
		double[] array7=new double[5];
		
		//给元素赋值
		array1[0]=21;
		array2[0]=121;
		array3[0]=212;
		StrArray[0]="ad";
		array5[0]=true;
		
		
		//取数组元素，使用下标获取,下标从0开始
		System.out.println(array1[0]);
		System.out.println(array2[0]);
		System.out.println(array3[0]);
		System.out.println(StrArray[0]);
		System.out.println(array5[0]);
		System.out.println(array6[0]);
		System.out.println(array7[0]);
		
		System.out.println("==============");
		//获取数组的长度
		System.out.println(array1.length);
		System.out.println(array2.length);
		System.out.println(array3.length);
		System.out.println(StrArray.length);
		System.out.println(array5.length);
		System.out.println(array6.length);
		System.out.println(array7.length);
		
		//数组下标越界异常：java.lang. ArrayIndexOutOfBoundsException	
		array1[10]=125;
	}

}
