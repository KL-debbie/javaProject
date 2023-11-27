package days10;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 26. - 오전 11:16:26
 * @subject       배열 단점 - 컬렉션 클래스 
 *                      1)  배열 크기 자동 크기 증가/감소 X
 *                      2) 요소 삽입이 복잡
 * @content
 */
public class Ex03 {
	
	static int index =0; //전역 변수(채워넣을 위치값) 모든 함수에서 사용
	static Scanner sc =new Scanner(System.in); //전역 변수
	static char con ='y';
	
	public static void main(String[] args) throws IOException {

		int  [] m = new int[3];
		//ArrayIndexOutOfBoundsException
		// 방이 3개인데 그 이상 넣을 경우
		
		String [] menus = {"추가","수정","삭제","검색","조회","종료"};
		int selectedNumber;

		while (true) {
			dispMenus(menus);
			selectedNumber=selectMenus(sc);
			processMenus(selectedNumber, m);// 
		}//while


	}//main

	private static void processMenus(int selectedNumber, int [] m) throws IOException { // main의 m과는 다름  Call By Reference

		switch (selectedNumber) {
		case 1: // main.m 배열에 값을 입력받아 요소 추가 작업
			add(m); // 다 다른 m이지만 같은 기억공간
			break;
		case 2: System.out.println("배열에 요소 수정");
			break;
		case 5: // 배열의 모든 요소 조회
			list(m);
		break;
		case 6: exit();
			break;
		}//switch
		
		일시정지();
}

	public static void 일시정지() {
		System.out.print(">아무키나 누르면 계속 진행 ");
		//예외처리 2가지= try-catch / throws
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void list(int[] m) {
		System.out.println("[5. 조회]");
		if (index ==0) {
			System.out.println("\t 추가된 요소가 없음");
			return;  // 함수를 빠져나감.
		} //if
		
			for (int i = 0; i < index ; i++) {
			System.out.printf("m[%d]=%d", i, m[i]);
		} // for
		System.out.println();
	}

	// m배열에 요소를 추가하는 함수(메서드)
	private static void add(int[] m) throws IOException {
		System.out.println("[1. 추가]");
		
		do {
			// if(index==3) break;
			// 배열 크기 증가시킬지??
			if ( index == m.length) { // 배열이 다 찼음
				int [] temp = new int[  m.length+3  ];
				for (int i = 0; i <m.length; i++) {
					temp[i]=m[i];
				} // for
				m= temp;
			}

			System.out.printf("\n 정수 입력 ? ");
			int n =sc.nextInt();
			m[index++]= n;

			System.out.print("\t 요소 추가 계속진행 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
			
		} while (Character.toUpperCase(con) =='Y');  
        //} while (Character.toUpperCase(con) =='Y' && index <3);
		
		System.out.println(Arrays.toString(m));
	}

	private static void exit() {
		System.out.println("\n\n 프로그램 종료");
		System.exit(0);		
	}

	private static int selectMenus(Scanner sc) {
		System.out.print(">메뉴 선택하세요 ");
		return sc.nextInt();
	}

	//메뉴 출력함수
	private static void dispMenus(String[] menus) {
		System.out.println("[메뉴]");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("%d.%s\t", i+1, menus[i]);
		} // for
		System.out.println();
	} // disp

}//class
