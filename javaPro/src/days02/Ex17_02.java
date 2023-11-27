package days02;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 14. - 오후 4:43:49
 * @subject Scanner 클래스
 * @content
 */

public class Ex17_02 {

	public static void main(String[] args){
		// 이름, 국어, 영어, 수학을 입력 받아서
		// 총점, 평균을 계산하고
		// [출력형식]
		// 홍길동님은 국:89 영 : 78 수:56 총점:000 평균:00.00 이다.
		String name;
		byte kor, eng, mat;
		short total;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">이름 국어 영어 수학 입력");
		
		name = sc.next();
		kor = sc.nextByte();
		eng = sc.nextByte();
		mat = sc.nextByte();

		total = (short)(kor+eng+mat);
		avg = (double)total/3;
		
		System.out.printf("이름 %s 국 %d 영 %d 수 %d 총 %d 평균 %f이다.", name, kor,eng,mat,total,avg);

	

	
	} //main

}// class
