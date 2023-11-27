package days06;

import java.util.Scanner;

public class Ex01 {
	

	public static void main(String[] args) {

		int a =4;
		int b= 7;
		int c = 12;
		
		if (a>b) {
			if (a>c) {
			System.out.println("a");
			} else {
				System.out.println("c");
			}
		} //if
		
		//삼항연산자
		// int max = a>b?(a>c? a : c) :(b>c? b:c);
		
		// max,min
		/*
		int max = Math.max(a, b);
		max = Math.max(max, c);
		*/
	
		int max = Math.max(Math.max(a, b), c);
		int min = Math.min(Math.min(a, b), c);
	}


} // main


