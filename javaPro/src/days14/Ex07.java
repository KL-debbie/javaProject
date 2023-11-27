package days14;

/**
 * @author KL
 * @date 2023. 8. 1. - 오후 2:11:10
 * @subject [ static 키워드 ]
 * @content  	필드 앞			:   
 * 					메서드 앞		:
 * 					클래스 앞		:
 */
public class Ex07 {

	public static void main(String[] args) {
		
		// [우리반 ] -> 기업은행 -> 보통예금
		// Save 클래스 선언 : 저축
		// 인스턴스 변수 일때 -> 객체명.필드, 객체명.메서드
		// 클래스 변수 - 클래스명.static필드
		
		//1) 왜 rate 이자율 왜 static 필드로 선언?
		// == static 필드 언제 사용?
		//언제 선언??프로그램 시작이 바로 선언
		
		// 2) 정적(static)메서드는 언제 사용?
		// 객체를 하나도 생성한해도 클래스명 접근 시 사용
		// private 접근 자체를 못함
		// 클래스가 만들어질때의 메서드
		// 필드 사용을 위해 ststic 메서드 생성
		
		//1) static필드를 사용하기

		
		
		Save.setRate(0.08);
		
		
		Save s1 = new Save("주강민", 1000, 0.04);
		Save s2 = new Save("정하영", 1500, 0.04);
		Save s3 = new Save("임경재", 34500, 0.04);
		Save s4 = new Save("이지현", 5000, 0.04);
		Save s5 = new Save("이준희", 21000, 0.04);
		
		//Save.setRate(0.08)
		;
		s1.setRate(0.06);
		s1.dispSave();
		s2.dispSave();
		s3.dispSave();
		s4.dispSave();
		s5.dispSave();
	
		
		// 클래스 배열로 선언
		/*
		Save [] ss = new Save[5];
		ss[0] = new Save("주강민", 1000, 0.04);
		ss[1] = new Save("정하영", 1500, 0.04);
		ss[2] = new Save("임경재", 34500, 0.04);
		ss[3] = new Save("이지현", 5000, 0.04);
		ss[4] = new Save("이준희", 21000, 0.04);
		*/
		
		/*
		// 클래스 배열 초기화
		Save [] ss = {
				new Save("주강민", 1000, 0.04),
				new Save("정하영", 1500, 0.04),
				new Save("임경재", 34500, 0.04),
				new Save("이지현", 5000, 0.04),
				new Save("이준희", 21000, 0.04)
		};
		
		for (int i = 0; i < ss.length; i++) {
			ss[i].dispSave();
		} // for
		*/
		
		// [  파악  ] 모든 사람의 이자율(rate)은 동일할 것이다.
		// Save 객체가 생성될 때 마다 rate(8byte) 필드는 필요 없음
		// Save 클래스 당 1개만 rate 필드 생성해서 모든 인스턴스(객체)가 공유해서 사용할 필드 선언
		
		
	} // main
	
}//class
