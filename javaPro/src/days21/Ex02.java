package days21;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author KL
 * @date 2023. 8. 10. - 오전 10:16:01
 * @subject 복습4번, 5번
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {

		/*4. java.time 패키지의 핵심 클래스
 1) 객체 생성하는 방법  - now(), of()
 2) 특정 필드를 얻어오는 방법 - get(필드) , getXXX()
 3) 특정 필드를 수정하는 방법 - with(), plus() , minus()
*/
		
		/*
		 * 5. 개강일(2023.7.13)로부터 100일 되는 날짜를 출력하세요. 
 			 1) Date 클래스 사용
 			 2) Calendar 클래스 사용
 			 3) LocalDate 클래스 사용
		 */
		
		/* Date 클래스 사용
		Date sday = new Date(2023-1900,7-1,13);
		sday.setDate( sday.getDate()+100) ;
		System.out.println(sday.toLocaleString());
		*/
		
		/* Calendar 클래스 사용
		Calendar c = new GregorianCalendar(2023,7-1,13);
		c.add(Calendar.DATE, 100);
		*/
		
		LocalDate ld = LocalDate.of(2023,7,13);   //LocalDate 변경 불가능 클래스
		System.out.println(ld);
		// ld.with(ld);     //새로운값으로 할당  현재날짜정보 읽어와 100을 더해 다시 with코딩 진행 필요
		//ld =ld.plusDays(100);
		ld= ld.plus(100, ChronoUnit.DAYS);
		System.out.println(ld);
		
	} // main

}
