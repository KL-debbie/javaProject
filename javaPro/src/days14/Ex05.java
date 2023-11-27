package days14;

/**
 * @author KL
 * @date 2023. 8. 1. - 오전 11:39:39
 * @subject 시험 3*********
 * @content this 키워드 설명
 * 				1. 정의 : 생성된 객체 자기 자신의 주소값을 가지는 참조변수 = 자동생성
 * 				2. this 3가지 용도
 * 					1)  멤버를 가리킬 때의 this  예) this.필드명, this.메서드명, this.name..
 * 						ㄴ Point(int x, int y)
 * 							this.x=x;
 * 							this.y=y
 * 					2)  생성자에서 또 다른 생성자를 호출 할 때의 this - 주의할 점 반드시 첫번째 라인에 코딩**
 * 					3) 단독으로 사용될 때의 this : 함수호출(리턴값) , 매개변수
 */
public class Ex05 {

	public static void main(String[] args) {
		
		// Person p = new Person();
		// p = 변수, [참조변수], 객체명
		// [name][age][gender][getter][setter]....   -> [0x100]
		// 0x100															p
		
		/*
		Point p1 = new Point(1,2);
		p1.printPoint();
		
		Point p2 = new Point(100,200);
		p2.printPoint();
		*/
		
		//The constructor Point(int) is undefined
		//int 1개인 생성자는 선언이 되어있지 않음
		Point p3 = new Point(30);
		p3.printPoint();
		
		Point p4 = new Point();
		p4.printPoint();
		
	} // main
}
