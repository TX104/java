package com.tencent.day14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 测试Map
 * @author TangXin
 * 2018年7月27日
 */
public class MapTest {

	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		//添加元素
		map.put("a", 100);
		map.put("b", 80);
		map.put("c", 60);
		map.put("c", 50);
		
		//取值
		int value=map.get("a");
		System.out.println(value);
		
		//如果key重复，后面的值覆盖前面的值
		int cvalue=map.get("c");
		System.out.println(cvalue);
		
		//删除元素
		map.remove("c");
		
		//遍历Map，分两步
		//1、获取所有的key
		//2、根据key获取value
		
//		map.keySet();	//获取key的Set集合
		Set<String>  keys=map.keySet();	
		//遍历Set集合
		for(String key:keys){
			int value1=map.get(key);
			System.out.println("key值:"+key+" "+"value值:"+value1);
		}
		
		//直接获取所有的value
		Collection<Integer> values=map.values();
		for(int value1:values){
			System.out.println("value值:"+value1);
		}
		
		Map<String,Integer> tMap=new TreeMap<String,Integer>();
		tMap.put("c", 60);
		tMap.put("1", 80);
		tMap.put("a", 100);
		
		System.out.println("-----------------------");
		//
		Set<String> tkeys=tMap.keySet();
		
		for(String key:tkeys){
			int value1=tMap.get(key);
			System.out.println("key值:"+key+" "+"value值:"+value1);
		}
		
		//key与value都不能出现null，是线程安全的
		Map<String,Integer> tableMap=new Hashtable<String,Integer>();

		
		
		

	}

}
