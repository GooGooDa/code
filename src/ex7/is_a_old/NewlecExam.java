package ex7.is_a_old;

public class NewlecExam extends Exam{ //부모자식관계 extends 를 주는쪽이 부모 ,기반클래스 ,확장클래스
 //private Exam exam; //과거의 방법 
 private int com;
 public NewlecExam() {
	 this(0,0,0,0);
 } //최적화 방법
 
 
 public NewlecExam(int kor,int eng,int math, int com) {
	 //setKor(1); kor을 내가 가지고 있지않기 때문에 set을 이용해야함
	 super(kor,eng,math); //super에서 국영수 초기화
	 this.com = com;
 }

@Override
public int total() {
	return super.total() + com;
}
 @Override
	public double avg() {
		// TODO Auto-generated method stub
		return total()/4.0;
	}
}
