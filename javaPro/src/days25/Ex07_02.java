package days25;

import java.io.File;
import java.io.FileWriter;

public class Ex07_02 {
	
	public static void main(String[] args) {
		
		//실행 후
		// 1. 저장할 파일명 저장 ? ~~.txt  엔터
		// 2. 저장할 문자열(Data) 입력?  엔터
		// 3. 계속?
		//		:
		//		:
		
		// 파일 저장
		String pathname = ".\\src\\days25\\sample.txt";
		File file = new File(pathname);
		//파일의 존재 유무를 true/false로 반환
		//	System.out.println(file.exists());
		
		//													boolean append	
		// 문자 출력용 스트림
		try(FileWriter fw = new FileWriter(file,true )) {
		
			/*
			fw
				.append('a')
				.append("append_string");
			
			fw.write(98);
			fw.write("write_string");
			*/
			fw.write("새로 실행해서 텍스트추가");
			
			//쓰기 + 추가 작업 ==>  fr 출력용스트림에 작업된 것
			
			//스트림에 있는 데이터를 실제 저장소에 저장하는 작업- 스트림은 비우기
			//저장하고 flush진행
			// fw.flush();
			
			// fw.close();//  try~catch문 선언하여 하지 않아도됨- 자동 close, flush 선언 X -> close만 해도 자동으로 flush가 먼저 일어남
			
			System.out.println("End");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


}
