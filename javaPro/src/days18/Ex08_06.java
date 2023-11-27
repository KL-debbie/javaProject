package days18;

public class Ex08_06 {

	public static void main(String[] args) {
		String s ="TODO Auto-generated method stub";
		
		//1) String -> char [] 변환
		char [] sArr = s.toCharArray();
		/*
		for (char c: sArr) {
			System.out.println(c);
		} // foreach
		*/
	
		//2) char [] -> String 변환
		//s = String.valueOf(sArr);
		 s = new String(sArr);
		 
		 //3) 굳이 바꾸는 이유?
		 // String -> byte[]  ---- s문자열을 byte로 바꿈
		 // 바이트 배열이 기본
		// -128~127 정수로 바꿀꺼야
		byte [] bArr=  s.getBytes();
	
	
		//4) byte [] -> String
		s= new String(bArr);
		
		System.out.println("-".repeat(40));
		// 선 40개 긋기    ----------------------------------------
		
		
		// 앞뒤 공백 제거   [홍길동]
		String name = "      홍길동       ".trim();
		System.out.printf("[%s]", name);
		
		
		
		
	}//main

}
