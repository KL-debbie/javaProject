package days07;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		int user;
		String inputData;

		try(Scanner scanner = new Scanner(System.in)) {

			/* [1]
			do {
				System.out.print("> user 가위(1), 바위(2), 보(3) 선택 ? ");			
				inputData = scanner.next();

			} while ( !(inputData.equals("1") || inputData.equals("2") || inputData.equals("3")) );
			// inputData cannot be resolved
*/
		//[2]
				String regex="[1-3]";
				boolean flag = false;
				//[2]
				// 첫번째 선택 + 그 외(2,3,4,...)구분
				do{
					if(flag) {
						System.out.println(">입력 잘못(1~3)");
					}//if
					System.out.print("> user 가위(1), 바위(2), 보(3) 선택 ? ");
					inputData = scanner.next();
					flag=true;
					
				} while(!inputData.matches(regex));

				user=Integer.parseInt(inputData);
				System.out.println(user);

		/*
		// 한 문자를 대문자로 변환하는 매서드 : toUpperCase
		System.out.println(Character.toUpperCase('y'));
		System.out.println(Character.toUpperCase('Y'));

		// 한 문자를 소문자로 변환하는 매서드 : toLowerCase
		System.out.println(Character.toLowerCase('y'));
		System.out.println(Character.toLowerCase('Y'));

		// String.toUpperCase()
		System.out.println( "abc".toUpperCase() );
		System.out.println( "abc".toLowerCase() );
		 */


	}
	}
	}
