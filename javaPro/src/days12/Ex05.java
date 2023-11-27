package days12;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

import days10.Ex06_04;

/**
 * @author KL
 * @date 2023. 7. 28. - 오후 2:42:25
 * @subject
 * @content
 */
public class Ex05 {
	public static void main(String[] args) throws IOException {
		//3반 - 30명 학생 이름,국영수,총점,평균,등수,전교등수 정보 처리
		final int STUDENT_COUNT=30;
		final int CLASS_COUNT =3;

		// 행=반, 열=번호
		String [][] names= new String [CLASS_COUNT][STUDENT_COUNT];

		// 3차원 배열의 열 : 0열(국) 1열(영) 2열(수) 3열(총) 4열(등) 5열(전등)
		int [][][] infos = new int[CLASS_COUNT][STUDENT_COUNT][6];

		// 행=반, 열=번호
		double [][] avgs= new double [CLASS_COUNT][STUDENT_COUNT];

		char con = 'y';
		// 입력받은 학생수 변수
		// int count1 =0;
		// int count2 =0;
		// int count3 =0;
		int [] counts = new int[CLASS_COUNT];

		String name;
		int kor,eng,mat,tot,rank,wrank;
		double avg;

		Scanner sc = new Scanner(System.in);
		int ban;

		do {

			//1) 반 입력?
			System.out.printf(">반 입력 ? ");
			ban = sc.nextInt();  // 1 or 2 or 3 ?

			//2) 반의 학생 정보 입력?
			System.out.printf(">%d반의 [%d]번 학생의 이름,국어,영어,수학 입력 ? ", ban, counts[ban-1]+1);  // counts 배열 0 =1반, 1=2반, 2=3반이므로,,
			name =Ex06_04.getName();
			kor=Ex06_04.getScore();
			eng=Ex06_04.getScore();
			mat=Ex06_04.getScore();

			tot = kor+eng+mat;
			avg =(double)tot/3;
			rank=1;
			wrank=1;

			names[ban-1][counts[ban-1]]=name;  //names[반][번호]
			infos[ban-1][counts[ban-1]][0]=kor;                           //infos[반][번호][0] = 국어
			infos[ban-1][counts[ban-1]][1]=eng;                          
			infos[ban-1][counts[ban-1]][2]=mat;                           
			infos[ban-1][counts[ban-1]][3]=tot;                         
			infos[ban-1][counts[ban-1]][4]=rank;                          
			infos[ban-1][counts[ban-1]][5]=wrank;                        
			avgs[ban-1][counts[ban-1]]=avg;

			counts[ban-1]++;  //3반 입력시 counts[2] 증가


			//입력 계속
			System.out.print("계속 입력?");
			con = (char) System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con)=='Y');

		// 등수처리
		for (int i = 0; i < counts.length; i++) {
			for (int j = 0; j < counts[i]; j++) {
				//infos[i][j][3]  총점
				infos[i][j][4] =1; // 반등수
				infos[i][j][5] =1; // 전교등수

				for (int i2 = 0; i2 < counts.length; i2++) {   //전교생들
					for (int j2 = 0; j2 < counts[i2]; j2++) {
						if(infos[i][j][3]<infos[i2][j2][3]) {
							infos[i][j][5] ++;
							if(i==i2) {    // 같은 반
								infos[i][j][4]++;
							}
						}
					} // for
				} // for
			}
		}//for
		//학생 정보 출력

		// [1반 학생 : 4명]
		//1 이름 점수 점수 점수 총점 평균 
		//2
		//3
		//4
		// [2반 학생 : 4명]
		//1
		//2
		// [3반 학생 : 4명]
		//1
		int 총학생수 = IntStream.of(counts).sum();
		/*
		for (int i = 0; i < counts.length; i++) {
		총학생수+= counts[i];   
		} // for
		 */
		System.out.printf("\t\t 학생정보출력(%d명)\n", 총학생수);
		for (int i = 0; i < counts.length; i++) {  // i=ban
			System.out.printf("[%d반 학생 : %d명]\n", i+1, counts[i]);
			for (int j = 0; j < counts[i]; j++) {  // j=번호
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t.2f\t%d\t%d\n", 
						j+1,
						names[i][j], 
						infos[i][j][0],
						infos[i][j][1],
						infos[i][j][2],
						infos[i][j][3],
						avgs[i][j],
						infos[i][j][4],
						infos[i][j][5]
						);

			} // for
		} // for



		/*
		private static void dispInfo(String[][] names, int[][] is, int[][] is2, int[][] is3, int[][] is4, int[][] is5,
			int[][] is6, double[][] avgs, int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("[%d반 학생 : %d명\n %d\t%s\t%d\t%d\t%d\t%d\t.2f\t%d\t%d\n", ban, counts, names[i], infos[0], )
		} // for
		 */
	} // main

}
