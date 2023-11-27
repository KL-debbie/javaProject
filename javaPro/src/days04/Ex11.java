package days04;

/**
 * @author KL
 * @date 2023. 7. 18. - 오후 5:28:53
 * @subject  배열 초기화
 * @content
 */

public class Ex11 {

	public static void main(String[] args) {
		
		/*
		int [] n = new int[4];
		n[0]=3;
		n[1]=2;
		n[2]=5;
		n[3]=4;
		n[4]=6;
		*/
		
		int [] n = { 3,2,5,4,6 };
		
		for (int i = 0; i < n.length; i++) {
			System.out.printf("n[%d]=%d\n",i, n[i]);
		} // for
		
		

	}//main

}//class
