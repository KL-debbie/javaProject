package days08;

/**
 * @author KL
 * @date 2023. 7. 24. - 오후 3:20:09
 * @subject                시험 1
 * @content
 */
public class Ex09_03 {

	public static void main(String[] args) {


		int [] lotto = new int [6];   // 6개 뽑을 예정으로 방에 할당

		fillLotto( lotto );

		dispLotto(lotto);

	} // main

	
	public static void fillLotto(int [] lotto) {
		int index =0;
		int lottoNumber = (int)(Math.random()*45)+1;
		lotto[index++] = lottoNumber;
		boolean flag =false; //로또번호가 중복되면 true 값 할당

		while (index <= 5) {
			flag =false;
			lottoNumber = (int)(Math.random()*45)+1;
			
			if(! isDuplicateLotto(lotto, lottoNumber, index) ) lotto[index++] = lottoNumber;
			//isDuplicateLotto 중복이 되면 true값, 중복되지 않으면 false
			
		} //while

	}
	
	private static boolean isDuplicateLotto(int[] lotto, int lottoNumber, int index) {
		for (int i = 0; i < index; i++) {
			if(lotto[i]== lottoNumber) {
				return true;
			}
		} // for
		return false;
	}

	public static void dispLotto(int[] lotto) {  
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("lotto[%d]=[%d]\n", i, lotto[i]);
		} // for
		System.out.println();
	}

}//class
