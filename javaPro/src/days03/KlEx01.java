package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KlEx01 {
	public static void main(String[] args)  {

		int com, user;

		try(Scanner sc = new Scanner(System.in)){
			System.out.print("user 가위(1) 바위(2) 보(3) 선택?");
			user=sc.nextInt();
			com = (int)(Math.random()*3+1);

			System.out.printf("> 컴퓨터 %d, 사용자 %d\n", com, user);
			switch (user-com) {
			case 1: case -2:
				System.out.println("사용자 승리");
				break;
			case 2: case -1:
				System.out.println("사용자 승리");
				break;

			default:
				System.out.println("무승부");
				break;
			}

		}


		catch(Exception e) {
			e.printStackTrace();
		}	

	} // main
} // class

