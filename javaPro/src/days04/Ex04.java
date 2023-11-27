package days04;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 18. - 오전 11:44:03
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// 국어 점수를 kor 변수에 입력 받아
		// 등급(grade)을 출력
		// 0~ 59 가
		// 60~69 양
		// 70~79 미
		// 80~89 우
		// 90~100수 

		int kor;
		

		try (Scanner sc = new Scanner(System.in)){

			System.out.print("점수 입력 ");
			kor = sc.nextInt();
			
			// The operator <= is undefined for the argument type(s) boolean, int
			// int ,boolean 비교연산 사용 불가능하다.
			if (0 <= kor && kor <= 100 ) {
				// 수우미양가 등급
				// 중첩 if문 (condition)  사용가능{}
				if (90 <= kor) {   // 정해진 수식안에 있으므로 kor <= 100은 생략 가능
					System.out.println("수");
				} // if
				if ( 80 <= kor && kor < 90) {    // 88점 입력 첫 if문 실행 x-> 두번째 if문 실행, 그 이후도 모두 실행함 -> 하나가 만족하여 실행할 필요가 없음 이때 else if문 사용함..........)
					System.out.println("우");
				} // if
				if (70 <= kor && kor <= 79) {
					System.out.println("미");
				} // if
				if (60 <= kor && kor <= 69) {
					System.out.println("양");
				} // if
				if (kor <= 59) {
					System.out.println("가");
				} // if
			} else {
				
				System.out.println("국어 점수 잘못 입력 ");
			}

			} catch (Exception e) {
				e.printStackTrace();  




			}

			} // main

		} //class
