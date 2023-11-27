package days16;
 
/**
 * @author KL
 * @date 2023. 8. 3. - 오전 11:21:29
 * @subject final 붙이는 경우
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
	
		// 1. 지역변수 -> 상수로 변경 시(final 키워드)
		final double PI = 3.141592;
		
		//FinalTest.I
		
		
		FinalTest obj = new FinalTest();
		System.out.println(obj.PI);
		
		//The final field FinalTest.PI cannot be assigned
		
		//obj.PI = 3.14; // 상수화되어져 있기 떄문에 다른 값으로 할당 불가능
		
	} // main
	
}//class

/*
class Parent{
	
	//함수 -> 자식들이 재정의 할 수 없는 최종 메서드
	final void dispA() {
		
	}
}

class Child extends Parent{
	
	
	//@Override
	//void dispA() {
		
	//}


}
*/

class FinalTest{
	//상수 필드
	//public static final double PI = 3.141592; // 명시적초기화
	// 상수화 + 객체 생성 X FinalTest.PI 사용 할 예정
	// static final - 기타제어자
	
	
	//The blank final field PI may not have been initialized
	//PI 초기화 해라
	final double PI;
	
	/*
	{// 인스턴스 초기화 블럭
		PI =3.14;
	}
	*/
	
	// 생성자 초기화
	public FinalTest() {
		PI = 3.14;
	}
	
	// int value 지역변수, 매개변수
	public void finalTest(final int value) {
		// 
		//
		// value 상수로 사용하겠다. 초기화 된 값만 사용 value++; 불가
		
	}
	
}