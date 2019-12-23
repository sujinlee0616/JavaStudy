import java.util.Scanner;

// 국어 영어 수학 점수를 받아서 
// 총점, 평균, 학점을 출력하는 메소드를 만들어라.
// 주는건 매개변수, 받는건 리턴형 
/*
 * 1. 입력 	static int[] input()
 * 2. 총점 	static int total(int[]) 
 * 3. 평균 	static double avg(int toal)
 * 4. 학점 	static char hakjum(double a)
 * 5. 출력 	static void print(int[], int total, double d, char score) 
*/
public class 메소드10_학점계산메소드 {

	//1. 입력
	static int[] input() {
		int[] arr=new int[3];
		String[] msg= {"국어","영어","수학"};
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.print(msg[i]+" 점수:");
			arr[i]=scan.nextInt();
		}
		return arr;
	}
	
	//2. 총점
	static int total(int[] score) {
		return score[0]+score[1]+score[2];
	}
	
	//3. 평균
	static double avg(int total) {
		return total/3.0;	
	}
	
	//4. 학점
	static char hakjum(double avg) {
		char c='A';
		switch((int)(avg/10)) {
		case 10: case 9: c='A'; break;
		case 8:	c='B';	break;
		case 7:	c='C';	break;
		case 6:	c='D';	break;
		default : c='F'; 
		}
		return c;		
	}
	
	//5. 출력 
	static void print(int[] score, int total, double avg, char c) {
		System.out.printf("국어:%d 영어:%d 수학:%d 총점:%d 평균:%.2f 학점:%c\n",score[0],score[1],score[2],total,avg,c);
	}
	
	static void process() {
		int[] score=input();
		int total=total(score);
		double avg=avg(total);
		char c=hakjum(avg);
		print(score, total, avg, c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
