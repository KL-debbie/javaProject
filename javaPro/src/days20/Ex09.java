package days20;

import java.text.ChoiceFormat;

public class Ex09 {
	
	public static void main(String[] args) {
		// 형식화 클래스 3 ChoiceFormat
		// 1) 특정 범위에 속하는 값을 문자열로 변환해 준다.
		// 2) 불연속적인 범위의 값을 처리하는 데 if문 switch문을 대신해서 사용 할 수 있다.
		//		ㄴ> 복잡한 처리를 간단한 코딩으로 처리할 수 있다.
		// 예) 국어 점수 입력 받아 수우미양가 출력
		//		if, switch -> ChoiceFormat 클래스 사용해서 처리
		
		//limit#value
		String pattern = "0#가|60#양|70#미|80#우|90#수";
		ChoiceFormat cf = new ChoiceFormat(pattern);
		
		
		/*
		double[] limits = { 0, 60, 70, 80, 90}; //작은 값부터
		String[] formats= {"가","양","미","우","수"};
		ChoiceFormat cf = new ChoiceFormat(limits, formats);
		*/
		
		int[] kors = {100,67,23,99};
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("%d -> %s 등급\n", kors[i], cf.format(kors[i]));
		} // for
		
		
	} // main

}//cls
