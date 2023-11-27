package days18;

public class Ex03_02 {
	
	public static void main(String[] args) {

		// equals 함수
		
		// 주민등록번호가 같으면 동일한 사람(객체)이다.
		Person p1 = new Person("111", "홍길동");
		//Person p2 = null;
		Person p2 = new Person("111", "홍길둥");
		// per1 per2해시코드값다름
		//같도록 만들어줄때 equals & hashcode 오버라이딩
		
		
		// 3) Object toString() - 기본형태
		// days18.Person@be11(해시코드의 16진수)
		// 패키지명.클래스명@해시코드의 16진수
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println(p1);
		System.out.println(p2);
		
		
		// 2)
		//인스턴스 2개
		//다른 해시코드 값
		// hashcode 오버라이딩으로 같은 코드값이 나옴
		System.out.println(p1.hashCode()); 
		System.out.println(p2.hashCode());
		
	//	System.out.println(p1.equals(p2)); // false  객체가 따로 생성되기에 참조하는 주소값이 다르기떄문
		
		// true 값 나오도록 Object -> equals() 메서드를 오버라이딩
		// 같은 객체를 가지고 있다고 오버라이딩
		
		
	} // main

}//class

// Person클래스의 객체가 복제(clone) 되도록 코딩
// 1.implement
// 2.clone메서드 오버라이딩

// 인스턴스가 하나 더 생성
// 함수 생성
class Person implements Cloneable{
	
	public Person(String rrn, String name) { //필드선언
		super();
		this.rrn = rrn;
		this.name = name;
	}

	String rrn;
	String name;
	
	@Override
	public String toString() {
		//return "Person [rrn=" + rrn + ", name=" + name + "]";
		return String.format("Person [rrn= %s , name=%s]",this.rrn,this.name);
	}
	
	// equals + hashcode 오버라이딩
	//							p1.equals(p2)  업캐스팅, 매개변수 다형성
	@Override // 어노테이션
	public boolean equals(Object obj) { //오버라이딩 의미,조건
		if (obj !=null && obj instanceof Person) {  // obj는 null X && person이라면
			Person p =(Person)obj; // 다운캐스팅
			return this.rrn.equals(p.rrn); // p주민번호와 this주민번호 일치하면 true
		} //if
		return false;  // return  false;
	}

	@Override
	public int hashCode() {

		return this.rrn.hashCode(); // 같은 값 돌려주도록 만들었음
	}
	
	/*

	@Override
	protected Object clone() throws CloneNotSupportedException { //checked 예외
		
		//return super.clone();
		Object obj = null;
		obj = super.clone();
		return obj;
	}
	*/
	
	// 오버라이딩 조건.주의사항.
	// 원래 오버라이딩 조건과 맞지 않음
	// 공변반환타입 (convariant return type) 추가 - jdk1.5
	// ㄴ 오버라이딩 할때 조상 메서드의 반환타입을 자식 클래스 타입으로 변경 가능(조건 추가- 다운캐스팅 안하기 위해)
	@Override
	protected Person clone() { //리턴타입 불일치
		
		Person p = null;
		try {
			p =(Person) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return p;
	}
	
	
}
