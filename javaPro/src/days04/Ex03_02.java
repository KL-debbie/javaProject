package days04;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 18. - 오전 10:48:05
 * @subject  제어문 if~else 조건 한번만 물어봄...
 * 
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
			
		int n;
		
		try (Scanner scanner = new Scanner(System.in);){
			
			System.out.print("정수입력 ");
			n = scanner.nextInt();
			
			String result = "짝수(even number)";
			if (n%2 !=0) {
				result = "홀수(odd number)";
			} // if   --가장 이상적인 방식
						
			/*
			if (n % 2 == 0) {
				// System.out.printf("n=%d 짝수(even number)",n); // 조건식 참이면
				result = "짝수(even number)";
			} else {
				// System.out.printf("n=%d 홀수(odd number)",n);
				result = "홀수(odd number)";
			}// if
			*/
			
			System.out.printf("n=%d %s",n, result);
			
		} catch (Exception e) {
			
		} // catch
		
				
	} //main

 }// class
