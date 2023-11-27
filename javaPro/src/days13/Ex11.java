package days13;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) throws IOException {

		// 한 학생의 성적관리 Student 클래스 선언
		// 한 반에 30명 학생 성적 처리 => 클래스 사용 수정
		String name;
		int kor, eng,mat;
		int tot;
		double avg ;
		int rank; 
		int wrank; 

		final int STUDENT_COUNT = 30;   

		// 클래스 배열
		Student [] students = new Student[STUDENT_COUNT];
		// students 배열명
		// [ null ][null][]
		
		Scanner sc = new Scanner(System.in);
		int count = 0; 
		char con = 'y';
		int no =1;
		
		do {
			System.out.printf(">이름, 국어, 영어, 수학 입력? ");
			name= getName();
			kor= getScore();
			eng= getScore();
			mat= getScore();

			tot = kor + eng + mat;
			avg =(double)tot / 3;
			rank = 1;

			// students[count] =null
			students[count] =new Student(); // 객체 생성!!
			
			students[count].no =no++;
			students[count].name =name;
			students[count].kor = kor;
			students[count].eng = eng;
			students[count].mat = mat;
			students[count].tot = tot;
			students[count].avg = avg;
			students[count].rank = rank;

			count++; 


			System.out.print(">입력 계속?");
			con=(char)System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con)=='Y');

		//등수처리
		
		for (int i = 0; i < count; i++) {
			students[i].printStudentInfo();
		} // for
		
	} // main


	public static String getName() {

		Random rnd = new Random();
		char [] nameArr = new char[3];
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i]=(char)( rnd.nextInt('힣'-'가'+1)+'가');
		} // for

		// char [] -> String
		String name = String.valueOf(nameArr);
		return name;
	}


	public static int getScore() {
		return (int) (Math.random()*101);

	}

}//class
