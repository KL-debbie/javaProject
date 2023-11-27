package days07;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 21. - 오전 9:46:22
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
	
		int com, user;

		try(Scanner scanner = new Scanner(System.in)) {
			System.out.print("> user 가위(1), 바위(2), 보(3) 선택 ? ");
			
			user = scanner.nextInt();
			com = (int)( Math.random() * 3) + 1;	

		String [] rockPaperScissors = { "", "가위", "바위", "보"};
			
			System.out.printf("> 컴퓨터 : %s, 사용자 : %s\n",rockPaperScissors[com], rockPaperScissors[user] );
			
			switch (user - com) {
			case 1: case -2:
				System.out.println(">사용자승리");
				break;
			case 2: case -1:
				System.out.println(">컴퓨터승리");
				break;

			default:
				System.out.println("> 무승부");
				break;
			}//switch

			int code;
			 char con = 'Y';
			 
		do {
			
			System.out.println("다시 실행?");
			 code=System.in.read();
			 System.out.printf("1~3까지 입력");	
				
			 System.in.skip(System.in.available());
			 
 			 code=System.in.read();
			 con = (char)code;
			 
			 System.in.skip(System.in.available());
			 
		} while (con=='y' || con=='Y');	 
		
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("end");

	} //main

}//class
