package days19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10 {
	
	public static void main(String[] args) {
		
		// 정규 표현식(Regular Expression) == 정규식
		//	String			regex
		// - 문자열 속에 원하는 조건(패턴)과 일치하는 문자열을 찾아내기 위해서 사용됨.
		// - 미리 정의된 기호가 있음
		// - 자바에서는 정규표현식과 관련 클래스가 2개밖에 없다.
		// 		ㄴ String.matches(regex)  //matches 함수
		//	1) Pattern 클래스
		//	2) Matcher 클래스
	
		String [] data = {"bat","baby","bonus","cA","ca","co", "c.", "c0", "car"
                , "combat", "count", "date", "disc", "fx"};
		
		// 1) data 배열에 들어가있는 단어들 중 c로 시작하는 단어를 모두 찾아서 출력
		// ㄴ data[i].startsWith("c")    // 문자열 함수 startsWith -
		// ㄴ data[i].matches(regex)
		
		// String regex= "c.*";   // . 아무 문자가 와도 안와도 
		// String regex = "c[a-zA-Z]*"; // c 시작 + 영문자 0개 이상
		// String regex = "c[a-z]*"; // c 시작 + 소문자 1개 ==> 두 문자로 이루어짐   "ca","co"
		
		// String regex = "c\\w";  // \w
		// String regex = "c[a-zA-Z0-9]"; // ==  'c\\w'  두문자
		
		// String regex = ".*";   // (  .  ) ==> 모든 문자 문자로 이루어진것 모두 출력
		// String regex = "c.*t";   // c로 시작 끝은 t로 끝나는 모든 문자  "combat", "count"
		// String regex = "c[0-9]";   //  == c\\d   "c0"
		// String regex = "c\\D";   //  == c[^0-9]  첫 문자는 c, 두번째 문자는 숫자가 아니어야함   (^- 부정)  
		
		// String regex = "(b|c).*";   //  b가 오던지 c가 오던지
		// String regex = "[bc].*";   //  b가 오던지 c가 오던지
		// String regex = "(b|c)";   //  b가 오던지 c가 오던지
		
		// String regex = "[bcd].*";   //   b~d까지
		// String regex = "[b-d].*";   //    b~d까지
		// String regex = "[bcd].{2}";   // == b~d가 두개
		// String regex = "[bcd].{23}";   // == b~d가 두개 또는 세개  이상
		// String regex = "[bcd].+";   // == b~d가 1개 이상
		// String regex = "[bcd].?+";   // == b~d가 1개 또는 0개
		
		
		String regex = "[a-zA-Z&&[^b-d]].*";   // b,c,d 제외한 알파벳 대소문자 + 모든 문자 0~여러개
		
		
		//   \\s- 공백 O    \\S -공백이 X
		
		
		
		Pattern p = Pattern.compile(regex);	// 정규표현식 객체
		
		
		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher( data[i] );
				if(m.matches()) {
				System.out.println(data[i]);
			}
		} // for
		
	} // main

}//class
