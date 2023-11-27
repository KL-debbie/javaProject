package days08;

/**
 * @author KL
 * @date 2023. 7. 24. - 오후 5:11:31
 * @subject
 * @content
 */
public class Ex11 {
	
	public static void main(String[] args) {
		
		//[정보처리 기사 실기]
		int money = 125760;
		
		// 화폐단위 : 5만원 1만원 5천원 1천원 5백원 1백원 5십원 1십원 5원 1원
		int count =0;  //화폐수령
		// 5만원 : 2개
		count = money/50000;
		System.out.printf("5만원 : %d개\n", count);
		money %=50000;  // 나머지값
		// 1만원 : 2개
		count = money/10000;
		System.out.printf("1만원 : %d개\n", count);
		money %=10000;
		// 5천원 : 1개
		count = money/5000;
		System.out.printf("5천원 : %d개\n", count);
		money %=5000;
		// 1천원 : 0개
		// 5백원 : 1개
		// 1백원 : 2개
		// 5십원 : 1개
		// 1십원 : 1개
		//   5원 : 0개
		//   1원 : 0개
			
	} // main

}//class
