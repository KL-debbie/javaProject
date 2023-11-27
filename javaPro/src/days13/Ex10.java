package days13;

/**
 * @author KL
 * @date 2023. 7. 31. - 오후 3:05:17
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		
		//[ 리턴자료형 ]이 참조타입
		// Point 클래스 안에 plusPoint() 메서드 추가
		// 		ㄴ Point객체를 매개변수로 받아서
		//			x,y좌표를 10씩 증가 시킨 후
		//			증가 시킨 좌표를 반환하는 메서드 추가.
		
		Point p1 = new Point();
		p1.x = 1;
		p1.y = 2;
		
						// 객체명.메서드명
						// 객체명.필드명
		Point p2 = p1.plusPoint(p1);
		p2.dispXY();
		
		p2 = p1.plusPoint();
		p2.dispXY();
		
	} // main

}//class
