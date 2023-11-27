package days13;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

import days10.Ex06_04;

public class Ex11_02 {

	public static void main(String[] args) throws IOException {
		//3반 - 30명 학생 성적처리 -> Student 클래스 사용 수정
		final int STUDENT_COUNT=30;
		final int CLASS_COUNT =3;

		// 클래스 2차원 배열
		Student [][] students = new Student[CLASS_COUNT ][STUDENT_COUNT];

		char con = 'y';

		int [] counts = new int[CLASS_COUNT];

		String name;
		int kor,eng,mat,tot,rank,wrank;
		double avg;

		Scanner sc = new Scanner(System.in);
		int ban;

		do {


			System.out.printf(">반 입력 ? ");
			ban = sc.nextInt(); 

			System.out.printf(">%d반의 [%d]번 학생의 이름,국어,영어,수학 입력 ? ", ban, counts[ban-1]+1);  // counts 배열 0 =1반, 1=2반, 2=3반이므로,,

			name =Ex06_04.getName();
			kor=Ex06_04.getScore();
			eng=Ex06_04.getScore();
			mat=Ex06_04.getScore();

			tot = kor+eng+mat;
			avg =(double)tot/3;
			rank=1;
			wrank=1;

			// 객체 생성
			// 클래스(객체) 복사
			Student s = students[ban-1][counts[ban-1]] = new Student();
			/*
			students[ban-1][counts[ban-1]].no=no++;  	
			students[ban-1][counts[ban-1]].name=name;  					
			students[ban-1][counts[ban-1]].kor=kor;                           
			students[ban-1][counts[ban-1]].eng=eng;                           
			students[ban-1][counts[ban-1]].mat=mat;                           
			students[ban-1][counts[ban-1]].tot=tot;                           
			students[ban-1][counts[ban-1]].rank=rank;                           
			students[ban-1][counts[ban-1]].wrank=wrank;                           
			students[ban-1][counts[ban-1]].avg=avg;  		
			 */

			s.no=counts[ban-1] +1;  	
			s.name=name;  					
			s.kor=kor;                           
			s.eng=eng;                           
			s.mat=mat;                           
			s.tot=tot;                           
			s.rank=rank;                           
			s.wrank=wrank;                           
			s.avg=avg;  		

			counts[ban-1]++;  //3반 입력시 counts[2] 증가


			//입력 계속
			System.out.print("계속 입력?");
			con = (char) System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con)=='Y');


		//등수처리
		Student s1, s2;
		for (int i = 0; i < counts.length; i++) {
			for (int j = 0; j < counts[i]; j++) {
				s1 = students[i][j];
				s1.rank =1;
				s1.wrank=1;
				for (int i2 = 0; i2 < counts.length; i2++) {
					for (int j2 = 0; j2 < counts[i2]; j2++) {
						s2 = students[i2][j2];
						if(s1.tot < s2.tot) {
							s1.wrank ++;
							if(i==i2) {
								s1.rank++;
							}
						}
					} // for
				} // for
			} // for
		} // for


		int 총학생수 = IntStream.of(counts).sum();
		System.out.printf("\t\t 학생정보출력(%d명)\n", 총학생수);
		for (int i = 0; i < counts.length; i++) {  // i=ban
			System.out.printf("[%d반 학생 : %d명]\n", i+1, counts[i]);
			for (int j = 0; j < counts[i]; j++) {
				// 클래스 복사
				Student s =students[i][j];
				s.printStudentInfo();
				/*
				System.out.printf(">%d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d등\t%d등\n"
						,s.no, s.name, s.kor, s.eng, s.mat, s.tot, s.avg, s.rank, s.wrank);
				 */
			}
		} // for
	}
}

