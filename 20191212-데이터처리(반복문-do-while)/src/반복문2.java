/*
 * ex1) [do while] 3명의 학생의 입력을 받아서 => 국어, 영어, 수학 점수 => 평균, 총점, 학점을 출력 (배열 쓰지 말고 풀어라.) 
 * 		국어	영어	수학	총점	평균	학점
 * 		80	80	80	240	80	'B'
 * 		70	70	70	210	70	'C'
 * 		90	90	90	270	90	'A'
*/
import java.util.Scanner;
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor,eng,math,total,avg;
		String result="";
		int i=1;
		Scanner scan = new Scanner (System.in);
		do {
			System.out.println("국어점수:");
			kor=scan.nextInt();
			
			System.out.println("영어점수:");
			eng=scan.nextInt();
			
			System.out.println("수학점수:");
			math=scan.nextInt();
			
			total=kor+eng+math;
			avg=total/3;
			
			char c='A';
			switch(avg/10) {
				case 10:
				case 9:
					c='A';
					break;
				case 8:
					c='B';
					break;
				case 7:
					c='C';
					break;
				case 6:
					c='D';
					break;
				default:
					c='F';			
			}
			
			result+=kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+c+"\n"; //이 연산 전에 result 초기값 줘놔야함 
			i++;
			
		}while(i<=3);
		System.out.println("국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println(result);
		//result를 엄청 길게 붙여서 출력한 것...  result를 3줄짜리 String으로 만들어버렸다. 

	}

}
