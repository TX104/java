package com.tencent.day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 动态数组
 * 特点:
 * 1、有序可以重复
 * 2、类型可以不相同(建议相同，使用泛型)
 * 3、动态长度
 * 4、内存地址的连续的
 * 5、查找效率很高
 * @author TangXin
 * 2018年7月26日
 */
public class ArrayListTest {
	
	public static void main(String[] args) {
		
		List list1=new ArrayList();		//上转型对象
		
		//添加元素
		list1.add("ab");
		list1.add("ba");
		list1.add(12);
		list1.add(12.5);
		list1.add(true);
		list1.add('c');
	
		//下标遍历
		for(int i=0;i<list1.size();i++){
			
			System.out.println(list1.get(i));
		}
		System.out.println("----------------------------");
		
		//foreach遍历
		for(Object obj:list1){
			
			System.out.println(obj);
		}
		System.out.println("-----------------------------");
		
		//迭代器遍历
		for(Iterator  iter=list1.iterator();iter.hasNext();){
			Object obj=iter.next();
			System.out.println(obj);
		}
		
		//使用泛型指定同种元素
		List<String> list2=new ArrayList<String>();
		list2.add("abc");
		list2.add("bac");
		list2.add("cba");
		list2.add("aaa");
		
		//下标遍历
		for(int i=0;i<list2.size();i++){
			String element=list2.get(i);
			System.out.println(element);
		}
		System.out.println("----------------------------");
				
		//foreach遍历
		for(String element:list2){
			System.out.println(element);
		}
		System.out.println("-----------------------------");
//				
		//迭代器遍历
		for(Iterator<String>  iter=list2.iterator();iter.hasNext();){
			String element=iter.next();
			System.out.println(element);
		}
	}

}
