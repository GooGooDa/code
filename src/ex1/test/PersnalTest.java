package ex1.test;

public class PersnalTest {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) { 
			System.out.printf("%c", 'A');
		}
		System.out.println();
		for (int i = 0; i < 5; i++) { 
			System.out.printf("%d", i + 1);
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d", i + 1);
			System.out.printf("%c" , ',');
		}
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d", i + 1);
			if(i!=4)
			System.out.printf("%c" , ',');
		}
		System.out.println();
		
		for(int i=0;i<5;i++) {
			System.out.printf("%c",'☆');
			System.out.printf("%d",i+1);
			if(i!=4)
				System.out.printf("%c",',');
		}System.out.println();

		for(int i=0;i<5;i++) {
			if(i!=2)
			System.out.printf("%c",'☆');
			System.out.printf("%d",i+1);
			if(i!=4)
				System.out.printf("%c",',');
		}System.out.println();
		
		for(int i=0;i<5;i++) {
			if(i == 3)
			break;
			if(i!=2) {
			System.out.printf("%c",'☆');
			System.out.printf("%d",i+1);
			}
			if(i!=4)
				System.out.printf("%c",',');
		}System.out.println();
		
		for(int i=0;i<5;i++) {
			if(i>1) {
			System.out.printf("%c",'☆');
			System.out.printf("%d",i+1);
			}if(i>1 && i<4 )
				System.out.printf("%c",',');
		}System.out.println();
		
	}
}
