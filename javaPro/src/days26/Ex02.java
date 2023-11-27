package days26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// DataInputStream/DataOutputStream
		// [ 바이트스트림 ]
		// - 기본형 8가지를 읽기/쓰기 가능한 바이트 스트림
		
		//DataOutputStream
		
		String name = "이지현";
		int kor =32	, eng =23, mat = 69;
		
		int tot = kor+eng+mat;
		double avg = (double)tot/3;
		boolean gender = false;
	
		String fileName = ".\\src\\days26\\student.dat"; //data정보 입력   .ini 초기설정파일
		
		try(FileOutputStream out = new FileOutputStream(fileName,true);
				DataOutputStream dos = new DataOutputStream(out)) {//보조스트림, 바이트스트림객체를 달라고 함
			
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			
			dos.flush();
		
		} catch (Exception e) {
			e.printStackTrace();
		}//catch
		
		System.out.println("END");
		
		
	}//m
	
}//c