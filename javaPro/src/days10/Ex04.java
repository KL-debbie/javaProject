package days10;

import java.util.Arrays;

/**
 * @author KL
 * @date 2023. 7. 26. - 오후 2:01:17
 * @subject
 * @content
 */
public class Ex04 {
	public static void main(String[] args) {
		int [] m = {3, 5, 2, 4, 1};
		
		System.out.println(Arrays.toString(m));
		
		//추가(append)
		//[삽입 insert]
		int index =2;
		int n =100;   //==>[3, 5, 100, 2, 4, 1]  방 크기 늘린 후 2, 4, 1을 다음방으로 옮긴 후 100을 삽입
		
	
			int [] temp = new int[m.length+1];
			
			/* 방법 1
			System.arraycopy(m, 0, temp, 0, index);
			temp[index] =100;
			System.arraycopy(m, index, temp, index+1 , m.length-index);
			m =temp;
			*/
	
		// 방법 2)
		// m - [3,5,2,4,1]
		// temp
		for (int i = 0; i < m.length; i++) {
			if( index > i) { temp[i] = m[i]; }
			else if (index<=i) { temp[i+1] = m[i];}
		} // for
		
		temp[index] = 100;
		m= temp;
		
		System.out.println(Arrays.toString(m));
	} // main

}//class
