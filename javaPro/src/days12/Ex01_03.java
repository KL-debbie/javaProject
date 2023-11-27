package days12;

/**
 * @author KL
 * @date 2023. 7. 28. - 오전 10:18:30
 * @subject
 * @content
 */
public class Ex01_03 {
	public static void main(String[] args) {
		
		int [][]m = {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}
				};
		
		//dispM(m);
		
		// 3*4 -> 2*6 변환
		//  2차원 -> 1차원 -> 2차원
		// i 00     j 00
		// i 01     j 01
		// i 02     j 02
		// i 03     j 03
		// i 10     j 04
		// i 11     j 05
		// i 12     j 10
		// i 13     j 11
		
		int [][]n =new int[2][6];
		
		/*
		int i = 4*행+열;
		(4*행+열)/6  (4*행+열)%6
		i/6 (행)  1%6(열)
		*/
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]=n[i][j];
			} // for
		} // for
		
		//dispM(n);
		
	} // main

}
