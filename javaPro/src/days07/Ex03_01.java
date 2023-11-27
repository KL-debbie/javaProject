package days07;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 21. - 오전 9:46:22
 * @subject
 * @content
 */
public class Ex03_01 {

	public static void main(String[] args) {
		//      while,***사용-- do~while
		// 반복 영역 먼저 찾은 후 제어문 어떤거 쓸지 찾기
		// 가위바위보 반복 실행 후 1~3이 아닌 숫자나 문자 입력이 문자 입력 오류 메시지 작성후 계속실행?

		int com, user;
		char con = 'Y';
		String inputData;	


		try(Scanner scanner = new Scanner(System.in)) {
			String regex="[1-3]";
			int failureNumber=0;
			//[2]
			// 첫번째 선택 + 그 외(2,3,4,...)구분
			do {
				 if( failureNumber == 5) {
					System.out.println("\t [5번] 실패하여 프로그램 종료");
				System.exit(0);
				}
				System.out.print("> user 가위(1)바위(2) 보(3)? ");
				inputData= scanner.next();
				System.out.println("다시 입력하세요");
				 failureNumber++;
				 System.out.printf("(%d)번 잘못 입력 시스템 종료", failureNumber );
			} while (!inputData.matches(regex));
			
			do{
				user = scanner.nextInt();   //InputMismatchException
				com = (int)( Math.random() * 3) + 1;	
				String [] rockPaperScissors = { "", "가위", "바위", "보"};

				System.out.printf("> 컴퓨터 : %s, 사용자 : %s\n",rockPaperScissors[com], rockPaperScissors[user] );  //InputMismatchException

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

				System.out.print("> 게임 계속 실행?");
				con=(char)System.in.read();
				System.in.skip(System.in.available());

				//} while (con=='y' || con=='Y');	 
			} while (Character.toUpperCase(con)=='Y');	 

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("end");

	} //main

}//class
