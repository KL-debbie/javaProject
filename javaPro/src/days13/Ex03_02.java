package days13;

/**
 * @author KL
 * @date 2023. 7. 31. - 오전 11:25:28
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		// 배열 에러
		// java.lang.ArrayIndexOutOfBoundsException
		// 배열 갯수 오류 m[0], m[1] 만 존재
		// int [] m = new int[2];
		
		//java.lang.NullPointerException
		// int 값 참조하고 있지 않음
		int [] m = null;
		m[2] = 100;
		System.out.println(m[2]);
		
		
	}//main

}
