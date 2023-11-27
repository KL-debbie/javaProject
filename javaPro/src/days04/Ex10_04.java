package days04;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 18. - 오후 4:17:26
 * @subject  컴퓨터-사용자(user) 가위,바위, 보 게임..
 * @content
 */
public class Ex10_04 {

	public static void main(String[] args) {

		int com, user;

		try(Scanner scanner = new Scanner(System.in)) {
			System.out.print("> user 가위(1), 바위(2), 보(3) 선택 ? ");
			
			user = scanner.nextInt();
			com = (int)( Math.random() * 3) + 1;	

			
			// 1,     2  ,3
			// 가위 바위  보
			/*
			String [] rockPaperScissors = new String[4];
			// [가위] [바위] [보]
			
			rockPaperScissors[0] = "";
			rockPaperScissors[1] = "가위";
			rockPaperScissors[2] = "바위";
			rockPaperScissors[3] = "보";
			//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
			// 배열 첨자값이 범위를 벗어남  방은 3갠데 4개를 입력하여 오류발생   ---> 수정  String [] rockPaperScissors = new String[4]
			*/
			
			
			String [] rockPaperScissors = { "", "가위", "바위", "보"};
			
			System.out.printf("> 컴퓨터 : %s, 사용자 : %s\n",rockPaperScissors[com], rockPaperScissors[user] );
			
			
			// System.out.printf("> 컴퓨터 : %d, 사용자 : %d\n",rockPaperScissors[com-1], rockPaperScissors[user-1] );
			// IllegalFormatConversionException: d != java.lang.String  -- 정수를 문자열로 바꾸는 작업을 진행하여 %d가 아닌 %s로 바꾸기
			
			/*
			rockPaperScissors[0] = "가위";
			rockPaperScissors[1] = "바위";
			rockPaperScissors[2] = "보";
			System.out.printf("> 컴퓨터 : %s, 사용자 : %s\n",rockPaperScissors[com-1], rockPaperScissors[user-1] );
			*/
			
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
			}

			// scanner.close() 자동
		} catch (Exception e) {
			e.printStackTrace();
		}


	}//main

}//class
