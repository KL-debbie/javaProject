package days26;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.util.FileUtil;

public class Ex06_08 {
	
	public static void main(String[] args) {
		
		//하나의 파일을 잘라서 여러개의 파일로 분할생성
		
		String parent = ".\\src\\days26";
		String child = "시간표_(5강의실)(디지털컨버전스)AWS 클라우드와 Elasticsearch를 활용한 Java(자바) Full-Stack 개발자 양성과정(I).v1.hwp ";
		
		File f = new File(parent, child);
		System.out.println("파일 크기 : "+ f.length()+ "(bytes)");
		
		//10kb씩 자르기 = 1024 * 10byte
		final int VOLUME = 10*1024;
		
		//"시간표.hwp"
		// 시간표_1.hwp
		
		//확장자를 제외한 순수 파일명
		String baseName = FileUtil.getBaseName(child);
		//확장자
		String ext=	FileUtil.getExtension(child);
		
		//System.out.println(baseName);
		//System.out.println(ext);
		
		int code = 0;
		int i = 0; //10kb가 됬는지 확인
		int index = 0; // 자른 후 파일명
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		//스트림객체 새로 만들기
		
		try(FileInputStream fis = new FileInputStream(f);
				BufferedInputStream bis = new BufferedInputStream(fis)) {
			
			while ( ( code = bis.read()) != -1) {
				// 10kb fos객체 생성 후 저장		_index++.hwp
				// fos객체생성 10kb 저장--Stream 끝날때까지 반복
				
				// i = 0~10239 fos 객체생성 10kb다 채움
				if ( i % VOLUME ==0) {
					if( i != 0) bos.close(); //저장
					
					child = String.format("%s_%d%s", baseName, ++index, ext);
					System.out.println(child);
					
					File temp = new File(parent, child);
					fos = new FileOutputStream(temp);
					bos = new BufferedOutputStream(fos);
				} //if
				
				bos.write(code);
				i++;
				// System.out.printf("[%d\n",i);
				
			}
			System.out.println(" end ");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	} // main

}
