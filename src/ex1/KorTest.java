package ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class KorTest {
public static void main(String[] args) throws IOException {
	while(true) {
	int kor1,kor2,kor3,total;
	double avg;
	{
	Scanner scan = new Scanner(System.in);
	
	System.out.println("┌────────────────────┐");
	System.out.println("│       성적입력       │");
	System.out.println("└────────────────────┘");
	System.out.println("kor1 : ");
	kor1 = scan.nextInt();
	System.out.println("kor2 : ");
	kor2 = scan.nextInt();
	System.out.println("kor3 : ");
	kor3 = scan.nextInt();
	scan.nextLine();
	}
	
	{
//		-------------------------------------
		FileInputStream fis = new FileInputStream("res/newTest1.csv");
		Scanner scan = new Scanner(fis);
		
		String line = scan.nextLine();
		String kors[] = line.split(",");
		
		kor1 = Integer.parseInt(kors[0]);
		kor2 = Integer.parseInt(kors[1]);
		kor3 = Integer.parseInt(kors[2]);
		
		scan.close();
		fis.close();
		
//		-------------------------------------
		
		}

	{
	total = kor1 + kor2 + kor3;
	avg = total/3.0;
	
	System.out.println("┌────────────────────┐");
	System.out.println("│       성적출력       │");
	System.out.println("└────────────────────┘");
	System.out.printf("kor1 : %3d\n" , kor1);
	System.out.printf("kor2 : %3d\n" , kor2);
	System.out.printf("kor3 : %3d\n" , kor3);
	System.out.printf("총점 :  %3d\n" , total);
	System.out.printf("평균 :  %6.2f\n" , avg);
	
	FileOutputStream fos = new FileOutputStream("res/newTest1.csv");
	PrintStream out = new PrintStream(fos);
	
	out.printf("%d,%d,%d",kor1,kor2,kor3);
			}
			
		}
	}
}
