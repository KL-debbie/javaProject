package days25;

import java.util.Date;
import java.util.Scanner;

public class Ex04 {
	
	
	public static void main(String[] args) {
		
		// [ 어노테이션 (Annotation) ]
		/*
		 * 1. 사전적 의미 : 주석
		 * 2. 정의 ? 프로그램의 소스 코드 안에 다른 프로그램을 위한 미리 약속된 형식을 포함시킨 것
		 * 3. jdk에서 기본적으로 제공하는 어노테이션을 "표준 어노테이션"이라 부름
		 * 4. 표준 어노테이션 -> 컴파일러(다른 프로그램)한테 알려줌
		 * 5. 표준 어노테이션
		 * 		1) 	@Override : 컴파일러에게 오버라이딩 한 메서드임을 알려주는 어노테이션
		 * 		2) @SuppressWarnings : 컴파일러의 특정 경고 메시지가 나타나지 않게 사용하는 어노테이션, 메인함수에도 사용 가능
		 * 		3) @Deprecated : 앞으로 없어질 생성자, 필드, 메서드 임을 알려줌
		 * 		4) @FunctionInterface : (함수+인터페이스) 함수형 인터페이스(람다식)임을 알려주는 어노테이션
		 * 		5) @SafeVarargs : 제네릭 타입의 가변인자에 사용되는 어노테이션
		 * 		6) @Native : "native 메서드" 에서 참조되는 상수 앞에 붙임. C언어를 사용해 만든 메서드
		 * 	
		 * 		[메타 어노테이션] : 어노테이션에 사용되는 어노테이션
		 * 		7) @Target
		 * 		8) @Documented
		 * 		9) @Inherited
		 * 		10) @Retention
		 * 		11) @Repeatable
		 * 	
		 */
		
		
		// 자동적으로 컴파일러가 경고하는 중
		//선언했는데 사용 X(사용여부 파악)
		
		//@SuppressWarnings("unused")
		// 앞으로 사용 할 예정이니 컴파일러에게 경고 억제하라고 알려줌
		Scanner sc = new Scanner(System.in);
		String name = "홍길동";
		
		Date d = new Date();
		
	} // main

	@Override  //부모꺼 오버라이딩 했으니 알고있어라
	public String toString() {
		return "Ex04 []";
	}
	
	// 오버로딩
	 String toString(int a) {
		return "Ex04 []";
	}

	
}//cl
