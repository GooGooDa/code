package ex1.test;

public class OmokTest {
	public static void main(String[] args) {
//		for (int i = 0; i < 100; i++) {
//			if(i==22)
//			System.out.printf("%c", '○');
//			else
//			System.out.printf("%c", '╋');
//		if(i%10==9)
//			System.out.println();
//		} 1차원의 오목판이기 때문에 직관적이지 못함

		//순서대로 진행되는걸 알고 프로그래밍하기!
		//보기에는 불편하지만 유지보수및 확장성이 좋다.
		
		System.out.printf("%c",'┌');

		for(int i=0;i<10;i++) 
		System.out.printf("%c" , '┬');
		
		System.out.printf("%c",'┐');
		System.out.println();
		
		
		
		for (int y = 1; y <= 10; y++) {  //좌표값 이기때문에 1부터 시작하는것이 맞다 , 1부터 시작했기 때문에 <=로 10번 반복가능
			System.out.printf("%c" , '├');
			for (int x = 1; x <= 10; x++) 
			if(x==3 && y==3)
			System.out.printf("%c",'●');
			else
			System.out.printf("%c", '┼');
			System.out.printf("%c" , '┤');
			System.out.println();
		
		}
		
System.out.printf("%c",'└');
		
		for(int i=0;i<10;i++) 
		System.out.printf("%c" , '┴');
		
		System.out.printf("%c",'┘');
		System.out.println();
	}
}
