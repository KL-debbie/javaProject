package days19;

import java.io.UnsupportedEncodingException;
import java.util.StringJoiner;

/**
 * @author KL
 * @date 2023. 8. 8. - 오전 11:28:58
 * @subject
 * @content
 */
public class Ex03 {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = "가";
		byte [] bArr= str.getBytes("UTF-8");
		// 한글 한 문자 3바이트 처리
		
		
		/*
		for (int i = 0; i < bArr.length; i++) {
			System.out.printf("[%02X]:", bArr[i]);   //16진수
		} // for
		System.out.println();
		*/
		
		//byte 배열 출력함수
		printByteArr(bArr); // 한글 한 문자 3바이트 처리
		//:"가"-> 3바이트 UTF-8 byte[]  ->"가"
		
		String s =new String (bArr, "UTF-8");
		System.out.println(s);
		
		bArr= str.getBytes("EUC-KR");
		printByteArr(bArr);  //[b0:a1]  한글 한문자는 : 2바이트 처리 
		
		// 디코딩
		s =new String (bArr, "EUC-KR");
		System.out.println(s);
		
	} // main

	private static void printByteArr(byte[] bArr) {
		StringJoiner sj = new StringJoiner(":","[","]");
		for (int i = 0; i < bArr.length; i++) {
			sj.add( String.format("%02x", bArr[i]) );   //16진수  [ea:b0:80]
		} // for
		System.out.println( sj.toString());
	}

}
