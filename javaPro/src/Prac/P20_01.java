package Prac;

/**
 * @author KL
 * @date 2023. 7. 16. - 오후 12:30:12
 * @subject P60 switch문
 * @content
 */
public class P20_01 {

	public static void main(String[] args) {

		char grade = 'C';

		switch (grade) {
		case 'A' :
			System.out.println("A등급은 90-100 사이");
			// break 미작성 시 C등급 이하 모든 문장 출력
			break;    // 작성하면 원하는 문장만 출력
		case 'B' :
			System.out.println("B등급은 80-89 사이");
			break;
		case 'C' :
			System.out.println("C등급은 70-79 사이");
			break;
		case 'D' :
			System.out.println("D등급은 60-69 사이");
			break;
		default:
			System.out.println("존재하지 않음");
		}

	}

}
