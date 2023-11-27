package days18;

import java.util.Arrays;
import java.util.Collections;

public class Ex01 {

	public static void main(String[] args) {

		int [] m = {3,5,2,4,1};

		System.out.println(Arrays.toString(m));

		//오름차순 정렬하여 출력 
		Arrays.sort(m);   // 매개변수 다형성 오버로딩
		
		System.out.println(Arrays.toString(m));

		/* [1]
		int [] temp = new int[m.length];
	
		for (int i = m.length-1 ; i >=0 ; i--) {
			temp[4-i]=m[i];
		} // for
		
		 System.out.println(Arrays.toString(m));
		 */
		
		//[2]
		//Arrays.sort(m, Collections.reverseOrder()); 
		// The method sort(int[]) in the type Arrays is not applicable for the arguments (int[], Collections.reverseOrder())
		// 기본형 int 배열은 Collections.reverseOrder() 형태로 사용 불가 
		System.out.println(Arrays.toString(m));
		
		//int [] ->Integer[ ]변환
	Integer [] temp= 	Arrays.stream(m).boxed().toArray(Integer[]:: new);
	Arrays.sort(temp, Collections.reverseOrder());

	 System.out.println(Arrays.toString(temp));
	// ㅂ배열을 Stream으로 교체
		
	} // main

}// class