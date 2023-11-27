package days18;

public class Ex05 {
	
	public static void main(String[] args) {
		//Object.equals()
		//Object.hashcode()
		//Object.toString()
		//Object.getClass()- 객체의 클래스 정보를 담고 있는 Class인스턴스를 반환하는 메서드
		//
		Person p1 = new Person("111", "홍길동");
		Class cls = p1.getClass(); // 클래스타입 객체
		
		//Class class = p1.getClass(); 
		// 예약어 식별자 사용 불가

		System.out.println(cls.getName());
		//p1.의 풀네임은 days18.Person
		
		System.out.println(cls.getSimpleName());
		// 패키지 제외한 클래스 이름 Person
		
		
		
	} // main

}
