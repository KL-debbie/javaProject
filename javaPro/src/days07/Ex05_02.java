package days07;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 21. - 오전 11:45:32
 * @subject
 * @content
 */
public class Ex05_02 {
	
	
	public static void main(String[] args) {
		//[정규표현식 사용]
		// 국어 점수kor을 입력받아 0<=kor<=100 올바른점수
		// 그외는 잘못된 점수
		
		//int [] kors= {99,1,100,101,-90,0};
		String kor="10";
		// String regex="\\d{3}"; // 100-999까지 무조건 참인 결과가 나옴
		// String regex="\\d{1,2}|100";  // 09 이런식도 참으로 나옴
		// String regex="\\d{1}|\\d{2}|100";   위랑 같은식
		// String regex="100|[1-9]\\d|\\d";
		String regex="100|[1-9]?\\d";   // 위랑 같은 식 
		
		System.out.println(kor.matches(regex));
	
		
		/*
		String [] codes = {"[0-100]"};
		boolean flag= false;
		try(Scanner scanner =new Scanner(System.in)) {
			kor = scanner.nextInt();
			System.out.print("점수입력");
		
			for (int j = 0; j < codes.length; j++) {
				flag=codes[j].matches(regex);
				System.out.printf("%d - %d\n 국어점수" , codes[j],flag? "올바른":"잘못된");
		
			} // for
						
		} catch (Exception e) {
			e.printStackTrace();
		}//catch
		
		*/
		
		
	} // main

}//class
