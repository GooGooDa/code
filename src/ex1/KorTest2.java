package ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class KorTest2 {
	public static void main(String[] args) throws IOException {
		int kor1, kor2, kor3, total;
		double avg;
		{
			Scanner scan = new Scanner(System.in);

			System.out.println("-------------성적입력-----------");
			System.out.println("국어 1 : ");
			kor1 = scan.nextInt();
			System.out.println("국어 2 : ");
			kor2 = scan.nextInt();
			System.out.println("국어 3 : ");
			kor3 = scan.nextInt();
		}
		
		{
			FileInputStream fis = new FileInputStream("res/KorTest2.csv");
			Scanner scan = new Scanner(fis);
			
			String line = scan.nextLine();
			String kors[] = line.split(",");
			
			kor1 = (Integer.parseInt(kors[0]));
			kor2 = (Integer.parseInt(kors[1]));
			kor3 = (Integer.parseInt(kors[2]));
			
			System.out.printf("%d,%d,%d",kor1,kor2,kor3);
			
			scan.close();
			fis.close();
			}
		
		{
			total = kor1 + kor2 + kor3;
			avg = total / 3.0;
			
				FileOutputStream fos = new FileOutputStream("res/KorTest2.csv");
				PrintStream out = new PrintStream(fos);
				out.printf("%d,%d,%d",kor1,kor2,kor3);
			}
		
		
			}
		}
	
