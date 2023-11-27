package days15;

/**
 * @author KL
 * @date 2023. 8. 2. - 오후 2:40:15
 * @subject
 * @content
 */
public class Ex08 {
	
	public static void main(String[] args) {
		/*[ 1 ]
		Employee emp1 = new Employee("이준희", "서울 강남구", "010-1234-1234", "2022.12.12");
		emp1.dispEmpInfo();
		
		// Object.toString() -> 오버라이딩(overriding)
		//
		//					toString=> Object꺼
		System.out.println( emp1.toString() );
		System.out.println( emp1 );  //객체명만 있어도 값은 같음, toString 생략 가능
		// 16진수 값
		*/
		
		// is-a 관계(상속) 
		// 정규직 사원은 사원이다.
		// ~은 ~이다 관계
		
		/* [ 2 ]
		Regular emp2 = new Regular("주강민","서울 양천구", "010-3123-1231", "2021.03.20", 40000000);
		// 문제점 : 기본급 출력 X
		emp2.dispEmpInfo();
		System.out.println( emp2 ); //@toString
		*/
		
		/*
		//[ 3 ]
		// 상속관계가 있을시
		// Employee = Regular 클래스들간 자동형변환
		// 부모클래스 emp2 = new 자식클래스
		// 1. 상속관계가 있는 클래스들 간의 형변환 중 한개
		// 2. 자식객체를 생성해서 부모객체에 참조시키는것
		// [업캐스팅]
		// 자동형변환
		// [ 이상한 점 ]
		// Employee클래스의 dispEmpInfo() X
		// 실제 생성된 Regular 객체의 dispEmpInfo() 메서드 호출.
		Employee emp2 = new Regular("주강민","서울 양천구", "010-3123-1231", "2021.03.20", 40000000);
		emp2.dispEmpInfo();
		//[ 업캐스팅 - 문제점 ]
		// emp2.getPay();  
		// 부모클래스에 업캐스팅 하고 난 후 오류 -> 부모한테는 getPay가 없음
		*/
		
		// 자식객체 업캐스팅 - 부모 -> 자식 참조 가능
		// 부모 업캐스팅 객채 -> 자식객체 참조 - 다운캐스팅
		//다운캐스팅(downcasting)  (cast)강제형변환
		//(조건) 업캐스팅된 객체만 다운캐스팅 가능
		
		//Regular emp = (Regular) emp2;
		// emp2 -> regular (자식) 다운캐스팅 - 강제형변환
		
		/*
		Regular emp3= (Regular) new Employee("이준희", "서울 강남구", "010-1234-1234", "2022.12.12");
		// java.lang.ClassCastException - 실행오류(runtime오류)
		//
		
		//자식객체에 참조에는 오류
		//Type mismatch: cannot convert from Employee to Regular - 컴파일 오류
		// 형 불일치 - 형변환 
		// 캐스트연산자 - 클래스들 간의 형변환에도 사용
		*/
		
		/*
		// [ 4 ] SlaesMan, Regular 오류 X, Employee는 오류(getPay() 없음)
		Employee emp3= new SalesMan("임경재", "경기도 성남시", "010-4567-7864", "2021.03.12", 500000, 20, 70000);
		emp3.dispEmpInfo();
		System.out.println( emp3.getPay() );
		*/
		
	
		// [ 5 ]
		 Employee emp4= new Temp("박정호", "서울 목동", "010-7894-1315", "2020.01.01", 20, 250000);		
		 emp4.dispEmpInfo();
		 System.out.println( emp4.getPay() ); //X
		
		
		
		
	} // main

}
