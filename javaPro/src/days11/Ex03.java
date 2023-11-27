package days11;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author KL
 * @date 2023. 7. 27. - 오전 11:28:10
 * @subject                                  *******시험1
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {

		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };

		// 순차검색을 사용
		int max = 92;
		// max가 있는 위치(index) 모두 출력
		
		/*
		int beginIndex = 0;
		int index = sequentialSearch(m, max, beginIndex);
		System.out.println("찾은위치(index) : "+ index);
		
		beginIndex =index+1;
		index = sequentialSearch(m, max, beginIndex);
		System.out.println("찾은위치(index) : "+ index);
		
		beginIndex =index+1;
		index = sequentialSearch(m, max, beginIndex);
		System.out.println("찾은위치(index) : "+ index);
		*/
		
		
		// 찾는 값이 없을때 
		int beginIndex =0;
		int index = -1;
		
		boolean flag= false;
		while ( (index =sequentialSearch(m, max, beginIndex)) !=-1 ) {
			flag=true;
			System.out.println("찾은위치(index) : "+ index);
			beginIndex =index+1;
		}
		
		if(!flag) System.out.println("찾는 값 없음");
		
		
		/*
		do {
			index = sequentialSearch(m, max, beginIndex);
		} while (index!=-1);
		*/
		
		
		/*
		while(index != -1) {
			
			index = sequentialSearch(m, max, beginIndex);
			if(index != -1)
			System.out.println("찾은위치(index) : "+ index);
		}
		*/
		
		/*
		ArrayList list = new ArrayList();
		for (int i = 0; i < m.length; i++) {
			if(m[i]==max) //System.out.println(i);
				list.add(i);
		} // for
		System.out.println(list);
		 */

	} // main

	private static int sequentialSearch(int[] m, int n, int beginIndex) {  // 중복함수 어디서부터 찾을것인지 위치 지정 함수
		int index = -1;
		for (int i = beginIndex; i < m.length; i++) {
			if( n == m[i]) {
				index = i;
				break;
			}
		} // for
		return index;

	}

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
