package ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class KorTest4 {
	public static void main(String[] args) throws IOException {

		int kor1 = 0;
		int kor2 = 0;
		int kor3 = 0;
		int total = 0;
		double avg = 0;
		int answer = 1;
		int menu = 0;

		NEWLEC:
		while (answer == 1) {
			Scanner scan = new Scanner(System.in);
			System.out.println("┌─────────────────────────┐");
			System.out.println("│         메인메뉴          │");
			System.out.println("└─────────────────────────┘");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.성적파일입력");
			System.out.println("4.성적파일저장");
			System.out.println("5.종료");
			System.out.println(">");
			menu = scan.nextInt();
			switch (menu) {

			case 1: {
				System.out.println("┌─────────────────────────┐");
				System.out.println("│         성적입력          │");
				System.out.println("└─────────────────────────┘");
				do {
					System.out.println("국어성적 1 :");
					kor1 = scan.nextInt();
					if(kor1<0 || kor1>100) {
					System.out.println("0~100까지의 수만 입력가능합니다.");
					}
				}while(kor1<0 || kor1>100);
				do {
					System.out.println("국어성적 2 :");
					kor2 = scan.nextInt();	
					if(kor2<0 || kor2>100) {
					System.out.println("0~100까지의 수만 입력가능합니다.");
					}
				}while(kor2<0 || kor2>100);
				do {
					System.out.println("국어성적 3 :");
					kor3 = scan.nextInt();
					if(kor3<0 || kor3>100) {
					System.out.println("0~100까지의 수만 입력가능합니다.");
					}
				}while(kor3<0 || kor3>100);
				break;
			}
			case 2: {
				total = kor1 + kor2 + kor3;
				avg = total / 3.0;
				System.out.println("┌─────────────────────────┐");
				System.out.println("│         성적출력          │");
				System.out.println("└─────────────────────────┘");
				System.out.printf("국어 1 : %d\n", kor1);
				System.out.printf("국어 2 : %d\n", kor2);
				System.out.printf("국어 3 : %d\n", kor3);
				System.out.printf("총점 : %d\n", total);
				System.out.printf("평균 : %6.2f\n", avg);
				break;
			}
			case 3: {
				FileInputStream fis = new FileInputStream("res/Test4.csv");
				Scanner scan2 = new Scanner(fis);
				String line = scan2.nextLine();
				String kors[] = line.split(",");
				kor1 = Integer.parseInt(kors[0]);
				kor2 = Integer.parseInt(kors[1]);
				kor3 = Integer.parseInt(kors[2]);

				fis.close();
				scan2.close();
				break;
			}
			case 4: {
				FileOutputStream fos = new FileOutputStream("res/Test4.csv");
				PrintStream out = new PrintStream(fos);
				out.printf("%d,%d,%d", kor1, kor2, kor3);

				fos.close();
				break;
			}
			case 5: {
				answer = 0;
				break;
			}

			default: {
				System.out.println("치명적인 오류로 시스템을 종료합니다.");
				break NEWLEC;
			}
			}
			{
				System.out.println("계속:1/종료0");
				answer = scan.nextInt();
			}
		}
		System.out.println("Bye~!");

	}
}
