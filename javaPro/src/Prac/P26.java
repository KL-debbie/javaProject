package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오후 3:17:13
 * @subject break문 p 76
 * @content
 */
public class P26 {

	// break는 for 같은 반복문 종료
	public static void main(String[] args) {

		for(int i = 1; i <5; i++) {
			for(int j = 1; j<5; j ++) {
				if(j>i) {
					break;
				}
				System.out.print("*");	
			}
			
		
			System.out.println();
		}
		

	}
	

}



