package com.tencent.day11.work;

/**
 * 给字符串"abcd&&&&122axd###ef***ajexgb"内容分类，字母、数字、符号，并用三个数组接收
 * 
 * @author TangXin
 * 2018年7月24日
 */
public class Work44 {

	public static void main(String[] args) {
		
		String str="abcd&&&&122axd###ef***ajexgb";
		char[] ch=str.toCharArray();
		
		StringBuffer letter=new StringBuffer();
		StringBuffer numbel=new StringBuffer();
		StringBuffer sysmbol=new StringBuffer();
		for(int i=0;i<ch.length;i++){
			if((ch[i]>='a' && ch[i]<='z')||(ch[i]>='A' && ch[i]<='Z')){
				letter.append(ch[i]);
			}else if(ch[i]>='0' && ch[i]<='9'){
				numbel.append(ch[i]);
			}else if((int)ch[i]<=127){
				sysmbol.append(ch[i]);
			}
		}
		
		char[] letterArray=letter.toString().toCharArray();
		char[] numbelArray=numbel.toString().toCharArray();
		char[] sysmbolArray=sysmbol.toString().toCharArray();
		
		System.out.println(letterArray);
		System.out.println(numbelArray);
		System.out.println(sysmbolArray);
		
		for(char i:letterArray){
			System.out.println(i);
		}
		
		System.out.println("-------------");
		
		for(char i:numbelArray){
			System.out.println(i);
		}
		System.out.println("---------------------");
		
		for(char i:sysmbolArray){
			System.out.println(i);
		}
		System.out.println("--------------------");

	}

}
