
package ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileIOApp3 {
	
	public static /* 주석삽입 */ void main(String[] args) throws IOException {
		int kor1, kor2, kor3, total;
		double avg;
		
		int menu;
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("┌───────────────────────────────────┐");
			System.out.println("│              메인메뉴               │");
			System.out.println("└───────────────────────────────────┘");
			System.out.println("1. 성적입력");
			System.out.println("2. 파일입력");
			System.out.println("3. 성적출력");
			System.out.println("4. 저장");
			System.out.println("5. 종료");
			System.out.println(">");
			menu = scan.nextInt(); 
		}
		int answer = 1;
		while (answer == 1) {
			// ConsoleOutputStream out = new ConsoleOutputStream(); 을 사용할수 없는 이유(필수콘솔이기 때문에
			// 개별생성이 불가함)
			{// 콘솔 입력블럭
				Scanner scan = new Scanner(System.in);

				System.out.println("┌───────────────────────────────────┐");
				System.out.println("│              성적입력               │");
				System.out.println("└───────────────────────────────────┘");
				
				do {
				System.out.print("kor1:");
				kor1 = scan.nextInt();
				if(kor1<0 || kor1>100)
				System.out.println("잘못된 값을 입력하셨습니다. 0~100사이에 값을 입력해주세요");
				}
				while(kor1<0 || kor1>100);  //&&는 합집합 || OR은 둘중 하나라도 포함된다면! 헷갈리지 않기!
				
				do {
				System.out.print("kor2:");
				kor2 = scan.nextInt();
				if(kor2<0 || kor2>100)
					System.out.println("잘못된 값을 입력하셨습니다. 0~100사이에 값을 입력해주세요");
				}while(kor2<0 || kor2>100);
				
				do {
					System.out.print("kor3:");
					kor3 = scan.nextInt();
					if(kor3<0 || kor3>100)
						System.out.println("잘못된 값을 입력하셨습니다. 0~100사이에 값을 입력해주세요");
					}while(kor3<0 || kor3>100);
				scan.nextLine();
				// Buffer에 남은값을 지우기 위한용도로 사용
			} // 변수의 지역화 중괄호로 할수있음

			{ // 파일 입력블럭 
				// ------------------------------------------------------
				FileInputStream fis = new FileInputStream("res/Test.csv");

				Scanner scan = new Scanner(fis);

				String line = scan.nextLine();

				String[] kors = line.split(","); // line을 콤마로 split(쪼갠다) 이후 배열에 담음
				kor1 = Integer.parseInt(kors[0]);
				kor2 = Integer.parseInt(kors[1]);
				kor3 = Integer.parseInt(kors[2]);
				scan.close();
				fis.close();
				// ------------------------------------------------------
			} // csv파일은 콤마로 값을 나눠서 보관한다.

			{ // 콘솔입력 블럭
				total = kor1 + kor2 + kor3;
				avg = total / 3.0;
				// float을 double로 변환

				System.out.println("┌───────────────────────────────────┐");
				System.out.println("│              성적출력               │");
				System.out.println("└───────────────────────────────────┘");
				System.out.printf("국어1 : %3d\n", kor1);
				System.out.printf("국어2 : %3d\n", kor2);
				System.out.printf("국어3 : %3d\n", kor3);
				System.out.printf("총점 : %3d\n", total); // 정수 3자리까지 %3d
				System.out.printf("평균 : %6.2f\n", avg); // 100.00 .까지 포함해서 전체6자리 소숫점 2자리 6.2f

				System.out.print(total + "\n");
				System.out.print(avg + "\n");

				// out.close 콘솔은 close하면 안됨!
			}

			{
				FileOutputStream fos = new FileOutputStream("res/Test.csv");
				PrintStream out = new PrintStream(fos);
				// 응용객체 PrintStream을 이용한 out생성
				out.printf("%d,%d,%d\n", kor1, kor2, kor3);
				fos.flush();
				fos.close();
			} // 파일 저장블럭
				// close 작업까지 해줘야함
				// close 작업은 모든 작업이 끝나고 진행 먼저 close가 되면 코드실행 안됨


			// System.out.p
			{
				System.out.println("계속 하시겠습니까? 계속:1/종료:0");
				Scanner scan = new Scanner(System.in);
				answer = scan.nextInt();
				 //만약 aswer의 값이 0이면 While Loop벗어난다
					
				
			}

		}
		System.out.println("Bye!"); //WhileLoop가 끝날때 문자출력이 되는구조 루프가 종료될때 콘솔에 표시
	}

}