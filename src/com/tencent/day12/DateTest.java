package com.tencent.day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试时间
 * @author TangXin
 * 2018年7月25日
 */
public class DateTest {

	public static void main(String[] args) {
		//当前时间,操作系统时间
		Date date=new Date();
		System.out.println(date);  
		
		//格式化时间
		
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss SSS");
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//时间转字符串
		String dateStr=sdf.format(date);	//格式化
		System.out.println(dateStr);
		
		//字符串转时间
		Date d=null;
		try {
			d=sdf.parse("2011-12-21 11:34:58");
			System.out.println(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//获取毫秒数，毫秒数是从1970-01-01	00:00:00
		long time=date.getTime();
		System.out.println(time);
		System.out.println((time-d.getTime())/100/60/60/24);
		
		//毫秒数转时间
		Date dd=new Date(time);
		System.out.println(dd);
		
		//sqlDate创建
		java.sql.Date sqlDate=new java.sql.Date(time);
		System.out.println(sqlDate);
		
		//sqlTime创建
		java.sql.Time sqlTime=new java.sql.Time(time);
		System.out.println(sqlTime);
		
		//Timestamp创建
		java.sql.Timestamp timeStamp=new java.sql.Timestamp(time);
		System.out.println(timeStamp);
		
	}

}
