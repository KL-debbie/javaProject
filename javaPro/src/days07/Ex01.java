package days07;

public class Ex01 {

	public static void main(String[] args) {

		// 구구단 가로 출력
		// for i =2 단
		//     for j =1  곱셈식
		// i= 1   j=1,2,3~9
		// i= 2   j=1,2,3~9
		/*
				for (int i = 1; i <=9; i++) {
					for (int dan = 2; dan <=9; dan++) {
						System.out.printf("  %d단\t", dan);
						System.out.printf("%d*%d = %d", dan, i, dan*i);
		 */

		/*
				//구구단 세로 출력
				for (int i = 1; i <=9; i++) {
					for (int dan = 2; dan <=9; dan++) {
						System.out.printf("%d단\t",dan);
						System.out.printf("%d*%d=%02d\t", dan, i, dan*i);
					} // for
					System.out.println();
				} // for
		 */

		// 별찍기           공     *
		// __*     i=1  j=2 j=1
		//_***    i=2        j=3
		//*****
		/*
				for (int i = 1; i <=3; i++) {
					for (int j = 1; j <3-i; j++) {
						System.out.print("_");
					}
					for (int j = 1; j <2*i-1; j++) {
						System.out.print("*");
					} // for
					System.out.println();
				} // for
		 */

		//*
		//**
		//***
		//****
		/*
		for (int i =1 ; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				// if(i==j) System.out.print("*");
				if(i==j) System.out.print("*");
				else System.out.print("_");
			} // for
		} // for
		*/
		
		// 이등변 삼각형 모양
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=5; j++) {
				if(j+i>=4 && j-i<=2) System.out.print("*");
				else System.out.print("_");
			} // for
				System.out.println();
			} // for
		}
	}


