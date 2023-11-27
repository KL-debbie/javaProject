package days10;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author KL
 * @date 2023. 7. 26. - 오후 2:40:48
 * @subject   카드 섞기(화투)
 * @content
 */
public class Ex05 {
	
	public static void main(String[] args) {
		int [] m = new int[10];
		for (int i = 0; i < m.length; i++) {
			m[i]  = i+1;
		} // for 
		
		System.out.println(Arrays.toString(m));
		
		// 0~9 x 10번
		shuffle(m);
		
		System.out.println(Arrays.toString(m));
		} // main 
	

	private static void shuffle(int [] m) {
		// 0 ~m.length-1
		
		int idx, temp;
		
		for (int i = 0; i < 10; i++) {
			idx = (int)(Math.random()*9)+1;
			temp = m[0];
			m[0 ] = m[idx];
			m[idx] = temp;
		} // for
		
		/* 문제점 ridx1 == ridx2
	private static void shuffle(int [] m) {
		// 0 ~m.length-1
		int ridx1, ridx2, temp;
		
		for (int i = 0; i < 10; i++) {
		ridx1 =(int)( Math.random()*m.length);
		ridx2 =(int)( Math.random()*m.length);
		
		if(ridx1==ridx2) { 
			i--;
			continue;
		}
		
		temp = m[ridx1];
		m[ridx1 ] = m[ridx2];
		m[ridx2] = temp;
		} // for
		*/
		
		
	}

}
