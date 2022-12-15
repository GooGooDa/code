package ex3.func;

public class BasicFunction {

	static int f1(int x) {
		return 3+x*23;
		//매계변수는 함수안에서만 살아있음
	}
	static int add(int a , int b) {
		return a+b;
	}
	static void printSum(int sum) {
		
		System.out.println(sum);
	}
	
//중요! 함수는 main함수의 밖에다가 선언
	public static void main(String[] args) {
		int result = 3+4*23-23+345-23;
	
		System.out.printf("result is %d\n" , result);

		result = f1(1)-23+345-23;
		System.out.printf("result is %d\n" , result);
		
		
		System.out.printf("result is %d\n" , result + add(5,9));
	
		printSum(11);
		
		System.out.println();
	}

	
}
