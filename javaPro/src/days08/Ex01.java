package days08;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 24. - 오전 9:44:37
 * @subject 복습 2
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		int kor = getKor();
		int eng = geteng();
		 */

		try(Scanner sc = new Scanner(System.in)) {
			// 프로세스 종료전까지만 사용

			int kor = getScore(sc, "국어");
			
			//국어 점수 등급
			char grade= getGrade(kor);
			System.out.printf(">kor= %d garde=%c\n", kor, grade);
			
			//int eng = getScore(sc, "영어");
		//int mat = getScore(sc, "수학");

		//	System.out.printf(">kor= %d eng= %d mat= %d", kor, eng, mat);
			//java.util.NoSuchElementException

		} catch (Exception e) {
			e.printStackTrace();
		}//catch

	}//main
	
	private static char getGrade(int score) {
		char grade = '가';
		
		switch(score/10) {
		case 10: case 9: grade ='수'; break;
		case 8:  grade ='우'; break;
		case 7: grade ='미'; break;
		case 6: grade ='양'; break;
		}//switch 
		
		return grade;
	}

	//
	public static int getScore(Scanner sc, String subject) {

		int score = 0;
		boolean flag = false;
		String inputData ;
		String regex = "100|[1-9]?\\d";

		do {
			if (flag) {
				System.out.printf(">> 점수 잘못 입력(0~100까지) 다시 입력");
			} //if

			System.out.printf(">%s 점수 입력하세요",subject);
			inputData=sc.next();
			flag = true;

			// 유효성 검사..
		} while (!inputData.matches(regex));

		score =Integer.parseInt(inputData);
		return score;

	}//getScore

} //class
