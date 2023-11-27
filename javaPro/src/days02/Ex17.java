package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author KL
 * @date 2023. 7. 14. - 오후 4:43:49
 * @subject    문제 7
 * @content
 */

public class Ex17 {

	public static void main(String[] args) throws IOException {
		// 이름, 국어, 영어, 수학을 입력 받아서
		// 총점, 평균을 계산하고
		// [출력형식]
		// 홍길동님은 국:89 영 : 78 수:56 총점:000 평균:00.00 이다.


		String name ;
		byte  kor ;
		byte eng ;
		byte mat ;
		
		short total ;
		double ave ; 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름을 입력하시오");
		name = br.readLine();
		
		System.out.print("국어 점수 입력");
		kor= Byte.parseByte(br.readLine());
		
		System.out.print("영어 점수 입력");
		eng = Byte.parseByte(br.readLine());
		
		System.out.print("수학 점수 입력");		
		mat = Byte.parseByte(br.readLine());
		
		// Type mismatch: cannot convert from int to short -> 왜 국영수 합이 int? cpu 처리로 int로 인식되기때문에
		total = (short) (kor+eng+mat);
		ave = (double)total/3;
		
		
		System.out.printf("> %s님은 국: %d 영 : %d 수:%d 총점:%d 평균:%.2f 이다.", name, kor, eng, mat, total, ave); // %.2f 소숫점 둘째자리까지 표시





	} //main

}// class
