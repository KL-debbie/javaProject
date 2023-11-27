package days18;

public class Ex06 {

	public static void main(String[] args) {
		//Object.clone() 복제
		//왜 사용 못했는지?메서드가 보이지 않는 이유
		
		Person p1 = new Person("111","홍길동");
		Person p1Clone;
		
		p1Clone = p1.clone();
		System.out.println(p1Clone); // 이미 예외처리도 되있어 try~catch 문 필요X, 공변반환타입에 의해
		/*
		try {
			//clone() Object 오버라이딩 불편한점
			// ㄴ (Person) 다운캐스팅이 필요
			
			p1Clone = (Person) p1.clone();   //복제-> 다운캐스팅, checked예외이므로 예외처리 필수
			System.out.println(p1Clone);
			
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		} 
		*/
		
		/* 스레드 개념 설명시
		p1.notify();		스레드 수업
		p1.notifyAll();		"
		p1.wait();		스레드 수업
		p1.wait();			"
		p1.wait();			"
		*/
		//p1.finalize(); - 소멸자(객체 소멸될때 필요)
		
		
	} // main

}
