package ex1.test;

public class OmokTest3 {
	public static void main(String[] args) {
//		System.out.printf("%c", '┌');
//		for (int i = 0; i < 10; i++)
//		System.out.printf("%c", '┬');
//		System.out.printf("%c", '┐');
//		System.out.println();
//
//		for (int y = 1; y <= 10; y++) {
//			System.out.printf("%c", '├');
//			for (int x = 1; x <= 10; x++)
//				if (x == 3 && y == 3)
//					System.out.printf("%c", '○');
//				else
//					System.out.printf("%c", '┼');
//			System.out.printf("%c", '┤');
//			System.out.println();
//		}
//
//		System.out.printf("%c", '└');
//		for (int i = 0; i < 10; i++)
//			System.out.printf("%c", '┴');
//		System.out.printf("%c", '┘');
//		System.out.println();
		
		char[][] board = new char[10][10];
		
		for(int y=1;y<=10;y++) {
			for(int x=1;x<=10;x++) {
				board[y][x] = '┼';
			}
		}
						
			//2차원배열 이없었을때의 배열
			//board[(5-1)*10+(5-1)] = '○';
				

	}
}
