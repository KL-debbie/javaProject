package Prac;

/**
 * @author KL
 * @date 2023. 7. 15. - 오후 11:03:07
 * @subject p 34-35 실수 타입
 * @content
 */
public class P08 {
	public static void main(String[] args) {
		boolean isPassed=true;
		char grade ='A';
		byte year =3;
		short jc = 17;
		int sS = 120045;
		long cT= 12345678L;
		float avg = 78.2F;
		double Avg = 76.23;
		
		// Syntax error on token "float", invalid VariableDeclaratorId
		// 예약어가 변수로 사용할 경우 뜨는 에러 메시지
		// ex) double float = 76.23; 
		// 진한 보라색은 예약어를 의미하므로 변수명으로 사용 불가
		
		
		System.out.println(isPassed);
		System.out.println(grade);
		System.out.println(year);
		System.out.println(jc);
		System.out.println(sS);
		System.out.println(cT);
		System.out.println(avg);
		System.out.println(Avg);
	}

}
