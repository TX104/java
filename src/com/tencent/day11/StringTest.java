package com.tencent.day11;

/**
 * 测试字符串
 * @author TangXin
 * 2018年7月24日
 */
public class StringTest {

	public static void main(String[] args) {
		
		String s1="abc";
		
		String s2=new String("aBC");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		char[] ch={'a','b','c'};
		String s3=new String(ch);
		System.out.println(s1.equals(s3));
		
		String s4=new String();				//分配内存空间，但没有内容,默认为空串
		String s5=new String("");			//分配内存空间，内容为空串
		String s6=null;						//没有分配内存空间
		System.out.println(s4.equals(s5));	//
		
		//根据索引位置找到相应字符
		System.out.println(s1.charAt(1));
		
		//比较内容不区分大小写
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//大小写转换
		System.out.println(s1.toUpperCase());	//转大写
		System.out.println(s2.toLowerCase());   //转小写
		
		String s7="abc78443323ggwicdffigwe";
		
		//字符串长度
		System.out.println(s7.length());
		System.out.println(s7.charAt(s7.length()-1));
		
		//字符第一次出现的位置
		System.out.println(s7.indexOf(103));	//103在ASCII表中代表g
		System.out.println(s7.indexOf("wic"));
		
		//最后一次出现的位置
		System.out.println(s7.lastIndexOf("w"));
		System.out.println(s7.lastIndexOf(119));
		
		//判断字符串是否为空
		String s8="";
		System.out.println(s4.isEmpty());
		System.out.println(s5.isEmpty());
		System.out.println(s8.isEmpty());
		
		//替换字符串
		String s9=s7.replace("g", "X");
		System.out.println(s9);
		
		//截取字符串
		String s10=s9.substring(11, 14);
		System.out.println(s10);
		s10=s9.substring(11);	//从下标11开始，截取到尾部
		System.out.println(s10);
		
		//切割字符串
		String s11="abc,7844,3323,ggwi,cdff,igwe";
		
		String[] sArray=s11.split(",");
		for(int i=0;i<sArray.length;i++){
			System.out.print(sArray[i]+",");
		}
		System.out.println("");
		for(String s:sArray){
			System.out.print(s+",");
		}
		System.out.println("");
		
		String s22="abc|7844|3323|ggwi|cdff|igwe";
		String[] s1Array=s22.split("\\|");
		for(String s:s1Array){
			System.out.print(s+",");
		}
		System.out.println("");
		
		//字符串转数组 
		String s12="abcd";
		char[] chs=s12.toCharArray();
		
 		for(char s:chs){
			System.out.print(s+",");
		}
		System.out.println("");
		
		//字符串转字节
		byte[] data=s12.getBytes();
		for(byte s:data){
			System.out.print(s+",");
		}
		System.out.println("");
		
		byte[] dd={97,98,99,100};
		String s13=new String(dd);
		System.out.println(s13);
		
		//字符串拼接,会不断产生新的对象，分配新的空间
		//原因是: 字符串底层是字符数组，数组的长度是固定的，不可以增加新的内容
		String s14="<font>";
		s14+="哈哈";
		s14+="</font>";
		System.out.println(s14);
		s14+=1;	//字符串+任何类型=字符串
		System.out.println(s14);

	}

}
