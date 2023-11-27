package days10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author KL
 * @date 2023. 7. 26. - 오전 10:32:04
 * @subject  함수 프로토타입(Prototype)  == 함수원형
 * @content
 */
public class Ex02 {
	
	public static void main(String[] args) {
		
		getTotalDays(2023,7,1);
	} // main

	private static int getDayOfWeek(int year, int month, int day) {
		// 날짜와 시간 기능(일,함수,메서드) 구현 된 클래스
		// java.util.Date, Calendar
		// jdk1.8  LocalDate(날짜), LocalTime(시간), LocalDateTime(날짜,시간 같이)
		
		LocalDate d = LocalDate.of(year, month, day);
		DayOfWeek w =d.getDayOfWeek(); //요일을 얻어옴
		//getValue ===> 1-월요일 2-화 3-수 --- 6-토 7-일요일
		return w.getValue()%7;
		
	}
	
	private static int getTotalDays(int year, int month, int day) {
		LocalDate startDate = LocalDate.of(1,1,1);
		LocalDate endDate = LocalDate.of(year,month,day);
		
		int totalDays = (int) startDate.until(endDate, ChronoUnit.DAYS)+1; // 시작날자부터 끝나는 날짜까지 일 수
		startDate.until(endDate, ChronoUnit.MONTHS); // 시작날자부터 끝나는 날짜까지 월 수
		startDate.until(endDate, ChronoUnit.YEARS); // 시작날자부터 끝나는 날짜까지 월 수
		
		return totalDays;
	}
	
	private static int getLastDay(int year, int month) {
		LocalDate d = LocalDate.of(year, month,1);
		LocalDate lastDate = d.withDayOfMonth(d.lengthOfMonth()); // 그 달의 길이 -> 날짜객채 ->?
		return lastDate.getDayOfMonth(); //마지막 날자 객체로 '일'만 얻어오겠음.
	}
}
