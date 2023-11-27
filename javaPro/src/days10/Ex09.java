package days10;

/**
 * @author KL
 * @date 2023. 7. 26. - 오후 5:08:50
 * @subject
 * /*
		 * 1. 1차원, 2차원, 3차원 배열(다차원 배열)
		 * 2. 정렬(SORT) 
		 * 3. 검색(SEARCH)
		 * 4. 다차원 활용 예제
		 * 
		 * 클래스 수업(5-6장 읽기)
		 
 * @content
 */
public class Ex09 {
	public static void main(String[] args) {
		
		// 문제) int [] m  = new int[30];        0~9  임의의 정수
		// 0 - 3개
		// 1 - 0개
		// :
		// 9 - 4개
		int unit = 0;
		int count =0;
		boolean sw = false;
		
		int [] m  = new int[30]; 
		
		for (int i = 0; i < m.length; i++) {
			m[i] = (int)(Math.random()*10);
			System.out.print(m[i]);
			
			for (int j = 0; j <=9; j++) {
				while (sw) {
					count = m[i]/unit;
					System.out.printf("%d = %d개\n", unit,count);
					m[i] %=unit;
					unit /= sw? +1:0;
					sw = !sw;
				}
			} // for
		
			
		} // for
		
		
	} // main

}//class
