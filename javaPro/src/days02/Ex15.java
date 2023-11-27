package days02;

/**
 * @author KL
 * @date 2023. 7. 14. - 오후 3:51:48
 * @subject  형변환 같은 자료끼리도 변환
 * @content
 */

public class Ex15 {

	public static void main(String[] args) {
		
		byte age =20;
		// String <-> byte로 형 변환
		// "20" <-> 20 으로 형변환
		// byte age = "20";
		int i = Integer.MAX_VALUE; // 2147483647; // int 자료형의 가장 큰 값을 대입.
		// 기본형(int) -> 물건(객체, object, 클래스) : 래퍼클래스(Wrapper Class) 사용하기 쉽도록 만들어 놓음
		// Integer
		int j = Integer.parseInt("20");
		
		
		
		// String -> byte 형변환
		age = Byte.parseByte( "20" ); //byte - 기본형, Byte- 래퍼클래스
				// 문자열 20을 숫자 20으로 바꿔줌
				
		

	}

}
