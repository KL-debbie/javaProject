package days22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

public class Ex15 {
	
	public static void main(String[] args) {
		//로또게임 days08.Ex09_03
		
	   // HashSet lotto = new HashSet();
	    LinkedHashSet lotto = new LinkedHashSet();    //순서는 유지 중복은 체크		
	      fillLotto(lotto); 
	      dispLotto(lotto);
	      
	  }//main

	public static void dispLotto(HashSet lotto) {
		Iterator ir=lotto.iterator();
		while (ir.hasNext()) {
			int n = (int) ir.next();
			System.out.printf("[%d]",n);
		}//while
		System.out.println();
	}

	public static void fillLotto(HashSet lotto) {
		Random rnd = new Random();
		while (lotto.size() < 6) {
			int n = rnd.nextInt(45)+1;
			lotto.add(n);
		}
	}

}//c
