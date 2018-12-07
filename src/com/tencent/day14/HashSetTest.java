package com.tencent.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 测试HashSet
 * 特点:
 * 1、元素是无序的，并且不可以重复
 * 2、没有下标
 * @author TangXin
 * 2018年7月27日
 */
public class HashSetTest {

	public static void main(String[] args) {
		
		Set<String> s=new HashSet<String>();
		s.add("g");
		s.add("a");
		s.add("z");
		s.add("9");
		s.add("z");
		s.add("7");
		s.add("a");
		
		//foreach遍历
		for(String element:s){
			System.out.println(element);
		}
		System.out.println("-----------------");
		//迭代器遍历
		for(Iterator<String> iter=s.iterator();iter.hasNext();){
			String element=iter.next();
			System.out.println(element);
		}
		System.out.println("------------排序-----------");
		
		//自然排序(ASCII排序)
		List<String> list=new ArrayList<String>();
		list.addAll(s);
		Collections.sort(list);	//顺序
		for(String element:list){
			System.out.println(element);
		}
		
		System.out.println("------------逆序------------");
		Collections.reverse(list);	//逆序
		for(String element:list){
			System.out.println(element);
		}
		
		System.out.println("-------------去重-----------");
		//给List去重
		List<String> list1=new ArrayList<String>();
		list1.add("1");
		list1.add("a");
		list1.add("2");
		list1.add("a");
		list1.add("1");
		list1.add("z");
		
		Set<String> t=new HashSet<String>();
		t.addAll(list1);
		list1.clear();
		list1.addAll(t);

		for(String element:t){
			System.out.println(element);
		}
		
		//
//		for(int i=0;i<list1.size();i++){
//			for(int j=0;j<list1.size();j++){
//				if(list.get(i)==list.get(j) && i!=j){
//					list.remove(i);
//				}
//				System.out.println(list.get(i));
//			}
//		}

	}

}
