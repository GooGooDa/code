package ex08.wrapper;

import ex4.classTest.Exam;

public class WrapperTest {

	public static void main(String[] args) {
		Exam exam = new Exam();
		String str = new String("Hello");
		
		Object[] list = new String[2];
		
		list[0] = str;
		list[1] = exam;
		Integer d = 3;
		int x = d;// object에 기본자료형을 담을수 없음
		//하지만 컴파일러가 auto boxing 해줌
	}

}
