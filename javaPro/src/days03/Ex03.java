package days03;

import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 17. - 오전 11:45:25
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		int age;
		int kor, eng, mat, total;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 나이 국어 영어 수학 입력 ?");
		
		name = sc.next();
		age= sc.nextInt();
		kor= sc.nextInt();
		eng= sc.nextInt();
		mat= sc.nextInt();
		
		
		total = kor + eng + mat; // 같은 int로 입력했기 때문에 형변환 필요x
		avg = (double)total/3;	
		
		System.out.printf("\"%s\" %d살 %d %d %d %d %.2f\n", name, age, kor, eng, mat, total,avg);
		
		sc.close();
	}

}
