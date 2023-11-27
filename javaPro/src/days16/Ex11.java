package days16;

/**
 * @author KL
 * @date 2023. 8. 3. - 오후 2:46:10
 * @subject
 * @content
 */
public class Ex11 {
	
	public static void main(String[] args) {
		
		// default 메서드
		// 시간 경과 IA 조상 인터페이스에 testXX() -> 추상메서드가 있었으면 한다.
		// 기본 기능 메서드 -> 오버라이딩 안해도 기능은 남아있음
		
		// 1) 여러 인터페이스를 구현하면 디폴트 메서드 (이름) 충돌
		// => 충돌나는 디폴트메서드 오버라이딩하면 해결
		// 2) 조상클래스의 메서드와 디폴드메서드 이름 충돌
		// => 충돌나는 디폴트메서드 무시가 된다.
		
		
	} // main

}//class

// testXX() 추가 못함
// 다른 자식클래스, 인터페이스에도 추가..?

interface IA{
	//3개 추상메서드
	default void testXX() {
		// 몸체 구현
	}
}
//IA 인터페이스 implements 클래스 200개

interface  IB extends IA{
	//3개 추상메서드
	//2개 추상메서드
}
//IB 인터페이스 implements 클래스 300개

interface  IC extends IB{
	//3개 추상메서드
	//2개 추상메서드
	//5개
}
//IC 인터페이스 implements 클래스 500개

interface  ID extends IC{
	//3개 추상메서드
	//2개 추상메서드
	//5개		"
	//13개		"
}
//ID 인터페이스 implements 클래스 1300개
