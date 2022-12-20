package ex6.has_a;

public class CapsuleTest {
public static void main(String[] args) {
	
	// 성적을 입력받기위한 대상
	// 성적 객체를 준비한다.

	// 성적 뉴렉성적 = new 성적();
	// 성적을 입력 받는다.
	ExamConsole console = new ExamConsole();
//	Exam exam = new Exam();
//	console.setExam(exam);  asossiation has_a 관계
// exam을 바꿔낄수있는 관계형성 assosiation has_a 관계
// exam을 바꿔낄수 없는 관계형성 composion has_a 관계
// composition 관계를 사용하면 결합도가 상승되기때문에 assosiation 관계선호 
	console.input();	
	console.print();	
}
}
