package days22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Ex05_03 {
	public static void main(String[] args) {
		
		ArrayList<Person3> list = new ArrayList();
		
		list.add(new Person3("박정호", 23));
		list.add(new Person3("김성준", 21));
		list.add(new Person3("주강민", 29));
		list.add(new Person3("이경서", 20));
		list.add(new Person3("신기범", 30));
		
		System.out.println(list);
		
		list.sort( null  );
		// 비교잣대 X ->비교기 기능이잇는 클래스,,,
		
		
		// 반복자 사용해 출력
		Iterator ir=list.iterator();
		while (ir.hasNext()) {
			Person3 p = (Person3) ir.next();
			System.out.println(p); 
			//java.lang.ClassCastException
		}
		
		// Person 이름순 오름차순 정렬 기능 포함 클래스 선언
		// compareTo() 재정의 함수
		
	} // main

}//cls


//  비교기 기능이 있는 Person3 클래스 선언
// Comparator 비교기X
class Person3 implements Comparable{
	
	private String name;
	private int age;

	public Person3() {
		super();

	}
	
		public Person3(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "[name=" + name + ", age=" + age + "]";
		}

		// 자기자신껄 비교할 수 있는 클래스 생성
		// 이름을 기준으로 Person객체는 기본정렬 하세요.
		
		@Override
		public int compareTo(Object o) {
			Person3 p = (Person3)o;
			return this.getName().compareTo(p.getName());
		}
		
		

	}//cls