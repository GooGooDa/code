package ex4.classTest;

public class ExamAppP {
public static void main(String[] args) {
 Exam exams = new Exam();
 Exam[] exam = new Exam[3];
 
 exam[0] = new Exam();
 exam[0].kor = 100;
 
 System.out.println(exam[0].kor);
 
}
}
