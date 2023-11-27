package days15;

/**
 * @author KL
 * @date 2023. 8. 2. - 오전 11:40:09
 * @subject
 * @content
 */
public class Ex04 {
	public static void main(String[] args) {
		/*
		상속 계층도
		Object								Object
				Shape								Point			
						Circle Triangle
		*/
		
		
		
		Point center = new Point(50,50);
		int r= 10;
		
		Circle c = new Circle(center,r);
		
		c.color = "red";
		
		// 재정의 == Shape 부모클래스로부터 물려받은 draw() 메서드를 내가 하고싶은 방향으로 수정
		// 재정의 == 오버라이딩( overriding )
		// 중복 함수 == 오버로딩( overloading )
		 c.draw(); // 원점출력 + 색 출력
		
		System.out.println("-".repeat(30));
		// 클래스 배열 초기화
		Point [] p = {
						new Point(1,1),
						new Point(20,40),
						new Point(10,5)
						};
		Triangle t = new Triangle(p);
		t.draw();
		System.out.println("-".repeat(30));
		
	} // main
}

//삼각형
// 정의 : 한 평면상에 있고 일직선상에 없는 3개의 점 A,B,C 를 두개씩 쌍으로 하여 선분을 연결하여 이루어진 도형

class Triangle extends Shape{
	// 꼭지점 3개
	Point [] p = null;
	
	public Triangle(Point [] p) {  // 생성자를 통한 DI(의존성 주입)
	this.p=p; 	
	}

	@Override
	void draw() {
		System.out.printf("[p1=%s, p2=%d, p3=%d]\n", 
									this.p[0].getXY(), 	
									this.p[1].getXY(), 
									this.p[2].getXY()
									);
		}
	
}

/*
//원
class Circle{
	
	//원점
	int x;
	int y;
	
	// 원의 반지름
	int r;  //radius
	
	Circle() {}
		Circle(int x, int y, int r){
			this.x=x;
			this.y=y;
			this.r=r;
	}
		void draw() {
			// 도형 그리기 코딩
		}
}
*/

// 상속으로 클래스 생성
class Circle extends Shape{
	
	// 원점
	Point center;  //has-a 관계
	int r;
	
	public Circle(){
		this( new Point(0,0 ), 0 );
	}
	
	public Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}

	//그리기 메서드
	// extends Shape 에 의해 String color = "black";
	//@애노테이션( annotation )
	// 부모꺼 물려받아 재정의 하겠다
	
	@Override
	void draw() {
	//	 System.out.printf("[color = %s, center =( %d, %d )]\n", this.color, this.center.x, this.center.y);
		System.out.printf("[color = %s, center = %s ]\n", this.color, this.center.getXY() );
	}
	
}

//도형 
class Shape{
	
	String color = "black";   // 명시적 초기화
	
	//메서드 - 면적메서드(), 둘레메서드()
	
	 void draw() {
		 System.out.printf("[color = %s]\n", this.color);
	 }
}



//Point extends java.lang.Object 컴파일러가 자동 상속 시킴
// 자바는 컴바일러가 자동으로 extends Object 상속 
class Point{  //extends 생략시 java.lang.Object 컴파일러가 자동 상속 시킴
	int x;
	int y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	Point(){
		this(0,0);
	}
	String getXY() {
		return String.format("(%d,%d)", this.x, this.y);
	}
}