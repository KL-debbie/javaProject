package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오전 10:33:42
 * @subject P 48 조건 연산자
 * @content
 */
public class P15_01 {

	public static void main(String[] args) {
		int score = 85;
		System.out.println(score > 80? "합격" : "불합격");
		
		int javascore = 67;
		String result = javascore > 80? "합격" : "불합격";
		System.out.println("java 시험결과 : " + result);

	}

}
