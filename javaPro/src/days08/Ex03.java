package days08;

public class Ex03 {

	public static void main(String[] args) {

		int firstTerm =1;   // 첫번째 항
		int secTerm =1;    // 두번째 항
		int nextTerm ;      
		int sum = firstTerm + secTerm;
		System.out.printf("%d+%d+",firstTerm,secTerm);

		for (int i = 1; i <=8; i++) {
			nextTerm=firstTerm + secTerm;
			System.out.printf("%d+",nextTerm);
			sum += nextTerm;
			firstTerm = secTerm;	
			secTerm = nextTerm;
		} // for

		/*
		while ((nextTerm=firstTerm + secTerm) <=100) {
			System.out.printf("%d+",nextTerm);
			sum += nextTerm;
			firstTerm = secTerm;	
			secTerm = nextTerm;
		}
		 */

		System.out.printf("\b=%d",sum);

	} // main

} //class
