package util;

public class Draw2D {

	// 2D로 그리기 작업을 할 수 있는 모든 기능들을 구현한 클래스
	// *** [함수 선언] *** 3가지 고려 후
	// 1) 기능: 선 긋는 함수  drawLine
	// 2) 매개변수 X
	// 3) 리턴값(리턴자료형) : X void

	public  static void drawLine() {
		// 구분선(100줄)
		System.out.println("---------------");
	}

	// Duplicate method drawLine() in type Ex08_02
	// 이 클래스 내에 동일한 함수 중복 선언
	// 똑같아도 상관없지만 시그니처가 같으면 안됨 (매개변수 갯수,자료형이 다르면 다른 함수로 인식)
	public  static void drawLine(int n) {
		// 구분선(100줄)
		System.out.println();
		for (int i = 1; i <=n; i++) {
			System.out.print("-");   // 원하는 길이만큼 선긋기 가능
		} // for
		System.out.println();
	}

	public  static void drawLine(int n, char style) {   // 중복 함수, 오버로딩
		// 구분선(100줄)
		System.out.println();
		for (int i = 1; i <=n; i++) {
			System.out.print(style);   // 원하는 스타일의 길이만큼 선긋기 가능
		} // for
		System.out.println();
	}

}
