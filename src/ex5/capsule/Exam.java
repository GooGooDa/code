package ex5.capsule;

import java.util.Scanner;

import ex5.capsule.Exam;

public class Exam {
	private int kor;
	private int eng;
	private int math;

	public void init() {
		kor = 30;
		eng = 30;
		math = 30;
		//생성자 이용해서 초기화 해야함 init을 위한 초기화는 지양 
	}

	public Exam(int kor, int eng, int math) {
		kor = this.kor;
		eng = this.eng;
		math = this.math;
	}

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

	// 기본함수
	public void print() {
		print('-'); // 기본값
	}

	public void print(char ch) {
		print('-', 30);
	}

	// 오버로드 함수
	public void print(char ch, int length) {
		int total = total();
		double avg = avg();

		System.out.printf("kor : %3d\n", kor);
		System.out.printf("eng : %3d\n", eng);
		System.out.printf("math : %3d\n", math);
		System.out.printf("total : %d\n", total);
		System.out.printf("avg : %6.2f\n", avg);
		for (int i = 0; i < length; i++)
			System.out.printf("%c", ch);

	}

	private double avg() {
		return total()/3.0;
	}

	private int total() {
		return kor+eng+math; //계산값 바로 return
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
		System.out.printf("kor: %d\neng: %d\nmath: %d\n", kor, eng, math);
		System.out.println("나는 함수------------------------------------");

	}

}
