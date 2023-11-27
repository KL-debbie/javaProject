package days12;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 24. - 오후 3:20:09
 * @subject   days08 09_02
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int [][] lottos;      
		
		System.out.print(">로또 게임 횟수 ");
		int gameNumber =sc.nextInt();   
		lottos = new int[gameNumber][6];
		
		for (int i = 0; i < lottos.length; i++) {
			fillLotto( lottos[i] );
		} // for
		
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("[%d 게임]    ",i+1);
			dispLotto(lottos[i]);
		} // for
		
	} // main

	public static void fillLotto(int [] lotto) {
		int index =0;
		int lottoNumber = (int)(Math.random()*45)+1;
		lotto[index++] = lottoNumber;
		boolean flag =false; //로또번호가 중복되면 true 값 할당

		while (index <= 5) {
			flag =false;
			lottoNumber = (int)(Math.random()*45)+1;

			// 중복값 확인
			for (int i = 0; i < index; i++) {
				if(lotto[i]== lottoNumber) {
					flag = true;
					break;
				}
			} // for
			if( !flag ) lotto[index++] = lottoNumber;
		} //while
	}

	public static void dispLotto(int[] lotto) {  
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%02d]",  lotto[i]);
		} // for
		System.out.println();
	}

}//class
