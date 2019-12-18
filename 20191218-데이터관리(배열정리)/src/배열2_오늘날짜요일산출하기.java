import java.util.Scanner;
import java.util.*;
import java.*;
public class 배열2_오늘날짜요일산출하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//틀려서 고쳐야함. 어디서 잘못한거지? 
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		int year=scan.nextInt();
		
		System.out.println("월 입력:");
		int month=scan.nextInt();
		
		System.out.println("일 입력:");
		int day=scan.nextInt();
		
		System.out.println("\n");
		
		char[] strWeek= {'일','월','화','수','목','금','토'};

		//이전 년도까지 날짜의 총합
		int total=(year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400; //뒤의  나누기4,100,400 : 윤년에 따른 일자변동 계산 

		//이전 달까지의 날짜의 총합
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		//윤년일땐 29일임을 예외처리 
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		
		//날짜 총합은 
		for(int i=0; i<month-1;i++) {
			total=lastday[i]+day;
		}
		
		//+1 ===> %7 ===> 요일을 구한다. 
		int week=total%7;
		
		System.out.println(year+"년도 "+month+"월"+day+"일은 "+strWeek[week]+"요일 입니다.");
		
		
	}

}









