package days06;

/**
 * @author KL
 * @date 2023. 7. 20. - 오후 3:41:35
 * @subject
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {
		// 1)
		// i=1 j=1
		// i=2 j=2
		// i=3 j=3
		// i=4 j=4
		// i=j
		for (int i = 1; i <=4; i++) { //행 갯수 4
			 for (int j = 1 ; j <=i; j++) { //열(별) 갯수 1-2-3-4* ** *** ****
				System.out.print("*");
			} // for
			System.out.println();
		} // for
		
		
		// 2)
		// i=1 j=4
		// i=2 j=3
		// i=3 j=2
		// i=1 j=4
		// j=5-i
		for (int i = 1; i <=4; i++) { 
			for (int j = 1 ; j <=5-i ; j++) { 
				System.out.print("*");
			} // for
			System.out.println();
		} // for
		
		
		// 3) 1)+2) 합쳐진 것
		for (int i = 1; i <=4; i++) { 
			//2) 
			for (int j = 1 ; j <=4-i; j++) { 
				System.out.print("_");
			}
			//1)
			for (int j = 1 ; j <=i; j++) { 
				System.out.print("*");
			} // for
			System.out.println();
		} // for
		
		// 4) 1)+2) 합쳐진 것
		for (int i = 1; i <=4; i++) { 
			//1) 
			for (int j = 1 ; j <=i; j++) { 
				System.out.print("_");
			}
			//2)
			for (int j = 1 ; j <=4-i; j++) { 
				System.out.print("*");
			} // for
			System.out.println();
		} // for
		
		// 5)
		for (int i = 1; i <=3; i++) { 
			// 공백 for
			for (int j = 1 ; j <=3-i; j++) { 
				System.out.print("_");
			}
			for (int j = 1 ; j <=2*i-1; j++) { 
				System.out.print("*");
			} // for
			System.out.println();
		} // for
		
		// 6)
		
		// 3-i< 0? -1*(3-i) : 3-i
		for (int i = 1; i <=5; i++) { 
			// 공백 for
			//for (int j = 1 ; j <=3-i< 0? -1*(3-i) : 3-i; j++) {
			for (int j = 1 ; j <=Math.abs(3-i); j++) { 
				System.out.print("_");
			}
			for (int j = 1 ; j <=2*-1; j++) { 
				System.out.print("*");
			} // for
			System.out.println();
		} // for
		
		
	}//main

}//class
