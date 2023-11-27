package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오전 10:33:42
 * @subject P 49 조건 연산자
 * @content
 */
public class P15 {

	public static void main(String[] args) {
		int month = 12;
		System.out.print(month + "월은 ");
		System.out.print((month == 3 || month == 4 || month == 5) ? "봄입니다" : "");
		System.out.print((month == 6 || month == 7 || month == 8) ? "여름입니다" : "");
		System.out.print((month == 9 || month == 10 || month ==  1) ? "가을입니다" : "");
		System.out.print((month == 12 || month == 1 || month == 2) ? "겨울입니다" : "");
	
	}

}
