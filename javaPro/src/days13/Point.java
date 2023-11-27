package days13;

public class Point { // 좌표관련 클래스
	
	//필드
	// 인스턴스 변수(필드)
	public int x ;
	public int y;

	
	public Point(int i, int j) {
		x=i;
		y=j;
	}


	public Point() {}


	//메서드
	public void dispXY() {
		System.out.printf("> x=%d, y=%d\n", x, y);
	}

	
	// 메서드 추가
	// 리턴자료형이 Point 클래스의 참조타입.
	public Point plusPoint(Point p) {
	
		// 새로운 좌표객체를 생성 후 반환
		// The constructor Point() is undefined
		// 생성자 없음
		Point p2 = new Point();
		p2.x = p.x + 10;
		p2.y = p.y + 20;
		
		return p2;
	}
	
	// 중복함수 (Overloading)
	// p1.plusPoint();  
	public Point plusPoint() { //매개변수가 다름
		// x,y 필드는 p1 꺼
		//System.out.printf("x=%d, y=%d\n)", x, y);
		Point p2 = new Point();
		p2.x = x + 10;
		p2.y = y + 20;
		
		return p2;
	}
}//class

