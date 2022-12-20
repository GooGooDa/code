package ex6.has_a;

import java.util.Scanner;

public class ExamConsole {
	// ExamConsole과 Exam은 컴포지션 has_a 관계
	// ExamConsole이 Exam의 객체를 가지고 있음 has_a
	// Composition has는 직접객체를 가지고있을때
	// 사용자측에서 직접 부품을 변경한다면 assosiation has_a관계
	private Exam exam; // this를 통해서 kor을 이용할수 있다 부품화해서 결합됨
	
	public ExamConsole() {
		exam = new Exam();
	}
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              성적입력               │");
		System.out.println("└───────────────────────────────────┘");
		int kor;
		do {
			System.out.print("국어:");
			kor = scan.nextInt();
			if (kor < 0 || kor > 100)
				System.out.println("잘못된 값을 입력하셨습니다. 0~100사이에 값을 입력해주세요");
		} while (kor < 0 || kor > 100); // &&는 합집합 || OR은 둘중 하나라도 포함된다면! 헷갈리지 않기!

		exam.setKor(kor); // Setter 함수

		int eng;
		
		do {
			System.out.print("영어:");
			eng = scan.nextInt();
			if (eng < 0 || eng > 100)
				System.out.println("잘못된 값을 입력하셨습니다. 0~100사이에 값을 입력해주세요");
		} while (eng < 0 || eng > 100); // &&는 합집합 || OR은 둘중 하나라도 포함된다면! 헷갈리지 않기!
		exam.setEng(eng); // Setter함수
	
	int math;
	
	do {
		System.out.print("수학:");
		math = scan.nextInt();
		if (math < 0 || math > 100)
			System.out.println("잘못된 값을 입력하셨습니다. 0~100사이에 값을 입력해주세요");
	} while (math < 0 || math > 100); // &&는 합집합 || OR은 둘중 하나라도 포함된다면! 헷갈리지 않기!
	exam.setMath(math); // Setter함수
}

	public void print() {
		print('-'); // 기본값
	}

	public void print(char ch) {
		print('-', 30);
	}

	// 오버로드 함수
	public void print(char ch, int length) {
		int total = exam.total();
		double avg = exam.avg();

		System.out.printf("kor : %3d\n", exam.getKor());
		System.out.printf("eng : %3d\n", exam.getEng());
		System.out.printf("math : %3d\n",exam.getMath());
		System.out.printf("total : %d\n", total);
		System.out.printf("avg : %6.2f\n", avg);
		for (int i = 0; i < length; i++)
			System.out.printf("%c", ch);

	}

}
