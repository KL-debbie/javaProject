package days06;

/**
 * @author KL
 * @date 2023. 7. 20. - 오후 2:15:23
 * @subject
 * @content
 */
public class Ex06_03 {

	public static void main(String[] args) {

		for (int i =2;i<=9; i++) {
			
			System.out.printf("  [%d]단\t", i);
		}
		
		System.out.println();
		for(int i =1; i<=9; i++) {
			for(int dan =2;dan<=9 ; dan++) {
				// 커서 좌표값
				System.out.printf("%d*%d=%02d\t",dan, i, dan*i);
			}
			System.out.println();
		}

	}//main

}//class
