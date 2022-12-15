package ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class KorTest3 {
	public static void main(String[] args) throws IOException {
		int kor1, kor2, kor3, total;
		double avg;
		int  answer = 1;
		while (answer == 1) {
			{
				Scanner scan = new Scanner(System.in);
				System.out.println("kor1 : ");
				kor1 = scan.nextInt();
				System.out.println("kor2 : ");
				kor2 = scan.nextInt();
				System.out.println("kor3 : ");
				kor3 = scan.nextInt();

				scan.nextLine(); // Buffer 비우기
			}
			{
				FileInputStream fis = new FileInputStream("res/KorTest3.csv");
				Scanner scan = new Scanner(fis);

				String line = scan.nextLine();
				String kors[] = line.split(",");

				kor1 = Integer.parseInt(kors[0]);
				kor2 = Integer.parseInt(kors[1]);
				kor3 = Integer.parseInt(kors[2]);

				System.out.printf("%d,%d,%d\n", kor1, kor2, kor3);

				scan.close();
				fis.close();

			}
			{
				total = kor1 + kor2 + kor3;
				avg = total / 3.0;

				FileOutputStream fos = new FileOutputStream("res/KorTest3.csv");
				PrintStream out = new PrintStream(fos);
				out.printf("%d,%d,%d", kor1, kor2, kor3);

				fos.flush();
				fos.close();
			}
			{
				System.out.println("계속하시겠습니까? 종료:0/계속:1");
				Scanner scan = new Scanner(System.in);
				answer = scan.nextInt();
				
			}
		}
		System.out.println("Bye!"); //WhileLoop가 끝날때 문자출력이 되는구조 루프가 종료될때 콘솔에 표시
	}
}
