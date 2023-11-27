package days16;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 8. 3. - 오후 4:40:34
 * @subject  			[ 개발자가 고의로 예외 발생 시키기-강제 ]
 * @content
 */
public class Ex15_03_01 {
	
	public static void main(String[] args)  {
		
		try {
			
			int kor = getScore();
			System.out.println(kor);
			
		}
		catch (ScoreOutOfBoundException e) {
			
		System.out.println( e );    // (">점수 범위(0~100) 벗어났다. <");
		
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	
		System.out.println(" end ");
	} // main

	 public static int getScore() throws ScoreOutOfBoundException {
		 
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("국어점수 입력 ? ");
		
		String input = sc.next();
		String regex = "100|[1-9]?\\d";
		
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
			return score;
		} else {
			//개발자 강제 예외 발생
			throw new ScoreOutOfBoundException (">점수 범위(0~100) 벗어났다. <");
		} //else
		
	}

}//class
