package days13;

/**
 * @author KL
 * @date 2023. 7. 31. - 오후 12:41:52
 * @subject
 * @content
 */
public class Ex06 {
	
	public static void main(String[] args) {
		
		//좌표점 20개 쓰기 + 읽기
		// main.x ,y 지역변수
		int x=10,y=20;
		int x1=11,y1=21;
		int x2=12,y2=22;
		int x3=13,y3=23;
		int x4=14,y4=24;
		int x5=15,y5=25;
		
		dispXY(x,y); // Call BY Value 값 가지고 호출
		
	} // main

	// 									dispXY.x= 10, y= 20 지역변수
	private static void dispXY(int x, int y) {
		System.out.printf(">x = %d, y = %d\n", x,y);
		
	}

	// The variable argument type int of the method dispXY must be the last parameter
	// 가변인자= 마지막 매개변수(last parameter)만 사용 가능
	// 가변인자는 여러개 사용하지 못함.
	/*
	private static void dispXY(int...x, int...y) {
}
*/
	/*
	private static void dispXY(int x, int y, int x1 -----) {
	}
	*/
	
	/*
	private static void dispXY(int [] x, int[] y) {
	
	}
	*/
	
	
}//class
