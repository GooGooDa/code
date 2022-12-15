package ex2.array;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

public class ArrayTest2Sort {
public static void main(String[] args) throws IOException {
//	int[] ar1 = new int[5];
//	
////	ar1 = new int[7]; 가능함
//	
//	int[][] ar2 = new int[3][5]; //c++이면 통짜임 자바는 그렇지 않다.
//	
//	ar2 = new int[2][6]; //가능
//	ar2[0] = new int[9]; //가능
//	int[][] ar3 = new int[3][]; //가능 삐쭉삐쭉 가능하기때문에 톱니형 배열이다.
//	
	//for문 10개증가.
	//찾고 break.
	//스킵 찾고 증가 가능.
	//2차for문의 의미 왜 2차를 써야하는가?
	//2차배열을 왜써야하는가 어떻게 달라지는가?
	//원하는거 찾아서 값을 바꾼다.
	
	int [] nums = {20,5,7,98,45,7,45,62,12,47};
	for(int i=0;i<10;i++) { //int nums 를 선언
	System.out.printf("%d" , nums[i]);
	if(i<9)
	System.out.print(",");
	}
	System.out.println();
	// int nums의 1차 출력
	Random rand = new Random();
	int s = rand.nextInt(10);
	int d = rand.nextInt(10);
	// 램덤 객체 s,d 선언
	int temp;
	temp = nums[s];
	nums[s] = nums[d];
	nums[d] = temp; 
	//temp를 이용한 값 변경
	
	FileOutputStream fos = new FileOutputStream("res/data-out.txt");
	PrintStream out = new PrintStream(fos);
	
	for(int i =0;i<nums.length;i++) {
		out.printf("%d" , nums[i]);
	}
	fos.close();
	System.out.println("저장완료");
		//변경된 값 다시 출력
		
	//nums에서 [0]공간의 값과 [2]의 공간을 바꾸기
}
}
