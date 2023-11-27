package days04;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 18. - 오후 3:27:15
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// 국어점수 입력 받아 수우미양가 등급 출력
		// if 문 -> switch문 변경

		int kor;


		try (Scanner sc = new Scanner(System.in)){

			System.out.print("점수 입력 ");
			kor = sc.nextInt();
			char grade = '가';
			// 100        10            
			// 90~99     9
			// 80~89     8
			// 70~79     7
			// 60~69     6 
			// 0~59      0~5
			
			
			
			switch (kor/10) {
			case 10: case 9:
				// case 10, 9:  JDK 14~에서 사용 가능
				grade = '수'; break;
			case 8:
				grade = '우'; break;
			case 7:
				grade = '미'; break;
			case 6:
				grade = '양'; break;
			default :
				grade = '가'; break;
				//break - 제어문 빠져나올때 필요  없으면 밑에 계속 진행
			} //switch
			System.out.println(grade);
			
		} 	catch (Exception e) {
			e.printStackTrace();  

		}//catch

	} //main

} //class
