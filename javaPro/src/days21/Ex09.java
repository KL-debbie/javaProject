package days21;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.TemporalAdjusters.*;

import static java.time.DayOfWeek.*;

public class Ex09 {
	
	
	public static void main(String[] args) {
		// TemporalAdjuster  클래스
		// 날짜와 시간 --> 변경,수정  with(), withXXX(), plusXXX(), plus(), minusXXX(), minus()
		// 자주 사용되는 시간, 날짜 변경하는 메서드들을 미리 구현 해 놓은 클래스
		// 예 ) 다음 년도의 첫 날
		//		다음 달의 첫 날
		//		올 해의 첫 날
		//		이번 달의 첫 날
		//		올 해의 마지막 날
		//		**이번 달의 마지막 날**  lastDayOfMonth()
		//		다음 ?요일이 언제
		//		지난 ?요일
		//		이번 달 n 번째 ? 요일
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		// 다음 달의 첫날
		System.out.println(d.with(firstDayOfNextMonth()));
		// 이번 달의 첫 날
		System.out.println(d.with(firstDayOfMonth()));
		// 이번 달의 첫 번째 월요일
		System.out.println(d.with(TemporalAdjusters.firstInMonth(MONDAY)));
		//지난 주 화요일(오늘 포함X)
		System.out.println(d.with(TemporalAdjusters.previous(TUESDAY)));
		// OrSmae 오늘 포함 화요일
		System.out.println(d.with(TemporalAdjusters.previousOrSame(TUESDAY)));
		// 다음 주 금요일
		System.out.println(d.with(TemporalAdjusters.next(FRIDAY)));
		// OrSmae 오늘 포함 금요일
		System.out.println(d.with(TemporalAdjusters.nextOrSame(FRIDAY)));
		
		// 이번 달의 번째 화요일
		System.out.println(d.with(TemporalAdjusters.dayOfWeekInMonth(4, TUESDAY)));
		
		// 3일 뒤 
		// d = d.plusDays(3);
		System.out.println(d);
		d= d.with( new DayAfter3일() );
		
		
	} // main
}//cls

class DayAfter3일 implements TemporalAdjuster{

	@Override
	public Temporal adjustInto(Temporal temporal) {
		
		return temporal.plus(3, ChronoUnit.DAYS);
	}
	
}