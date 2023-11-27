package days13;

import java.util.Random;
import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 31. - 오전 10:13:39
 * @subject   Git  +  GitHub(금요일)
 * @content  
 */
public class Ex02 {
	
	public static void main(String[] args) {
		
		// Illegal modifier for parameter age; only final is permitted
		// 잘못된  modifier(접근지정자+기타제어자) 한정자, 수정자 존재
		// 지역변수 앞에 접, 기 사용 불가
		// public final int age =20;
		
		// 1. OOP = 객체 + 객체 + 객체 + 객체 +...
		
		// 2. 클래스 = 객체의 설계도
		// 3. 객체 = 클래스로 실제 존재하는 것. 사물(유형) 또는 개념(무형)의 객체
		// 4. 인스턴스( Instance ) = 생성된 객체를 인스턴스라 함.
		
		// 5. 인스턴스화 = 설계도(클래스)면을 가지고 객체를 생성하는 과정.
		// new 클래스명();
		
		// 6. OOP의 특징*****( == 클래스 특징 )
		//     1) 캡슐화 2) 은닉화 3) 상속성 4) **다형성** 5) 추상화
		//                                             ㄴ 인터페이스-특징,장단점
		
		// 7. 객체(물건,object)의 구성요소
		//							= 특징(속성)									+ 기능(일)
		//     예) 망치            =  손잡이 + 쇠 + 크기 + 재질..      		+ 안경점, 벽
		
		
		//     1) 객체의 구성 요소를 "멤버"라고 부름.
		//	   2) 특징(속성) == property == 멤버변수 == 필드(field)
		//	   3) 기능(일) == function == 멤버함수 == 메서드(metod)
		
		// 8. 클래스를 설계하는 과정(설계도 작성)
		//     1) 객체의 구성 요소(기능과 속성) 파악 -> 목록 작성(메서드,필드 작성)
		//     2) 클래스를 선언
		//		[접근지정자][기타제어자] class 클래스명 [extends Super클래스][implements 인터페이스...]{
		//		   필드 선언
		//		   메서드 선언
		//		}
		//	   3) 객체 생성 - 테스트
		//     4) 문제점 파악 - 유지,보수
		//     5) 상용화 - 배포
		//     6) 버전 관리 - 기능 추가, 수정....
		
		// 9. 클래스
		//     자바의 자료형
		//     1) 기본형(8가지)
		//     2) 참조형(3가지) - 배열, 클래스, 인터페이스
		//         					new 연산자에 의해서 힙(동적)영역에 실제 저장공간이 할당되고 그 주소를 참조.
		//    예) 배열
		//        int [] m ; //변수, 참조변수, 				배열명
		//     	  [4byte][4byte][4byte][4byte]		[주소참조]
		//    		0x100										m
		//		new (힙영역에 메모리 할당) int [5];     // 시작 주소값을 할당
		//    예) 
		//   클래스   참조변수
		// Scanner scanner= null; // 변수, 참조변수, 객체, 클래스를 자료형으로 선언된 참조변수
		// 클래스명 객체명      
		Scanner scanner= null; // 변수, 참조변수, 객체, 클래스를 자료형으로 선언된 참조변수
		// new 객체생성;  => new 연산자에 의해 힙영역에 생성된 객체를 인스턴스라 함.
		// 인스턴스화 하는 작업(코딩) : new 객체생성; 
		// scanner =new 객체생성; 
		 scanner =new Scanner(System.in);    //  new Scanner(System.in) => 인스턴스화 하는 코딩 
		
		System.out.println("이름 입력");
		// The local variable scanner may not have been initialized
		// 지역변수는 반드시 초기화 해야 사용할 수 있다.
		// 실행에러(런타임에러) java.lang.NullPointerException
		String name = scanner.next();
		System.out.println( name );
		
		Random rnd = new Random();
		
		// [객체 생성 코딩(인스턴스화) 을 구체적으로 적으시오]
		// new Random();
		// new Scanner(System.in);
		
		// 이름 출력
		System.out.println();
		// The constructor(생성자) System() is not visible
		// 생성자가 보이지 않음
		
		// 				 	인스턴스화 할 수 없는 클래스 : System
		//System s     = new System();  //객체생성 불가
		
		// [ 클래스 선언 ] Tv 
		
	} // main

}//class
