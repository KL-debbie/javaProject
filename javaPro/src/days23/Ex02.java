package days23;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;


import days10.Ex06_04;
import days23.Student;

public class Ex02 {
	
	public static void main(String[] args) throws IOException {
		
		String name;
		int kor,eng,mat,tot;
		double avg;
		int rank;
		int wrank;

		final int STUDENT_COUNT=30;
		//final int CLASS_COUNT =3;
		

		ArrayList<Student> class1List = new ArrayList<>();
		ArrayList<Student> class2List = new ArrayList<>();
		ArrayList<Student> class3List = new ArrayList<>();
		
		ArrayList<ArrayList<Student>>  sistList = new ArrayList<>();// 한반의 ArrayList 요소 담기
		sistList.add(class1List);
		sistList.add(class2List);
		sistList.add(class3List);
		
		// 입력받은 학생수 필요 X
	
		char con ='y';
		Scanner sc = new Scanner(System.in);
		int ban ;
		

		// 학생 정보 입력
		do {
			System.out.print("반 입력 ? ");
			ban = sc.nextInt();

			// 반입력되자마자 저장할 클래스리스트
			ArrayList<Student> classList = sistList.get(ban-1);
			
			System.out.printf(">%d반의 [%d]번 학생의 이름,국어,영어,수학 입력 ? ", ban, classList.size()+1); 			
			int no= classList.size()+1;
			name =Ex06_04.getName();
			kor=Ex06_04.getScore();
			eng=Ex06_04.getScore();
			mat=Ex06_04.getScore();

			tot = kor+eng+mat;
			avg =(double)tot/3;
			rank=1;
			wrank=1;


			Student s = new Student(no, name, kor, eng, mat, tot, avg, rank, wrank);
			classList.add(s);
			
			System.out.println("계속 진행 ? ");
			con =(char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');

		/*
		 int totalStudents=0;
	       Iterator<ArrayList<Student>> ir = sistList.iterator();
	        while (ir.hasNext()) {
	             ArrayList<Student> classList = ir.next();          
	             totalStudents += classList.size();
	         } //while
	       System.out.printf("\t\t학생 정보 출력( %d명 )\n", totalStudents);
		*/
		
		// 입력한 총 학생수 출력
		System.out.println("-".repeat(10));
		
		//sistList.stream().mapToInt(classList-> classList.size()).forEach(학생수->System.out.println(학생수)); //한 반 classList 각 반의 학생수를 가지고 있는 int형태를 가지는 새로운 stream으로 만들겠다..
		
		//										  메서드참조
		// sistList.stream().mapToInt(ArrayList::size).forEach(System.out::println);  
		
		//stream 안의 총 합 구하기
		 int totalStudents = sistList.stream().mapToInt(ArrayList::size).sum();
		 System.out.printf("\t\t학생 정보 출력( %d명 )\n", totalStudents);
		 
		 System.out.println("-".repeat(10));
		
		// 학생수 출력
		Iterator<ArrayList<Student>>  ir =sistList.iterator();
		ban =1;
		while (ir.hasNext()) {
			ArrayList<Student> classList =  ir.next();
			System.out.printf("[%d반 학생 : %d명]\n", ban++, classList.size());
			
			Iterator<Student> ir2 = classList.iterator();
			while (ir2.hasNext()) {
				Student s =ir2.next();
				System.out.println(s.toString());
			}//while
			
		}//while
		
	}//main

}//c


