package days10;

import java.util.Arrays;

/**
 * @author KL
 * @date 2023. 7. 26. - 오후 12:14:01
 * @subject  배열 크기 늘리기
 * @content
 */
public class Ex03_03 {
	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5};
		int [] arrCopy = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arrCopy));
				
		int  [] m = new int[3];
		m[0]=5;
		m[1]=3;
		m[2]=7;

		
		int index = 3;
		
		if ( index == m.length) { // 배열이 다 찼음
			int [] temp = new int[  m.length+3  ];
			
			// System.arraycopy(m, 1, temp,4,2);// 배열복사 원하는 갯수만큼 원하는 자리에 복사
			                       //  어디서부터, 어디에, 어디까지, 몇개  m 첫번째 방에서부터 4번째 방부터 채워넣음 2개 복사
			
			System.arraycopy(m, 0,temp ,0, m.length);
			// Arrays 클래스 = 배열을 다루기 쉽도록 기능이 구현된 클래스
			m = temp;
			
		}

		m[3]=10;
		System.out.println(Arrays.toString(m));
	} // main

}//classss
