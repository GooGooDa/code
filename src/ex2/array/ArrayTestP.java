package ex2.array;

import java.util.Scanner;

public class ArrayTestP {
public static void main(String[] args) {

	
	System.out.println("변경하기 원하는 숫자를 입력");
	System.out.println("20,5,7,98,45,7,45,7,45,62,12,47");	
	Scanner scan = new Scanner(System.in);
	int pick = scan.nextInt();
	System.out.println("변경할 숫자 입력");
	int change = scan.nextInt();
	int [] nums = {20,5,7,98,45,7,45,62,12,47};
	for(int i=0;i<10;i++) {
		if(nums[i] == pick) 
		nums[i] = change;
		
		System.out.printf("%d",nums[i]);
		if(i!=9)
	System.out.print(",");
	}
}
}
