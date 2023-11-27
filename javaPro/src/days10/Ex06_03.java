package days10;

import java.util.Arrays;
import java.util.Random;

/**
 * @author KL
 * @date 2023. 7. 26. - 오후 3:46:57
 * @subject
 * @content
 */
public class Ex06_03 {
	public static void main(String[] args) {

		int [] tots = new int[10];
		int [] ranks = new int[10];

		Arrays.fill(ranks, 1);

		Random rnd = new Random();
		// 0~300 무작위
		for (int i = 0; i < tots.length; i++) {
			int tot = rnd.nextInt(301);
			tots[i] = tot;

		} // for

		System.out.println(Arrays.toString(tots));


		//등수 처리
		// 한 학생의 총점가지고 나머지 총점 비교
		for (int i = 0; i < ranks.length; i++) {
			ranks[i] =1;
			for (int j = 0; j <ranks.length ; j++) {
			//	if(i==j) continue;
				// 성능저하
				if( tots[i] < tots[j] ) {
					ranks[i] ++;
				}
			} // for
		} // for

		System.out.println(Arrays.toString(ranks));
	} // main

}//class
