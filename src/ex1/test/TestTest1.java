package ex1.test;

public class TestTest1 {
public static void main(String[] args) {
	for (int i = 0; i < 5; i++) { // 좋은방식은 아님 중괄호의 영역이 넓다면 좋은코드는 아니다.
	if (i == 2) {
		continue;
	}
	System.out.print("☆");
	System.out.printf("%d", i + 1);
	if (i != 4) {
		System.out.print(",");
	}
}
}
}
