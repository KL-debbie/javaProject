package days21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex10 {
	
	public static void main(String[] args) {
		
		// 개강일 + 100일
		// 수료일 ~ 오늘날짜 차이
		// 날짜와 날짜 사이 간격(차) : Period
		// 시간과 시간 사이 간격(차) : Duration
		
		// between() ==  until()
		// between - static 메서드(객체 생성 필요 X)
		// until -인스턴스 메서드(객체 생성 필요)
		
		// of() - , with() - 값 변경
		// plus(), minus() 등등 메서드
		
		// 개강일
		LocalDate s = LocalDate.of(2023, 7, 13);
		// 오늘 날짜
		LocalDate t =LocalDate.now();
		t= t.plusDays(1);
		
		// 날짜 차 Period
		// Period p = Period.between(s, t);   // 오늘까지 포함하지 않음
		Period p = Period.between(s, t);   // t.plusDays(1)==> 오늘까지 포함  두날짜 차이 객체 생성
		
		int year = p.getYears();
		System.out.println(year);
		
		long month= p.get(ChronoUnit.MONTHS);
		System.out.println(month);
		
		long day = p.getDays();
		System.out.println(day);
		
		// 시간 차 Duration
		LocalTime st = LocalTime.of(9, 0, 0);  //시작시간
		LocalTime tt = LocalTime.now();  // 현재시간
		Duration d = Duration.between(st, tt);
		
		// 시간 차
		long ss = d.getSeconds();
		/*
		System.out.println(ss);  //전체 차이만큼 초
		System.out.println(ss/60);//전체 차이만큼 분
		System.out.println(ss/(60*60));//시간
		*/
		
		// long h = d.get(ChronoUnit.HOURS);  // .UnsupportedTemporalTypeException: Unsupported unit: Hours
		// 지원하지 않음 
		// System.out.println(h);
		
		
		
		
	} // main

}//cls
