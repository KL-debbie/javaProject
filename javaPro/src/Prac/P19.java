package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오후 12:18:26
 * @subject P if ~else if문
 * @content
 */
public class P19 {
	public static void main(String[] args) {
		
		/* if ~else if 문
		 * if( 조건식1 ) { 수행문 1; }
		 * else if ( 조건식2 ) { 수행문 2; }
		 * else if ( 조건식3 ) { 수행문 3; }
		 * else { 기본 수행문 ; }
		 */
		
		int age = 45;
		
		if ( age >= 60) {
			System.out.println("연금 수령 가능합니다.");      // 조건식 참이면 실행 (1)
		} else if(age <= 25) {                                    
			System.out.println("연금 수령이 불가능합니다.");  // 조건식 참이면 실행 (2)
		} else if( age > 45) {
			System.out.println("동갑입니다.");                // 조건식 참이면 실행 (3)
		} else {
			System.out.println("아무것도 아닙니다.");        // 참인 조건식이 하나도 없으면 실행 (4)
		}
		
		
		
	}

}
