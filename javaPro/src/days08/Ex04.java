package days08;

/**
 * @author KL
 * @date 2023. 7. 24. - 오전 11:10:47
 * @subject  days07 Ex 11 풀이
 *                지역변수
 * @content
 * 
 *               함수 호출 (매개변수 가지고)
 *               1) Call By Name              drawLine();
 *               2) Call By Value
 *               3) Call By Reference
 *               4) Call By Point              X
 */ 

public class Ex04 {

	public static void main(String[] args) {
		// main 지역변수 x,y
		int x = 10;
		int y = 20;

		System.out.printf("x=%d y=%d\n",x,y);
		
		// Call By Value
		swap(x,y); // swap함수 호출부분     swap(10,20)  기억 공간 안의 값을 호출
		
		System.out.printf("x=%d y=%d\n",x,y);

	}//main

	// swap 함수 선언 부분
	public static void swap(int x, int y) {
		// x,y ==> swap 지역변수
		// int x가 main 함수의 int x를 참조할 수 있도록 바꾸기
		System.out.printf("swap before x=%d y=%d\n",x,y);
		int temp=x;
		x=y;
		y=temp;	
		System.out.printf("swap after x=%d y=%d\n",x,y);
		
	}

}//class
