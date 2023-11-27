package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오후 12:18:26
 * @subject P if ~else if문
 * @content
 */
public class P19_02 {
	public static void main(String[] args) {
	
		int month= 9;
		
		if ( month  >= 5) {
			System.out.println(month +"월은 봄이다");      // 조건식 참이면 실행 (1)
		} else if(month <= 8) {                                    
			System.out.println(month +"월은 여름이다");  // 조건식 참이면 실행 (2)
		} else if( month >= 9) {
			System.out.println(month +"월은 가을이다");                // 조건식 참이면 실행 (3)
		} else {
			System.out.println(month + "아무것도 아닙니다.");        // 참인 조건식이 하나도 없으면 실행 (4)
		}
		
		
		
	}

}
