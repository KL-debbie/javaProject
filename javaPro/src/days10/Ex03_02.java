package days10;

import java.util.Arrays;

/**
 * @author KL
 * @date 2023. 7. 26. - 오후 12:14:01
 * @subject  배열 크기 늘리기
 * @content
 */
public class Ex03_02 {
	public static void main(String[] args) {
		
		int  [] m = new int[3];
		
		m[0]=5;
		m[1]=3;
		m[2]=7;
		
		
		// ArrayIndexOutOfBoundsException
		// m[3]=10;
		int index = 3;
		if ( index == m.length) { // 배열이 다 찼음
			int [] temp = new int[  m.length+3  ];
			// temp[0] = m[0];
			// temp[1] = m[1];
			// temp[2] = m[2];
			for (int i = 0; i <m.length; i++) {
				temp[i]=m[i];
			} // for
			m= temp;
		}
	
		// 1. 원래 배열 크기 +3   증가
		// [5] [3] [7]
		//  []   []  [] [] [] []                [] temp
		
		// 2. m ->temp 요소 복사
		// 3. temp 배열을 m배열로 바꾸는 코딩
		m[3]=10;
		System.out.println(Arrays.toString(m));
	} // main

}//classss
