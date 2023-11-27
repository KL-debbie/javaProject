package days15;

import java.io.IOException;

/**
 * @author KL
 * @date 2023. 8. 2. - 오후 12:29:57
 * @subject 					
 * @content
 */
public class Ex05 {
	
	public static void main(String[] args) {
		
		// 단일 상속
		
		
		// 다중 상속- 자바 지원X  --> [인터페이스] 가 대신, 다중상속처럼 구현 가능
		/* class Tv{ int power; }
		 * class VCR{ int power; }
		 * 
		 * class TVCR extends Tv, VCR {    // Tv + VCR  두개의 클래스 상속
		 *  같은 멤버변수가 있을 경우가 있어서 사용 X
		 *  
		 * }
		 */
		
		/* [ 오버라이딩 ]
		 *  1. 정의 :  부모클래스로부터 상속 받은 메서드를 재정의 하는 것.
		 *  2. override 사전적 의미 == overwrite == 위에 덮어 쓰다.
		 *  3. 오버라이딩 주의사항
		 *  	1) 메서드명 수정 X
		 *  	2) 매개변수 동일
		 *  	3) 리턴타입 동일
		 *  	4) 접근지정자는 부모의 접근지정자 범위보다 같거나 넓어야 된다.
		 *  	5) 부모의 메서드보다 많은 수의 예외를 선언할 수 없다.
		 *  	6) 인스턴스 메서드를 static 메서드로 변경 불가(static -> 인스턴스 X)
		 *  
		 */
		
	} // main

}//class

class Parent {
	public int print(String n, int a) throws IOException{
		return 100;
	}
}

class Child extends Parent{
	@Override
	public int print(String n, int a) throws IOException, NullPointerException{
	//	public int print(String name) throws IOException, NullPointerException{    =>오버로딩
		
		/* 주의사항 3)
		 * The return type is incompatible with Parent.print(String, int)
		 * 리턴타입이 부모와 다름
		 */
		
		
		// 주의사항 5)
		// Cannot reduce the visibility of the inherited method from Parent
		// (접근지정자 삭제) 부모로부터 물려받은 상속된 메서드의 접근지정자 줄일 수 없다. public 을 default로 줄여서 안됨
		// public, protected 가능
		
		// 주의사항 2)
		//Cannot reduce the visibility of the inherited method from Parent
		//(매개변수가 1개 줄었을때) 오류메시지
		return 200;
	}
	
}