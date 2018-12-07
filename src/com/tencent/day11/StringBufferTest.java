package com.tencent.day11;

/**
 * 测试字符串缓冲区
 * @author TangXin
 * 2018年7月24日
 */
public class StringBufferTest {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		sb.append("<font>");
		sb.append("哈哈");
		sb.append("</font>");
		System.out.println(sb.toString());
		
		//插入内容
		sb.insert(6, "<div>");
		sb.insert(13, "</div>");
		
		System.out.println(sb.toString());
		
		//删除哈哈	左闭右开
		sb.delete(11, 13);
		System.out.println(sb.toString());
		
		//删除某个字符
		sb.deleteCharAt(8);
		sb.deleteCharAt(13);
		System.out.println(sb.toString());

	}

}
