package days26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ex01 {
	
	public static void main(String[] args) {
		
		// DataInputStream/DataOutputStream
		// [ 바이트스트림 ]
		// - 기본형 8가지를 읽기/쓰기 가능한 바이트 스트림
		
		String name = "이지현";
		int kor =32	, eng =23, mat = 69;
		
		int tot = kor+eng+mat;
		double avg = (double)tot/3;
		boolean gender = false;
		
		// 한 학생의  정보 student.txt 파일에 저장
		// 확장자 - txt  
		//-> FileWriter : 문자 파일 스트림
		//BufferedWriter : 문자 보조 스트림
		
		String fileName = ".\\src\\days26\\student.txt";
		
		try(FileWriter out = new FileWriter(fileName, true);
				BufferedWriter bw = new BufferedWriter(out)) {
			
			String data = String.format("%s,%d,%d,%d,%d,%f,%b\n", name,kor,eng,mat,tot,avg,gender);  //저장형식
			
			bw.append(data);
			bw.flush();
			System.out.println(data);
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}//catch
		
		System.out.println("END");
		
		
	}//m
	
}//c