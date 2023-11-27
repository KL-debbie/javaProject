package days11;

import java.util.Arrays;

/**
 * @author KL
 * @date 2023. 7. 27. - 오전 10:43:56
 * @subject 복습 3번
 * @content
 *       // 검색(Search)
		// 1. 순차검색( sequential Search )
		// 2. 이진검색( binary Search )        +  정렬(필수)
 */
public class Ex02 {

	public static void main(String[] args) {

		int [] m = {3,5,2,4,1};
		// 정수 4가 있는 위치에 100 삽입 코딩
		int n=4;
		int index = sequentialSearch(m,n);
		System.out.println(">index : " + index);

		//System.arraycopy(args, index, m, index, n);
		int [] temp =new int [m.length+1];

		for (int i = 0; i < m.length; i++) {
			temp[index>i?i:i+1] = m[i]; 
			
			/*
			if(index >i) temp[i]=m[i];
			else if( index<=i) temp[i+1]=m[i];
			*/
			
		} // for
		temp[index]=100;
		m=temp;

		System.out.println(Arrays.toString(temp));

	} // main

	private static int sequentialSearch(int[] m, int n) {
		int index = -1;
		for (int i = 0; i < m.length; i++) {
			if( n == m[i]) {
				index = i;
				break;
			}
		} // for
		return index;
	}

}//class
