package days26;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.RandomAccessFile;

public class Ex05 {
	
	public static void main(String[] args) throws IOException {
		
		// PipedReader, PipedWriter
		// 스레드 간에 데이터를 입/출력할 때 사용하는 스트림
		
		// [ Random Access File ]  
		//    랜덤하게	 +접근	   + 파일  읽고 쓰기 스트림
		// 하나의 클래스로 읽기/쓰기 모두 가능
		// 파일의 어느 위치에나 읽기/쓰기가 가능한 장점이 있는 스트림
		// --> 왜 ? implements DataOutput(출력스트림), DataInput(입력스트림) 구현되어 있어서
		// -seek(위치값) : 가고자 하는 위치로
		// -getFilePointer() : 현재 내 위치
		// -readXXX()  :읽기용도
		// -writeXXX() : 쓰기용도
		
		String s ="I Love normal Java";
		String q ="javabook";
		
		String name=".\\src\\days26\\random.txt"; 
		String mode = "rw"; // 읽기,쓰기용도로 사용
		
		try(RandomAccessFile raf = new RandomAccessFile(name, mode) ;) {
			
			long cp = raf.getFilePointer(); 
			raf.writeBytes(s);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 일시정지 + 엔터치면 계속.
		
		System.out.println("엔터치면 진행");
		System.in.read();
		System.in.skip(System.in.available());
		
		try(RandomAccessFile raf = new RandomAccessFile(name, mode) ;) {
			
			//임의의 위치로 이동 -> 읽기/쓰기 작업
			raf.seek(7);
			raf.writeBytes(q);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 일시정지 + 엔터치면 계속.
		
		System.out.println("엔터치면 진행");
		System.in.read();
		System.in.skip(System.in.available());

		try(RandomAccessFile raf = new RandomAccessFile(name, mode) ;) {
			
			//임의의 위치로 이동 -> 읽기/쓰기 작업
			raf.seek( 2 );
			String line = raf.readLine();
			System.out.println(line);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("END");
		
	} // main

}
