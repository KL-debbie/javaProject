package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author KL
 * @date 2023. 7. 17. - 오후 5:18:47
 * @subject  
 * @content
 */
public class Ex12 {

	public static void main(String[] args) throws IOException {
		
//		int [] kors = new int[2];
//		kors[0];
//		kors[1];		
//		kors[3] =100;

		
		String name ;
		int  kor, eng , mat ;
		int total ;
		double ave ; 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 홍길동,90,78,99 엔터 ( 공백이 없어야 출력)
		System.out.print("이름, 국어, 영어, 수학 입력 ? ");
		String inputData = br.readLine();
		
		// System.out.println( inputData );    //"홍길동, 90, 78, 99"
		
		//"홍길동" "90" "78" "99" 구분자 콤마(,) 잘라내기
		// , 를 구분으로 잘라내야하기 때문에 , 를 입력해서 결과값 도출해내기
		// 매개변수 String regex 정규표현식
		String [] datas = inputData.split(",");
		
		
		
		name = datas[0];
		kor = Integer.parseInt(datas[1]);
		eng = Integer.parseInt(datas[2]);
		mat = Integer.parseInt(datas[3]);
		
		total = kor+eng+mat ;
		ave = (double)total/3;
		
		
		System.out.printf("> %s님은 국: %d 영 : %d 수:%d 총점:%d 평균:%.2f 이다.", name, kor, eng, mat, total, ave );    // %.2f 소숫점 둘째자리까지 표시
		
		
		
			} // main

} // class
