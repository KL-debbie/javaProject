package days11;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author KL
 * @date 2023. 7. 27. - 오전 10:04:29
 * @subject 복습 2번
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) throws IOException {
		
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		
		int max = IntStream.of(m).max().getAsInt();
		System.out.printf("max = %d\n",max);
		
		/*
		int maxCount=0;
		for (int i = 0; i < m.length; i++) {
			if(m[i]==max) maxCount++;
		} // for
		*/
		
		// 람다식
		int maxCount = (int) IntStream.of(m).filter(i->i==max).count();  // 하나하나 가져와서 비교   if(m[i]==max) maxCount++; 와 동일
		
		System.out.printf("maxCount = %d", maxCount);
		
		int [] maxInderArr= new int[maxCount];
				
	}//main

}//class
