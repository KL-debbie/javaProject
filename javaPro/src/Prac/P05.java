package Prac;

/**
 * @author KL
 * @date 2023. 7. 15. - 오후 10:17:37
 * @subject p28 변수 초기화 / 이미 변수에 할당 된 값이 있을때 다른 값 할당하면 새로운 값으로 덮어쓰기 됨
 * @content
 */
public class P05 {

	public static void main(String[] args) {

		int javaScore;
		javaScore = 90;
		// Duplicate local variable javaScore 
		// 중복된 로걸 변수 -> 이름 바꿔주기
		int javaScore1;
		javaScore1 = 45;
		
		// The method println(int) in the type PrintStream is not applicable for the arguments (int, int)
		// PrintStream 형식의 printl(int) 메서드는 인수에 적용되지 않음
		// System.out.println(javaScore,  javaScore1);
		
		
		System.out.println(javaScore);
		System.out.println(javaScore1); // 따로따로 작성하여 도출해내기 혹은 변수 선언 후 결과 도출 (P05_01확인)
	}
}
