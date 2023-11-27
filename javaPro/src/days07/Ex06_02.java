package days07;

/**
 * @author KL
 * @date 2023. 7. 21. - 오후 12:12:21
 * @subject      복습시험 1
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		// 1-2+3-4+5-6+7-8+9-10= -5
		//switch 변수 선언 코딩
		/*
		boolean sw=false; //default 기본값 false
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			if(sw) { //짝수
				sum-=i;
			System.out.printf("%d+",i);
			//sw= false;
			} else {
				sum+=i;
				System.out.printf("%d-",i);
				//sw = true;
			}//if
			*/
		
			boolean sw=false; //default 기본값 false
			int sum = 0;
			for (int i = 1; i <=10; i++) {
			sum += sw? -i : i;
			System.out.printf(sw? "%d+":"%d-",i);
			sw= !sw; //sw = true;,  sw= false;  두번 선언할 필요없음
		} //for
			System.out.printf("\b=%d\n",sum);

	} // main

}//class
