package days26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;

public class Ex02_02 {
	
	public static void main(String[] args) {
		
		// DataInputStream/DataOutputStream
		// [ 바이트스트림 ]
		// - 기본형 8가지를 읽기/쓰기 가능한 바이트 스트림
		
		//DataInputStream
		
		String name ;
		int kor , eng , mat;
		
		int tot ;
		double avg ;
		boolean gender;
	
		String fileName = ".\\src\\days26\\student.dat"; //data정보 입력   .ini 초기설정파일
		
		try(FileInputStream in = new FileInputStream(fileName);
				DataInputStream dis = new DataInputStream(in)) {
			
			name = dis.readUTF();
			kor= dis.readInt();
			eng= dis.readInt();
			mat= dis.readInt();
			tot= dis.readInt();
			avg = dis.readDouble();
			gender = dis.readBoolean();
			
			System.out.printf("%s %d %d %d %d %f %b\n",name,kor,eng,mat,tot,avg,gender);
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}//catch
		
		System.out.println("END");
		
		
	}//m
	
}//c