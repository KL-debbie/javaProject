package days11;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author KL
 * @date 2023. 7. 27. - 오후 12:28:03
 * @subject 버블정렬,선택정렬
 * @content 
 */
public class Ex05 {
	
	public static void main(String[] args) {
		
		int [] m = {3,5,2,4,1};
		 bubbleSort(m);
		
		//선택정렬
		// selectionSort(m);
		//selectionSort2(m);
		
	} // main
	
	private static void selectionSort2(int[] m) {
		// 0  1  2  3  4    index
		// 3  5  2  4  1    element
		// i= 0선택
		//0-1 0-2 0-3 0-4   가장작은 숫자 위치값과 선택한 자리와 비교 자리바꿈 최소화- 한번만하기
		
		for (int i = 0; i < m.length-1;i++) {  //선택위치
			int minIndex = i;
			for (int j = i+1; j < m.length; j++) {
				if(m[minIndex] >m[j]) minIndex =j;
				
			} // for
			int temp = m[i];
			m[i] =m[minIndex];
			m[minIndex]= temp;
			System.out.println(Arrays.toString(m));
		} // for
		
		
	}

	private static void selectionSort(int[] m) {
		// 0  1  2  3  4    index
		// 3  5  2  4  1    element
		// [1]  5  3  2  4   1회전시
		// [1] [2] 5  4  3    2회전시
		// [1] [2] [3] 5  4  3회전시
		// [선택] 
		//0-1 0-2 0-3 0-4 앞에가 크면 자리바꿈   1  5  3  2  4 (1회전)
		//1-2 1-3 1-4                              [1] [2] 5 4  3(2회전)
		//2-3 2-4                                    [1] [2] [3] 5  4(3회전)
		//3-4                                         [1] [2] [3] 4   5(4회전)
		
		for (int i = 0; i <m.length-1 ; i++) {
			for (int j = i+1; j <m.length; j++) {
				System.out.printf("%d -%d   ",i, j);
				if(m[i] > m[j]) {
					System.out.print("  ***  ");
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
					
				}
			System.out.println(Arrays.toString(m));
		} // for
		System.out.println();
	
		}
		}

	// 버블정렬
	public static void bubbleSort(int[]m) {
		
		//  i-i+1
		// 0 1 2 3      1회전 비교  1   -4
		// 0 1 2         2회전       2   -3 
		// 0 1           3회전       3   - 2
		// 0              4회전       4    1
		
		// a>b 오름차순  12345
		// a<b 내림차순  54321
		for (int i = 1; i <=4; i++) {
			for (int j = 0; j <=4-i; j++) {
				System.out.printf("%d -%d   ",j, j+1);
				if(m[j] > m[j+1]) {
					System.out.print("  ***  ");
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				}
				System.out.println(Arrays.toString(m));
			} // for
			System.out.println();
		} // for
	}

}//class
