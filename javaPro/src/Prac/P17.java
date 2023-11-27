package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오전 11:11:57
 * @subject P 54-56 if 제어문
 * @content
 */
public class P17 {
	
	public static void main(String[] args) {
		
		// 형식 if(조건식){ 수행문; }
		
		int Avg = 80;
		char grade = 'A';
		
		if (Avg <= 80) {                      // if문 서술 조건이 참인 경우에만 {} 지정된 수행문 실행됨
		
			if(Avg <= 90) {
				System.out.print("고득점");
			}
				System.out.println("합격");	
	
			
		}
	}

}
