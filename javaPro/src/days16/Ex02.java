package days16;
//Crtl +shift + O
import days15.Employee;
import days15.Regular;
import days15.SalesMan;
import days15.Temp;

/**
 * @author KL
 * @date 2023. 8. 3. - 오전 10:29:09
 * @subject
 * @content
 */
public class Ex02 {
	
	public static void main(String[] args) {
		
		//Regular e1 = new Regular();
		///dispGetPay(e1);
		
		SalesMan e2 = new SalesMan();
		dispGetPay(e2);
		// 자식객체 생성 하면 최상위 부모 객체들이 먼저 생성 -> 먼저 호출됨
		
		
		
		//Temp e3 = new Temp();
		//dispGetPay(e3);
		
		
		
	} // main

	//인스턴스 메서드 -> 클래스 메서드로 변경
	// 매개변수 다형성
	public static void dispGetPay(Employee emp) {
		// emp 의 실제 객체? (Regular, SalesMan, Temp)
		// 실제 객체(인스턴스) 확인 연산자 instanceof 
		
		// if - else if구문 확인
		// 자식 클래스 먼저 체크(상속관계가 있는 클래스들만)
		// SalesMan과 Regular이 서로 상속관계
		if (emp instanceof SalesMan) {
			System.out.println(">emp객체는 SalesMan 타입이다.");
			SalesMan s1 = (SalesMan)emp; // 다운캐스팅
		}
		else if (emp instanceof Regular) {
			System.out.println(">emp객체는 Regular 타입이다.");
			Regular r1 = (Regular)emp;
		} //else if
		else	if (emp instanceof Temp) {//Temp는 Employee와 상속관계
			System.out.println(">emp객체는 Temp 타입이다.");
		} //if
		
		emp.getPay();
	}
	
}//class

