package com.tencent.work;

import java.util.Date;

public class Test{
	
	public static void main(String[] args) {
		
		Date date=new Date();
		
		Computer s1=new Computer("神舟",6520,date);
		s1.setStyle("i7");
		s1.setMomory(4);
		
		s1.showInfo();
		
	}
}
