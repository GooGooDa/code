package ex2.array;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

public class ArrayTest {
	public static void main(String[] args) throws IOException {

//		int[] ar1 = new int[5];
	//	
////		ar1 = new int[7]; 가능함
	//	
//		int[][] ar2 = new int[3][5]; //c++이면 통짜임 자바는 그렇지 않다.
	//	
//		ar2 = new int[2][6]; //가능
//		ar2[0] = new int[9]; //가능
//		int[][] ar3 = new int[3][]; //가능 삐쭉삐쭉 가능하기때문에 톱니형 배열이다.
	//	
			// for문 10개증가.
			// 찾고 break.
			// 스킵 찾고 증가 가능.
			// 2차for문의 의미 왜 2차를 써야하는가?
			// 2차배열을 왜써야하는가 어떻게 달라지는가?
			// 원하는거 찾아서 값을 바꾼다.
		
		
		int[] nums = { 20, 5, 7, 98, 45, 7, 45, 62, 12, 47 ,13,24,31,53,15};
		int temp = 0;
		for (int i = 0; i < 15; i++) { // int nums 를 선언
			System.out.printf("%d", nums[i]);
			if (i < 14)
				System.out.print(",");
		}
		System.out.println();

		// sort하기
		{
			for (int j = 0; j <15-1;j++) {
				for (int i=0; i<15-1-j;i++)
					if (nums[i] > nums[i + 1]) {
						temp = nums[i];
						nums[i] = nums[i + 1];
						nums[i + 1] = temp;
					}
			}//버블정렬

			for (int i = 0; i < nums.length; i++) {
				System.out.printf("%d ", nums[i]);
			}
			
			
			FileOutputStream fos = new FileOutputStream("res/data-out.txt");
			PrintStream out = new PrintStream(fos);
			for(int i=0;i<15;i++){
			out.printf("%d",nums[i]);
			if(i<14)
			out.print(",");
			}
			
			
			
		System.out.println("저장완료");
		}

	}
}
