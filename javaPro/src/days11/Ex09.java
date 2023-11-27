package days11;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 27. - 오후 4:41:54
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		//days08.Ex09_03.java 로또 코딩 예제
		Scanner scanner = new Scanner(System.in);

		int [][] lottos;
		int number=0;
		int count =0;

		System.out.println(">로또 게임 횟수 입력 ? ");
		int gameNumber = scanner.nextInt();

		lottos = new int[gameNumber][6];
		
		/*
		lottos[number][0]= 1 ;
		lottos[number][1]= 2;
		lottos[number][2]= 3;
		lottos[number][3]= 4;
		lottos[number][4]= 5;
		lottos[number][5]= 6;
		
		number++;
	*/
		
	//	fillLottos(lottos);

		dispLottos(lottos);


	} // main

	private static void dispLottos(int[][] lottos) {
		for (int i = 1; i < lottos.length; i++) {
					int number;
					number = (int)(Math.random()*45)+1;
					System.out.printf("[%d 게임]\t=[%d]\n", i, lottos[number]);
			
		} // for
		System.out.println();
	}


}//class
