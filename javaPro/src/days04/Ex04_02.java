package days04;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 18. - 오전 11:44:03
 * @subject
 * @content
 */
public class Ex04_02 {

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
				// else if는 계속 추가가능,,,,
				// 어느 하나라도 만족하면 그 이후에는 처리하지 않음 == else if문
				char grade = '가';

				if (90 <= kor) {              // 정해진 수식안에 있으므로 kor <= 100은 생략 가능
					//System.out.println("수");
					grade = '수';
				} else if ( 80 <= kor) {   //kor = 88 이미 수식에 포함되므로 kor <=89 생략가능
					//System.out.println("우");
					grade = '우';
				}else if (70 <= kor) {
					//System.out.println("미");
					grade = '미';
				}else if (60 <= kor) {
					//System.out.println("양");
					grade = '양';
				}else  {
					//System.out.println("가");
					// grade = '가';     '가'는 이미 할당되어 있으므로 생략 가능
				} 
				System.out.printf("kor=%d(%c)", kor, grade );
			}  // if
			else {
				System.out.println("국어 점수 잘못 입력 ");
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();  

		}//catch

	} // main

} //class
