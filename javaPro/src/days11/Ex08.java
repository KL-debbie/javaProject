package days11;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 27. - 오후 4:12:23
 * @subject   다차원배열= 배열의 배열이다.
 * @content
	//한 반에 30명 학생
	// 성적처리 : 이름, 국어, 영어, 수학, 총점, 평균, 등수
	// 1. 학생 정보 입력
	// 2. 총점, 평균
	// 3. 등수
	// 4. 학생 정보 출력
	// 5. 파일 저장 또는 DB 저장
*/

public class Ex08 {

	public static void main(String[] args) throws IOException {


		String name;
		int kor, eng,mat;
		int tot;
		double avg ;
		int rank; 


		final int STUDENT_COUNT = 30;   

		String  [] names =new String[STUDENT_COUNT];
		
		/*
		int [] kors = new int[STUDENT_COUNT];                 //0열
		int [] engs = new int[STUDENT_COUNT];				//1열
		int [] mats = new int[STUDENT_COUNT];				//2열
		int [] tots = new int[STUDENT_COUNT];					//3열
		int [] ranks = new int[STUDENT_COUNT];				//4열
		*/
		
		double [] avgs = new double[STUDENT_COUNT];
		
		int [][] infos =new int[STUDENT_COUNT][5];
		
		Scanner sc = new Scanner(System.in);
		int count = 0; 
		char con = 'y';

		do {
			System.out.printf(">이름, 국어, 영어, 수학 입력? ");
			// sc.next() --> 문자열 값만 읽고 13,10 값이 남아있음,, 
			// sc.nextLine() --> 공백이 있어도 읽어감. 엔터값까지 읽음,,?
			name= getName();
			//name= sc.nextLine();
			//kor= sc.nextInt();
			kor= getScore();
			eng= getScore();
			mat= getScore();

			tot = kor + eng + mat;
			avg =(double)tot / 3;
			rank = 1;

			names[count] = name;
			infos[count][0] = kor;
			infos[count][1] = eng;
			infos[count][2] = mat;
			infos[count][3] = tot;
			infos[count][4] = rank;
			avgs[count] = avg;

			count++; 

			System.out.print(">입력 계속?");
			con=(char)System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con)=='Y');

		// 2번 학생의 국어 점수 100점 수정
		infos[1][0] = 100;
		// 1번 학생 전학/자퇴 -> 정보 필요x


		procRank( infos, count);


		printStudentInfo(names,infos,avgs, count);

	} // main


	private static void printStudentInfo(String[] names, int[][] infos, double[] avgs, int count) {
		for (int i = 0; i <count ; i++) {
			System.out.printf(">%d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t %d등\n", i+1, names[i], infos[i][0], infos[i][1], infos[i][2], infos[i][3], avgs[i], infos[i][4]);
		}
	}


	private static void procRank(int[][] infos, int count) {
		for (int i = 0; i < count; i++) {
			infos[i][4] =1;
			for (int j = 0; j <count ; j++) {   

				if( infos[i][3] < infos[j][3] ) {
					infos[i][4] ++;
				}
			} // for
		} // for
		
	}


	private static String getName() {

		Random rnd = new Random();
		char [] nameArr = new char[3];
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i]=(char)( rnd.nextInt('힣'-'가'+1)+'가');
		} // for

		// char [] -> String
		String name = String.valueOf(nameArr);
		return name;
	}


	private static int getScore() {
		return (int) (Math.random()*101);

	}


	private static void procRank(int[] tots, int[] ranks, int count) {
		for (int i = 0; i < count; i++) {
			ranks[i] =1;
			for (int j = 0; j <count ; j++) {   

				if( tots[i] < tots[j] ) {
					ranks[i] ++;
				}
			} // for
		} // for
	}

	private static void printStudentInfo(String[] names, int[] kors, int[] engs, int[] mats, int[] tots, double[] avgs, int[] ranks, int count) {
		for (int i = 0; i <count ; i++) {
			System.out.printf(">%d번\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d등\n", i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);

		} // for
	}

}//class
