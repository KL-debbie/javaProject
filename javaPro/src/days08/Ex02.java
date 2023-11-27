package days08;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5,6));
		System.out.println(sum(new int[] {1,2}));

		char one = 'x';
		
		char upperOne = myUpperCase(one);
		System.out.println(upperOne);
	}

	public static char myUpperCase(char one) {
		if ('a'<= one && one<='z') {
			one = (char) (one-32);
		} //if
		return one;
		/*
		char UpperCaseOne = one;
		// return Character.toUpperCase(one);
		if (Character.isLowerCase(one)) {  // 소문자인지 물음
			//UpperCaseOne = Character.toUpperCase(one);
			one = Character.toUpperCase(one);
		} //if
		return one;
		*/
	}

	private static int sum( int...args) {  // 가변인자는 1개 매개변수는 무조건 마지막에..
		int result = 0;
		
		/*
		for (int i = 0; i < args.length; i++) {
			result  += args[i];
		} // for
		*/
		
		// foreach문(확장 for문)
		for(int i : args) {
			result +=i;
		}//foreach
		return result;
	}

}
