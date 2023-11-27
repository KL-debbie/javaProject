package days14;

/**
 * @author KL
 * @date 2023. 8. 1. - 오후 3:43:55
 * @subject
 * @content
 */
public class Ex10_03 {

	public static void main(String[] args) {
		//[초기화 블럭]
		// 인스턴스 초기화 블럭
//		클래스 초기화 블럭
		
		Member m1 = new Member();
		System.out.println(m1.name);
		System.out.println(m1.count);
		
		Member m2 = new Member();
		
		/*
		 * 초기화 순서
		 * 1) 명시적 초기화
		 * 2) 클래스 초기화   ( 객체 생성될 때 1번 초기화)
		 * 3) 인스턴스 초기화 ( 객체 생성될 때마다 초기화)   -  생성자의 중복되는 코딩을 초기화블럭으로 초기화
		 * 4) 생성자 초기화   ( 객체 생성될 때마다 초기화)
		 */

	}//main

}//class

//멤버 클래스
 class Member {
	//[필드]
	// 인스턴스 변수
	String name ="익명"; // 명시적 초기화
	int age=20;   // 명시적 초기화
	int count;     //명시적 초기화x
	int serialNo;  //명시적 초기화x

	//클래스 변수
	static double rate = 0.05; // 명시적 초기화


	//클래스 초기화 블럭
	//프로그램 시작 시 1번 호출
	static {
		// 일괄적으로 static 변수가 있다면 초기화하는데 사용
		rate= 0.08;
		System.out.println("> static 초기화 블럭 호출됨");
	}

	// 인스턴스 초기화 블럭
	//여러개의 생성자에서 똑같은 코딩이 있을 때 사용
	// 객체 생성시마다 생성자 앞에 호출 됨
	{
		count++;
		serialNo =count;
		System.out.println("> 인스턴스 초기화 블럭 호출됨");
	}
	//
	public Member() {
	//	count++;
	//	serialNo =count;
		
		name ="무명";
		System.out.println(">Member 디폴트 생성자 호출됨");
	}
	public Member(String name) {
		//count++;
		//serialNo =count;
		
		this.name =name;
		System.out.println(">Member 1 생성자 호출됨");
	}

}