package ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class KorTest5 {
	public static void main(String[] args) throws IOException {
		int kor1 = 0, kor2 = 0, kor3 = 0, total = 0, menu = 0, answer = 1;
		double avg = 0;

		NEWLEC: while (answer == 1) {
			System.out.println("┌───────────────────────────┐");
			System.out.println("│           메인메뉴                                                       │");
			System.out.println("└───────────────────────────┘");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.성적파일 입력");
			System.out.println("4.성적파일 저장");
			System.out.println("5. 종료");
			System.out.println(">_");
			Scanner scan = new Scanner(System.in);
			menu = scan.nextInt();
			switch (menu) {

			case 1:
				System.out.println("┌───────────────────────────┐");
				System.out.println("│          성적입력                                                        │");
				System.out.println("└───────────────────────────┘");

				System.out.println("국어성적 : 1");
				kor1 = scan.nextInt();
				System.out.println("국어성적 : 2");
				kor2 = scan.nextInt();
				System.out.println("국어성적 : 3");
				kor3 = scan.nextInt();
				//조건절 추가 하지않음 조건검사 추가 예정
				break;

			case 2:

				total = kor1 + kor2 + kor3;
				avg = total / 3.0;

				System.out.println("┌───────────────────────────┐");
				System.out.println("│          성적출력                                                        │");
				System.out.println("└───────────────────────────┘");
				System.out.printf("국어성적1 : %d\n", kor1);
				System.out.printf("국어성적2 : %d\n", kor2);
				System.out.printf("국어성적3 : %d\n", kor3);
				System.out.printf("총점 : %d\n", total);
				System.out.printf("평균 : %6.2f\n", avg);
				break;

			case 3:
				FileInputStream fis = new FileInputStream("res/KorTest5.csv");
				Scanner scan2 = new Scanner(fis);
				String line = scan2.nextLine();
				String kors[] = line.split(",");

				kor1 = Integer.parseInt(kors[0]);
				kor2 = Integer.parseInt(kors[1]);
				kor3 = Integer.parseInt(kors[2]);

				fis.close();
				break;

			case 4:
				FileOutputStream fos = new FileOutputStream("res/KorTest5.csv");
				PrintStream out = new PrintStream(fos);
				out.printf("%d,%d,%d", kor1, kor2, kor3);
				fos.close();
				break;

			default:
				System.out.println("잘못입력하셨습니다.");
				System.out.println("치명적인 오류로 시스템을 종료합니다.");
				break NEWLEC;
			}

			System.out.println("종료: 0/계속: 1");
			answer = scan.nextInt();
		}
		System.out.println("Bye~!");
	}
}
