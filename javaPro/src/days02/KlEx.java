package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KlEx {
	
	public static void main(String[] args) throws IOException  {
		
		String name;
		byte kor, eng, mat;
		short total;
		double avg;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 입력");
		name = br.readLine();
		
		System.out.print("국어 입력");
		kor = Byte.parseByte(br.readLine());
		
		System.out.print("영어 입력");
		eng = Byte.parseByte(br.readLine());
		
		System.out.print("수하 입력");
		mat = Byte.parseByte(br.readLine());
		
		
		total = (short) (kor+eng+mat);
		avg = total/3;
		
		System.out.printf("%s님은 국: %d 영 : %d 수:%d 총점:%d 평균:%f 이다.", name, kor,eng,mat,total,avg);
	} //main

} // class
