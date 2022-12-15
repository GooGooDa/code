package ex1.test;

import java.util.Scanner;

public class OmokTest4_T {
	public static void main(String[] args) {
		char[][] board = new char[10][10];
		{
			// [y].[x]
			while(true) { 
			System.out.println("(y,x)");	
			//오목 입력하기
			int oy,ox;
			Scanner scan = new Scanner(System.in);
			
			oy = scan.nextInt();
			ox = scan.nextInt();
			
			
			for (int y = 1; y <= 10; y++) {
				for (int x = 1; x <= 10; x++) {
					board[y - 1][x - 1] = '┼';
				}
			}
			
			board[oy-1][ox-1] = '○';
			
			for (int y = 1; y <= 10; y++) {
				for (int x = 1; x <= 10; x++) {
					System.out.printf("%c", board[y - 1][x - 1]);
				}
				System.out.println();
			}
			} //흑돌백돌 만들기
		}
		}

	}
