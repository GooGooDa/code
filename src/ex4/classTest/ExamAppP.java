package ex4.classTest;

public class ExamAppP {
public static void main(String[] args) {
	Exam exams = new Exam();
	Exam[] exam2 = new Exam[3];
	
	exams.kor = 2;
	exam2[0] = new Exam();
	exam2[0].kor = 2;
	System.out.println(exam2[0].kor);
	
}
}
