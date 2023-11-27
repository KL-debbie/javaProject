package days02;
 

/**
 * @author KL
 * @date 2023. 7. 14. - 오전 10:34:59
 * @subject 두 기억 공간의 값 바꾸기 (문제 2)
 * @content
 */

public class Ex04 {

	public static void main(String[] args) {
		// 두 정수를 저장할 x, y 변수를 선언하고
		// 각각 10,20으로 초기화하고
		// 출력형식 :   > x=10, y=20 출력
		
		
		int x = 10;
		int y = 20;
		// 동일한 자료형일 경우에는 콤마(,) 연산자를 나열하여 사용 가능
		// int x, y;
		// int x = 10, y = 20;
		
		// The method println(int) in the type PrintStream is not applicable for the arguments (int, int)
		System.out.printf( "교환 전> x=%d, y=%d", x, y);
		//System.out.printf( "교환 전> x=%d, y=%d\n", x, y); \n 줄바꿈
		// 프로그램 상에서 두 기억공간의 값 교환하려면 반드시 동일한 자료형의 임시기억 공간이 필요하다.
		// 
		
		y = x;
		x = y;
		System.out.printf( "교환 후> x=%d, y=%d\n", x, y);
	
		{
			int temp;
			temp = x;
			x = y;
			y = temp;
		}
		
		

	} // main

}// class
