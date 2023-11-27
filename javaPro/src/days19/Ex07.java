package days19;

public class Ex07 {
	
	public static void main(String[] args) {
		
		// [ 오토박싱(boxing) 과 오토언박싱(unboxing) ]
		// 오토박싱(boxing) : 박싱 자동
		
		int i =100;  	// 정수 저장 변수
		Integer j = i;   //  클래스 타입의 객체
		// 기본형(i) -> 객체(j) 변환  --> 오토박싱
		// 기본형이 객체 타입으로 변환되는 작업
		// 형변환 없이 됨
		
		int k = j;
		// 객체 (j) -> 기본형(k) 변환 --> 오토언박싱
		// 객체가 기본형으로 변환되는 작업
		
		// JDK 1.5 이전에서
		// Integer k = new Integer(i);
		
		test(i);   // int(기본형) -> Interger 박싱 -> Object로 업캐스팅
		test(3.14);
		test(1L);
		test(true);
		test(j);  // Integer(래퍼클래스)  
		test("홍길동"); //업캐스팅
		
		
		
	} // main

	private static void test(Object i) {       // Object --> 모든 자료형을 매개변수로 받아서 처리, 모든 클래스의 부모클래스이므로((업캐스팅), 
															//기본형은 왜 받아지는가?  기본형이 객체(래퍼클래스)로 오토박싱 --> 부모클래스로 업캐스팅 되기 때문
		System.out.println( i );
		}
	
	/*
	private static void test(int i) {       // Integer -> int 형변환 ( 오토언박싱 ) 되어 오류나지 않음.
	System.out.println( i );
	}
	*/

}//class
