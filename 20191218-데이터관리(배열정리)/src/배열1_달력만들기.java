/*
 * 1. 묶어서 사용(데이터)
 * 	배열 ==> 클래스 ==> 패키지 ==> 라이브러리 (jar) 
 * 	===
 * 
 * 	프로그램
 * 		데이터 + 명령문 (메소드) => 클래스
 * 		===========
 * 		클래스 여러개 =====> 조립 (자바 CBD)
 * 
 * 2. 자바 ==> 오라클 ==> HTML (CSS, Javascript) ==> JSP ==> MVC ==> Spring ==> Kotlin(모바일)
 * 			 ====	 ===============================    ===============		======== 
 *            DB       Front-end                          Back-end           웹앱 
 * 
 * 3. 배열의 단점 : 고정적 ===> 가변형 
 * 	  ===
 * 	    선언 시 메모리 크기를 결정 
 * 	    같은 데이터형만 모을 수 있다.   
 * 
 *	1) 선언
 *		int[] arr;
 *		==	  ====
 *	    데이터형       배열명 (실제 저장된 데이터의 주소)
 *	2) 초기화
 *		방법1. arr={1,2,3,4,5};
 *		방법2. arr=new int[5]; <== 메모리 공간만 할당하고, 나중에 데이터를 대입 
 *	3) 값을 읽기, 쓰기 ==> 인덱스 이용
 *		int[] arr={10,20,30,40,50};
 *		 			일반변수와 같다. 일반변수 취급한다. 
 *					int a=10; a=11....
 *		  arr		 arr[0]  arr[1] arr[2] ... 연속적 ==> for
 *					 arr[0]=10 arr[0]=20.... 
 *
 *					heap에 저장됨 
 *		======		==================================
 *		 100		  10	  20	 30	   40	 50
 *		======		┃=================================
 *					100
 *		//배열 : 연속적으로 배치되는 메모리 공간. 
 *
*/
/*
 * 딜력
 * ===
 * 	1) 년도, 월을 입력
 *  2) 월의 1일이 무슨 요일인지 
 *  3) 마지막 날이 언제인지 
 *  4) 출력
 *  ===> 메소드가 4개가 필요하다.
*/
import java.util.Scanner;
import java.util.*;
import java.*;
public class 배열1_달력만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		int year=scan.nextInt();
		
		System.out.println("월 입력:");
		int month=scan.nextInt();
		
		System.out.println(year+"년도 "+month+"월");
		System.out.println("\n");
		
		//달력 맨 윗줄 요일 출력 
		char[] strWeek= {'일','월','화','수','목','금','토'};
		for(int i=0;i<7;i++) {
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();
		
		//해당 월 1일자의 요일을 구한다.
		//이전 년도까지 날짜의 총합
		
		int total=(year-1)*365 
				+ (year-1)/4 
				- (year-1)/100 
				+ (year-1)/400; 
		//뒤의  나누기4,100,400 : 윤년에 따른 일자변동 계산 

		//이전 달까지의 날짜의 총합
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		//윤년일땐 29일임을 예외처리 
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		
		/* [참고] 
		 * 윤년 (2월에 +1일) 조건
		 * 4로 나눠떨어지면 윤년
		 * 4로 나눠떨어지면서 100으로도 나눠떨어지면 평년
		 * 4, 100, 400으로 나눠떨어지는 해는 윤년 
		 * ==> 윤년 : (year%4==0 && year%100!=0)||(year%400==0) 
		 */
		
		//달력이 시작되기 전까지 (전달까지의 누적날짜) 날짜 총합은 
		for(int i=0; i<month-1;i++) {
			total+=lastday[i];
		}
		
		//+1 ===> %7 ===> 요일을 구한다. 
		total++; //각 달의1일자
		int week=total%7;
		
		//일단 모양을 먼저 만들어보자....
		for(int i=1;i<=lastday[month-1];i++) {
			if(i==1) {
				for(int j=0;j<week;j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) {
				week=0;
				System.out.println();
			}
			
		}
		
		
		
	}

}









