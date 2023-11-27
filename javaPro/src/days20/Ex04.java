package days20;

import java.time.chrono.ThaiBuddhistDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author KL
 * @date 2023. 8. 9. - 오전 11:29:45
 * @subject
 * 	/* 설문조사 기간이 
   시작일 2023.8.2    00:00:00
   종료일  2023.8.15  18:00:00
   일 때  오늘 현재 설문이 가능/불가능한지를 체크해서 출력하세요.
 * @content
 */
public class Ex04 {
	
	public static void main(String[] args) {
		// jdk 1.1  Calendar추상클래스 - 날짜,시간
		// Calendar c = new Calendar()  불가
		// Calendar c = new GregorianCalendar();
		//						 ㄴ BuddhistCalendar
		// 지역에 맞게 구현하여 사용해라- 추상클래스
		Calendar c =Calendar.getInstance(); // 내부적으로 그레고리언캘린더 객체 반환
	//	c.add(int field(날짜,월,년도,시간,분,초 변경), 숫자);  숫자 부분에 - 표시하여 빼기
		// c.clear(시간,분,초 등등);  == d2.setHours(0);
		
		// 년
		// Calendar.YEAR //상수 1을 가지고있음
		System.out.println(c.get(1));  // 2023
		System.out.println(c.get(Calendar.YEAR) ); //2023
		// 월
		System.out.println(c.get(2)+1 );  // 8
		System.out.println(c.get(Calendar.MONTH)+1 );  // 8
		// 일
		System.out.println(c.get(Calendar.DATE));  // 9
		System.out.println(c.get(Calendar.DAY_OF_MONTH));  // 9     // DAY_OF ; ~에서 며칠째인지
		// 시간
		System.out.println(c.get(Calendar.HOUR));  //12시간 기준(0~11)
		System.out.println(c.get(Calendar.HOUR_OF_DAY));  //24시간 기준(0~23시)
		// 분
		System.out.println(c.get(Calendar.MINUTE));
		// 초
		System.out.println(c.get(Calendar.SECOND));
		// 밀리세컨드
		System.out.println(c.get(Calendar.MILLISECOND));
		// 요일
		// Date 0(일)~6(토)
		// Calendar 1(일) 2(월) ~7(토)
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(c.get(Calendar.AM));
		System.out.println(c.get(Calendar.PM));
		
		System.out.println(c.get(Calendar.DAY_OF_YEAR));  // 올해 221일째
		
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));  //해당 월의 몇번째 주
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));  //해당 년도의 몇번째 주
		
	} // main

}//class
