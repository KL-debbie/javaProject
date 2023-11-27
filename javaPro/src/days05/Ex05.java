package days05;

/**
 * @author KL
 * @date 2023. 7. 19. - 오후 3:12:41
 * @subject		// 조건 반복문 : while,  do~while
 * @content
 */
public class Ex05 {
	public static void main(String[] args) {
		// 조건문 : if
		// 분기문 : switch
		// 반복문 : for                        , foreach(확장for문)
		// 기타 : break, continue
		// 조건 반복문 : while,  do~while

		/* 컬렉션(collection)
		 [열거자]를 반복해서 처리
		while (en.hasMoreElements()) {
			type type = (type) en.nextElement();

		}  // while
		 */

		/* [반복자] 반복해서 처리
		while (it.hasNext()) {
			type type = (type) it.next();

		} //while
		 */

		/*
		while (condition) {
			// 조건식이 참일 동안 반복해서 { } 반복 실행
		}//while
		 */

		// for 반복문과 while 조건 반복문의 차이점
		// for- 반복횟수 정해져 있음
		// while- 반복 조건이 정해져 있음

		// [ 1~10까지 합(while문) ]
		/*1)
	 	int i =1, sum =0;
		while (i<=10) {
			// sum +=i;
			// System.out.printf("%d+",i);
			System.out.printf("%d+",i);
			sum +=i;
			i++;  // 해주지 않으면 1 무한대 돌음, 2,3 --으로 증가시키는 값 필요
		}//while
		System.out.printf("\b=%d",sum);
		 */

		// [2] 결과값 0+1+2+3+4+5+6+7+8+9+10+=55
		// 0을 뺀 값을 갖고싶음.
		/* 
		 int i =0, sum =0;

		while (i<=10) { // 10
			i++;  // 11
			System.out.printf("%d+",i); // 1+2+3+ --+ 10+11+  값이 나옴
			sum +=i;

		}//while
		System.out.printf("\b=%d",sum);
		 */

		// [3]
		int i =0, sum =0;
		while (++i <=10) {    // 값을 먼저 증가시키고 대입
			// while (i++ <=10) {    // 증가 시키기 전 대입 먼저 비교할땐 0, 내려올땐 1 --> 비교시에는 10이지만 내려와서는 11로 들어가기 때문에 값이 다
			System.out.printf("%d+",i); 
			sum +=i;

		}//while
		System.out.printf("\b=%d",sum);

	} // main

}//class

/*
if(i==0) 
i++; 
continue;
}
 */
