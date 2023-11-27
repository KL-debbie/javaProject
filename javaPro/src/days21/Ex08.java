package days21;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex08 {
	
	public static void main(String[] args) {
		// 이번 달이 마지막 날짜가 몇 일까지 있는지 ?
		/*
		// 1. Date
		Date d = new Date();
		
		// 2. Calendar
		Calendar c = Calendar.getInstance();
		c.getActualMaximum(Calendar.DATE);
		*/
		
		// 3. LocalDate.parse함수
		/*
		// String source = "2009년 12월 30일";   // 예외발생
		String source = "2009-12-30";
		//String source = "2009/12/30"; 
		
		LocalDate   d= LocalDate.parse(source);
		System.out.println(d);
		*/
		
		/*
		LocalDate  today= LocalDate.now();
		LocalDate fday = today.withDayOfMonth(1);
		System.out.println(fday);
		System.out.println(today.lengthOfMonth());
		LocalDate lday = today.withDayOfMonth(today.lengthOfMonth());
		System.out.println(lday);
		*/
		
		LocalDate  today= LocalDate.now();
		LocalDate lday= today.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(lday);
		
		// TemporalAdjuster  ?
		
	} // main

}//cls
