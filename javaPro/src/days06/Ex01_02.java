package days06;

import java.util.Arrays;
import java.util.Random;

/**
 * @author KL
 * @date 2023. 7. 20. - 오전 10:12:01
 * @subject
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {

		//[문제] 10개의 정수를 임의의 값(5~15)으로 저장 -> 가장 큰 값?
		// 0.0<= Math.random() < 1.0
		// 0.0<= (double)Math.random() <1.0
		// 0 <= (int)Math.random() <1
		// 0 <= (int)(Math.random()*11) <11
		// 5 <= (int)(Math.random()*11)+5 <16
		
		Random rnd= new Random();   //임의의 값을 생성해줌
		
		int [] m = new int[10];
		for (int i = 0; i < m.length; i++) {
			m[i]= rnd.nextInt(11)+5;
			//m[i] = (int)(Math.random()*11)+5;
		} // for
		
			// Random //랜덤하게 숫자를 돌려주는것
			// rnd.nextInt(100); // 0<= rnd.nextInt(100) < 100 
			
			// m 배열의 각 요소를 출력 -> 확인
			System.out.println(Arrays.toString(m)); // 배열을 사용하기 쉽도록 구현된 클래스
		
			// int max = m[0]; 
			 // int min =m[0];
			int max,min;
			max= min= m[0];
			
			for (int i = 1; i < m.length; i++) {  //이미 0번째는 차있음
				if (max<m[i]) {
					max = m[i];
				}else if (min> m[i]) { 
					min = m[i];
				}
			}//for
			
			System.out.println(max);
			System.out.println(min);
			
	}//main

}//class
