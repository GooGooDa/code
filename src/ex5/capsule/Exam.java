package ex5.capsule;

import java.util.Scanner;

import ex5.capsule.Exam;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	public void input() {
		Scanner scan = new Scanner(System.in);

		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              성적입력               │");
		System.out.println("└───────────────────────────────────┘");

		do {
			System.out.print("국어:");
			kor = scan.nextInt();
			if (kor < 0 || kor > 100)
				System.out.println("잘못된 값을 입력하셨습니다. 0~100사이에 값을 입력해주세요");
		} while (kor < 0 || kor > 100); // &&는 합집합 || OR은 둘중 하나라도 포함된다면! 헷갈리지 않기!

	}
	public void print() {
		System.out.printf("kor : %3d\n", kor);
		System.out.printf("eng : %3d\n", eng);
		System.out.printf("math : %3d\n", math);
		
	}
	
	 static void intputExam(Exam 뉴렉성적) {
		// exam 참조변수 3개가 만들어짐
		// exam참조변수를 3가지를 만듬
		// new 생성 동적메모리 할당 heap에 할당
		뉴렉성적.kor = 100;
	}

	 static void printExam(Exam 뉴렉성적) {
		int kor = 뉴렉성적.kor;
		int eng = 뉴렉성적.eng;
		int math = 뉴렉성적.math;
		System.out.printf("kor: %d\neng: %d\nmath: %d\n",kor,eng,math);
		System.out.println("------------------------------------");
		
	}
	public void init() {
		kor = 30;
		eng = 30;
		math = 30;
		
	}
	
	public Exam() { //Exam형식의 객체만 호출가능 한정사
		kor = 10;
		eng = 10;
		math = 10;
	}
}
