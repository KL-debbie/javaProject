package days15;

/**
 * @author KL
 * @date 2023. 8. 2. - 오전 11:14:29
 * @subject 			클래스들간의 관계
 * 							1)has-a관계
 * 							2)is-a관계(상속)
 * @content
 */
public class Ex02 {
	
	public static void main(String[] args) {
	
		/*
		 * [ 상속 (inheritance) ]
		 * 1. 상속 ? 기존의 클래스를 재사용하여 새로운 클래스로 작성하는 것.
		 * 2. 상속의 장점
		 * 		1) 코드 재사용하기 때문에 생산성 향상, 유지보수 용이
		 * 3. 상속기능이 구현된 클래스 선언 형식
		 *  접 기 class 새로운클래스명 [extends Super클래스(기존클래스)]{
		 *  
		 *  }
		 *  4. 기존클래스   == [ 부모클래스 ], 상위클래스, [ Super클래스 ] , 기초클래스
		 *  	새로운클래스 == [ 자식클래스 ], 하위클래스, [ Sub클래스 ] , 파생클래스
		 *  5. 예시
		 *  Point : 좌표를 관리하는 기능이 구현된 클래스
		 *  
		 *  좌표값 2차원(평면) - x,y좌표만 있어도 됨
		 *  좌표값 3차원(입체) - x,y,z좌표 
		 *    
		 *  
		 */
		
	} // main

}//class


class Point2D{
	int x;
	int y;
	Point2D(){}
	Point2D( int x, int y){
		this.x=x;
		this.y=y;
	}
}


class Point3D extends  Point2D{
	int z;
// 생성자는 상속 X -> 따로 구현하기
	Point3D(){}
	Point3D( int x, int y, int z){
		// this.x=x;
		// this.y=y;
		super(x,y);  // 부모의 주소값(생성자)을 참조(호출)    ->  Point2D( int x, int y), 항상 첫번째 줄 작성
		this.z=z;
	}
}


/* 재사용 안할시
class Point3D {
	int x;
	int y;
	int z;
	Point3D(){}
	Point3D( int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
}
*/
