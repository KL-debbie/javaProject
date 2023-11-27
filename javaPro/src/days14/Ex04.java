package days14;

/**
 * @author KL
 * @date 2023. 8. 1. - 오전 11:02:46
 * @subject 시험 2/***********
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
	
		// [ private 필드 선언 ]
		// 1. 왜 private 접근지정자를 사용해서 필드를 선언했는가?
		// 2. 이유  
		//		1) private 필드( -외부에서 보이지않음) + 유효한 값만을 필드가 사용.(잘못 할당된 값을 막고싶음)
		//		2) 필드를 읽기전용, 쓰기전용
		// 3. 접급 방법 - getter-읽기전용, setter-쓰기전용 겟셋 추가 -> private 에 접근
		
		// The constructor Person(boolean) is undefined
		Person p1= new Person( true );  //생성자를 통해 값 할당
		System.out.println(p1.isGender());
		
		
		p1.setAge(20);
		System.out.println(p1.getAge());
		// 접근 지정자를 사용해서 필드 ( 은닉화 )
		//The field Person.name is not visible
		//필드 은닉화되어있음
		/*
		p1.name = "홍길동";
		p1.age = 20;
		p1.gender = true;
		*/
		
		
	} // main
	
}//class

// The public type Person must be defined in its own file
// 하나의 자바파일 안 클래스 선언은 여러개 가능하지만 똑같은 클래스 안에서만 public선언가능
// 다른 패키지에서는 사용 할 클래스X

/*class Person{
	
}
*/
