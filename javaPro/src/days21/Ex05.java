package days21;

import java.time.LocalDate;

public class Ex05 {

	public static void main(String[] args) {
		// plusXXX(), plus(), minusXXX(), minus()
		// 날짜 시간 비교 : isAfter(), isBefore(), isEquals()
		// 오늘이 생일이니
		// 1999.8.10
		// 2023.8.10
		
		LocalDate today = LocalDate.now();
		LocalDate birth = LocalDate.of(1999, 8, 1);  
		birth = birth.withYear(today.getYear());// birth 의 year를 오늘날짜 year로 변경
		System.out.println(birth);
		
		System.out.println( today.isBefore(birth));    //아직 생일이 안지남
		System.out.println( today.isEqual(birth));    //오늘이 생일
		System.out.println( today.isAfter(birth));    // 생일이 지남
		
		System.out.println(today.compareTo(birth) );   //양수(지남) 음수 0 
		
	} // main
 	
}//cls
