package days19;

import java.util.Date;

public class Ex11 {
	
	public static void main(String[] args) {
		
		// 날짜와 시간 다루는 클래스 + 형식화(fommating)클래스
		// [ 일정관리 ]
		
		// jdk 1.0  java.util.Date
		// jdk 1.1  java.util.Calendar
		//				ㄴ GregorianCalendar 자식
		// jdk 1.8  java.time 패키지 안에 여러 하위 패키지와 다양한 클래스 추가
		
		Date d = new Date();
		
		//Tue Aug 08 15:37:21 KST 2023
		System.out.println(d);
		System.out.println(d.toGMTString());  
		//8 Aug 2023 06:38:09 GMT   그리니치 표준시, 세계표준시간(의 문자열)
		System.out.println(d.toLocaleString());  
		// 2023. 8. 8. 오후 3:40:10   지역 시간

		//년
		System.out.println(d.getYear() + 1900);
		//월 - 1월(0) ~~ 12월(11)
		System.out.println(d.getMonth()+1);
		//일
		System.out.println(d.getDate());
		//시간
		System.out.println(d.getHours());
		//분
		System.out.println(d.getMinutes());
		//초 0~61까지 정수를 돌림
		System.out.println(d.getSeconds());
		//밀리세컨드   1000ms = 1s ==> X
	
		//요일 Calendar.DAY_OF_WEEK   일요일(0) 월요일(1) ~~토요일(6)
		System.out.println(d.getDay());
		System.out.println( "일월화수목금토".charAt(d.getDay()) );
		
		
		// milliseconds since January 1, 1970, 00:00:00 GMT   long 형 형태******
		System.out.println( d.getTime() );   // 1691477466953 밀리세컨드 타임
		
		
		
	} // main

}//class
