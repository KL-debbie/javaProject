package days20;

import java.text.MessageFormat;

public class Ex10 {
	
	public static void main(String[] args) {
		// 형식화클래스4 MessageFormat
		// 특정 형식 <- 데이터 값 맞춰서 출력
		// 특정형식에 맞춰진 데이터값을 읽어오기
		
		String name  ="이준희";
		int age =20;
		boolean gender = true;
		
		//위 데이터들을 특정형식으로 출력
		/*[ 1 ]
		String output= String.format("이름:%s, 나이:%d살, 성별:%s", name, age, gender);
		System.out.println(output);
		*/
		
		// [2] MessageFormat
		// 객체생성 X
		// 이름:이준희, 나이:20살, 성별:true
		String pattern ="이름:{0}, 나이:{1}, 성별:{2}";
		String output = MessageFormat.format(pattern, name,age, gender);
		System.out.println(output);
		
		// SQL
		// INSERT INTO board(no, title, writer, content, regdate)VALUES({0},'{1}','{2}','{3}',{4})"
		
	} // main

}
