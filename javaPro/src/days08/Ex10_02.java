package days08;

/**
 * @author KL
 * @date 2023. 7. 24. - 오후 4:54:53
 * @subject
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
	
		String rnn = "123456-1234567";
		// 123456-*******
		String [] rnnArr = rnn.split("-");
		
		System.out.printf( "%s-*******\n", rnnArr[0] );
		
		// 123456-1******
		System.out.printf( "%s-%c******\n", rnnArr[0] , rnn.charAt(7));
		System.out.printf( "%s-%c******\n", rnnArr[0] , rnnArr[1].charAt(0));
		
		System.out.println(   rnn.substring(  0,8  )+"******");
		
	}//main

}//class
