package days04;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 18. - 오후 4:17:26
 * @subject  컴퓨터-사용자(user) 가위,바위, 보 게임..
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		// 가위(1), 바위(2), 보(3)
		// 컴퓨터는 1~3까지의 임의의 수를 발생
		// 사용자는 1~3까지의 정수를 Scanner 입력.
		
		int com, user;
		
		try(Scanner scanner = new Scanner(System.in)) {
		System.out.print("> user 가위(1), 바위(2), 보(3) 선택 ? ");
		// 입력값에 대한 유효성 검사 필요
		user = scanner.nextInt();
		com = (int)( Math.random() * 3) + 1;	
		
		// 누가 이겼는지 판가름
		/*                        user-com
		 *   com/user  가위(1) 바위(2) 보(3)
		 *         가위    무승부   사 (1)  컴(2)
		 *         바위    컴(-1)  무승부   사(1)
		 *         보      사(-2)  컴(-1)  무승부
		 *         
		 *   user-com  사용자 승리 1 , -2
		 *                  컴퓨터 승리 2, -1      
		 *                  그 외       0
		 */
		
			System.out.printf("> 컴퓨터 : %d, 사용자 : %d\n",com, user );
			
			switch (user -com) {
			case 1: case -2:
			System.out.println("사용자승리");
				break;
			case 2: case -1:
			System.out.println("컴퓨터승리");
			break;

			default:
				System.out.println("무승부");
				break;
			}
			
			// scanner.close() 자동
		} catch (Exception e) {
			e.printStackTrace();
			}
		
		
	}//main

}//class
