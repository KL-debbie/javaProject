package days06;

/**
 * @author KL
 * @date 2023. 7. 20. - 오후 2:15:23
 * @subject
 * @content
 */
public class Ex06_04 {

	public static void main(String[] args) {
		//[2][3][4]
		//[5][6][7]
		//[8][9]
		
		for (int k = 1; k <=3; k++) {
			// k=1    2
			// k=2    5
			// k=3    8
			// 3*k-1
			for (int dan =3*k-1;dan<=3*k+1 && dan!=10; dan++) {
			//	if(dan!=10) 
				System.out.printf("   [%d]단\t", dan);
			}
			System.out.println();
			for(int i =1; i<=9; i++) {
				for(int dan =3*k-1;dan<=3*k+1 && dan!=10 ; dan++) {
				//	if(dan!=10) 
					System.out.printf("%d*%d=%02d\t",dan, i, dan*i);
					
				}
				System.out.println();
			}
		} // for
		
		
		
		/*
		for (int k = 1; k <=2; k++) {
			// k=1    2
			// k=2    6
			for (int i =4*k-2;i<=4*k+1; i++) {
				System.out.printf("   [%d]단\t", i);
			}
			System.out.println();
			for(int i =1; i<=9; i++) {
				for(int dan =4*k-2;dan<=4*k+1 ; dan++) {
					// 커서 좌표값
					System.out.printf("%d*%d=%02d\t",dan, i, dan*i);
				}
				System.out.println();
			}
		} // for
    */
		
	/*
		for(int i1 =1; i1<=9; i1++) {
			for(int dan =6;dan<=9 ; dan++) {
				// 커서 좌표값
			System.out.printf("%d*%d=%02d\t",dan, i1, dan*i1);
			}
			System.out.println();
		}
*/
	}//main

}//class
