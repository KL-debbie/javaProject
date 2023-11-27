package days21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex11 {
	
	public static void main(String[] args) {
		
		//DateTimeFormatter 형식화 클래스
		// java.time 패키지 안 핵심 클래스 
		// 문자열 -> 파싱 -> 핵심클래스
		//		  <- 포맷 <- 
		// 			DateTimeFormatter 형식화 클래스
		
		
		// implements Temporal extends TemporalAccessor
		LocalDateTime dt = LocalDateTime.now();
		// 2023-08-10T14:04:38.260954200
		System.out.println(dt);
		
		// 2023/08/10 요일 시간:분:초.밀리세컨드  <- 출력형식
		// DateTimeFormatter dtf = new
		// DateTimeFormatter new연산자 생성 X
		String pattern = "yyyy/MM/dd  E요일 hh:mm:ss.SSS";  // 밀리세컨트 S사용
		DateTimeFormatter dtf = DateTimeFormatter .ofPattern(pattern);
		
		String output = dtf.format(dt); //
		System.out.println(output);
		
		
	} // main

}
