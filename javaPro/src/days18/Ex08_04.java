package days18;

public class Ex08_04 {
	
	public static void main(String[] args) {

		String s = "안녕하세요. 홍길동입니다. 홍길도이고, 홍길둥입니다. 홍길.입니다.";
		//"홍길동" -> hong.gildong 으로 바꾸고 싶음
		// String regex 정규표현식
		//s=s.replaceFirst("홍길동", "hong.gildong");
		//첫번째에 해당하는 부분만 변경
		
		
		//1.
		//s.replaceAll("홍길동", "hong.gildong");
		// 모든 홍길동을 변경
		
		//문자열에서 "홍길" 한문자들은 영어로 변경
		
		//2.
		//s.replaceAll("홍길.", "hong-gil");
		// 모든 홍길이 바뀜
		// 모든 한문자- 홍길.뒤의 한문자
		
		//3.
		//홍길. 만 바꾸고싶음 \\ 붙이기
		// s= s.replaceAll("홍길\\.", "hong-gildong");

		//4.
		// s= s.replaceAll("홍길[가-힣].", "hong-gildong");
		//가-힣까지 아무 한문자 붙이기
		
		//5.
		//s= s.replace('홍', '강'); // char 매개변수
		// 한 문자를 바꾸기
		
		/*
		//6.  
		CharSequence target = new StringBuffer("홍길동"); // 
		// 왜 문자열? 인터페이스가 charsequence  ==> upcasting
		s=s.replace(target, "XYZ");
		*/
		
		System.out.println(s);
		 
		
	} // main

}//class
