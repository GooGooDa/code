package ex1.test;

public class OmokTest2 {
	public static void main(String[] args) {
//		for (int i = 0; i < 100; i++) {
//			if(i==22)
//			System.out.printf("%c", '○');
//			else
//			System.out.printf("%c", '╋');
//		if(i%10==9)
//			System.out.println();
//		} 1차원의 오목판이기 때문에 직관적이지 못함

	
		
		for (int y = 1; y <= 10; y++) {  //좌표값 이기때문에 1부터 시작하는것이 맞다 , 1부터 시작했기 때문에 <=로 10번 반복가능
		 // 테두리를 부분의 인덱스가 삭제되었기때문에 8칸밖에 오목을 둘수밖에 없다.
			
			//확장성이 떨어지는 부분
			for (int x = 1; x <= 10; x++) 
			if(x==3 && y==3)
			System.out.printf("%c",'●');
			else if(y == 1 && x ==1)
				System.out.printf("%c", '┌');
			else if(y == 1 && x ==10)
				System.out.printf("%c", '┐');
			else if(y == 1)
				System.out.printf("%c", '┬');
			else if(y == 10)
				System.out.printf("%c", '┴');
			else if(x ==1)
				System.out.printf("%c", '├');
			else if(x == 10)
				System.out.printf("%c", '┤');
			else if(y == 10 && x ==1)
				System.out.printf("%c", '└');
			else if(y == 10 && x ==10)
				System.out.printf("%c", '┘');
			else
				System.out.printf("%c", '┼');
			System.out.println();
		
		}
	}
}
