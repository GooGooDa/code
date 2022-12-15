package ex1.test;

import java.util.Random;

public class ArrayTest {
	
	
	
	// main class안에서 변수선언 전역변수 == static을 붙혀줘야함
	static void printNums(int [] nums) {
		for(int i=0; i<10; i++) {
			System.out.printf("%d", nums[i]);
			if(i!=9)
				System.out.printf("%c", ','); // 분리할지여부 고민해야함
		}
	}
	public static void main(String[] args) {
		/*
		// 정수 5개, ar1
		int[] ar1 = new int[5];
		
		ar1 = new int[7];
		
		// 5개짜리를 이끄는 3개의 2차원 배열
		int[][] ar2 = new int[3][5];
		
		ar2 = new int[2][5];
		
		ar2[0] = new int[9];
		
		// 톱니형배열. 삐쭉삐죽하다.
		int[][] ar3 = new int[3][];
		*/
		
		//int[] nums = new int[] {3,5,3245,234,56,34,23,77,45,78};
	
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		printNums(nums);
			
		
		
		// nums 배열 출력하기
	
		System.out.println();

		Random rand = new Random();
		
		int s = rand.nextInt(10);
		int d = rand.nextInt(10);
		// nums에서 [0]공간의 값과 [3]공간의 값을 바꾸기
		// 빈 접시 마련
		int temp;
		temp = nums[s];
		nums[s] = nums[d];
		nums[d] = temp;
		
		// nums 배열 출력하기
		for(int i=0; i<10; i++) {
			System.out.printf("%d", nums[i]);
			if(i!=9)
				System.out.printf("%c", ','); // 분리할지여부 고민해야함
		}
		System.out.println();
		
		
	}

}


// 버블 정렬 / 뽀글뽀글 정렬 / 왕 겨루기
// 옆 사람끼리 싸움
// n-1번 1등
// n-2번 2등
// n-3번 3등

/*
 * 선택정렬 / 왕좌가 밖에 있음
 * 밖에 있는 사람과 싸움
 * 
 * 퀵정렬
 * 토너먼트처럼
 */






















