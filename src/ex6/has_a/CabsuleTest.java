package ex6.has_a;

public class CabsuleTest {
	public static void main(String[] args) {
		// 성적을 입력받기위한 대상
		// 성적 객체를 준비한다.

		// 성적 뉴렉성적 = new 성적();
		// 성적을 입력 받는다.
		Exam 뉴렉성적 = new Exam(1,2,3);
		뉴렉성적.init();

		// 뉴렉성적.입력();
		Exam.intputExam(뉴렉성적);
		뉴렉성적.input();

		// 성적을 출력한다.
		// 뉴렉성적.출력();
//		Exam.printExam(뉴렉성적);
		뉴렉성적.print();
		뉴렉성적.print('※',50);
	}

}
