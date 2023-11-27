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
public class Ex15 {
	
	public static void main(String[] args) {
		
		// 1. new 예외클래스()
		// 2. throw 문을 사용해서 예외를 발생시킬 수 있다.
	
		// 예) 국어점수 입력 받아 수~기 등급(성적) 처리.
		// 0<=~<=100점 점수 범위가 벗어나면 강제 예외 발생시켜 처리
		
		
		//System.in.read();
		// public abstract int read() throws IOException;
		// checked 예외 - 어떤식으로든 예외 처리를 해야함
		// Unhandled exception type IOException
	
		// [unchecked 예외]
		int kor = getScore();
		System.out.println(kor);
		/*
		try {
			
			int kor = getScore();
			System.out.println(kor);
			
		}
		catch (InputMismatchException e) {
			
		System.out.println( e );    // (">점수 범위(0~100) 벗어났다. <");
		
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	*/
		System.out.println(" end ");
	} // main

	 public static int getScore() throws InputMismatchException {
		 
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
			throw new InputMismatchException(">점수 범위(0~100) 벗어났다. <");
		} //else
		
	}

}//class
