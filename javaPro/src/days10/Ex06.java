package days10;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 26. - 오후 3:12:41
 * @subject                                   // 시험 1 //
 * @content		// 한 반에 30명 학생
		             // 성적처리 : 이름, 국어, 영어, 수학, 총점, 평균, 등수
		             // 1. 학생 정보 입력
		              // 2. 총점, 평균
		// 3. 등수
		// 4. 학생 정보 출력
		// 5. 파일 저장 또는 DB 저장
 */
public class Ex06 {
	
	public static void main(String[] args) {
		
		/*
		// The local variable names may not have been initialized
		// NullPointerException
		names[0] ="홍길동";
		System.out.println(names[0]);
		*/
		
		String name;
		int kor, eng,mat;
		int tot;
		double avg ;
		int rank; 
		
		//배열 사용해서 선언
		final int STUDENT_COUNT = 30;   // 총 학생수 상수 선언, 	// 상수 선언 후 숫자만 변경
	
		String  [] names =new String[STUDENT_COUNT];
		int [] kors = new int[STUDENT_COUNT];
		int [] engs = new int[STUDENT_COUNT];
		int [] mats = new int[STUDENT_COUNT];
		int [] tots = new int[STUDENT_COUNT];
		double [] avgs = new double[STUDENT_COUNT];
		int [] ranks = new int[STUDENT_COUNT];
		
		Scanner sc = new Scanner(System.in);
		int count = 0; //입력 받은 학생수를 저장할 변수
		char con = 'y';
		
		System.out.printf(">이름, 국어, 영어, 수학 입력? ");
		name= sc.next();
		kor= sc.nextInt();
		eng= sc.nextInt();
		mat= sc.nextInt();
		
		tot = kor + eng + mat;
		avg =(double)tot / 3;
		rank = 1;
		
		names[0] = name;
		kors[0] = kor;
		engs[0] = eng;
		      // :
		     //  :
		count++; // 입력받은 학생수 증가
		
		// 입력 계속? y
	} // main
	
}//class
