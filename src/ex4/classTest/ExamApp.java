package ex4.classTest;

public class ExamApp {
	public static void main(String[] args) {
		
		Exam exam1 = new Exam(); // exam1 [kor][eng][math]
		exam1.kor = 10; // kor은 heap에 있음 stack의 exam1이름을 통해서 접근할수있음
		exam1.eng = 20; // kor은 heap에 있음 stack의 exam1이름을 통해서 접근할수있음
		exam1.math = 30; // kor은 heap에 있음 stack의 exam1이름을 통해서 접근할수있음

		
		printExam(exam1);
		Exam[] exams = new Exam[3];
		// exam 참조변수 3개가 만들어짐
		// exam참조변수를 3가지를 만듬
		// new 생성 동적메모리 할당 heap에 할당
		exams[0] = new Exam(); // 꼭 배열객체만들고 new로 선언해줘야함
		exams[0].kor = 30;
		exams[0].eng = 30;
		exams[0].math = 30;

		exams[1] = new Exam();
		exams[1].kor = 30;
		exams[1].eng = 30;
		exams[1].math = 30;

		exams[2] = new Exam();
		exams[2].kor = 30;
		exams[2].eng = 30;
		exams[2].math = 30;
		printExam(exams);
	}


	private static void printExam(Exam exam) {
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		System.out.printf("kor: %d\neng: %d\nmath: %d\n",kor,eng,math);
		System.out.println("------------------------------------");
	}
	
	private static void printExam(Exam[] exam) {
		for(int i=0;i<3;i++)
			System.out.printf("kor: %d \neng: %d\nmath:%d\n ------------------------------------\n" , exam[i].kor , exam[i].eng , exam[i].math);
	}



}
