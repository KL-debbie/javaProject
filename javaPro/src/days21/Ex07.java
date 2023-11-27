package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex07 {

	public static void main(String[] args) {
		/*
		//시간+날짜
		LocalDateTime dt = LocalDateTime.now();
		// 2023-08-10T11:19:58.544811400
		System.out.println(dt);
		
		// truncated 절삭(내림)
		// dt = dt.truncatedTo(ChronoUnit.HOURS);  // To(ChronoUnit.HOURS) 밑으로 절삭
		dt = dt.truncatedTo(ChronoUnit.DAYS);  // DAYS까지만 출력 그 이후는 절삭
		System.out.println(dt);
		*/
		
	
		/*
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		
		LocalDateTime dt = LocalDateTime.of(d, t);
		LocalDateTime dt4 = d.atTime(t);
		
		LocalDateTime dt2 =  d.atTime(t);  //존재하는 t를 받아 새로운 타임객체
		LocalDateTime dt3= t.atDate(d);
		System.out.println(dt4);
		*/
		
		
		LocalDateTime dt = LocalDateTime.now();
		//LocalDateTime -> LocalDate변환
		LocalDate d = dt.toLocalDate();
		//LocalDateTime -> LocalTime변환
		LocalTime t =  dt.toLocalTime();
		
		
		
		
		
	} // main
	
}
