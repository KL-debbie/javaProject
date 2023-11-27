package days14;

/**
 * @author KL
 * @date 2023. 8. 1. - 오후 3:20:59
 * @subject  변수 초기화
 * @content 1) 지역변수 2) 인스턴스 변수 3) 클래스 변수
 * 
 * 
 * 			1. 변수 초기화? 변수를 선언하고 처음으로 값을 할당하는 것
 * 			2. 지역 변수는 반드시 초기화해야 사용 가능
 * 			3. 인스턴스 변수와 클래스 변수 는 초기화 하지 않으면 각 자료형의 기본 값으로 초기화 되어져 있다.
 * 
 * 		double 0.0 0.0D
 * 		int byte short 0
 * 		long 0L
 * 		float 0.0F(f)
 *		
 *		String(클래스) == 참조형  null
 *		char  '\u0000'
 *		boolean   false
 */
public class Ex10 {
	 
	double avg; //인스턴스 변수
	 static double rate; //클래스 변수
	 
	public static void main(String[] args) {
		
		// 지역변수
		String name ="홍길동";
		System.out.println(name);
		
		System.out.println( Ex10.rate );  //double 기본값 0.0
		
		Ex10 obj = new Ex10();
		System.out.println(obj.avg);
		
		
		
	}//main

}//class
