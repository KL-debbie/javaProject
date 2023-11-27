package days01;

public class Ex04_03 {

	public static void main(String[] args) {
		
		String name; 
		int age;
		
		name = "고경림";
		age = 29;
		age = age - 2;
		
		// Ctrl + alt + 방향키 
		System.out.println(name);
		System.out.println(age);
		
		
		// 출력형식
		// 이름은 고경림이고 나이는 27살입니다.
		
	System.out.println("이름은 " + name + "이고, 나이는 " + age + "살입니다.");
	
	// 이름은 "고경림"이고, 나이는 '27살'입니다.
	// \n 줄바꿈 표시
	System.out.println("이름은 \"" + name + "\"이고,\n 나이는 \'"+ age + "\'살입니다.");
		
	//System.out.printf("출력형식문자열",  출력할 값,출력할 값,출력할 값...);
	// name 문자열 표시 - %s
	// 정수 표시 - %d
		System.out.printf("이름은 \"%s\"이고, 나이는 '%d살'입니다.",name,age);
		
	}  //main

} // class