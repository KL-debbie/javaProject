package Prac;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

/**
 * @author KL
 * @date 2023. 7. 16. - 오후 2:21:01
 * @subject 무한 루프 p 72
 * @content
 */
public class P24_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("메시지 입력후 Enter 치세요. (종료는 5)");
			
			String name = sc.nextLine();
			if(name.equals("5")) {
				
				break;
			}
			System.out.println("입력한 문구 : " +name);
		}
	
	sc.close();
	}
}
