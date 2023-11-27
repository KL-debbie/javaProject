package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		String name;
		int kor,eng,mat;
		int total;
		double avg;
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		
		
		System.out.print("이름,국,영,수");
		
		String inputData = br.readLine();
		// 구분자 콤마(,) , 공백 ()
		// String regex ="\\s*,\\s*";   // \\ 2개 작성해야 \s 가 작성됨, 앞 뒤에 공백이 여러개 와도 좋고 안와도 좋고
		String regex ="[, ]";  // [ ] 뭐가 와도 좋음......

		String [] datas = inputData.split(regex);
		// String [] datas = inputData.split(",");
		
		name =datas[0];
		/*
		kor = Integer.parseInt(datas[1].trim());  //  공백제거
		eng = Integer.parseInt(datas[2].trim());
		mat = Integer.parseInt(datas[3].trim());
		*/
		
		kor = Integer.parseInt(datas[1]);  //  공백제거
		eng = Integer.parseInt(datas[2]);
		mat = Integer.parseInt(datas[3]);
		
		total = kor + eng + mat;
		avg = (double)total/3;
				
		System.out.printf("이름=\"%s\",국어=%d,영어=%d,수학=%d,총점=%d,평균=%.2f", name, kor, eng, mat, total, avg);
		
	}

}
