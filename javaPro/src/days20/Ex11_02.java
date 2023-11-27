package days20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex11_02 {

	public static void main(String[] args) {
		
		//java.time. 핵심클래스
		
		/*
		LocalDate ld =  LocalDate.now();
		//오버라이딩
		System.out.println(ld.toString());  //2023-08-09
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt.toString()); //15:49:16.856299  나노세컨드까지
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.toString());
		*/
		
		//of() 메서드로 java.time.핵심클래스 객체 생성
		LocalDate ld = LocalDate.of(2015, 11, 23);
		System.out.println(ld);
		
		LocalTime lt = LocalTime.of(3,20,11);
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);
	} // main
}//cls
