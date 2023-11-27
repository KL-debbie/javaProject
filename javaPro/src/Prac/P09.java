package Prac;

/**
 * @author KL
 * @date 2023. 7. 15. - 오후 11:35:27
 * @subject P 37 값 교환
 * @content
 */
public class P09 {

	public static void main(String[] args) {
		System.out.println("교환 전");
		
		int age =30;
		int year = 1932;
		
		System.out.println("age : "+age);
		System.out.println("year : "+ year );
		
		
		System.out.println("-----------");
		
		System.out.println("교환 후");
		
		int temp ;
		temp = age;
		age= year;
		year = temp;
		System.out.println("age : "+age);
		System.out.println("year : "+ year );

	}

}
