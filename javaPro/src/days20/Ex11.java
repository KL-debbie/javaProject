package days20;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class Ex11 {
	
	public static void main(String[] args) {
		
		/*
		 * Date(jdk 1.0)
		 * Calendar(jdk 1.1)
		 * 
		 * jdk 1.8 새로 추가된 날짜,시간 클래스( java.time 패키지)
		 * 1. java.time 패키지 - 4개의 하위 패키지를 가지고 있음 : 날짜와 시간을 다루는 핵심 클래스들 제공
		 * 		ㄴ java.time.chrono : 표준(ISO)이 아닌 달력 시스템을 위한 클래스 제공**
		 * 		ㄴ java.time.format : 형식화( 파싱 ) 관련 클래스 제공
		 * 		ㄴ java.time.temporal : 날짜,시간의 필드(field)와 단위(unit) 클래스 제공
		 *		ㄴ java.time.zone : 시간대( time-zone )와 관련된 클래스 제공
		 *		ㄴ> Temporal, TemporalAdjuster 인터페이스 구현
		 *
		 * 2.  java.time 패키지 : 날짜와 시간을 다루는 핵심 클래스들 제공
		 * 		1) 날짜 : LocalDate클래스
		 * 		2) 시간 : LocalTime클래스
		 * 		3) 날짜 + 시간 : LocalDateTime클래스
		 * 		4) 날짜 + 시간 + 시간대 : ZonedDateTime클래스
		 * 
		 * 3.  new 연산자로 객체 생성을 하지 않음 -> now(), of() 메서드
		 * 
		 * 4.  날짜와 날짜 사이의 간격  : Period
		 * 		시간과 시간 사이의 간격  : Duration
		 * 		ㄴ TemporalAmount 인터페이스 구현
		 * 
		 * 
		 * 5.  날짜와 시간의 [단위]를 정의해 놓은 것이 
		 * 		ㄴ Temporal[Unit] 인터페이스 
		 * 		ㄴ 구현한 클래스 : ChronoUnit 클래스
		 * 
		 * 6.  년,월,일 등의 날짜와 시간의 [필드]를 정의해 놓은 것
		 * 		ㄴ Temporal[Field] 인터페이스
		 * 		ㄴ Chrono[Field] 구현한 클래스
		 * 	
		 * 7.  특정 필드(년,월,일,시간,분 ..등) 가져오기 할 때
		 * 		ㄴ getXXX() 메서드 존재   int getYear
		 * 		ㄴ get(필드)     - 필드 선언
		 * 	
		 * 8.  특정 필드 수정    : with(), plus(), minus()
		 * 		ㄴ Date d.setYear(???)
		 * 		ㄴ Calendar c;  c.set(Calendar.YEAR, ???)  roll()  add()
		 * 		ㄴ 
		 * 
		 * 
		 * 					--------- 시험 ---------
		 * 
		 * 
		 * 
		 * 
		 */	
		
		
	} // main

}//cls
