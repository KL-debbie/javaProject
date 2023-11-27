package days10;

import java.util.Arrays;

/**
 * @author KL
 * @date 2023. 7. 26. - 오후 2:01:17
 * @subject
 * @content
 */
public class Ex04_02 {
	public static void main(String[] args) {
		int [] m = {3, 5, 2, 4, 1};
		/*
		// 수정
		int index = 2;
		m[2] =100;
		*/
		
		//요소 삭제
		int index =2;
		int [] temp = new int[m.length-1];
		System.arraycopy(m, 0,temp, 0, index);
				for (int i = index + 1; i <m.length; i++) {
					temp[index++]=m[i];
		} // for
				m = temp;
		
		System.out.println(Arrays.toString(m));
		
		
	} // main

}//class
