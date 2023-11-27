package days06;

/**
 * @author KL
 * @date 2023. 7. 20. - 오후 3:41:35
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// ****
		// ****
		// ****
		// ****
		
		// j =1 -> i= 4개행
		// j =2 -> i= 4 개행
		// j =3 -> i= 4개행
		// j =4 -> i= 4 개행
		// j =5 -> 빠져나옴
		
		
		
		for (int i = 1; i <=4; i++) { //행 갯수
			for (int j = 1; j <=3; j++) {//열(별) 갯수 
				System.out.print(" *");
			} // for
			System.out.println();
		} // for
		
	}//main

}//class
