package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex06_02 {
	
	public static void main(String[] args) {
		// 2023. 8 달력
		Calendar c = new GregorianCalendar(2023,8-1,1);
		// 하루 전
		//c.set(Calendar.DATE,0); //2023-07-31
		//c.set(Calendar.DATE,-1); //2023-07-30
		// 원하는 날짜 셋팅
		// c.set(Calendar.DATE,10);
		// c.set(Calendar.DATE,32);  //
		
		/* 시험1******
		c.add(Calendar.DATE ,-1);  // 7.31 c날짜 :날짜 -1 감소
		c.add(Calendar.DATE ,1);//c날짜 : 날짜 1증가
		*/
		//for문
		
		/*
		c.roll(Calendar.DATE, 1);  // 
		c.roll(Calendar.DATE, -1);  // 날짜만 영향, 그 달의 마지막날짜
		*/
		
		System.out.println(Ex05.getPatternDate(c,"yyyy-MM-dd"));
			
		
	} // main

}//cls
