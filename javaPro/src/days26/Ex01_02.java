package days26;

import java.io.BufferedReader;

import java.io.FileReader;
import java.text.MessageFormat;
import java.util.Arrays;


public class Ex01_02 {
	
	public static void main(String[] args) {
		
		// DataInputStream/DataOutputStream
		// [ 바이트스트림 ]
		// - 기본형 8가지를 읽기/쓰기 가능한 바이트 스트림
		
		String name ;
		int kor , eng , mat;
		
		int tot ;
		double avg ;
		boolean gender;
		
		// 원하는 번호의 학생 정보 student.txt 파일에서 출력
		// 확장자 - txt  
		//-> FileReader : 문자 파일 스트림
		//BufferedReader : 문자 보조 스트림
		
		String fileName = ".\\src\\days26\\student.txt";
		
		try(FileReader	 in = new FileReader(fileName);
				BufferedReader br = new BufferedReader(in)) {
			
		String line = br.readLine(); //첫번째 라인 읽어오기
		String pattern = "{0},{1},{2},{3},{4},{5},{6}";
		MessageFormat mf = new MessageFormat(pattern);
		Object [] objArr = mf.parse(line);
		
		// Object [] -> stream -> String []
		String [] s = Arrays.asList(objArr).toArray(new String[objArr.length]);
		
		/*
		name = (String) objArr[0];
		// int -> String -> Object
		kor=Integer.parseInt(objArr[1].toString());
		eng=Integer.parseInt(objArr[2].toString());   //object null이면 예외
		mat=Integer.parseInt( String.valueOf(objArr[3]) );// object null이면 null값 반환
		
		avg = Double.parseDouble(objArr[5].toString());
		gender = Boolean.parseBoolean(objArr[6].toString());
		*/
		
		name = s[0];
		// int -> String -> Object
		kor=Integer.parseInt(s[1]);
		eng=Integer.parseInt(s[2]);   //object null이면 예외
		mat=Integer.parseInt( s[3]);// object null이면 null값 반환
		
		avg = Double.parseDouble(s[5]);
		gender = Boolean.parseBoolean(s[6]);
		
		System.out.printf("%s %d %d %d %f %b\n",name,kor,eng,mat,avg,gender);
		
		} catch (Exception e) {
			e.printStackTrace();
		}//catch
		
		System.out.println("END");
		
		
	}//m
	
}//c