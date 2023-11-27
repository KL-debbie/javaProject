package days14;


public class Point { 
	
	
	//필드
	private int x;
	private int y;
	
	//디폴트생성자
	public Point() {
		
		System.out.println(">Point 디폴트 생성자 호출됨...");
	}

	public Point(int x, int y) {
		System.out.println(">Point 2 생성자 호출됨...");
		// The assignment to variable x has no effect
		// x변수에 대입해도 효과가 없음,,,,,,,,,,,,,,,,,,
		// 값 넣으나 마나 매개변수인지 필드인지 구분 X
		//x=x;
		
		this.x=x; //자기자신의 멤버
	 	this.y=y;
		
	}
	
	public Point(int i) {
		this(i,i); //point (x,y) 호출 항상 첫줄
		System.out.println(">Point 1 생성자 호출됨...");
		// this.x=i;
		// this.y=i;
	}

	// p1.printPoint()
	// 호출한 객체 p1 -> x,y
	// p2.printPoint()
	// 호출한 객체의 필드 p2 -> x,y
	// 
	public void printPoint() {
		System.out.printf(">x=%d, y=%d\n",this.x, this.x);
	}
	//클래스 복사
	// Point p3 = p1.offsetPoint(10)
	// offsetPoint 메서드 호출 객체 - p1. == this
	public Point offsetPoint(int n) {
		this.x += n; 
		this.y += n;
		return this;  //
	}
	
	//두 좌표를 더해서 새로운 좌표 반환하는 메서드 선언
	// Point p3 = p1.plusPoint(p2);
	public Point plusPoint(Point p) {
		int x = this.x + p.x;     // == p1.x + p2.x
		int y = this.y + p.y;
		return new Point(x,y);
		// this == p1
		// p ==p2
		// return this; == p1
	}
	
}//class

