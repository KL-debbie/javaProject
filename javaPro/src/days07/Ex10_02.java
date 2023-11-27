package days07;

/**
 * @author KL
 * @date 2023. 7. 21. - 오후 4:14:14
 * @subject  함수 생성 연습
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
		int a =10, b =20;
		int c =30;
		// 두 정수의 합을 구해서 반환하는
		//1. sum() 함수 선언
		//2. sum() 함수 호출
		//int c = a+b;

		// 세 정수의 합을 구해서 반환하는 sum 함수 필요
		// int result= sum(a, b);  // 리턴자료형이 int
		// 호출 먼저하고 선언 가능 리턴타입 확인!
		int d = 40;
		int result= sum(a,b,c,d);
		
		System.out.printf("%d+%d=%d\n", a, b, c);

	}  //main

	public static int sum( int a, int b) { //private가 올경우도 있음
		int c = a + b;
		return c;  // 리턴문에는 수식이 올 수 있음
	}
	public static int sum( int a, int b, int c) { //private가 올경우도 있음
		int result = a + b+c ;
		return result;
	}
	public static int sum( int a, int b, int c, int d) { //private가 올경우도 있음
		int result = a + b+c + d ;
		return result;
	}
	}//class
