package ex2.array;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) throws IOException {
		
		// 문제 4
		int[] nums = new int[15];
		{
			FileInputStream fis = new FileInputStream("res/data.txt");
			Scanner scan = new Scanner(fis);
			
			for(int i=0; i<15; i++)
				nums[i] = scan.nextInt();
			
			System.out.println("로드 완료");
			
			scan.close();
			fis.close();
		}
		
		{
			Random rand = new Random();
			int s, d;
			
			for(int i=0; i<50; i++) {
				s = rand.nextInt(15);
				d = rand.nextInt(15);
				
				int temp = nums[s];
				nums[s] = nums[d];
				nums[d] = temp;
			}
			
			for(int i=0; i<15; i++)
				System.out.printf("%d, ",nums[i]);
			
			System.out.println("번호 섞기 완료");
		}
		
		{	// 4. res/data-out.txt 파일로 배열의 값들을 저장 
			FileOutputStream fos = new FileOutputStream("res/data-out.txt");
			PrintStream out = new PrintStream(fos);
			
			for(int i=0; i<15; i++) {
					out.printf("%d", nums[i]);
				if(i!=14)
					out.print(" ");    
				else
					out.println();
			}
			
			System.out.println("저장 완료");
			
			out.close();
			fos.close();
		}
		
		// sort 하기
		// 버블 정렬 / 뽀글뽀글 정렬 / 왕 겨루기
		{
			// 제일 큰 번호 순서를 몇 번째까지 구할 것인지의 반복
			for(int j=0; j<15-1; j++)
				// 제일 큰 번호를 제일 끝으로 옮기기
				for(int i=0; i<15-1-j; i++) 
					if(nums[i]>nums[i+1]) { // i<->i+1에서 i가 더 크면 바꾼다.
						// 바꾸기
						int temp = nums[i];
						nums[i] = nums[i+1];
						nums[i+1] = temp;
					}
		}
		
		// 출력하기
		{
			for(int i=0; i<15; i++)
				System.out.printf("%d ", nums[i]);
		}
		
		
	}
}































