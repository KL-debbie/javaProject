package days22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Ex15_02 {
	
	public static void main(String[] args) {
		
		/*
		 * 게임횟수를 입력받아 로또 번호를 출력하는 코딩을 하세요 . 
          게임 횟수 입력 ? 3
	       
	      1게임 : [17][9][4][15][16][38]   
	      2게임 : [17][9][4][15][16][38]   
	      3게임 : [17][9][4][15][16][38]   
		 */
		
		int gameNumber =1;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("> 게임 횟수 입력 ?");
		gameNumber = sc.nextInt();
		
		ArrayList lottos = new ArrayList();
		
		LinkedHashSet lotto;
		for (int i = 0; i < gameNumber; i++) {
			lotto = new LinkedHashSet();
			Ex15.fillLotto(lotto);
			lottos.add(lotto);
		} // for
		
		
		//출력
		/*
		for (int i = 0; i < gameNumber; i++) {
			lotto = (LinkedHashSet) lottos.get(i);
			System.out.printf("%d게임 : ", i+1);
			Ex15.dispLotto(lotto);
		} // for
		*/
		
		dispLottos(lottos);
		
	} // main

	private static void dispLottos(ArrayList lottos) {
		Iterator ir=lottos.iterator();
		while (ir.hasNext()) {
			LinkedHashSet lotto = (LinkedHashSet) ir.next();
			Ex15.dispLotto(lotto);
		}
		
	}

		
}//c
