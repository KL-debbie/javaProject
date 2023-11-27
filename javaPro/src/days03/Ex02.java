package days03;

import java.util.Calendar;

/**
 * @author KL
 * @date 2023. 7. 17. - 오전 11:45:30
 * @subject  conversion
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		 
		// System.out.printf("%d\n", "홍길동");
		// java.util.IllegalFormatConversionException: d != java.lang.String
		// 잘못된형식 컨버젼 d ==문자열 출력용 conversion이 아님
		
		
		Calendar c = Calendar.getInstance();
		System.out.printf("%1$tm %1$te %1$tY\n", c);    // 오늘 월 일 연도 출력
		
		// %[argument_index$][flags][width][.precision]conversion     => 기본형식,,,,
		// %                    [#, , ,0 , (] [자리수]               s,d,b,f,c,x,o 등...conversion에 해당
		
		
	System.out.printf("%1$c %1$C\n",  'a');    // a A   대소문자 구분**
	System.out.printf("%1$x %1$X\n",  30);
		
	System.out.printf("%(d\n", -123);  //(123)
	System.out.printf("%,d\n", 1255437); //1,255,437
	
		
	} //main

} //class
