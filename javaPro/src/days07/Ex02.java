package days07;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 행 갯수 입력 받아 별 그리기
		
		
		/*
		for (int i = 1; i <=4; i++) {
			System.out.println("*".repeat(i));
		} // for
		*/
		
		
		
		try(Scanner scanner =new Scanner(System.in)) {
			System.out.print("> 이등변 행 갯수 입력 ");
			int row=scanner.nextInt();  //row=행
			// 행 -> 열
			// 3 -> 5
			// 4 -> 7
			// 5 -> 9
			// n -> n*2-1
			
			int col = 2*row-1;
			for (int i = 1; i <=row; i++) {
				for (int j = 1; j <=col; j++) {
					if(j+i>=row+1 && j-i<=row-1) System.out.print("*");
					else System.out.print("_");
				} // for
					System.out.println();
				} // for
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}//main

}//class
