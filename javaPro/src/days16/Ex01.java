package days16;

public class Ex01 {

	public static void main(String[] args) {
	
} // main

	 // new Parent();
	
	// Up-Casting
	// 추상클래스에도 가능
	// Parent p1 =new Child();
	
	//Child c1 =new Descendant();
	
	Parent p1 = new Descendant();
	
}


// 공통적인 멤버 가진 부모 클래스 , abstract 키워드 - 추상클래스
// 일종의 클래스
abstract class Parent{
	// 상속 계층도에 의해 물려받을 자식클래스들이 있을 것이라 -> 추상화 ->
	// 객체 생성 X
	// 추상메서드없이 추상 클래스 선언가능
	
	//필드
	//메서드
	// 추상메서드
	abstract void dispA();
	abstract void dispB();
	
}

// 일부분만 재정의 할 시
// 추상클래스로 
abstract class Child extends Parent{
	
	// 하나만 재정의
	@Override
	void dispA() {

	}
	//필드
	//메서드
}

class Descendant extends Child{

	@Override
	void dispB() {
	
	}
	
}

/*
class Child extends Parent{

	@Override
	void dispA() {
		
	}

	@Override
	void dispB() {
	
	}
	//필드
	//메서드
}
*/

/*
//The type Child must implement the inherited abstract method Parent.dispA()
//추상메서드를 물려받았기때문에 클래스도 추상 클래스가 되어야 함
abstract class Child extends Parent{
	//필드
	//메서드
}
*/