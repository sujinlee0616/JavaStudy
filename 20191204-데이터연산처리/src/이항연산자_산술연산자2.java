import java.util.Scanner; //Scanner (class임) 

/* Java vs C
 * Java는 기본단위가 class, C는 함수.
*/
public class 이항연산자_산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 --> 값을 설정 --> 직접 입력. 
		/*
		 * <선언 후 값 입력>
		 * int a;
		 * a=10;
		 * 
		 * <선언과 동시에 값 대입>
		 * int a=10;
		 * 
		 * <값 대입>
		 * 입력한 값을 받아서 저장
		 * 랜덤(난수) -> 임의의 수를 저장.
		*/
		int a=(int)(Math.random()*100)+1;
		// Math.random()이 0.0~0.99 사이 랜덤숫자 생성 --> *100하면 0.0 ~ 99.0 --> int 형변환하면 정수형 0~99+1
		// 1~100 사이의 랜덤 수를 생성. 
		System.out.println("a="+a);
		
		/*
		 * Scanner scan=new Scanner(System.in); // System.in --> 키보드 입력값을 받는다.
		 * System.out.print("정수 입력:"); int b=scan.nextInt(); System.out.println("b="+b);
		 */
		
		// 산술연산자 --> +,/
		// 국어, 영어, 수학 점수를 받아서 총점과 평균을 내라. 단, 평균은 소수점 두 자리까지 출력. 
		int kor,eng,math,total;
		double avg;
		
		// 입력할 수 있는 기능의 클래스를 가지고 온다 
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 점수:");
		kor=scan.nextInt();
		
		System.out.print("영어 점수:");
		eng=scan.nextInt();		
		
		System.out.print("수학 점수:");
		math=scan.nextInt();
		
		//총점
		total=kor+eng+math;
		
		//평균
		avg=total/3.0;
		
		//결과출력
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f",avg);
		
	}

}








