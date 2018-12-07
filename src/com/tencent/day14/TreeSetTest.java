package com.tencent.day14;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 测试TreeSet
 * 特点:
 * 1、元素是有序的，按自然元素排序
 * 2、元素不能重复
 * 3、没有下标
 * @author TangXin
 * 2018年7月27日
 */
public class TreeSetTest {

	public static void main(String[] args) {
		
		Set<String> s=new TreeSet<String>();
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
		
		Set<Integer> set1=new TreeSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(1);
		System.out.println("-----------------");
		for(int element:set1){
			System.out.println(element);
		}

	}

}
