package com.tencent.day13;

import java.util.LinkedList;
import java.util.List;

/**
 * 链表
 * 特点:
 * 1、有序可以重复
 * 2、类型可以不相同(建议相同，使用泛型)
 * 3、动态长度
 * 4、内存地址不是连续的
 * 5、修改元素效率高(添加、修改、删除)
 * @author TangXin
 * 2018年7月26日
 */
public class LinkedListTest {

	public static void main(String[] args) {
		
		List<Integer> list=new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		//替换元素
		list.set(1, 200);
		System.out.println("------------替换------------");
		//foreach遍历(效率最高)
		for(int element:list){
			System.out.println(element);
		}
		
	
		//插入元素
		System.out.println("------------插入------------");
		list.add(1, 88);
		
		for(int element:list){
			System.out.println(element);
		}
	
		//删除
		list.remove(3);
		System.out.println("------------删除------------");
		for(int element:list){
			System.out.println(element);
		}

		//合并
		List<Integer> list2=new LinkedList<Integer>();
		
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		
		list.addAll(list2);
		System.out.println("------------合并------------");
		for(int element:list){
			System.out.println(element);
		}
	
		list.addAll(3,list2);
		System.out.println("------------插入合并------------");
		for(int element:list){
			System.out.println(element);
		}
		
		list.clear();
		System.out.println("-----------清空-----------------");
		for(int element:list){
			System.out.println(element);
		}
	}

}
