package ex1.test;

import java.util.Scanner;

public class OmokTest4 {
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
		char[][] board = new char[10][10];{
		//[y].[x]
		
//			System.out.println("(y,x)");	
//			int oy,ox;
//			Scanner scan = new Scanner(System.in);
//			
//			oy = scan.nextInt();
//			ox = scan.nextInt();
			
			
			
			for(int y=0;y<10;y++) {
			for(int x=0;x<10;x++) {
			board[y][x] = '┼';
//			board[oy][ox] = '○';
			
//			board[0][x] = '┬';
//			board[9][x] = '┻'; 반복이 많은코드 좋지않음
			}
			
		}	for(int y=1;y<=10;y++) {
			for(int x=1;x<=10;x++) {
				System.out.printf("%c",board[y-1][x-1]);
//				System.out.printf("%c",board[oy][ox]);
				
			}
			System.out.println();
		}
		
		
		
		
		
			
			}
			
			// for문 10번 돌리기로 x,y의 한축을 마감 할수있음
			
			
			
			
		}
	
		
		
//			board[10] = '●'; //메모리 랜덤엑세스의 장점
//			board[43] = '●'; //메모리 랜덤엑세스의 장점
		
			//2차원배열 이없었을때의 배열
//			board[(2-1)*10+(2-1)] = '○';
				
//			for(int i=0;i<100;i++) {
//			if(i%10==9)
//				System.out.println();
//			System.out.printf("%c",board[i]);
//		}
	
	}

