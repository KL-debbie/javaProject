package days18;

import java.util.Arrays;

public class Ex08_03 {
	
	public static void main(String[] args) {
		
		//11. 
		String s ="안녕하세요. 입니다. 입니다. 입니다.";
		String name ="홍길동";
		/*
		// 첫 번째 "입니다." 찾은 후 앞에 이름 붙여서 출력
		//안녕하세요. 홍길동입니다. 입니다. 입니다.
		
		// 단어의 위치
		// int index= s.indexOf('녕'); //자료형은 int -> 한문자 넣어도 되는 이유--> 자동형변환
		 int index =s.indexOf("입니다.");   // 7
		 System.out.println(index);
		 s= s.substring(0, index) + name + s.substring(index);
		 */
		
		//문제) 
		// 마지막에 있는 "입니다."를 찾아 앞에 홍길동 붙이자
		//안녕하세요. 입니다. 입니다. 홍길동입니다.
		
		/*
		String [] sArr = s.split("입니다");
		System.out.println(Arrays.toString(sArr));
		*/
		// 앞에서부터 찾기 =indexOf, 뒤에서부터 찾기 = lastIndexOf
		
		/*
		int index = s.lastIndexOf("입니다.");
		System.out.println(index);
		s= s.substring(0, index) + name + s.substring( index);
		
		System.out.println(s);
		// 값이 없으면 -1 반환
		*/
		
		/*
		int fromIndex=0;
		int index = s.indexOf("입니다.", fromIndex);
		System.out.println(index);  //7
		
		fromIndex = index + "입니다.".length();  // 처음 찾은 위치에서 다음 위치 찾기
		int secondIndex = s.indexOf("입니다.", fromIndex);
		System.out.println(secondIndex);
		*/
		
		int fromIndex =0;
		int index = -1;
		while ((index=s.indexOf("입니다", fromIndex)) != -1) { //-1이되면 더이상 찾는 값 없음 // 거기 위치부터 찾겠다 - fromIndex
			System.out.println(index);
			fromIndex = index + "입니다.".length(); 
		}
		
		//메서드	: indexOf
		//매개변수	: String target, String searchword, int no(몇번째에 오는것)
		//리턴값 	: int index;
		
		
		//12.
		"abc".toUpperCase();
		"ABC".toLowerCase();
		
		// String [] "홍길동, 김길동, 이길동".split(regex);
		String [] nameArr= "홍길동, 김길동, 이길동, 박길동".split(",",2); // limit를 주면 더 자를 수 있어도 두개로밖에 안자름
		
		for (int i = 0; i < nameArr.length; i++) {
			System.out.println(nameArr[i]);
		} // for
		
		
		
		
	} // main

}
