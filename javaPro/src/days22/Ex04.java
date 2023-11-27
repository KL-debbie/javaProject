package days22;

import java.time.LocalDateTime;

public class Ex04 {

	public static void main(String[] args) {
		/*  
		 java.time.LocalDateTime 클래스 사용******
		 1) 설문 시작일 : 23.8.10   9:00:00
	   	 2) 설문 종료일 : 23.8.15  18:00:00
	   지금 현재 설문 가능여부에 대해서 출력하세요.  ( 가능, 불가능 )
		*/
		LocalDateTime surveySD = LocalDateTime.of(23, 8, 10, 9, 0, 0);
		LocalDateTime surveyED = LocalDateTime.of(23, 8, 15, 18, 0, 0);
		
		LocalDateTime now = LocalDateTime.now();
		
		/*
		now.isAfter();
		now.isBefore();
		now.isEqual();
		now.compareTo();
		*/
		
		System.out.println(now.isAfter(surveyED));  //현재가 종료시점보다 지났는가
		/*
		 LocalDate a = LocalDateTime.of(2012, 6, 30, 12, 00);
   	   LocalDate b = LocalDateTime.of(2012, 7, 1, 12, 00);
	   a.isAfter(b) == false
	   **a.isAfter(a) == false     같은날짜는 지난것이 아님, 
	   b.isAfter(a) == true
		 */
		//설문시작 날짜보다 이전날짜?    //설문끝난 날짜보다 이후 날짜?
		if ( now.isBefore(surveySD) || now.isAfter(surveyED)  )
		System.out.println("투표기간 X");
		else
			System.out.println("투표기간 O");
		
		
	} // main
}
