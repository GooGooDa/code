package ex3.func;

import java.util.Scanner;

public class OmokTest3 {
	private static int color;
	public static void main(String[] args) {
		char[][] board = new char[10][10];
			initBoard(board);
			printBoard(board);
			
			while (true) {
			inputOmokBoard(board);
			printBoard(board);
		}
	}

	private static void inputOmokBoard(char[][] board) {
		int ox, oy;
		Scanner scan = new Scanner(System.in);
		System.out.print("(x y)>");
		ox = scan.nextInt();
		oy = scan.nextInt();

		// 배열 board를 조작
		if (color % 2 == 0)
			board[oy - 1][ox - 1] = '○';
		else
			board[oy - 1][ox - 1] = '●';

		color++;
	}

	private static void initBoard(char[][] board) {
		for (int y = 1; y <= 10; y++)
			for (int x = 1; x <= 10; x++)
				board[y - 1][x - 1] = '┼';
		for (int i = 0; i < 10; i++) {
			board[0][i] = '┬';
			board[9][i] = '┴';
			board[i][0] = '├';
			board[i][9] = '┤';
		}

		board[0][0] = '┌';
		board[0][9] = '┓';
		board[9][0] = '└';
		board[9][9] = '┘';
	}

	private static void printBoard(char[][] board) {
		for (int y = 1; y <= 10; y++) {
			for (int x = 1; x <= 10; x++)
				System.out.printf("%c", board[y - 1][x - 1]);

			System.out.println();
		}
	}
}
