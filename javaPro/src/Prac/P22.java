package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오후 1:41:34
 * @subject p 68 중첩 for문
 * @content
 */
public class P22 {

	public static void main(String[] args) {
		int dan = 2;
		System.out.println("=="+ dan + "단==");
		
		for(int i = 1; i <=9;  i++) {
			// for(int i = 1; i <=9; dan++) {                  //dan 변경시 무한대로 곱셈 값 도출
			System.out.println(dan + " X " + i + " = " +(dan*i));
		}
		
		
	}
}
