package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex05_02 {
	
	public static void main(String[] args) {
		
		//날짜 시간정보를 사용자가 원하는 형식으로 출력 방법
		// SimpleDateFormat 형식화 클래스
		// 간단하게 날짜 형식화
		String pattern = "yyyy. MM. dd. a hh:mm:ss" ; //4자리 연도.MM(월).일 am 시간:분:초
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		/*Date Class
		Date today = new Date(); // Calender 객체를 가지는 format 없음
		String strToday= sdf.format(today);
		System.out.println(strToday); //2023. 08. 09. 오후 12:18:08
		*/
		
		Calendar c = Calendar.getInstance();
		// Calendar -> Date 형 변환 후에 format형식 사용 가능
		
		// 1)  Date today = new Date(c.getTimeInMillis());
		/* 2) 
		Date today = c.getTime();
		String strToday= sdf.format(today);
		System.out.println(strToday);
		*/
		
		
	} // main

}
