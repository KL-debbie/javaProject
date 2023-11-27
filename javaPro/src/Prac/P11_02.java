package Prac;


/**
 * @author KL
 * @date 2023. 7. 16. - 오전 12:35:04
 * @subject P 42 증감 연산자ㄴ
 * @content
 */
public class P11_02 {

	public static void main(String[] args) {
		int score = 10;

		System.out.println("score 값 : " + ++score);      // ++score  1+score = score => 11
		System.out.println("score 값 : " + score++);      
		System.out.println("score 값 : " + score);         // 왜 12???
		
		
	}

}
