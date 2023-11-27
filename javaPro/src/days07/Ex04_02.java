package days07;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {

		int user;
		String inputData = null;

		try(Scanner scanner = new Scanner(System.in)) {

			String regex="[1-3]";
			boolean flag = false;
			int failureNumber=0; //실패횟수 저장 변수 선언

			do{
				if(flag) {
					 failureNumber++;
					System.out.printf(">[알림(%d)] 입력 잘못(1~3)\n",failureNumber);
					if(failureNumber == 5) {
						System.out.println("\t [5번] 실패하여 프로그램 종료");
						// break; // 
						// return; //main 함수를 빠져나가야 함
						System.exit(-1);;//다른 함수 프로그램 종료  어떤 이유로 프로그램 종료하는지 확인 가능 정수값 아무거나 상관없음
					}
				}//if
				System.out.print("> user 가위(1), 바위(2), 보(3) 선택 ? ");
				inputData = scanner.next();
			flag=true;

			} while(!inputData.matches(regex));

			user=Integer.parseInt(inputData);
			System.out.println(user);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
