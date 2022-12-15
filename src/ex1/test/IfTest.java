package ex1.test;

public class IfTest {
	public static void main(String[] args) {
//		for(int i=0;i<10;i++) {
//		if(i==4)
//			System.out.printf("%c" , '○');
//		else  
//		System.out.printf("%c",'╋'); //else로 하나의 문장을 만들어서 대체 출력이 10이라면 10만 반복할수있게
//		} // 중간에 ○찍기
		
//		for(int i=0;i<10;i++) {
//			if(i==4)
//				System.out.printf("%c" , '○');
//			else if(i==5)  
//				System.out.printf("%c",'★'); 
//			else 
//				System.out.printf("%c",'╋'); 
//		}
		
//		for(int i=0;i<10;i++) {
//			if(i==4)
//				System.out.printf("%c" , '○');
//			else if(i==4)  
//				System.out.printf("%c",'★'); 
//			else 
//				System.out.printf("%c",'╋'); 
//		} if에서 이미 ○가 충족이 됐기때문에 else-if까진 내려가지 않음
		
//		for(int i=0;i<10;i++) {
//			if(i==4)
//				System.out.printf("%c" , '○');
//			else if(i==4)  
//				System.out.printf("%c",'★'); 
//			else 
//				System.out.printf("%c",'╋'); 
//		} 중요한것은 else-if를 통해 정해진값만 Loop가 될수있게 하는것이 중요
		
		for(int i=0;i<10;i++) {
			if(i==5)
				System.out.printf("%c" , '○');
			else if(i%2 == 1)  // 수열을 나머지 값으로 해결하는건 맞지않은코드
				System.out.printf("%c",'★'); 
			else 
				System.out.printf("%c",'╋'); 
		}// ~마다 라면 수열을 떠올려야함
	}
}

