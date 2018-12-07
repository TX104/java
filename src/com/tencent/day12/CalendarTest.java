package com.tencent.day12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 测试日历
 * @author TangXin
 * 2018年7月25日
 */
public class CalendarTest {

	public static void main(String[] args) {
		
		//当前时间日历
		Calendar c=Calendar.getInstance();
		//设置年份
		c.set(Calendar.YEAR, 2011);
		//月份从零开始
		c.set(Calendar.MONTH, 11);
		//日
		c.set(Calendar.DAY_OF_MONTH, 20);
		//设置小时，24小时制
		c.set(Calendar.HOUR_OF_DAY, 23);
		//分钟
		c.set(Calendar.MINUTE, 20);
		//秒
		c.set(Calendar.SECOND, 45);
		
		//星期
		c.set(Calendar.DAY_OF_WEEK, 2);
		
		//日期的加减
		//c.add(Calendar.YEAR, -10);
		//c.add(Calendar.MONTH, -24);
		//c.add(Calendar.DAY_OF_MONTH, 100);
		
		//获取年
		int year=c.get(Calendar.YEAR);
		System.out.println("年份为:"+year);
		
		//获取月
		int month=c.get(Calendar.MONTH)+1;
		System.out.println("月份为:"+month);
		
		//获取天
		int day=c.get(Calendar.DAY_OF_MONTH);
		System.out.println("天数为:"+day);
		
		//获取小时
		int hour=c.get(Calendar.HOUR_OF_DAY);
		System.out.println("小时为:"+hour);
		
		//获取分钟
		int minute=c.get(Calendar.MINUTE);
		System.out.println("分钟为:"+minute);
		
		//获取秒
		int second=c.get(Calendar.SECOND);
		System.out.println("秒数为:"+second);
		
		//获取星期，周日为1，所以要减1
		int week=c.get(Calendar.DAY_OF_WEEK_IN_MONTH)-1;
		System.out.println("星期为:"+week);
		
		
		System.out.println(c);
		
		//日历转date
		Date date=c.getTime();
		System.out.println(date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr=sdf.format(date);	//格式化
		System.out.println(dateStr);
		

	}

}
