package days03;

/**
 * @author KL
 * @date 2023. 7. 17. - 오후 12:40:15
 * @subject 비교 연산자의 결과값은 항상 true/false (boolean 형)
 * @content  [instance of 비교연산자] - class 수업 진행 시 배울 예정
 */
public class Ex05_03 {

	public static void main(String[] args) {
		
		System.out.println( 10 > 3 );       // true 값 
		System.out.println( 10 < 3 );       // false 값 
		System.out.println( 10 >= 3 );     // true 값 
		System.out.println( 10 <= 3 );     // false 값 
		
		// 주의***
		// =, ! 순서 확인 *****
		System.out.println( 10 == 3 );    // false 값  ==   => 같다
		System.out.println( 10 !=3 );      // true 값   !=     => 다르다
		
		// System.out.println( 10 =!3 );      // =! 부정연산자		
		
	} //main
	
	
	
}//class
