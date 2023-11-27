package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오전 10:48:37
 * @subject P 52 자동, 강제 변환
 * @content
 */
public class P16_02 {
	public static void main(String[] args) {
	
		char grade = 'A';
		int age = grade;
		System.out.println("char -> int : " +  age);
		
		int int1 = 90;
		char char1 = (char) int1;
		System.out.println("int -> char : " + char1);
	}

}
