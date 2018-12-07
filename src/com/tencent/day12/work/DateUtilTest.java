package com.tencent.day12.work;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 时间工具测试类
 * @author TangXin
 * 2018年7月26日
 */
public class DateUtilTest {

	public static void main(String[] args) {
		
		System.out.println(DateUtil.currentDate(DateUtil.DATE_LONG));
		
		Date date=DateUtil.stringToDate("2017-08-09",DateUtil.DATE_LONG);
		System.out.println(date);
		
		String strDate=DateUtil.dateToString(date, DateUtil.DATE_LONG);
		System.out.println(strDate);
		
		java.sql.Date sqlDate=DateUtil.stringToSqlDate("2017-08-09", DateUtil.DATE_LONG);
		System.out.println(sqlDate);
		
		
//		String strSqlDate=DateUtil.sqlDateToString(sqlDate, DateUtil.DATE_LONG);
//		System.out.println(strSqlDate);
		
//		Timestamp t=DateUtil.stringToTimestamp("2017-08-09");
//		System.out.println(t);
		
//		String strTimestamp=DateUtil.timestampToString(t, DateUtil.DATE_LONG);
//		System.out.println(strTimestamp);
		
		Date date1=DateUtil.getAddDate(new Date(), DateUtil.HOUR, -100);
		System.out.println(DateUtil.dateToString(date1, DateUtil.TIME_LONG));
		
		Date beginDate=DateUtil.stringToDate("2017-08-09",DateUtil.DATE_LONG);
		Date endDate=DateUtil.stringToDate("2019-08-09",DateUtil.DATE_LONG);
		System.out.println(DateUtil.compare(beginDate, endDate, DateUtil.MONTH));
		
		
		
		
		

	}

}
