package days14;

import days13.Point;

/**
 * @author KL
 * @date 2023. 8. 1. - 오전 10:34:50
 * @subject
 * @content
 */
public class Ex02 {
	
	public static void main(String[] args) {
		
		// days13.Ex10
		
		// The constructor Point(int, int) is undefined
		Point p1 = new Point(1,2);  //객체 생성할 때 필드 초기화
		// p1.x = 1;
		// p1.y = 2;
		
						// 객체명.메서드명
						// 객체명.필드명
		Point p2 = p1.plusPoint(p1);
		p2.dispXY();
		
		p2 = p1.plusPoint();
		p2.dispXY();
		
		
		
		
		
	} // main

}
