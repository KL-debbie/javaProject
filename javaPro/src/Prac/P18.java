package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오전 11:23:53
 * @subject if ~ else 문 - 조건식이 거짓인 경우에도 실행하고 싶을 경우 사용
 * @content
 */
public class P18 {

	public static void main(String[] args) {

		/* if ~else 문
		 * if( 조건식 ) { 수행문 1; }  // 조건문이 true인 경우
		 * { else { 수행문 2; }      // 조건문이 false인 경우 
		 */
		
				
		int total = 40;


		if (total >=60 ){
			
			System.out.println("합격");   // 조건식이 'true'

		} 
		else { if(total <= 20){
			
			System.out.println("불합격");   //if문은 거짓, 조건식이 '참'

		} 
		else {                                     // 모두 거짓이면 실행
			
			// Syntax error on token "else", delete this token 잘못된 문자 토큰을 삭제하세요

			System.out.println("불합격 + 패널티");
		}
		

		}		


	} //main

} //class
