package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오후 12:30:12
 * @subject P60 switch문
 * @content 예제
 */
public class P20 {

	public static void main(String[] args) {

		/* switch문
		 *  switch ( 기준값 ) {
		 *  case 비교값 1:
		 *         수행문 1;
		 *  case 비교값 2:
		 *         수행문 2;
		 * default:
		 *         기본 수행문; }
		 */
		
		String name = "꽃나무";

		switch (name) {
		case "열매나무" :
			System.out.println("A등급은 열매가 열리는 나무");
			// break 미작성 시 C등급 이하 모든 문장 출력
			break;    // 작성하면 원하는 문장만 출력
		case "꽃나무" :
			System.out.println("B등급은 꽃피는 나무");
			break;
		case "잎나무" :
			System.out.println("C등급은 잎만 자라는 나무");
			break;
		case "나뭇가지" :
			System.out.println("D등급은 나뭇가지만 있는 나무");
			break;
		default:
			System.out.println("존재하지 않음");
		}

	}

}
