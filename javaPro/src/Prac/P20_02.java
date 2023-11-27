package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오후 12:30:12
 * @subject P60 switch문
 * @content 예제
 */
public class P20_02 {

	public static void main(String[] args) {

		byte month = 5;

		switch (month) {
		case 3 :  case 4 : case 5 :   // 다 띄지 않고 입력 가능
			System.out.println("봄이에요~");
			// break 미작성 시 C등급 이하 모든 문장 출력
			break;    // 작성하면 원하는 문장만 출력
		case 6 :
		case 7 :
		case 8 :
			System.out.println("여름이에요~");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("가을이에요~");
			break;
		case 12:
		case 1:
		case 2:
		System.out.println("겨울이에요~");
			break;
		default:
			System.out.println("존재하지 않음");
		}

	}

}
