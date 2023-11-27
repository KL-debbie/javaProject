package days08;

/**
 * @author KL
 * @date 2023. 7. 24. - 오후 3:20:09
 * @subject
 * @content
 */
public class Ex09_02 {

	public static void main(String[] args) {
		// 배열 선언 및 생성
		// 배열을 초기화하지 않으면 기본형(int)의 초기값(0)으로 설정
		int [] lotto = new int [6];

		fillLotto( lotto );

		// lotto 배열 출력하는 dispLotto() 함수 선언
		// lotto[0] = 20

		dispLotto(lotto);



	} // main

	// 중복이 되지 않는 로또 번호로 배열을 채우도록 코팅
	// while    중복되지 않게 6개 배열을 다 채울 때까지.........
	// index
	public static void fillLotto(int [] lotto) {
		int index =0;
		int lottoNumber = (int)(Math.random()*45)+1;
		lotto[index++] = lottoNumber;
		boolean flag =false; //로또번호가 중복되면 true 값 할당

		while (index <= 5) {
			flag =false;
			lottoNumber = (int)(Math.random()*45)+1;

			// 중복값 확인
			for (int i = 0; i < index; i++) {
				if(lotto[i]== lottoNumber) {
					flag = true;
					break;
				}
			} // for
			if( !flag ) lotto[index++] = lottoNumber;
		} //while
	}

	/* 중복체크 x
	public static void fillLotto(int[] lotto) {
		for (int i = 0; i <lotto.length ; i++) {
			int lottoNumber = (int)(Math.random()*45)+1;
			lotto[i] = lottoNumber;
		} // for
		// 전에 채워진 값과 임의로 생성된 숫자가 중복됬는지 확인, 없으면 채워넣고, 중복 시 다시 랜덤으로 돌리기
		// 반복횟수가 정확하게 정해지지 않음 => while문
	}
	 */

	public static void dispLotto(int[] lotto) {  
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("lotto[%d]=[%d]\n", i, lotto[i]);
		} // for
		System.out.println();
	}

}//class
