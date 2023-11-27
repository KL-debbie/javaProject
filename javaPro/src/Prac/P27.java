package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오후 3:49:18
 * @subject p 79 이름이 있는 break문
 * @content
 */
public class P27 {

	public static void main(String[] args) {

		outer: for(int i = 1; i<=5; i++){
			for(int j = 1; j<= 5; j++) {
				if(j>i) {
					break outer;
				}
			System.out.print("#");
			}
			System.out.println();
		}
	}

}
