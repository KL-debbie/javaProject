package days03;

/**
 * @author KL
 * @date 2023. 7. 17. - 오후 1:50:22
 * @subject 논리연산자
 * @content   참/거짓---> boolean
 *                  1)  일반 논리 연산자
 *                      ㄱ. &&  -> 일반 논리 AND 연산자    (둘 다 참일 경우에만 '참') -- 논리곱
 *                          참 && 참     => 참
 *                          참 && 거짓   => 거짓
 *                          거짓 && 참   => 거짓
 *                          거짓 && 거짓 => 거짓
 *                          
 *                      ㄴ.||     -> 일반 논리 OR 연산자      (둘 다 거짓일 경우에만 '거짓')  -- 논리합
 *                          참 || 참     => 참
 *                          참 || 거짓   => 참
 *                          거짓 || 참   => 참
 *                          거짓 || 거짓 => 거짓 
 *                          
 *                      ㄷ. !     -> 부정(NOT) 연산자
 *                          !참    => 거짓
 *                          !거짓  => 참
 *                          
 *                  2) 비트 논리 연산자 : &  ^  |  ~

 */
public class Ex05_04 {

	public static void main(String[] args) {
		
		
		// 연산자 우선 순위 예 ) * > +
		// 산술 > 비교 > 논리 > 대입
		/*
		System.out.println(  3 <= 5  &&  10 > 1  );   // true
		System.out.println(  3 <= 5  &&  10 < 1  );   // false
		
		경고 : Dead code
		                               거짓            참/거짓
		System.out.println(  3 >= 5  &&  10 > 1  );   // false    노란줄 이유?   앞 코드가 거짓이면 뒤 코드가 참/거짓이든 뭐가 와도 확인을 안하고 넘어감
		System.out.println(  3 >= 5  &&  10 < 1  );   // false
		*/
		
		/*
		System.out.println(  3 <= 5  ||  10 > 1  );   // true
		System.out.println(  3 <= 5  ||  10 < 1  );   // true
		System.out.println(  3 >= 5  ||  10 > 1   );   // true 
		System.out.println(   3 >= 5  ||  10 < 1  );   // false
		*/
		
		
		// The operator ! is undefined for the argument type(s) int
		// !(부정연산자 NOT)은 int 피연산자에 사용할 수 없다.
		// !boolean 에서만 앞에 사용 가능
		// System.out.println(  !3 <= 5  );   // false
		// 비교  >  논리
		// <=        !
		// ! 부정연산자는 단항 연산자로 어떤 (이항,삼항 연산자)연산자보다 우선순위가 높음
		System.out.println(  ! (3 <= 5)  );   // false 
		
		
		
	} //main
	
	
	
}//class
