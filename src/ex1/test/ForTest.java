package ex1.test;

public class ForTest {
	public static void main(String[] args) {

//	for(int i=0; i<5; i++) {
//		System.out.printf("%d", 1);
//		} Test1 기본적인 for문

//	for(int i=0; i<5; i++) {
//		System.out.printf("%d", i+1);
//		
//		} Test2 for문 i 숫자출력

//	for(int i=0; i<5; i++) {
//		System.out.printf("%d", i+1);
//		System.out.print(",");
//		} Test3 중간에 쉼표찍기
//	

//		for (int i = 0; i < 5; i++) {
//			System.out.printf("%d", i + 1);
//			if(i!=4) //마지막이 아닐때 ",찍기" & 4보다 작을때 i<4 사용가능
//				System.out.print(",");
//			
//		} Test4

//		for (int i = 0; i < 5; i++) {
//			System.out.print("☆");
//			System.out.printf("%d", i + 1);
//			if(i!=4) //앞에 별을 찍기
//			System.out.print(",");
//			
//		} Test5

//		for (int i = 0; i < 5; i++) { //좋은방식은 아님 중괄호의 영역이 넓다면 좋은코드는 아니다.
//			if (i!=2) {
//				System.out.print("☆");
//				System.out.printf("%d", i + 1);
//				if (i != 4) 
//					System.out.print(",");
//			}
//		} Test6 3번째 ☆,빼고 출력하기

//		for (int i = 0; i < 5; i++) { // 좋은방식은 아님 중괄호의 영역이 넓다면 좋은코드는 아니다.
//			if (i == 2) {
//				continue;
//			}
//			System.out.print("☆");
//			System.out.printf("%d", i + 1);
//			if (i != 4) {
//				System.out.print(",");
//			}
//		} Test6 CleanCode 3번째 ☆,빼고 출력하기

//		for (int i = 0; i < 5; i++) { 
//			if (i == 3) {
//				break;
//			}
//			System.out.print("☆");
//			System.out.printf("%d", i + 1);
//			if (i != 2) {
//				System.out.print(",");
//			} Test7 3번째까지 출력 멈추기 1
//		}
		
//		for (int i = 0; i < 5; i++) { 
//			
//			System.out.print("☆");
//			System.out.printf("%d", i + 1);
//			if (i != 2) {
//				System.out.print(",");
//			}
//			if (i == 2) {
//				break;
//			} Test7 3번째까지 출력 멈추기 2
//		}
//		
//		for (int i = 0; i < 5; i++) { 
//			if(i>1) {
//			System.out.print("☆");
//			System.out.printf("%d", i + 1);
//			}
//			if (i > 1 && i != 4) {
//				System.out.print(",");
//			} Test8 3번째부터 출력하기 내가 쓴답
//			
//		}
		for (int i = 0; i < 5; i++) { 
			if(i<2) 
			continue;
			
				System.out.print("☆");
				System.out.printf("%d", i + 1);
	
			if (i > 1 && i != 4) 
				System.out.print(",");
			
		
		} //Test8 3번째부터 출력하기 강사님 정답
	}
}
