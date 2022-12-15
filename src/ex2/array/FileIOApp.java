
package ex2.array;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileIOApp {

	public static /* 주석삽입 */ void main(String[] args) throws IOException {
		int total = 0;
		int[] kors = new int[3];
		double avg;

		int menu = 0;
		int answer = 1;

		for (int i = 0; i < 3; i++)
			kors[i] = 0;

		 // Label을 통해서 while문을 벗어날수 있다. 사용방법 label: break LABEL;
		NEWLEC:while (answer == 1) {

			{
				Scanner scan = new Scanner(System.in);
				System.out.println("┌───────────────────────────────────┐");
				System.out.println("│                                        메인메뉴                                                 │");
				System.out.println("└───────────────────────────────────┘");
				System.out.println("1. 성적입력");
				System.out.println("2. 파일입력");
				System.out.println("3. 성적출력");
				System.out.println("4. 저장");
				System.out.println("5. 종료");
				System.out.println(">");
				menu = scan.nextInt();
			}
			switch (menu) {

			case 1: {// 콘솔 입력블럭
				Scanner scan = new Scanner(System.in);

				System.out.println("┌───────────────────────────────────┐");
				System.out.println("│                                        성적입력                                                 │");
				System.out.println("└───────────────────────────────────┘");

				for (int i = 0; i < 3; i++) {
					do {
						System.out.printf("kor%d:", i + 1);
						kors[i] = scan.nextInt();
						if (kors[i] < 0 || kors[i] > 100)
							System.out.println("잘못된 값을 입력하셨습니다. 0~100사이에 값을 입력해주세요");
					} while (kors[i] < 0 || kors[i] > 100); // &&는 합집합 || OR은 둘중 하나라도 포함된다면! 헷갈리지 않기!
				}
				scan.nextLine();
				// Buffer에 남은값을 지우기 위한용도로 사용
			} // 변수의 지역화 중괄호로 할수있음

				break;
			// System.out.println("2번 검사전");
			case 2: {
				{ // 파일 입력블럭
					// ------------------------------------------------------
					FileInputStream fis = new FileInputStream("res/Test.csv");

					Scanner scan = new Scanner(fis);

					String line = scan.nextLine();
					String[] tokens = line.split(","); // line을 콤마로 split(쪼갠다) 이후 배열에 담음
					for (int i = 0; i < 3; i++)
						kors[i] = Integer.parseInt(tokens[i]);
					scan.close();
					fis.close();
					// ------------------------------------------------------
				} // csv파일은 콤마로 값을 나눠서 보관한다.
			}
				// System.out.println("3번 검사전");
				break;
			case 3: {
				{ // 콘솔입력 블럭
					for (int j = 0; j < 3; j++)
						total = +kors[j];

					avg = total / 3.0;
					int count = 0;
					Scanner scan = new Scanner(System.in);

					System.out.println("출력을 반복할 숫자를 입력해주세요");
					count = scan.nextInt();
					for (int c = 0; c < count; c++) {
						// float을 double로 변환
						System.out.printf("----------------------------------<%d>--------------------------------------------\n",
								count - c);
						System.out.println("┌───────────────────────────────────┐");
						System.out.println("│                                         성적출력                                                │");
						System.out.println("└───────────────────────────────────┘");
						for (int i = 0; i < 3; i++) {
							System.out.printf("국어%d : %3d\n", i+1,kors[i]);
						}
						System.out.printf("총점 : %3d\n", total); // 정수 3자리까지 %3d
						System.out.printf("평균 : %6.2f\n", avg); // 100.00 .까지 포함해서 전체6자리 소숫점 2자리 6.2f
					}
					// out.close 콘솔은 close하면 안됨!
				}
			}
				// System.out.println("4번 검사전");
				break;
			case 4: {
				FileOutputStream fos = new FileOutputStream("res/Test.csv");
				PrintStream out = new PrintStream(fos);
				// 응용객체 PrintStream을 이용한 out생성
				for (int i = 0; i < 3; i++) {
					out.printf("%d", kors[i]);
					if(i!=2) //<2
						out.print(",");
					else
						out.print("\n");
				}
				System.out.println("저장완료!");
				fos.flush();
				fos.close();
			} // 파일 저장블럭
				// close 작업까지 해줘야함
				// close 작업은 모든 작업이 끝나고 진행 먼저 close가 되면 코드실행 안됨
				break;

			case 5: {
				System.out.println("계속 하시겠습니까? 계속:1/종료:0");
				Scanner scan = new Scanner(System.in);
				answer = scan.nextInt();
				// 만약 aswer의 값이 0이면 While Loop벗어난다
			}

			default: {
				System.out.println("잘못된값을 입력하셨습니다. 0~5번까지만 입력할수 있습니다.\n");
				System.out.println("치명적인 오류로 프로그램을 종료합니다.");
				 break NEWLEC;
			}
			}

			// ConsoleOutputStream out = new ConsoleOutputStream(); 을 사용할수 없는 이유(필수콘솔이기 때문에
			// 개별생성이 불가함)
			// System.out.p

			{
				System.out.println("계속 하시겠습니까? 계속:1/종료:0");
				Scanner scan = new Scanner(System.in);
				answer = scan.nextInt();
				// 만약 aswer의 값이 0이면 While Loop벗어난다

			}
		}
		System.out.println("Bye!"); // WhileLoop가 끝날때 문자출력이 되는구조 루프가 종료될때 콘솔에 표시

	}
}