package days15;

import java.util.Iterator;

/**
 * @author KL
 * @date 2023. 8. 2. - 오후 4:34:44
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {

		// 1) 문제점
		//   E e1 = new R(); (- 업캐스팅)
		//   E e1 = new S(); 	   "
		//   E e1 = new T(); 	   "
		//	 e1.getPay(); X 모두 호출 안됨 emp 안에 getPay 없기때문
		// 	 왜 Employee 클래스 안에 getPay() 메서드 선언 X ??
		//	 물려받을 자식들이 계속 오버라이딩해서 써라
		// 	 
		// 	 E + getPay();  기능은 하지 않지만 나중에 업캐스팅 해서 호출했을때 쓸수 있도록(가상 메서드)
		
		
		//학생 관리 :  초,중,고,대학생
		//	(추상클래스 - 객체생성 필요 X) 학생 클래스 : 공통적으로 멤버 
		
		//[ 다형성 ] -"여러 가지 형태를 가질 수 있는 능력"
		/*
		 * E e1 =new R();
		 * E e1 = new S();
		 * E e1 = new T();
		 * 
		 * 
		 */
		
		
		// Cannot instantiate the type Employee
		// Employee를 객체생성할 수 없음
		// 왜 ? 불완전한 클래스(추상클래스)이므로
		// Employee emp1 = new Employee("이준희", "서울 강남구", "010-1234-1234", "2022.12.12");
		
		/*
		Regular emp1 = new Regular("주강민","서울 양천구", "010-3123-1231", "2021.03.20", 40000000);
		SalesMan emp2= new SalesMan("임경재", "경기도 성남시", "010-4567-7864", "2021.03.12", 500000, 20, 70000);
		Temp emp3= new Temp("박정호", "서울 목동", "010-7894-1315", "2020.01.01", 20, 250000);	
		
		emp1.getPay();
		emp2.getPay();
		emp3.getPay();
		*/
		
		/*
		Employee [] emps = new  Employee[3];
		// 업캐스팅(자동 형변환)
		emps[0] = new Regular("주강민","서울 양천구", "010-3123-1231", "2021.03.20", 40000000);
		emps[1] = new SalesMan("임경재", "경기도 성남시", "010-4567-7864", "2021.03.12", 500000, 20, 70000);
		emps[2] = new Temp("박정호", "서울 목동", "010-7894-1315", "2020.01.01", 20, 250000);
		*/
		
		
		//클래스 배열 초기화
		Employee [] emps = {
				new Regular("주강민","서울 양천구", "010-3123-1231", "2021.03.20", 40000000),
				new SalesMan("임경재", "경기도 성남시", "010-4567-7864", "2021.03.12", 500000, 20, 70000),
				new Temp("박정호", "서울 목동", "010-7894-1315", "2020.01.01", 20, 250000)
		};
		
		for (int i = 0; i < emps.length; i++) {
			emps[i].getPay();
		} // for
		
	} // main
	
	// 사원 급여 출력메서드
	public void dispGetPay() {
		
	}
	
	
}//class
