package days18;

public class Ex04 {

	public static void main(String[] args) {
		// Object.hashCode()메서드
		// 해시 - 해시함수 (해싱기법)
		//	ㄴ 데이터 관리 기법 중 하나
		// 	ㄴ 		"   	: 저장하고 검색
		// 	ㄴ 객체 저장 -> 객체가 저장된 위치(주소값) -> 해시코드로 변환 -> 변환된 값을 반환하는 메서드
		// 	ㄴ 싱글톤객체 - 해시코드가 같다 == 주소값이 같다 ==같은 인스턴스
		// 	[참고] 동일한 객체인지 체크 = equals() + hashCode() 오버라이딩
		//	ㄴ 
		
		/*String = 참조형 클래스
		String s1 = "홍길동";
		String s2 = "홍길동";
		// 하나를 두개에 참조중
		// 주소값을 대입, 홍길동도 대입되어있음
		// 클래스 복사 - 같은 인스턴스 참조중
		*/
		
		// 왜?
		// ㄴ String 클래스 타입이므로 밑에처럼 객체 생성하여 코딩
		// ㄴ 다른 인스턴스, 해시코드는 같은 값 -> 부모꺼 물려받아 오버라이딩 중 
		// 
		String s1= new String("홍길동");
		String s2= new String("홍길동");
		
		// 동일한 해시코드값
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	} // main
	
	
}//class
