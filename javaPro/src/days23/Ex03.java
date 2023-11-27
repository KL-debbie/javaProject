package days23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Ex03 {
	
	public static void main(String[] args) {
		
		// Set : LinkedHashSet 컬렉션 클래스
		// 				ㄴ 중복 허용 X, 순서 유지 O
		// List<Person> list = new ArrayList<Person>();
		
		// 사람은 주민번호가 같으면 같은 사람(객체) -> add x(중복X)
		Set<Person> s = new LinkedHashSet<Person>();  //업캐스팅
		s.add(new Person("111111-1111111", "김호영", 23) );
		s.add(new Person("222222-2222222", "박민석", 25) );
		s.add(new Person("333333-3333333", "박정호", 28) );
		
		System.out.println(s.size());  // 3
		
		s.add(new Person("222222-2222222", "박민석", 35) );
		// 주민번호가 같으면 같은 사람이므로 추가되지 않도록..(중복X)
		// hashCode와 equals 오버라이딩하여 중복체크
		
		
		Iterator<Person> ir = s.iterator();
		while (ir.hasNext()) {
			Person p = ir.next();
			System.out.println(p);
		}
		
	} // main

}//c
class Person{
	String rrn;
	String name;
	int age;
	
	public Person() {
		super();
	}
	
	public Person(String rrn, String name, int age) {
		super();
		this.rrn = rrn;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [rrn=" + rrn + ", name=" + name + ", age=" + age + "]";
	}

	// 객체가 같은지 확인
		//hashCode() => 같으면 같은 객체	rrn 오버라이딩	
		//equals() 								rrn 오버라이딩
	
	@Override
	public int hashCode() {
	
		return this.rrn.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;  // 같은 객체면 true
			return this.rrn.equals(p.rrn);
		} //if
		return false;
	}
	
}